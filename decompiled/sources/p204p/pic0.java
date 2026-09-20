package p204p;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: loaded from: classes4.dex */
public final class pic0 extends fic0 {

    /* JADX INFO: renamed from: h */
    public final ReferenceQueue f177918h;

    public pic0(ajc0 ajc0Var, int i) {
        super(ajc0Var, i);
        this.f177918h = new ReferenceQueue();
    }

    @Override // p204p.fic0
    /* JADX INFO: renamed from: e */
    public final void mo41706e() {
        while (this.f177918h.poll() != null) {
        }
    }

    @Override // p204p.fic0
    /* JADX INFO: renamed from: f */
    public final void mo41707f() {
        m41703b(this.f177918h);
    }

    @Override // p204p.fic0
    /* JADX INFO: renamed from: k */
    public final fic0 mo41712k() {
        return this;
    }
}
