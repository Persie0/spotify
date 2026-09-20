package p204p;

/* JADX INFO: loaded from: classes4.dex */
public abstract class bwf1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final ev61 f31649a;

    public bwf1() {
        this.f31649a = null;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo30688a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo30688a();
        } catch (Exception e) {
            ev61 ev61Var = this.f31649a;
            if (ev61Var != null) {
                ev61Var.m40098c(e);
            }
        }
    }

    public bwf1(ev61 ev61Var) {
        this.f31649a = ev61Var;
    }
}
