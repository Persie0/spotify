package p204p;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ox41 implements Iterator, pq60 {

    /* JADX INFO: renamed from: a */
    public final nb31 f170884a;

    /* JADX INFO: renamed from: b */
    public final Iterator f170885b;

    /* JADX INFO: renamed from: c */
    public Object f170886c;

    /* JADX INFO: renamed from: d */
    public Object f170887d;

    /* JADX INFO: renamed from: e */
    public int f170888e;

    public ox41(nb31 nb31Var, Iterator it) {
        this.f170884a = nb31Var;
        this.f170885b = it;
        this.f170888e = ((px41) ua31.m82672h(nb31Var.f152178a)).f182205d;
        this.f170886c = this.f170887d;
        this.f170887d = it.hasNext() ? it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f170887d != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (((px41) ua31.m82672h(this.f170884a.f152178a)).f182205d != this.f170888e) {
            throw new ConcurrentModificationException();
        }
        this.f170886c = this.f170887d;
        Iterator it = this.f170885b;
        this.f170887d = it.hasNext() ? it.next() : null;
        Object obj = this.f170886c;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        nb31 nb31Var = this.f170884a;
        if (((px41) ua31.m82672h(nb31Var.f152178a)).f182205d != this.f170888e) {
            throw new ConcurrentModificationException();
        }
        Object obj = this.f170886c;
        if (obj == null) {
            throw new IllegalStateException();
        }
        nb31Var.remove(obj);
        this.f170886c = null;
        this.f170888e = ((px41) ua31.m82672h(nb31Var.f152178a)).f182205d;
    }
}
