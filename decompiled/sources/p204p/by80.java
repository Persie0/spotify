package p204p;

import android.os.Parcelable;
import com.spotify.mobius.Effects;
import com.spotify.mobius.First;
import com.spotify.mobius.Update;
import com.spotify.mobius.extras.patterns.InnerEffectHandlers;
import com.spotify.mobius.extras.patterns.InnerUpdate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public abstract class by80 {
    /* JADX INFO: renamed from: a */
    public static final First m30876a(jz80 jz80Var) {
        b450 b450VarM30878c;
        int i = jz80Var.f117621d;
        h5u0 h5u0Var = jz80Var.f117619b;
        if (h5u0Var.f87906a.isEmpty()) {
            b450VarM30878c = n0e1.m63417Y(0, i);
        } else {
            Parcelable parcelable = jz80Var.f117620c;
            b450VarM30878c = m30878c(i, parcelable instanceof i6a0 ? ((i6a0) parcelable).mo27292j() : 0, h5u0Var.f87906a);
        }
        jz80 jz80VarM54849c = jz80.m54849c(jz80Var, null, h5u0.m46698c(h5u0Var, null, b450VarM30878c, 0, 5), null, null, 61);
        return First.m15575c(jz80VarM54849c, Effects.m15571a(eem.m38695z(jz80VarM54849c, null)));
    }

    /* JADX INFO: renamed from: b */
    public static Update m30877b() {
        xx80 xx80Var = xx80.f266901h;
        InnerUpdate.Builder builderM15645b = InnerUpdate.m15645b();
        builderM15645b.mo15639b(new eap(yx80.f277175h, 1));
        builderM15645b.mo15642e(new eap(zx80.f287241h, 1));
        builderM15645b.mo15643f(maz.f141747i);
        builderM15645b.mo15641d(new eaq(14));
        builderM15645b.mo15640c(InnerEffectHandlers.m15644a(cyx.f43400t));
        return builderM15645b.mo15638a();
    }

    /* JADX INFO: renamed from: c */
    public static final b450 m30878c(int i, int i2, b450 b450Var) {
        int i3 = b450Var.f278779b;
        int i4 = b450Var.f278778a;
        int i5 = i - ((i3 - i4) + 1);
        if (i5 <= 0) {
            return b450Var;
        }
        int iMax = Math.max(0, i4 - (i5 / 2));
        int i6 = iMax > i2 ? iMax : 0;
        return n0e1.m63417Y(i6, i3 + (i5 - (i4 - i6)) + 1);
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: d */
    public static final zq80 m30879d(jz80 jz80Var) {
        ckp0 ckp0Var;
        b450 b450Var = jz80Var.f117619b.f87906a;
        dw50 dw50Var = jz80Var.f117620c;
        if (!(dw50Var instanceof i6a0)) {
            dw50Var = null;
        }
        boolean zIsEmpty = b450Var.isEmpty();
        int i = b450Var.f278778a;
        int i2 = b450Var.f278779b;
        if (!zIsEmpty && dw50Var != null) {
            i6a0 i6a0Var = (i6a0) dw50Var;
            if (!i6a0Var.mo27290g().isEmpty() && i6a0Var.mo27290g().m28070a(i) && i6a0Var.mo27290g().m28070a(i2)) {
                int i3 = i2 + 1;
                if (i6a0Var.mo27290g().m28070a(i3)) {
                    b450Var = new b450(i, i3, 1);
                }
                a7z a7zVarM30480D = btz0.m30480D(ay80.f21153b, btz0.m30480D(lg80.f133134c1, new j691(new da70(dw50Var, 25), new ek5(b450Var, 1))));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = a7zVarM30480D.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(((bpe1) it.next()).f29424a);
                }
                List listMo27291h = i6a0Var.mo27291h();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listMo27291h) {
                    if (((bpe1) obj).f29428e == jev.f111679t) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    bpe1 bpe1Var = (bpe1) obj2;
                    if (wj50.m88271j(bpe1.f29423i.get(bpe1Var.f29428e), ckp0.class)) {
                        n4y n4yVar = bpe1Var.f29430g;
                        if (n4yVar == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.spotify.yourlibrary.yourlibraryx.shared.domain.PlaylistExtraInfo");
                        }
                        ckp0Var = (ckp0) n4yVar;
                    } else {
                        ckp0Var = null;
                    }
                    if (ckp0Var != null && ckp0Var.f39067d && ckp0Var.f39066c) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(i6f.m49804T(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((bpe1) it2.next()).f29424a);
                }
                linkedHashSet.addAll(arrayList3);
                return new zq80(linkedHashSet);
            }
        }
        return new zq80(gbu.f78413a);
    }

    /* JADX INFO: renamed from: e */
    public static final List m30880e(List list, List list2) {
        Object next;
        if (list.isEmpty() || list2.isEmpty()) {
            return lau.f131415a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            k980 k980Var = (k980) it.next();
            Iterator it2 = list2.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (((k980) next).getClass() != k980Var.getClass());
            k980 k980Var2 = (k980) next;
            if (k980Var2 == null) {
                break;
            }
            arrayList.add(k980Var);
            list2 = k980Var2.mo25080c();
        }
        return g6f.m43728j1(arrayList);
    }
}
