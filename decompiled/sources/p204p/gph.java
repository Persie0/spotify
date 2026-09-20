package p204p;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class gph implements iph {

    /* JADX INFO: renamed from: a */
    public final ArrayList f83191a;

    /* JADX INFO: renamed from: b */
    public esh f83192b;

    /* JADX INFO: renamed from: c */
    public final vum0 f83193c;

    /* JADX INFO: renamed from: d */
    public final vum0 f83194d;

    /* JADX INFO: renamed from: e */
    public tmj f83195e;

    /* JADX INFO: renamed from: f */
    public final yum0 f83196f;

    public gph(tmj tmjVar, int i) {
        tmjVar = (i & 1) != 0 ? rmj.f200567a : tmjVar;
        this.f83191a = new ArrayList();
        this.f83193c = new vum0(0);
        this.f83194d = new vum0(0);
        this.f83195e = tmjVar;
        this.f83196f = sam.m77645B(gbu.f78413a);
    }

    @Override // p204p.iph
    /* JADX INFO: renamed from: a */
    public final List mo45369a() {
        return this.f83191a;
    }

    /* JADX INFO: renamed from: b */
    public final Set m45370b() {
        return (Set) this.f83196f.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final int m45371c() {
        return this.f83194d.m86437v();
    }

    /* JADX INFO: renamed from: d */
    public final int m45372d() {
        return this.f83193c.m86437v();
    }

    /* JADX INFO: renamed from: e */
    public final void m45373e(esh eshVar) {
        this.f83192b = eshVar;
    }
}
