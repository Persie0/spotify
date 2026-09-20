package p204p;

/* JADX INFO: loaded from: classes.dex */
public interface g5b1 {
    /* JADX INFO: renamed from: b */
    boolean mo42324b();

    /* JADX INFO: renamed from: d */
    long mo35620d(w05 w05Var, w05 w05Var2, w05 w05Var3);

    /* JADX INFO: renamed from: f */
    w05 mo35621f(long j, w05 w05Var, w05 w05Var2, w05 w05Var3);

    /* JADX INFO: renamed from: l */
    default w05 mo35623l(w05 w05Var, w05 w05Var2, w05 w05Var3) {
        return mo35621f(mo35620d(w05Var, w05Var2, w05Var3), w05Var, w05Var2, w05Var3);
    }

    /* JADX INFO: renamed from: m */
    w05 mo35624m(long j, w05 w05Var, w05 w05Var2, w05 w05Var3);
}
