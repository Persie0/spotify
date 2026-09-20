package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class ufz0 extends tux0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ e3b f229931h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ v2n0 f229932i;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ sjo f229933t;

    public ufz0(e3b e3bVar, v2n0 v2n0Var, sjo sjoVar) {
        this.f229931h = e3bVar;
        this.f229932i = v2n0Var;
        this.f229933t = sjoVar;
    }

    @Override // p204p.tux0
    /* JADX INFO: renamed from: e */
    public final Object mo52712e() {
        v2n0 v2n0Var = this.f229932i;
        nz41 nz41Var = new nz41(this.f229931h);
        o0a0.f160316h.getAndIncrement();
        nz41Var.f159996b = 0L;
        ljo ljoVar = new ljo(nz41Var, this.f229933t);
        try {
            ljoVar.m59173a();
            Uri uri = nz41Var.f159995a.getUri();
            uri.getClass();
            Object objMo30394b = v2n0Var.mo30394b(uri, ljoVar);
            h0b1.m46313h(ljoVar);
            objMo30394b.getClass();
            return (x6z) objMo30394b;
        } catch (Throwable th) {
            h0b1.m46313h(ljoVar);
            throw th;
        }
    }
}
