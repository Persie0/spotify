package p204p;

/* JADX INFO: loaded from: classes4.dex */
public abstract class fwf1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final ev61 f74062a;

    public fwf1() {
        this.f74062a = null;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo42966a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo42966a();
        } catch (Exception e) {
            ev61 ev61Var = this.f74062a;
            if (ev61Var != null) {
                ev61Var.m40098c(e);
            }
        }
    }

    public fwf1(ev61 ev61Var) {
        this.f74062a = ev61Var;
    }
}
