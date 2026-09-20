package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.musicappplatform.state.idle.api.MusicAppLock;

/* JADX INFO: loaded from: classes2.dex */
public final class asa0 implements a240 {
    @Override // p204p.a240
    /* JADX INFO: renamed from: a */
    public final void mo24490a(MusicAppLock musicAppLock) {
        Logger.m3965a(s571.m77251j("Lock ", musicAppLock.getName(), " released."), new Object[0]);
    }

    @Override // p204p.a240
    /* JADX INFO: renamed from: b */
    public final void mo24491b() {
        Logger.m3965a("Become idle.", new Object[0]);
    }

    @Override // p204p.a240
    /* JADX INFO: renamed from: c */
    public final void mo24492c() {
        Logger.m3965a("Idle timer cancelled.", new Object[0]);
    }

    @Override // p204p.a240
    /* JADX INFO: renamed from: d */
    public final void mo24493d(MusicAppLock musicAppLock) {
        Logger.m3965a(s571.m77251j("Lock ", musicAppLock.getName(), " acquired."), new Object[0]);
    }

    @Override // p204p.a240
    /* JADX INFO: renamed from: e */
    public final void mo24494e(MusicAppLock musicAppLock) {
        Logger.m3965a(s571.m77251j("Lock re-acquired ", musicAppLock.getName(), "."), new Object[0]);
    }

    @Override // p204p.a240
    /* JADX INFO: renamed from: f */
    public final void mo24495f() {
        Logger.m3965a("Idle timer started.", new Object[0]);
    }

    @Override // p204p.a240
    /* JADX INFO: renamed from: g */
    public final void mo24496g() {
        Logger.m3965a("Become active.", new Object[0]);
    }

    @Override // p204p.a240
    /* JADX INFO: renamed from: h */
    public final void mo24497h(MusicAppLock musicAppLock) {
        Logger.m3965a(s571.m77251j("Attempted to release ", musicAppLock.getName(), " before acquire."), new Object[0]);
    }
}
