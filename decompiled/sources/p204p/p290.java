package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class p290 {

    /* JADX INFO: renamed from: a */
    public static final p290 f173302a;

    /* JADX INFO: renamed from: b */
    public static final p290 f173303b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ p290[] f173304c;

    static {
        p290 p290Var = new p290("MakePublic", 0);
        f173302a = p290Var;
        p290 p290Var2 = new p290("MakePrivate", 1);
        f173303b = p290Var2;
        f173304c = new p290[]{p290Var, p290Var2};
    }

    public static p290 valueOf(String str) {
        return (p290) Enum.valueOf(p290.class, str);
    }

    public static p290[] values() {
        return (p290[]) f173304c.clone();
    }
}
