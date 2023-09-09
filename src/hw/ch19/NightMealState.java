package hw.ch19;

public class NightMealState implements State {
    private static NightMealState singleton = new NightMealState();

    private NightMealState() {
    }

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (12 <= hour && hour < 13) {
            context.changeState(NoonState.getInstance());
        } else if (9 <= hour && hour < 17) {
            context.changeState(DayState.getInstance());
        } else if (hour < 9 || 17 <= hour && (20 > hour || hour >24)) {
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("비상：야식 금고 사용！");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("비상벨(야식)");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("야간 통화 녹음(야식)");
    }

    @Override
    public void doCCTV(Context context) {
        context.recordLog("CCTV: off");
    }

    @Override
    public String toString() {
        return "[야식]";
    }
}
