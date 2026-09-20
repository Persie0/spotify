package p204p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class e1r0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55243a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ h1r0 f55244b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c7x0 f55245c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1r0(h1r0 h1r0Var, c7x0 c7x0Var, int i) {
        super(0);
        this.f55243a = i;
        this.f55244b = h1r0Var;
        this.f55245c = c7x0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p204p.eh00
    public final Object invoke() {
        lcm lcmVar;
        int i;
        joo jooVar;
        int i2;
        jmi hmiVar;
        String str;
        switch (this.f55243a) {
            case 0:
                if (this.f55245c.equals(b6x0.f24069a)) {
                    h1r0 h1r0Var = this.f55244b;
                    icm icmVar = h1r0Var.f86685a.f149498t;
                    if (icmVar != null) {
                        h1r0Var.f86688d.mo25060a(icmVar, null);
                    }
                }
                return w2a1.f247311a;
            default:
                c7x0 c7x0Var = this.f55245c;
                n6x0 n6x0Var = c7x0Var instanceof n6x0 ? (n6x0) c7x0Var : null;
                if (n6x0Var != null && (lcmVar = (lcm) n6x0Var.f150980a) != null) {
                    LinkedHashMap linkedHashMap = lcmVar.f131952a;
                    h1r0 h1r0Var2 = this.f55244b;
                    n1r0 n1r0Var = h1r0Var2.f86685a;
                    icm icmVar2 = n1r0Var.f149498t;
                    if (icmVar2 == null) {
                        throw new IllegalStateException("Customization completed without an active session");
                    }
                    List<x151> list = icmVar2.f100843b;
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        linkedHashSet.add(new c251(((x151) it.next()).f257068a));
                    }
                    if (linkedHashSet.size() != list.size()) {
                        throw new IllegalArgumentException("Customization plan must contain unique step keys");
                    }
                    Set setM77305h0 = s601.m77305h0(linkedHashMap.keySet(), linkedHashSet);
                    if (!setM77305h0.isEmpty()) {
                        throw new IllegalArgumentException(edb.m38564m("Results contain unknown step keys: ", g6f.m43753y0(setM77305h0, null, null, null, hn41.f93195S0, 31)).toString());
                    }
                    ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                    for (x151 x151Var : list) {
                        String str2 = x151Var.f257068a;
                        String str3 = x151Var.f257068a;
                        d251 d251Var = x151Var.f257069b;
                        f251 f251Var = (f251) linkedHashMap.get(new c251(str2));
                        if (f251Var != null && !d251Var.mo34688c1(f251Var)) {
                            throw new IllegalArgumentException(edb.m38566o("Unexpected result ", f251Var.getClass().getName(), " for step ", str3).toString());
                        }
                        arrayList.add(new x151(str3, d251Var, f251Var, x151Var.f257071d));
                    }
                    String str4 = icmVar2.f100842a;
                    d6l d6lVar = icmVar2.f100844c;
                    n1r0Var.f149498t = new icm(str4, arrayList, d6lVar);
                    p7x0 p7x0Var = h1r0Var2.f86689e;
                    String str5 = d6lVar.f45719a;
                    e6l e6lVar = lcmVar.f131953b;
                    Collection collectionValues = linkedHashMap.values();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : collectionValues) {
                        if (obj instanceof bma0) {
                            arrayList2.add(obj);
                        }
                    }
                    bma0 bma0Var = (bma0) g6f.m43745s0(arrayList2);
                    String str6 = (bma0Var == null || (str = bma0Var.f28481a) == null || wl51.m88460J0(str)) ? null : str;
                    String str7 = e6lVar.f56655a;
                    e4r0 e4r0Var = e6lVar.f56656b;
                    dmi dmiVar = new dmi(e4r0Var.f56168a, e4r0Var.f56169b);
                    ArrayList<lo11> arrayList3 = e6lVar.f56657c;
                    ArrayList arrayList4 = new ArrayList(i6f.m49804T(arrayList3, 10));
                    for (lo11 lo11Var : arrayList3) {
                        if (lo11Var instanceof ko11) {
                            hmiVar = new imi(((ko11) lo11Var).f124500a);
                        } else {
                            if (!(lo11Var instanceof jo11)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            jo11 jo11Var = (jo11) lo11Var;
                            hmiVar = new hmi(jo11Var.f114269a, jo11Var.f114272d, jo11Var.f114270b, jo11Var.f114271c);
                        }
                        arrayList4.add(new gmi(hmiVar));
                    }
                    dsc1 dsc1Var = e6lVar.f56658d;
                    kmi kmiVar = new kmi(dsc1Var.f52536a, dsc1Var.f52537b);
                    ney0 ney0Var = e6lVar.f56659e;
                    int i3 = ney0Var != null ? ney0Var.f153157a : 0;
                    int i4 = i3 == 0 ? -1 : uni.f232175a[edb.m38547C(i3)];
                    int i5 = 3;
                    if (i4 == -1) {
                        i = 1;
                    } else if (i4 == 1) {
                        i = 2;
                    } else if (i4 == 2) {
                        i = 3;
                    } else if (i4 != 3) {
                        if (i4 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = 1;
                    } else {
                        i = 4;
                    }
                    if (ney0Var == null || (jooVar = ney0Var.f153158b) == null) {
                        i5 = 0;
                    } else {
                        switch (jooVar.ordinal()) {
                            case 0:
                                i5 = 1;
                                break;
                            case 1:
                                i5 = 2;
                                break;
                            case 2:
                                break;
                            case 3:
                                i5 = 4;
                                break;
                            case 4:
                                i2 = 5;
                                i5 = i2;
                                break;
                            case 5:
                                i2 = 6;
                                i5 = i2;
                                break;
                            case 6:
                                i2 = 7;
                                i5 = i2;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    }
                    fmi fmiVar = new fmi(i, i5);
                    boolean z = e6lVar.f56660f;
                    ArrayList<ogv0> arrayList5 = e6lVar.f56661g;
                    ArrayList arrayList6 = new ArrayList(i6f.m49804T(arrayList5, 10));
                    for (ogv0 ogv0Var : arrayList5) {
                        arrayList6.add(new emi(ogv0Var.f165278a, ogv0Var.f165279b, ogv0Var.f165282e, ogv0Var.f165280c));
                        z = z;
                    }
                    p7x0Var.mo25060a(new cmi(str7, dmiVar, arrayList4, kmiVar, fmiVar, null, str5, z, arrayList6, e6lVar.f56662h, e6lVar.f56663i, str6, 8736), null);
                }
                return w2a1.f247311a;
        }
    }
}
