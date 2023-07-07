package gg.ggtaehkwon.domain.repository;


import gg.ggtaehkwon.domain.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
