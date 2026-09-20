package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class yk8 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f273633a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lqi0 f273634b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yk8(lqi0 lqi0Var, int i) {
        super(1);
        this.f273633a = i;
        this.f273634b = lqi0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f273633a) {
            case 0:
                return new xk8(this.f273634b, (Set) obj, 0);
            case 1:
                return new xk8(this.f273634b, (Set) obj, 1);
            case 2:
                return this.f273634b;
            default:
                ((zv41) this.f273634b).m97090l((yyo0) obj);
                return w2a1.f247311a;
        }
    }
}
