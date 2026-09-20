package p204p;

import androidx.compose.p002ui.geometry.Offset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class g9t {

    /* JADX INFO: renamed from: a */
    public final ArrayList f77870a;

    /* JADX INFO: renamed from: b */
    public final List f77871b;

    public g9t(ArrayList arrayList, List list) {
        this.f77870a = arrayList;
        this.f77871b = list;
    }

    /* JADX INFO: renamed from: a */
    public static g9t m44131a(g9t g9tVar, ArrayList arrayList, ArrayList arrayList2, int i) {
        List list = arrayList2;
        if ((i & 2) != 0) {
            list = g9tVar.f77871b;
        }
        return new g9t(arrayList, list);
    }

    /* JADX INFO: renamed from: d */
    public static p68 m44132d(g9t g9tVar, gh00 gh00Var, int i) {
        gh00 gh00Var2 = (i & 1) != 0 ? h7t.f88547t : gh00Var;
        ArrayList arrayList = g9tVar.f77870a;
        List<w8t> list = g9tVar.f77871b;
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(list, 10));
        for (w8t w8tVar : list) {
            rp3 rp3Var = (rp3) arrayList.get(w8tVar.f249004a);
            rp3 rp3Var2 = (rp3) arrayList.get(w8tVar.f249005b);
            ro80 ro80VarM44508o = geg1.m44508o();
            ro80VarM44508o.add(new b6q0(0.0d, ((Number) gh00Var2.invoke(Double.valueOf(Float.intBitsToFloat((int) (rp3Var.f201408a & 4294967295L))))).doubleValue()));
            Iterator it = w8tVar.f249006c.iterator();
            while (it.hasNext()) {
                long j = ((Offset) it.next()).f493a;
                ro80VarM44508o.add(new b6q0(Float.intBitsToFloat((int) (j >> 32)), ((Number) gh00Var2.invoke(Double.valueOf(Float.intBitsToFloat((int) (j & 4294967295L))))).doubleValue()));
            }
            ro80VarM44508o.add(new b6q0(1.0d, ((Number) gh00Var2.invoke(Double.valueOf(Float.intBitsToFloat((int) (rp3Var2.f201408a & 4294967295L))))).doubleValue()));
            arrayList2.add(new o68(geg1.m44506m(ro80VarM44508o), Float.intBitsToFloat((int) (rp3Var.f201408a >> 32)), Float.intBitsToFloat((int) (rp3Var2.f201408a >> 32))));
        }
        return new p68(arrayList2, 0.0d, 1.0d);
    }

    /* JADX INFO: renamed from: b */
    public final List m44133b() {
        return this.f77870a;
    }

    /* JADX INFO: renamed from: c */
    public final g9t m44134c(float f, float f2, long j, int i) {
        char c;
        ArrayList arrayList = this.f77870a;
        rp3 rp3Var = (rp3) g6f.m43747t0(i, arrayList);
        if (rp3Var != null) {
            long j2 = rp3Var.f201408a;
            if (!rp3Var.m76096b()) {
                char c2 = ' ';
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / f;
                float f3 = (-Float.intBitsToFloat((int) (j & 4294967295L))) / f2;
                int i2 = (int) (j2 >> 32);
                float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 & 4294967295L)) + f3;
                if (rp3Var.f201409b == yq3.f275129b) {
                    fIntBitsToFloat2 = n0e1.m63436m(Float.intBitsToFloat(i2) + fIntBitsToFloat, i > 0 ? Float.intBitsToFloat((int) (((rp3) arrayList.get(i - 1)).f201408a >> 32)) : 0.0f, i < arrayList.size() + (-1) ? Float.intBitsToFloat((int) (((rp3) arrayList.get(i + 1)).f201408a >> 32)) : 1.0f);
                }
                float fM63436m = n0e1.m63436m(fIntBitsToFloat3, 0.0f, 1.0f);
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                int i3 = 0;
                for (Object obj : arrayList) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        h6f.m46722S();
                        throw null;
                    }
                    rp3 rp3VarM76095a = (rp3) obj;
                    if (i3 == i) {
                        c = c2;
                        rp3VarM76095a = rp3.m76095a(rp3VarM76095a, (((long) Float.floatToRawIntBits(fM63436m)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c));
                    } else {
                        c = c2;
                    }
                    arrayList2.add(rp3VarM76095a);
                    i3 = i4;
                    c2 = c;
                }
                List<w8t> list = this.f77871b;
                ArrayList arrayList3 = new ArrayList(i6f.m49804T(list, 10));
                for (w8t w8tVarM48393h : list) {
                    if (w8tVarM48393h.f249004a == i || w8tVarM48393h.f249005b == i) {
                        w8tVarM48393h = hrg1.m48393h(w8tVarM48393h, arrayList2);
                    }
                    arrayList3.add(w8tVarM48393h);
                }
                return m44131a(this, arrayList2, arrayList3, 4);
            }
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9t)) {
            return false;
        }
        g9t g9tVar = (g9t) obj;
        return this.f77870a.equals(g9tVar.f77870a) && wj50.m88271j(this.f77871b, g9tVar.f77871b);
    }

    public final int hashCode() {
        return s571.m77244c(this.f77870a.hashCode() * 31, 31, this.f77871b);
    }
}
