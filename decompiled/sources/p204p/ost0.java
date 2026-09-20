package p204p;

import com.spotify.nowplayingqueue.bottomsheet.view.JamHeaderContainerView;

/* JADX INFO: loaded from: classes9.dex */
public final class ost0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f168891a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ JamHeaderContainerView f168892b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pst0 f168893c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ost0(JamHeaderContainerView jamHeaderContainerView, pst0 pst0Var, int i) {
        super(0);
        this.f168891a = i;
        this.f168892b = jamHeaderContainerView;
        this.f168893c = pst0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f168891a) {
            case 0:
                this.f168892b.getOnAnimationEnd().invoke();
                this.f168893c.f180947Z0 = null;
                break;
            default:
                JamHeaderContainerView jamHeaderContainerView = this.f168892b;
                jamHeaderContainerView.removeAllViews();
                jamHeaderContainerView.getOnAnimationEnd().invoke();
                this.f168893c.f180947Z0 = null;
                break;
        }
        return w2a1.f247311a;
    }
}
