package p204p;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zdy extends uzx0 {

    /* JADX INFO: renamed from: e */
    public final HashMap f281835e = new HashMap();

    @Override // p204p.uzx0
    /* JADX INFO: renamed from: a */
    public final qzx0 mo84312a(Object obj) {
        return (qzx0) this.f281835e.get(obj);
    }

    @Override // p204p.uzx0
    /* JADX INFO: renamed from: b */
    public final Object mo84313b(Object obj) {
        Object objMo84313b = super.mo84313b(obj);
        this.f281835e.remove(obj);
        return objMo84313b;
    }
}
