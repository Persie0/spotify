package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class uox extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f232535a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Set f232536b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Set f232537c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uox(int i, Set set, Set set2) {
        super(1);
        this.f232535a = i;
        this.f232536b = set;
        this.f232537c = set2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f232535a) {
            case 0:
                cqx cqxVar = (cqx) obj;
                Set set = this.f232536b;
                if (!set.isEmpty()) {
                    Set set2 = set;
                    cqxVar.m33647b(ks81.class, g6f.m43728j1(set2), false);
                    cqxVar.m33647b(bob1.class, g6f.m43728j1(set2), false);
                }
                Set set3 = this.f232537c;
                if (!set3.isEmpty()) {
                    cqxVar.m33647b(w46.class, g6f.m43728j1(set3), false);
                }
                break;
            default:
                cqx cqxVar2 = (cqx) obj;
                cqxVar2.m33647b(g0w.class, this.f232536b, true);
                Set set4 = this.f232537c;
                cqxVar2.m33647b(v140.class, set4, true);
                cqxVar2.m33647b(ok11.class, set4, true);
                cqxVar2.m33647b(xdv.class, set4, true);
                cqxVar2.m33647b(erc1.class, set4, true);
                break;
        }
        return w2a1.f247311a;
    }
}
