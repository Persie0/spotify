package p204p;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ir1 {

    /* JADX INFO: renamed from: a */
    public final int f104880a;

    /* JADX INFO: renamed from: b */
    public final int f104881b;

    public /* synthetic */ ir1(int i, int i2) {
        this.f104880a = i;
        this.f104881b = i2;
    }

    /* JADX INFO: renamed from: a */
    public static mfz m51420a(ir1 ir1Var, pd50[] pd50VarArr) {
        return new mfz(ir1Var.f104880a + ir1Var.f104881b, pd50VarArr);
    }

    /* JADX INFO: renamed from: b */
    public static lfz m51421b(ir1 ir1Var) {
        return new lfz(ir1Var.f104880a + ir1Var.f104881b, 1);
    }

    /* JADX INFO: renamed from: c */
    public static lfz m51422c() {
        return new lfz(0, 1);
    }

    /* JADX INFO: renamed from: d */
    public abstract Object mo51423d(int i);
}
