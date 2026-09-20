package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c0q0 implements lly0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ y700 f32846a;

    @Override // p204p.lly0
    /* JADX INFO: renamed from: a */
    public final void mo29286a(float f) {
        Float fValueOf = Float.valueOf(f);
        y700 y700Var = this.f32846a;
        switch (y700Var.f269927a) {
            case 0:
                wg61 wg61Var = (wg61) y700Var.f269928b;
                wkm0 wkm0Var = (wkm0) wg61Var.getValue();
                float fFloatValue = fValueOf.floatValue();
                ilm0 scrollState = ((wkm0) wg61Var.getValue()).getScrollState();
                wkm0Var.setScrollState(scrollState != null ? new ilm0(fFloatValue, scrollState.f103433b, scrollState.f103434c) : new ilm0(fFloatValue, 6));
                break;
            default:
                wkm0 wkm0Var2 = (wkm0) y700Var.f269928b;
                float fFloatValue2 = fValueOf.floatValue();
                ilm0 scrollState2 = wkm0Var2.getScrollState();
                wkm0Var2.setScrollState(scrollState2 != null ? new ilm0(fFloatValue2, scrollState2.f103433b, scrollState2.f103434c) : new ilm0(fFloatValue2, 6));
                break;
        }
    }
}
