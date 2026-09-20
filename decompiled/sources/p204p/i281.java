package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class i281 {

    /* JADX INFO: renamed from: a */
    public static final i281 f97765a;

    /* JADX INFO: renamed from: b */
    public static final i281 f97766b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ i281[] f97767c;

    static {
        i281 i281Var = new i281("CLEAR", 0);
        f97765a = i281Var;
        i281 i281Var2 = new i281("SCANNABLES", 1);
        f97766b = i281Var2;
        f97767c = new i281[]{i281Var, i281Var2};
    }

    public static i281 valueOf(String str) {
        return (i281) Enum.valueOf(i281.class, str);
    }

    public static i281[] values() {
        return (i281[]) f97767c.clone();
    }
}
