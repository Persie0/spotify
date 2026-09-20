package p204p;

import androidx.compose.p002ui.geometry.Offset;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class a7a0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13002a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f13003b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ffu0 f13004c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a7a0(gh00 gh00Var, ffu0 ffu0Var, int i) {
        super(1);
        this.f13002a = i;
        this.f13003b = gh00Var;
        this.f13004c = ffu0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f13002a) {
            case 0:
                long j = ((Offset) obj).f493a;
                this.f13003b.invoke(new feu0(this.f13004c.f69088b));
                return w2a1.f247311a;
            default:
                egu0 egu0Var = (egu0) obj;
                boolean zEquals = egu0Var.equals(cgu0.f37811a);
                gh00 gh00Var = this.f13003b;
                if (zEquals) {
                    gh00Var.invoke(new heu0(this.f13004c.f69097k));
                } else {
                    if (!(egu0Var instanceof dgu0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gh00Var.invoke(new neu0(((dgu0) egu0Var).f48898a));
                }
                return w2a1.f247311a;
        }
    }
}
