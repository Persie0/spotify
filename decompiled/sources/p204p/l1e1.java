package p204p;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l1e1 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f128708a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ o1e1 f128709b;

    public /* synthetic */ l1e1(o1e1 o1e1Var, int i) {
        this.f128708a = i;
        this.f128709b = o1e1Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f128708a) {
            case 0:
                this.f128709b.m66051b((HashMap) obj);
                break;
            default:
                this.f128709b.m66050a((HashMap) obj);
                break;
        }
        return w2a1.f247311a;
    }
}
