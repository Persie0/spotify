package p204p;

import android.content.Context;
import android.os.Bundle;
import com.spotify.music.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import p196j$.net.URLEncoder;
import p196j$.util.DesugarTimeZone;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a1m0 extends ri00 implements th00 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f11442h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1m0(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f11442h = i4;
    }

    /* JADX WARN: Code duplicated, block: B:146:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:175:0x036b  */
    /* JADX WARN: Code duplicated, block: B:246:0x04f3 A[PHI: r8
      0x04f3: PHI (r8v13 java.lang.String) = (r8v10 java.lang.String), (r8v8 java.lang.String) binds: [B:260:0x051b, B:244:0x04f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:305:0x0596  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        h600 h600VarMo49777a;
        gjr0 gjr0Var;
        String str;
        m340 m340Var;
        z240 z240VarM60640a;
        cbf0 cbf0VarM35556a;
        String strM32183a;
        String str2;
        Object next;
        cbf0 cbf0VarM35556a2;
        boolean z;
        dbf0 dbf0VarM38368c;
        cbf0 cbf0VarM35556a3;
        d73 d73Var;
        dbf0 dbf0VarM38368c2;
        cbf0 cbf0VarM35556a4;
        dbf0 dbf0VarM38368c3;
        cbf0 cbf0VarM35556a5;
        erc1 erc1Var;
        m340 m340Var2;
        z240 z240VarM60640a2;
        String str3;
        dbf0 dbf0VarM38368c4;
        cbf0 cbf0VarM35556a6;
        v140 v140Var;
        String str4;
        ArrayList arrayList;
        int i = this.f11442h;
        a340 a340Var = a340.f11861b;
        String strValueOf = "";
        w2a1 w2a1Var = w2a1.f247311a;
        boolean z2 = true;
        String str5 = null;
        String str6 = null;
        str = null;
        String str7 = null;
        strM32183a = null;
        String strM32183a2 = null;
        str5 = null;
        Object obj3 = this.f78014b;
        switch (i) {
            case 0:
                i500 i500Var = (i500) obj;
                o1m0 o1m0Var = (o1m0) obj2;
                y0m0 y0m0Var = (y0m0) obj3;
                y0m0Var.getClass();
                h600 h600VarM68839t = p1m0.m68839t(o1m0Var);
                Bundle bundleM70528i = i500Var.f98701f;
                if (bundleM70528i == null) {
                    bundleM70528i = pp91.m70528i();
                }
                bundleM70528i.putBoolean("NO_STATE_SAVE", true);
                i500Var.m49706b1(bundleM70528i);
                j5j0 j5j0Var = new j5j0(o1m0Var, h600VarM68839t, i500Var);
                l5j0 l5j0Var = y0m0Var.f268011a;
                l5j0Var.mo58240c(j5j0Var);
                c7j0 c7j0Var = y0m0Var.f268012b;
                k5j0 k5j0VarMo58245h = l5j0Var.mo58245h();
                if (k5j0VarMo58245h != null && (h600VarMo49777a = k5j0VarMo58245h.mo49777a()) != null) {
                    str5 = h600VarMo49777a.f87940a;
                }
                c7j0Var.f34940b.mo33104m(str5);
                if (i500Var != y0m0Var.f268016f) {
                    y0m0Var.f268016f = i500Var;
                    y0m0Var.f268014d.m77277a(i500Var, 5, false);
                }
                return w2a1Var;
            case 1:
                return ((bqt) obj3).m30278a((String) obj, (gh00) obj2);
            case 2:
                gvn0 gvn0Var = (gvn0) obj;
                ivn0 ivn0Var = (ivn0) obj2;
                cbp cbpVar = ((qvn0) obj3).f193058b;
                ebf0 ebf0Var = ivn0Var.f106245a;
                String str8 = gvn0Var.f84790a;
                dbf0 dbf0VarM38368c5 = ebf0Var.m38368c(hb7.class, str8);
                hb7 hb7Var = (dbf0VarM38368c5 == null || (cbf0VarM35556a2 = dbf0VarM38368c5.m35556a()) == null) ? null : (hb7) cbf0VarM35556a2.f36107a;
                if (hb7Var != null) {
                    Iterator it = hb7Var.f89417a.iterator();
                    if (it.hasNext()) {
                        next = it.next();
                        if (it.hasNext()) {
                            int i2 = ((gjr0) next).f80532h;
                            do {
                                Object next2 = it.next();
                                int i3 = ((gjr0) next2).f80532h;
                                if (i2 > i3) {
                                    next = next2;
                                    i2 = i3;
                                }
                            } while (it.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    gjr0Var = (gjr0) next;
                } else {
                    gjr0Var = null;
                }
                String str9 = gjr0Var != null ? gjr0Var.f80528d : null;
                boolean z3 = (str9 == null || str9.length() == 0 || (str2 = gjr0Var.f80530f) == null || str2.length() == 0) ? false : true;
                String str10 = gjr0Var != null ? gjr0Var.f80529e : null;
                if (str10 == null || str10.length() == 0) {
                    dbf0 dbf0VarM38368c6 = ebf0Var.m38368c(erc1.class, str8);
                    erc1 erc1Var2 = (dbf0VarM38368c6 == null || (cbf0VarM35556a = dbf0VarM38368c6.m35556a()) == null) ? null : (erc1) cbf0VarM35556a.f36107a;
                    str10 = (erc1Var2 == null || (m340Var = erc1Var2.f62079a) == null || (z240VarM60640a = m340Var.m60640a(a340Var)) == null) ? null : z240VarM60640a.f278475a.f198763a;
                    if (str10 == null) {
                        str = "";
                    } else {
                        str = str10;
                    }
                } else {
                    str = str10;
                }
                String strM77252k = gjr0Var != null ? gjr0Var.f80528d : null;
                if (strM77252k == null) {
                    strM77252k = "";
                }
                if (strM77252k.length() != 0) {
                    Set set = dd41.f47702f;
                    String strM35694A = r46.m74726U(str8).m35694A();
                    if (strM35694A != null) {
                        strM77252k = s571.m77252k(strM77252k, wl51.m88496t0(strM77252k, "?", false) ? "&" : "?", "spurl=", URLEncoder.encode(strM35694A, "UTF-8"));
                    }
                }
                String str11 = strM77252k;
                String str12 = gjr0Var != null ? gjr0Var.f80530f : null;
                String str13 = str12 == null ? "" : str12;
                String str14 = gjr0Var != null ? gjr0Var.f80525a : null;
                String str15 = str14 == null ? "" : str14;
                String str16 = gjr0Var != null ? gjr0Var.f80527c : null;
                if (str16 == null) {
                    str16 = "";
                }
                if (gjr0Var == null) {
                    strM32183a = null;
                } else {
                    gjr0 gjr0Var2 = (str16.length() <= 0 || gjr0Var.f80526b == 0.0d) ? null : gjr0Var;
                    if (gjr0Var2 != null) {
                        strM32183a = cbpVar.m32183a(str16, gjr0Var2.f80526b);
                    } else {
                        strM32183a = null;
                    }
                }
                String str17 = strM32183a == null ? "" : strM32183a;
                r5b1 r5b1Var = gjr0Var != null ? gjr0Var.f80531g : null;
                if (r5b1Var == null) {
                    r5b1Var = null;
                }
                if (r5b1Var != null) {
                    if (str16.length() <= 0 || r5b1Var.f196009a == 0.0d) {
                        r5b1Var = null;
                    }
                    if (r5b1Var != null) {
                        strM32183a2 = cbpVar.m32183a(str16, r5b1Var.f196009a);
                    }
                }
                return new mvn0(gvn0Var.f84790a, str, str13, str15, str17, strM32183a2 == null ? "" : strM32183a2, str11, z3, ivn0Var.f106246b, ivn0Var.f106247c);
            case 3:
                wrq0 wrq0Var = (wrq0) obj;
                ytq0 ytq0Var = (ytq0) obj2;
                er70 er70Var = ((cuq0) obj3).f42190d;
                ebf0 ebf0Var2 = ytq0Var.f276196a;
                dbf0 dbf0VarM38368c7 = ebf0Var2 != null ? ebf0Var2.m38368c(i43.class, wrq0Var.f254404a) : null;
                if (dbf0VarM38368c7 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                cbf0 cbf0VarM35556a7 = dbf0VarM38368c7.m35556a();
                wj50.m88279p(cbf0VarM35556a7);
                i43 i43Var = (i43) ((ktx) cbf0VarM35556a7.f36107a);
                hw2 hw2Var = i43Var.f98398b;
                long j = i43Var.f98400d;
                String str18 = hw2Var.f95837b;
                String str19 = hw2Var.f95839d.f256620a;
                String str20 = wrq0Var.f254405b;
                z050 z050VarM95037m6 = z050.m95037m6(0, j);
                gze1 gze1Var = (gze1) er70Var.get();
                z050VarM95037m6.getClass();
                jba0 jba0Var = pze1.m71734n6(z050VarM95037m6, gze1Var).f183683d.f131611d;
                long j2 = i43Var.f98400d;
                gce gceVar = gce.DAYS;
                jba0 jba0VarM52885y6 = jba0.m52885y6((gze1) er70Var.get());
                z050 z050VarM95037m7 = z050.m95037m6(0, j);
                gze1 gze1Var2 = (gze1) er70Var.get();
                z050VarM95037m7.getClass();
                jba0 jba0Var2 = pze1.m71734n6(z050VarM95037m7, gze1Var2).f183683d.f131611d;
                gceVar.getClass();
                int iMo27576m = (int) jba0VarM52885y6.mo27576m(jba0Var2, gceVar);
                gze1 gze1Var3 = (gze1) er70Var.get();
                jlg1.m53716z(gze1Var3, "zone");
                return new ztq0(str18, str19, str20, jba0Var, j2, iMo27576m, j < pze1.m71734n6(z050.m95040p6(System.currentTimeMillis()), gze1Var3).toEpochSecond(), wrq0Var.f254406c, ytq0Var.f276197b);
            case 4:
                ((a2r0) obj3).f11718a.m35666d(s571.m77251j("spotify:internal:personal-podcast:onboarding:preset-preview:", (String) obj, ""), (d850) obj2, null);
                return w2a1Var;
            case 5:
                j2r0 j2r0Var = (j2r0) obj;
                ns91 ns91Var = (ns91) obj2;
                ((n2r0) obj3).getClass();
                if (!wj50.m88271j(ns91Var, ls91.f136481a)) {
                    if (!(ns91Var instanceof ms91)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ms91 ms91Var = (ms91) ns91Var;
                    if (wj50.m88271j(ms91Var.f146736a, j2r0Var.f108130a)) {
                        return new l2r0(ms91Var.f146737b);
                    }
                }
                return k2r0.f118684a;
            case 6:
                ktz0 ktz0Var = (ktz0) obj;
                int iIntValue = ((Number) obj2).intValue();
                m3t0 m3t0Var = (m3t0) obj3;
                m3t0Var.getClass();
                if (ktz0Var.mo33227j(iIntValue)) {
                    z2 = false;
                } else {
                    ktz0 ktz0VarMo33225h = ktz0Var.mo33225h(iIntValue);
                    k0e1 kind = ktz0VarMo33225h.getKind();
                    if (wj50.m88271j(kind, jn51.f114021z0) || wj50.m88271j(kind, in51.f103871A0)) {
                        m3t0Var.f139758i = false;
                    } else if (ktz0VarMo33225h.mo57365b()) {
                        m3t0Var.f139758i = true;
                    } else {
                        z2 = false;
                    }
                }
                return Boolean.valueOf(z2);
            case 7:
                hqt0 hqt0Var = (hqt0) obj;
                gqt0 gqt0Var = (gqt0) obj2;
                ((lqt0) obj3).getClass();
                v4j0 v4j0Var = gqt0Var.f83529a;
                String str21 = v4j0Var.f237189a;
                String str22 = v4j0Var.f237190b;
                if (!hqt0Var.f94251c) {
                    String str23 = v4j0Var.f237191c;
                    if (!wl51.m88460J0(str23)) {
                        str7 = str23;
                    }
                }
                return new kqt0(str21, str22, str7, gqt0Var.f83530b, hqt0Var.f94249a, hqt0Var.f94250b, hqt0Var.f94251c);
            case 8:
                zrt0.m96774A((zrt0) obj3, (InterfaceC1775de) obj, ((Number) obj2).intValue());
                return w2a1Var;
            case 9:
                zrt0.m96774A((zrt0) obj3, (InterfaceC1775de) obj, ((Number) obj2).intValue());
                return w2a1Var;
            case 10:
                return j4v0.m52402a((j4v0) obj3, (g4v0) obj, (f4v0) obj2);
            case 11:
                n4w0 n4w0Var = (n4w0) obj2;
                s4w0 s4w0Var = (s4w0) obj3;
                s4w0Var.getClass();
                String str24 = ((o4w0) obj).f161796a;
                ebf0 ebf0Var3 = n4w0Var.f150430a;
                String str25 = (ebf0Var3 == null || (dbf0VarM38368c4 = ebf0Var3.m38368c(v140.class, str24)) == null || (cbf0VarM35556a6 = dbf0VarM38368c4.m35556a()) == null || (v140Var = (v140) cbf0VarM35556a6.f36107a) == null || (str4 = v140Var.f236243a) == null) ? "" : str4;
                String str26 = (ebf0Var3 == null || (dbf0VarM38368c3 = ebf0Var3.m38368c(erc1.class, str24)) == null || (cbf0VarM35556a5 = dbf0VarM38368c3.m35556a()) == null || (erc1Var = (erc1) cbf0VarM35556a5.f36107a) == null || (m340Var2 = erc1Var.f62079a) == null || (z240VarM60640a2 = m340Var2.m60640a(a340Var)) == null || (str3 = z240VarM60640a2.f278475a.f198763a) == null) ? "" : str3;
                Context context = s4w0Var.f205654c;
                y7t0 y7t0Var = (ebf0Var3 == null || (dbf0VarM38368c2 = ebf0Var3.m38368c(y7t0.class, str24)) == null || (cbf0VarM35556a4 = dbf0VarM38368c2.m35556a()) == null) ? null : (y7t0) cbf0VarM35556a4.f36107a;
                if (y7t0Var == null || !wjg1.m88341w(y7t0Var)) {
                    x7t0 x7t0Var = y7t0Var != null ? (x7t0) y7t0Var.f270133b.f119244b : null;
                    if (x7t0Var instanceof u7t0) {
                        strValueOf = String.valueOf(((u7t0) x7t0Var).f227751a);
                    } else if (x7t0Var instanceof v7t0) {
                        strValueOf = String.valueOf(((v7t0) x7t0Var).f238312a);
                    } else if (x7t0Var instanceof w7t0) {
                        strValueOf = String.valueOf(((w7t0) x7t0Var).f248781a);
                    } else if (!wj50.m88271j(x7t0Var, t7t0.f217897a) && x7t0Var != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    long j3 = y7t0Var.f270134c;
                    try {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy", Locale.getDefault());
                        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                        str6 = simpleDateFormat.format(Long.valueOf(j3 * 1000));
                        break;
                    } catch (Exception unused) {
                    }
                    strValueOf = context.getString(R.string.prerelease_row_subtitle, str6);
                    wj50.m88279p(strValueOf);
                }
                String str27 = strValueOf;
                if (!n4w0Var.f150431b || !s4w0Var.f205656e.m94647a()) {
                    z = false;
                } else if ((!bm51.m29803n0(str24, "spotify:album:", false) || ebf0Var3 == null || (dbf0VarM38368c = ebf0Var3.m38368c(d73.class, str24)) == null || (cbf0VarM35556a3 = dbf0VarM38368c.m35556a()) == null || (d73Var = (d73) cbf0VarM35556a3.f36107a) == null) ? false : d73Var.f45978h) {
                    z = true;
                } else {
                    z = false;
                }
                return new p4w0(str24, str25, str27, str26, z);
            case 12:
                xix0 xix0Var = (xix0) obj;
                wix0 wix0Var = (wix0) obj2;
                ((ajx0) obj3).getClass();
                jl31 jl31Var = wix0Var.f251768a;
                ArrayList arrayList2 = jl31Var.f113477a;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : arrayList2) {
                    if (wj50.m88271j(((fl31) obj4).f70678a, xix0Var.f261955b)) {
                        arrayList3.add(obj4);
                    }
                }
                ArrayList arrayList4 = new ArrayList(i6f.m49804T(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((fl31) it2.next()).f70680c.f80987a);
                }
                String str28 = xix0Var.f261956c;
                if (str28 != null) {
                    ArrayList arrayList5 = jl31Var.f113477a;
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj5 : arrayList5) {
                        if (wj50.m88271j(((fl31) obj5).f70678a, str28)) {
                            arrayList6.add(obj5);
                        }
                    }
                    arrayList = new ArrayList(i6f.m49804T(arrayList6, 10));
                    Iterator it3 = arrayList6.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(((fl31) it3.next()).f70680c.f80987a);
                    }
                } else {
                    arrayList = null;
                }
                String str29 = wix0Var.f251769b.f236243a;
                v140 v140Var2 = wix0Var.f251770c;
                return new yix0(str29, v140Var2 != null ? v140Var2.f236243a : null, arrayList4, arrayList);
            case 13:
                return mjx0.m62036n((fbk) obj2, (gh00) obj, (ljx0) obj3);
            case 14:
                return mjx0.m62036n((fbk) obj2, (gh00) obj, (ljx0) obj3);
            case 15:
                String str30 = (String) obj;
                eh00 eh00Var = (eh00) obj2;
                LinkedHashMap linkedHashMap = ((dhz0) obj3).f49192b;
                Object objInvoke = linkedHashMap.get(str30);
                if (objInvoke == null) {
                    objInvoke = eh00Var.invoke();
                    linkedHashMap.put(str30, objInvoke);
                }
                return (agz0) objInvoke;
            case 16:
                return ((u9w) obj3).m82652a((lu01) obj, (fbk) obj2);
            case 17:
                return ((gh00) obj3).invoke((eo01) obj);
            case 18:
                return ((gh00) obj3).invoke((eo01) obj);
            case 19:
                return ((gh00) obj3).invoke((eo01) obj);
            case 20:
                return ((gh00) obj3).invoke((eo01) obj);
            case 21:
                return ((gh00) obj3).invoke((eo01) obj);
            case 22:
                return ((gh00) obj3).invoke((eo01) obj);
            case 23:
                return ((gh00) obj3).invoke((eo01) obj);
            case 24:
                return ((gh00) obj3).invoke((eo01) obj);
            case 25:
                return ((gh00) obj3).invoke((eo01) obj);
            case 26:
                return ((gh00) obj3).invoke((eo01) obj);
            case 27:
                return ((gh00) obj3).invoke((eo01) obj);
            case 28:
                return ((gh00) obj3).invoke((eo01) obj);
            default:
                return ((gh00) obj3).invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1m0(Object obj) {
        super(2, obj, dhz0.class, "getOrPut", "getOrPut(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lcom/spotify/contentdelivery/download/SegmentFileStreamer;", 0, 0);
        this.f11442h = 15;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1m0(m3t0 m3t0Var) {
        super(2, m3t0Var, m3t0.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0, 0);
        this.f11442h = 6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1m0(j4v0 j4v0Var) {
        super(2, j4v0Var, j4v0.class, "stateMapper", "stateMapper(Lcom/spotify/home/evopage/element/recents/RecentsCarouselElement$RecentsCarouselElementProps;Lcom/spotify/home/evopage/element/recents/RecentsCarouselElement$ExternalState;)Lcom/spotify/home/evopage/element/imagelinks/models/State;", 0, 0);
        this.f11442h = 10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1m0(ljx0 ljx0Var, int i) {
        super(2, ljx0Var, mjx0.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 0);
        this.f11442h = i;
        switch (i) {
            case 14:
                super(2, ljx0Var, mjx0.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 0);
                break;
            default:
                break;
        }
    }
}
