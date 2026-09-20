package p204p;

import android.app.Application;
import com.google.android.recaptcha.internal.zzhg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;

/* JADX INFO: loaded from: classes4.dex */
public final class q6g1 extends sof1 {

    /* JADX INFO: renamed from: b */
    public final Application f185804b;

    /* JADX INFO: renamed from: c */
    public final vaa1 f185805c;

    /* JADX INFO: renamed from: d */
    public final c4d1 f185806d;

    /* JADX INFO: renamed from: e */
    public final sef0 f185807e;

    /* JADX INFO: renamed from: f */
    public ihk0 f185808f;

    /* JADX INFO: renamed from: h */
    public List f185810h;

    /* JADX INFO: renamed from: i */
    public pjq f185811i;

    /* JADX INFO: renamed from: j */
    public gef1 f185812j;

    /* JADX INFO: renamed from: k */
    public final qp4 f185813k;

    /* JADX INFO: renamed from: m */
    public boolean f185815m;

    /* JADX INFO: renamed from: n */
    public final cha0 f185816n;

    /* JADX INFO: renamed from: o */
    public final w7g1 f185817o;

    /* JADX INFO: renamed from: p */
    public final okj0 f185818p;

    /* JADX INFO: renamed from: g */
    public final HashMap f185809g = new HashMap();

    /* JADX INFO: renamed from: l */
    public final lsi0 f185814l = msi0.m62770a();

    public q6g1(Application application, okj0 okj0Var, bxd1 bxd1Var, w7g1 w7g1Var, vaa1 vaa1Var, cha0 cha0Var, c4d1 c4d1Var, sef0 sef0Var) {
        this.f185804b = application;
        this.f185818p = okj0Var;
        this.f185817o = w7g1Var;
        this.f185805c = vaa1Var;
        this.f185816n = cha0Var;
        this.f185806d = c4d1Var;
        this.f185807e = sef0Var;
        this.f185813k = new qp4(application, (c9k) okj0Var.f166381b, new c4d1(12));
    }

    /* JADX INFO: renamed from: g */
    public static final tef1 m72226g(String str, qff1 qff1Var) {
        sef1 sef1VarM80528w = tef1.m80528w();
        sef1VarM80528w.m77906i(str);
        oef1 oef1VarM69723w = pef1.m69723w();
        oef1VarM69723w.m52811c();
        ((pef1) oef1VarM69723w.f110458b).m69724x(qff1Var);
        sef1VarM80528w.m52811c();
        ((tef1) sef1VarM80528w.f110458b).m80532C((pef1) oef1VarM69723w.m52814g());
        return (tef1) sef1VarM80528w.m52814g();
    }

    /* JADX INFO: renamed from: h */
    public static final void m72227h(q6g1 q6g1Var, kff1 kff1Var) {
        try {
            ihk0 ihk0Var = (ihk0) q6g1Var.f185805c.f239173b;
            q6g1Var.f185808f = ihk0Var;
            byte[] bArrM77584y = kff1Var.m56266w().m77584y();
            ((yff1) ihk0Var.f102314c).f272233c.f215890c = h6h1.m46724e(bArrM77584y);
            ihk0 ihk0Var2 = q6g1Var.f185808f;
            if (ihk0Var2 == null) {
                ihk0Var2 = null;
            }
            ihk0Var2.m50658n();
        } catch (Exception e) {
            throw new zzhg(zz11.f287823d2, zz11.f287777H1, e.getMessage(), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: i */
    public static final Object m72228i(q6g1 q6g1Var, ibk ibkVar) {
        i4g1 i4g1Var;
        zz11 zz11Var = zz11.f287778I1;
        zz11 zz11Var2 = zz11.f287823d2;
        if (ibkVar instanceof i4g1) {
            i4g1Var = (i4g1) ibkVar;
            int i = i4g1Var.f98527c;
            if ((i & Integer.MIN_VALUE) != 0) {
                i4g1Var.f98527c = i - Integer.MIN_VALUE;
            } else {
                i4g1Var = new i4g1(q6g1Var, ibkVar);
            }
        } else {
            i4g1Var = new i4g1(q6g1Var, ibkVar);
        }
        Object objM38777P = i4g1Var.f98525a;
        int i2 = i4g1Var.f98527c;
        String str = null;
        try {
            if (i2 == 0) {
                bga.m29073P(objM38777P);
                pjq pjqVarM72236f = q6g1Var.m72236f(null, Optional.empty());
                i4g1Var.f98527c = 1;
                objM38777P = pjqVarM72236f.m38777P(i4g1Var);
                yuk yukVar = yuk.f276404a;
                if (objM38777P == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM38777P);
            }
            Object obj = ((s6x0) objM38777P).f206218a;
            bga.m29073P(obj);
            List list = obj instanceof List ? (List) obj : null;
            if (list == null || list.size() < 2) {
                throw new zzhg(zz11Var2, zz11Var, str, 12);
            }
            return list;
        } catch (Exception e) {
            throw new zzhg(zz11Var2, zz11Var, e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m72229j(q6g1 q6g1Var, fog1 fog1Var) {
        HashMap map = q6g1Var.f185809g;
        Application application = q6g1Var.f185804b;
        map.put(120, application);
        map.put(416, "18.9.2");
        map.put(518, fog1Var.f71533d);
        map.put(620, vaa1.m85039u());
        map.put(722, fog1Var.f71532c);
        cha0 cha0Var = q6g1Var.f185816n;
        map.put(824, Integer.valueOf(cha0Var.m32761k() - 2));
        map.put(926, application.getPackageName());
        map.put(1028, Boolean.valueOf(cha0Var.m32758h()));
        map.put(1130, Boolean.valueOf(cha0Var.m32759i()));
        map.put(1232, cha0Var.m32760j());
        map.put(2044, s3g1.class.getMethod("zzb", new Object[0].getClass()));
        qp4 qp4Var = q6g1Var.f185813k;
        j3g1 j3g1Var = new j3g1(qp4Var, 1);
        j3g1 j3g1Var2 = new j3g1(qp4Var, 2);
        j3g1 j3g1Var3 = new j3g1(qp4Var, 0);
        for (s3g1 s3g1Var : h6f.m46715L(j3g1Var, j3g1Var2, j3g1Var3)) {
            Object[] objArr = {new w3g1()};
            s3g1Var.getClass();
            Object objMo52262a = !(objArr[0] instanceof w3g1) ? s3g1Var.mo52262a(Arrays.copyOf(objArr, 1)) : Boolean.TRUE;
            if (!(objMo52262a instanceof Boolean) || !((Boolean) objMo52262a).booleanValue()) {
                throw new zzhg(zz11.f287823d2, zz11.f287815a2, (String) null, 12);
            }
        }
        map.put(3335, j3g1Var);
        map.put(3576, j3g1Var2);
        map.put(3809, j3g1Var3);
    }

    /* JADX INFO: renamed from: k */
    public static final void m72230k(q6g1 q6g1Var, log1 log1Var) {
        ArrayList arrayList;
        Object next;
        Object next2;
        Object obj = q6g1Var.f185809g.get(314);
        List list = obj instanceof List ? (List) obj : null;
        if (list != null) {
            arrayList = new ArrayList(i6f.m49804T(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(lff1.m58865z((byte[]) it.next()));
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : arrayList) {
                Long lValueOf = Long.valueOf(((lff1) obj2).m58869w());
                Object arrayList2 = linkedHashMap.get(lValueOf);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(lValueOf, arrayList2);
                }
                ((List) arrayList2).add(obj2);
            }
            for (List list2 : linkedHashMap.values()) {
                Iterator it2 = list2.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (((lff1) next).m58866A() != 3);
                lff1 lff1Var = (lff1) next;
                Iterator it3 = list2.iterator();
                do {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                } while (((lff1) next2).m58866A() != 4);
                lff1 lff1Var2 = (lff1) next2;
                if (lff1Var != null && lff1Var2 != null) {
                    int iM58867B = lff1Var.m58867B() - 2;
                    int i = iM58867B != 1 ? iM58867B != 2 ? 2 : 46 : 47;
                    idf1 idf1VarM53021A = jdf1.m53021A();
                    long jM58871y = lff1Var2.m58871y() - lff1Var.m58871y();
                    idf1VarM53021A.m52811c();
                    ((jdf1) idf1VarM53021A.f110458b).m53033M(i);
                    String str = cmg1.f39668d;
                    idf1VarM53021A.m52811c();
                    ((jdf1) idf1VarM53021A.f110458b).m53023C(str);
                    String str2 = log1Var.f135428d;
                    fog1 fog1Var = log1Var.f135427c;
                    idf1VarM53021A.m52811c();
                    ((jdf1) idf1VarM53021A.f110458b).m53025E(str2);
                    String str3 = fog1Var.f71533d;
                    idf1VarM53021A.m52811c();
                    ((jdf1) idf1VarM53021A.f110458b).m53024D(str3);
                    int i2 = fog1Var.f71534e;
                    idf1VarM53021A.m52811c();
                    ((jdf1) idf1VarM53021A.f110458b).m53034N(i2);
                    int iM58870x = lff1Var.m58870x();
                    idf1VarM53021A.m52811c();
                    ((jdf1) idf1VarM53021A.f110458b).m53031K(iM58870x);
                    int iM58868C = lff1Var2.m58868C() - 2;
                    int i3 = iM58868C != 1 ? iM58868C != 2 ? 2 : 4 : 3;
                    idf1VarM53021A.m52811c();
                    ((jdf1) idf1VarM53021A.f110458b).m53036x(i3);
                    long jM58871y2 = lff1Var.m58871y();
                    ybf1 ybf1VarM64135b = ncf1.m64135b((int) (jM58871y2 % 1000000000), jM58871y2 / 1000000000);
                    idf1VarM53021A.m52811c();
                    ((jdf1) idf1VarM53021A.f110458b).m53029I(ybf1VarM64135b);
                    gaf1 gaf1VarM61462c = mcf1.m61462c((int) (jM58871y % 1000000000), jM58871y / 1000000000);
                    idf1VarM53021A.m52811c();
                    ((jdf1) idf1VarM53021A.f110458b).m53026F(gaf1VarM61462c);
                    log1Var.m59567c(idf1VarM53021A, null);
                }
            }
        }
    }

    @Override // p204p.sof1
    /* JADX INFO: renamed from: a */
    public final cog1 mo72231a(gef1 gef1Var) {
        return new cog1(new qt81(this, gef1Var, null, 28));
    }

    @Override // p204p.sof1
    /* JADX INFO: renamed from: b */
    public final cog1 mo72232b(String str, aef1 aef1Var) {
        return new cog1(new qt81(this, str, null, 27));
    }

    @Override // p204p.sof1
    /* JADX INFO: renamed from: c */
    public final Object mo72233c(String str) {
        pff1 pff1VarM72713z = qff1.m72713z();
        pff1VarM72713z.m69803i(str);
        return m72226g(str, (qff1) pff1VarM72713z.m52814g());
    }

    @Override // p204p.sof1
    /* JADX INFO: renamed from: d */
    public final int mo72234d() {
        return 43;
    }

    @Override // p204p.sof1
    /* JADX INFO: renamed from: e */
    public final int mo72235e() {
        return 44;
    }

    /* JADX INFO: renamed from: f */
    public final pjq m72236f(Long l, Optional optional) {
        return x0h1.m89574q((c9k) this.f185818p.f166383d, null, 0, new hcd1(l, this, optional, null, 8), 3);
    }
}
