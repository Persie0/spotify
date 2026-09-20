package p204p;

import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import com.spotify.music.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public final class zme1 extends qe70 implements th00 {

    /* JADX INFO: renamed from: b */
    public static final zme1 f284260b;

    /* JADX INFO: renamed from: c */
    public static final zme1 f284261c;

    /* JADX INFO: renamed from: d */
    public static final zme1 f284262d;

    /* JADX INFO: renamed from: e */
    public static final zme1 f284263e;

    /* JADX INFO: renamed from: f */
    public static final zme1 f284264f;

    /* JADX INFO: renamed from: g */
    public static final zme1 f284265g;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f284266a;

    static {
        int i = 2;
        f284260b = new zme1(i, 0);
        f284261c = new zme1(i, 1);
        f284262d = new zme1(i, 2);
        f284263e = new zme1(i, 3);
        f284264f = new zme1(i, 4);
        f284265g = new zme1(i, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zme1(int i, int i2) {
        super(i);
        this.f284266a = i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:135:0x02aa  */
    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        cbf0 cbf0VarM35556a;
        byv byvVar;
        Iterable iterable;
        cbf0 cbf0VarM35556a2;
        y7t0 y7t0Var;
        a13 z03Var;
        SimpleDateFormat simpleDateFormat;
        Date date;
        List list;
        cbf0 cbf0VarM35556a3;
        String str;
        String str2;
        z240 z240VarM60640a;
        String str3;
        z240 z240VarM60640a2;
        ArrayList arrayList;
        cbf0 cbf0VarM35556a4;
        cb7 cb7Var;
        cbf0 cbf0VarM35556a5;
        s5q0 s5q0Var;
        switch (this.f284266a) {
            case 0:
                return Boolean.valueOf(((String) obj).equals((String) obj2));
            case 1:
                return new zvh0(new ouh0((List) obj));
            case 2:
                sfh0 sfh0Var = (sfh0) obj;
                dv91 dv91Var = new dv91("hit", 1);
                String string = ((String) obj2).toString();
                if (string == null) {
                    string = "";
                }
                return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), sfh0Var.f208587a, st91.f213865b, System.currentTimeMillis());
            case 3:
                return (eue1) obj;
            case 4:
                return (os11) obj;
            case 5:
                mfh0 mfh0Var = (mfh0) obj;
                dv91 dv91Var2 = new dv91("hit", 1);
                String string2 = ((String) obj2).toString();
                if (string2 == null) {
                    string2 = "";
                }
                return new av91("", "", dv91Var2, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string2)), mfh0Var.f143071a, st91.f213865b, System.currentTimeMillis());
            case 6:
                String str4 = (String) obj;
                dbf0 dbf0VarM38368c = ((ebf0) obj2).m38368c(byv.class, str4);
                int i = (dbf0VarM38368c == null || (cbf0VarM35556a = dbf0VarM38368c.m35556a()) == null || (byvVar = (byv) cbf0VarM35556a.f36107a) == null) ? 0 : byvVar.f32324a;
                if (i == 0) {
                    i = 1;
                }
                return new h20(str4, i);
            case 7:
                ((Number) obj2).intValue();
                zqg1.m96730e(fyg1.m43076B(1), (xq00) obj);
                return w2a1.f247311a;
            case 8:
                ((Number) obj2).intValue();
                pvg1.m71172d(fyg1.m43076B(1), (xq00) obj);
                return w2a1.f247311a;
            case 9:
                ((Number) obj2).intValue();
                pvg1.m71175g(fyg1.m43076B(1), (xq00) obj);
                return w2a1.f247311a;
            case 10:
                jyj jyjVar = (jyj) obj2;
                return new bg1((uu41) obj, (jyjVar != null ? jyjVar.f117424a : 0) == 6);
            case 11:
                ((Number) obj2).intValue();
                sxg1.m79624g(fyg1.m43076B(1), (xq00) obj);
                return w2a1.f247311a;
            case 12:
                ((Number) obj2).intValue();
                iyg1.m51921h(fyg1.m43076B(1), (xq00) obj);
                return w2a1.f247311a;
            case 13:
                dbf0 dbf0VarM38368c2 = ((ebf0) obj2).m38368c(y7t0.class, ((wy2) obj).f256176a);
                if (dbf0VarM38368c2 == null || (cbf0VarM35556a2 = dbf0VarM38368c2.m35556a()) == null || (y7t0Var = (y7t0) cbf0VarM35556a2.f36107a) == null || (iterable = y7t0Var.f270132a) == null) {
                    iterable = lau.f131415a;
                }
                return bm51.m29801l0(bm51.m29801l0(g6f.m43753y0(iterable, System.lineSeparator(), null, null, null, 62), "(P)", "℗"), "(C)", "©");
            case 14:
                c13 c13Var = (c13) obj;
                b13 b13Var = (b13) obj2;
                String str5 = c13Var.f32956b;
                String str6 = null;
                if (str5 != null) {
                    switch (str5) {
                        case "SINGLE":
                            z03Var = new y03(R.string.album_type_single);
                            break;
                        case "AUDIOBOOK":
                            z03Var = new y03(R.string.album_type_audiobook);
                            break;
                        case "EP":
                            z03Var = new y03(R.string.album_type_ep);
                            break;
                        case "ALBUM":
                            z03Var = new y03(R.string.album_type_album);
                            break;
                        case "COMPILATION":
                            z03Var = new y03(R.string.album_type_compilation);
                            break;
                        default:
                            z03Var = new z03(str5);
                            break;
                    }
                } else {
                    z03Var = null;
                }
                String str7 = c13Var.f32957c;
                if (str7 != null && (date = (simpleDateFormat = new SimpleDateFormat("yyyy", Locale.getDefault())).parse(str7)) != null) {
                    str6 = simpleDateFormat.format(date);
                }
                return new d13(z03Var, str6, b13Var.f22189a);
            case 15:
                ((Number) obj2).intValue();
                yw4.m94775a(fyg1.m43076B(1), (xq00) obj);
                return w2a1.f247311a;
            case 16:
                return sh5.m78125f((qho) obj2);
            case 17:
                ls5 ls5Var = (ls5) obj;
                hs5 hs5Var = (hs5) obj2;
                j4m0 j4m0Var = ls5Var.f136449c;
                ks5 ks5Var = ls5Var.f136448b;
                long j = hs5Var.f94608b;
                AbstractC2524w8<bye> abstractC2524w8 = hs5Var.f94607a;
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(abstractC2524w8, 10));
                for (bye byeVar : abstractC2524w8) {
                    arrayList2.add(new bye(byeVar.f32167d, byeVar.f32168e, ls5Var.f136447a));
                }
                return new ms5(opo.m67546C(arrayList2), j, ks5Var, j4m0Var);
            case 18:
                ((Number) obj2).intValue();
                iu5.m51650c(fyg1.m43076B(1), (xq00) obj);
                return w2a1.f247311a;
            case 19:
                g46 g46Var = (g46) obj;
                String str8 = g46Var.f76352a;
                dbf0 dbf0VarM38368c3 = ((ebf0) obj2).m38368c(daj.class, str8);
                daj dajVar = (daj) ((dbf0VarM38368c3 == null || (cbf0VarM35556a3 = dbf0VarM38368c3.m35556a()) == null) ? null : (ktx) cbf0VarM35556a3.f36107a);
                return new h46(str8, g46Var.f76353b, (dajVar == null || (list = dajVar.f47051b) == null) ? false : list.contains(aaj.f13850b));
            case 20:
                oj9 oj9Var = (oj9) vie1.m85619a((qho) obj2);
                String str9 = ((pj9) obj).f178209a;
                v140 v140Var = oj9Var.f166011a;
                if (v140Var == null || (str = v140Var.f236243a) == null) {
                    str = "";
                }
                erc1 erc1Var = oj9Var.f166012b;
                String str10 = null;
                if (erc1Var != null) {
                    z240 z240VarM60640a3 = erc1Var.f62079a.m60640a(a340.f11862c);
                    if (z240VarM60640a3 != null) {
                        str10 = z240VarM60640a3.f278475a.f198763a;
                    }
                }
                return new qj9(str9, str, str10);
            case 21:
                xj9 xj9Var = (xj9) obj;
                wj9 wj9Var = (wj9) vie1.m85619a((qho) obj2);
                String str11 = xj9Var.f262071a;
                v140 v140Var2 = wj9Var.f251910a;
                String str12 = "";
                if (v140Var2 == null || (str2 = v140Var2.f236243a) == null) {
                    str2 = "";
                }
                erc1 erc1Var2 = wj9Var.f251912c;
                a340 a340Var = a340.f11862c;
                String str13 = null;
                uj9 uj9Var = new uj9(str11, str2, (erc1Var2 == null || (z240VarM60640a2 = erc1Var2.f62079a.m60640a(a340Var)) == null) ? null : z240VarM60640a2.f278475a.f198763a);
                String str14 = xj9Var.f262072b;
                v140 v140Var3 = wj9Var.f251911b;
                if (v140Var3 != null && (str3 = v140Var3.f236243a) != null) {
                    str12 = str3;
                }
                erc1 erc1Var3 = wj9Var.f251913d;
                if (erc1Var3 != null && (z240VarM60640a = erc1Var3.f62079a.m60640a(a340Var)) != null) {
                    str13 = z240VarM60640a.f278475a.f198763a;
                }
                return new yj9(uj9Var, new uj9(str14, str12, str13), xj9Var.f262073c);
            case 22:
                icc iccVar = (icc) obj;
                ebf0 ebf0Var = (ebf0) obj2;
                String str15 = iccVar.f100784a;
                dbf0 dbf0VarM38368c4 = ebf0Var.m38368c(s5q0.class, str15);
                ArrayList arrayList3 = null;
                arrayList3 = null;
                arrayList3 = null;
                if (dbf0VarM38368c4 == null || (cbf0VarM35556a5 = dbf0VarM38368c4.m35556a()) == null || (s5q0Var = (s5q0) cbf0VarM35556a5.f36107a) == null) {
                    arrayList = null;
                } else {
                    ArrayList<r5q0> arrayList4 = s5q0Var.f205892a;
                    arrayList = new ArrayList(i6f.m49804T(arrayList4, 10));
                    for (r5q0 r5q0Var : arrayList4) {
                        arrayList.add(new fgc(r5q0Var.f196092a, r5q0Var.f196093b));
                    }
                }
                dbf0 dbf0VarM38368c5 = ebf0Var.m38368c(cb7.class, str15);
                if (dbf0VarM38368c5 != null && (cbf0VarM35556a4 = dbf0VarM38368c5.m35556a()) != null && (cb7Var = (cb7) cbf0VarM35556a4.f36107a) != null) {
                    ArrayList<ab7> arrayListM52991k = jcg1.m52991k(cb7Var.f36029a);
                    arrayList3 = new ArrayList(i6f.m49804T(arrayListM52991k, 10));
                    for (ab7 ab7Var : arrayListM52991k) {
                        arrayList3.add(new fgc(ab7Var.f14015b, ab7Var.f14014a));
                    }
                }
                List list2 = arrayList3;
                if (arrayList != null) {
                    list2 = arrayList;
                } else if (arrayList3 == null) {
                    list2 = lau.f131415a;
                }
                return new jcc(iccVar.f100785b, arrayList != null ? 2 : 1, list2);
            case 23:
                ilc ilcVar = (ilc) obj;
                return Next.m15606h(new tvh0(ilcVar.f103352b, ilcVar.f103353c, ilcVar.f103351a, ilcVar.f103354d, 80));
            case 24:
                ilc ilcVar2 = (ilc) obj;
                return First.m15574b(new tvh0(ilcVar2.f103352b, ilcVar2.f103353c, ilcVar2.f103351a, ilcVar2.f103354d, 80));
            case 25:
                ((Number) obj2).intValue();
                vjf1.m85751a(fyg1.m43076B(1), (xq00) obj);
                return w2a1.f247311a;
            case 26:
                ((Number) obj2).intValue();
                yjf1.m93883c(fyg1.m43076B(1), (xq00) obj);
                return w2a1.f247311a;
            case 27:
                return eod.m39565f((pnd) obj);
            case 28:
                ((Number) obj2).intValue();
                elf1.m39370i(fyg1.m43076B(1), (xq00) obj);
                return w2a1.f247311a;
            default:
                ((Number) obj2).intValue();
                elf1.m39373l(fyg1.m43076B(1), (xq00) obj);
                return w2a1.f247311a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zme1(int i, int i2, boolean z) {
        super(2);
        this.f284266a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zme1(ry8 ry8Var, int i) {
        super(2);
        this.f284266a = i;
    }
}
