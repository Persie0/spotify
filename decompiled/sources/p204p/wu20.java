package p204p;

import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import com.comscore.streaming.ContentType;

/* JADX INFO: loaded from: classes9.dex */
public final class wu20 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f255063a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f255064b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f255065c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f255066d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ float f255067e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ float f255068f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f255069g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wu20(Object obj, float f, float f2, float f3, float f4, float f5, int i) {
        super(1);
        this.f255063a = i;
        this.f255069g = obj;
        this.f255064b = f;
        this.f255065c = f2;
        this.f255066d = f3;
        this.f255067e = f4;
        this.f255068f = f5;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f255063a) {
            case 0:
                xk80 xk80Var = (xk80) this.f255069g;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.f255064b)) << 32) | (((long) Float.floatToRawIntBits(this.f255065c)) & 4294967295L);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(this.f255066d)) << 32) | (((long) Float.floatToRawIntBits(this.f255067e)) & 4294967295L);
                float f = this.f255068f;
                DrawScope.m276f0((DrawScope) obj, xk80Var, jFloatToRawIntBits, jFloatToRawIntBits2, (4294967295L & ((long) Float.floatToRawIntBits(f))) | (Float.floatToRawIntBits(f) << 32), 0.0f, null, ContentType.LONG_FORM_ON_DEMAND);
                break;
            case 1:
                DrawScope drawScope = (DrawScope) obj;
                yk91 yk91Var = (yk91) this.f255069g;
                if (yk91Var != null) {
                    for (pqm0 pqm0Var : h6f.m46715L(new pqm0((vbn0) yk91Var.f273650a, new n6f(did1.f49323a)), new pqm0((vbn0) yk91Var.f273651b, new n6f(did1.f49324b)), new pqm0((vbn0) yk91Var.f273652c, new n6f(did1.f49325c)))) {
                        did1.m36078d(drawScope, (vbn0) pqm0Var.f180350a, ((n6f) pqm0Var.f180351b).f150873a, this.f255064b, this.f255067e, this.f255068f, this.f255065c, this.f255066d);
                    }
                }
                did1.m36077c(drawScope, this.f255064b, this.f255065c, this.f255066d);
                break;
            default:
                DrawScope drawScope2 = (DrawScope) obj;
                vbn0 vbn0Var = (vbn0) this.f255069g;
                if (vbn0Var != null) {
                    did1.m36078d(drawScope2, vbn0Var, n6f.f150866f, this.f255064b, this.f255067e, this.f255068f, this.f255065c, this.f255066d);
                }
                did1.m36077c(drawScope2, this.f255064b, this.f255065c, this.f255066d);
                break;
        }
        return w2a1.f247311a;
    }
}
