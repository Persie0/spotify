package p204p;

import android.graphics.RenderEffect;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes7.dex */
public final class jna0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ rv41 f114052a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jna0(rv41 rv41Var) {
        super(1);
        this.f114052a = rv41Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        fdx0 fdx0Var = (fdx0) obj;
        float fFloatValue = ((Number) this.f114052a.getValue()).floatValue();
        if (fFloatValue < 1.0f) {
            fFloatValue = 1.0f;
        }
        fdx0Var.m41386h(new io4(RenderEffect.createBlurEffect(fFloatValue, fFloatValue, Shader.TileMode.CLAMP)));
        return w2a1.f247311a;
    }
}
