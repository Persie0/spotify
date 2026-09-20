package p204p;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import com.comscore.streaming.ContentType;
import com.spotify.concertcampaignview.p047v1.CtaType;
import com.spotify.music.R;
import com.spotify.notifications.notificationsettings.NotificationCategory;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class arg1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f19061a = null;

    /* JADX INFO: renamed from: b */
    public static sd40 f19062b = null;

    /* JADX INFO: renamed from: c */
    public static boolean f19063c = false;

    /* JADX INFO: renamed from: d */
    public static Method f19064d = null;

    /* JADX INFO: renamed from: e */
    public static boolean f19065e = false;

    /* JADX INFO: renamed from: f */
    public static Field f19066f;

    /* JADX INFO: renamed from: a */
    public static final void m26933a(eh00 eh00Var, eh00 eh00Var2, xq00 xq00Var, int i) {
        eh00 eh00Var3;
        xq00 xq00Var2;
        xq00Var.m91775k0(1890581312);
        int i2 = (xq00Var.m91770i(eh00Var) ? 4 : 2) | i | (xq00Var.m91770i(eh00Var2) ? 32 : 16);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            String strM54977L = k0e1.m54977L(R.string.onboarding_discard_changes_dialog_title, xq00Var);
            String strM54977L2 = k0e1.m54977L(R.string.onboarding_discard_changes_dialog_message, xq00Var);
            String strM54977L3 = k0e1.m54977L(R.string.onboarding_discard_changes_dialog_keep_editing, xq00Var);
            u40 u40Var = u40.f226523c;
            eh00Var3 = eh00Var;
            xq00Var2 = xq00Var;
            kku.m56741a(eh00Var3, null, null, strM54977L, strM54977L2, new gku(strM54977L3, new peu(u40Var, eh00Var)), new gku(k0e1.m54977L(R.string.onboarding_discard_changes_dialog_discard, xq00Var), new peu(u40Var, eh00Var2)), xq00Var2, (i2 & 14) | 2359296, 6);
        } else {
            eh00Var3 = eh00Var;
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new igb(eh00Var3, eh00Var2, i, 13);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m26934b(eh00 eh00Var, k7i0 k7i0Var, eh00 eh00Var2, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var2;
        Object obj = t6x0.f217647t;
        xq00Var.m91775k0(-559267341);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(eh00Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(k7i0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(eh00Var2) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 1171) != 1170)) {
            s9p0 s9p0Var = (s9p0) eh00Var.invoke();
            cxh0 cxh0Var = cxh0.f43038a;
            if (s9p0Var == null) {
                xq00Var.m91771i0(-954991346);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-954991345);
                rv41 rv41VarM44039o = g9g1.m44039o(s9p0Var, xq00Var);
                Object obj2 = (lg21) rv41VarM44039o.getValue();
                boolean zM91770i = xq00Var.m91770i(obj2);
                Object objM91750T = xq00Var.m91750T();
                if (zM91770i || objM91750T == obj) {
                    objM91750T = new r0c1(obj2, 9);
                    xq00Var.m91793t0(objM91750T);
                }
                hz40.m49233e(obj2, (gh00) objM91750T, xq00Var);
                boolean zM91770i2 = xq00Var.m91770i(obj2) | xq00Var.m91770i(k7i0Var);
                Object objM91750T2 = xq00Var.m91750T();
                if (zM91770i2 || objM91750T2 == obj) {
                    objM91750T2 = new zm81(obj2, k7i0Var, null, 23);
                    xq00Var.m91793t0(objM91750T2);
                }
                hz40.m49237i(obj2, (th00) objM91750T2, xq00Var);
                boolean z = (i3 & 896) == 256;
                Object objM91750T3 = xq00Var.m91750T();
                if (z || objM91750T3 == obj) {
                    objM91750T3 = new vm01(19, eh00Var2);
                    xq00Var.m91793t0(objM91750T3);
                }
                gh00 gh00Var = (gh00) objM91750T3;
                fxh0 fxh0VarM61820d = mi21.m61820d(1.0f, cxh0Var);
                boolean zM91770i3 = xq00Var.m91770i(rv41VarM44039o);
                Object objM91750T4 = xq00Var.m91750T();
                if (zM91770i3 || objM91750T4 == obj) {
                    objM91750T4 = new li71(rv41VarM44039o, 2);
                    xq00Var.m91793t0(objM91750T4);
                }
                g0b1.m43261b(gh00Var, fxh0VarM61820d, (gh00) objM91750T4, xq00Var, 0, 0);
                xq00Var.m91788r(false);
            }
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new br91(eh00Var, k7i0Var, eh00Var2, fxh0Var2, i, 17);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m26935c(int i, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        int i2;
        xq00Var.m91775k0(-907546017);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(fxh0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(eh00Var) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            fxh0 fxh0VarM64246i = nec.m64246i(hqg1.m48273f(epv0.m39673I("ShareCardError", fxh0Var), x4g0.f258113g), leu.m58815a(xq00Var).f112823a.f229875b.f123094b, kxf1.f127485a);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46174i, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM64246i);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            int i3 = i2;
            kuu kuuVar = kuu.f126680c;
            rgj rgjVar = new rgj(k0e1.m54977L(R.string.accessibility_label_retry_button, xq00Var));
            boolean z = false;
            long j = n6f.f150866f;
            fxh0 fxh0VarM61834r = mi21.m61834r(leu.m58816b(xq00Var).f117232d.f137886b, cxh0.f43038a);
            if ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 32) {
                z = true;
            }
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new l2z0(15, eh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            y85.m93057b(kuuVar, rgjVar, hdi.m47247x(fxh0VarM61834r, false, null, null, null, (eh00) objM91750T, 15), j, 0L, false, xq00Var, kuu.f126681d | 3072, 48);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new euu0(fxh0Var, eh00Var, i);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m26936d(qcc1 qcc1Var, eh00 eh00Var, boolean z, boolean z2, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        eh00 eh00Var2;
        kqi0 kqi0Var;
        int i3;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(-1639909801);
        if ((i & 6) == 0) {
            i2 = (xq00Var2.m91770i(qcc1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            eh00Var2 = eh00Var;
            i2 |= xq00Var2.m91770i(eh00Var2) ? 32 : 16;
        } else {
            eh00Var2 = eh00Var;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var2.m91768h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var2.m91768h(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var2.m91770i(fxh0Var) ? 16384 : 8192;
        }
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z3 = z2 && z;
            Object objM91750T = xq00Var2.m91750T();
            ia7 ia7Var = t6x0.f217647t;
            if (objM91750T == ia7Var) {
                objM91750T = sam.m77645B(Boolean.FALSE);
                xq00Var2.m91793t0(objM91750T);
            }
            kqi0 kqi0Var2 = (kqi0) objM91750T;
            fxh0 fxh0VarM39673I = epv0.m39673I("VerticalVideoUI", fxh0Var);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM39673I);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            int i4 = i2;
            if (xq00Var2.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var2);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var2);
            zsf1.m96833D(roh.f201266k, xq00Var2);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var2);
            if (z3) {
                xq00Var2.m91771i0(-1945131716);
                k7i0 k7i0Var = qcc1Var.f187306b;
                boolean zM91770i = xq00Var2.m91770i(kqi0Var2);
                Object objM91750T2 = xq00Var2.m91750T();
                if (zM91770i || objM91750T2 == ia7Var) {
                    objM91750T2 = new spb1(kqi0Var2, 3);
                    xq00Var2.m91793t0(objM91750T2);
                }
                kqi0Var = kqi0Var2;
                m26934b(eh00Var2, k7i0Var, (eh00) objM91750T2, null, xq00Var2, (i4 >> 3) & 14);
                i3 = 0;
                xq00Var2.m91788r(false);
            } else {
                kqi0Var = kqi0Var2;
                i3 = 0;
                xq00Var2.m91771i0(-1944931456);
                xq00Var2.m91788r(false);
                kqi0Var.setValue(Boolean.FALSE);
            }
            z96.m95630j(!((Boolean) kqi0Var.getValue()).booleanValue(), null, kbv.m55958d(jg31.m53259E(250, i3, null, 6), 2), kbv.m55959e(jg31.m53259E(CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER, i3, null, 6), 2), null, rkk.m75772x(-1768502987, new s8b1(qcc1Var, 25), xq00Var2), xq00Var, 196608, 18);
            xq00Var2 = xq00Var;
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C1794dy(i, 12, qcc1Var, eh00Var, fxh0Var, z, z2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m26937e(int i, String str, xq00 xq00Var) {
        int i2;
        xq00Var.m91775k0(2001815195);
        int i3 = i & 6;
        pha phaVar = pha.f177517a;
        if (i3 == 0) {
            i2 = (xq00Var.m91770i(phaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(str) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            l0y0.m57821c(Uri.parse(str), qgj.f188480a, phaVar.mo66945a(mi21.m61820d(1.0f, cxh0.f43038a), d7f0.f46174i), null, null, null, null, null, null, null, false, false, xq00Var, 224304, 0, 4032);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ttk0((char) 0, i, 13, str);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final String m26938f(e1i e1iVar) {
        String str;
        c1i c1iVar = e1iVar instanceof c1i ? (c1i) e1iVar : null;
        return (c1iVar == null || (str = c1iVar.f33099B) == null) ? e1iVar.getUri() : str;
    }

    /* JADX INFO: renamed from: g */
    public static final cbm0 m26939g(xxm0 xxm0Var, String str) {
        int iOrdinal = xxm0Var.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
            return xgg1.m90662N1("KID_ACCOUNT_TRANSITION_ENTRY", "kid-account-transition/entry", 868, "kid-account-transition");
        }
        if (iOrdinal == 2) {
            AtomicReferenceArray atomicReferenceArray2 = cbm0.f36163e;
            return xgg1.m90662N1("KID_ACCOUNT_CREATION_ENTRY", "kid-account-creation/entry", 854, "kid-account-creation");
        }
        if (iOrdinal != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (str != null) {
            AtomicReferenceArray atomicReferenceArray3 = cbm0.f36163e;
            return xgg1.m90662N1("KID_ACCOUNT_TRANSITION_ENTRY", "kid-account-transition/entry", 868, "kid-account-transition");
        }
        AtomicReferenceArray atomicReferenceArray4 = cbm0.f36163e;
        return xgg1.m90662N1("KID_ACCOUNT_CREATION_ENTRY", "kid-account-creation/entry", 854, "kid-account-creation");
    }

    /* JADX WARN: Code duplicated, block: B:45:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0072  */
    /* JADX WARN: Code duplicated, block: B:49:0x0075  */
    /* JADX WARN: Code duplicated, block: B:51:0x0078  */
    /* JADX WARN: Code duplicated, block: B:54:0x007c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0082  */
    /* JADX WARN: Code duplicated, block: B:57:0x0085  */
    /* JADX WARN: Code duplicated, block: B:58:0x0088  */
    /* JADX WARN: Code duplicated, block: B:59:0x008b  */
    /* JADX WARN: Code duplicated, block: B:60:0x008e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0097  */
    /* JADX INFO: renamed from: h */
    public static final String m26940h(e1i e1iVar) {
        String str;
        int iOrdinal;
        c1i c1iVar = e1iVar instanceof c1i ? (c1i) e1iVar : null;
        String str2 = "";
        if (c1iVar == null) {
            return "";
        }
        cjb cjbVar = c1iVar.f33114n;
        if (cjbVar instanceof yib) {
            str2 = "reserved";
        } else if (cjbVar instanceof vib) {
            str2 = "fcfs";
        } else if (cjbVar instanceof ajb) {
            str2 = "waitlistable";
        } else if (cjbVar instanceof bjb) {
            str2 = "waitlisted";
        } else if (cjbVar instanceof wib) {
            str2 = "ineligible";
        } else if (cjbVar instanceof xib) {
            str2 = "purchased";
        } else if (wj50.m88271j(cjbVar, zib.f283125a)) {
            str2 = "unknown";
        } else if (cjbVar != null) {
            throw new NoWhenBranchMatchedException();
        }
        int iM38547C = edb.m38547C(c1iVar.f33117q);
        if (iM38547C == 0) {
            if (c1iVar.f33122v != 2 || !c1iVar.f33125y) {
                iOrdinal = c1iVar.f33110j.ordinal();
                if (iOrdinal != 0) {
                    str = "learn_more";
                } else if (iOrdinal != 1) {
                    str = "see_tickets";
                } else if (iOrdinal != 2) {
                    str = "join_waitlist";
                } else if (iOrdinal != 3) {
                    str = "joined_waitlist";
                } else if (iOrdinal != 4) {
                    str = "view";
                } else if (iOrdinal != 5) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return g6f.m43753y0(bk5.m29582E0(new String[]{str2.length() != 0 ? str2 : null, str}), "|", null, null, null, 62);
        }
        if (iM38547C != 1) {
            if (iM38547C != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iOrdinal = c1iVar.f33110j.ordinal();
            if (iOrdinal != 0) {
                str = "learn_more";
            } else if (iOrdinal != 1) {
                str = "see_tickets";
            } else if (iOrdinal != 2) {
                str = "join_waitlist";
            } else if (iOrdinal != 3) {
                str = "joined_waitlist";
            } else if (iOrdinal != 4) {
                str = "view";
            } else if (iOrdinal != 5) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return g6f.m43753y0(bk5.m29582E0(new String[]{str2.length() != 0 ? str2 : null, str}), "|", null, null, null, 62);
        str = null;
        return g6f.m43753y0(bk5.m29582E0(new String[]{str2.length() != 0 ? str2 : null, str}), "|", null, null, null, 62);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m26941i(View view, KeyEvent keyEvent) {
        WeakReference weakReference;
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = mec1.f142677a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        lec1 lec1VarM58776a = lec1.m58776a(view);
        WeakReference weakReference2 = lec1VarM58776a.f132518c;
        if (weakReference2 == null || weakReference2.get() != keyEvent) {
            lec1VarM58776a.f132518c = new WeakReference(keyEvent);
            if (lec1VarM58776a.f132517b == null) {
                lec1VarM58776a.f132517b = new SparseArray();
            }
            SparseArray sparseArray = lec1VarM58776a.f132517b;
            if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
                sparseArray.removeAt(iIndexOfKey);
            }
            if (weakReference == null) {
                weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
            }
            if (weakReference != null) {
                View view2 = (View) weakReference.get();
                if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                    return true;
                }
                arrayList.get(size).getClass();
                throw new ClassCastException();
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fe  */
    /* JADX INFO: renamed from: j */
    public static boolean m26942j(fu60 fu60Var, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue;
        if (fu60Var != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                return fu60Var.mo30683B(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f19063c) {
                            try {
                                f19064d = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f19063c = true;
                        }
                        Method method = f19064d;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                if (objInvoke == null) {
                                    zBooleanValue = false;
                                } else {
                                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        } else {
                            zBooleanValue = false;
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                WeakHashMap weakHashMap = mec1.f142677a;
                if (Build.VERSION.SDK_INT < 28 ? lec1.m58776a(decorView).m58777b(decorView, keyEvent) : false) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (!(callback instanceof Dialog)) {
                if (view != null) {
                    WeakHashMap weakHashMap2 = mec1.f142677a;
                    if (!(i >= 28 ? false : lec1.m58776a(view).m58777b(view, keyEvent))) {
                        if (fu60Var.mo30683B(keyEvent)) {
                        }
                    }
                } else if (fu60Var.mo30683B(keyEvent)) {
                }
                return true;
            }
            Dialog dialog = (Dialog) callback;
            if (!f19065e) {
                try {
                    Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                    f19066f = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused3) {
                }
                f19065e = true;
            }
            Field field = f19066f;
            if (field != null) {
                try {
                    onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                } catch (IllegalAccessException unused4) {
                    onKeyListener = null;
                }
            } else {
                onKeyListener = null;
            }
            if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                return true;
            }
            Window window2 = dialog.getWindow();
            if (window2.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView2 = window2.getDecorView();
            WeakHashMap weakHashMap3 = mec1.f142677a;
            if (Build.VERSION.SDK_INT < 28 ? lec1.m58776a(decorView2).m58777b(decorView2, keyEvent) : false) {
                return true;
            }
            return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static ywg1 m26943k(float f, Context context) {
        boolean z = context.getResources().getConfiguration().fontScale > 1.4f;
        if (ybs.m93300a(f, 138) < 0) {
            return bba.f25491b;
        }
        float f2 = 300;
        return (ybs.m93300a(f, f2) < 0 || (ybs.m93300a(f, f2) >= 0 && z)) ? new aba(0.35f) : new aba(0.6f);
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m26944l(String str) {
        lzv entries = NotificationCategory.getEntries();
        if (entries != null && entries.isEmpty()) {
            return false;
        }
        Iterator<E> it = entries.iterator();
        while (it.hasNext()) {
            if (wj50.m88271j(((NotificationCategory) it.next()).getKey(), str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static qr8 m26945m(ioo iooVar) {
        return new qr8(0, iooVar);
    }

    /* JADX INFO: renamed from: n */
    public static qr8 m26946n(ioo iooVar) {
        return new qr8(1, iooVar);
    }

    /* JADX INFO: renamed from: o */
    public static ji10 m26947o(View view, Class cls) {
        view.getClass();
        ji10 ji10Var = (ji10) cls.cast(view.getTag(R.id.glue_viewholder_tag));
        if (ji10Var != null) {
            return ji10Var;
        }
        throw new IllegalStateException("This view doesn't have a GlueViewBinder associated with it. Have you called GlueViewBinders.save()?");
    }

    /* JADX INFO: renamed from: p */
    public static final void m26948p(int i) {
        k0e1.m54975J(i, "BetamaxPlayerPool.MaxSize");
    }

    /* JADX INFO: renamed from: q */
    public static final void m26949q(int i, String str) {
        m26950r(str);
        k0e1.m54975J(i, "BetamaxPlayerPool.RetainedPlayerCount");
    }

    /* JADX INFO: renamed from: r */
    public static final void m26950r(String str) {
        fn1.m42176e(k0e1.m54980O(str));
        fn1.m42178g();
    }
}
