package kr.happyjob.study.tCourse.dao;

import java.util.List;
import java.util.Map;



import kr.happyjob.study.tCourse.model.QuestionVO;

public interface QuestionDao{
	
	/** qna 목록 조회 */
	public List<QuestionVO> listquestion(Map<String, Object> paramMap) throws Exception;
	
	/** qna 목록 카운트 조회 */
	public int totalcntquestion(Map<String, Object> paramMap) throws Exception;
	
	
}
