package p204p;

/* JADX INFO: loaded from: classes11.dex */
public abstract class gq9 extends qmj0 {
    @Override // p204p.qmj0
    /* JADX INFO: renamed from: d */
    public final void mo45413d(qmj0 qmj0Var) {
        if (!(qmj0Var instanceof gq9)) {
            throw new IllegalArgumentException("Parent of block must also be block (can not be inline)");
        }
        this.f190232a = qmj0Var;
    }
}
