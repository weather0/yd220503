package co.micol.notice.service;

import java.util.List;

public interface NoticeService {
	List<NoticeVO> noticeSelectList(); // 전체 조회
	NoticeVO noticeSelect(NoticeVO vo); // 한 건 조회
	int noticeInsert(NoticeVO vo); // 추가
	int noticeUpdate(NoticeVO vo); // 변경
	int noticeDelete(NoticeVO vo); // 삭제

}
