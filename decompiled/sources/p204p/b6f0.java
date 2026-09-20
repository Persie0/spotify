package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class b6f0 implements od50 {

    /* JADX INFO: renamed from: a */
    public static final b6f0 f23958a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ b6f0[] f23959b;

    static {
        b6f0 b6f0Var = new b6f0("STREAMING", 0);
        f23958a = b6f0Var;
        f23959b = new b6f0[]{b6f0Var};
    }

    public static b6f0 valueOf(String str) {
        return (b6f0) Enum.valueOf(b6f0.class, str);
    }

    public static b6f0[] values() {
        return (b6f0[]) f23959b.clone();
    }

    @Override // p204p.od50
    public final int getNumber() {
        return 0;
    }
}
