package p204p;

/* JADX INFO: loaded from: classes3.dex */
public interface ck81 {
    /* JADX INFO: renamed from: a */
    void mo33087a(r300 r300Var);

    /* JADX INFO: renamed from: b */
    void mo33088b(long j, int i, int i2, int i3, bk81 bk81Var);

    /* JADX INFO: renamed from: c */
    void mo33089c(l2n0 l2n0Var, int i, int i2);

    /* JADX INFO: renamed from: d */
    int mo33090d(fho fhoVar, int i, boolean z);

    /* JADX INFO: renamed from: e */
    default int mo33091e(fho fhoVar, int i, boolean z) {
        return mo33090d(fhoVar, i, z);
    }

    /* JADX INFO: renamed from: f */
    default void mo33092f(int i, l2n0 l2n0Var) {
        mo33089c(l2n0Var, i, 0);
    }

    /* JADX INFO: renamed from: g */
    default void mo33093g(long j) {
    }
}
