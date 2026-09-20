package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class nm1 {

    /* JADX INFO: renamed from: a */
    public static final nm1 f155258a;

    /* JADX INFO: renamed from: b */
    public static final nm1 f155259b;

    /* JADX INFO: renamed from: c */
    public static final nm1 f155260c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ nm1[] f155261d;

    static {
        nm1 nm1Var = new nm1("Dragged", 0);
        f155258a = nm1Var;
        nm1 nm1Var2 = new nm1("Outside", 1);
        f155259b = nm1Var2;
        nm1 nm1Var3 = new nm1("Back", 2);
        f155260c = nm1Var3;
        f155261d = new nm1[]{nm1Var, nm1Var2, nm1Var3};
    }

    public static nm1 valueOf(String str) {
        return (nm1) Enum.valueOf(nm1.class, str);
    }

    public static nm1[] values() {
        return (nm1[]) f155261d.clone();
    }
}
