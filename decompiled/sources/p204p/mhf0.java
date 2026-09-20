package p204p;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class mhf0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f143782a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kqi0 f143783b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f143784c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ rlv0 f143785d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ghf0 f143786e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mhf0(kqi0 kqi0Var, gh00 gh00Var, rlv0 rlv0Var, ghf0 ghf0Var, int i) {
        super(1);
        this.f143782a = i;
        this.f143783b = kqi0Var;
        this.f143784c = gh00Var;
        this.f143785d = rlv0Var;
        this.f143786e = ghf0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f143782a) {
            case 0:
                kwc1 kwc1Var = (kwc1) obj;
                this.f143783b.setValue(kwc1Var);
                boolean z = kwc1Var instanceof jwc1;
                rlv0 rlv0Var = this.f143785d;
                gh00 gh00Var = this.f143784c;
                if (z) {
                    gh00Var.invoke(new dhf0(((jwc1) obj).f116621a, ((List) rlv0Var.f200373a).indexOf(obj)));
                } else {
                    if (!(kwc1Var instanceof iwc1)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f143786e.f79910a.getClass();
                    gh00Var.invoke(new ahf0(((List) rlv0Var.f200373a).indexOf(obj)));
                }
                return w2a1.f247311a;
            case 1:
                sbw sbwVar = (sbw) obj;
                this.f143783b.setValue(sbwVar);
                boolean z2 = sbwVar instanceof rbw;
                rlv0 rlv0Var2 = this.f143785d;
                gh00 gh00Var2 = this.f143784c;
                if (z2) {
                    gh00Var2.invoke(new bhf0(((rbw) obj).f197669a, ((List) rlv0Var2.f200373a).indexOf(obj)));
                } else {
                    if (!(sbwVar instanceof qbw)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f143786e.f79910a.getClass();
                    gh00Var2.invoke(new ygf0(((List) rlv0Var2.f200373a).indexOf(obj)));
                }
                return w2a1.f247311a;
            default:
                b0z b0zVar = (b0z) obj;
                this.f143783b.setValue(b0zVar);
                boolean z3 = b0zVar instanceof a0z;
                rlv0 rlv0Var3 = this.f143785d;
                gh00 gh00Var3 = this.f143784c;
                if (z3) {
                    gh00Var3.invoke(new chf0(((a0z) obj).f11216a, ((List) rlv0Var3.f200373a).indexOf(obj)));
                } else {
                    if (!(b0zVar instanceof zzy)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f143786e.f79910a.getClass();
                    gh00Var3.invoke(new zgf0(((List) rlv0Var3.f200373a).indexOf(obj)));
                }
                return w2a1.f247311a;
        }
    }
}
