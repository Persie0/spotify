package p204p;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: loaded from: classes4.dex */
public final class sic0 extends fic0 {

    /* JADX INFO: renamed from: h */
    public final ReferenceQueue f209395h;

    public sic0(ajc0 ajc0Var, int i) {
        super(ajc0Var, i);
        this.f209395h = new ReferenceQueue();
    }

    @Override // p204p.fic0
    /* JADX INFO: renamed from: e */
    public final void mo41706e() {
        while (this.f209395h.poll() != null) {
        }
    }

    @Override // p204p.fic0
    /* JADX INFO: renamed from: f */
    public final void mo41707f() {
        m41702a(this.f209395h);
    }

    @Override // p204p.fic0
    /* JADX INFO: renamed from: k */
    public final fic0 mo41712k() {
        return this;
    }
}
