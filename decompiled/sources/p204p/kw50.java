package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class kw50 extends mnz {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f127009b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Iterable f127010c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f127011d;

    public /* synthetic */ kw50(Iterable iterable, Object obj, int i) {
        this.f127009b = i;
        this.f127010c = iterable;
        this.f127011d = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f127009b) {
            case 0:
                Iterator it = this.f127010c.iterator();
                wfq0 wfq0Var = (wfq0) this.f127011d;
                it.getClass();
                return new nw50(it, wfq0Var);
            default:
                return new ow50(this.f127010c.iterator(), (qh00) this.f127011d);
        }
    }
}
