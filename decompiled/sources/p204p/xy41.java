package p204p;

import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import com.comscore.streaming.ContentType;

/* JADX INFO: loaded from: classes8.dex */
public final class xy41 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gw4 f267215a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ l3u0 f267216b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f267217c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f267218d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ float f267219e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy41(gw4 gw4Var, l3u0 l3u0Var, float f, float f2, float f3) {
        super(1);
        this.f267215a = gw4Var;
        this.f267216b = l3u0Var;
        this.f267217c = f;
        this.f267218d = f2;
        this.f267219e = f3;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        tgj tgjVar = (tgj) obj;
        tgjVar.mo50174s1();
        float fFloatValue = ((Number) this.f267215a.m45912e()).floatValue();
        if (fFloatValue > 0.0f) {
            DrawScope.m281t(tgjVar, this.f267216b, this.f267217c, (((long) Float.floatToRawIntBits(this.f267219e)) & 4294967295L) | (Float.floatToRawIntBits(this.f267218d) << 32), fFloatValue, null, ContentType.LONG_FORM_ON_DEMAND);
        }
        return w2a1.f247311a;
    }
}
