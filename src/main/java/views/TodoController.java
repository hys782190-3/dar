package views;

import java.time.LocalDate;

import domain.TodoVO;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class TodoController extends MasterController {
	@FXML private TextField txtTitle;
	@FXML private TextArea txtContent;
	@FXML ListView<TodoVO> todoList;
	@FXML TextArea todoContent;
	
	private LocalDate date;
	
	@Override
	public void reset() {
		txtTitle.setText("");
		txtContent.setText("");
		todoContent.setText("");
	}
	
	public void init(LocalDate date) {
		this.date = date;
	}
	
	//일정 신규등록 함수
	public void register() {
		
	}
	//일정 수정
	public void update() {
		
	}
	//일정창 닫기
	public void close() {
		
	}
}