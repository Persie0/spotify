package p204p;

import androidx.compose.p002ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: classes8.dex */
public final class m99 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f141230a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f141231b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f141232c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m99(int i, long j, long j2) {
        super(1);
        this.f141230a = i;
        this.f141231b = j;
        this.f141232c = j2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f141230a) {
            case 0:
                return sh50.m78126a((sh50) obj, null, false, null, false, 0L, this.f141231b, 0.0f, this.f141232c, null, 351);
            case 1:
                return sh50.m78126a((sh50) obj, null, false, null, false, this.f141231b, 0L, 0.0f, this.f141232c, null, 109);
            case 2:
                return sh50.m78126a((sh50) obj, null, false, new eg21(ag21.f15274a), false, this.f141231b, 0L, 0.0f, this.f141232c, null, 363);
            case 3:
                return sh50.m78126a((sh50) obj, null, false, new eg21(xf21.f260818a), false, this.f141231b, 0L, 0.0f, this.f141232c, null, 363);
            case 4:
                return sh50.m78126a((sh50) obj, null, false, null, false, this.f141231b, 0L, 0.0f, this.f141232c, null, 367);
            case 5:
                return sh50.m78126a((sh50) obj, null, false, null, false, this.f141231b, 0L, 0.0f, this.f141232c, null, 367);
            case 6:
                z0m z0mVar = (z0m) obj;
                return Boolean.valueOf(z0mVar.f278138c > 0 && z0mVar.f278139d > this.f141231b && z0mVar.f278137b < this.f141232c);
            case 7:
                return new ku81(((b9b) obj).f24816a, this.f141231b, this.f141232c);
            case 8:
                zvw0 zvw0Var = (zvw0) obj;
                zvw0Var.f286823i = Long.valueOf(this.f141231b);
                Long l = zvw0Var.f286828n;
                long jLongValue = l != null ? l.longValue() : 0L;
                long j = this.f141232c;
                zvw0Var.f286828n = Long.valueOf(jLongValue + j);
                zvw0Var.f286829o = Long.valueOf(j);
                return w2a1.f247311a;
            case 9:
                return new ku81(((b9b) obj).f24816a, this.f141231b, this.f141232c);
            case 10:
                zvw0 zvw0Var2 = (zvw0) obj;
                zvw0Var2.f286823i = Long.valueOf(this.f141231b);
                zvw0Var2.f286828n = Long.valueOf(this.f141232c);
                return w2a1.f247311a;
            case 11:
                return new ju81(((b9b) obj).f24816a, this.f141231b, this.f141232c);
            case 12:
                return z3p0.m95286b((z3p0) obj, this.f141231b, Long.valueOf(this.f141232c), null, true, 0.0f, false, null, null, null, null, 0, false, false, 32745);
            case 13:
                return z3p0.m95286b((z3p0) obj, this.f141231b, Long.valueOf(this.f141232c), null, false, 0.0f, true, null, null, null, null, 0, false, false, 32649);
            case 14:
                return z3p0.m95286b((z3p0) obj, this.f141231b, Long.valueOf(this.f141232c), null, false, 0.0f, false, null, null, null, null, 0, false, false, 32713);
            case 15:
                return z3p0.m95286b((z3p0) obj, this.f141231b, Long.valueOf(this.f141232c), null, false, 0.0f, true, null, null, null, null, 0, false, false, 32649);
            case 16:
                return z3p0.m95286b((z3p0) obj, this.f141231b, Long.valueOf(this.f141232c), null, false, 0.0f, false, null, null, null, null, 0, false, false, 32697);
            case 17:
                return z3p0.m95286b((z3p0) obj, this.f141231b, Long.valueOf(this.f141232c), null, false, 0.0f, false, null, null, null, null, 0, false, false, 32761);
            case 18:
                return z3p0.m95286b((z3p0) obj, this.f141231b, Long.valueOf(this.f141232c), null, false, 0.0f, false, null, null, null, null, 0, false, false, 32761);
            case 19:
                return z3p0.m95286b((z3p0) obj, this.f141231b, Long.valueOf(this.f141232c), null, false, 0.0f, false, null, null, null, null, 0, false, false, 32761);
            case 20:
                DrawScope drawScope = (DrawScope) obj;
                DrawScope.m277h0(drawScope, this.f141231b, 0L, 0L, 0.0f, null, null, 126);
                DrawScope.m273U0(drawScope, tm4.m81087E(new pqm0[]{new pqm0(Float.valueOf(0.0f), new n6f(n6f.m63765b(this.f141232c, 0.5f, 0.0f, 0.0f, 0.0f, 14))), new pqm0(Float.valueOf(1.0f), new n6f(n6f.m63765b(this.f141232c, 0.75f, 0.0f, 0.0f, 0.0f, 14)))}, 0.0f, 0.0f, 14), 0L, 0L, 0.0f, null, null, 0, 126);
                return w2a1.f247311a;
            default:
                long j2 = ((uk91) obj).f231266c;
                boolean z = false;
                if (this.f141231b <= j2 && j2 <= this.f141232c) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
