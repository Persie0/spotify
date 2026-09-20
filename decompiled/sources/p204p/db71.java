package p204p;

import android.graphics.RectF;
import android.text.Layout;
import java.util.ArrayList;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes.dex */
public final class db71 {

    /* JADX INFO: renamed from: a */
    public final cb71 f47230a;

    /* JADX INFO: renamed from: b */
    public final z6i0 f47231b;

    /* JADX INFO: renamed from: c */
    public final long f47232c;

    /* JADX INFO: renamed from: d */
    public final float f47233d;

    /* JADX INFO: renamed from: e */
    public final float f47234e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f47235f;

    public db71(cb71 cb71Var, z6i0 z6i0Var, long j) {
        this.f47230a = cb71Var;
        this.f47231b = z6i0Var;
        this.f47232c = j;
        ArrayList arrayList = z6i0Var.f279924h;
        float fM28619d = 0.0f;
        this.f47233d = arrayList.isEmpty() ? 0.0f : ((nsm0) arrayList.get(0)).f157840a.f166267d.m28619d(0);
        if (!arrayList.isEmpty()) {
            nsm0 nsm0Var = (nsm0) g6f.m43687A0(arrayList);
            bb71 bb71Var = nsm0Var.f157840a.f166267d;
            fM28619d = bb71Var.m28619d(bb71Var.f25460g - 1) + nsm0Var.f157845f;
        }
        this.f47234e = fM28619d;
        this.f47235f = z6i0Var.f279923g;
    }

    /* JADX INFO: renamed from: a */
    public final int m35530a(int i) {
        z6i0 z6i0Var = this.f47231b;
        ArrayList arrayList = z6i0Var.f279924h;
        z6i0Var.m95505l(i);
        nsm0 nsm0Var = (nsm0) arrayList.get(i == z6i0Var.f279917a.m29909l().f107641b.length() ? h6f.m46714K(arrayList) : vyf1.m86750o(i, arrayList));
        return nsm0Var.f157840a.f166267d.f25459f.isRtlCharAt(nsm0Var.m65569d(i)) ? 2 : 1;
    }

    /* JADX INFO: renamed from: b */
    public final tiv0 m35531b(int i) {
        float fM28624i;
        float fM28624i2;
        float fM28623h;
        float fM28623h2;
        z6i0 z6i0Var = this.f47231b;
        z6i0Var.m95504k(i);
        ArrayList arrayList = z6i0Var.f279924h;
        nsm0 nsm0Var = (nsm0) arrayList.get(vyf1.m86750o(i, arrayList));
        ok4 ok4Var = nsm0Var.f157840a;
        int iM65569d = nsm0Var.m65569d(i);
        CharSequence charSequence = ok4Var.f166268e;
        if (iM65569d < 0 || iM65569d >= charSequence.length()) {
            StringBuilder sbM56838j = klh.m56838j(iM65569d, "offset(", ") is out of bounds [0,");
            sbM56838j.append(charSequence.length());
            sbM56838j.append(')');
            nt40.m65597a(sbM56838j.toString());
        }
        bb71 bb71Var = ok4Var.f166267d;
        Layout layout = bb71Var.f25459f;
        int lineForOffset = layout.getLineForOffset(iM65569d);
        float fM28622g = bb71Var.m28622g(lineForOffset);
        float fM28620e = bb71Var.m28620e(lineForOffset);
        boolean z = layout.getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iM65569d);
        if (!z || zIsRtlCharAt) {
            if (z && zIsRtlCharAt) {
                fM28623h = bb71Var.m28624i(iM65569d, false);
                fM28623h2 = bb71Var.m28624i(iM65569d + 1, true);
            } else if (zIsRtlCharAt) {
                fM28623h = bb71Var.m28623h(iM65569d, false);
                fM28623h2 = bb71Var.m28623h(iM65569d + 1, true);
            } else {
                fM28624i = bb71Var.m28624i(iM65569d, false);
                fM28624i2 = bb71Var.m28624i(iM65569d + 1, true);
            }
            float f = fM28623h;
            fM28624i = fM28623h2;
            fM28624i2 = f;
        } else {
            fM28624i = bb71Var.m28623h(iM65569d, false);
            fM28624i2 = bb71Var.m28623h(iM65569d + 1, true);
        }
        RectF rectF = new RectF(fM28624i, fM28622g, fM28624i2, fM28620e);
        return nsm0Var.m65566a(new tiv0(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    /* JADX INFO: renamed from: c */
    public final tiv0 m35532c(int i) {
        z6i0 z6i0Var = this.f47231b;
        ArrayList arrayList = z6i0Var.f279924h;
        z6i0Var.m95505l(i);
        nsm0 nsm0Var = (nsm0) arrayList.get(i == z6i0Var.f279917a.m29909l().f107641b.length() ? h6f.m46714K(arrayList) : vyf1.m86750o(i, arrayList));
        ok4 ok4Var = nsm0Var.f157840a;
        int iM65569d = nsm0Var.m65569d(i);
        CharSequence charSequence = ok4Var.f166268e;
        bb71 bb71Var = ok4Var.f166267d;
        if (iM65569d < 0 || iM65569d > charSequence.length()) {
            StringBuilder sbM56838j = klh.m56838j(iM65569d, "offset(", ") is out of bounds [0,");
            sbM56838j.append(charSequence.length());
            sbM56838j.append(']');
            nt40.m65597a(sbM56838j.toString());
        }
        float fM28623h = bb71Var.m28623h(iM65569d, false);
        int lineForOffset = bb71Var.f25459f.getLineForOffset(iM65569d);
        return nsm0Var.m65566a(new tiv0(fM28623h, bb71Var.m28622g(lineForOffset), fM28623h, bb71Var.m28620e(lineForOffset)));
    }

    /* JADX INFO: renamed from: d */
    public final boolean m35533d() {
        long j = this.f47232c;
        float f = (int) (j >> 32);
        z6i0 z6i0Var = this.f47231b;
        return f < z6i0Var.f279920d || z6i0Var.f279919c || ((float) ((int) (j & 4294967295L))) < z6i0Var.f279921e;
    }

    /* JADX INFO: renamed from: e */
    public final float m35534e(int i, boolean z) {
        z6i0 z6i0Var = this.f47231b;
        ArrayList arrayList = z6i0Var.f279924h;
        z6i0Var.m95505l(i);
        nsm0 nsm0Var = (nsm0) arrayList.get(i == z6i0Var.f279917a.m29909l().f107641b.length() ? h6f.m46714K(arrayList) : vyf1.m86750o(i, arrayList));
        ok4 ok4Var = nsm0Var.f157840a;
        int iM65569d = nsm0Var.m65569d(i);
        bb71 bb71Var = ok4Var.f166267d;
        return z ? bb71Var.m28623h(iM65569d, false) : bb71Var.m28624i(iM65569d, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db71)) {
            return false;
        }
        db71 db71Var = (db71) obj;
        return this.f47230a.equals(db71Var.f47230a) && this.f47231b.equals(db71Var.f47231b) && g450.m43520b(this.f47232c, db71Var.f47232c) && this.f47233d == db71Var.f47233d && this.f47234e == db71Var.f47234e && wj50.m88271j(this.f47235f, db71Var.f47235f);
    }

    /* JADX INFO: renamed from: f */
    public final float m35535f(int i) {
        z6i0 z6i0Var = this.f47231b;
        z6i0Var.m95506m(i);
        ArrayList arrayList = z6i0Var.f279924h;
        nsm0 nsm0Var = (nsm0) arrayList.get(vyf1.m86751p(i, arrayList));
        ok4 ok4Var = nsm0Var.f157840a;
        return ok4Var.f166267d.m28619d(i - nsm0Var.f157843d) + nsm0Var.f157845f;
    }

    /* JADX INFO: renamed from: g */
    public final float m35536g(int i) {
        z6i0 z6i0Var = this.f47231b;
        z6i0Var.m95506m(i);
        ArrayList arrayList = z6i0Var.f279924h;
        nsm0 nsm0Var = (nsm0) arrayList.get(vyf1.m86751p(i, arrayList));
        ok4 ok4Var = nsm0Var.f157840a;
        int i2 = i - nsm0Var.f157843d;
        bb71 bb71Var = ok4Var.f166267d;
        return bb71Var.f25459f.getLineLeft(i2) + (i2 == bb71Var.f25460g + (-1) ? bb71Var.f25463j : 0.0f);
    }

    /* JADX INFO: renamed from: h */
    public final float m35537h(int i) {
        z6i0 z6i0Var = this.f47231b;
        z6i0Var.m95506m(i);
        ArrayList arrayList = z6i0Var.f279924h;
        nsm0 nsm0Var = (nsm0) arrayList.get(vyf1.m86751p(i, arrayList));
        ok4 ok4Var = nsm0Var.f157840a;
        int i2 = i - nsm0Var.f157843d;
        bb71 bb71Var = ok4Var.f166267d;
        return bb71Var.f25459f.getLineRight(i2) + (i2 == bb71Var.f25460g + (-1) ? bb71Var.f25464k : 0.0f);
    }

    public final int hashCode() {
        return this.f47235f.hashCode() + AbstractC0000a.m8g(AbstractC0000a.m8g(dq60.m36605e((this.f47231b.hashCode() + (this.f47230a.hashCode() * 31)) * 31, this.f47232c, 31), 31, this.f47233d), 31, this.f47234e);
    }

    /* JADX INFO: renamed from: i */
    public final int m35538i(int i) {
        z6i0 z6i0Var = this.f47231b;
        z6i0Var.m95506m(i);
        ArrayList arrayList = z6i0Var.f279924h;
        nsm0 nsm0Var = (nsm0) arrayList.get(vyf1.m86751p(i, arrayList));
        ok4 ok4Var = nsm0Var.f157840a;
        return ok4Var.f166267d.f25459f.getLineStart(i - nsm0Var.f157843d) + nsm0Var.f157841b;
    }

    /* JADX INFO: renamed from: j */
    public final int m35539j(int i) {
        z6i0 z6i0Var = this.f47231b;
        ArrayList arrayList = z6i0Var.f279924h;
        z6i0Var.m95505l(i);
        nsm0 nsm0Var = (nsm0) arrayList.get(i == z6i0Var.f279917a.m29909l().f107641b.length() ? h6f.m46714K(arrayList) : vyf1.m86750o(i, arrayList));
        ok4 ok4Var = nsm0Var.f157840a;
        int iM65569d = nsm0Var.m65569d(i);
        bb71 bb71Var = ok4Var.f166267d;
        return bb71Var.f25459f.getParagraphDirection(bb71Var.f25459f.getLineForOffset(iM65569d)) == 1 ? 1 : 2;
    }

    /* JADX INFO: renamed from: k */
    public final uk4 m35540k(int i, int i2) {
        z6i0 z6i0Var = this.f47231b;
        bmx bmxVar = z6i0Var.f279917a;
        if (i < 0 || i > i2 || i2 > bmxVar.m29909l().f107641b.length()) {
            StringBuilder sbM36619s = dq60.m36619s(i, i2, "Start(", ") or End(", ") is out of range [0..");
            sbM36619s.append(bmxVar.m29909l().f107641b.length());
            sbM36619s.append("), or start > end!");
            nt40.m65597a(sbM36619s.toString());
        }
        if (i == i2) {
            return xk4.m91259a();
        }
        uk4 uk4VarM91259a = xk4.m91259a();
        vyf1.m86753r(z6i0Var.f279924h, dvg1.m37112n(i, i2), new je40(uk4VarM91259a, i, i2, 3));
        return uk4VarM91259a;
    }

    /* JADX INFO: renamed from: l */
    public final long m35541l(int i) {
        z6i0 z6i0Var = this.f47231b;
        ArrayList arrayList = z6i0Var.f279924h;
        z6i0Var.m95505l(i);
        nsm0 nsm0Var = (nsm0) arrayList.get(i == z6i0Var.f279917a.m29909l().f107641b.length() ? h6f.m46714K(arrayList) : vyf1.m86750o(i, arrayList));
        ok4 ok4Var = nsm0Var.f157840a;
        int iM65569d = nsm0Var.m65569d(i);
        w780 w780VarM28625j = ok4Var.f166267d.m28625j();
        return nsm0Var.m65567b(dvg1.m37112n(tg1.m80721k(iM65569d, w780VarM28625j), tg1.m80720j(iM65569d, w780VarM28625j)), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f47230a + ", multiParagraph=" + this.f47231b + ", size=" + ((Object) g450.m43521c(this.f47232c)) + ", firstBaseline=" + this.f47233d + ", lastBaseline=" + this.f47234e + ", placeholderRects=" + this.f47235f + ')';
    }
}
