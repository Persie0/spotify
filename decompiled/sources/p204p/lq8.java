package p204p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class lq8 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f135970a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mq8 f135971b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lq8(mq8 mq8Var, int i) {
        super(0);
        this.f135970a = i;
        this.f135971b = mq8Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f135970a) {
            case 0:
                Set set = this.f135971b.f146204a;
                if (set != null) {
                    return g6f.m43714b1(g6f.m43704R0(g6f.m43711Y0(set, new ecb(21))), 3);
                }
                return null;
            case 1:
                List list = (List) this.f135971b.f146205b.getValue();
                if (list != null) {
                    return (kq8) g6f.m43747t0(0, list);
                }
                return null;
            case 2:
                List list2 = (List) this.f135971b.f146205b.getValue();
                if (list2 != null) {
                    return (kq8) g6f.m43747t0(1, list2);
                }
                return null;
            default:
                List list3 = (List) this.f135971b.f146205b.getValue();
                if (list3 != null) {
                    return (kq8) g6f.m43747t0(2, list3);
                }
                return null;
        }
    }
}
