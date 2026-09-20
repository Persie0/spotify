package p204p;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class tn2 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f221862a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Set f221863b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tn2(int i, Set set) {
        super(1);
        this.f221862a = i;
        this.f221863b = set;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f221862a) {
            case 0:
                cqx cqxVar = (cqx) obj;
                Set set = this.f221863b;
                cqxVar.m33647b(v140.class, set, false);
                cqxVar.m33647b(erc1.class, set, false);
                return w2a1.f247311a;
            case 1:
                return Boolean.valueOf(((Map) obj).keySet().containsAll(this.f221863b));
            case 2:
                return Boolean.valueOf(((Map) obj).keySet().containsAll(this.f221863b));
            case 3:
                ((cqx) obj).m33647b(o5p0.class, this.f221863b, false);
                return w2a1.f247311a;
            case 4:
                ((cqx) obj).m33647b(lqd.class, this.f221863b, false);
                return w2a1.f247311a;
            default:
                return this.f221863b.contains(((wfm0) obj).f250870a.getId()) ? new oa01(1.0f) : pa01.f175334a;
        }
    }
}
