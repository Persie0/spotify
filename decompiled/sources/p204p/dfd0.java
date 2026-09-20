package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public final class dfd0 {

    /* JADX INFO: renamed from: a */
    public final List f48577a;

    public dfd0(List list) {
        this.f48577a = list;
    }

    /* JADX INFO: renamed from: a */
    public List m35880a(UUID uuid) {
        egz egzVarM30484H = btz0.m30484H(new cfd0(this, uuid), btz0.m30491O(bfd0.f26687b, new ek5(new afd0(this, null))));
        lxr lxrVar = new lxr(new dgz(egzVarM30484H), bfd0.f26689c);
        if (!lxrVar.hasNext()) {
            return lau.f131415a;
        }
        Object next = lxrVar.next();
        if (!lxrVar.hasNext()) {
            return Collections.singletonList(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (lxrVar.hasNext()) {
            arrayList.add(lxrVar.next());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public List m35881b() {
        lf81 lf81Var;
        Object c6x0Var;
        ArrayList arrayList = new ArrayList();
        for (bkc0 bkc0Var : this.f48577a) {
            ArrayList arrayList2 = new ArrayList();
            int i = bkc0Var.f27898a;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    lf81Var = null;
                    break;
                }
                if (bkc0Var.f27899b[i2] == 1) {
                    lf81Var = bkc0Var.f27900c[i2];
                    break;
                }
                i2++;
            }
            if (lf81Var != null) {
                int i3 = lf81Var.f132853a;
                for (int i4 = 0; i4 < i3; i4++) {
                    kf81 kf81VarM58848a = lf81Var.m58848a(i4);
                    int i5 = kf81VarM58848a.f122099a;
                    for (int i6 = 0; i6 < i5; i6++) {
                        r300 r300Var = kf81VarM58848a.f122102d[i6];
                        String str = r300Var.f195375d;
                        if (str != null) {
                            try {
                                c6x0Var = Locale.forLanguageTag(str);
                            } catch (Throwable th) {
                                c6x0Var = new c6x0(th);
                            }
                            if (c6x0Var instanceof c6x0) {
                                c6x0Var = null;
                            }
                            Locale locale = (Locale) c6x0Var;
                            if (locale != null) {
                                arrayList2.add(new by6(locale, (r300Var.f195377f & 1) != 0));
                            }
                        }
                    }
                }
            }
            j6f.m52564V(arrayList2, arrayList);
        }
        return g6f.m43727j0(arrayList);
    }

    /* JADX INFO: renamed from: c */
    public ArrayList m35882c() {
        lf81 lf81Var;
        ArrayList arrayList = new ArrayList();
        for (bkc0 bkc0Var : this.f48577a) {
            int i = bkc0Var.f27898a;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    lf81Var = null;
                    break;
                }
                if (bkc0Var.f27899b[i2] == 3) {
                    lf81Var = bkc0Var.f27900c[i2];
                    break;
                }
                i2++;
            }
            if (lf81Var != null) {
                int i3 = lf81Var.f132853a;
                for (int i4 = 0; i4 < i3; i4++) {
                    kf81 kf81VarM58848a = lf81Var.m58848a(i4);
                    int i5 = kf81VarM58848a.f122099a;
                    for (int i6 = 0; i6 < i5; i6++) {
                        arrayList.add(kf81VarM58848a.f122102d[i6]);
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            fv51 fv51VarM32722t = cgg1.m32722t((r300) it.next());
            if (fv51VarM32722t != null) {
                arrayList2.add(fv51VarM32722t);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: d */
    public r300 m35883d() {
        Object obj = null;
        vsz0 vsz0VarM43277s = g0b1.m43277s(new afd0(this, null));
        while (vsz0VarM43277s.hasNext()) {
            Object next = vsz0VarM43277s.next();
            if (((r300) next).f195391t != null) {
                obj = next;
                break;
            }
        }
        return (r300) obj;
    }

    /* JADX INFO: renamed from: e */
    public List m35884e() {
        List listM35880a = m35880a(khs.f122717b);
        return listM35880a.isEmpty() ? m35880a(khs.f122716a) : listM35880a;
    }

    public dfd0(sz11 sz11Var, nvd nvdVar, it71 it71Var, ite1 ite1Var, nvd nvdVar2, s82 s82Var, nvd nvdVar3, gx61 gx61Var, eb90 eb90Var, nvd nvdVar4, pwn pwnVar, eb90 eb90Var2) {
        pwnVar = sz11Var.m79719a() != 1 ? null : pwnVar;
        this.f48577a = bk5.m29582E0(new by11[]{pwnVar != null ? (C2313qt) pwnVar.get() : null, ite1Var, it71Var, nvdVar2, gx61Var, eb90Var, nvdVar3, eb90Var2, nvdVar, s82Var, nvdVar4});
    }
}
