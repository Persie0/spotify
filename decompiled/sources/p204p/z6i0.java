package p204p;

import android.text.Layout;
import androidx.compose.p002ui.graphics.Shadow;
import androidx.compose.p002ui.graphics.drawscope.DrawStyle;
import androidx.compose.p002ui.text.style.TextDecoration;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class z6i0 {

    /* JADX INFO: renamed from: a */
    public final bmx f279917a;

    /* JADX INFO: renamed from: b */
    public final int f279918b;

    /* JADX INFO: renamed from: c */
    public final boolean f279919c;

    /* JADX INFO: renamed from: d */
    public final float f279920d;

    /* JADX INFO: renamed from: e */
    public final float f279921e;

    /* JADX INFO: renamed from: f */
    public final int f279922f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f279923g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f279924h;

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public z6i0(bmx bmxVar, long j, int i, int i2) {
        boolean z;
        int iM28429h;
        this.f279917a = bmxVar;
        this.f279918b = i;
        if (b8j.m28432k(j) != 0 || b8j.m28431j(j) != 0) {
            nt40.m65597a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) bmxVar.m29913p();
        int size = arrayList2.size();
        int i3 = 0;
        float f = 0.0f;
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                z = false;
                break;
            }
            osm0 osm0Var = (osm0) arrayList2.get(i4);
            sk4 sk4Var = osm0Var.f168837a;
            int iM28430i = b8j.m28430i(j);
            if (b8j.m28425d(j)) {
                iM28429h = b8j.m28429h(j) - ((int) Math.ceil(f));
                if (iM28429h < 0) {
                    iM28429h = 0;
                }
            } else {
                iM28429h = b8j.m28429h(j);
            }
            ok4 ok4VarM95421a = z520.m95421a(sk4Var, this.f279918b - i3, i2, e8j.m38111b(0, iM28430i, 0, iM28429h, 5));
            bb71 bb71Var = ok4VarM95421a.f166267d;
            float fM67131b = ok4VarM95421a.m67131b() + f;
            int i5 = i3 + bb71Var.f25460g;
            arrayList.add(new nsm0(ok4VarM95421a, osm0Var.f168838b, osm0Var.f168839c, i3, i5, f, fM67131b));
            if (bb71Var.f25457d || (i5 == this.f279918b && i4 != h6f.m46714K(this.f279917a.m29913p()))) {
                z = true;
                i3 = i5;
                f = fM67131b;
                break;
            } else {
                i4++;
                i3 = i5;
                f = fM67131b;
            }
        }
        this.f279921e = f;
        this.f279922f = i3;
        this.f279919c = z;
        this.f279924h = arrayList;
        this.f279920d = b8j.m28430i(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i6 = 0; i6 < size2; i6++) {
            nsm0 nsm0Var = (nsm0) arrayList.get(i6);
            ?? r8 = nsm0Var.f157840a.f166269f;
            ArrayList arrayList4 = new ArrayList(r8.size());
            int size3 = r8.size();
            for (int i7 = 0; i7 < size3; i7++) {
                tiv0 tiv0Var = (tiv0) r8.get(i7);
                arrayList4.add(tiv0Var != null ? nsm0Var.m65566a(tiv0Var) : null);
            }
            j6f.m52564V(arrayList4, arrayList3);
        }
        if (arrayList3.size() < this.f279917a.m29917t().size()) {
            int size4 = this.f279917a.m29917t().size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i8 = 0; i8 < size4; i8++) {
                arrayList5.add(null);
            }
            arrayList3 = g6f.m43700N0(arrayList5, arrayList3);
        }
        this.f279923g = arrayList3;
    }

    /* JADX INFO: renamed from: a */
    public final void m95494a(long j, float[] fArr) {
        m95504k(ic71.m50239g(j));
        m95505l(ic71.m50238f(j));
        plv0 plv0Var = new plv0();
        plv0Var.f178796a = 0;
        vyf1.m86753r(this.f279924h, j, new t9a(j, fArr, plv0Var, new olv0()));
    }

    /* JADX INFO: renamed from: b */
    public final float m95495b(int i) {
        m95506m(i);
        ArrayList arrayList = this.f279924h;
        nsm0 nsm0Var = (nsm0) arrayList.get(vyf1.m86751p(i, arrayList));
        ok4 ok4Var = nsm0Var.f157840a;
        return ok4Var.f166267d.m28620e(i - nsm0Var.f157843d) + nsm0Var.f157845f;
    }

    /* JADX INFO: renamed from: c */
    public final int m95496c(int i, boolean z) {
        m95506m(i);
        ArrayList arrayList = this.f279924h;
        nsm0 nsm0Var = (nsm0) arrayList.get(vyf1.m86751p(i, arrayList));
        return nsm0Var.f157840a.m67132c(i - nsm0Var.f157843d, z) + nsm0Var.f157841b;
    }

    /* JADX INFO: renamed from: d */
    public final int m95497d(int i) {
        int iM86750o;
        int length = this.f279917a.m29909l().f107641b.length();
        ArrayList arrayList = this.f279924h;
        if (i >= length) {
            iM86750o = h6f.m46714K(arrayList);
        } else {
            iM86750o = i < 0 ? 0 : vyf1.m86750o(i, arrayList);
        }
        nsm0 nsm0Var = (nsm0) arrayList.get(iM86750o);
        return nsm0Var.f157840a.f166267d.f25459f.getLineForOffset(nsm0Var.m65569d(i)) + nsm0Var.f157843d;
    }

    /* JADX INFO: renamed from: e */
    public final int m95498e(float f) {
        ArrayList arrayList = this.f279924h;
        nsm0 nsm0Var = (nsm0) arrayList.get(vyf1.m86752q(f, arrayList));
        int i = nsm0Var.f157842c - nsm0Var.f157841b;
        int i2 = nsm0Var.f157843d;
        if (i == 0) {
            return i2;
        }
        ok4 ok4Var = nsm0Var.f157840a;
        float f2 = f - nsm0Var.f157845f;
        bb71 bb71Var = ok4Var.f166267d;
        return bb71Var.f25459f.getLineForVertical(((int) f2) - bb71Var.f25461h) + i2;
    }

    /* JADX INFO: renamed from: f */
    public final float m95499f(int i) {
        m95506m(i);
        ArrayList arrayList = this.f279924h;
        nsm0 nsm0Var = (nsm0) arrayList.get(vyf1.m86751p(i, arrayList));
        ok4 ok4Var = nsm0Var.f157840a;
        return ok4Var.f166267d.m28622g(i - nsm0Var.f157843d) + nsm0Var.f157845f;
    }

    /* JADX INFO: renamed from: g */
    public final int m95500g(long j) {
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.f279924h;
        nsm0 nsm0Var = (nsm0) arrayList.get(vyf1.m86752q(fIntBitsToFloat, arrayList));
        int i2 = nsm0Var.f157842c;
        int i3 = nsm0Var.f157841b;
        if (i2 - i3 == 0) {
            return i3;
        }
        ok4 ok4Var = nsm0Var.f157840a;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i) - nsm0Var.f157845f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32);
        bb71 bb71Var = ok4Var.f166267d;
        int lineForVertical = bb71Var.f25459f.getLineForVertical(((int) Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits))) - bb71Var.f25461h);
        return bb71Var.f25459f.getOffsetForHorizontal(lineForVertical, (bb71Var.m28617b(lineForVertical) * (-1)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))) + i3;
    }

    /* JADX INFO: renamed from: h */
    public final long m95501h(tiv0 tiv0Var, int i, gx31 gx31Var) {
        float f = tiv0Var.f220752b;
        ArrayList arrayList = this.f279924h;
        int iM86752q = vyf1.m86752q(f, arrayList);
        float f2 = ((nsm0) arrayList.get(iM86752q)).f157846g;
        float f3 = tiv0Var.f220754d;
        if (f2 >= f3 || iM86752q == h6f.m46714K(arrayList)) {
            nsm0 nsm0Var = (nsm0) arrayList.get(iM86752q);
            return nsm0Var.m65567b(nsm0Var.f157840a.m67133d(nsm0Var.m65568c(tiv0Var), i, gx31Var), true);
        }
        int iM86752q2 = vyf1.m86752q(f3, arrayList);
        int i2 = ic71.f100751c;
        long jM30601B = bvg1.m30601B();
        while (true) {
            int i3 = ic71.f100751c;
            if (!ic71.m50235c(jM30601B, bvg1.m30601B()) || iM86752q > iM86752q2) {
                break;
            }
            nsm0 nsm0Var2 = (nsm0) arrayList.get(iM86752q);
            jM30601B = nsm0Var2.m65567b(nsm0Var2.f157840a.m67133d(nsm0Var2.m65568c(tiv0Var), i, gx31Var), true);
            iM86752q++;
        }
        if (ic71.m50235c(jM30601B, bvg1.m30601B())) {
            return bvg1.m30601B();
        }
        long jM30601B2 = bvg1.m30601B();
        while (true) {
            int i4 = ic71.f100751c;
            if (!ic71.m50235c(jM30601B2, bvg1.m30601B()) || iM86752q > iM86752q2) {
                break;
            }
            nsm0 nsm0Var3 = (nsm0) arrayList.get(iM86752q2);
            jM30601B2 = nsm0Var3.m65567b(nsm0Var3.f157840a.m67133d(nsm0Var3.m65568c(tiv0Var), i, gx31Var), true);
            iM86752q2--;
        }
        return ic71.m50235c(jM30601B2, bvg1.m30601B()) ? jM30601B : dvg1.m37112n((int) (jM30601B >> 32), (int) (4294967295L & jM30601B2));
    }

    /* JADX INFO: renamed from: i */
    public final boolean m95502i(int i) {
        m95506m(i);
        ArrayList arrayList = this.f279924h;
        Layout layout = ((nsm0) arrayList.get(vyf1.m86751p(i, arrayList))).f157840a.f166267d.f25459f;
        ThreadLocal threadLocal = gb71.f78219a;
        return layout.getEllipsisCount(i) > 0;
    }

    /* JADX INFO: renamed from: j */
    public final void m95503j(wqb wqbVar, long j, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle) {
        wqbVar.mo25287p();
        ArrayList arrayList = this.f279924h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            nsm0 nsm0Var = (nsm0) arrayList.get(i);
            nsm0Var.f157840a.m67136g(wqbVar, j, shadow, textDecoration, drawStyle);
            wqbVar.mo25278g(0.0f, nsm0Var.f157840a.m67131b());
        }
        wqbVar.mo25279h();
    }

    /* JADX INFO: renamed from: k */
    public final void m95504k(int i) {
        boolean z = false;
        bmx bmxVar = this.f279917a;
        if (i >= 0 && i < bmxVar.m29909l().f107641b.length()) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbM56838j = klh.m56838j(i, "offset(", ") is out of bounds [0, ");
        sbM56838j.append(bmxVar.m29909l().f107641b.length());
        sbM56838j.append(')');
        nt40.m65597a(sbM56838j.toString());
    }

    /* JADX INFO: renamed from: l */
    public final void m95505l(int i) {
        boolean z = false;
        bmx bmxVar = this.f279917a;
        if (i >= 0 && i <= bmxVar.m29909l().f107641b.length()) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbM56838j = klh.m56838j(i, "offset(", ") is out of bounds [0, ");
        sbM56838j.append(bmxVar.m29909l().f107641b.length());
        sbM56838j.append(']');
        nt40.m65597a(sbM56838j.toString());
    }

    /* JADX INFO: renamed from: m */
    public final void m95506m(int i) {
        boolean z = false;
        int i2 = this.f279922f;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        nt40.m65597a("lineIndex(" + i + ") is out of bounds [0, " + i2 + ')');
    }
}
