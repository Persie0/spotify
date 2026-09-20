package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class uv11 {

    /* JADX INFO: renamed from: a */
    public static final uv11 f234311a;

    /* JADX INFO: renamed from: b */
    public static final uv11 f234312b;

    /* JADX INFO: renamed from: c */
    public static final uv11 f234313c;

    /* JADX INFO: renamed from: d */
    public static final uv11 f234314d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ uv11[] f234315e;

    static {
        uv11 uv11Var = new uv11("Linear", 0);
        f234311a = uv11Var;
        uv11 uv11Var2 = new uv11("Shuffle", 1);
        f234312b = uv11Var2;
        uv11 uv11Var3 = new uv11("SmartShuffle", 2);
        f234313c = uv11Var3;
        uv11 uv11Var4 = new uv11("Loading", 3);
        f234314d = uv11Var4;
        f234315e = new uv11[]{uv11Var, uv11Var2, uv11Var3, uv11Var4};
    }

    public static uv11 valueOf(String str) {
        return (uv11) Enum.valueOf(uv11.class, str);
    }

    public static uv11[] values() {
        return (uv11[]) f234315e.clone();
    }
}
