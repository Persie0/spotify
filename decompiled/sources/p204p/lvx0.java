package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class lvx0 implements gw41 {

    /* JADX INFO: renamed from: a */
    public final Object f137419a;

    /* JADX INFO: renamed from: b */
    public final gw41 f137420b;

    /* JADX INFO: renamed from: c */
    public final fts f137421c;

    /* JADX INFO: renamed from: d */
    public Bundle f137422d;

    public lvx0(Object obj, gw41 gw41Var, fts ftsVar) {
        this.f137419a = obj;
        this.f137420b = gw41Var;
        this.f137421c = ftsVar;
    }

    @Override // p204p.gw41
    /* JADX INFO: renamed from: a */
    public final void mo31967a(mwt mwtVar) {
        this.f137420b.mo31967a(mwtVar);
    }

    @Override // p204p.gw41
    /* JADX INFO: renamed from: b */
    public final void mo31968b(mwt mwtVar) {
        gw41 gw41Var = this.f137420b;
        gw41Var.mo31968b(mwtVar);
        boolean zMo31969c = gw41Var.mo31969c();
        Object obj = this.f137419a;
        if (!zMo31969c) {
            mwtVar.m63064a(obj);
            return;
        }
        try {
            gw41Var.getState();
        } catch (Exception unused) {
            mwtVar.m63064a(obj);
        }
    }

    @Override // p204p.gw41
    /* JADX INFO: renamed from: d */
    public final Bundle mo31970d() {
        return this.f137422d;
    }

    @Override // p204p.gw41
    /* JADX INFO: renamed from: e */
    public final void mo31971e(Object obj) {
        if (((Boolean) this.f137421c.invoke()).booleanValue()) {
            return;
        }
        this.f137420b.mo31971e(obj);
    }

    @Override // p204p.gw41
    public final Object getState() {
        gw41 gw41Var = this.f137420b;
        boolean zMo31969c = gw41Var.mo31969c();
        Object obj = this.f137419a;
        if (!zMo31969c) {
            return obj;
        }
        try {
            return gw41Var.getState();
        } catch (Exception unused) {
            return obj;
        }
    }

    @Override // p204p.gw41
    /* JADX INFO: renamed from: j */
    public final void mo31976j(Bundle bundle) {
        this.f137422d = bundle;
    }
}
