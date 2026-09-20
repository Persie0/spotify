package p204p;

import android.content.res.Resources;
import android.os.Parcelable;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes11.dex */
public final class jt70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f115753a;

    /* JADX INFO: renamed from: b */
    public Object f115754b;

    public /* synthetic */ jt70() {
        this.f115753a = 11;
    }

    /* JADX INFO: renamed from: a */
    public static ArrayList m54271a(String str, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            bcc0 bcc0Var = (bcc0) obj;
            boolean zM88496t0 = true;
            if (str.length() != 0) {
                g5r g5rVar = bcc0Var.f25831a;
                zM88496t0 = wl51.m88496t0(g5rVar.f76727b + " " + g5rVar.f76728c, str, true);
            }
            if (zM88496t0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public iec0 m54272e(vdc0 vdc0Var) {
        String string;
        List list = vdc0Var.f240384h;
        ejg1 ejg1Var = vdc0Var.f240383g;
        if (ejg1Var instanceof pim0) {
            ArrayList arrayListM54271a = m54271a(((pim0) ejg1Var).f177985c, list);
            ArrayList arrayList = new ArrayList(i6f.m49804T(arrayListM54271a, 10));
            Iterator it = arrayListM54271a.iterator();
            while (it.hasNext()) {
                g5r g5rVar = ((bcc0) it.next()).f25831a;
                arrayList.add(new hy31(g5rVar.f76726a, g5rVar.f76727b, g5rVar.f76728c));
            }
            return new hec0(arrayList);
        }
        if (!(ejg1Var instanceof xhm0)) {
            if (ejg1Var instanceof cim0) {
                return new eec0();
            }
            if (ejg1Var instanceof fim0) {
                khw khwVar = new khw(edc0.f58499a);
                ycc0 ycc0Var = ycc0.f271457a;
                return new fec0(new lhw(R.string.puffin_headphones_optimization_error_message, ycc0Var, khwVar, new khw(ycc0Var)));
            }
            if (wj50.m88271j(ejg1Var, yhm0.f272923c)) {
                return new gec0();
            }
            throw new NoWhenBranchMatchedException();
        }
        String str = vdc0Var.f240381e;
        wj50.m88279p(str);
        boolean z = vdc0Var.f240382f;
        String str2 = ((xhm0) ejg1Var).f261675c;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (wl51.m88496t0(((bcc0) obj).f25831a.f76728c, str, true)) {
                arrayList2.add(obj);
            }
        }
        ArrayList<bcc0> arrayListM54271a2 = m54271a(str2, arrayList2);
        ArrayList arrayList3 = new ArrayList(i6f.m49804T(arrayListM54271a2, 10));
        for (bcc0 bcc0Var : arrayListM54271a2) {
            Resources resources = (Resources) ((kca) this.f115754b).f121418b;
            g5r g5rVar2 = bcc0Var.f25831a;
            String str3 = g5rVar2.f76726a;
            List list2 = g5rVar2.f76730e;
            String string2 = g5rVar2.f76728c;
            String str4 = g5rVar2.f76731f;
            if (str4 != null && str4.length() != 0) {
                string2 = resources.getString(R.string.puffin_ambiguous_device_select_name_format, Arrays.copyOf(new Object[]{string2, str4}, 2));
            }
            if (list2 == null || list2.isEmpty()) {
                string = g5rVar2.f76727b;
            } else {
                string = resources.getString(R.string.puffin_ambiguous_device_select_model_format, Arrays.copyOf(new Object[]{g6f.m43753y0(list2, null, null, null, null, 63)}, 1));
                string2 = string2;
            }
            arrayList3.add(new cp3(str3, string2, string));
        }
        return new dec0(str, arrayList3, z);
    }

    /* JADX INFO: renamed from: f */
    public void m54273f(q6q0 q6q0Var) {
        this.f115754b = q6q0Var;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x019f  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b9  */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, p.fr70] */
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        Object next;
        boolean zEquals;
        ho91 ho91VarM66864e;
        int i = this.f115753a;
        boolean z = false;
        int i2 = 1;
        w2a1 w2a1Var = w2a1.f247311a;
        switch (i) {
            case 0:
                kt70 kt70Var = (kt70) this.f115754b;
                qti0 qti0Var = xc60.f260104a;
                return xc60.m90357b(kt70Var.f126170a, (cov0) obj, kt70Var.f126172c);
            case 1:
                mt70 mt70Var = (mt70) this.f115754b;
                return new qt70(mt70Var.f146980t, mt70Var, mt70Var.f146978h, mt70Var.f146979i != null, mt70Var.f146968O0);
            case 2:
                return ((bfe0) obj).mo27568a((qti0) this.f115754b, pkj0.f178478e);
            case 3:
                hr81 hr81Var = (hr81) this.f115754b;
                zov0 zov0Var = (zov0) obj;
                LinkedHashMap linkedHashMap = (LinkedHashMap) hr81Var.f94378e;
                qqo qqoVar = (qqo) hr81Var.f94377d;
                Integer num = (Integer) linkedHashMap.get(zov0Var);
                if (num == null) {
                    return null;
                }
                int iIntValue = num.intValue();
                z9t z9tVar = (z9t) hr81Var.f94376c;
                return new hu70(f2h1.m40596k(new z9t((qwm) z9tVar.f280873b, hr81Var, (fr70) z9tVar.f280875d), qqoVar.getAnnotations()), zov0Var, hr81Var.f94375b + iIntValue, qqoVar);
            case 4:
                return m54272e((vdc0) obj);
            case 5:
                nxh0 nxh0Var = (nxh0) this.f115754b;
                w3m0 w3m0Var = nxh0Var.f159478g;
                bna0 bna0Var = nxh0Var.f159475d;
                w3m0Var.getClass();
                return new ex70(nxh0Var, (y400) obj, bna0Var);
            case 6:
                a5j0 a5j0Var = (a5j0) this.f115754b;
                y400 y400Var = (y400) obj;
                wj50.m88279p(y400Var);
                ?? r13 = a5j0Var.f12529b;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : r13.entrySet()) {
                    y400 y400Var2 = (y400) entry.getKey();
                    if (!y400Var.equals(y400Var2)) {
                        if (wj50.m88271j(y400Var.f269048a.m95303c() ? null : y400Var.m92786b(), y400Var2)) {
                        }
                    }
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
                if (linkedHashMap2.isEmpty()) {
                    linkedHashMap2 = null;
                }
                if (linkedHashMap2 == null) {
                    return null;
                }
                Iterator it = linkedHashMap2.entrySet().iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        int length = lfg1.m58877F((y400) ((Map.Entry) next).getKey(), y400Var).f269048a.f279080a.length();
                        do {
                            Object next2 = it.next();
                            int length2 = lfg1.m58877F((y400) ((Map.Entry) next2).getKey(), y400Var).f269048a.f279080a.length();
                            if (length > length2) {
                                next = next2;
                                length = length2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                Map.Entry entry2 = (Map.Entry) next;
                if (entry2 != null) {
                    return entry2.getValue();
                }
                return null;
            case 7:
                jp20 jp20Var = (jp20) obj;
                if (!(jp20Var instanceof hp20)) {
                    if (jp20Var instanceof ip20) {
                        return Observable.just(Boolean.FALSE);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                hv31 hv31Var = ((anp) this.f115754b).f17479a;
                fv31 fv31Var = x5a1.f258362a;
                Set setMo48707b = hv31Var.mo48707b(fv31Var, gbu.f78413a);
                wj50.m88279p(setMo48707b);
                return k0e1.m54988g(((mv31) hv31Var).m62899t(fv31Var), dau.f47107a).startWithItem(new gv31(1, setMo48707b)).map(new bc21((hp20) jp20Var, 22)).distinctUntilChanged();
            case 8:
                zw21 zw21Var = (zw21) this.f115754b;
                wj50.m88279p(obj);
                zw21Var.add(obj);
                return w2a1Var;
            case 9:
                ((hqb) this.f115754b).resumeWith(w2a1Var);
                return w2a1Var;
            case 10:
                mov0 mov0Var = (mov0) this.f115754b;
                Method method = (Method) obj;
                if (!method.isSynthetic()) {
                    if (mov0Var.f145760b.isEnum()) {
                        String name = method.getName();
                        if (wj50.m88271j(name, "values")) {
                            if (method.getParameterTypes().length == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (wj50.m88271j(name, "valueOf")) {
                            zEquals = Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
                        } else {
                            zEquals = false;
                        }
                        if (!zEquals) {
                            z = true;
                        }
                    } else {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 11:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                q6q0 q6q0Var = (q6q0) this.f115754b;
                if (q6q0Var != null) {
                    q6q0Var.f185906c = zBooleanValue;
                }
                return w2a1Var;
            case 12:
                String str = (String) obj;
                return ((x0q0) this.f115754b).m89601a(Collections.singletonList(str), new u0q0(Collections.singletonMap("mediaTypeEnum", Boolean.TRUE), null, null, null, null, 247)).map(new vah1(str, 20)).onErrorReturnItem(yzv.f277906d);
            case 13:
                ((Disposable) this.f115754b).dispose();
                return w2a1Var;
            case 14:
                ph3 ph3Var = (ph3) obj;
                List listM90107a = ((x6z0) this.f115754b).m90107a(ph3Var);
                Parcelable parcelable = ph3Var.f177454b.f117620c;
                if ((parcelable instanceof i6a0) && (((i6a0) parcelable).getCount() > 0 || !listM90107a.isEmpty())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 15:
                return ((s3b1) ((eab) obj).mo32015K().get(((s3b1) this.f115754b).f205256g)).getType();
            case 16:
                float[] fArr = ((r3d0) obj).f195487a;
                jo70 jo70Var = (jo70) this.f115754b;
                if (jo70Var.mo30016a()) {
                    pwg1.m71280o(jo70Var).mo30008N(jo70Var, fArr);
                }
                return w2a1Var;
            case 17:
                ae41 ae41Var = (ae41) this.f115754b;
                go91 go91Var = (go91) obj;
                bo91 bo91Var = go91Var.f82918a;
                be60 be60Var = go91Var.f82919b;
                Set set = be60Var.f26289e;
                if (set != null && set.contains(bo91Var.mo27377a())) {
                    return ae41Var.m25675q(be60Var);
                }
                jd21 jd21VarMo27380q = bo91Var.mo27380q();
                LinkedHashSet<bo91> linkedHashSet = new LinkedHashSet();
                tw41.m81636j(jd21VarMo27380q, jd21VarMo27380q, linkedHashSet, set);
                int iM31820L = c95.m31820L(i6f.m49804T(linkedHashSet, 10));
                if (iM31820L < 16) {
                    iM31820L = 16;
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iM31820L);
                for (bo91 bo91Var2 : linkedHashSet) {
                    if (set == null || !set.contains(bo91Var2)) {
                        Set set2 = be60Var.f26289e;
                        ho91VarM66864e = og6.m66864e(bo91Var2, be60Var, ae41Var.m25676r(bo91Var2, be60.m28907a(be60Var, 0, false, set2 != null ? s601.m77308k0(bo91Var, set2) : Collections.singleton(bo91Var), null, 47)));
                    } else {
                        ho91VarM66864e = so91.m78640k(bo91Var2, be60Var);
                    }
                    linkedHashMap3.put(bo91Var2.mo27378k(), ho91VarM66864e);
                }
                x401 x401VarM25656A = ae41Var.m25656A(new oo91(new uo41(linkedHashMap3, i2)), bo91Var.getUpperBounds(), be60Var);
                if (x401VarM25656A.f257925a.isEmpty()) {
                    return ae41Var.m25675q(be60Var);
                }
                if (x401VarM25656A.f257925a.f142675i == 1) {
                    return (gd70) g6f.m43705S0(x401VarM25656A);
                }
                throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds");
            case 18:
                return (gd70) this.f115754b;
            default:
                ((UrlRequest) this.f115754b).cancel();
                return w2a1Var;
        }
    }

    public /* synthetic */ jt70(Object obj, int i) {
        this.f115753a = i;
        this.f115754b = obj;
    }
}
