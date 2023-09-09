package hw.ch22.command;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class MacroCommand implements Command {
    // 명령의 배열 
    private Deque<Command> commands = new ArrayDeque<>();
    private Deque<Command> commandsForRedo = new ArrayDeque<>();


    // 실행 
    @Override
    public void execute() {
        Iterator<Command> it = commands.descendingIterator();
        while(it.hasNext())
            it.next().execute();
    }

    // 추가 
    public void append(Command cmd) {
        if (cmd == this) {
            throw new IllegalArgumentException("infinite loop caused by append");
        }
        commands.push(cmd);
    }

    // 마지막 명령을 삭제
    public void undo() {
        if (!commands.isEmpty()) {
            commandsForRedo.push(commands.pop());
        }
    }

    // 삭제된 명령 복구
    public void redo() {
        if (!commandsForRedo.isEmpty()) {
            commands.push(commandsForRedo.pop());
        }
    }

    // 전부 삭제 
    public void clear() {
        commands.clear();
        commandsForRedo.clear();
    }
}
