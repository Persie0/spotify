package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@rtz0
public final class ewu0 {
    public static final bwu0 Companion;

    /* JADX INFO: renamed from: a */
    public static final Object f63603a;

    /* JADX INFO: renamed from: b */
    public static final ewu0 f63604b;

    /* JADX INFO: renamed from: c */
    public static final ewu0 f63605c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ ewu0[] f63606d;

    static {
        ewu0 ewu0Var = new ewu0("FINISHED", 0);
        f63604b = ewu0Var;
        ewu0 ewu0Var2 = new ewu0("UNPLAYABLE", 1);
        f63605c = ewu0Var2;
        f63606d = new ewu0[]{ewu0Var, ewu0Var2};
        Companion = new bwu0();
        f63603a = q3d0.m72078I(2, o5t0.f162072U0);
    }

    public static ewu0 valueOf(String str) {
        return (ewu0) Enum.valueOf(ewu0.class, str);
    }

    public static ewu0[] values() {
        return (ewu0[]) f63606d.clone();
    }
}
