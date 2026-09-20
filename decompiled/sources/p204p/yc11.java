package p204p;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class yc11 {

    /* JADX INFO: renamed from: a */
    public final ljx0 f271356a;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f271357b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public final wg61 f271358c = new wg61(new es3(this, 7));

    public yc11(ljx0 ljx0Var) {
        this.f271356a = ljx0Var;
    }

    /* JADX INFO: renamed from: a */
    public final fa00 m93329a() {
        ljx0 ljx0Var = this.f271356a;
        ljx0Var.m59181a();
        if (this.f271357b.compareAndSet(false, true)) {
            return (fa00) this.f271358c.getValue();
        }
        String strMo36864b = mo36864b();
        ljx0Var.m59181a();
        ljx0Var.m59182b();
        return ljx0Var.m59186l().getWritableDatabase().mo82388N0(strMo36864b);
    }

    /* JADX INFO: renamed from: b */
    public abstract String mo36864b();

    /* JADX INFO: renamed from: c */
    public final void m93330c(fa00 fa00Var) {
        if (fa00Var == ((fa00) this.f271358c.getValue())) {
            this.f271357b.set(false);
        }
    }
}
