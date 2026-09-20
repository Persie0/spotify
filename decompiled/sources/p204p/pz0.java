package p204p;

import com.spotify.allboarding.allboardingimpl.presentation.carousel.CarouselFragment;
import com.spotify.allboarding.allboardingimpl.presentation.contentpicker.ContentPickerFragment;
import com.spotify.allboarding.allboardingimpl.presentation.error.ErrorFragment;
import com.spotify.allboarding.contextualaudio.presentation.ContextualAudioFragment;
import com.spotify.blend.tastematch.BlendTasteMatchFragment;

/* JADX INFO: loaded from: classes8.dex */
public final class pz0 implements a800 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f183562a;

    /* JADX INFO: renamed from: b */
    public final er70 f183563b;

    public /* synthetic */ pz0(er70 er70Var, int i) {
        this.f183562a = i;
        this.f183563b = er70Var;
    }

    @Override // p204p.a800
    /* JADX INFO: renamed from: a */
    public final i500 mo25006a() {
        switch (this.f183562a) {
            case 0:
                return new kz0(new oz0(this, 0));
            case 1:
                return new qq1(new oz0(this, 5));
            case 2:
                return new ot1(new oz0(this, 6));
            case 3:
                return new kx1(new oz0(this, 7));
            case 4:
                return new jz1(new oz0(this, 8));
            case 5:
                return new uc2(new oz0(this, 11));
            case 6:
                return new vj7(new nc5(this, 12));
            case 7:
                return new xn7(new nc5(this, 13));
            case 8:
                return new BlendTasteMatchFragment(new io9(this, 1));
            case 9:
                return new nx9(new io9(this, 2));
            case 10:
                return new CarouselFragment(new io9(this, 7));
            case 11:
                return new tcc(new io9(this, 8));
            case 12:
                return new kfc(new io9(this, 9));
            case 13:
                return new i3d(new io9(this, 16));
            case 14:
                return new t1e(new io9(this, 17));
            case 15:
                return new dmf(new io9(this, 24));
            case 16:
                return new yii(new io9(this, 28));
            case 17:
                return new gri(new io9(this, 29));
            case 18:
                return new mri(new ori(this, 0));
            case 19:
                return new ContentPickerFragment(new ori(this, 2));
            case 20:
                return new n3k(new ori(this, 3));
            case 21:
                return new ContextualAudioFragment(new ori(this, 5));
            case 22:
                return new jqr(new ori(this, 24));
            case 23:
                return new lus(new its(this, 1));
            case 24:
                return new sdt(new its(this, 3));
            case 25:
                return new xyt(new its(this, 5));
            case 26:
                return new g1u(new its(this, 6));
            case 27:
                return new n2v(new its(this, 9));
            case 28:
                return new j4v(new its(this, 11));
            default:
                return new ErrorFragment(new its(this, 18));
        }
    }
}
