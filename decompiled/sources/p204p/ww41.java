package p204p;

/* JADX INFO: loaded from: classes.dex */
public abstract class ww41 implements vw41 {

    /* JADX INFO: renamed from: a */
    public final bo6 f255697a = new bo6(0);

    /* JADX INFO: renamed from: c */
    public final boolean m89170c(int i) {
        return (i & this.f255697a.get()) != 0;
    }

    /* JADX INFO: renamed from: m */
    public final void m89171m(int i) {
        bo6 bo6Var;
        int i2;
        do {
            bo6Var = this.f255697a;
            i2 = bo6Var.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!bo6Var.compareAndSet(i2, i2 | i));
    }
}
