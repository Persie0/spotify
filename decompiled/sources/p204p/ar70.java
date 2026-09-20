package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class ar70 {

    /* JADX INFO: renamed from: a */
    public static final ar70 f18969a;

    /* JADX INFO: renamed from: b */
    public static final ar70 f18970b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ ar70[] f18971c;

    static {
        ar70 ar70Var = new ar70("Compact", 0);
        f18969a = ar70Var;
        ar70 ar70Var2 = new ar70("Expanded", 1);
        f18970b = ar70Var2;
        f18971c = new ar70[]{ar70Var, ar70Var2};
    }

    public static ar70 valueOf(String str) {
        return (ar70) Enum.valueOf(ar70.class, str);
    }

    public static ar70[] values() {
        return (ar70[]) f18971c.clone();
    }
}
