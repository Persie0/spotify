package p204p;

import android.graphics.Paint;
import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawStyle;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class krb implements DrawScope {

    /* JADX INFO: renamed from: a */
    public final jrb f125600a;

    /* JADX INFO: renamed from: b */
    public final c06 f125601b;

    /* JADX INFO: renamed from: c */
    public lk4 f125602c;

    /* JADX INFO: renamed from: d */
    public lk4 f125603d;

    public krb() {
        jrb jrbVar = new jrb();
        jrbVar.f115127a = epv0.f61724a;
        jrbVar.f115128b = ko70.f124556a;
        jrbVar.f115129c = aau.f13926a;
        jrbVar.f115130d = 0L;
        this.f125600a = jrbVar;
        this.f125601b = new c06(this);
    }

    /* JADX INFO: renamed from: a */
    public static lk4 m57147a(krb krbVar, long j, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i) {
        lk4 lk4VarM57149c = krbVar.m57149c(drawStyle);
        if (f != 1.0f) {
            j = n6f.m63765b(j, n6f.m63766c(j) * f, 0.0f, 0.0f, 0.0f, 14);
        }
        Paint paint = lk4VarM57149c.f134233a;
        long jM77451y = s800.m77451y(paint);
        int i2 = n6f.f150872l;
        if (!as91.m27074b(jM77451y, j)) {
            lk4VarM57149c.m59208c(j);
        }
        if (lk4VarM57149c.f134235c != null) {
            lk4VarM57149c.m59210e(null);
        }
        if (!wj50.m88271j(lk4VarM57149c.f134236d, colorFilter)) {
            lk4VarM57149c.m59209d(colorFilter);
        }
        if (!ftg1.m42662v(lk4VarM57149c.f134234b, i)) {
            lk4VarM57149c.m59207b(i);
        }
        if (!tkf1.m81010g(s800.m77452z(paint), 1)) {
            s800.m77418S(paint, 1);
        }
        return lk4VarM57149c;
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: C0 */
    public final void mo283C0(Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.f125600a.f115129c.mo25274c(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j2)) + Float.intBitsToFloat(i3), m57148b(brush, drawStyle, f, colorFilter, i, 1));
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: F0 */
    public final void mo284F0(long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.f125600a.f115129c.mo25274c(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3), m57147a(this, j, drawStyle, f, colorFilter, i));
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: H */
    public final void mo285H(q94 q94Var, long j, float f, ColorFilter colorFilter, int i) {
        this.f125600a.f115129c.mo25286o(q94Var, j, m57148b(null, qxy.f193763a, f, colorFilter, i, 1));
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: J */
    public final void mo286J(long j, long j2, long j3, long j4, DrawStyle drawStyle, float f, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.f125600a.f115129c.mo25282k(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), m57147a(this, j, drawStyle, f, null, i));
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: K0 */
    public final void mo287K0(vbn0 vbn0Var, long j, DrawStyle drawStyle, int i) {
        this.f125600a.f115129c.mo25291t(vbn0Var, m57147a(this, j, drawStyle, 1.0f, null, i));
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: L0 */
    public final void mo288L0(q94 q94Var, long j, long j2, long j3, long j4, float f, ColorFilter colorFilter, int i) {
        this.f125600a.f115129c.mo25275d(q94Var, j, j2, j3, j4, m57148b(null, qxy.f193763a, f, colorFilter, 3, i));
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: Q */
    public final void mo289Q(Brush brush, float f, long j, float f2, DrawStyle drawStyle) {
        this.f125600a.f115129c.mo25285n(f, j, m57148b(brush, drawStyle, f2, null, 3, 1));
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: W0 */
    public final float mo24617W0() {
        return this.f125600a.f115127a.mo24617W0();
    }

    /* JADX INFO: renamed from: b */
    public final lk4 m57148b(Brush brush, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i, int i2) {
        lk4 lk4VarM57149c = m57149c(drawStyle);
        if (brush != null) {
            brush.mo268a(f, mo295n(), lk4VarM57149c);
        } else {
            Paint paint = lk4VarM57149c.f134233a;
            if (lk4VarM57149c.f134235c != null) {
                lk4VarM57149c.m59210e(null);
            }
            long jM77451y = s800.m77451y(paint);
            int i3 = n6f.f150872l;
            if (!as91.m27074b(jM77451y, ly5.m60218h())) {
                lk4VarM57149c.m59208c(ly5.m60218h());
            }
            if (s800.m77450x(paint) != f) {
                lk4VarM57149c.m59206a(f);
            }
        }
        Paint paint2 = lk4VarM57149c.f134233a;
        if (!wj50.m88271j(lk4VarM57149c.f134236d, colorFilter)) {
            lk4VarM57149c.m59209d(colorFilter);
        }
        if (!ftg1.m42662v(lk4VarM57149c.f134234b, i)) {
            lk4VarM57149c.m59207b(i);
        }
        if (!tkf1.m81010g(s800.m77452z(paint2), i2)) {
            s800.m77418S(paint2, i2);
        }
        return lk4VarM57149c;
    }

    /* JADX INFO: renamed from: c */
    public final lk4 m57149c(DrawStyle drawStyle) {
        if (wj50.m88271j(drawStyle, qxy.f193763a)) {
            lk4 lk4Var = this.f125602c;
            if (lk4Var != null) {
                return lk4Var;
            }
            lk4 lk4VarM77438l = s800.m77438l();
            lk4VarM77438l.m59212g(0);
            this.f125602c = lk4VarM77438l;
            return lk4VarM77438l;
        }
        if (!(drawStyle instanceof em51)) {
            throw new NoWhenBranchMatchedException();
        }
        lk4 lk4VarM77438l2 = this.f125603d;
        if (lk4VarM77438l2 == null) {
            lk4VarM77438l2 = s800.m77438l();
            lk4VarM77438l2.m59212g(1);
            this.f125603d = lk4VarM77438l2;
        }
        Paint paint = lk4VarM77438l2.f134233a;
        em51 em51Var = (em51) drawStyle;
        if (s800.m77404E(paint) != em51Var.m39406e()) {
            lk4VarM77438l2.m59211f(em51Var.m39406e());
        }
        if (!wcg1.m87743h(s800.m77401B(paint), em51Var.m39402a())) {
            s800.m77421V(paint, em51Var.m39402a());
        }
        if (s800.m77403D(paint) != em51Var.m39404c()) {
            s800.m77423X(paint, em51Var.m39404c());
        }
        if (!ddg1.m35738i(s800.m77402C(paint), em51Var.m39403b())) {
            s800.m77422W(paint, em51Var.m39403b());
        }
        if (!wj50.m88271j(lk4VarM77438l2.f134237e, em51Var.m39405d())) {
            vk4 vk4VarM39405d = em51Var.m39405d();
            s800.m77419T(paint, vk4VarM39405d);
            lk4VarM77438l2.f134237e = vk4VarM39405d;
        }
        return lk4VarM77438l2;
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: d1 */
    public final c06 mo291d1() {
        return this.f125601b;
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: g0 */
    public final void mo292g0(long j, float f, float f2, long j2, long j3, em51 em51Var) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.f125600a.f115129c.mo25276e(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, m57147a(this, j, em51Var, 1.0f, null, 3));
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: g1 */
    public final void mo293g1(long j, long j2, long j3, float f, int i, vk4 vk4Var) {
        wqb wqbVar = this.f125600a.f115129c;
        lk4 lk4VarM77438l = this.f125603d;
        if (lk4VarM77438l == null) {
            lk4VarM77438l = s800.m77438l();
            lk4VarM77438l.m59212g(1);
            this.f125603d = lk4VarM77438l;
        }
        lk4 lk4Var = lk4VarM77438l;
        Paint paint = lk4Var.f134233a;
        long jM77451y = s800.m77451y(paint);
        int i2 = n6f.f150872l;
        if (!as91.m27074b(jM77451y, j)) {
            lk4Var.m59208c(j);
        }
        if (lk4Var.f134235c != null) {
            lk4Var.m59210e(null);
        }
        if (!wj50.m88271j(lk4Var.f134236d, null)) {
            lk4Var.m59209d(null);
        }
        if (!ftg1.m42662v(lk4Var.f134234b, 3)) {
            lk4Var.m59207b(3);
        }
        if (s800.m77404E(paint) != f) {
            lk4Var.m59211f(f);
        }
        if (s800.m77403D(paint) != 4.0f) {
            s800.m77423X(paint, 4.0f);
        }
        if (!wcg1.m87743h(s800.m77401B(paint), i)) {
            s800.m77421V(paint, i);
        }
        if (!ddg1.m35738i(s800.m77402C(paint), 0)) {
            s800.m77422W(paint, 0);
        }
        if (!wj50.m88271j(lk4Var.f134237e, vk4Var)) {
            s800.m77419T(paint, vk4Var);
            lk4Var.f134237e = vk4Var;
        }
        if (!tkf1.m81010g(s800.m77452z(paint), 1)) {
            s800.m77418S(paint, 1);
        }
        wqbVar.mo25281j(j2, j3, lk4Var);
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.DrawScope
    public final ko70 getLayoutDirection() {
        return this.f125600a.f115128b;
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: j */
    public final float mo24619j() {
        return this.f125600a.f115127a.mo24619j();
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: o1 */
    public final void mo296o1(Brush brush, long j, long j2, float f, float f2) {
        wqb wqbVar = this.f125600a.f115129c;
        lk4 lk4VarM77438l = this.f125603d;
        if (lk4VarM77438l == null) {
            lk4VarM77438l = s800.m77438l();
            lk4VarM77438l.m59212g(1);
            this.f125603d = lk4VarM77438l;
        }
        Paint paint = lk4VarM77438l.f134233a;
        if (brush != null) {
            brush.mo268a(f2, mo295n(), lk4VarM77438l);
        } else if (s800.m77450x(paint) != f2) {
            lk4VarM77438l.m59206a(f2);
        }
        if (!wj50.m88271j(lk4VarM77438l.f134236d, null)) {
            lk4VarM77438l.m59209d(null);
        }
        if (!ftg1.m42662v(lk4VarM77438l.f134234b, 3)) {
            lk4VarM77438l.m59207b(3);
        }
        if (s800.m77404E(paint) != f) {
            lk4VarM77438l.m59211f(f);
        }
        if (s800.m77403D(paint) != 4.0f) {
            s800.m77423X(paint, 4.0f);
        }
        if (!wcg1.m87743h(s800.m77401B(paint), 0)) {
            s800.m77421V(paint, 0);
        }
        if (!ddg1.m35738i(s800.m77402C(paint), 0)) {
            s800.m77422W(paint, 0);
        }
        if (!wj50.m88271j(lk4VarM77438l.f134237e, null)) {
            s800.m77419T(paint, null);
            lk4VarM77438l.f134237e = null;
        }
        if (!tkf1.m81010g(s800.m77452z(paint), 1)) {
            s800.m77418S(paint, 1);
        }
        wqbVar.mo25281j(j, j2, lk4VarM77438l);
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: p0 */
    public final void mo297p0(Brush brush, long j, long j2, long j3, float f, DrawStyle drawStyle, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.f125600a.f115129c.mo25282k(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), m57148b(brush, drawStyle, f, null, i, 1));
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: q0 */
    public final void mo298q0(vbn0 vbn0Var, Brush brush, float f, DrawStyle drawStyle, int i) {
        this.f125600a.f115129c.mo25291t(vbn0Var, m57148b(brush, drawStyle, f, null, i, 1));
    }

    @Override // androidx.compose.p002ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: w0 */
    public final void mo299w0(long j, float f, long j2, float f2, DrawStyle drawStyle, int i) {
        this.f125600a.f115129c.mo25285n(f, j2, m57147a(this, j, drawStyle, f2, null, i));
    }
}
