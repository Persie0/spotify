package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ta80 {
    private static final /* synthetic */ ta80[] $VALUES;
    public static final ra80 Companion;
    public static final ta80 ON_ANY;
    public static final ta80 ON_CREATE;
    public static final ta80 ON_DESTROY;
    public static final ta80 ON_PAUSE;
    public static final ta80 ON_RESUME;
    public static final ta80 ON_START;
    public static final ta80 ON_STOP;

    static {
        ta80 ta80Var = new ta80("ON_CREATE", 0);
        ON_CREATE = ta80Var;
        ta80 ta80Var2 = new ta80("ON_START", 1);
        ON_START = ta80Var2;
        ta80 ta80Var3 = new ta80("ON_RESUME", 2);
        ON_RESUME = ta80Var3;
        ta80 ta80Var4 = new ta80("ON_PAUSE", 3);
        ON_PAUSE = ta80Var4;
        ta80 ta80Var5 = new ta80("ON_STOP", 4);
        ON_STOP = ta80Var5;
        ta80 ta80Var6 = new ta80("ON_DESTROY", 5);
        ON_DESTROY = ta80Var6;
        ta80 ta80Var7 = new ta80("ON_ANY", 6);
        ON_ANY = ta80Var7;
        $VALUES = new ta80[]{ta80Var, ta80Var2, ta80Var3, ta80Var4, ta80Var5, ta80Var6, ta80Var7};
        Companion = new ra80();
    }

    public static ta80 valueOf(String str) {
        return (ta80) Enum.valueOf(ta80.class, str);
    }

    public static ta80[] values() {
        return (ta80[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: a */
    public final fb80 m80335a() {
        switch (sa80.f207157a[ordinal()]) {
            case 1:
            case 2:
                return fb80.f67752c;
            case 3:
            case 4:
                return fb80.f67753d;
            case 5:
                return fb80.f67754e;
            case 6:
                return fb80.f67750a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
