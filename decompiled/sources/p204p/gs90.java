package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class gs90 {

    /* JADX INFO: renamed from: a */
    public static final gs90 f83909a;

    /* JADX INFO: renamed from: b */
    public static final gs90 f83910b;

    /* JADX INFO: renamed from: c */
    public static final gs90 f83911c;

    /* JADX INFO: renamed from: d */
    public static final gs90 f83912d;

    /* JADX INFO: renamed from: e */
    public static final gs90 f83913e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ gs90[] f83914f;

    static {
        gs90 gs90Var = new gs90("ShareClicked", 0);
        f83909a = gs90Var;
        gs90 gs90Var2 = new gs90("AddToCalendarClicked", 1);
        f83910b = gs90Var2;
        gs90 gs90Var3 = new gs90("SpotSavedClicked", 2);
        f83911c = gs90Var3;
        gs90 gs90Var4 = new gs90("RsvpClicked", 3);
        f83912d = gs90Var4;
        gs90 gs90Var5 = new gs90("NotifyMeClicked", 4);
        f83913e = gs90Var5;
        f83914f = new gs90[]{gs90Var, gs90Var2, gs90Var3, gs90Var4, gs90Var5};
    }

    public static gs90 valueOf(String str) {
        return (gs90) Enum.valueOf(gs90.class, str);
    }

    public static gs90[] values() {
        return (gs90[]) f83914f.clone();
    }
}
