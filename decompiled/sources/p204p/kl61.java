package p204p;

import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: classes5.dex */
public final class kl61 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f123808a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ll61 f123809b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kl61(ll61 ll61Var, int i) {
        super(1);
        this.f123808a = i;
        this.f123809b = ll61Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f123808a) {
            case 0:
                MobiusLoop mobiusLoop = this.f123809b.f134541M0;
                if (mobiusLoop != null) {
                    mobiusLoop.dispose();
                }
                break;
            case 1:
                MobiusLoop mobiusLoop2 = this.f123809b.f134543O0;
                if (mobiusLoop2 != null) {
                    mobiusLoop2.dispose();
                }
                break;
            default:
                t8z0 t8z0Var = (t8z0) obj;
                MobiusLoop mobiusLoop3 = this.f123809b.f134541M0;
                if (mobiusLoop3 != null) {
                    jsf1.m54244q(mobiusLoop3, new ik61(new z0j0(t8z0Var.f218158a, t8z0Var.f218159b, t8z0Var.f218160c)));
                }
                break;
        }
        return w2a1.f247311a;
    }
}
