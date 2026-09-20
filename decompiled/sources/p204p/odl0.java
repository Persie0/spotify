package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class odl0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f164213a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f164214b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f164215c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ rdl0 f164216d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f164217e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public odl0(rdl0 rdl0Var, gh00 gh00Var, boolean z, String str) {
        super(0);
        this.f164216d = rdl0Var;
        this.f164215c = gh00Var;
        this.f164214b = z;
        this.f164217e = str;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f164213a) {
            case 0:
                rdl0 rdl0Var = this.f164216d;
                boolean z = rdl0Var instanceof qdl0;
                gh00 gh00Var = this.f164215c;
                if (z) {
                    gh00Var.invoke(new tdl0(((qdl0) rdl0Var).f187708a));
                } else {
                    if (!(rdl0Var instanceof pdl0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (this.f164214b) {
                        pdl0 pdl0Var = (pdl0) rdl0Var;
                        gh00Var.invoke(new wdl0(pdl0Var.f176491d, pdl0Var.f176492e));
                    } else {
                        gh00Var.invoke(new udl0(this.f164217e));
                    }
                }
                return w2a1.f247311a;
            default:
                boolean z2 = this.f164214b;
                gh00 gh00Var2 = this.f164215c;
                if (z2) {
                    pdl0 pdl0Var2 = (pdl0) this.f164216d;
                    gh00Var2.invoke(new xdl0(pdl0Var2.f176491d, pdl0Var2.f176492e));
                } else {
                    gh00Var2.invoke(new vdl0(this.f164217e));
                }
                return w2a1.f247311a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public odl0(boolean z, gh00 gh00Var, rdl0 rdl0Var, String str) {
        super(0);
        this.f164214b = z;
        this.f164215c = gh00Var;
        this.f164216d = rdl0Var;
        this.f164217e = str;
    }
}
