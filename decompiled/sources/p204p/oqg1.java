package p204p;

import android.app.NotificationManager;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class oqg1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f168291a;

    /* JADX INFO: renamed from: b */
    public static sd40 f168292b;

    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0094  */
    /* JADX WARN: Code duplicated, block: B:46:0x009b  */
    /* JADX WARN: Code duplicated, block: B:47:0x009f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0111  */
    /* JADX WARN: Code duplicated, block: B:51:0x0116  */
    /* JADX WARN: Code duplicated, block: B:54:0x011f  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m67632a(wwu wwuVar, String str, fxh0 fxh0Var, xq00 xq00Var, int i, int i2) {
        int i3;
        fxh0 fxh0Var2;
        int i4;
        boolean z;
        pgv0 pgv0VarM91796v;
        cxh0 cxh0Var;
        fxh0 fxh0Var3;
        irx0 irx0VarM36744a;
        int iHashCode;
        wpn0 wpn0VarM91778m;
        fxh0 fxh0VarM48286s;
        C2087le c2087le;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(63115230);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? xq00Var2.m91766g(wwuVar) : xq00Var2.m91770i(wwuVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= xq00Var2.m91766g(str) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                fxh0Var2 = fxh0Var;
                i3 |= xq00Var2.m91770i(fxh0Var2) ? 256 : 128;
            }
            i4 = i3;
            if ((i4 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (xq00Var2.m91752Y(i4 & 1, z)) {
                cxh0Var = cxh0.f43038a;
                if (i5 != 0) {
                    fxh0Var3 = cxh0Var;
                } else {
                    fxh0Var3 = fxh0Var2;
                }
                fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, fxh0Var3);
                irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46142M0, xq00Var2, 0);
                iHashCode = Long.hashCode(xq00Var2.f264809T);
                wpn0VarM91778m = xq00Var2.m91778m();
                fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM61822f);
                soh.f211194A.getClass();
                c2087le = roh.f201257b;
                if (xq00Var2.f264811a != null) {
                    pmg1.m70360s();
                    throw null;
                }
                xq00Var2.m91779m0();
                if (xq00Var2.f264808S) {
                    xq00Var2.m91776l(c2087le);
                } else {
                    xq00Var2.m91799w0();
                }
                zsf1.m96835F(irx0VarM36744a, roh.f201262g, xq00Var2);
                zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var2);
                zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var2);
                zsf1.m96833D(roh.f201266k, xq00Var2);
                zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var2);
                fxh0 fxh0Var4 = fxh0Var3;
                y85.m93057b(wwuVar, qgj.f188480a, null, 0L, 0L, false, xq00Var2, 56 | (i4 & 14), 60);
                if71 if71Var = fr0.m42472p(cxh0Var, leu.m58816b(xq00Var2).f117230b.f224762e, xq00Var2, xq00Var2).f64974j;
                xq00Var2 = xq00Var;
                ahf1.m25932d(str, mi21.m61822f(1.0f, cxh0Var), if71Var, 0L, null, null, 0, false, null, 0, null, xq00Var2, (i4 >> 3) & 14, 0, 2040);
                xq00Var2.m91788r(true);
                fxh0Var2 = fxh0Var4;
            } else {
                xq00Var2.m91757b0();
            }
            pgv0VarM91796v = xq00Var2.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new y70(wwuVar, str, fxh0Var2, i, i2, 7);
            }
        }
        i3 |= 384;
        fxh0Var2 = fxh0Var;
        i4 = i3;
        if ((i4 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq00Var2.m91752Y(i4 & 1, z)) {
            cxh0Var = cxh0.f43038a;
            if (i5 != 0) {
                fxh0Var3 = cxh0Var;
            } else {
                fxh0Var3 = fxh0Var2;
            }
            fxh0 fxh0VarM61822f2 = mi21.m61822f(1.0f, fxh0Var3);
            irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46142M0, xq00Var2, 0);
            iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0VarM91778m = xq00Var2.m91778m();
            fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM61822f2);
            soh.f211194A.getClass();
            c2087le = roh.f201257b;
            if (xq00Var2.f264811a != null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(irx0VarM36744a, roh.f201262g, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var2);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var2);
            zsf1.m96833D(roh.f201266k, xq00Var2);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var2);
            fxh0 fxh0Var5 = fxh0Var3;
            y85.m93057b(wwuVar, qgj.f188480a, null, 0L, 0L, false, xq00Var2, 56 | (i4 & 14), 60);
            if71 if71Var2 = fr0.m42472p(cxh0Var, leu.m58816b(xq00Var2).f117230b.f224762e, xq00Var2, xq00Var2).f64974j;
            xq00Var2 = xq00Var;
            ahf1.m25932d(str, mi21.m61822f(1.0f, cxh0Var), if71Var2, 0L, null, null, 0, false, null, 0, null, xq00Var2, (i4 >> 3) & 14, 0, 2040);
            xq00Var2.m91788r(true);
            fxh0Var2 = fxh0Var5;
        } else {
            xq00Var2.m91757b0();
        }
        pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new y70(wwuVar, str, fxh0Var2, i, i2, 7);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m67633b(j8c1 j8c1Var, boolean z, eh00 eh00Var, eh00 eh00Var2, eh00 eh00Var3, eh00 eh00Var4, fxh0 fxh0Var, boolean z2, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        boolean z3;
        xq00Var.m91775k0(1882685715);
        int i2 = i | (xq00Var.m91766g(j8c1Var) ? 4 : 2) | (xq00Var.m91768h(z) ? 32 : 16) | (xq00Var.m91770i(eh00Var) ? 256 : 128) | (xq00Var.m91770i(eh00Var2) ? 2048 : 1024) | (xq00Var.m91770i(eh00Var3) ? 16384 : 8192) | (xq00Var.m91770i(eh00Var4) ? 131072 : 65536) | 14155776;
        if (xq00Var.m91752Y(i2 & 1, (4793491 & i2) != 4793490)) {
            WeakHashMap weakHashMap = cxd1.f42984x;
            ni80 ni80Var = new ni80(bxd1.m30815d(xq00Var).f42991g, 32);
            fyf fyfVarM75772x = rkk.m75772x(1219591232, new ut21(11, eh00Var4), xq00Var);
            fyf fyfVarM75772x2 = rkk.m75772x(997639482, new sf1(z, j8c1Var, eh00Var, eh00Var2, eh00Var3, 17), xq00Var);
            fxh0Var2 = cxh0.f43038a;
            vig1.m85649d(fxh0Var2, fyfVarM75772x, null, ni80Var, fyfVarM75772x2, xq00Var, 24630, 4);
            z3 = true;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
            z3 = z2;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new pwj(j8c1Var, z, eh00Var, eh00Var2, eh00Var3, eh00Var4, fxh0Var2, z3, i);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m67634c(qf40 qf40Var, y0o y0oVar, xq00 xq00Var, int i) {
        int i2;
        xq00 xq00Var2;
        xq00Var.m91775k0(429904708);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(qf40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? xq00Var.m91766g(y0oVar) : xq00Var.m91770i(y0oVar) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            oge0 oge0VarMo29871c = ((rmm0) xq00Var.m91774k(q6m0.f185862a)).mo29871c();
            Object objM91750T = xq00Var.m91750T();
            ia7 ia7Var = t6x0.f217647t;
            if (objM91750T == ia7Var) {
                umn umnVar = (umn) y0oVar.f268032a.f171807c;
                objM91750T = new czt0((n6q) ((h4t0) umnVar.f231916c).get(), (z0o) ((h4t0) umnVar.f231920g).get(), (f9h0) ((h4t0) umnVar.f231919f).get());
                xq00Var.m91793t0(objM91750T);
            }
            czt0 czt0Var = (czt0) objM91750T;
            boolean zM91770i = xq00Var.m91770i(oge0VarMo29871c);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91770i || objM91750T2 == ia7Var) {
                objM91750T2 = new oca(oge0VarMo29871c, 5);
                xq00Var.m91793t0(objM91750T2);
            }
            xq00Var2 = xq00Var;
            mif1.m61869b(czt0Var, new bzt0(qf40Var, (gh00) objM91750T2), null, null, xq00Var2, 0, 12);
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new sqq0(qf40Var, y0oVar, i, 22);
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m67635d(NotificationManager notificationManager) {
        return notificationManager.areNotificationsEnabled();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public static final Object m67636e(oq60 oq60Var, Object[] objArr, ibk ibkVar) {
        tp60 tp60Var;
        if (ibkVar instanceof tp60) {
            tp60Var = (tp60) ibkVar;
            int i = tp60Var.f222447d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tp60Var.f222447d = i - Integer.MIN_VALUE;
            } else {
                tp60Var = new tp60(ibkVar);
            }
        } else {
            tp60Var = new tp60(ibkVar);
        }
        Object objMo36585j = tp60Var.f222446c;
        int i2 = tp60Var.f222447d;
        if (i2 == 0) {
            bga.m29073P(objMo36585j);
            if (!oq60Var.mo25529h()) {
                return oq60Var.mo36585j(Arrays.copyOf(objArr, objArr.length));
            }
            tp60Var.f222444a = oq60Var;
            tp60Var.f222445b = objArr;
            tp60Var.f222447d = 1;
            mbq mbqVar = new mbq(2);
            mbqVar.m61422c(objArr);
            mbqVar.m61421b(tp60Var);
            ArrayList arrayList = mbqVar.f141956a;
            objMo36585j = oq60Var.mo36585j(arrayList.toArray(new Object[arrayList.size()]));
            yuk yukVar = yuk.f276404a;
            if (objMo36585j == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq60Var = tp60Var.f222444a;
            bga.m29073P(objMo36585j);
        }
        return (!wj50.m88271j(oq60Var.mo25530i().mo27067y(), qpv0.f191387a.mo54112b(w2a1.class)) || oq60Var.mo25530i().mo27066q()) ? objMo36585j : w2a1.f247311a;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m67637f(AbstractC2404t8 abstractC2404t8, Map.Entry entry) {
        V v = abstractC2404t8.get(entry.getKey());
        Boolean boolValueOf = v == 0 ? null : Boolean.valueOf(v.equals(entry.getValue()));
        if (boolValueOf == null) {
            return entry.getValue() == null && abstractC2404t8.containsKey(entry.getKey());
        }
        return boolValueOf.booleanValue();
    }

    /* JADX INFO: renamed from: g */
    public static tj01 m67638g(ho01 ho01Var) {
        if (ho01Var instanceof ud51) {
            return tj01.IMAGE_STORY;
        }
        if (ho01Var instanceof td51) {
            return tj01.GRADIENT_STORY;
        }
        if (ho01Var instanceof vd51) {
            return tj01.VIDEO_STORY;
        }
        if (ho01Var instanceof lc40) {
            return tj01.IMAGE;
        }
        boolean z = ho01Var instanceof bve0;
        tj01 tj01Var = tj01.LINK;
        if (z) {
            String str = ((bve0) ho01Var).f31344b;
            return (str == null || wl51.m88460J0(str)) ? tj01Var : tj01.MESSAGE;
        }
        if (ho01Var instanceof an80) {
            return tj01Var;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static final Object m67639h(osh oshVar, v3t0 v3t0Var) {
        if (!((exh0) oshVar).f63770a.f63766L0) {
            mt40.m62791c("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        vpn0 vpn0Var = (vpn0) wjg1.m88319I(oshVar).f135670a1;
        vpn0Var.getClass();
        return rqg1.m76244o(vpn0Var, v3t0Var);
    }

    /* JADX INFO: renamed from: i */
    public static int m67640i(Parcelable parcelable) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.dataSize();
        } finally {
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: j */
    public static yfr m67641j(String str) {
        Object next;
        C2042k7 c2042k7 = new C2042k7(yfr.f272322i, 0);
        do {
            if (!c2042k7.hasNext()) {
                next = null;
                break;
            }
            next = c2042k7.next();
        } while (!bm51.m29797h0(((yfr) next).name(), str, true));
        yfr yfrVar = (yfr) next;
        return yfrVar == null ? yfr.f272314a : yfrVar;
    }

    /* JADX INFO: renamed from: k */
    public static final ArrayList m67642k(rp60 rp60Var) {
        List listMo25528e = rp60Var.mo25528e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listMo25528e) {
            if (((hr60) obj).getKind() == 4) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public static void m67643l(Status status, Object obj, ev61 ev61Var) {
        if (status.m1489k()) {
            ev61Var.m40097b(obj);
        } else {
            ev61Var.m40096a(uqe1.m83767f(status));
        }
    }

    /* JADX INFO: renamed from: m */
    public static final pi1 m67644m(hcv hcvVar) {
        return new pi1(hcvVar.f89914a ? qi1.f188893b : qi1.f188892a, false, null, null, null, 30);
    }

    /* JADX INFO: renamed from: n */
    public static final u2s m67645n(ecv ecvVar) {
        return new u2s(ecvVar.f58392a, null, null, null, 14);
    }

    /* JADX INFO: renamed from: o */
    public static final jeo0 m67646o(gcv gcvVar) {
        int i = gcvVar.f78659a;
        int i2 = 1;
        boolean z = i == 2;
        int iM38547C = edb.m38547C(i);
        int i3 = 4;
        if (iM38547C != 0) {
            if (iM38547C != 1) {
                i2 = 3;
                if (iM38547C != 2) {
                    if (iM38547C != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = 4;
                }
            } else {
                i2 = 2;
            }
        }
        return new jeo0(z, new ago0(i2), null, i3);
    }

    /* JADX INFO: renamed from: p */
    public static final Bundle m67647p() {
        Bundle bundleM93449h = ydj.m93449h("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_SERVER_CLIENT_ID", "1046568431490-ij1gi5shcp2gtorls09frkc56d4mjbe2.apps.googleusercontent.com", "com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_NONCE", null);
        bundleM93449h.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_HOSTED_DOMAIN_FILTER", null);
        bundleM93449h.putBoolean("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_AUTO_SELECT_ENABLED", true);
        bundleM93449h.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GOOGLE_ID_TOKEN_SUBTYPE", "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_SIWG_CREDENTIAL");
        return bundleM93449h;
    }
}
