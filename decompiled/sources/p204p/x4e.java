package p204p;

import android.graphics.DashPathEffect;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: classes7.dex */
public final class x4e extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gw4 f258069a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f258070b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ uk4 f258071c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f258072d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ float f258073e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ float[] f258074f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4e(gw4 gw4Var, float f, uk4 uk4Var, long j, float f2, float[] fArr) {
        super(1);
        this.f258069a = gw4Var;
        this.f258070b = f;
        this.f258071c = uk4Var;
        this.f258072d = j;
        this.f258073e = f2;
        this.f258074f = fArr;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        DrawScope drawScope = (DrawScope) obj;
        float fFloatValue = ((Number) this.f258069a.m45912e()).floatValue();
        float f = this.f258070b;
        DrawScope.m282x0(drawScope, this.f258071c, this.f258072d, new em51(this.f258073e, 0.0f, 0, 0, new vk4(new DashPathEffect(this.f258074f, (fFloatValue * f) - (f / 2))), 14), 52);
        return w2a1.f247311a;
    }
}
