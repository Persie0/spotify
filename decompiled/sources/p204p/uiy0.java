package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class uiy0 implements q440 {

    /* JADX INFO: renamed from: a */
    public final q440 f230835a;

    /* JADX INFO: renamed from: b */
    public final Object f230836b = new Object();

    /* JADX INFO: renamed from: c */
    public boolean f230837c;

    public uiy0(q440 q440Var) {
        this.f230835a = q440Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m83211a() {
        w2a1 w2a1Var;
        synchronized (this.f230836b) {
            try {
                if (this.f230837c) {
                    q440 q440Var = this.f230835a;
                    if (q440Var != null) {
                        q440Var.clear();
                        w2a1Var = w2a1.f247311a;
                    } else {
                        w2a1Var = null;
                    }
                    if (w2a1Var == null) {
                        vie1.m85626h("ScreenFlashWrapper");
                    }
                } else {
                    vie1.m85617F("ScreenFlashWrapper");
                }
                this.f230837c = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m83212b() {
        synchronized (this.f230836b) {
        }
    }

    @Override // p204p.q440
    public final void clear() {
        m83211a();
    }
}
