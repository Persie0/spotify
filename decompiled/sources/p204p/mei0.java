package p204p;

import com.spotify.musicappplatform.state.idle.api.MusicAppLock;

/* JADX INFO: loaded from: classes2.dex */
public final class mei0 implements a240 {

    /* JADX INFO: renamed from: a */
    public final lei0 f142739a;

    public mei0(lei0 lei0Var) {
        this.f142739a = lei0Var;
    }

    @Override // p204p.a240
    /* JADX INFO: renamed from: a */
    public final void mo24490a(MusicAppLock musicAppLock) {
        boolean zEquals = musicAppLock.equals(bei0.f26363a);
        lei0 lei0Var = this.f142739a;
        if (zEquals) {
            lei0Var.m58793d(false);
            return;
        }
        if (musicAppLock.equals(zdi0.f281727a)) {
            lei0Var.m58794e(false);
            return;
        }
        if (musicAppLock.equals(aei0.f14887a)) {
            lei0Var.m58795f(false);
        } else if (musicAppLock.equals(odi0.f164194a)) {
            lei0Var.m58792c(false);
        } else if (musicAppLock.equals(ndi0.f152781a)) {
            lei0Var.m58791a(false);
        }
    }

    @Override // p204p.a240
    /* JADX INFO: renamed from: d */
    public final void mo24493d(MusicAppLock musicAppLock) {
        boolean zEquals = musicAppLock.equals(bei0.f26363a);
        lei0 lei0Var = this.f142739a;
        if (zEquals) {
            lei0Var.m58793d(true);
            return;
        }
        if (musicAppLock.equals(zdi0.f281727a)) {
            lei0Var.m58794e(true);
            return;
        }
        if (musicAppLock.equals(aei0.f14887a)) {
            lei0Var.m58795f(true);
        } else if (musicAppLock.equals(odi0.f164194a)) {
            lei0Var.m58792c(true);
        } else if (musicAppLock.equals(ndi0.f152781a)) {
            lei0Var.m58791a(true);
        }
    }
}
