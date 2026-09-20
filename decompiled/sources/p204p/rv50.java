package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class rv50 {

    /* JADX INFO: renamed from: a */
    public static final rv50 f202999a;

    /* JADX INFO: renamed from: b */
    public static final rv50 f203000b;

    /* JADX INFO: renamed from: c */
    public static final rv50 f203001c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ rv50[] f203002d;

    static {
        rv50 rv50Var = new rv50("TRACK", 0);
        f202999a = rv50Var;
        rv50 rv50Var2 = new rv50("SHOW_EPISODES", 1);
        f203000b = rv50Var2;
        rv50 rv50Var3 = new rv50("AUDIOBOOK", 2);
        f203001c = rv50Var3;
        f203002d = new rv50[]{rv50Var, rv50Var2, rv50Var3};
    }

    public static rv50 valueOf(String str) {
        return (rv50) Enum.valueOf(rv50.class, str);
    }

    public static rv50[] values() {
        return (rv50[]) f203002d.clone();
    }
}
