package p204p;

import com.spotify.mainlayout.p106ui.view.MainLayout;

/* JADX INFO: loaded from: classes8.dex */
public final class yxb0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f277191a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f277192b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f277193c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f277194d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxb0(float f, float f2, vum0 vum0Var) {
        super(0);
        this.f277191a = 1;
        this.f277192b = f;
        this.f277193c = f2;
        this.f277194d = vum0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        float fM63436m;
        switch (this.f277191a) {
            case 0:
                MainLayout mainLayout = ((zxb0) this.f277194d).f287270a;
                mainLayout.getNavigationContainerTop().setZ(this.f277192b);
                mainLayout.getLimitedExperienceIndicatorContainer().setZ(this.f277193c);
                return w2a1.f247311a;
            case 1:
                vum0 vum0Var = (vum0) this.f277194d;
                int iM86437v = vum0Var.m86437v();
                float fM86437v = this.f277192b;
                if (iM86437v > 0) {
                    fM86437v = fM86437v + vum0Var.m86437v() + this.f277193c;
                }
                return Float.valueOf(fM86437v);
            default:
                zs70 zs70Var = (zs70) this.f277194d;
                int iM86437v2 = ((vum0) zs70Var.f285863d.f30268d).m86437v();
                if (((vum0) zs70Var.f285863d.f30267c).m86437v() > 0) {
                    fM63436m = 1.0f;
                } else {
                    float f = iM86437v2 - this.f277192b;
                    float f2 = this.f277193c;
                    fM63436m = n0e1.m63436m(f, 0.0f, f2) / f2;
                }
                return Float.valueOf(fM63436m);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yxb0(Object obj, float f, float f2, int i) {
        super(0);
        this.f277191a = i;
        this.f277194d = obj;
        this.f277192b = f;
        this.f277193c = f2;
    }
}
