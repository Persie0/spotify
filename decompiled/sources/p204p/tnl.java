package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class tnl extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f221999a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wnl f222000b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tnl(wnl wnlVar, int i) {
        super(1);
        this.f221999a = i;
        this.f222000b = wnlVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f221999a) {
            case 0:
                if (snl.f210957a[((h16) obj).ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                ((gh00) this.f222000b.f253208f).invoke(cnl.f40039a);
                return w2a1.f247311a;
            case 1:
                if (unl.f232188a[((n16) obj).ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                ((gh00) this.f222000b.f253208f).invoke(cnl.f40039a);
                return w2a1.f247311a;
            default:
                if (vnl.f243157a[((k16) obj).ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                ((gh00) this.f222000b.f253208f).invoke(cnl.f40039a);
                return w2a1.f247311a;
        }
    }
}
