package p204p;

import android.graphics.Rect;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class mi5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f143936a;

    /* JADX INFO: renamed from: a */
    public final cd71 m61844a(cd71 cd71Var) {
        AbstractList<y071> abstractList;
        AbstractList abstractList2;
        float fAbs;
        AbstractList<y071> abstractList3;
        AbstractList abstractList4;
        switch (this.f143936a) {
            case 0:
                cw40 cw40Var = cd71Var.f36824a;
                ArrayList<pqm0> arrayList = cd71Var.f36825b;
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                for (pqm0 pqm0Var : arrayList) {
                    a171 a171Var = (a171) pqm0Var.f180350a;
                    Set set = (Set) pqm0Var.f180351b;
                    rc71 rc71Var = rc71.f197782b;
                    Rect rect = (Rect) a171Var.f226862c;
                    arrayList2.add(new pqm0(a171Var, s601.m77308k0(new sc71(rc71Var, rect != null ? ((rect.width() / cw40Var.f42637d) * rect.height()) / cw40Var.f42638e : 0.0f), set)));
                }
                return new cd71(cw40Var, arrayList2);
            case 1:
                cw40 cw40Var2 = cd71Var.f36824a;
                ArrayList<pqm0> arrayList3 = cd71Var.f36825b;
                ArrayList arrayList4 = new ArrayList(i6f.m49804T(arrayList3, 10));
                for (pqm0 pqm0Var2 : arrayList3) {
                    a171 a171Var2 = (a171) pqm0Var2.f180350a;
                    Set set2 = (Set) pqm0Var2.f180351b;
                    rc71 rc71Var2 = rc71.f197781a;
                    synchronized (a171Var2) {
                        abstractList = a171Var2.f11350e;
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (y071 y071Var : abstractList) {
                        synchronized (y071Var) {
                            abstractList2 = y071Var.f267925e;
                        }
                        j6f.m52564V(abstractList2, arrayList5);
                    }
                    float size = 0.0f;
                    if (!arrayList5.isEmpty()) {
                        ArrayList arrayList6 = new ArrayList();
                        Iterator it = arrayList5.iterator();
                        while (it.hasNext()) {
                            arrayList6.add(Float.valueOf(((x071) it.next()).f256825e));
                        }
                        Iterator it2 = arrayList6.iterator();
                        while (it2.hasNext()) {
                            size += ((Number) it2.next()).floatValue();
                        }
                        size /= arrayList5.size();
                    }
                    arrayList4.add(new pqm0(a171Var2, s601.m77308k0(new sc71(rc71Var2, size), set2)));
                }
                return new cd71(cw40Var2, arrayList4);
            case 2:
                cw40 cw40Var3 = cd71Var.f36824a;
                ArrayList<pqm0> arrayList7 = cd71Var.f36825b;
                ArrayList arrayList8 = new ArrayList(i6f.m49804T(arrayList7, 10));
                for (pqm0 pqm0Var3 : arrayList7) {
                    a171 a171Var3 = (a171) pqm0Var3.f180350a;
                    Set set3 = (Set) pqm0Var3.f180351b;
                    rc71 rc71Var3 = rc71.f197784d;
                    Rect rect2 = (Rect) a171Var3.f226862c;
                    if (rect2 != null) {
                        int iCenterX = rect2.centerX();
                        float f = cw40Var3.f42637d / 2.0f;
                        fAbs = 1.0f - (Math.abs(iCenterX - f) / f);
                    } else {
                        fAbs = 0.0f;
                    }
                    arrayList8.add(new pqm0(a171Var3, s601.m77308k0(new sc71(rc71Var3, fAbs), set3)));
                }
                return new cd71(cw40Var3, arrayList8);
            case 3:
                cw40 cw40Var4 = cd71Var.f36824a;
                ArrayList<pqm0> arrayList9 = cd71Var.f36825b;
                ArrayList arrayList10 = new ArrayList(i6f.m49804T(arrayList9, 10));
                for (pqm0 pqm0Var4 : arrayList9) {
                    a171 a171Var4 = (a171) pqm0Var4.f180350a;
                    Set set4 = (Set) pqm0Var4.f180351b;
                    rc71 rc71Var4 = rc71.f197783c;
                    Rect rect3 = (Rect) a171Var4.f226862c;
                    arrayList10.add(new pqm0(a171Var4, s601.m77308k0(new sc71(rc71Var4, rect3 != null ? 1.0f - (rect3.top / cw40Var4.f42638e) : 0.0f), set4)));
                }
                return new cd71(cw40Var4, arrayList10);
            default:
                cw40 cw40Var5 = cd71Var.f36824a;
                ArrayList<pqm0> arrayList11 = cd71Var.f36825b;
                ArrayList arrayList12 = new ArrayList(i6f.m49804T(arrayList11, 10));
                for (pqm0 pqm0Var5 : arrayList11) {
                    a171 a171Var5 = (a171) pqm0Var5.f180350a;
                    Set set5 = (Set) pqm0Var5.f180351b;
                    rc71 rc71Var5 = rc71.f197785e;
                    synchronized (a171Var5) {
                        abstractList3 = a171Var5.f11350e;
                    }
                    ArrayList arrayList13 = new ArrayList();
                    for (y071 y071Var2 : abstractList3) {
                        synchronized (y071Var2) {
                            abstractList4 = y071Var2.f267925e;
                        }
                        j6f.m52564V(abstractList4, arrayList13);
                    }
                    arrayList12.add(new pqm0(a171Var5, s601.m77308k0(new sc71(rc71Var5, Math.min(1.0f, arrayList13.size() / 10.0f)), set5)));
                }
                return new cd71(cw40Var5, arrayList12);
        }
    }
}
