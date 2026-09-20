package p204p;

import androidx.compose.p002ui.unit.TextUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class b7i0 implements yqq {

    /* JADX INFO: renamed from: a */
    public db71 f24282a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c7i0 f24283b;

    public b7i0(c7i0 c7i0Var) {
        this.f24283b = c7i0Var;
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: W0 */
    public final float mo24617W0() {
        yqq yqqVar = this.f24283b.f34920k;
        wj50.m88279p(yqqVar);
        return yqqVar.mo24617W0();
    }

    /* JADX INFO: renamed from: a */
    public final db71 m28375a() {
        return this.f24282a;
    }

    /* JADX INFO: renamed from: b */
    public final db71 m28376b(long j, long j2) {
        long jM31723h;
        c7i0 c7i0Var = this.f24283b;
        if71 if71Var = c7i0Var.f34921l;
        long jM35202a = TextUnit.m309d(j2) ? d7i0.m35202a(c7i0Var.f34921l.f101704a.f63411b, j2) : j2;
        if (!TextUnit.m306a(jM35202a, c7i0Var.f34921l.f101704a.f63411b)) {
            c7i0Var.m31721f(if71.m50418a(c7i0Var.f34921l, 0L, jM35202a, null, null, null, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, null, 0, 16777213));
        }
        if (c7i0Var.f34915f > 1) {
            ko70 ko70Var = c7i0Var.f34923n;
            wj50.m88279p(ko70Var);
            jM31723h = c7i0Var.m31723h(j, ko70Var);
        } else {
            jM31723h = j;
        }
        ko70 ko70Var2 = c7i0Var.f34923n;
        wj50.m88279p(ko70Var2);
        z6i0 z6i0VarM31717b = c7i0Var.m31717b(jM31723h, ko70Var2);
        ko70 ko70Var3 = c7i0Var.f34923n;
        wj50.m88279p(ko70Var3);
        db71 db71VarM31722g = c7i0Var.m31722g(ko70Var3, jM31723h, z6i0VarM31717b);
        this.f24282a = db71VarM31722g;
        c7i0Var.m31721f(if71Var);
        return db71VarM31722g;
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: j */
    public final float mo24619j() {
        yqq yqqVar = this.f24283b.f34920k;
        wj50.m88279p(yqqVar);
        return yqqVar.mo24619j();
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: t0 */
    public final float mo28377t0(long j) {
        if (!TextUnit.m309d(j)) {
            return mo24619j() * mo26962D(j);
        }
        c7i0 c7i0Var = this.f24283b;
        if (TextUnit.m309d(c7i0Var.f34921l.f101704a.f63411b)) {
            throw new IllegalStateException("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is Em\nDeclare the composable's style.fontSize with Sp units instead.");
        }
        long j2 = c7i0Var.f34921l.f101704a.f63411b;
        tf71[] tf71VarArr = TextUnit.f546b;
        if (TextUnit.m306a(j2, TextUnit.f547c)) {
            throw new IllegalStateException("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is not set. Please specify a font size.");
        }
        return TextUnit.m308c(j) * mo28377t0(c7i0Var.f34921l.f101704a.f63411b);
    }
}
