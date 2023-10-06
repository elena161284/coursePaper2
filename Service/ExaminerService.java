package pro.sky.coursePaper2.Service;
import pro.sky.coursePaper2.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}