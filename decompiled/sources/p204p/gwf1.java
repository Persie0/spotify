package p204p;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gwf1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final ev61 f85002a;

    public gwf1() {
        this.f85002a = null;
    }

    /* JADX INFO: renamed from: a */
    public void mo45926a(Exception exc) {
        ev61 ev61Var = this.f85002a;
        if (ev61Var != null) {
            ev61Var.m40098c(exc);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo45927b();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo45927b();
        } catch (Exception e) {
            mo45926a(e);
        }
    }

    public gwf1(ev61 ev61Var) {
        this.f85002a = ev61Var;
    }
}
