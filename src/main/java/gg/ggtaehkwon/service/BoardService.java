package gg.ggtaehkwon.service;

import gg.ggtaehkwon.domain.repository.BoardRepository;
import gg.ggtaehkwon.dto.BoardDto;
import gg.ggtaehkwon.domain.entity.Board;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;


@Service
public class BoardService {
    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository)
    {
        this.boardRepository = boardRepository;
    }

    @Transactional
    public Long savePost(BoardDto boardDto)
    {
        return boardRepository.save(boardDto.toEntity()).getId();
    }

    public List<BoardDto> getBoards()
    {
        List<Board> boardList = boardRepository.findAll();
        List<BoardDto> boardDtoList = new ArrayList<>();

        for (Board board : boardList)
        {
            BoardDto boardDto = new BoardDto();
            boardDto.setId(board.getId());
            boardDto.setTitle(board.getTitle());
            boardDto.setContent(board.getContent());
            boardDtoList.add(boardDto);
        }
        return boardDtoList;
    }
}
