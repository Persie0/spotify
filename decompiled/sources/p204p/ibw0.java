package p204p;

import com.google.protobuf.Empty;

/* JADX INFO: loaded from: classes10.dex */
public final class ibw0 extends d6a0 {

    /* JADX INFO: renamed from: d */
    public final String f100681d;

    /* JADX INFO: renamed from: e */
    public final y3l0 f100682e;

    /* JADX INFO: renamed from: f */
    public final iwr f100683f = new iwr();

    /* JADX INFO: renamed from: g */
    public final zv41 f100684g;

    /* JADX INFO: renamed from: h */
    public final kmx f100685h;

    public ibw0(String str, y3l0 y3l0Var) {
        this.f100681d = str;
        this.f100682e = y3l0Var;
        zv41 zv41VarM52819d = jag1.m52819d(null);
        this.f100684g = zv41VarM52819d;
        this.f100685h = new kmx(zv41VarM52819d, 8);
    }

    @Override // p204p.d6a0
    /* JADX INFO: renamed from: e */
    public final void mo25474e() {
        if (this.f100684g.getValue() != null) {
            m35106i();
        } else {
            m35107j();
        }
    }

    @Override // p204p.d6a0
    /* JADX INFO: renamed from: f */
    public final void mo25475f() {
        this.f100683f.m51847a();
    }

    /* JADX INFO: renamed from: k */
    public final void m50218k() {
        this.f100683f.m51848b(this.f100682e.f268961a.callSingle("spotify.offline_esperanto.proto.Offline", "LicenseStatus", Empty.m1933n()).map(tky.f221248S0).map(q2z.f184737T0).map(xjr0.f262217h).onErrorReturnItem(5).flatMapObservable(new rwt0(this, 8)).subscribe());
    }

    /* JADX INFO: renamed from: l */
    public final s4a0 m50219l() {
        return sw41.m79513e(this);
    }
}
