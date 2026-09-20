package p204p;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class sm2 {

    /* JADX INFO: renamed from: a */
    public final Context f210543a;

    /* JADX INFO: renamed from: b */
    public final rl2 f210544b;

    /* JADX INFO: renamed from: c */
    public final jq2 f210545c;

    /* JADX INFO: renamed from: d */
    public final el2 f210546d;

    /* JADX INFO: renamed from: e */
    public final mfb f210547e;

    /* JADX INFO: renamed from: f */
    public final qnk f210548f;

    /* JADX INFO: renamed from: g */
    public final bj2 f210549g;

    /* JADX INFO: renamed from: h */
    public final String f210550h;

    public sm2(Context context, rl2 rl2Var, jq2 jq2Var, el2 el2Var, mfb mfbVar, xre xreVar, qnk qnkVar, bj2 bj2Var, h0d0 h0d0Var) {
        this.f210543a = context;
        this.f210544b = rl2Var;
        this.f210545c = jq2Var;
        this.f210546d = el2Var;
        this.f210547e = mfbVar;
        this.f210548f = qnkVar;
        this.f210549g = bj2Var;
        this.f210550h = h0d0Var.f86231L0;
    }

    /* JADX INFO: renamed from: a */
    public static nyc0 m78507a(zo2 zo2Var, ArrayList arrayList, int i) {
        return new nyc0(new zo2(edb.m38565n(zo2Var.f284633a, ":seg:", i), opo.m67574x(arrayList), zo2Var.f284635c, true, zo2Var.f284637e, zo2Var.f284638f), null);
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x0108  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static t0d0 m78508g(sm2 sm2Var, dl2 dl2Var, String str, String str2, int i) {
        String str3;
        List list;
        Iterable iterableSingletonList;
        if ((i & 1) != 0) {
            str = null;
        }
        String str4 = (i & 2) != 0 ? null : str2;
        sm2Var.getClass();
        ArrayList<sl2> arrayList = dl2Var.f50092a;
        ArrayList arrayList2 = new ArrayList();
        for (sl2 sl2Var : arrayList) {
            String str5 = sl2Var.f210254a;
            tl2 tl2Var = sl2Var.f210256c;
            if (str5 == null || wl51.m88460J0(str5)) {
                str5 = null;
            }
            String str6 = sl2Var.f210255b;
            if (str6 == null || wl51.m88460J0(str6)) {
                str6 = null;
            }
            if (tl2Var == null || (list = tl2Var.f221306a) == null || list.isEmpty()) {
                list = null;
            }
            bm2 bm2Var = sl2Var.f210257d;
            vm2 vm2Var = sl2Var.f210259f;
            if (str5 != null) {
                iterableSingletonList = Collections.singletonList(new lfj(str5));
            } else if (str6 != null) {
                iterableSingletonList = Collections.singletonList(new mfj(str6));
            } else if (list != null) {
                iterableSingletonList = Collections.singletonList(new ofj(2, tl2Var != null ? tl2Var.f221307b : null, opo.m67574x(list)));
            } else if (bm2Var != null) {
                ro80 ro80VarM44508o = geg1.m44508o();
                ae50 ae50Var = bm2Var.f28357a;
                if (ae50Var.isEmpty()) {
                    ae50Var = null;
                }
                if (ae50Var != null) {
                    ro80VarM44508o.add(new ofj(4, null, opo.m67574x(ae50Var)));
                }
                ae50 ae50Var2 = bm2Var.f28358b;
                if (ae50Var2.isEmpty()) {
                    ae50Var2 = null;
                }
                if (ae50Var2 != null) {
                    ro80VarM44508o.add(new ofj(4, null, opo.m67574x(ae50Var2)));
                }
                iterableSingletonList = geg1.m44506m(ro80VarM44508o);
            } else if (vm2Var != null) {
                qf40 qf40VarM67574x = opo.m67574x(vm2Var.f242678a);
                String str7 = vm2Var.f242679b;
                String str8 = vm2Var.f242680c;
                String str9 = vm2Var.f242681d;
                if (str9 == null || wl51.m88460J0(str9)) {
                    str9 = null;
                }
                iterableSingletonList = Collections.singletonList(new nfj(str7, str8, str9, qf40VarM67574x));
            } else {
                iterableSingletonList = lau.f131415a;
            }
            j6f.m52564V(iterableSingletonList, arrayList2);
        }
        qf40 qf40VarM67574x2 = opo.m67574x(arrayList2);
        if (((AbstractC2282q6) qf40VarM67574x2).isEmpty()) {
            return null;
        }
        String str10 = dl2Var.f50094c;
        if (str10 == null) {
            if (str == null) {
                str = UUID.randomUUID().toString();
            }
            str3 = str;
        } else {
            String str11 = wl51.m88460J0(str10) ? null : str10;
            if (str11 == null) {
                if (str == null) {
                    str = UUID.randomUUID().toString();
                }
                str3 = str;
            } else {
                str3 = str11;
            }
        }
        return new t0d0(new zo2(str3, qf40VarM67574x2, true, false, str4, TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())), new gpo(str3, opo.m67566p("agent_gateway_response")), str3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m78509b(String str, fbk fbkVar) {
        pm2 pm2Var;
        if (fbkVar instanceof pm2) {
            pm2Var = (pm2) fbkVar;
            int i = pm2Var.f178868d;
            if ((i & Integer.MIN_VALUE) != 0) {
                pm2Var.f178868d = i - Integer.MIN_VALUE;
            } else {
                pm2Var = new pm2(this, fbkVar);
            }
        } else {
            pm2Var = new pm2(this, fbkVar);
        }
        Object objM89557A = pm2Var.f178866b;
        int i2 = pm2Var.f178868d;
        String str2 = null;
        try {
            if (i2 == 0) {
                bga.m29073P(objM89557A);
                n5q n5qVar = xsr.f265651a;
                tlp tlpVar = tlp.f221498c;
                fa2 fa2Var = new fa2(this, str, null, 6);
                pm2Var.f178865a = str;
                pm2Var.f178868d = 1;
                objM89557A = x0h1.m89557A(tlpVar, fa2Var, pm2Var);
                yuk yukVar = yuk.f276404a;
                if (objM89557A == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = pm2Var.f178865a;
                bga.m29073P(objM89557A);
            }
            List list = (List) objM89557A;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                j6f.m52564V(((em2) it.next()).f60796a, arrayList);
            }
            List listM43711Y0 = g6f.m43711Y0(g6f.m43744r1(arrayList), jlg1.m53700j(hv1.f95537Y0, hv1.f95539Z0));
            ArrayList arrayList2 = new ArrayList(i6f.m49804T(listM43711Y0, 10));
            Iterator it2 = listM43711Y0.iterator();
            while (it2.hasNext()) {
                arrayList2.add((im2) ((bo40) it2.next()).f29009b);
            }
            qf40 qf40VarM78513f = m78513f(str, arrayList2);
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                String str3 = ((em2) it3.next()).f60798c;
                if (str3 != null) {
                    str2 = str3;
                    break;
                }
            }
            return new nwc0(str, str2, qf40VarM78513f);
        } catch (Throwable th) {
            return new ewc0(th);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m78510c(dl2 dl2Var) {
        cm2 cm2Var;
        String str;
        Iterator it = dl2Var.f50093b.iterator();
        do {
            if (!it.hasNext()) {
                cm2Var = null;
                break;
            }
            cm2Var = ((cl2) it.next()).f39155c;
        } while (cm2Var == null);
        if (cm2Var == null || (str = cm2Var.f39574a) == null) {
            return;
        }
        if (wl51.m88460J0(str)) {
            str = null;
        }
        if (str != null) {
            bj2 bj2Var = this.f210549g;
            x0h1.m89578u(bj2Var.f27597a, null, 0, new fa2(bj2Var.f27598b, str, null, 4), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0193 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:15:0x003c, B:49:0x0111, B:50:0x0115, B:54:0x011f, B:56:0x0127, B:58:0x012b, B:60:0x0133, B:62:0x0137, B:65:0x013d, B:68:0x0143, B:71:0x0149, B:74:0x014f, B:79:0x0157, B:80:0x0159, B:83:0x0168, B:86:0x0172, B:89:0x017d, B:91:0x0181, B:94:0x0187, B:97:0x018d, B:100:0x0193, B:103:0x0199, B:108:0x01a1, B:109:0x01a3, B:111:0x01b0, B:22:0x0050, B:35:0x00ac, B:37:0x00c2, B:38:0x00cd, B:40:0x00d3, B:42:0x00dd, B:43:0x00e1, B:45:0x00f5, B:25:0x0059, B:31:0x0081, B:28:0x0066), top: B:115:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:101:0x0196  */
    /* JADX WARN: Code duplicated, block: B:103:0x0199 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:15:0x003c, B:49:0x0111, B:50:0x0115, B:54:0x011f, B:56:0x0127, B:58:0x012b, B:60:0x0133, B:62:0x0137, B:65:0x013d, B:68:0x0143, B:71:0x0149, B:74:0x014f, B:79:0x0157, B:80:0x0159, B:83:0x0168, B:86:0x0172, B:89:0x017d, B:91:0x0181, B:94:0x0187, B:97:0x018d, B:100:0x0193, B:103:0x0199, B:108:0x01a1, B:109:0x01a3, B:111:0x01b0, B:22:0x0050, B:35:0x00ac, B:37:0x00c2, B:38:0x00cd, B:40:0x00d3, B:42:0x00dd, B:43:0x00e1, B:45:0x00f5, B:25:0x0059, B:31:0x0081, B:28:0x0066), top: B:115:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:105:0x019d  */
    /* JADX WARN: Code duplicated, block: B:106:0x019e  */
    /* JADX WARN: Code duplicated, block: B:108:0x01a1 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:15:0x003c, B:49:0x0111, B:50:0x0115, B:54:0x011f, B:56:0x0127, B:58:0x012b, B:60:0x0133, B:62:0x0137, B:65:0x013d, B:68:0x0143, B:71:0x0149, B:74:0x014f, B:79:0x0157, B:80:0x0159, B:83:0x0168, B:86:0x0172, B:89:0x017d, B:91:0x0181, B:94:0x0187, B:97:0x018d, B:100:0x0193, B:103:0x0199, B:108:0x01a1, B:109:0x01a3, B:111:0x01b0, B:22:0x0050, B:35:0x00ac, B:37:0x00c2, B:38:0x00cd, B:40:0x00d3, B:42:0x00dd, B:43:0x00e1, B:45:0x00f5, B:25:0x0059, B:31:0x0081, B:28:0x0066), top: B:115:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:111:0x01b0 A[Catch: all -> 0x0041, TRY_LEAVE, TryCatch #0 {all -> 0x0041, blocks: (B:15:0x003c, B:49:0x0111, B:50:0x0115, B:54:0x011f, B:56:0x0127, B:58:0x012b, B:60:0x0133, B:62:0x0137, B:65:0x013d, B:68:0x0143, B:71:0x0149, B:74:0x014f, B:79:0x0157, B:80:0x0159, B:83:0x0168, B:86:0x0172, B:89:0x017d, B:91:0x0181, B:94:0x0187, B:97:0x018d, B:100:0x0193, B:103:0x0199, B:108:0x01a1, B:109:0x01a3, B:111:0x01b0, B:22:0x0050, B:35:0x00ac, B:37:0x00c2, B:38:0x00cd, B:40:0x00d3, B:42:0x00dd, B:43:0x00e1, B:45:0x00f5, B:25:0x0059, B:31:0x0081, B:28:0x0066), top: B:115:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:117:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c2 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:15:0x003c, B:49:0x0111, B:50:0x0115, B:54:0x011f, B:56:0x0127, B:58:0x012b, B:60:0x0133, B:62:0x0137, B:65:0x013d, B:68:0x0143, B:71:0x0149, B:74:0x014f, B:79:0x0157, B:80:0x0159, B:83:0x0168, B:86:0x0172, B:89:0x017d, B:91:0x0181, B:94:0x0187, B:97:0x018d, B:100:0x0193, B:103:0x0199, B:108:0x01a1, B:109:0x01a3, B:111:0x01b0, B:22:0x0050, B:35:0x00ac, B:37:0x00c2, B:38:0x00cd, B:40:0x00d3, B:42:0x00dd, B:43:0x00e1, B:45:0x00f5, B:25:0x0059, B:31:0x0081, B:28:0x0066), top: B:115:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d3 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:15:0x003c, B:49:0x0111, B:50:0x0115, B:54:0x011f, B:56:0x0127, B:58:0x012b, B:60:0x0133, B:62:0x0137, B:65:0x013d, B:68:0x0143, B:71:0x0149, B:74:0x014f, B:79:0x0157, B:80:0x0159, B:83:0x0168, B:86:0x0172, B:89:0x017d, B:91:0x0181, B:94:0x0187, B:97:0x018d, B:100:0x0193, B:103:0x0199, B:108:0x01a1, B:109:0x01a3, B:111:0x01b0, B:22:0x0050, B:35:0x00ac, B:37:0x00c2, B:38:0x00cd, B:40:0x00d3, B:42:0x00dd, B:43:0x00e1, B:45:0x00f5, B:25:0x0059, B:31:0x0081, B:28:0x0066), top: B:115:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00f5 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:15:0x003c, B:49:0x0111, B:50:0x0115, B:54:0x011f, B:56:0x0127, B:58:0x012b, B:60:0x0133, B:62:0x0137, B:65:0x013d, B:68:0x0143, B:71:0x0149, B:74:0x014f, B:79:0x0157, B:80:0x0159, B:83:0x0168, B:86:0x0172, B:89:0x017d, B:91:0x0181, B:94:0x0187, B:97:0x018d, B:100:0x0193, B:103:0x0199, B:108:0x01a1, B:109:0x01a3, B:111:0x01b0, B:22:0x0050, B:35:0x00ac, B:37:0x00c2, B:38:0x00cd, B:40:0x00d3, B:42:0x00dd, B:43:0x00e1, B:45:0x00f5, B:25:0x0059, B:31:0x0081, B:28:0x0066), top: B:115:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:53:0x011d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x011f A[Catch: all -> 0x0041, TRY_ENTER, TryCatch #0 {all -> 0x0041, blocks: (B:15:0x003c, B:49:0x0111, B:50:0x0115, B:54:0x011f, B:56:0x0127, B:58:0x012b, B:60:0x0133, B:62:0x0137, B:65:0x013d, B:68:0x0143, B:71:0x0149, B:74:0x014f, B:79:0x0157, B:80:0x0159, B:83:0x0168, B:86:0x0172, B:89:0x017d, B:91:0x0181, B:94:0x0187, B:97:0x018d, B:100:0x0193, B:103:0x0199, B:108:0x01a1, B:109:0x01a3, B:111:0x01b0, B:22:0x0050, B:35:0x00ac, B:37:0x00c2, B:38:0x00cd, B:40:0x00d3, B:42:0x00dd, B:43:0x00e1, B:45:0x00f5, B:25:0x0059, B:31:0x0081, B:28:0x0066), top: B:115:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0126  */
    /* JADX WARN: Code duplicated, block: B:58:0x012b A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:15:0x003c, B:49:0x0111, B:50:0x0115, B:54:0x011f, B:56:0x0127, B:58:0x012b, B:60:0x0133, B:62:0x0137, B:65:0x013d, B:68:0x0143, B:71:0x0149, B:74:0x014f, B:79:0x0157, B:80:0x0159, B:83:0x0168, B:86:0x0172, B:89:0x017d, B:91:0x0181, B:94:0x0187, B:97:0x018d, B:100:0x0193, B:103:0x0199, B:108:0x01a1, B:109:0x01a3, B:111:0x01b0, B:22:0x0050, B:35:0x00ac, B:37:0x00c2, B:38:0x00cd, B:40:0x00d3, B:42:0x00dd, B:43:0x00e1, B:45:0x00f5, B:25:0x0059, B:31:0x0081, B:28:0x0066), top: B:115:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0132  */
    /* JADX WARN: Code duplicated, block: B:62:0x0137 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:15:0x003c, B:49:0x0111, B:50:0x0115, B:54:0x011f, B:56:0x0127, B:58:0x012b, B:60:0x0133, B:62:0x0137, B:65:0x013d, B:68:0x0143, B:71:0x0149, B:74:0x014f, B:79:0x0157, B:80:0x0159, B:83:0x0168, B:86:0x0172, B:89:0x017d, B:91:0x0181, B:94:0x0187, B:97:0x018d, B:100:0x0193, B:103:0x0199, B:108:0x01a1, B:109:0x01a3, B:111:0x01b0, B:22:0x0050, B:35:0x00ac, B:37:0x00c2, B:38:0x00cd, B:40:0x00d3, B:42:0x00dd, B:43:0x00e1, B:45:0x00f5, B:25:0x0059, B:31:0x0081, B:28:0x0066), top: B:115:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:63:0x013a  */
    /* JADX WARN: Code duplicated, block: B:65:0x013d A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:15:0x003c, B:49:0x0111, B:50:0x0115, B:54:0x011f, B:56:0x0127, B:58:0x012b, B:60:0x0133, B:62:0x0137, B:65:0x013d, B:68:0x0143, B:71:0x0149, B:74:0x014f, B:79:0x0157, B:80:0x0159, B:83:0x0168, B:86:0x0172, B:89:0x017d, B:91:0x0181, B:94:0x0187, B:97:0x018d, B:100:0x0193, B:103:0x0199, B:108:0x01a1, B:109:0x01a3, B:111:0x01b0, B:22:0x0050, B:35:0x00ac, B:37:0x00c2, B:38:0x00cd, B:40:0x00d3, B:42:0x00dd, B:43:0x00e1, B:45:0x00f5, B:25:0x0059, B:31:0x0081, B:28:0x0066), top: B:115:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0140  */
    /* JADX WARN: Code duplicated, block: B:68:0x0143 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:15:0x003c, B:49:0x0111, B:50:0x0115, B:54:0x011f, B:56:0x0127, B:58:0x012b, B:60:0x0133, B:62:0x0137, B:65:0x013d, B:68:0x0143, B:71:0x0149, B:74:0x014f, B:79:0x0157, B:80:0x0159, B:83:0x0168, B:86:0x0172, B:89:0x017d, B:91:0x0181, B:94:0x0187, B:97:0x018d, B:100:0x0193, B:103:0x0199, B:108:0x01a1, B:109:0x01a3, B:111:0x01b0, B:22:0x0050, B:35:0x00ac, B:37:0x00c2, B:38:0x00cd, B:40:0x00d3, B:42:0x00dd, B:43:0x00e1, B:45:0x00f5, B:25:0x0059, B:31:0x0081, B:28:0x0066), top: B:115:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0146  */
    /* JADX WARN: Code duplicated, block: B:71:0x0149 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:15:0x003c, B:49:0x0111, B:50:0x0115, B:54:0x011f, B:56:0x0127, B:58:0x012b, B:60:0x0133, B:62:0x0137, B:65:0x013d, B:68:0x0143, B:71:0x0149, B:74:0x014f, B:79:0x0157, B:80:0x0159, B:83:0x0168, B:86:0x0172, B:89:0x017d, B:91:0x0181, B:94:0x0187, B:97:0x018d, B:100:0x0193, B:103:0x0199, B:108:0x01a1, B:109:0x01a3, B:111:0x01b0, B:22:0x0050, B:35:0x00ac, B:37:0x00c2, B:38:0x00cd, B:40:0x00d3, B:42:0x00dd, B:43:0x00e1, B:45:0x00f5, B:25:0x0059, B:31:0x0081, B:28:0x0066), top: B:115:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:72:0x014c  */
    /* JADX WARN: Code duplicated, block: B:74:0x014f A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:15:0x003c, B:49:0x0111, B:50:0x0115, B:54:0x011f, B:56:0x0127, B:58:0x012b, B:60:0x0133, B:62:0x0137, B:65:0x013d, B:68:0x0143, B:71:0x0149, B:74:0x014f, B:79:0x0157, B:80:0x0159, B:83:0x0168, B:86:0x0172, B:89:0x017d, B:91:0x0181, B:94:0x0187, B:97:0x018d, B:100:0x0193, B:103:0x0199, B:108:0x01a1, B:109:0x01a3, B:111:0x01b0, B:22:0x0050, B:35:0x00ac, B:37:0x00c2, B:38:0x00cd, B:40:0x00d3, B:42:0x00dd, B:43:0x00e1, B:45:0x00f5, B:25:0x0059, B:31:0x0081, B:28:0x0066), top: B:115:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0153  */
    /* JADX WARN: Code duplicated, block: B:77:0x0154  */
    /* JADX WARN: Code duplicated, block: B:79:0x0157 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:15:0x003c, B:49:0x0111, B:50:0x0115, B:54:0x011f, B:56:0x0127, B:58:0x012b, B:60:0x0133, B:62:0x0137, B:65:0x013d, B:68:0x0143, B:71:0x0149, B:74:0x014f, B:79:0x0157, B:80:0x0159, B:83:0x0168, B:86:0x0172, B:89:0x017d, B:91:0x0181, B:94:0x0187, B:97:0x018d, B:100:0x0193, B:103:0x0199, B:108:0x01a1, B:109:0x01a3, B:111:0x01b0, B:22:0x0050, B:35:0x00ac, B:37:0x00c2, B:38:0x00cd, B:40:0x00d3, B:42:0x00dd, B:43:0x00e1, B:45:0x00f5, B:25:0x0059, B:31:0x0081, B:28:0x0066), top: B:115:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0166 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x0168 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:15:0x003c, B:49:0x0111, B:50:0x0115, B:54:0x011f, B:56:0x0127, B:58:0x012b, B:60:0x0133, B:62:0x0137, B:65:0x013d, B:68:0x0143, B:71:0x0149, B:74:0x014f, B:79:0x0157, B:80:0x0159, B:83:0x0168, B:86:0x0172, B:89:0x017d, B:91:0x0181, B:94:0x0187, B:97:0x018d, B:100:0x0193, B:103:0x0199, B:108:0x01a1, B:109:0x01a3, B:111:0x01b0, B:22:0x0050, B:35:0x00ac, B:37:0x00c2, B:38:0x00cd, B:40:0x00d3, B:42:0x00dd, B:43:0x00e1, B:45:0x00f5, B:25:0x0059, B:31:0x0081, B:28:0x0066), top: B:115:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:84:0x016f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0172 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:15:0x003c, B:49:0x0111, B:50:0x0115, B:54:0x011f, B:56:0x0127, B:58:0x012b, B:60:0x0133, B:62:0x0137, B:65:0x013d, B:68:0x0143, B:71:0x0149, B:74:0x014f, B:79:0x0157, B:80:0x0159, B:83:0x0168, B:86:0x0172, B:89:0x017d, B:91:0x0181, B:94:0x0187, B:97:0x018d, B:100:0x0193, B:103:0x0199, B:108:0x01a1, B:109:0x01a3, B:111:0x01b0, B:22:0x0050, B:35:0x00ac, B:37:0x00c2, B:38:0x00cd, B:40:0x00d3, B:42:0x00dd, B:43:0x00e1, B:45:0x00f5, B:25:0x0059, B:31:0x0081, B:28:0x0066), top: B:115:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:87:0x017a  */
    /* JADX WARN: Code duplicated, block: B:89:0x017d A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:15:0x003c, B:49:0x0111, B:50:0x0115, B:54:0x011f, B:56:0x0127, B:58:0x012b, B:60:0x0133, B:62:0x0137, B:65:0x013d, B:68:0x0143, B:71:0x0149, B:74:0x014f, B:79:0x0157, B:80:0x0159, B:83:0x0168, B:86:0x0172, B:89:0x017d, B:91:0x0181, B:94:0x0187, B:97:0x018d, B:100:0x0193, B:103:0x0199, B:108:0x01a1, B:109:0x01a3, B:111:0x01b0, B:22:0x0050, B:35:0x00ac, B:37:0x00c2, B:38:0x00cd, B:40:0x00d3, B:42:0x00dd, B:43:0x00e1, B:45:0x00f5, B:25:0x0059, B:31:0x0081, B:28:0x0066), top: B:115:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:91:0x0181 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:15:0x003c, B:49:0x0111, B:50:0x0115, B:54:0x011f, B:56:0x0127, B:58:0x012b, B:60:0x0133, B:62:0x0137, B:65:0x013d, B:68:0x0143, B:71:0x0149, B:74:0x014f, B:79:0x0157, B:80:0x0159, B:83:0x0168, B:86:0x0172, B:89:0x017d, B:91:0x0181, B:94:0x0187, B:97:0x018d, B:100:0x0193, B:103:0x0199, B:108:0x01a1, B:109:0x01a3, B:111:0x01b0, B:22:0x0050, B:35:0x00ac, B:37:0x00c2, B:38:0x00cd, B:40:0x00d3, B:42:0x00dd, B:43:0x00e1, B:45:0x00f5, B:25:0x0059, B:31:0x0081, B:28:0x0066), top: B:115:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0184  */
    /* JADX WARN: Code duplicated, block: B:94:0x0187 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:15:0x003c, B:49:0x0111, B:50:0x0115, B:54:0x011f, B:56:0x0127, B:58:0x012b, B:60:0x0133, B:62:0x0137, B:65:0x013d, B:68:0x0143, B:71:0x0149, B:74:0x014f, B:79:0x0157, B:80:0x0159, B:83:0x0168, B:86:0x0172, B:89:0x017d, B:91:0x0181, B:94:0x0187, B:97:0x018d, B:100:0x0193, B:103:0x0199, B:108:0x01a1, B:109:0x01a3, B:111:0x01b0, B:22:0x0050, B:35:0x00ac, B:37:0x00c2, B:38:0x00cd, B:40:0x00d3, B:42:0x00dd, B:43:0x00e1, B:45:0x00f5, B:25:0x0059, B:31:0x0081, B:28:0x0066), top: B:115:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:95:0x018a  */
    /* JADX WARN: Code duplicated, block: B:97:0x018d A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:15:0x003c, B:49:0x0111, B:50:0x0115, B:54:0x011f, B:56:0x0127, B:58:0x012b, B:60:0x0133, B:62:0x0137, B:65:0x013d, B:68:0x0143, B:71:0x0149, B:74:0x014f, B:79:0x0157, B:80:0x0159, B:83:0x0168, B:86:0x0172, B:89:0x017d, B:91:0x0181, B:94:0x0187, B:97:0x018d, B:100:0x0193, B:103:0x0199, B:108:0x01a1, B:109:0x01a3, B:111:0x01b0, B:22:0x0050, B:35:0x00ac, B:37:0x00c2, B:38:0x00cd, B:40:0x00d3, B:42:0x00dd, B:43:0x00e1, B:45:0x00f5, B:25:0x0059, B:31:0x0081, B:28:0x0066), top: B:115:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0190  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010d, code lost:
    
        if (((p204p.bpk) r3).m30159y(r2, r7, r4, r10) == r14) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [p.fbk] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.List] */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m78511d(cuc0 cuc0Var, fbk fbkVar) {
        qm2 qm2Var;
        Uri uri;
        Object objM89557A;
        cuc0 cuc0Var2;
        Uri uri2;
        kq2 kq2Var;
        String str;
        dl2 dl2Var;
        ArrayList arrayList;
        Iterator it;
        String strM43753y0;
        dl2 dl2Var2;
        String str2;
        String str3;
        String str4;
        int i;
        lau lauVar;
        lm2 lm2VarM40679d;
        t0d0 t0d0VarM78508g;
        String str5;
        String str6;
        Long l;
        r891 r891Var;
        ?? r6;
        lm2 lm2VarM40679d2;
        t0d0 t0d0VarM78508g2;
        String str7;
        String str8;
        Long l2;
        r891 r891Var2;
        List list;
        List list2;
        cuc0 cuc0Var3 = cuc0Var;
        if (fbkVar instanceof qm2) {
            qm2Var = (qm2) fbkVar;
            int i2 = qm2Var.f190024i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qm2Var.f190024i = i2 - Integer.MIN_VALUE;
            } else {
                qm2Var = new qm2(this, fbkVar);
            }
        } else {
            qm2Var = new qm2(this, fbkVar);
        }
        qm2 qm2Var2 = qm2Var;
        Object obj = qm2Var2.f190022g;
        int i3 = qm2Var2.f190024i;
        ?? r13 = 0;
        yuk yukVar = yuk.f276404a;
        try {
            if (i3 == 0) {
                bga.m29073P(obj);
                uri = cuc0Var3.f42087a;
                n5q n5qVar = xsr.f265651a;
                tlp tlpVar = tlp.f221498c;
                C2241p2 c2241p2 = new C2241p2(this, uri, r13, 19);
                qm2Var2.f190016a = cuc0Var3;
                qm2Var2.f190017b = uri;
                qm2Var2.f190024i = 1;
                objM89557A = x0h1.m89557A(tlpVar, c2241p2, qm2Var2);
                if (objM89557A == yukVar) {
                }
                return yukVar;
            }
            if (i3 == 1) {
                Uri uri3 = qm2Var2.f190017b;
                cuc0 cuc0Var4 = qm2Var2.f190016a;
                bga.m29073P(obj);
                uri = uri3;
                cuc0Var3 = cuc0Var4;
                objM89557A = obj;
            } else {
                if (i3 == 2) {
                    uri2 = qm2Var2.f190017b;
                    cuc0 cuc0Var5 = qm2Var2.f190016a;
                    bga.m29073P(obj);
                    cuc0Var2 = cuc0Var5;
                    kq2Var = (kq2) obj;
                    this.f210547e.m61624e(Collections.singletonList(uri2.toString()));
                    str = kq2Var.f125201a;
                    dl2Var = kq2Var.f125202b;
                    if (dl2Var != null) {
                        ArrayList arrayList2 = dl2Var.f50092a;
                        arrayList = new ArrayList();
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            str2 = ((sl2) it.next()).f210255b;
                            if (str2 != null) {
                                arrayList.add(str2);
                            }
                        }
                        strM43753y0 = g6f.m43753y0(arrayList, "\n", null, null, null, 62);
                        if (!wl51.m88460J0(strM43753y0)) {
                            qnk qnkVar = this.f210548f;
                            String str9 = dl2Var.f50094c;
                            qm2Var2.f190016a = cuc0Var2;
                            qm2Var2.f190017b = null;
                            qm2Var2.f190018c = kq2Var;
                            qm2Var2.f190019d = str;
                            qm2Var2.f190020e = dl2Var;
                            qm2Var2.f190021f = dl2Var;
                            qm2Var2.f190024i = 3;
                        }
                        dl2Var2 = dl2Var;
                    }
                    str3 = str;
                    str4 = cuc0Var2.f42090d;
                    i = 0;
                    lauVar = lau.f131415a;
                    if (str4 == null) {
                        if (dl2Var != null) {
                            lm2VarM40679d2 = f3h1.m40679d(dl2Var.f50093b);
                        } else {
                            lm2VarM40679d2 = null;
                        }
                        if (dl2Var != null) {
                            t0d0VarM78508g2 = m78508g(this, dl2Var, null, kq2Var.f125203c, 1);
                        } else {
                            t0d0VarM78508g2 = null;
                        }
                        String str10 = kq2Var.f125204d;
                        if (lm2VarM40679d2 != null) {
                            str7 = lm2VarM40679d2.f134756a;
                        } else {
                            str7 = null;
                        }
                        if (lm2VarM40679d2 != null) {
                            str8 = lm2VarM40679d2.f134757b;
                        } else {
                            str8 = null;
                        }
                        if (lm2VarM40679d2 != null) {
                            l2 = lm2VarM40679d2.f134758c;
                        } else {
                            l2 = null;
                        }
                        if (lm2VarM40679d2 != null) {
                            r891Var2 = lm2VarM40679d2.f134759d;
                        } else {
                            r891Var2 = null;
                        }
                        list = lm2VarM40679d2 != null ? lm2VarM40679d2.f134760e : null;
                        if (list != null) {
                            list2 = list;
                        }
                        if (lm2VarM40679d2 != null) {
                            list2 = lauVar;
                            i = lm2VarM40679d2.f134761f;
                        }
                        list2 = lauVar;
                        return new lwc0(str3, t0d0VarM78508g2, str10, str7, str8, l2, r891Var2, list2, i);
                    }
                    if (dl2Var != null) {
                        lm2VarM40679d = f3h1.m40679d(dl2Var.f50093b);
                    } else {
                        lm2VarM40679d = null;
                    }
                    if (dl2Var != null) {
                        t0d0VarM78508g = m78508g(this, dl2Var, null, kq2Var.f125203c, 1);
                    } else {
                        t0d0VarM78508g = null;
                    }
                    if (t0d0VarM78508g == null) {
                        return new uvc0(new IllegalStateException("Received empty response from agent gateway"));
                    }
                    if (lm2VarM40679d != null) {
                        str5 = lm2VarM40679d.f134756a;
                    } else {
                        str5 = null;
                    }
                    if (lm2VarM40679d != null) {
                        str6 = lm2VarM40679d.f134757b;
                    } else {
                        str6 = null;
                    }
                    if (lm2VarM40679d != null) {
                        l = lm2VarM40679d.f134758c;
                    } else {
                        l = null;
                    }
                    if (lm2VarM40679d != null) {
                        r891Var = lm2VarM40679d.f134759d;
                    } else {
                        r891Var = null;
                    }
                    r13 = lm2VarM40679d != null ? lm2VarM40679d.f134760e : 0;
                    if (r13 != 0) {
                        r6 = r13;
                    }
                    if (lm2VarM40679d != null) {
                        r6 = lauVar;
                        i = lm2VarM40679d.f134761f;
                    }
                    r6 = lauVar;
                    return new vvc0(t0d0VarM78508g, str5, str6, l, r891Var, r6, i);
                }
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dl2Var = qm2Var2.f190021f;
                dl2Var2 = qm2Var2.f190020e;
                str = qm2Var2.f190019d;
                kq2Var = qm2Var2.f190018c;
                cuc0Var2 = qm2Var2.f190016a;
                bga.m29073P(obj);
            }
            m78510c(dl2Var);
            dl2Var = dl2Var2;
            str3 = str;
            str4 = cuc0Var2.f42090d;
            i = 0;
            lauVar = lau.f131415a;
            if (str4 == null) {
                if (dl2Var != null) {
                    lm2VarM40679d2 = f3h1.m40679d(dl2Var.f50093b);
                } else {
                    lm2VarM40679d2 = null;
                }
                if (dl2Var != null) {
                    t0d0VarM78508g2 = m78508g(this, dl2Var, null, kq2Var.f125203c, 1);
                } else {
                    t0d0VarM78508g2 = null;
                }
                String str11 = kq2Var.f125204d;
                if (lm2VarM40679d2 != null) {
                    str7 = lm2VarM40679d2.f134756a;
                } else {
                    str7 = null;
                }
                if (lm2VarM40679d2 != null) {
                    str8 = lm2VarM40679d2.f134757b;
                } else {
                    str8 = null;
                }
                if (lm2VarM40679d2 != null) {
                    l2 = lm2VarM40679d2.f134758c;
                } else {
                    l2 = null;
                }
                if (lm2VarM40679d2 != null) {
                    r891Var2 = lm2VarM40679d2.f134759d;
                } else {
                    r891Var2 = null;
                }
                if (lm2VarM40679d2 != null) {
                }
                if (list != null) {
                    list2 = list;
                }
                if (lm2VarM40679d2 != null) {
                    list2 = lauVar;
                    i = lm2VarM40679d2.f134761f;
                }
                list2 = lauVar;
                return new lwc0(str3, t0d0VarM78508g2, str11, str7, str8, l2, r891Var2, list2, i);
            }
            if (dl2Var != null) {
                lm2VarM40679d = f3h1.m40679d(dl2Var.f50093b);
            } else {
                lm2VarM40679d = null;
            }
            if (dl2Var != null) {
                t0d0VarM78508g = m78508g(this, dl2Var, null, kq2Var.f125203c, 1);
            } else {
                t0d0VarM78508g = null;
            }
            if (t0d0VarM78508g == null) {
                return new uvc0(new IllegalStateException("Received empty response from agent gateway"));
            }
            if (lm2VarM40679d != null) {
                str5 = lm2VarM40679d.f134756a;
            } else {
                str5 = null;
            }
            if (lm2VarM40679d != null) {
                str6 = lm2VarM40679d.f134757b;
            } else {
                str6 = null;
            }
            if (lm2VarM40679d != null) {
                l = lm2VarM40679d.f134758c;
            } else {
                l = null;
            }
            if (lm2VarM40679d != null) {
                r891Var = lm2VarM40679d.f134759d;
            } else {
                r891Var = null;
            }
            if (lm2VarM40679d != null) {
            }
            if (r13 != 0) {
                r6 = r13;
            }
            if (lm2VarM40679d != null) {
                r6 = lauVar;
                i = lm2VarM40679d.f134761f;
            }
            r6 = lauVar;
            return new vvc0(t0d0VarM78508g, str5, str6, l, r891Var, r6, i);
            hm2 hm2Var = new hm2((byte[]) objM89557A);
            jq2 jq2Var = this.f210545c;
            List listSingletonList = Collections.singletonList(hm2Var);
            String str12 = cuc0Var3.f42088b;
            nk2 nk2Var = nk2.IMAGE_SEARCH;
            String str13 = cuc0Var3.f42090d;
            this.f210544b.getClass();
            String str14 = this.f210550h;
            qm2Var2.f190016a = cuc0Var3;
            qm2Var2.f190017b = uri;
            qm2Var2.f190024i = 2;
            Object objM54025c = jq2Var.m54025c(listSingletonList, str12, nk2Var, str13, str14, qm2Var2);
            if (objM54025c != yukVar) {
                cuc0Var2 = cuc0Var3;
                uri2 = uri;
                obj = objM54025c;
                kq2Var = (kq2) obj;
                this.f210547e.m61624e(Collections.singletonList(uri2.toString()));
                str = kq2Var.f125201a;
                dl2Var = kq2Var.f125202b;
                if (dl2Var != null) {
                    ArrayList arrayList3 = dl2Var.f50092a;
                    arrayList = new ArrayList();
                    it = arrayList3.iterator();
                    while (it.hasNext()) {
                        str2 = ((sl2) it.next()).f210255b;
                        if (str2 != null) {
                            arrayList.add(str2);
                        }
                    }
                    strM43753y0 = g6f.m43753y0(arrayList, "\n", null, null, null, 62);
                    if (!wl51.m88460J0(strM43753y0)) {
                        qnk qnkVar2 = this.f210548f;
                        String str15 = dl2Var.f50094c;
                        qm2Var2.f190016a = cuc0Var2;
                        qm2Var2.f190017b = null;
                        qm2Var2.f190018c = kq2Var;
                        qm2Var2.f190019d = str;
                        qm2Var2.f190020e = dl2Var;
                        qm2Var2.f190021f = dl2Var;
                        qm2Var2.f190024i = 3;
                    }
                    dl2Var2 = dl2Var;
                    m78510c(dl2Var);
                    dl2Var = dl2Var2;
                }
                str3 = str;
                str4 = cuc0Var2.f42090d;
                i = 0;
                lauVar = lau.f131415a;
                if (str4 == null) {
                    if (dl2Var != null) {
                        lm2VarM40679d2 = f3h1.m40679d(dl2Var.f50093b);
                    } else {
                        lm2VarM40679d2 = null;
                    }
                    if (dl2Var != null) {
                        t0d0VarM78508g2 = m78508g(this, dl2Var, null, kq2Var.f125203c, 1);
                    } else {
                        t0d0VarM78508g2 = null;
                    }
                    String str16 = kq2Var.f125204d;
                    if (lm2VarM40679d2 != null) {
                        str7 = lm2VarM40679d2.f134756a;
                    } else {
                        str7 = null;
                    }
                    if (lm2VarM40679d2 != null) {
                        str8 = lm2VarM40679d2.f134757b;
                    } else {
                        str8 = null;
                    }
                    if (lm2VarM40679d2 != null) {
                        l2 = lm2VarM40679d2.f134758c;
                    } else {
                        l2 = null;
                    }
                    if (lm2VarM40679d2 != null) {
                        r891Var2 = lm2VarM40679d2.f134759d;
                    } else {
                        r891Var2 = null;
                    }
                    if (lm2VarM40679d2 != null) {
                    }
                    if (list != null) {
                        list2 = list;
                    }
                    if (lm2VarM40679d2 != null) {
                        list2 = lauVar;
                        i = lm2VarM40679d2.f134761f;
                    }
                    list2 = lauVar;
                    return new lwc0(str3, t0d0VarM78508g2, str16, str7, str8, l2, r891Var2, list2, i);
                }
                if (dl2Var != null) {
                    lm2VarM40679d = f3h1.m40679d(dl2Var.f50093b);
                } else {
                    lm2VarM40679d = null;
                }
                if (dl2Var != null) {
                    t0d0VarM78508g = m78508g(this, dl2Var, null, kq2Var.f125203c, 1);
                } else {
                    t0d0VarM78508g = null;
                }
                if (t0d0VarM78508g == null) {
                    return new uvc0(new IllegalStateException("Received empty response from agent gateway"));
                }
                if (lm2VarM40679d != null) {
                    str5 = lm2VarM40679d.f134756a;
                } else {
                    str5 = null;
                }
                if (lm2VarM40679d != null) {
                    str6 = lm2VarM40679d.f134757b;
                } else {
                    str6 = null;
                }
                if (lm2VarM40679d != null) {
                    l = lm2VarM40679d.f134758c;
                } else {
                    l = null;
                }
                if (lm2VarM40679d != null) {
                    r891Var = lm2VarM40679d.f134759d;
                } else {
                    r891Var = null;
                }
                if (lm2VarM40679d != null) {
                }
                if (r13 != 0) {
                    r6 = r13;
                }
                if (lm2VarM40679d != null) {
                    r6 = lauVar;
                    i = lm2VarM40679d.f134761f;
                }
                r6 = lauVar;
                return new vvc0(t0d0VarM78508g, str5, str6, l, r891Var, r6, i);
            }
            return yukVar;
        } catch (Throwable th) {
            return new uvc0(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0164 A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:14:0x0038, B:43:0x00cf, B:44:0x00d3, B:48:0x00df, B:51:0x00e9, B:53:0x00ed, B:55:0x00f7, B:57:0x00fb, B:60:0x0101, B:63:0x0107, B:66:0x010d, B:69:0x0113, B:74:0x011b, B:77:0x012b, B:81:0x0133, B:84:0x013d, B:87:0x0148, B:89:0x014c, B:92:0x0152, B:95:0x0158, B:98:0x015e, B:101:0x0164, B:106:0x016c, B:109:0x0175, B:111:0x0179, B:21:0x004a, B:27:0x0071, B:29:0x007a, B:30:0x0085, B:32:0x008b, B:34:0x0095, B:35:0x0099, B:37:0x00af, B:24:0x0054), top: B:115:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x0168  */
    /* JADX WARN: Code duplicated, block: B:104:0x0169  */
    /* JADX WARN: Code duplicated, block: B:106:0x016c A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:14:0x0038, B:43:0x00cf, B:44:0x00d3, B:48:0x00df, B:51:0x00e9, B:53:0x00ed, B:55:0x00f7, B:57:0x00fb, B:60:0x0101, B:63:0x0107, B:66:0x010d, B:69:0x0113, B:74:0x011b, B:77:0x012b, B:81:0x0133, B:84:0x013d, B:87:0x0148, B:89:0x014c, B:92:0x0152, B:95:0x0158, B:98:0x015e, B:101:0x0164, B:106:0x016c, B:109:0x0175, B:111:0x0179, B:21:0x004a, B:27:0x0071, B:29:0x007a, B:30:0x0085, B:32:0x008b, B:34:0x0095, B:35:0x0099, B:37:0x00af, B:24:0x0054), top: B:115:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0173  */
    /* JADX WARN: Code duplicated, block: B:111:0x0179 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #0 {all -> 0x003d, blocks: (B:14:0x0038, B:43:0x00cf, B:44:0x00d3, B:48:0x00df, B:51:0x00e9, B:53:0x00ed, B:55:0x00f7, B:57:0x00fb, B:60:0x0101, B:63:0x0107, B:66:0x010d, B:69:0x0113, B:74:0x011b, B:77:0x012b, B:81:0x0133, B:84:0x013d, B:87:0x0148, B:89:0x014c, B:92:0x0152, B:95:0x0158, B:98:0x015e, B:101:0x0164, B:106:0x016c, B:109:0x0175, B:111:0x0179, B:21:0x004a, B:27:0x0071, B:29:0x007a, B:30:0x0085, B:32:0x008b, B:34:0x0095, B:35:0x0099, B:37:0x00af, B:24:0x0054), top: B:115:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00df A[Catch: all -> 0x003d, TRY_ENTER, TryCatch #0 {all -> 0x003d, blocks: (B:14:0x0038, B:43:0x00cf, B:44:0x00d3, B:48:0x00df, B:51:0x00e9, B:53:0x00ed, B:55:0x00f7, B:57:0x00fb, B:60:0x0101, B:63:0x0107, B:66:0x010d, B:69:0x0113, B:74:0x011b, B:77:0x012b, B:81:0x0133, B:84:0x013d, B:87:0x0148, B:89:0x014c, B:92:0x0152, B:95:0x0158, B:98:0x015e, B:101:0x0164, B:106:0x016c, B:109:0x0175, B:111:0x0179, B:21:0x004a, B:27:0x0071, B:29:0x007a, B:30:0x0085, B:32:0x008b, B:34:0x0095, B:35:0x0099, B:37:0x00af, B:24:0x0054), top: B:115:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ed A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:14:0x0038, B:43:0x00cf, B:44:0x00d3, B:48:0x00df, B:51:0x00e9, B:53:0x00ed, B:55:0x00f7, B:57:0x00fb, B:60:0x0101, B:63:0x0107, B:66:0x010d, B:69:0x0113, B:74:0x011b, B:77:0x012b, B:81:0x0133, B:84:0x013d, B:87:0x0148, B:89:0x014c, B:92:0x0152, B:95:0x0158, B:98:0x015e, B:101:0x0164, B:106:0x016c, B:109:0x0175, B:111:0x0179, B:21:0x004a, B:27:0x0071, B:29:0x007a, B:30:0x0085, B:32:0x008b, B:34:0x0095, B:35:0x0099, B:37:0x00af, B:24:0x0054), top: B:115:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fb A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:14:0x0038, B:43:0x00cf, B:44:0x00d3, B:48:0x00df, B:51:0x00e9, B:53:0x00ed, B:55:0x00f7, B:57:0x00fb, B:60:0x0101, B:63:0x0107, B:66:0x010d, B:69:0x0113, B:74:0x011b, B:77:0x012b, B:81:0x0133, B:84:0x013d, B:87:0x0148, B:89:0x014c, B:92:0x0152, B:95:0x0158, B:98:0x015e, B:101:0x0164, B:106:0x016c, B:109:0x0175, B:111:0x0179, B:21:0x004a, B:27:0x0071, B:29:0x007a, B:30:0x0085, B:32:0x008b, B:34:0x0095, B:35:0x0099, B:37:0x00af, B:24:0x0054), top: B:115:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:60:0x0101 A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:14:0x0038, B:43:0x00cf, B:44:0x00d3, B:48:0x00df, B:51:0x00e9, B:53:0x00ed, B:55:0x00f7, B:57:0x00fb, B:60:0x0101, B:63:0x0107, B:66:0x010d, B:69:0x0113, B:74:0x011b, B:77:0x012b, B:81:0x0133, B:84:0x013d, B:87:0x0148, B:89:0x014c, B:92:0x0152, B:95:0x0158, B:98:0x015e, B:101:0x0164, B:106:0x016c, B:109:0x0175, B:111:0x0179, B:21:0x004a, B:27:0x0071, B:29:0x007a, B:30:0x0085, B:32:0x008b, B:34:0x0095, B:35:0x0099, B:37:0x00af, B:24:0x0054), top: B:115:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0104  */
    /* JADX WARN: Code duplicated, block: B:63:0x0107 A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:14:0x0038, B:43:0x00cf, B:44:0x00d3, B:48:0x00df, B:51:0x00e9, B:53:0x00ed, B:55:0x00f7, B:57:0x00fb, B:60:0x0101, B:63:0x0107, B:66:0x010d, B:69:0x0113, B:74:0x011b, B:77:0x012b, B:81:0x0133, B:84:0x013d, B:87:0x0148, B:89:0x014c, B:92:0x0152, B:95:0x0158, B:98:0x015e, B:101:0x0164, B:106:0x016c, B:109:0x0175, B:111:0x0179, B:21:0x004a, B:27:0x0071, B:29:0x007a, B:30:0x0085, B:32:0x008b, B:34:0x0095, B:35:0x0099, B:37:0x00af, B:24:0x0054), top: B:115:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x010a  */
    /* JADX WARN: Code duplicated, block: B:66:0x010d A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:14:0x0038, B:43:0x00cf, B:44:0x00d3, B:48:0x00df, B:51:0x00e9, B:53:0x00ed, B:55:0x00f7, B:57:0x00fb, B:60:0x0101, B:63:0x0107, B:66:0x010d, B:69:0x0113, B:74:0x011b, B:77:0x012b, B:81:0x0133, B:84:0x013d, B:87:0x0148, B:89:0x014c, B:92:0x0152, B:95:0x0158, B:98:0x015e, B:101:0x0164, B:106:0x016c, B:109:0x0175, B:111:0x0179, B:21:0x004a, B:27:0x0071, B:29:0x007a, B:30:0x0085, B:32:0x008b, B:34:0x0095, B:35:0x0099, B:37:0x00af, B:24:0x0054), top: B:115:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0110  */
    /* JADX WARN: Code duplicated, block: B:69:0x0113 A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:14:0x0038, B:43:0x00cf, B:44:0x00d3, B:48:0x00df, B:51:0x00e9, B:53:0x00ed, B:55:0x00f7, B:57:0x00fb, B:60:0x0101, B:63:0x0107, B:66:0x010d, B:69:0x0113, B:74:0x011b, B:77:0x012b, B:81:0x0133, B:84:0x013d, B:87:0x0148, B:89:0x014c, B:92:0x0152, B:95:0x0158, B:98:0x015e, B:101:0x0164, B:106:0x016c, B:109:0x0175, B:111:0x0179, B:21:0x004a, B:27:0x0071, B:29:0x007a, B:30:0x0085, B:32:0x008b, B:34:0x0095, B:35:0x0099, B:37:0x00af, B:24:0x0054), top: B:115:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0117  */
    /* JADX WARN: Code duplicated, block: B:72:0x0118  */
    /* JADX WARN: Code duplicated, block: B:74:0x011b A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:14:0x0038, B:43:0x00cf, B:44:0x00d3, B:48:0x00df, B:51:0x00e9, B:53:0x00ed, B:55:0x00f7, B:57:0x00fb, B:60:0x0101, B:63:0x0107, B:66:0x010d, B:69:0x0113, B:74:0x011b, B:77:0x012b, B:81:0x0133, B:84:0x013d, B:87:0x0148, B:89:0x014c, B:92:0x0152, B:95:0x0158, B:98:0x015e, B:101:0x0164, B:106:0x016c, B:109:0x0175, B:111:0x0179, B:21:0x004a, B:27:0x0071, B:29:0x007a, B:30:0x0085, B:32:0x008b, B:34:0x0095, B:35:0x0099, B:37:0x00af, B:24:0x0054), top: B:115:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0125  */
    /* JADX WARN: Code duplicated, block: B:79:0x012f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0133 A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:14:0x0038, B:43:0x00cf, B:44:0x00d3, B:48:0x00df, B:51:0x00e9, B:53:0x00ed, B:55:0x00f7, B:57:0x00fb, B:60:0x0101, B:63:0x0107, B:66:0x010d, B:69:0x0113, B:74:0x011b, B:77:0x012b, B:81:0x0133, B:84:0x013d, B:87:0x0148, B:89:0x014c, B:92:0x0152, B:95:0x0158, B:98:0x015e, B:101:0x0164, B:106:0x016c, B:109:0x0175, B:111:0x0179, B:21:0x004a, B:27:0x0071, B:29:0x007a, B:30:0x0085, B:32:0x008b, B:34:0x0095, B:35:0x0099, B:37:0x00af, B:24:0x0054), top: B:115:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x013a  */
    /* JADX WARN: Code duplicated, block: B:84:0x013d A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:14:0x0038, B:43:0x00cf, B:44:0x00d3, B:48:0x00df, B:51:0x00e9, B:53:0x00ed, B:55:0x00f7, B:57:0x00fb, B:60:0x0101, B:63:0x0107, B:66:0x010d, B:69:0x0113, B:74:0x011b, B:77:0x012b, B:81:0x0133, B:84:0x013d, B:87:0x0148, B:89:0x014c, B:92:0x0152, B:95:0x0158, B:98:0x015e, B:101:0x0164, B:106:0x016c, B:109:0x0175, B:111:0x0179, B:21:0x004a, B:27:0x0071, B:29:0x007a, B:30:0x0085, B:32:0x008b, B:34:0x0095, B:35:0x0099, B:37:0x00af, B:24:0x0054), top: B:115:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0145  */
    /* JADX WARN: Code duplicated, block: B:87:0x0148 A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:14:0x0038, B:43:0x00cf, B:44:0x00d3, B:48:0x00df, B:51:0x00e9, B:53:0x00ed, B:55:0x00f7, B:57:0x00fb, B:60:0x0101, B:63:0x0107, B:66:0x010d, B:69:0x0113, B:74:0x011b, B:77:0x012b, B:81:0x0133, B:84:0x013d, B:87:0x0148, B:89:0x014c, B:92:0x0152, B:95:0x0158, B:98:0x015e, B:101:0x0164, B:106:0x016c, B:109:0x0175, B:111:0x0179, B:21:0x004a, B:27:0x0071, B:29:0x007a, B:30:0x0085, B:32:0x008b, B:34:0x0095, B:35:0x0099, B:37:0x00af, B:24:0x0054), top: B:115:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x014c A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:14:0x0038, B:43:0x00cf, B:44:0x00d3, B:48:0x00df, B:51:0x00e9, B:53:0x00ed, B:55:0x00f7, B:57:0x00fb, B:60:0x0101, B:63:0x0107, B:66:0x010d, B:69:0x0113, B:74:0x011b, B:77:0x012b, B:81:0x0133, B:84:0x013d, B:87:0x0148, B:89:0x014c, B:92:0x0152, B:95:0x0158, B:98:0x015e, B:101:0x0164, B:106:0x016c, B:109:0x0175, B:111:0x0179, B:21:0x004a, B:27:0x0071, B:29:0x007a, B:30:0x0085, B:32:0x008b, B:34:0x0095, B:35:0x0099, B:37:0x00af, B:24:0x0054), top: B:115:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:90:0x014f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0152 A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:14:0x0038, B:43:0x00cf, B:44:0x00d3, B:48:0x00df, B:51:0x00e9, B:53:0x00ed, B:55:0x00f7, B:57:0x00fb, B:60:0x0101, B:63:0x0107, B:66:0x010d, B:69:0x0113, B:74:0x011b, B:77:0x012b, B:81:0x0133, B:84:0x013d, B:87:0x0148, B:89:0x014c, B:92:0x0152, B:95:0x0158, B:98:0x015e, B:101:0x0164, B:106:0x016c, B:109:0x0175, B:111:0x0179, B:21:0x004a, B:27:0x0071, B:29:0x007a, B:30:0x0085, B:32:0x008b, B:34:0x0095, B:35:0x0099, B:37:0x00af, B:24:0x0054), top: B:115:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0155  */
    /* JADX WARN: Code duplicated, block: B:95:0x0158 A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:14:0x0038, B:43:0x00cf, B:44:0x00d3, B:48:0x00df, B:51:0x00e9, B:53:0x00ed, B:55:0x00f7, B:57:0x00fb, B:60:0x0101, B:63:0x0107, B:66:0x010d, B:69:0x0113, B:74:0x011b, B:77:0x012b, B:81:0x0133, B:84:0x013d, B:87:0x0148, B:89:0x014c, B:92:0x0152, B:95:0x0158, B:98:0x015e, B:101:0x0164, B:106:0x016c, B:109:0x0175, B:111:0x0179, B:21:0x004a, B:27:0x0071, B:29:0x007a, B:30:0x0085, B:32:0x008b, B:34:0x0095, B:35:0x0099, B:37:0x00af, B:24:0x0054), top: B:115:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x015b  */
    /* JADX WARN: Code duplicated, block: B:98:0x015e A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:14:0x0038, B:43:0x00cf, B:44:0x00d3, B:48:0x00df, B:51:0x00e9, B:53:0x00ed, B:55:0x00f7, B:57:0x00fb, B:60:0x0101, B:63:0x0107, B:66:0x010d, B:69:0x0113, B:74:0x011b, B:77:0x012b, B:81:0x0133, B:84:0x013d, B:87:0x0148, B:89:0x014c, B:92:0x0152, B:95:0x0158, B:98:0x015e, B:101:0x0164, B:106:0x016c, B:109:0x0175, B:111:0x0179, B:21:0x004a, B:27:0x0071, B:29:0x007a, B:30:0x0085, B:32:0x008b, B:34:0x0095, B:35:0x0099, B:37:0x00af, B:24:0x0054), top: B:115:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0161  */
    /* JADX INFO: renamed from: e */
    public final Object m78512e(duc0 duc0Var, fbk fbkVar) {
        rm2 rm2Var;
        yuk yukVar;
        Object objM54022e;
        kq2 kq2Var;
        String str;
        dl2 dl2Var;
        dl2 dl2Var2;
        duc0 duc0Var2;
        dl2 dl2Var3;
        kq2 kq2Var2;
        String str2;
        String str3;
        List list;
        List list2;
        lm2 lm2VarM40679d;
        t0d0 t0d0VarM78508g;
        String str4;
        String str5;
        Long l;
        r891 r891Var;
        int i;
        lm2 lm2VarM40679d2;
        t0d0 t0d0VarM78508g2;
        List list3;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int i2;
        duc0 duc0Var3 = duc0Var;
        if (fbkVar instanceof rm2) {
            rm2Var = (rm2) fbkVar;
            int i3 = rm2Var.f200422h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rm2Var.f200422h = i3 - Integer.MIN_VALUE;
            } else {
                rm2Var = new rm2(this, fbkVar);
            }
        } else {
            rm2Var = new rm2(this, fbkVar);
        }
        rm2 rm2Var2 = rm2Var;
        Object obj5 = rm2Var2.f200420f;
        int i4 = rm2Var2.f200422h;
        yuk yukVar2 = yuk.f276404a;
        try {
            if (i4 == 0) {
                bga.m29073P(obj5);
                yukVar = yukVar2;
                jq2 jq2Var = this.f210545c;
                String str6 = duc0Var3.f53030a;
                nk2 nk2Var = this.f210544b.f200196b;
                String str7 = duc0Var3.f53032c;
                boolean z = duc0Var3.f53034e;
                String str8 = this.f210550h;
                rm2Var2.f200415a = duc0Var3;
                rm2Var2.f200422h = 1;
                objM54022e = jq2.m54022e(jq2Var, str6, nk2Var, str7, z, str8, null, null, rm2Var2, 192);
                if (objM54022e == yukVar) {
                }
                return yukVar;
            }
            if (i4 == 1) {
                duc0Var3 = rm2Var2.f200415a;
                bga.m29073P(obj5);
                objM54022e = obj5;
                yukVar = yukVar2;
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dl2Var3 = rm2Var2.f200419e;
                dl2Var = rm2Var2.f200418d;
                str = rm2Var2.f200417c;
                kq2Var = rm2Var2.f200416b;
                duc0Var2 = rm2Var2.f200415a;
                bga.m29073P(obj5);
            }
            dl2Var2 = dl2Var;
            dl2Var = dl2Var3;
            duc0Var3 = duc0Var2;
            m78510c(dl2Var);
            dl2Var = dl2Var2;
            kq2Var2 = kq2Var;
            str2 = str;
            str3 = duc0Var3.f53032c;
            list = lau.f131415a;
            if (str3 == null) {
                if (dl2Var != null) {
                    lm2VarM40679d2 = f3h1.m40679d(dl2Var.f50093b);
                } else {
                    lm2VarM40679d2 = null;
                }
                if (dl2Var != null) {
                    t0d0VarM78508g2 = m78508g(this, dl2Var, null, kq2Var2.f125203c, 1);
                    list3 = null;
                } else {
                    t0d0VarM78508g2 = null;
                    list3 = null;
                }
                String str9 = kq2Var2.f125204d;
                if (lm2VarM40679d2 != null) {
                    obj = lm2VarM40679d2.f134756a;
                } else {
                    obj = list3;
                }
                if (lm2VarM40679d2 != null) {
                    obj2 = lm2VarM40679d2.f134757b;
                } else {
                    obj2 = list3;
                }
                if (lm2VarM40679d2 != null) {
                    obj3 = lm2VarM40679d2.f134758c;
                } else {
                    obj3 = list3;
                }
                if (lm2VarM40679d2 != null) {
                    obj4 = lm2VarM40679d2.f134759d;
                } else {
                    obj4 = list3;
                }
                if (lm2VarM40679d2 != null) {
                    list3 = lm2VarM40679d2.f134760e;
                }
                if (list3 == null) {
                    list = list3;
                }
                if (lm2VarM40679d2 != null) {
                    i2 = lm2VarM40679d2.f134761f;
                } else {
                    i2 = 0;
                }
                return new lwc0(str2, t0d0VarM78508g2, str9, obj, obj2, obj3, obj4, list, i2);
            }
            list2 = null;
            if (dl2Var != null) {
                lm2VarM40679d = f3h1.m40679d(dl2Var.f50093b);
            } else {
                lm2VarM40679d = null;
            }
            if (dl2Var != null) {
                t0d0VarM78508g = m78508g(this, dl2Var, null, kq2Var2.f125203c, 1);
            } else {
                t0d0VarM78508g = null;
            }
            if (t0d0VarM78508g != null) {
                return new uvc0(new IllegalStateException("Received empty response from agent gateway"));
            }
            if (lm2VarM40679d != null) {
                str4 = lm2VarM40679d.f134756a;
            } else {
                str4 = null;
            }
            if (lm2VarM40679d != null) {
                str5 = lm2VarM40679d.f134757b;
            } else {
                str5 = null;
            }
            if (lm2VarM40679d != null) {
                l = lm2VarM40679d.f134758c;
            } else {
                l = null;
            }
            if (lm2VarM40679d != null) {
                r891Var = lm2VarM40679d.f134759d;
            } else {
                r891Var = null;
            }
            if (lm2VarM40679d != null) {
                list2 = lm2VarM40679d.f134760e;
            }
            if (list2 == null) {
                list = list2;
            }
            if (lm2VarM40679d != null) {
                i = lm2VarM40679d.f134761f;
            } else {
                i = 0;
            }
            return new vvc0(t0d0VarM78508g, str4, str5, l, r891Var, list, i);
            kq2Var = (kq2) objM54022e;
            str = kq2Var.f125201a;
            dl2Var = kq2Var.f125202b;
            if (dl2Var != null) {
                ArrayList arrayList = dl2Var.f50092a;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str10 = ((sl2) it.next()).f210255b;
                    if (str10 != null) {
                        arrayList2.add(str10);
                    }
                }
                String strM43753y0 = g6f.m43753y0(arrayList2, "\n", null, null, null, 62);
                if (!wl51.m88460J0(strM43753y0)) {
                    qnk qnkVar = this.f210548f;
                    String str11 = dl2Var.f50094c;
                    rm2Var2.f200415a = duc0Var3;
                    rm2Var2.f200416b = kq2Var;
                    rm2Var2.f200417c = str;
                    rm2Var2.f200418d = dl2Var;
                    rm2Var2.f200419e = dl2Var;
                    rm2Var2.f200422h = 2;
                    if (((bpk) qnkVar).m30159y(strM43753y0, str11, str, rm2Var2) != yukVar) {
                        duc0Var2 = duc0Var3;
                        dl2Var3 = dl2Var;
                        dl2Var2 = dl2Var;
                        dl2Var = dl2Var3;
                        duc0Var3 = duc0Var2;
                    }
                    return yukVar;
                }
                dl2Var2 = dl2Var;
                m78510c(dl2Var);
                dl2Var = dl2Var2;
            }
            kq2Var2 = kq2Var;
            str2 = str;
            str3 = duc0Var3.f53032c;
            list = lau.f131415a;
            if (str3 == null) {
                if (dl2Var != null) {
                    lm2VarM40679d2 = f3h1.m40679d(dl2Var.f50093b);
                } else {
                    lm2VarM40679d2 = null;
                }
                if (dl2Var != null) {
                    t0d0VarM78508g2 = m78508g(this, dl2Var, null, kq2Var2.f125203c, 1);
                    list3 = null;
                } else {
                    t0d0VarM78508g2 = null;
                    list3 = null;
                }
                String str12 = kq2Var2.f125204d;
                if (lm2VarM40679d2 != null) {
                    obj = lm2VarM40679d2.f134756a;
                } else {
                    obj = list3;
                }
                if (lm2VarM40679d2 != null) {
                    obj2 = lm2VarM40679d2.f134757b;
                } else {
                    obj2 = list3;
                }
                if (lm2VarM40679d2 != null) {
                    obj3 = lm2VarM40679d2.f134758c;
                } else {
                    obj3 = list3;
                }
                if (lm2VarM40679d2 != null) {
                    obj4 = lm2VarM40679d2.f134759d;
                } else {
                    obj4 = list3;
                }
                if (lm2VarM40679d2 != null) {
                    list3 = lm2VarM40679d2.f134760e;
                }
                if (list3 == null) {
                    list = list3;
                }
                if (lm2VarM40679d2 != null) {
                    i2 = lm2VarM40679d2.f134761f;
                } else {
                    i2 = 0;
                }
                return new lwc0(str2, t0d0VarM78508g2, str12, obj, obj2, obj3, obj4, list, i2);
            }
            list2 = null;
            if (dl2Var != null) {
                lm2VarM40679d = f3h1.m40679d(dl2Var.f50093b);
            } else {
                lm2VarM40679d = null;
            }
            if (dl2Var != null) {
                t0d0VarM78508g = m78508g(this, dl2Var, null, kq2Var2.f125203c, 1);
            } else {
                t0d0VarM78508g = null;
            }
            if (t0d0VarM78508g != null) {
                return new uvc0(new IllegalStateException("Received empty response from agent gateway"));
            }
            if (lm2VarM40679d != null) {
                str4 = lm2VarM40679d.f134756a;
            } else {
                str4 = null;
            }
            if (lm2VarM40679d != null) {
                str5 = lm2VarM40679d.f134757b;
            } else {
                str5 = null;
            }
            if (lm2VarM40679d != null) {
                l = lm2VarM40679d.f134758c;
            } else {
                l = null;
            }
            if (lm2VarM40679d != null) {
                r891Var = lm2VarM40679d.f134759d;
            } else {
                r891Var = null;
            }
            if (lm2VarM40679d != null) {
                list2 = lm2VarM40679d.f134760e;
            }
            if (list2 == null) {
                list = list2;
            }
            if (lm2VarM40679d != null) {
                i = lm2VarM40679d.f134761f;
            } else {
                i = 0;
            }
            return new vvc0(t0d0VarM78508g, str4, str5, l, r891Var, list, i);
        } catch (Throwable th) {
            return new uvc0(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    /* JADX INFO: renamed from: f */
    public final qf40 m78513f(String str, ArrayList arrayList) {
        String strValueOf;
        t0d0 t0d0VarM78508g;
        int iNextIndex;
        Collection collection;
        String str2;
        ro80 ro80VarM44508o = geg1.m44508o();
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            String str3 = null;
            if (i < 0) {
                h6f.m46722S();
                throw null;
            }
            im2 im2Var = (im2) obj;
            Long l = im2Var.f103578c;
            if (l != null) {
                strValueOf = l.longValue() + ":" + i;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(i);
                }
            } else {
                strValueOf = String.valueOf(i);
            }
            bn2 bn2Var = im2Var.f103576a;
            if (bn2Var != null && (str2 = bn2Var.f28680a) != null) {
                if (wl51.m88460J0(str2)) {
                    str2 = null;
                }
                if (str2 != null) {
                    ro80VarM44508o.add(new tyc0(null, klh.m56834f(str, ":user:", strValueOf), str2));
                }
            }
            dl2 dl2Var = im2Var.f103577b;
            if (dl2Var != null && (t0d0VarM78508g = m78508g(this, dl2Var, klh.m56834f(str, ":agent:", strValueOf), null, 2)) != null) {
                zo2 zo2Var = t0d0VarM78508g.f215846a;
                if (wl51.m88460J0(nsg1.m65551p(zo2Var)) && ((AbstractC2282q6) nsg1.m65550o(zo2Var)).isEmpty() && ((AbstractC2282q6) nsg1.m65552q(zo2Var)).isEmpty()) {
                    collection = lau.f131415a;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    int i3 = 0;
                    for (pfj pfjVar : zo2Var.f284634b) {
                        if ((pfjVar instanceof mfj) || (pfjVar instanceof lfj)) {
                            arrayList3.add(pfjVar);
                        } else if (pfjVar instanceof ofj) {
                            if (!arrayList3.isEmpty()) {
                                arrayList2.add(m78507a(zo2Var, arrayList3, i3));
                                arrayList3 = new ArrayList();
                                i3++;
                            }
                            String str4 = zo2Var.f284633a;
                            ofj ofjVar = (ofj) pfjVar;
                            qf40 qf40Var = ofjVar.f164773a;
                            ArrayList arrayList4 = new ArrayList();
                            Iterator<E> it = qf40Var.iterator();
                            while (it.hasNext()) {
                                String str5 = str3;
                                abv0 abv0VarM79215s = ssg1.m79215s((String) it.next(), ofjVar.f164775c, ofjVar.f164774b);
                                if (abv0VarM79215s != null) {
                                    arrayList4.add(abv0VarM79215s);
                                }
                                str3 = str5;
                            }
                            arrayList2.add(new oyc0(str4, opo.m67574x(arrayList4)));
                        } else {
                            if (!(pfjVar instanceof nfj)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (!arrayList3.isEmpty()) {
                                arrayList2.add(m78507a(zo2Var, arrayList3, i3));
                                i3++;
                                arrayList3 = new ArrayList();
                            }
                            int i4 = i3;
                            nfj nfjVar = (nfj) pfjVar;
                            arrayList2.add(new syc0(zo2Var.f284633a, i4, nfjVar.f153385a, nfjVar.f153386b, nfjVar.f153387c, nfjVar.f153388d));
                            i3 = i4 + 1;
                        }
                        str3 = str3;
                    }
                    String str6 = str3;
                    if (!arrayList3.isEmpty()) {
                        arrayList2.add(m78507a(zo2Var, arrayList3, i3));
                        i3++;
                    }
                    ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            iNextIndex = -1;
                            break;
                        }
                        if (((uyc0) listIterator.previous()) instanceof nyc0) {
                            iNextIndex = listIterator.nextIndex();
                            break;
                        }
                    }
                    if (iNextIndex >= 0) {
                        nyc0 nyc0Var = (nyc0) arrayList2.get(iNextIndex);
                        arrayList2.set(iNextIndex, nyc0.m65871a(nyc0Var, zo2.m96605a(nyc0Var.f159778a, zo2Var.f284633a, null, false, zo2Var.f284636d, 0L, 54), i3 > 1 ? nsg1.m65551p(zo2Var) : str6, 2));
                    }
                    collection = arrayList2;
                }
                ro80VarM44508o.addAll(collection);
            }
            i = i2;
        }
        return opo.m67574x(geg1.m44506m(ro80VarM44508o));
    }
}
