package p204p;

import com.spotify.player.model.PlayOrigin;

/* JADX INFO: loaded from: classes9.dex */
public final class iko0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f103181a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lko0 f103182b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iko0(lko0 lko0Var, int i) {
        super(0);
        this.f103181a = i;
        this.f103182b = lko0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f103181a) {
            case 0:
                lko0 lko0Var = this.f103182b;
                return lko0Var.f134406d.m75422a(lko0Var.f134409g, st91.f213865b);
            default:
                lko0 lko0Var2 = this.f103182b;
                return lko0Var2.f134403a.m74492a(lko0Var2.f134409g.getLifecycle(), false, false, (PlayOrigin) lko0Var2.f134408f.get());
        }
    }
}
