package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class nra implements gw41 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gw41 f157478a;

    /* JADX INFO: renamed from: b */
    public final String f157479b;

    /* JADX INFO: renamed from: c */
    public final f9y0 f157480c;

    public nra(String str, h9y0 h9y0Var, d7y0 d7y0Var, gw41 gw41Var, Object obj) {
        this.f157478a = gw41Var;
        this.f157479b = str;
        this.f157480c = h9y0Var.mo34135x();
        if (d7y0Var instanceof zau) {
            return;
        }
        h9y0Var.getLifecycle().mo31986a(new mra(this, d7y0Var, gw41Var, obj));
    }

    @Override // p204p.gw41
    /* JADX INFO: renamed from: a */
    public final void mo31967a(mwt mwtVar) {
        this.f157478a.mo31967a(mwtVar);
    }

    @Override // p204p.gw41
    /* JADX INFO: renamed from: b */
    public final void mo31968b(mwt mwtVar) {
        this.f157478a.mo31968b(mwtVar);
    }

    @Override // p204p.gw41
    /* JADX INFO: renamed from: c */
    public final boolean mo31969c() {
        return this.f157478a.mo31969c();
    }

    @Override // p204p.gw41
    /* JADX INFO: renamed from: d */
    public final Bundle mo31970d() {
        return this.f157478a.mo31970d();
    }

    @Override // p204p.gw41
    /* JADX INFO: renamed from: e */
    public final void mo31971e(Object obj) {
        this.f157478a.mo31971e(obj);
    }

    @Override // p204p.gw41
    /* JADX INFO: renamed from: f */
    public final paq mo31972f() {
        return this.f157478a.mo31972f();
    }

    @Override // p204p.gw41
    /* JADX INFO: renamed from: g */
    public final paq mo31973g() {
        return this.f157478a.mo31973g();
    }

    @Override // p204p.gw41
    public final Object getState() {
        return this.f157478a.getState();
    }

    @Override // p204p.gw41
    /* JADX INFO: renamed from: h */
    public final String mo31974h() {
        return this.f157478a.mo31974h();
    }

    @Override // p204p.gw41
    /* JADX INFO: renamed from: i */
    public final String mo31975i() {
        return this.f157478a.mo31975i();
    }

    @Override // p204p.gw41
    /* JADX INFO: renamed from: j */
    public final void mo31976j(Bundle bundle) {
        this.f157478a.mo31976j(bundle);
    }

    @Override // p204p.gw41
    /* JADX INFO: renamed from: k */
    public final paq mo31977k() {
        return this.f157478a.mo31977k();
    }

    @Override // p204p.gw41
    public final Bundle serialize() {
        return this.f157478a.serialize();
    }
}
