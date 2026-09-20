package p204p;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class oaq implements gw41 {

    /* JADX INFO: renamed from: a */
    public final paq f163437a;

    /* JADX INFO: renamed from: b */
    public final String f163438b;

    /* JADX INFO: renamed from: c */
    public final d7y0 f163439c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f163440d;

    /* JADX INFO: renamed from: e */
    public Object f163441e;

    /* JADX INFO: renamed from: f */
    public Bundle f163442f;

    public oaq(Object obj, paq paqVar, String str, d7y0 d7y0Var) {
        this.f163437a = paqVar;
        this.f163438b = str;
        this.f163439c = d7y0Var;
        this.f163440d = new ArrayList();
        this.f163441e = obj;
    }

    @Override // p204p.gw41
    /* JADX INFO: renamed from: a */
    public final void mo31967a(mwt mwtVar) {
        this.f163440d.remove(mwtVar);
    }

    @Override // p204p.gw41
    /* JADX INFO: renamed from: b */
    public final void mo31968b(mwt mwtVar) {
        this.f163440d.add(mwtVar);
        Object obj = this.f163441e;
        if (obj != null) {
            mwtVar.m63064a(obj);
        }
    }

    @Override // p204p.gw41
    /* JADX INFO: renamed from: c */
    public final boolean mo31969c() {
        return this.f163441e != null;
    }

    @Override // p204p.gw41
    /* JADX INFO: renamed from: d */
    public final Bundle mo31970d() {
        return this.f163442f;
    }

    @Override // p204p.gw41
    /* JADX INFO: renamed from: e */
    public final void mo31971e(Object obj) {
        this.f163441e = obj;
        Iterator it = this.f163440d.iterator();
        while (it.hasNext()) {
            ((mwt) it.next()).m63064a(obj);
        }
    }

    @Override // p204p.gw41
    public final Object getState() {
        Object obj = this.f163441e;
        if (obj != null) {
            return obj;
        }
        throw new IllegalArgumentException("Element state cannot be null");
    }

    @Override // p204p.gw41
    /* JADX INFO: renamed from: i */
    public final String mo31975i() {
        return this.f163438b;
    }

    @Override // p204p.gw41
    /* JADX INFO: renamed from: j */
    public final void mo31976j(Bundle bundle) {
        this.f163442f = bundle;
    }

    @Override // p204p.gw41
    /* JADX INFO: renamed from: k */
    public final paq mo31977k() {
        return this.f163437a;
    }

    @Override // p204p.gw41
    public final Bundle serialize() {
        Bundle bundleMo27874Q;
        Object obj = this.f163441e;
        return (obj == null || (bundleMo27874Q = this.f163439c.mo27874Q(obj)) == null) ? new Bundle() : bundleMo27874Q;
    }

    public oaq() {
        this(null, null, null, new zau());
    }
}
