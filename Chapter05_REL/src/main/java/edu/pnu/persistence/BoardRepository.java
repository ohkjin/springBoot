package edu.pnu.persistence;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import edu.pnu.domain.Board;

public interface BoardRepository extends CrudRepository<Board, Long> {
// 상위 인터페이스에서 가져온 메소드를 자동 실행
	
	//--JPQL--//
	// 문법이 틀렸을 경우 instance를 자동으로 생성이 불가하여 에러가 뜬다
	List<Board> findByContentContaining(String searchKeyword);
	Page<Board> findByTitleLike(String searchKeyword, Pageable paging);
	//Be careful of Type: Cnt is Long!!
	List<Board> findByCntEquals(Long count);
	List<Board> findByTitleLikeAndCntGreaterThan(String searchKeyword, Long count);
	List<Board> findByCntBetweenOrderBySeq(Long min, Long max);
	List<Board> findByTitleLikeOrContentLikeOrderBySeqDesc(String searchKeyword,String searchKeyword2);
	
}
