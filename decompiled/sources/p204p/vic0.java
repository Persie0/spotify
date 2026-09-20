package p204p;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: loaded from: classes4.dex */
public final class vic0 extends fic0 {

    /* JADX INFO: renamed from: h */
    public final ReferenceQueue f241672h;

    /* JADX INFO: renamed from: i */
    public final ReferenceQueue f241673i;

    public vic0(ajc0 ajc0Var, int i) {
        super(ajc0Var, i);
        this.f241672h = new ReferenceQueue();
        this.f241673i = new ReferenceQueue();
    }

    @Override // p204p.fic0
    /* JADX INFO: renamed from: e */
    public final void mo41706e() {
        while (this.f241672h.poll() != null) {
        }
    }

    @Override // p204p.fic0
    /* JADX INFO: renamed from: f */
    public final void mo41707f() {
        m41702a(this.f241672h);
        m41703b(this.f241673i);
    }

    @Override // p204p.fic0
    /* JADX INFO: renamed from: k */
    public final fic0 mo41712k() {
        return this;
    }
}
