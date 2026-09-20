package p204p;

import com.spotify.allboarding.allboardingimpl.presentation.contentpicker.ContentPickerFragment;
import com.spotify.allboarding.allboardingimpl.utils.PickerCollapsingTitleBar;

/* JADX INFO: loaded from: classes3.dex */
public final class goj extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f82968a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ContentPickerFragment f82969b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ goj(ContentPickerFragment contentPickerFragment, int i) {
        super(1);
        this.f82968a = i;
        this.f82969b = contentPickerFragment;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        fyn0 fyn0Var;
        e6a0 e6a0Var;
        switch (this.f82968a) {
            case 0:
                this.f82969b.m3102m1().m15621f(new ynj((xyn0) obj));
                break;
            case 1:
                this.f82969b.m3102m1().m15621f(new ynj((xyn0) obj));
                break;
            case 2:
                this.f82969b.m3102m1().m15621f(new ynj((xyn0) obj));
                break;
            case 3:
                float fFloatValue = ((Number) obj).floatValue();
                hxt hxtVar = this.f82969b.f2807N1;
                if (hxtVar != null && (fyn0Var = (fyn0) hxtVar.f96293f) != null) {
                    hxtVar.m49046g(new fyn0(fyn0Var.f74779a, fyn0Var.f74780b, fyn0Var.f74781c, fyn0Var.f74782d, fyn0Var.f74783e, fFloatValue));
                }
                break;
            case 4:
                this.f82969b.m3102m1().m15621f(new znj((jyn0) obj, true));
                break;
            default:
                int iIntValue = ((Number) obj).intValue();
                ContentPickerFragment contentPickerFragment = this.f82969b;
                contentPickerFragment.m3102m1().m15621f(boj.f29187a);
                if (iIntValue == 0 && (e6a0Var = contentPickerFragment.f2805L1) != null) {
                    ((PickerCollapsingTitleBar) e6a0Var.f56600d).setExpanded(true);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
