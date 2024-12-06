
package quizsystem.decorator;

// Base Component
interface QuizFeature {
    void applyFeature();
}

// Concrete Component
class BasicQuiz implements QuizFeature {
    @Override
    public void applyFeature() {
        System.out.println("Basic Quiz Started.");
    }
}

// Decorator
abstract class QuizDecorator implements QuizFeature {
    protected QuizFeature quizFeature;

    public QuizDecorator(QuizFeature quizFeature) {
        this.quizFeature = quizFeature;
    }

    @Override
    public void applyFeature() {
        quizFeature.applyFeature();
    }
}

// Concrete Decorators
class TimerFeature extends QuizDecorator {
    public TimerFeature(QuizFeature quizFeature) {
        super(quizFeature);
    }

    @Override
    public void applyFeature() {
        super.applyFeature();
        System.out.println("Timer Enabled.");
    }
}

class HintFeature extends QuizDecorator {
    public HintFeature(QuizFeature quizFeature) {
        super(quizFeature);
    }

    @Override
    public void applyFeature() {
        super.applyFeature();
        System.out.println("Hints Enabled.");
    }
}
