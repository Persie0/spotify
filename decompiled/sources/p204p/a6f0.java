package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class a6f0 implements od50 {

    /* JADX INFO: renamed from: a */
    public static final a6f0 f12787a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ a6f0[] f12788b;

    static {
        a6f0 a6f0Var = new a6f0("STREAMING", 0);
        f12787a = a6f0Var;
        f12788b = new a6f0[]{a6f0Var};
    }

    public static a6f0 valueOf(String str) {
        return (a6f0) Enum.valueOf(a6f0.class, str);
    }

    public static a6f0[] values() {
        return (a6f0[]) f12788b.clone();
    }

    @Override // p204p.od50
    public final int getNumber() {
        return 0;
    }
}
