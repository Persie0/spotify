package p204p;

/* JADX INFO: loaded from: classes.dex */
public abstract class d3f1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final ev61 f44877a;

    public d3f1() {
        this.f44877a = null;
    }

    /* JADX INFO: renamed from: a */
    public void mo31263a(Exception exc) {
        ev61 ev61Var = this.f44877a;
        if (ev61Var != null) {
            ev61Var.m40098c(exc);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo24430b();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo24430b();
        } catch (Exception e) {
            mo31263a(e);
        }
    }

    public d3f1(ev61 ev61Var) {
        this.f44877a = ev61Var;
    }
}
