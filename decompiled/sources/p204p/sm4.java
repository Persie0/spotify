package p204p;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import com.comscore.streaming.ContentType;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public abstract class sm4 {

    /* JADX INFO: renamed from: a */
    public static final bns f210562a = new bns(l12.f128582Y0);

    /* JADX INFO: renamed from: b */
    public static final bns f210563b = new bns(l12.f128580X0);

    /* JADX WARN: Code duplicated, block: B:102:0x0234  */
    /* JADX WARN: Code duplicated, block: B:104:0x023b  */
    /* JADX WARN: Code duplicated, block: B:105:0x023f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0266  */
    /* JADX WARN: Code duplicated, block: B:109:0x026a  */
    /* JADX WARN: Code duplicated, block: B:112:0x0274  */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x00af  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:54:0x0110  */
    /* JADX WARN: Code duplicated, block: B:55:0x0112  */
    /* JADX WARN: Code duplicated, block: B:58:0x011b  */
    /* JADX WARN: Code duplicated, block: B:59:0x011d  */
    /* JADX WARN: Code duplicated, block: B:65:0x013a  */
    /* JADX WARN: Code duplicated, block: B:68:0x015e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0160  */
    /* JADX WARN: Code duplicated, block: B:72:0x0168  */
    /* JADX WARN: Code duplicated, block: B:73:0x016a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0187  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:91:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:99:0x0210  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Throwable, p.fbk] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX INFO: renamed from: a */
    public static final void m78514a(qaq0 qaq0Var, eh00 eh00Var, raq0 raq0Var, fyf fyfVar, xq00 xq00Var, int i, int i2) {
        int i3;
        eh00 eh00Var2;
        raq0 raq0Var2;
        int i4;
        boolean z;
        eh00 eh00Var3;
        pgv0 pgv0VarM91796v;
        eh00 eh00Var4;
        View view;
        yqq yqqVar;
        String str;
        ko70 ko70Var;
        vq00 vq00VarM70361t;
        kqi0 kqi0VarM77651H;
        Object objM91750T;
        Object obj;
        UUID uuid;
        boolean zBooleanValue;
        Object objM91750T2;
        String str2;
        ?? r10;
        boolean z2;
        maq0 maq0Var;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        boolean zM91766g;
        Object objM91750T3;
        maq0 maq0Var2;
        boolean z5;
        boolean z6;
        boolean zM91766g2;
        Object objM91750T4;
        boolean z7;
        boolean z8;
        Object objM91750T5;
        boolean zM91770i;
        Object objM91750T6;
        boolean zM91770i2;
        Object objM91750T7;
        boolean zM91770i3;
        Object objM91750T8;
        m6d0 m6d0Var;
        int iHashCode;
        wpn0 wpn0VarM91778m;
        fxh0 fxh0VarM48286s;
        eh00 eh00Var5;
        int i7;
        int i8;
        qaq0 qaq0Var2 = qaq0Var;
        xq00Var.m91775k0(-1772091631);
        if ((i & 6) == 0) {
            i3 = (xq00Var.m91766g(qaq0Var2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 48) == 0) {
                eh00Var2 = eh00Var;
                i3 |= xq00Var.m91770i(eh00Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                raq0Var2 = raq0Var;
                if (xq00Var.m91766g(raq0Var2)) {
                    i8 = 256;
                } else {
                    i8 = 128;
                }
                i3 |= i8;
            } else {
                raq0Var2 = raq0Var;
            }
            if ((i & 3072) == 0) {
                if (xq00Var.m91770i(fyfVar)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i4 = i3;
            if ((i4 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (xq00Var.m91752Y(i4 & 1, z)) {
                if (i9 != 0) {
                    eh00Var4 = null;
                } else {
                    eh00Var4 = eh00Var2;
                }
                view = (View) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f506f);
                yqqVar = (yqq) xq00Var.m91774k(wsh.f254617h);
                str = (String) xq00Var.m91774k(f210562a);
                ko70Var = (ko70) xq00Var.m91774k(wsh.f254623n);
                vq00VarM70361t = pmg1.m70361t(xq00Var);
                kqi0VarM77651H = sam.m77651H(fyfVar, xq00Var);
                Object[] objArr = new Object[0];
                objM91750T = xq00Var.m91750T();
                obj = t6x0.f217647t;
                if (objM91750T == obj) {
                    objM91750T = l12.f128584Z0;
                    xq00Var.m91793t0(objM91750T);
                }
                uuid = (UUID) dul.m37018u(objArr, (eh00) objM91750T, xq00Var, 48);
                zBooleanValue = ((Boolean) xq00Var.m91774k(f210563b)).booleanValue();
                objM91750T2 = xq00Var.m91750T();
                if (objM91750T2 == obj) {
                    str2 = str;
                    r10 = 0;
                    z2 = false;
                    maq0 maq0Var3 = new maq0(eh00Var4, raq0Var2, str2, view, yqqVar, qaq0Var2, uuid, zBooleanValue);
                    qaq0Var2 = qaq0Var2;
                    maq0Var3.m61327v(vq00VarM70361t, new fyf(new rm4(maq0Var3, kqi0VarM77651H, 1), true, -297523940));
                    xq00Var.m91793t0(maq0Var3);
                    objM91750T2 = maq0Var3;
                } else {
                    str2 = str;
                    r10 = 0;
                    z2 = false;
                }
                maq0Var = (maq0) objM91750T2;
                boolean zM91770i4 = xq00Var.m91770i(maq0Var);
                i5 = i4 & ContentType.LONG_FORM_ON_DEMAND;
                if (i5 == 32) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                boolean z9 = zM91770i4 | z3;
                i6 = i4 & 896;
                if (i6 == 256) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                zM91766g = z9 | z4 | xq00Var.m91766g(str2) | xq00Var.m91762e(ko70Var.ordinal());
                objM91750T3 = xq00Var.m91750T();
                if (!zM91766g || objM91750T3 == obj) {
                    eh00 eh00Var6 = eh00Var4;
                    Object rg0Var = new rg0(1, maq0Var, eh00Var6, raq0Var, ko70Var, str2);
                    maq0Var2 = maq0Var;
                    eh00Var4 = eh00Var6;
                    xq00Var.m91793t0(rg0Var);
                    objM91750T3 = rg0Var;
                } else {
                    maq0Var2 = maq0Var;
                }
                hz40.m49233e(maq0Var2, (gh00) objM91750T3, xq00Var);
                boolean zM91770i5 = xq00Var.m91770i(maq0Var2);
                if (i5 == 32) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                boolean z10 = zM91770i5 | z5;
                if (i6 == 256) {
                    z6 = true;
                } else {
                    z6 = z2;
                }
                zM91766g2 = z10 | z6 | xq00Var.m91766g(str2) | xq00Var.m91762e(ko70Var.ordinal());
                objM91750T4 = xq00Var.m91750T();
                if (zM91766g2 || objM91750T4 == obj) {
                    Object mm4Var = new mm4(maq0Var2, eh00Var4, raq0Var, str2, ko70Var, 0);
                    xq00Var.m91793t0(mm4Var);
                    objM91750T4 = mm4Var;
                }
                hz40.m49245q((eh00) objM91750T4, xq00Var);
                boolean zM91770i6 = xq00Var.m91770i(maq0Var2);
                if ((i4 & 14) == 4) {
                    z7 = true;
                } else {
                    z7 = z2;
                }
                z8 = zM91770i6 | z7;
                objM91750T5 = xq00Var.m91750T();
                if (z8 || objM91750T5 == obj) {
                    objM91750T5 = new n62(18, maq0Var2, qaq0Var2);
                    xq00Var.m91793t0(objM91750T5);
                }
                hz40.m49233e(qaq0Var2, (gh00) objM91750T5, xq00Var);
                zM91770i = xq00Var.m91770i(maq0Var2);
                objM91750T6 = xq00Var.m91750T();
                if (zM91770i || objM91750T6 == obj) {
                    objM91750T6 = new fa2(maq0Var2, r10, 28);
                    xq00Var.m91793t0(objM91750T6);
                }
                hz40.m49237i(maq0Var2, (th00) objM91750T6, xq00Var);
                zM91770i2 = xq00Var.m91770i(maq0Var2);
                objM91750T7 = xq00Var.m91750T();
                if (zM91770i2 || objM91750T7 == obj) {
                    objM91750T7 = new om4(maq0Var2, 0);
                    xq00Var.m91793t0(objM91750T7);
                }
                fxh0 fxh0VarM85877w = vkf1.m85877w(cxh0.f43038a, (gh00) objM91750T7);
                zM91770i3 = xq00Var.m91770i(maq0Var2) | xq00Var.m91762e(ko70Var.ordinal());
                objM91750T8 = xq00Var.m91750T();
                if (zM91770i3 || objM91750T8 == obj) {
                    objM91750T8 = new pm4(0, maq0Var2, ko70Var);
                    xq00Var.m91793t0(objM91750T8);
                }
                m6d0Var = (m6d0) objM91750T8;
                iHashCode = Long.hashCode(xq00Var.f264809T);
                wpn0VarM91778m = xq00Var.m91778m();
                fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM85877w);
                soh.f211194A.getClass();
                eh00Var5 = roh.f201257b;
                if (xq00Var.f264811a != null) {
                    pmg1.m70360s();
                    throw r10;
                }
                xq00Var.m91779m0();
                if (xq00Var.f264808S) {
                    xq00Var.m91776l(eh00Var5);
                } else {
                    xq00Var.m91799w0();
                }
                zsf1.m96835F(m6d0Var, roh.f201262g, xq00Var);
                zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
                zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
                zsf1.m96833D(roh.f201266k, xq00Var);
                zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
                xq00Var.m91788r(true);
                eh00Var3 = eh00Var4;
            } else {
                xq00Var.m91757b0();
                eh00Var3 = eh00Var2;
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new gj0(qaq0Var2, eh00Var3, raq0Var, fyfVar, i, i2, 4);
            }
        }
        i3 |= 48;
        eh00Var2 = eh00Var;
        if ((i & 384) == 0) {
            raq0Var2 = raq0Var;
            if (xq00Var.m91766g(raq0Var2)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i3 |= i8;
        } else {
            raq0Var2 = raq0Var;
        }
        if ((i & 3072) == 0) {
            if (xq00Var.m91770i(fyfVar)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        i4 = i3;
        if ((i4 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (xq00Var.m91752Y(i4 & 1, z)) {
            if (i9 != 0) {
                eh00Var4 = null;
            } else {
                eh00Var4 = eh00Var2;
            }
            view = (View) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f506f);
            yqqVar = (yqq) xq00Var.m91774k(wsh.f254617h);
            str = (String) xq00Var.m91774k(f210562a);
            ko70Var = (ko70) xq00Var.m91774k(wsh.f254623n);
            vq00VarM70361t = pmg1.m70361t(xq00Var);
            kqi0VarM77651H = sam.m77651H(fyfVar, xq00Var);
            Object[] objArr2 = new Object[0];
            objM91750T = xq00Var.m91750T();
            obj = t6x0.f217647t;
            if (objM91750T == obj) {
                objM91750T = l12.f128584Z0;
                xq00Var.m91793t0(objM91750T);
            }
            uuid = (UUID) dul.m37018u(objArr2, (eh00) objM91750T, xq00Var, 48);
            zBooleanValue = ((Boolean) xq00Var.m91774k(f210563b)).booleanValue();
            objM91750T2 = xq00Var.m91750T();
            if (objM91750T2 == obj) {
                str2 = str;
                r10 = 0;
                z2 = false;
                maq0 maq0Var4 = new maq0(eh00Var4, raq0Var2, str2, view, yqqVar, qaq0Var2, uuid, zBooleanValue);
                qaq0Var2 = qaq0Var2;
                maq0Var4.m61327v(vq00VarM70361t, new fyf(new rm4(maq0Var4, kqi0VarM77651H, 1), true, -297523940));
                xq00Var.m91793t0(maq0Var4);
                objM91750T2 = maq0Var4;
            } else {
                str2 = str;
                r10 = 0;
                z2 = false;
            }
            maq0Var = (maq0) objM91750T2;
            boolean zM91770i7 = xq00Var.m91770i(maq0Var);
            i5 = i4 & ContentType.LONG_FORM_ON_DEMAND;
            if (i5 == 32) {
                z3 = true;
            } else {
                z3 = z2;
            }
            boolean z11 = zM91770i7 | z3;
            i6 = i4 & 896;
            if (i6 == 256) {
                z4 = true;
            } else {
                z4 = z2;
            }
            zM91766g = z11 | z4 | xq00Var.m91766g(str2) | xq00Var.m91762e(ko70Var.ordinal());
            objM91750T3 = xq00Var.m91750T();
            if (zM91766g) {
                eh00 eh00Var7 = eh00Var4;
                Object rg0Var2 = new rg0(1, maq0Var, eh00Var7, raq0Var, ko70Var, str2);
                maq0Var2 = maq0Var;
                eh00Var4 = eh00Var7;
                xq00Var.m91793t0(rg0Var2);
                objM91750T3 = rg0Var2;
            } else {
                eh00 eh00Var8 = eh00Var4;
                Object rg0Var3 = new rg0(1, maq0Var, eh00Var8, raq0Var, ko70Var, str2);
                maq0Var2 = maq0Var;
                eh00Var4 = eh00Var8;
                xq00Var.m91793t0(rg0Var3);
                objM91750T3 = rg0Var3;
            }
            hz40.m49233e(maq0Var2, (gh00) objM91750T3, xq00Var);
            boolean zM91770i8 = xq00Var.m91770i(maq0Var2);
            if (i5 == 32) {
                z5 = true;
            } else {
                z5 = z2;
            }
            boolean z12 = zM91770i8 | z5;
            if (i6 == 256) {
                z6 = true;
            } else {
                z6 = z2;
            }
            zM91766g2 = z12 | z6 | xq00Var.m91766g(str2) | xq00Var.m91762e(ko70Var.ordinal());
            objM91750T4 = xq00Var.m91750T();
            if (zM91766g2) {
                Object mm4Var2 = new mm4(maq0Var2, eh00Var4, raq0Var, str2, ko70Var, 0);
                xq00Var.m91793t0(mm4Var2);
                objM91750T4 = mm4Var2;
            } else {
                Object mm4Var3 = new mm4(maq0Var2, eh00Var4, raq0Var, str2, ko70Var, 0);
                xq00Var.m91793t0(mm4Var3);
                objM91750T4 = mm4Var3;
            }
            hz40.m49245q((eh00) objM91750T4, xq00Var);
            boolean zM91770i9 = xq00Var.m91770i(maq0Var2);
            if ((i4 & 14) == 4) {
                z7 = true;
            } else {
                z7 = z2;
            }
            z8 = zM91770i9 | z7;
            objM91750T5 = xq00Var.m91750T();
            if (z8) {
                objM91750T5 = new n62(18, maq0Var2, qaq0Var2);
                xq00Var.m91793t0(objM91750T5);
            } else {
                objM91750T5 = new n62(18, maq0Var2, qaq0Var2);
                xq00Var.m91793t0(objM91750T5);
            }
            hz40.m49233e(qaq0Var2, (gh00) objM91750T5, xq00Var);
            zM91770i = xq00Var.m91770i(maq0Var2);
            objM91750T6 = xq00Var.m91750T();
            if (zM91770i) {
                objM91750T6 = new fa2(maq0Var2, r10, 28);
                xq00Var.m91793t0(objM91750T6);
            } else {
                objM91750T6 = new fa2(maq0Var2, r10, 28);
                xq00Var.m91793t0(objM91750T6);
            }
            hz40.m49237i(maq0Var2, (th00) objM91750T6, xq00Var);
            zM91770i2 = xq00Var.m91770i(maq0Var2);
            objM91750T7 = xq00Var.m91750T();
            if (zM91770i2) {
                objM91750T7 = new om4(maq0Var2, 0);
                xq00Var.m91793t0(objM91750T7);
            } else {
                objM91750T7 = new om4(maq0Var2, 0);
                xq00Var.m91793t0(objM91750T7);
            }
            fxh0 fxh0VarM85877w2 = vkf1.m85877w(cxh0.f43038a, (gh00) objM91750T7);
            zM91770i3 = xq00Var.m91770i(maq0Var2) | xq00Var.m91762e(ko70Var.ordinal());
            objM91750T8 = xq00Var.m91750T();
            if (zM91770i3) {
                objM91750T8 = new pm4(0, maq0Var2, ko70Var);
                xq00Var.m91793t0(objM91750T8);
            } else {
                objM91750T8 = new pm4(0, maq0Var2, ko70Var);
                xq00Var.m91793t0(objM91750T8);
            }
            m6d0Var = (m6d0) objM91750T8;
            iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0VarM91778m = xq00Var.m91778m();
            fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM85877w2);
            soh.f211194A.getClass();
            eh00Var5 = roh.f201257b;
            if (xq00Var.f264811a != null) {
                pmg1.m70360s();
                throw r10;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(eh00Var5);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m6d0Var, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            xq00Var.m91788r(true);
            eh00Var3 = eh00Var4;
        } else {
            xq00Var.m91757b0();
            eh00Var3 = eh00Var2;
        }
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new gj0(qaq0Var2, eh00Var3, raq0Var, fyfVar, i, i2, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:46:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:77:0x0100  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m78515b(ob3 ob3Var, long j, eh00 eh00Var, raq0 raq0Var, fyf fyfVar, xq00 xq00Var, int i, int i2) {
        ob3 ob3Var2;
        int i3;
        long j2;
        int i4;
        eh00 eh00Var2;
        int i5;
        raq0 raq0Var2;
        int i6;
        boolean z;
        ob3 ob3Var3;
        eh00 eh00Var3;
        raq0 raq0Var3;
        long j3;
        pgv0 pgv0VarM91796v;
        ob3 ob3Var4;
        raq0 raq0Var4;
        boolean z2;
        boolean zM91766g;
        Object objM91750T;
        xq00Var.m91775k0(71005054);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            ob3Var2 = ob3Var;
        } else if ((i & 6) == 0) {
            ob3Var2 = ob3Var;
            i3 = (xq00Var.m91766g(ob3Var2) ? 4 : 2) | i;
        } else {
            ob3Var2 = ob3Var;
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i4 = i3 | 48;
            j2 = j;
        } else {
            j2 = j;
            i4 = i3 | (xq00Var.m91764f(j2) ? 32 : 16);
        }
        int i9 = i2 & 4;
        if (i9 == 0) {
            if ((i & 384) == 0) {
                eh00Var2 = eh00Var;
                i4 |= xq00Var.m91770i(eh00Var2) ? 256 : 128;
            }
            i5 = i2 & 8;
            if (i5 != 0) {
                if ((i & 3072) == 0) {
                    raq0Var2 = raq0Var;
                    if (xq00Var.m91766g(raq0Var2)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i4 |= i6;
                }
                if ((i4 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (xq00Var.m91752Y(i4 & 1, z)) {
                    if (i7 != 0) {
                        ob3Var4 = d7f0.f46166e;
                    } else {
                        ob3Var4 = ob3Var2;
                    }
                    if (i8 != 0) {
                        long j4 = 0;
                        j2 = (j4 << 32) | (j4 & 4294967295L);
                    }
                    if (i9 != 0) {
                        eh00Var2 = null;
                    }
                    if (i5 != 0) {
                        raq0Var4 = new raq0(31, false, false, false);
                    } else {
                        raq0Var4 = raq0Var2;
                    }
                    int i10 = raq0Var4.f197371g;
                    if ((i4 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zM91766g = xq00Var.m91766g(null) | z2 | ((i4 & ContentType.LONG_FORM_ON_DEMAND) == 32) | xq00Var.m91762e(i10);
                    objM91750T = xq00Var.m91750T();
                    if (zM91766g || objM91750T == t6x0.f217647t) {
                        objM91750T = new yb3(ob3Var4, j2);
                        xq00Var.m91793t0(objM91750T);
                    }
                    eh00 eh00Var4 = eh00Var2;
                    m78514a((yb3) objM91750T, eh00Var4, raq0Var4, fyfVar, xq00Var, (i4 >> 3) & 8176, 0);
                    eh00Var3 = eh00Var4;
                    raq0Var3 = raq0Var4;
                    ob3Var3 = ob3Var4;
                } else {
                    xq00Var.m91757b0();
                    ob3Var3 = ob3Var2;
                    eh00Var3 = eh00Var2;
                    raq0Var3 = raq0Var2;
                }
                j3 = j2;
                pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v != null) {
                    pgv0VarM91796v.f177419d = new lm4(ob3Var3, j3, eh00Var3, raq0Var3, fyfVar, i, i2);
                }
            }
            i4 |= 3072;
            raq0Var2 = raq0Var;
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (xq00Var.m91752Y(i4 & 1, z)) {
                if (i7 != 0) {
                    ob3Var4 = d7f0.f46166e;
                } else {
                    ob3Var4 = ob3Var2;
                }
                if (i8 != 0) {
                    long j5 = 0;
                    j2 = (j5 << 32) | (j5 & 4294967295L);
                }
                if (i9 != 0) {
                    eh00Var2 = null;
                }
                if (i5 != 0) {
                    raq0Var4 = new raq0(31, false, false, false);
                } else {
                    raq0Var4 = raq0Var2;
                }
                int i11 = raq0Var4.f197371g;
                if ((i4 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zM91766g = xq00Var.m91766g(null) | z2 | ((i4 & ContentType.LONG_FORM_ON_DEMAND) == 32) | xq00Var.m91762e(i11);
                objM91750T = xq00Var.m91750T();
                if (zM91766g) {
                    objM91750T = new yb3(ob3Var4, j2);
                    xq00Var.m91793t0(objM91750T);
                } else {
                    objM91750T = new yb3(ob3Var4, j2);
                    xq00Var.m91793t0(objM91750T);
                }
                eh00 eh00Var5 = eh00Var2;
                m78514a((yb3) objM91750T, eh00Var5, raq0Var4, fyfVar, xq00Var, (i4 >> 3) & 8176, 0);
                eh00Var3 = eh00Var5;
                raq0Var3 = raq0Var4;
                ob3Var3 = ob3Var4;
            } else {
                xq00Var.m91757b0();
                ob3Var3 = ob3Var2;
                eh00Var3 = eh00Var2;
                raq0Var3 = raq0Var2;
            }
            j3 = j2;
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new lm4(ob3Var3, j3, eh00Var3, raq0Var3, fyfVar, i, i2);
            }
        }
        i4 |= 384;
        eh00Var2 = eh00Var;
        i5 = i2 & 8;
        if (i5 != 0) {
            if ((i & 3072) == 0) {
                raq0Var2 = raq0Var;
                if (xq00Var.m91766g(raq0Var2)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i4 |= i6;
            }
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (xq00Var.m91752Y(i4 & 1, z)) {
                if (i7 != 0) {
                    ob3Var4 = d7f0.f46166e;
                } else {
                    ob3Var4 = ob3Var2;
                }
                if (i8 != 0) {
                    long j6 = 0;
                    j2 = (j6 << 32) | (j6 & 4294967295L);
                }
                if (i9 != 0) {
                    eh00Var2 = null;
                }
                if (i5 != 0) {
                    raq0Var4 = new raq0(31, false, false, false);
                } else {
                    raq0Var4 = raq0Var2;
                }
                int i12 = raq0Var4.f197371g;
                if ((i4 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zM91766g = xq00Var.m91766g(null) | z2 | ((i4 & ContentType.LONG_FORM_ON_DEMAND) == 32) | xq00Var.m91762e(i12);
                objM91750T = xq00Var.m91750T();
                if (zM91766g) {
                    objM91750T = new yb3(ob3Var4, j2);
                    xq00Var.m91793t0(objM91750T);
                } else {
                    objM91750T = new yb3(ob3Var4, j2);
                    xq00Var.m91793t0(objM91750T);
                }
                eh00 eh00Var6 = eh00Var2;
                m78514a((yb3) objM91750T, eh00Var6, raq0Var4, fyfVar, xq00Var, (i4 >> 3) & 8176, 0);
                eh00Var3 = eh00Var6;
                raq0Var3 = raq0Var4;
                ob3Var3 = ob3Var4;
            } else {
                xq00Var.m91757b0();
                ob3Var3 = ob3Var2;
                eh00Var3 = eh00Var2;
                raq0Var3 = raq0Var2;
            }
            j3 = j2;
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new lm4(ob3Var3, j3, eh00Var3, raq0Var3, fyfVar, i, i2);
            }
        }
        i4 |= 3072;
        raq0Var2 = raq0Var;
        if ((i4 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (xq00Var.m91752Y(i4 & 1, z)) {
            if (i7 != 0) {
                ob3Var4 = d7f0.f46166e;
            } else {
                ob3Var4 = ob3Var2;
            }
            if (i8 != 0) {
                long j7 = 0;
                j2 = (j7 << 32) | (j7 & 4294967295L);
            }
            if (i9 != 0) {
                eh00Var2 = null;
            }
            if (i5 != 0) {
                raq0Var4 = new raq0(31, false, false, false);
            } else {
                raq0Var4 = raq0Var2;
            }
            int i13 = raq0Var4.f197371g;
            if ((i4 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            zM91766g = xq00Var.m91766g(null) | z2 | ((i4 & ContentType.LONG_FORM_ON_DEMAND) == 32) | xq00Var.m91762e(i13);
            objM91750T = xq00Var.m91750T();
            if (zM91766g) {
                objM91750T = new yb3(ob3Var4, j2);
                xq00Var.m91793t0(objM91750T);
            } else {
                objM91750T = new yb3(ob3Var4, j2);
                xq00Var.m91793t0(objM91750T);
            }
            eh00 eh00Var7 = eh00Var2;
            m78514a((yb3) objM91750T, eh00Var7, raq0Var4, fyfVar, xq00Var, (i4 >> 3) & 8176, 0);
            eh00Var3 = eh00Var7;
            raq0Var3 = raq0Var4;
            ob3Var3 = ob3Var4;
        } else {
            xq00Var.m91757b0();
            ob3Var3 = ob3Var2;
            eh00Var3 = eh00Var2;
            raq0Var3 = raq0Var2;
        }
        j3 = j2;
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new lm4(ob3Var3, j3, eh00Var3, raq0Var3, fyfVar, i, i2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m78516c(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
