package p204p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import com.comscore.streaming.ContentType;
import com.spotify.martini.martinidata.model.Mode;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Single;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.WeakHashMap;
import p000.AbstractC0000a;
import p196j$.net.URLEncoder;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ufc1 implements dgc1 {

    /* JADX INFO: renamed from: a */
    public static final k47 f229750a = new k47(14);

    /* JADX INFO: renamed from: b */
    public static sd40 f229751b;

    /* JADX WARN: Code duplicated, block: B:102:0x014c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0191 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x0197  */
    /* JADX WARN: Code duplicated, block: B:111:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:114:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:115:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:118:0x01f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:121:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:124:0x0237  */
    /* JADX WARN: Code duplicated, block: B:126:0x023e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0242  */
    /* JADX WARN: Code duplicated, block: B:130:0x0266  */
    /* JADX WARN: Code duplicated, block: B:137:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:139:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:146:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:149:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:152:0x031d  */
    /* JADX WARN: Code duplicated, block: B:154:0x033c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:157:0x0341  */
    /* JADX WARN: Code duplicated, block: B:159:0x0355  */
    /* JADX WARN: Code duplicated, block: B:162:0x0373  */
    /* JADX WARN: Code duplicated, block: B:163:0x0377  */
    /* JADX WARN: Code duplicated, block: B:165:0x039d  */
    /* JADX WARN: Code duplicated, block: B:167:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:170:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:81:0x00df  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:91:0x012d  */
    /* JADX WARN: Code duplicated, block: B:92:0x012f  */
    /* JADX WARN: Code duplicated, block: B:95:0x013c  */
    /* JADX WARN: Code duplicated, block: B:96:0x013e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0147 A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: a */
    public static final void m82963a(fxh0 fxh0Var, wc61 wc61Var, wc61 wc61Var2, boolean z, fyf fyfVar, xq00 xq00Var, int i, int i2) {
        fxh0 fxh0Var2;
        int i3;
        wc61 wc61Var3;
        int i4;
        wc61 wc61Var4;
        int i5;
        int i6;
        boolean z2;
        int i7;
        boolean z3;
        fxh0 fxh0Var3;
        wc61 wc61Var5;
        boolean z4;
        wc61 wc61Var6;
        pgv0 pgv0VarM91796v;
        cxh0 cxh0Var;
        wc61 wc61Var7;
        wc61 wc61Var8;
        boolean z5;
        ko70 ko70Var;
        ypo ypoVarM52525a;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean zM91762e;
        fcs fcsVar;
        Object obj;
        qs3 qs3Var;
        int i8;
        boolean z9;
        boolean z10;
        boolean z11;
        Object objM91750T;
        hmu hmuVar;
        float fM82978u;
        boolean zM91770i;
        int i9;
        Object obj2;
        Object objM91750T2;
        Object objM52407e;
        vum0 vum0Var;
        float fM63436m;
        boolean zM91770i2;
        Object objM91750T3;
        boolean z12;
        boolean z13;
        qs3 qs3Var2;
        wb9 wb9Var;
        m6d0 m6d0VarM36007d;
        fxh0 fxh0Var4;
        int iHashCode;
        wpn0 wpn0VarM91778m;
        fxh0 fxh0VarM48286s;
        C2087le c2087le;
        boolean z14;
        wc61 wc61Var9;
        int i10;
        float f;
        Object objM91750T4;
        Object obj3;
        xuk xukVar;
        fxh0 fxh0VarM61814B;
        boolean z15;
        qs3 qs3Var3;
        boolean zM91770i3;
        Object obj4;
        int i11;
        fyf fyfVar2 = fyfVar;
        Object obj5 = t6x0.f217647t;
        xq00Var.m91775k0(-696912919);
        ug5 ug5Var = xq00Var.f264811a;
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
            fxh0Var2 = fxh0Var;
        } else if ((i & 6) == 0) {
            fxh0Var2 = fxh0Var;
            i3 = (xq00Var.m91770i(fxh0Var2) ? 4 : 2) | i;
        } else {
            fxh0Var2 = fxh0Var;
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 == 0) {
            if ((i & 48) == 0) {
                wc61Var3 = wc61Var;
                i3 |= xq00Var.m91766g(wc61Var3) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    wc61Var4 = wc61Var2;
                    if (xq00Var.m91766g(wc61Var4)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        z2 = z;
                        if (xq00Var.m91768h(z2)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    if ((i & 24576) == 0) {
                        if (xq00Var.m91770i(fyfVar2)) {
                            i11 = 16384;
                        } else {
                            i11 = 8192;
                        }
                        i3 |= i11;
                    }
                    if ((i3 & 9363) != 9362) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (xq00Var.m91752Y(i3 & 1, z3)) {
                        cxh0Var = cxh0.f43038a;
                        if (i12 != 0) {
                            fxh0Var2 = cxh0Var;
                        }
                        if (i13 != 0) {
                            wc61Var7 = null;
                        } else {
                            wc61Var7 = wc61Var3;
                        }
                        if (i4 != 0) {
                            wc61Var8 = null;
                        } else {
                            wc61Var8 = wc61Var4;
                        }
                        if (i6 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        ko70Var = (ko70) xq00Var.m91774k(wsh.f254623n);
                        ypoVarM52525a = j641.m52525a(xq00Var);
                        if (wc61Var7 != null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (wc61Var8 != null) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        boolean zM91768h = xq00Var.m91768h(z6) | xq00Var.m91768h(z7);
                        if ((i3 & 7168) == 2048) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        zM91762e = zM91768h | z8 | xq00Var.m91762e(ko70Var.ordinal());
                        Object objM91750T5 = xq00Var.m91750T();
                        fcsVar = fcs.f68250b;
                        if (!zM91762e || objM91750T5 == obj5) {
                            Object objM27720b = b04.m27720b(fcsVar, b04.m27721c(new b0v(z6, ko70Var, z7, 0)), e6u.f56750a1, v8s.f238668a1, jg31.m53286y(0.0f, 0.0f, null, 7), ypoVarM52525a);
                            xq00Var.m91793t0(objM27720b);
                            obj = objM27720b;
                        } else {
                            obj = objM91750T5;
                        }
                        qs3Var = (qs3) obj;
                        yum0 yum0Var = qs3Var.f191970h;
                        yum0 yum0Var2 = qs3Var.f191969g;
                        Object value = yum0Var.getValue();
                        boolean zM91770i4 = xq00Var.m91770i(qs3Var);
                        i8 = i3 & ContentType.LONG_FORM_ON_DEMAND;
                        if (i8 == 32) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        boolean z16 = zM91770i4 | z9;
                        if ((i3 & 896) == 256) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z11 = z16 | z10;
                        objM91750T = xq00Var.m91750T();
                        if (z11 || objM91750T == obj5) {
                            objM91750T = new m5u(qs3Var, wc61Var7, wc61Var8, null, 6);
                            xq00Var.m91793t0(objM91750T);
                        }
                        hz40.m49237i(value, (th00) objM91750T, xq00Var);
                        hmuVar = (hmu) xq00Var.m91774k(lc20.f131804a);
                        fM82978u = m82978u(qs3Var.m73668g(), ko70Var);
                        Object value2 = qs3Var.f191971i.getValue();
                        zM91770i = xq00Var.m91770i(qs3Var) | xq00Var.m91760d(fM82978u) | xq00Var.m91770i(hmuVar);
                        i9 = i3;
                        Object objM91750T6 = xq00Var.m91750T();
                        if (!zM91770i || objM91750T6 == obj5) {
                            Object xzuVar = new xzu(qs3Var, fM82978u, hmuVar, (fbk) null);
                            xq00Var.m91793t0(xzuVar);
                            obj2 = xzuVar;
                        } else {
                            obj2 = objM91750T6;
                        }
                        hz40.m49237i(value2, (th00) obj2, xq00Var);
                        objM91750T2 = xq00Var.m91750T();
                        objM52407e = objM91750T2;
                        if (objM91750T2 == obj5) {
                            objM52407e = j4x.m52407e(0, xq00Var);
                        }
                        vum0Var = (vum0) objM52407e;
                        if (vum0Var.m86437v() > 0) {
                            fM63436m = n0e1.m63436m(Math.abs(fM82978u) / vum0Var.m86437v(), 0.0f, 1.0f);
                        } else {
                            fM63436m = 0.0f;
                        }
                        zM91770i2 = xq00Var.m91770i(vum0Var) | xq00Var.m91770i(qs3Var) | xq00Var.m91768h(z6) | xq00Var.m91762e(ko70Var.ordinal()) | xq00Var.m91768h(z7);
                        objM91750T3 = xq00Var.m91750T();
                        if (!zM91770i2 || objM91750T3 == obj5) {
                            z12 = z6;
                            z13 = z7;
                            objM91750T3 = new zzu(0, qs3Var, vum0Var, ko70Var, z12, z13);
                            qs3Var2 = qs3Var;
                            xq00Var.m91793t0(objM91750T3);
                        } else {
                            z12 = z6;
                            z13 = z7;
                            qs3Var2 = qs3Var;
                        }
                        fxh0 fxh0VarM45144n = glf1.m45144n(fxh0Var2, (gh00) objM91750T3);
                        wb9Var = d7f0.f46166e;
                        m6d0VarM36007d = dha.m36007d(wb9Var, false);
                        fxh0Var4 = fxh0Var2;
                        iHashCode = Long.hashCode(xq00Var.f264809T);
                        wpn0VarM91778m = xq00Var.m91778m();
                        fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM45144n);
                        soh.f211194A.getClass();
                        c2087le = roh.f201257b;
                        if (ug5Var != null) {
                            pmg1.m70360s();
                            throw null;
                        }
                        xq00Var.m91779m0();
                        if (xq00Var.f264808S) {
                            xq00Var.m91776l(c2087le);
                        } else {
                            xq00Var.m91799w0();
                        }
                        yhh yhhVar = roh.f201262g;
                        zsf1.m96835F(m6d0VarM36007d, yhhVar, xq00Var);
                        yhh yhhVar2 = roh.f201261f;
                        zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        yhh yhhVar3 = roh.f201265j;
                        zsf1.m96835F(numValueOf, yhhVar3, xq00Var);
                        vlh vlhVar = roh.f201266k;
                        zsf1.m96833D(vlhVar, xq00Var);
                        z14 = z5;
                        yhh yhhVar4 = roh.f201259d;
                        zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var);
                        if (wc61Var7 != null || fM82978u <= 0.0f) {
                            wc61Var9 = wc61Var7;
                            i10 = 390;
                            f = fM63436m;
                            xq00Var.m91771i0(-906533153);
                            xq00Var.m91788r(false);
                        } else {
                            i10 = 390;
                            xq00Var.m91771i0(-906758988);
                            f = fM63436m;
                            wc61 wc61Var10 = wc61Var7;
                            vgg1.m85463d(wc61Var10, t60.Start, qs3Var2.m73667f(fcs.f68249a), yum0Var2.getValue() != fcsVar, f, xq00Var, 390 | i8);
                            wc61Var9 = wc61Var10;
                            xq00Var.m91788r(false);
                        }
                        if (wc61Var8 != null || fM82978u >= 0.0f) {
                            xq00Var.m91771i0(-906254401);
                            xq00Var.m91788r(false);
                        } else {
                            xq00Var.m91771i0(-906474470);
                            vgg1.m85463d(wc61Var8, t60.End, qs3Var2.m73667f(fcs.f68251c), yum0Var2.getValue() != fcsVar, f, xq00Var, i10 | ((i9 >> 3) & ContentType.LONG_FORM_ON_DEMAND));
                            xq00Var.m91788r(false);
                        }
                        objM91750T4 = xq00Var.m91750T();
                        obj3 = objM91750T4;
                        if (objM91750T4 == obj5) {
                            Object objM49254z = hz40.m49254z(dau.f47107a, xq00Var);
                            xq00Var.m91793t0(objM49254z);
                            obj3 = objM49254z;
                        }
                        xukVar = (xuk) obj3;
                        xq00Var.m91771i0(-29229382);
                        q630 q630Var = s850.f206556a;
                        fxh0VarM61814B = mi21.m61814B(xef0.f260709a, null, 3);
                        if (z14) {
                            qs3Var3 = qs3Var2;
                            fxh0 fxh0VarM69516a = pb61.m69516a(cxh0Var, qs3Var3, new d0v(qs3Var3, xukVar, ko70Var, z12, z13));
                            zM91770i3 = xq00Var.m91770i(qs3Var3);
                            Object objM91750T7 = xq00Var.m91750T();
                            if (!zM91770i3 || objM91750T7 == obj5) {
                                z15 = false;
                                Object a0vVar = new a0v(qs3Var3, false ? 1 : 0);
                                xq00Var.m91793t0(a0vVar);
                                obj4 = a0vVar;
                            } else {
                                z15 = false;
                                obj4 = objM91750T7;
                            }
                            fxh0VarM61814B = fxh0VarM61814B.mo34315F(bga.m29085g(fxh0VarM69516a, (gh00) obj4));
                        } else {
                            z15 = false;
                        }
                        xq00Var.m91788r(z15);
                        m6d0 m6d0VarM36007d2 = dha.m36007d(wb9Var, true);
                        int iHashCode2 = Long.hashCode(xq00Var.f264809T);
                        wpn0 wpn0VarM91778m2 = xq00Var.m91778m();
                        fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var, fxh0VarM61814B);
                        xq00Var.m91779m0();
                        if (xq00Var.f264808S) {
                            xq00Var.m91776l(c2087le);
                        } else {
                            xq00Var.m91799w0();
                        }
                        zsf1.m96835F(m6d0VarM36007d2, yhhVar, xq00Var);
                        zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var);
                        AbstractC0000a.m20s(iHashCode2, xq00Var, yhhVar3, xq00Var, vlhVar);
                        zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var);
                        fyfVar2 = fyfVar;
                        p3n0.m69076g((i9 >> 12) & 14, fyfVar2, xq00Var, true, true);
                        z4 = z14;
                        fxh0Var3 = fxh0Var4;
                        wc61Var6 = wc61Var8;
                        wc61Var5 = wc61Var9;
                    } else {
                        xq00Var.m91757b0();
                        fxh0Var3 = fxh0Var2;
                        wc61Var5 = wc61Var3;
                        z4 = z2;
                        wc61Var6 = wc61Var4;
                    }
                    pgv0VarM91796v = xq00Var.m91796v();
                    if (pgv0VarM91796v != null) {
                        pgv0VarM91796v.f177419d = new j69(fxh0Var3, wc61Var5, wc61Var6, z4, fyfVar2, i, i2);
                    }
                }
                i3 |= 3072;
                z2 = z;
                if ((i & 24576) == 0) {
                    if (xq00Var.m91770i(fyfVar2)) {
                        i11 = 16384;
                    } else {
                        i11 = 8192;
                    }
                    i3 |= i11;
                }
                if ((i3 & 9363) != 9362) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (xq00Var.m91752Y(i3 & 1, z3)) {
                    cxh0Var = cxh0.f43038a;
                    if (i12 != 0) {
                        fxh0Var2 = cxh0Var;
                    }
                    if (i13 != 0) {
                        wc61Var7 = null;
                    } else {
                        wc61Var7 = wc61Var3;
                    }
                    if (i4 != 0) {
                        wc61Var8 = null;
                    } else {
                        wc61Var8 = wc61Var4;
                    }
                    if (i6 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    ko70Var = (ko70) xq00Var.m91774k(wsh.f254623n);
                    ypoVarM52525a = j641.m52525a(xq00Var);
                    if (wc61Var7 != null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (wc61Var8 != null) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    boolean zM91768h2 = xq00Var.m91768h(z6) | xq00Var.m91768h(z7);
                    if ((i3 & 7168) == 2048) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    zM91762e = zM91768h2 | z8 | xq00Var.m91762e(ko70Var.ordinal());
                    Object objM91750T8 = xq00Var.m91750T();
                    fcsVar = fcs.f68250b;
                    if (zM91762e) {
                        Object objM27720b2 = b04.m27720b(fcsVar, b04.m27721c(new b0v(z6, ko70Var, z7, 0)), e6u.f56750a1, v8s.f238668a1, jg31.m53286y(0.0f, 0.0f, null, 7), ypoVarM52525a);
                        xq00Var.m91793t0(objM27720b2);
                        obj = objM27720b2;
                    } else {
                        Object objM27720b3 = b04.m27720b(fcsVar, b04.m27721c(new b0v(z6, ko70Var, z7, 0)), e6u.f56750a1, v8s.f238668a1, jg31.m53286y(0.0f, 0.0f, null, 7), ypoVarM52525a);
                        xq00Var.m91793t0(objM27720b3);
                        obj = objM27720b3;
                    }
                    qs3Var = (qs3) obj;
                    yum0 yum0Var3 = qs3Var.f191970h;
                    yum0 yum0Var4 = qs3Var.f191969g;
                    Object value3 = yum0Var3.getValue();
                    boolean zM91770i5 = xq00Var.m91770i(qs3Var);
                    i8 = i3 & ContentType.LONG_FORM_ON_DEMAND;
                    if (i8 == 32) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    boolean z17 = zM91770i5 | z9;
                    if ((i3 & 896) == 256) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = z17 | z10;
                    objM91750T = xq00Var.m91750T();
                    if (z11) {
                        objM91750T = new m5u(qs3Var, wc61Var7, wc61Var8, null, 6);
                        xq00Var.m91793t0(objM91750T);
                    } else {
                        objM91750T = new m5u(qs3Var, wc61Var7, wc61Var8, null, 6);
                        xq00Var.m91793t0(objM91750T);
                    }
                    hz40.m49237i(value3, (th00) objM91750T, xq00Var);
                    hmuVar = (hmu) xq00Var.m91774k(lc20.f131804a);
                    fM82978u = m82978u(qs3Var.m73668g(), ko70Var);
                    Object value4 = qs3Var.f191971i.getValue();
                    zM91770i = xq00Var.m91770i(qs3Var) | xq00Var.m91760d(fM82978u) | xq00Var.m91770i(hmuVar);
                    i9 = i3;
                    Object objM91750T9 = xq00Var.m91750T();
                    if (zM91770i) {
                        Object xzuVar2 = new xzu(qs3Var, fM82978u, hmuVar, (fbk) null);
                        xq00Var.m91793t0(xzuVar2);
                        obj2 = xzuVar2;
                    } else {
                        Object xzuVar3 = new xzu(qs3Var, fM82978u, hmuVar, (fbk) null);
                        xq00Var.m91793t0(xzuVar3);
                        obj2 = xzuVar3;
                    }
                    hz40.m49237i(value4, (th00) obj2, xq00Var);
                    objM91750T2 = xq00Var.m91750T();
                    objM52407e = objM91750T2;
                    if (objM91750T2 == obj5) {
                        objM52407e = j4x.m52407e(0, xq00Var);
                    }
                    vum0Var = (vum0) objM52407e;
                    if (vum0Var.m86437v() > 0) {
                        fM63436m = n0e1.m63436m(Math.abs(fM82978u) / vum0Var.m86437v(), 0.0f, 1.0f);
                    } else {
                        fM63436m = 0.0f;
                    }
                    zM91770i2 = xq00Var.m91770i(vum0Var) | xq00Var.m91770i(qs3Var) | xq00Var.m91768h(z6) | xq00Var.m91762e(ko70Var.ordinal()) | xq00Var.m91768h(z7);
                    objM91750T3 = xq00Var.m91750T();
                    if (zM91770i2) {
                        z12 = z6;
                        z13 = z7;
                        objM91750T3 = new zzu(0, qs3Var, vum0Var, ko70Var, z12, z13);
                        qs3Var2 = qs3Var;
                        xq00Var.m91793t0(objM91750T3);
                    } else {
                        z12 = z6;
                        z13 = z7;
                        objM91750T3 = new zzu(0, qs3Var, vum0Var, ko70Var, z12, z13);
                        qs3Var2 = qs3Var;
                        xq00Var.m91793t0(objM91750T3);
                    }
                    fxh0 fxh0VarM45144n2 = glf1.m45144n(fxh0Var2, (gh00) objM91750T3);
                    wb9Var = d7f0.f46166e;
                    m6d0VarM36007d = dha.m36007d(wb9Var, false);
                    fxh0Var4 = fxh0Var2;
                    iHashCode = Long.hashCode(xq00Var.f264809T);
                    wpn0VarM91778m = xq00Var.m91778m();
                    fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM45144n2);
                    soh.f211194A.getClass();
                    c2087le = roh.f201257b;
                    if (ug5Var != null) {
                        pmg1.m70360s();
                        throw null;
                    }
                    xq00Var.m91779m0();
                    if (xq00Var.f264808S) {
                        xq00Var.m91776l(c2087le);
                    } else {
                        xq00Var.m91799w0();
                    }
                    yhh yhhVar5 = roh.f201262g;
                    zsf1.m96835F(m6d0VarM36007d, yhhVar5, xq00Var);
                    yhh yhhVar6 = roh.f201261f;
                    zsf1.m96835F(wpn0VarM91778m, yhhVar6, xq00Var);
                    Integer numValueOf2 = Integer.valueOf(iHashCode);
                    yhh yhhVar7 = roh.f201265j;
                    zsf1.m96835F(numValueOf2, yhhVar7, xq00Var);
                    vlh vlhVar2 = roh.f201266k;
                    zsf1.m96833D(vlhVar2, xq00Var);
                    z14 = z5;
                    yhh yhhVar8 = roh.f201259d;
                    zsf1.m96835F(fxh0VarM48286s, yhhVar8, xq00Var);
                    if (wc61Var7 != null) {
                        wc61Var9 = wc61Var7;
                        i10 = 390;
                        f = fM63436m;
                        xq00Var.m91771i0(-906533153);
                        xq00Var.m91788r(false);
                    } else {
                        wc61Var9 = wc61Var7;
                        i10 = 390;
                        f = fM63436m;
                        xq00Var.m91771i0(-906533153);
                        xq00Var.m91788r(false);
                    }
                    if (wc61Var8 != null) {
                        xq00Var.m91771i0(-906254401);
                        xq00Var.m91788r(false);
                    } else {
                        xq00Var.m91771i0(-906254401);
                        xq00Var.m91788r(false);
                    }
                    objM91750T4 = xq00Var.m91750T();
                    obj3 = objM91750T4;
                    if (objM91750T4 == obj5) {
                        Object objM49254z2 = hz40.m49254z(dau.f47107a, xq00Var);
                        xq00Var.m91793t0(objM49254z2);
                        obj3 = objM49254z2;
                    }
                    xukVar = (xuk) obj3;
                    xq00Var.m91771i0(-29229382);
                    q630 q630Var2 = s850.f206556a;
                    fxh0VarM61814B = mi21.m61814B(xef0.f260709a, null, 3);
                    if (z14) {
                        qs3Var3 = qs3Var2;
                        fxh0 fxh0VarM69516a2 = pb61.m69516a(cxh0Var, qs3Var3, new d0v(qs3Var3, xukVar, ko70Var, z12, z13));
                        zM91770i3 = xq00Var.m91770i(qs3Var3);
                        Object objM91750T10 = xq00Var.m91750T();
                        if (zM91770i3) {
                            z15 = false;
                            Object a0vVar2 = new a0v(qs3Var3, false ? 1 : 0);
                            xq00Var.m91793t0(a0vVar2);
                            obj4 = a0vVar2;
                        } else {
                            z15 = false;
                            Object a0vVar3 = new a0v(qs3Var3, false ? 1 : 0);
                            xq00Var.m91793t0(a0vVar3);
                            obj4 = a0vVar3;
                        }
                        fxh0VarM61814B = fxh0VarM61814B.mo34315F(bga.m29085g(fxh0VarM69516a2, (gh00) obj4));
                    } else {
                        z15 = false;
                    }
                    xq00Var.m91788r(z15);
                    m6d0 m6d0VarM36007d3 = dha.m36007d(wb9Var, true);
                    int iHashCode3 = Long.hashCode(xq00Var.f264809T);
                    wpn0 wpn0VarM91778m3 = xq00Var.m91778m();
                    fxh0 fxh0VarM48286s3 = hqg1.m48286s(xq00Var, fxh0VarM61814B);
                    xq00Var.m91779m0();
                    if (xq00Var.f264808S) {
                        xq00Var.m91776l(c2087le);
                    } else {
                        xq00Var.m91799w0();
                    }
                    zsf1.m96835F(m6d0VarM36007d3, yhhVar5, xq00Var);
                    zsf1.m96835F(wpn0VarM91778m3, yhhVar6, xq00Var);
                    AbstractC0000a.m20s(iHashCode3, xq00Var, yhhVar7, xq00Var, vlhVar2);
                    zsf1.m96835F(fxh0VarM48286s3, yhhVar8, xq00Var);
                    fyfVar2 = fyfVar;
                    p3n0.m69076g((i9 >> 12) & 14, fyfVar2, xq00Var, true, true);
                    z4 = z14;
                    fxh0Var3 = fxh0Var4;
                    wc61Var6 = wc61Var8;
                    wc61Var5 = wc61Var9;
                } else {
                    xq00Var.m91757b0();
                    fxh0Var3 = fxh0Var2;
                    wc61Var5 = wc61Var3;
                    z4 = z2;
                    wc61Var6 = wc61Var4;
                }
                pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v != null) {
                    pgv0VarM91796v.f177419d = new j69(fxh0Var3, wc61Var5, wc61Var6, z4, fyfVar2, i, i2);
                }
            }
            i3 |= 384;
            wc61Var4 = wc61Var2;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    if (xq00Var.m91768h(z2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i & 24576) == 0) {
                    if (xq00Var.m91770i(fyfVar2)) {
                        i11 = 16384;
                    } else {
                        i11 = 8192;
                    }
                    i3 |= i11;
                }
                if ((i3 & 9363) != 9362) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (xq00Var.m91752Y(i3 & 1, z3)) {
                    cxh0Var = cxh0.f43038a;
                    if (i12 != 0) {
                        fxh0Var2 = cxh0Var;
                    }
                    if (i13 != 0) {
                        wc61Var7 = null;
                    } else {
                        wc61Var7 = wc61Var3;
                    }
                    if (i4 != 0) {
                        wc61Var8 = null;
                    } else {
                        wc61Var8 = wc61Var4;
                    }
                    if (i6 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    ko70Var = (ko70) xq00Var.m91774k(wsh.f254623n);
                    ypoVarM52525a = j641.m52525a(xq00Var);
                    if (wc61Var7 != null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (wc61Var8 != null) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    boolean zM91768h3 = xq00Var.m91768h(z6) | xq00Var.m91768h(z7);
                    if ((i3 & 7168) == 2048) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    zM91762e = zM91768h3 | z8 | xq00Var.m91762e(ko70Var.ordinal());
                    Object objM91750T11 = xq00Var.m91750T();
                    fcsVar = fcs.f68250b;
                    if (zM91762e) {
                        Object objM27720b4 = b04.m27720b(fcsVar, b04.m27721c(new b0v(z6, ko70Var, z7, 0)), e6u.f56750a1, v8s.f238668a1, jg31.m53286y(0.0f, 0.0f, null, 7), ypoVarM52525a);
                        xq00Var.m91793t0(objM27720b4);
                        obj = objM27720b4;
                    } else {
                        Object objM27720b5 = b04.m27720b(fcsVar, b04.m27721c(new b0v(z6, ko70Var, z7, 0)), e6u.f56750a1, v8s.f238668a1, jg31.m53286y(0.0f, 0.0f, null, 7), ypoVarM52525a);
                        xq00Var.m91793t0(objM27720b5);
                        obj = objM27720b5;
                    }
                    qs3Var = (qs3) obj;
                    yum0 yum0Var5 = qs3Var.f191970h;
                    yum0 yum0Var6 = qs3Var.f191969g;
                    Object value5 = yum0Var5.getValue();
                    boolean zM91770i6 = xq00Var.m91770i(qs3Var);
                    i8 = i3 & ContentType.LONG_FORM_ON_DEMAND;
                    if (i8 == 32) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    boolean z18 = zM91770i6 | z9;
                    if ((i3 & 896) == 256) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = z18 | z10;
                    objM91750T = xq00Var.m91750T();
                    if (z11) {
                        objM91750T = new m5u(qs3Var, wc61Var7, wc61Var8, null, 6);
                        xq00Var.m91793t0(objM91750T);
                    } else {
                        objM91750T = new m5u(qs3Var, wc61Var7, wc61Var8, null, 6);
                        xq00Var.m91793t0(objM91750T);
                    }
                    hz40.m49237i(value5, (th00) objM91750T, xq00Var);
                    hmuVar = (hmu) xq00Var.m91774k(lc20.f131804a);
                    fM82978u = m82978u(qs3Var.m73668g(), ko70Var);
                    Object value6 = qs3Var.f191971i.getValue();
                    zM91770i = xq00Var.m91770i(qs3Var) | xq00Var.m91760d(fM82978u) | xq00Var.m91770i(hmuVar);
                    i9 = i3;
                    Object objM91750T12 = xq00Var.m91750T();
                    if (zM91770i) {
                        Object xzuVar4 = new xzu(qs3Var, fM82978u, hmuVar, (fbk) null);
                        xq00Var.m91793t0(xzuVar4);
                        obj2 = xzuVar4;
                    } else {
                        Object xzuVar5 = new xzu(qs3Var, fM82978u, hmuVar, (fbk) null);
                        xq00Var.m91793t0(xzuVar5);
                        obj2 = xzuVar5;
                    }
                    hz40.m49237i(value6, (th00) obj2, xq00Var);
                    objM91750T2 = xq00Var.m91750T();
                    objM52407e = objM91750T2;
                    if (objM91750T2 == obj5) {
                        objM52407e = j4x.m52407e(0, xq00Var);
                    }
                    vum0Var = (vum0) objM52407e;
                    if (vum0Var.m86437v() > 0) {
                        fM63436m = n0e1.m63436m(Math.abs(fM82978u) / vum0Var.m86437v(), 0.0f, 1.0f);
                    } else {
                        fM63436m = 0.0f;
                    }
                    zM91770i2 = xq00Var.m91770i(vum0Var) | xq00Var.m91770i(qs3Var) | xq00Var.m91768h(z6) | xq00Var.m91762e(ko70Var.ordinal()) | xq00Var.m91768h(z7);
                    objM91750T3 = xq00Var.m91750T();
                    if (zM91770i2) {
                        z12 = z6;
                        z13 = z7;
                        objM91750T3 = new zzu(0, qs3Var, vum0Var, ko70Var, z12, z13);
                        qs3Var2 = qs3Var;
                        xq00Var.m91793t0(objM91750T3);
                    } else {
                        z12 = z6;
                        z13 = z7;
                        objM91750T3 = new zzu(0, qs3Var, vum0Var, ko70Var, z12, z13);
                        qs3Var2 = qs3Var;
                        xq00Var.m91793t0(objM91750T3);
                    }
                    fxh0 fxh0VarM45144n3 = glf1.m45144n(fxh0Var2, (gh00) objM91750T3);
                    wb9Var = d7f0.f46166e;
                    m6d0VarM36007d = dha.m36007d(wb9Var, false);
                    fxh0Var4 = fxh0Var2;
                    iHashCode = Long.hashCode(xq00Var.f264809T);
                    wpn0VarM91778m = xq00Var.m91778m();
                    fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM45144n3);
                    soh.f211194A.getClass();
                    c2087le = roh.f201257b;
                    if (ug5Var != null) {
                        pmg1.m70360s();
                        throw null;
                    }
                    xq00Var.m91779m0();
                    if (xq00Var.f264808S) {
                        xq00Var.m91776l(c2087le);
                    } else {
                        xq00Var.m91799w0();
                    }
                    yhh yhhVar9 = roh.f201262g;
                    zsf1.m96835F(m6d0VarM36007d, yhhVar9, xq00Var);
                    yhh yhhVar10 = roh.f201261f;
                    zsf1.m96835F(wpn0VarM91778m, yhhVar10, xq00Var);
                    Integer numValueOf3 = Integer.valueOf(iHashCode);
                    yhh yhhVar11 = roh.f201265j;
                    zsf1.m96835F(numValueOf3, yhhVar11, xq00Var);
                    vlh vlhVar3 = roh.f201266k;
                    zsf1.m96833D(vlhVar3, xq00Var);
                    z14 = z5;
                    yhh yhhVar12 = roh.f201259d;
                    zsf1.m96835F(fxh0VarM48286s, yhhVar12, xq00Var);
                    if (wc61Var7 != null) {
                        wc61Var9 = wc61Var7;
                        i10 = 390;
                        f = fM63436m;
                        xq00Var.m91771i0(-906533153);
                        xq00Var.m91788r(false);
                    } else {
                        wc61Var9 = wc61Var7;
                        i10 = 390;
                        f = fM63436m;
                        xq00Var.m91771i0(-906533153);
                        xq00Var.m91788r(false);
                    }
                    if (wc61Var8 != null) {
                        xq00Var.m91771i0(-906254401);
                        xq00Var.m91788r(false);
                    } else {
                        xq00Var.m91771i0(-906254401);
                        xq00Var.m91788r(false);
                    }
                    objM91750T4 = xq00Var.m91750T();
                    obj3 = objM91750T4;
                    if (objM91750T4 == obj5) {
                        Object objM49254z3 = hz40.m49254z(dau.f47107a, xq00Var);
                        xq00Var.m91793t0(objM49254z3);
                        obj3 = objM49254z3;
                    }
                    xukVar = (xuk) obj3;
                    xq00Var.m91771i0(-29229382);
                    q630 q630Var3 = s850.f206556a;
                    fxh0VarM61814B = mi21.m61814B(xef0.f260709a, null, 3);
                    if (z14) {
                        qs3Var3 = qs3Var2;
                        fxh0 fxh0VarM69516a3 = pb61.m69516a(cxh0Var, qs3Var3, new d0v(qs3Var3, xukVar, ko70Var, z12, z13));
                        zM91770i3 = xq00Var.m91770i(qs3Var3);
                        Object objM91750T13 = xq00Var.m91750T();
                        if (zM91770i3) {
                            z15 = false;
                            Object a0vVar4 = new a0v(qs3Var3, false ? 1 : 0);
                            xq00Var.m91793t0(a0vVar4);
                            obj4 = a0vVar4;
                        } else {
                            z15 = false;
                            Object a0vVar5 = new a0v(qs3Var3, false ? 1 : 0);
                            xq00Var.m91793t0(a0vVar5);
                            obj4 = a0vVar5;
                        }
                        fxh0VarM61814B = fxh0VarM61814B.mo34315F(bga.m29085g(fxh0VarM69516a3, (gh00) obj4));
                    } else {
                        z15 = false;
                    }
                    xq00Var.m91788r(z15);
                    m6d0 m6d0VarM36007d4 = dha.m36007d(wb9Var, true);
                    int iHashCode4 = Long.hashCode(xq00Var.f264809T);
                    wpn0 wpn0VarM91778m4 = xq00Var.m91778m();
                    fxh0 fxh0VarM48286s4 = hqg1.m48286s(xq00Var, fxh0VarM61814B);
                    xq00Var.m91779m0();
                    if (xq00Var.f264808S) {
                        xq00Var.m91776l(c2087le);
                    } else {
                        xq00Var.m91799w0();
                    }
                    zsf1.m96835F(m6d0VarM36007d4, yhhVar9, xq00Var);
                    zsf1.m96835F(wpn0VarM91778m4, yhhVar10, xq00Var);
                    AbstractC0000a.m20s(iHashCode4, xq00Var, yhhVar11, xq00Var, vlhVar3);
                    zsf1.m96835F(fxh0VarM48286s4, yhhVar12, xq00Var);
                    fyfVar2 = fyfVar;
                    p3n0.m69076g((i9 >> 12) & 14, fyfVar2, xq00Var, true, true);
                    z4 = z14;
                    fxh0Var3 = fxh0Var4;
                    wc61Var6 = wc61Var8;
                    wc61Var5 = wc61Var9;
                } else {
                    xq00Var.m91757b0();
                    fxh0Var3 = fxh0Var2;
                    wc61Var5 = wc61Var3;
                    z4 = z2;
                    wc61Var6 = wc61Var4;
                }
                pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v != null) {
                    pgv0VarM91796v.f177419d = new j69(fxh0Var3, wc61Var5, wc61Var6, z4, fyfVar2, i, i2);
                }
            }
            i3 |= 3072;
            z2 = z;
            if ((i & 24576) == 0) {
                if (xq00Var.m91770i(fyfVar2)) {
                    i11 = 16384;
                } else {
                    i11 = 8192;
                }
                i3 |= i11;
            }
            if ((i3 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (xq00Var.m91752Y(i3 & 1, z3)) {
                cxh0Var = cxh0.f43038a;
                if (i12 != 0) {
                    fxh0Var2 = cxh0Var;
                }
                if (i13 != 0) {
                    wc61Var7 = null;
                } else {
                    wc61Var7 = wc61Var3;
                }
                if (i4 != 0) {
                    wc61Var8 = null;
                } else {
                    wc61Var8 = wc61Var4;
                }
                if (i6 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                ko70Var = (ko70) xq00Var.m91774k(wsh.f254623n);
                ypoVarM52525a = j641.m52525a(xq00Var);
                if (wc61Var7 != null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (wc61Var8 != null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean zM91768h4 = xq00Var.m91768h(z6) | xq00Var.m91768h(z7);
                if ((i3 & 7168) == 2048) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                zM91762e = zM91768h4 | z8 | xq00Var.m91762e(ko70Var.ordinal());
                Object objM91750T14 = xq00Var.m91750T();
                fcsVar = fcs.f68250b;
                if (zM91762e) {
                    Object objM27720b6 = b04.m27720b(fcsVar, b04.m27721c(new b0v(z6, ko70Var, z7, 0)), e6u.f56750a1, v8s.f238668a1, jg31.m53286y(0.0f, 0.0f, null, 7), ypoVarM52525a);
                    xq00Var.m91793t0(objM27720b6);
                    obj = objM27720b6;
                } else {
                    Object objM27720b7 = b04.m27720b(fcsVar, b04.m27721c(new b0v(z6, ko70Var, z7, 0)), e6u.f56750a1, v8s.f238668a1, jg31.m53286y(0.0f, 0.0f, null, 7), ypoVarM52525a);
                    xq00Var.m91793t0(objM27720b7);
                    obj = objM27720b7;
                }
                qs3Var = (qs3) obj;
                yum0 yum0Var7 = qs3Var.f191970h;
                yum0 yum0Var8 = qs3Var.f191969g;
                Object value7 = yum0Var7.getValue();
                boolean zM91770i7 = xq00Var.m91770i(qs3Var);
                i8 = i3 & ContentType.LONG_FORM_ON_DEMAND;
                if (i8 == 32) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z19 = zM91770i7 | z9;
                if ((i3 & 896) == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = z19 | z10;
                objM91750T = xq00Var.m91750T();
                if (z11) {
                    objM91750T = new m5u(qs3Var, wc61Var7, wc61Var8, null, 6);
                    xq00Var.m91793t0(objM91750T);
                } else {
                    objM91750T = new m5u(qs3Var, wc61Var7, wc61Var8, null, 6);
                    xq00Var.m91793t0(objM91750T);
                }
                hz40.m49237i(value7, (th00) objM91750T, xq00Var);
                hmuVar = (hmu) xq00Var.m91774k(lc20.f131804a);
                fM82978u = m82978u(qs3Var.m73668g(), ko70Var);
                Object value8 = qs3Var.f191971i.getValue();
                zM91770i = xq00Var.m91770i(qs3Var) | xq00Var.m91760d(fM82978u) | xq00Var.m91770i(hmuVar);
                i9 = i3;
                Object objM91750T15 = xq00Var.m91750T();
                if (zM91770i) {
                    Object xzuVar6 = new xzu(qs3Var, fM82978u, hmuVar, (fbk) null);
                    xq00Var.m91793t0(xzuVar6);
                    obj2 = xzuVar6;
                } else {
                    Object xzuVar7 = new xzu(qs3Var, fM82978u, hmuVar, (fbk) null);
                    xq00Var.m91793t0(xzuVar7);
                    obj2 = xzuVar7;
                }
                hz40.m49237i(value8, (th00) obj2, xq00Var);
                objM91750T2 = xq00Var.m91750T();
                objM52407e = objM91750T2;
                if (objM91750T2 == obj5) {
                    objM52407e = j4x.m52407e(0, xq00Var);
                }
                vum0Var = (vum0) objM52407e;
                if (vum0Var.m86437v() > 0) {
                    fM63436m = n0e1.m63436m(Math.abs(fM82978u) / vum0Var.m86437v(), 0.0f, 1.0f);
                } else {
                    fM63436m = 0.0f;
                }
                zM91770i2 = xq00Var.m91770i(vum0Var) | xq00Var.m91770i(qs3Var) | xq00Var.m91768h(z6) | xq00Var.m91762e(ko70Var.ordinal()) | xq00Var.m91768h(z7);
                objM91750T3 = xq00Var.m91750T();
                if (zM91770i2) {
                    z12 = z6;
                    z13 = z7;
                    objM91750T3 = new zzu(0, qs3Var, vum0Var, ko70Var, z12, z13);
                    qs3Var2 = qs3Var;
                    xq00Var.m91793t0(objM91750T3);
                } else {
                    z12 = z6;
                    z13 = z7;
                    objM91750T3 = new zzu(0, qs3Var, vum0Var, ko70Var, z12, z13);
                    qs3Var2 = qs3Var;
                    xq00Var.m91793t0(objM91750T3);
                }
                fxh0 fxh0VarM45144n4 = glf1.m45144n(fxh0Var2, (gh00) objM91750T3);
                wb9Var = d7f0.f46166e;
                m6d0VarM36007d = dha.m36007d(wb9Var, false);
                fxh0Var4 = fxh0Var2;
                iHashCode = Long.hashCode(xq00Var.f264809T);
                wpn0VarM91778m = xq00Var.m91778m();
                fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM45144n4);
                soh.f211194A.getClass();
                c2087le = roh.f201257b;
                if (ug5Var != null) {
                    pmg1.m70360s();
                    throw null;
                }
                xq00Var.m91779m0();
                if (xq00Var.f264808S) {
                    xq00Var.m91776l(c2087le);
                } else {
                    xq00Var.m91799w0();
                }
                yhh yhhVar13 = roh.f201262g;
                zsf1.m96835F(m6d0VarM36007d, yhhVar13, xq00Var);
                yhh yhhVar14 = roh.f201261f;
                zsf1.m96835F(wpn0VarM91778m, yhhVar14, xq00Var);
                Integer numValueOf4 = Integer.valueOf(iHashCode);
                yhh yhhVar15 = roh.f201265j;
                zsf1.m96835F(numValueOf4, yhhVar15, xq00Var);
                vlh vlhVar4 = roh.f201266k;
                zsf1.m96833D(vlhVar4, xq00Var);
                z14 = z5;
                yhh yhhVar16 = roh.f201259d;
                zsf1.m96835F(fxh0VarM48286s, yhhVar16, xq00Var);
                if (wc61Var7 != null) {
                    wc61Var9 = wc61Var7;
                    i10 = 390;
                    f = fM63436m;
                    xq00Var.m91771i0(-906533153);
                    xq00Var.m91788r(false);
                } else {
                    wc61Var9 = wc61Var7;
                    i10 = 390;
                    f = fM63436m;
                    xq00Var.m91771i0(-906533153);
                    xq00Var.m91788r(false);
                }
                if (wc61Var8 != null) {
                    xq00Var.m91771i0(-906254401);
                    xq00Var.m91788r(false);
                } else {
                    xq00Var.m91771i0(-906254401);
                    xq00Var.m91788r(false);
                }
                objM91750T4 = xq00Var.m91750T();
                obj3 = objM91750T4;
                if (objM91750T4 == obj5) {
                    Object objM49254z4 = hz40.m49254z(dau.f47107a, xq00Var);
                    xq00Var.m91793t0(objM49254z4);
                    obj3 = objM49254z4;
                }
                xukVar = (xuk) obj3;
                xq00Var.m91771i0(-29229382);
                q630 q630Var4 = s850.f206556a;
                fxh0VarM61814B = mi21.m61814B(xef0.f260709a, null, 3);
                if (z14) {
                    qs3Var3 = qs3Var2;
                    fxh0 fxh0VarM69516a4 = pb61.m69516a(cxh0Var, qs3Var3, new d0v(qs3Var3, xukVar, ko70Var, z12, z13));
                    zM91770i3 = xq00Var.m91770i(qs3Var3);
                    Object objM91750T16 = xq00Var.m91750T();
                    if (zM91770i3) {
                        z15 = false;
                        Object a0vVar6 = new a0v(qs3Var3, false ? 1 : 0);
                        xq00Var.m91793t0(a0vVar6);
                        obj4 = a0vVar6;
                    } else {
                        z15 = false;
                        Object a0vVar7 = new a0v(qs3Var3, false ? 1 : 0);
                        xq00Var.m91793t0(a0vVar7);
                        obj4 = a0vVar7;
                    }
                    fxh0VarM61814B = fxh0VarM61814B.mo34315F(bga.m29085g(fxh0VarM69516a4, (gh00) obj4));
                } else {
                    z15 = false;
                }
                xq00Var.m91788r(z15);
                m6d0 m6d0VarM36007d5 = dha.m36007d(wb9Var, true);
                int iHashCode5 = Long.hashCode(xq00Var.f264809T);
                wpn0 wpn0VarM91778m5 = xq00Var.m91778m();
                fxh0 fxh0VarM48286s5 = hqg1.m48286s(xq00Var, fxh0VarM61814B);
                xq00Var.m91779m0();
                if (xq00Var.f264808S) {
                    xq00Var.m91776l(c2087le);
                } else {
                    xq00Var.m91799w0();
                }
                zsf1.m96835F(m6d0VarM36007d5, yhhVar13, xq00Var);
                zsf1.m96835F(wpn0VarM91778m5, yhhVar14, xq00Var);
                AbstractC0000a.m20s(iHashCode5, xq00Var, yhhVar15, xq00Var, vlhVar4);
                zsf1.m96835F(fxh0VarM48286s5, yhhVar16, xq00Var);
                fyfVar2 = fyfVar;
                p3n0.m69076g((i9 >> 12) & 14, fyfVar2, xq00Var, true, true);
                z4 = z14;
                fxh0Var3 = fxh0Var4;
                wc61Var6 = wc61Var8;
                wc61Var5 = wc61Var9;
            } else {
                xq00Var.m91757b0();
                fxh0Var3 = fxh0Var2;
                wc61Var5 = wc61Var3;
                z4 = z2;
                wc61Var6 = wc61Var4;
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new j69(fxh0Var3, wc61Var5, wc61Var6, z4, fyfVar2, i, i2);
            }
        }
        i3 |= 48;
        wc61Var3 = wc61Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                wc61Var4 = wc61Var2;
                if (xq00Var.m91766g(wc61Var4)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    if (xq00Var.m91768h(z2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i & 24576) == 0) {
                    if (xq00Var.m91770i(fyfVar2)) {
                        i11 = 16384;
                    } else {
                        i11 = 8192;
                    }
                    i3 |= i11;
                }
                if ((i3 & 9363) != 9362) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (xq00Var.m91752Y(i3 & 1, z3)) {
                    cxh0Var = cxh0.f43038a;
                    if (i12 != 0) {
                        fxh0Var2 = cxh0Var;
                    }
                    if (i13 != 0) {
                        wc61Var7 = null;
                    } else {
                        wc61Var7 = wc61Var3;
                    }
                    if (i4 != 0) {
                        wc61Var8 = null;
                    } else {
                        wc61Var8 = wc61Var4;
                    }
                    if (i6 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    ko70Var = (ko70) xq00Var.m91774k(wsh.f254623n);
                    ypoVarM52525a = j641.m52525a(xq00Var);
                    if (wc61Var7 != null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (wc61Var8 != null) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    boolean zM91768h5 = xq00Var.m91768h(z6) | xq00Var.m91768h(z7);
                    if ((i3 & 7168) == 2048) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    zM91762e = zM91768h5 | z8 | xq00Var.m91762e(ko70Var.ordinal());
                    Object objM91750T17 = xq00Var.m91750T();
                    fcsVar = fcs.f68250b;
                    if (zM91762e) {
                        Object objM27720b8 = b04.m27720b(fcsVar, b04.m27721c(new b0v(z6, ko70Var, z7, 0)), e6u.f56750a1, v8s.f238668a1, jg31.m53286y(0.0f, 0.0f, null, 7), ypoVarM52525a);
                        xq00Var.m91793t0(objM27720b8);
                        obj = objM27720b8;
                    } else {
                        Object objM27720b9 = b04.m27720b(fcsVar, b04.m27721c(new b0v(z6, ko70Var, z7, 0)), e6u.f56750a1, v8s.f238668a1, jg31.m53286y(0.0f, 0.0f, null, 7), ypoVarM52525a);
                        xq00Var.m91793t0(objM27720b9);
                        obj = objM27720b9;
                    }
                    qs3Var = (qs3) obj;
                    yum0 yum0Var9 = qs3Var.f191970h;
                    yum0 yum0Var10 = qs3Var.f191969g;
                    Object value9 = yum0Var9.getValue();
                    boolean zM91770i8 = xq00Var.m91770i(qs3Var);
                    i8 = i3 & ContentType.LONG_FORM_ON_DEMAND;
                    if (i8 == 32) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    boolean z110 = zM91770i8 | z9;
                    if ((i3 & 896) == 256) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = z110 | z10;
                    objM91750T = xq00Var.m91750T();
                    if (z11) {
                        objM91750T = new m5u(qs3Var, wc61Var7, wc61Var8, null, 6);
                        xq00Var.m91793t0(objM91750T);
                    } else {
                        objM91750T = new m5u(qs3Var, wc61Var7, wc61Var8, null, 6);
                        xq00Var.m91793t0(objM91750T);
                    }
                    hz40.m49237i(value9, (th00) objM91750T, xq00Var);
                    hmuVar = (hmu) xq00Var.m91774k(lc20.f131804a);
                    fM82978u = m82978u(qs3Var.m73668g(), ko70Var);
                    Object value10 = qs3Var.f191971i.getValue();
                    zM91770i = xq00Var.m91770i(qs3Var) | xq00Var.m91760d(fM82978u) | xq00Var.m91770i(hmuVar);
                    i9 = i3;
                    Object objM91750T18 = xq00Var.m91750T();
                    if (zM91770i) {
                        Object xzuVar8 = new xzu(qs3Var, fM82978u, hmuVar, (fbk) null);
                        xq00Var.m91793t0(xzuVar8);
                        obj2 = xzuVar8;
                    } else {
                        Object xzuVar9 = new xzu(qs3Var, fM82978u, hmuVar, (fbk) null);
                        xq00Var.m91793t0(xzuVar9);
                        obj2 = xzuVar9;
                    }
                    hz40.m49237i(value10, (th00) obj2, xq00Var);
                    objM91750T2 = xq00Var.m91750T();
                    objM52407e = objM91750T2;
                    if (objM91750T2 == obj5) {
                        objM52407e = j4x.m52407e(0, xq00Var);
                    }
                    vum0Var = (vum0) objM52407e;
                    if (vum0Var.m86437v() > 0) {
                        fM63436m = n0e1.m63436m(Math.abs(fM82978u) / vum0Var.m86437v(), 0.0f, 1.0f);
                    } else {
                        fM63436m = 0.0f;
                    }
                    zM91770i2 = xq00Var.m91770i(vum0Var) | xq00Var.m91770i(qs3Var) | xq00Var.m91768h(z6) | xq00Var.m91762e(ko70Var.ordinal()) | xq00Var.m91768h(z7);
                    objM91750T3 = xq00Var.m91750T();
                    if (zM91770i2) {
                        z12 = z6;
                        z13 = z7;
                        objM91750T3 = new zzu(0, qs3Var, vum0Var, ko70Var, z12, z13);
                        qs3Var2 = qs3Var;
                        xq00Var.m91793t0(objM91750T3);
                    } else {
                        z12 = z6;
                        z13 = z7;
                        objM91750T3 = new zzu(0, qs3Var, vum0Var, ko70Var, z12, z13);
                        qs3Var2 = qs3Var;
                        xq00Var.m91793t0(objM91750T3);
                    }
                    fxh0 fxh0VarM45144n5 = glf1.m45144n(fxh0Var2, (gh00) objM91750T3);
                    wb9Var = d7f0.f46166e;
                    m6d0VarM36007d = dha.m36007d(wb9Var, false);
                    fxh0Var4 = fxh0Var2;
                    iHashCode = Long.hashCode(xq00Var.f264809T);
                    wpn0VarM91778m = xq00Var.m91778m();
                    fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM45144n5);
                    soh.f211194A.getClass();
                    c2087le = roh.f201257b;
                    if (ug5Var != null) {
                        pmg1.m70360s();
                        throw null;
                    }
                    xq00Var.m91779m0();
                    if (xq00Var.f264808S) {
                        xq00Var.m91776l(c2087le);
                    } else {
                        xq00Var.m91799w0();
                    }
                    yhh yhhVar17 = roh.f201262g;
                    zsf1.m96835F(m6d0VarM36007d, yhhVar17, xq00Var);
                    yhh yhhVar18 = roh.f201261f;
                    zsf1.m96835F(wpn0VarM91778m, yhhVar18, xq00Var);
                    Integer numValueOf5 = Integer.valueOf(iHashCode);
                    yhh yhhVar19 = roh.f201265j;
                    zsf1.m96835F(numValueOf5, yhhVar19, xq00Var);
                    vlh vlhVar5 = roh.f201266k;
                    zsf1.m96833D(vlhVar5, xq00Var);
                    z14 = z5;
                    yhh yhhVar110 = roh.f201259d;
                    zsf1.m96835F(fxh0VarM48286s, yhhVar110, xq00Var);
                    if (wc61Var7 != null) {
                        wc61Var9 = wc61Var7;
                        i10 = 390;
                        f = fM63436m;
                        xq00Var.m91771i0(-906533153);
                        xq00Var.m91788r(false);
                    } else {
                        wc61Var9 = wc61Var7;
                        i10 = 390;
                        f = fM63436m;
                        xq00Var.m91771i0(-906533153);
                        xq00Var.m91788r(false);
                    }
                    if (wc61Var8 != null) {
                        xq00Var.m91771i0(-906254401);
                        xq00Var.m91788r(false);
                    } else {
                        xq00Var.m91771i0(-906254401);
                        xq00Var.m91788r(false);
                    }
                    objM91750T4 = xq00Var.m91750T();
                    obj3 = objM91750T4;
                    if (objM91750T4 == obj5) {
                        Object objM49254z5 = hz40.m49254z(dau.f47107a, xq00Var);
                        xq00Var.m91793t0(objM49254z5);
                        obj3 = objM49254z5;
                    }
                    xukVar = (xuk) obj3;
                    xq00Var.m91771i0(-29229382);
                    q630 q630Var5 = s850.f206556a;
                    fxh0VarM61814B = mi21.m61814B(xef0.f260709a, null, 3);
                    if (z14) {
                        qs3Var3 = qs3Var2;
                        fxh0 fxh0VarM69516a5 = pb61.m69516a(cxh0Var, qs3Var3, new d0v(qs3Var3, xukVar, ko70Var, z12, z13));
                        zM91770i3 = xq00Var.m91770i(qs3Var3);
                        Object objM91750T19 = xq00Var.m91750T();
                        if (zM91770i3) {
                            z15 = false;
                            Object a0vVar8 = new a0v(qs3Var3, false ? 1 : 0);
                            xq00Var.m91793t0(a0vVar8);
                            obj4 = a0vVar8;
                        } else {
                            z15 = false;
                            Object a0vVar9 = new a0v(qs3Var3, false ? 1 : 0);
                            xq00Var.m91793t0(a0vVar9);
                            obj4 = a0vVar9;
                        }
                        fxh0VarM61814B = fxh0VarM61814B.mo34315F(bga.m29085g(fxh0VarM69516a5, (gh00) obj4));
                    } else {
                        z15 = false;
                    }
                    xq00Var.m91788r(z15);
                    m6d0 m6d0VarM36007d6 = dha.m36007d(wb9Var, true);
                    int iHashCode6 = Long.hashCode(xq00Var.f264809T);
                    wpn0 wpn0VarM91778m6 = xq00Var.m91778m();
                    fxh0 fxh0VarM48286s6 = hqg1.m48286s(xq00Var, fxh0VarM61814B);
                    xq00Var.m91779m0();
                    if (xq00Var.f264808S) {
                        xq00Var.m91776l(c2087le);
                    } else {
                        xq00Var.m91799w0();
                    }
                    zsf1.m96835F(m6d0VarM36007d6, yhhVar17, xq00Var);
                    zsf1.m96835F(wpn0VarM91778m6, yhhVar18, xq00Var);
                    AbstractC0000a.m20s(iHashCode6, xq00Var, yhhVar19, xq00Var, vlhVar5);
                    zsf1.m96835F(fxh0VarM48286s6, yhhVar110, xq00Var);
                    fyfVar2 = fyfVar;
                    p3n0.m69076g((i9 >> 12) & 14, fyfVar2, xq00Var, true, true);
                    z4 = z14;
                    fxh0Var3 = fxh0Var4;
                    wc61Var6 = wc61Var8;
                    wc61Var5 = wc61Var9;
                } else {
                    xq00Var.m91757b0();
                    fxh0Var3 = fxh0Var2;
                    wc61Var5 = wc61Var3;
                    z4 = z2;
                    wc61Var6 = wc61Var4;
                }
                pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v != null) {
                    pgv0VarM91796v.f177419d = new j69(fxh0Var3, wc61Var5, wc61Var6, z4, fyfVar2, i, i2);
                }
            }
            i3 |= 3072;
            z2 = z;
            if ((i & 24576) == 0) {
                if (xq00Var.m91770i(fyfVar2)) {
                    i11 = 16384;
                } else {
                    i11 = 8192;
                }
                i3 |= i11;
            }
            if ((i3 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (xq00Var.m91752Y(i3 & 1, z3)) {
                cxh0Var = cxh0.f43038a;
                if (i12 != 0) {
                    fxh0Var2 = cxh0Var;
                }
                if (i13 != 0) {
                    wc61Var7 = null;
                } else {
                    wc61Var7 = wc61Var3;
                }
                if (i4 != 0) {
                    wc61Var8 = null;
                } else {
                    wc61Var8 = wc61Var4;
                }
                if (i6 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                ko70Var = (ko70) xq00Var.m91774k(wsh.f254623n);
                ypoVarM52525a = j641.m52525a(xq00Var);
                if (wc61Var7 != null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (wc61Var8 != null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean zM91768h6 = xq00Var.m91768h(z6) | xq00Var.m91768h(z7);
                if ((i3 & 7168) == 2048) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                zM91762e = zM91768h6 | z8 | xq00Var.m91762e(ko70Var.ordinal());
                Object objM91750T110 = xq00Var.m91750T();
                fcsVar = fcs.f68250b;
                if (zM91762e) {
                    Object objM27720b10 = b04.m27720b(fcsVar, b04.m27721c(new b0v(z6, ko70Var, z7, 0)), e6u.f56750a1, v8s.f238668a1, jg31.m53286y(0.0f, 0.0f, null, 7), ypoVarM52525a);
                    xq00Var.m91793t0(objM27720b10);
                    obj = objM27720b10;
                } else {
                    Object objM27720b11 = b04.m27720b(fcsVar, b04.m27721c(new b0v(z6, ko70Var, z7, 0)), e6u.f56750a1, v8s.f238668a1, jg31.m53286y(0.0f, 0.0f, null, 7), ypoVarM52525a);
                    xq00Var.m91793t0(objM27720b11);
                    obj = objM27720b11;
                }
                qs3Var = (qs3) obj;
                yum0 yum0Var11 = qs3Var.f191970h;
                yum0 yum0Var12 = qs3Var.f191969g;
                Object value11 = yum0Var11.getValue();
                boolean zM91770i9 = xq00Var.m91770i(qs3Var);
                i8 = i3 & ContentType.LONG_FORM_ON_DEMAND;
                if (i8 == 32) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z111 = zM91770i9 | z9;
                if ((i3 & 896) == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = z111 | z10;
                objM91750T = xq00Var.m91750T();
                if (z11) {
                    objM91750T = new m5u(qs3Var, wc61Var7, wc61Var8, null, 6);
                    xq00Var.m91793t0(objM91750T);
                } else {
                    objM91750T = new m5u(qs3Var, wc61Var7, wc61Var8, null, 6);
                    xq00Var.m91793t0(objM91750T);
                }
                hz40.m49237i(value11, (th00) objM91750T, xq00Var);
                hmuVar = (hmu) xq00Var.m91774k(lc20.f131804a);
                fM82978u = m82978u(qs3Var.m73668g(), ko70Var);
                Object value12 = qs3Var.f191971i.getValue();
                zM91770i = xq00Var.m91770i(qs3Var) | xq00Var.m91760d(fM82978u) | xq00Var.m91770i(hmuVar);
                i9 = i3;
                Object objM91750T111 = xq00Var.m91750T();
                if (zM91770i) {
                    Object xzuVar10 = new xzu(qs3Var, fM82978u, hmuVar, (fbk) null);
                    xq00Var.m91793t0(xzuVar10);
                    obj2 = xzuVar10;
                } else {
                    Object xzuVar11 = new xzu(qs3Var, fM82978u, hmuVar, (fbk) null);
                    xq00Var.m91793t0(xzuVar11);
                    obj2 = xzuVar11;
                }
                hz40.m49237i(value12, (th00) obj2, xq00Var);
                objM91750T2 = xq00Var.m91750T();
                objM52407e = objM91750T2;
                if (objM91750T2 == obj5) {
                    objM52407e = j4x.m52407e(0, xq00Var);
                }
                vum0Var = (vum0) objM52407e;
                if (vum0Var.m86437v() > 0) {
                    fM63436m = n0e1.m63436m(Math.abs(fM82978u) / vum0Var.m86437v(), 0.0f, 1.0f);
                } else {
                    fM63436m = 0.0f;
                }
                zM91770i2 = xq00Var.m91770i(vum0Var) | xq00Var.m91770i(qs3Var) | xq00Var.m91768h(z6) | xq00Var.m91762e(ko70Var.ordinal()) | xq00Var.m91768h(z7);
                objM91750T3 = xq00Var.m91750T();
                if (zM91770i2) {
                    z12 = z6;
                    z13 = z7;
                    objM91750T3 = new zzu(0, qs3Var, vum0Var, ko70Var, z12, z13);
                    qs3Var2 = qs3Var;
                    xq00Var.m91793t0(objM91750T3);
                } else {
                    z12 = z6;
                    z13 = z7;
                    objM91750T3 = new zzu(0, qs3Var, vum0Var, ko70Var, z12, z13);
                    qs3Var2 = qs3Var;
                    xq00Var.m91793t0(objM91750T3);
                }
                fxh0 fxh0VarM45144n6 = glf1.m45144n(fxh0Var2, (gh00) objM91750T3);
                wb9Var = d7f0.f46166e;
                m6d0VarM36007d = dha.m36007d(wb9Var, false);
                fxh0Var4 = fxh0Var2;
                iHashCode = Long.hashCode(xq00Var.f264809T);
                wpn0VarM91778m = xq00Var.m91778m();
                fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM45144n6);
                soh.f211194A.getClass();
                c2087le = roh.f201257b;
                if (ug5Var != null) {
                    pmg1.m70360s();
                    throw null;
                }
                xq00Var.m91779m0();
                if (xq00Var.f264808S) {
                    xq00Var.m91776l(c2087le);
                } else {
                    xq00Var.m91799w0();
                }
                yhh yhhVar111 = roh.f201262g;
                zsf1.m96835F(m6d0VarM36007d, yhhVar111, xq00Var);
                yhh yhhVar112 = roh.f201261f;
                zsf1.m96835F(wpn0VarM91778m, yhhVar112, xq00Var);
                Integer numValueOf6 = Integer.valueOf(iHashCode);
                yhh yhhVar113 = roh.f201265j;
                zsf1.m96835F(numValueOf6, yhhVar113, xq00Var);
                vlh vlhVar6 = roh.f201266k;
                zsf1.m96833D(vlhVar6, xq00Var);
                z14 = z5;
                yhh yhhVar114 = roh.f201259d;
                zsf1.m96835F(fxh0VarM48286s, yhhVar114, xq00Var);
                if (wc61Var7 != null) {
                    wc61Var9 = wc61Var7;
                    i10 = 390;
                    f = fM63436m;
                    xq00Var.m91771i0(-906533153);
                    xq00Var.m91788r(false);
                } else {
                    wc61Var9 = wc61Var7;
                    i10 = 390;
                    f = fM63436m;
                    xq00Var.m91771i0(-906533153);
                    xq00Var.m91788r(false);
                }
                if (wc61Var8 != null) {
                    xq00Var.m91771i0(-906254401);
                    xq00Var.m91788r(false);
                } else {
                    xq00Var.m91771i0(-906254401);
                    xq00Var.m91788r(false);
                }
                objM91750T4 = xq00Var.m91750T();
                obj3 = objM91750T4;
                if (objM91750T4 == obj5) {
                    Object objM49254z6 = hz40.m49254z(dau.f47107a, xq00Var);
                    xq00Var.m91793t0(objM49254z6);
                    obj3 = objM49254z6;
                }
                xukVar = (xuk) obj3;
                xq00Var.m91771i0(-29229382);
                q630 q630Var6 = s850.f206556a;
                fxh0VarM61814B = mi21.m61814B(xef0.f260709a, null, 3);
                if (z14) {
                    qs3Var3 = qs3Var2;
                    fxh0 fxh0VarM69516a6 = pb61.m69516a(cxh0Var, qs3Var3, new d0v(qs3Var3, xukVar, ko70Var, z12, z13));
                    zM91770i3 = xq00Var.m91770i(qs3Var3);
                    Object objM91750T112 = xq00Var.m91750T();
                    if (zM91770i3) {
                        z15 = false;
                        Object a0vVar10 = new a0v(qs3Var3, false ? 1 : 0);
                        xq00Var.m91793t0(a0vVar10);
                        obj4 = a0vVar10;
                    } else {
                        z15 = false;
                        Object a0vVar11 = new a0v(qs3Var3, false ? 1 : 0);
                        xq00Var.m91793t0(a0vVar11);
                        obj4 = a0vVar11;
                    }
                    fxh0VarM61814B = fxh0VarM61814B.mo34315F(bga.m29085g(fxh0VarM69516a6, (gh00) obj4));
                } else {
                    z15 = false;
                }
                xq00Var.m91788r(z15);
                m6d0 m6d0VarM36007d7 = dha.m36007d(wb9Var, true);
                int iHashCode7 = Long.hashCode(xq00Var.f264809T);
                wpn0 wpn0VarM91778m7 = xq00Var.m91778m();
                fxh0 fxh0VarM48286s7 = hqg1.m48286s(xq00Var, fxh0VarM61814B);
                xq00Var.m91779m0();
                if (xq00Var.f264808S) {
                    xq00Var.m91776l(c2087le);
                } else {
                    xq00Var.m91799w0();
                }
                zsf1.m96835F(m6d0VarM36007d7, yhhVar111, xq00Var);
                zsf1.m96835F(wpn0VarM91778m7, yhhVar112, xq00Var);
                AbstractC0000a.m20s(iHashCode7, xq00Var, yhhVar113, xq00Var, vlhVar6);
                zsf1.m96835F(fxh0VarM48286s7, yhhVar114, xq00Var);
                fyfVar2 = fyfVar;
                p3n0.m69076g((i9 >> 12) & 14, fyfVar2, xq00Var, true, true);
                z4 = z14;
                fxh0Var3 = fxh0Var4;
                wc61Var6 = wc61Var8;
                wc61Var5 = wc61Var9;
            } else {
                xq00Var.m91757b0();
                fxh0Var3 = fxh0Var2;
                wc61Var5 = wc61Var3;
                z4 = z2;
                wc61Var6 = wc61Var4;
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new j69(fxh0Var3, wc61Var5, wc61Var6, z4, fyfVar2, i, i2);
            }
        }
        i3 |= 384;
        wc61Var4 = wc61Var2;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                if (xq00Var.m91768h(z2)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            if ((i & 24576) == 0) {
                if (xq00Var.m91770i(fyfVar2)) {
                    i11 = 16384;
                } else {
                    i11 = 8192;
                }
                i3 |= i11;
            }
            if ((i3 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (xq00Var.m91752Y(i3 & 1, z3)) {
                cxh0Var = cxh0.f43038a;
                if (i12 != 0) {
                    fxh0Var2 = cxh0Var;
                }
                if (i13 != 0) {
                    wc61Var7 = null;
                } else {
                    wc61Var7 = wc61Var3;
                }
                if (i4 != 0) {
                    wc61Var8 = null;
                } else {
                    wc61Var8 = wc61Var4;
                }
                if (i6 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                ko70Var = (ko70) xq00Var.m91774k(wsh.f254623n);
                ypoVarM52525a = j641.m52525a(xq00Var);
                if (wc61Var7 != null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (wc61Var8 != null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean zM91768h7 = xq00Var.m91768h(z6) | xq00Var.m91768h(z7);
                if ((i3 & 7168) == 2048) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                zM91762e = zM91768h7 | z8 | xq00Var.m91762e(ko70Var.ordinal());
                Object objM91750T113 = xq00Var.m91750T();
                fcsVar = fcs.f68250b;
                if (zM91762e) {
                    Object objM27720b12 = b04.m27720b(fcsVar, b04.m27721c(new b0v(z6, ko70Var, z7, 0)), e6u.f56750a1, v8s.f238668a1, jg31.m53286y(0.0f, 0.0f, null, 7), ypoVarM52525a);
                    xq00Var.m91793t0(objM27720b12);
                    obj = objM27720b12;
                } else {
                    Object objM27720b13 = b04.m27720b(fcsVar, b04.m27721c(new b0v(z6, ko70Var, z7, 0)), e6u.f56750a1, v8s.f238668a1, jg31.m53286y(0.0f, 0.0f, null, 7), ypoVarM52525a);
                    xq00Var.m91793t0(objM27720b13);
                    obj = objM27720b13;
                }
                qs3Var = (qs3) obj;
                yum0 yum0Var13 = qs3Var.f191970h;
                yum0 yum0Var14 = qs3Var.f191969g;
                Object value13 = yum0Var13.getValue();
                boolean zM91770i10 = xq00Var.m91770i(qs3Var);
                i8 = i3 & ContentType.LONG_FORM_ON_DEMAND;
                if (i8 == 32) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z112 = zM91770i10 | z9;
                if ((i3 & 896) == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = z112 | z10;
                objM91750T = xq00Var.m91750T();
                if (z11) {
                    objM91750T = new m5u(qs3Var, wc61Var7, wc61Var8, null, 6);
                    xq00Var.m91793t0(objM91750T);
                } else {
                    objM91750T = new m5u(qs3Var, wc61Var7, wc61Var8, null, 6);
                    xq00Var.m91793t0(objM91750T);
                }
                hz40.m49237i(value13, (th00) objM91750T, xq00Var);
                hmuVar = (hmu) xq00Var.m91774k(lc20.f131804a);
                fM82978u = m82978u(qs3Var.m73668g(), ko70Var);
                Object value14 = qs3Var.f191971i.getValue();
                zM91770i = xq00Var.m91770i(qs3Var) | xq00Var.m91760d(fM82978u) | xq00Var.m91770i(hmuVar);
                i9 = i3;
                Object objM91750T114 = xq00Var.m91750T();
                if (zM91770i) {
                    Object xzuVar12 = new xzu(qs3Var, fM82978u, hmuVar, (fbk) null);
                    xq00Var.m91793t0(xzuVar12);
                    obj2 = xzuVar12;
                } else {
                    Object xzuVar13 = new xzu(qs3Var, fM82978u, hmuVar, (fbk) null);
                    xq00Var.m91793t0(xzuVar13);
                    obj2 = xzuVar13;
                }
                hz40.m49237i(value14, (th00) obj2, xq00Var);
                objM91750T2 = xq00Var.m91750T();
                objM52407e = objM91750T2;
                if (objM91750T2 == obj5) {
                    objM52407e = j4x.m52407e(0, xq00Var);
                }
                vum0Var = (vum0) objM52407e;
                if (vum0Var.m86437v() > 0) {
                    fM63436m = n0e1.m63436m(Math.abs(fM82978u) / vum0Var.m86437v(), 0.0f, 1.0f);
                } else {
                    fM63436m = 0.0f;
                }
                zM91770i2 = xq00Var.m91770i(vum0Var) | xq00Var.m91770i(qs3Var) | xq00Var.m91768h(z6) | xq00Var.m91762e(ko70Var.ordinal()) | xq00Var.m91768h(z7);
                objM91750T3 = xq00Var.m91750T();
                if (zM91770i2) {
                    z12 = z6;
                    z13 = z7;
                    objM91750T3 = new zzu(0, qs3Var, vum0Var, ko70Var, z12, z13);
                    qs3Var2 = qs3Var;
                    xq00Var.m91793t0(objM91750T3);
                } else {
                    z12 = z6;
                    z13 = z7;
                    objM91750T3 = new zzu(0, qs3Var, vum0Var, ko70Var, z12, z13);
                    qs3Var2 = qs3Var;
                    xq00Var.m91793t0(objM91750T3);
                }
                fxh0 fxh0VarM45144n7 = glf1.m45144n(fxh0Var2, (gh00) objM91750T3);
                wb9Var = d7f0.f46166e;
                m6d0VarM36007d = dha.m36007d(wb9Var, false);
                fxh0Var4 = fxh0Var2;
                iHashCode = Long.hashCode(xq00Var.f264809T);
                wpn0VarM91778m = xq00Var.m91778m();
                fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM45144n7);
                soh.f211194A.getClass();
                c2087le = roh.f201257b;
                if (ug5Var != null) {
                    pmg1.m70360s();
                    throw null;
                }
                xq00Var.m91779m0();
                if (xq00Var.f264808S) {
                    xq00Var.m91776l(c2087le);
                } else {
                    xq00Var.m91799w0();
                }
                yhh yhhVar115 = roh.f201262g;
                zsf1.m96835F(m6d0VarM36007d, yhhVar115, xq00Var);
                yhh yhhVar116 = roh.f201261f;
                zsf1.m96835F(wpn0VarM91778m, yhhVar116, xq00Var);
                Integer numValueOf7 = Integer.valueOf(iHashCode);
                yhh yhhVar117 = roh.f201265j;
                zsf1.m96835F(numValueOf7, yhhVar117, xq00Var);
                vlh vlhVar7 = roh.f201266k;
                zsf1.m96833D(vlhVar7, xq00Var);
                z14 = z5;
                yhh yhhVar118 = roh.f201259d;
                zsf1.m96835F(fxh0VarM48286s, yhhVar118, xq00Var);
                if (wc61Var7 != null) {
                    wc61Var9 = wc61Var7;
                    i10 = 390;
                    f = fM63436m;
                    xq00Var.m91771i0(-906533153);
                    xq00Var.m91788r(false);
                } else {
                    wc61Var9 = wc61Var7;
                    i10 = 390;
                    f = fM63436m;
                    xq00Var.m91771i0(-906533153);
                    xq00Var.m91788r(false);
                }
                if (wc61Var8 != null) {
                    xq00Var.m91771i0(-906254401);
                    xq00Var.m91788r(false);
                } else {
                    xq00Var.m91771i0(-906254401);
                    xq00Var.m91788r(false);
                }
                objM91750T4 = xq00Var.m91750T();
                obj3 = objM91750T4;
                if (objM91750T4 == obj5) {
                    Object objM49254z7 = hz40.m49254z(dau.f47107a, xq00Var);
                    xq00Var.m91793t0(objM49254z7);
                    obj3 = objM49254z7;
                }
                xukVar = (xuk) obj3;
                xq00Var.m91771i0(-29229382);
                q630 q630Var7 = s850.f206556a;
                fxh0VarM61814B = mi21.m61814B(xef0.f260709a, null, 3);
                if (z14) {
                    qs3Var3 = qs3Var2;
                    fxh0 fxh0VarM69516a7 = pb61.m69516a(cxh0Var, qs3Var3, new d0v(qs3Var3, xukVar, ko70Var, z12, z13));
                    zM91770i3 = xq00Var.m91770i(qs3Var3);
                    Object objM91750T115 = xq00Var.m91750T();
                    if (zM91770i3) {
                        z15 = false;
                        Object a0vVar12 = new a0v(qs3Var3, false ? 1 : 0);
                        xq00Var.m91793t0(a0vVar12);
                        obj4 = a0vVar12;
                    } else {
                        z15 = false;
                        Object a0vVar13 = new a0v(qs3Var3, false ? 1 : 0);
                        xq00Var.m91793t0(a0vVar13);
                        obj4 = a0vVar13;
                    }
                    fxh0VarM61814B = fxh0VarM61814B.mo34315F(bga.m29085g(fxh0VarM69516a7, (gh00) obj4));
                } else {
                    z15 = false;
                }
                xq00Var.m91788r(z15);
                m6d0 m6d0VarM36007d8 = dha.m36007d(wb9Var, true);
                int iHashCode8 = Long.hashCode(xq00Var.f264809T);
                wpn0 wpn0VarM91778m8 = xq00Var.m91778m();
                fxh0 fxh0VarM48286s8 = hqg1.m48286s(xq00Var, fxh0VarM61814B);
                xq00Var.m91779m0();
                if (xq00Var.f264808S) {
                    xq00Var.m91776l(c2087le);
                } else {
                    xq00Var.m91799w0();
                }
                zsf1.m96835F(m6d0VarM36007d8, yhhVar115, xq00Var);
                zsf1.m96835F(wpn0VarM91778m8, yhhVar116, xq00Var);
                AbstractC0000a.m20s(iHashCode8, xq00Var, yhhVar117, xq00Var, vlhVar7);
                zsf1.m96835F(fxh0VarM48286s8, yhhVar118, xq00Var);
                fyfVar2 = fyfVar;
                p3n0.m69076g((i9 >> 12) & 14, fyfVar2, xq00Var, true, true);
                z4 = z14;
                fxh0Var3 = fxh0Var4;
                wc61Var6 = wc61Var8;
                wc61Var5 = wc61Var9;
            } else {
                xq00Var.m91757b0();
                fxh0Var3 = fxh0Var2;
                wc61Var5 = wc61Var3;
                z4 = z2;
                wc61Var6 = wc61Var4;
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new j69(fxh0Var3, wc61Var5, wc61Var6, z4, fyfVar2, i, i2);
            }
        }
        i3 |= 3072;
        z2 = z;
        if ((i & 24576) == 0) {
            if (xq00Var.m91770i(fyfVar2)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i3 |= i11;
        }
        if ((i3 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (xq00Var.m91752Y(i3 & 1, z3)) {
            cxh0Var = cxh0.f43038a;
            if (i12 != 0) {
                fxh0Var2 = cxh0Var;
            }
            if (i13 != 0) {
                wc61Var7 = null;
            } else {
                wc61Var7 = wc61Var3;
            }
            if (i4 != 0) {
                wc61Var8 = null;
            } else {
                wc61Var8 = wc61Var4;
            }
            if (i6 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            ko70Var = (ko70) xq00Var.m91774k(wsh.f254623n);
            ypoVarM52525a = j641.m52525a(xq00Var);
            if (wc61Var7 != null) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (wc61Var8 != null) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean zM91768h8 = xq00Var.m91768h(z6) | xq00Var.m91768h(z7);
            if ((i3 & 7168) == 2048) {
                z8 = true;
            } else {
                z8 = false;
            }
            zM91762e = zM91768h8 | z8 | xq00Var.m91762e(ko70Var.ordinal());
            Object objM91750T116 = xq00Var.m91750T();
            fcsVar = fcs.f68250b;
            if (zM91762e) {
                Object objM27720b14 = b04.m27720b(fcsVar, b04.m27721c(new b0v(z6, ko70Var, z7, 0)), e6u.f56750a1, v8s.f238668a1, jg31.m53286y(0.0f, 0.0f, null, 7), ypoVarM52525a);
                xq00Var.m91793t0(objM27720b14);
                obj = objM27720b14;
            } else {
                Object objM27720b15 = b04.m27720b(fcsVar, b04.m27721c(new b0v(z6, ko70Var, z7, 0)), e6u.f56750a1, v8s.f238668a1, jg31.m53286y(0.0f, 0.0f, null, 7), ypoVarM52525a);
                xq00Var.m91793t0(objM27720b15);
                obj = objM27720b15;
            }
            qs3Var = (qs3) obj;
            yum0 yum0Var15 = qs3Var.f191970h;
            yum0 yum0Var16 = qs3Var.f191969g;
            Object value15 = yum0Var15.getValue();
            boolean zM91770i11 = xq00Var.m91770i(qs3Var);
            i8 = i3 & ContentType.LONG_FORM_ON_DEMAND;
            if (i8 == 32) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z113 = zM91770i11 | z9;
            if ((i3 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = z113 | z10;
            objM91750T = xq00Var.m91750T();
            if (z11) {
                objM91750T = new m5u(qs3Var, wc61Var7, wc61Var8, null, 6);
                xq00Var.m91793t0(objM91750T);
            } else {
                objM91750T = new m5u(qs3Var, wc61Var7, wc61Var8, null, 6);
                xq00Var.m91793t0(objM91750T);
            }
            hz40.m49237i(value15, (th00) objM91750T, xq00Var);
            hmuVar = (hmu) xq00Var.m91774k(lc20.f131804a);
            fM82978u = m82978u(qs3Var.m73668g(), ko70Var);
            Object value16 = qs3Var.f191971i.getValue();
            zM91770i = xq00Var.m91770i(qs3Var) | xq00Var.m91760d(fM82978u) | xq00Var.m91770i(hmuVar);
            i9 = i3;
            Object objM91750T117 = xq00Var.m91750T();
            if (zM91770i) {
                Object xzuVar14 = new xzu(qs3Var, fM82978u, hmuVar, (fbk) null);
                xq00Var.m91793t0(xzuVar14);
                obj2 = xzuVar14;
            } else {
                Object xzuVar15 = new xzu(qs3Var, fM82978u, hmuVar, (fbk) null);
                xq00Var.m91793t0(xzuVar15);
                obj2 = xzuVar15;
            }
            hz40.m49237i(value16, (th00) obj2, xq00Var);
            objM91750T2 = xq00Var.m91750T();
            objM52407e = objM91750T2;
            if (objM91750T2 == obj5) {
                objM52407e = j4x.m52407e(0, xq00Var);
            }
            vum0Var = (vum0) objM52407e;
            if (vum0Var.m86437v() > 0) {
                fM63436m = n0e1.m63436m(Math.abs(fM82978u) / vum0Var.m86437v(), 0.0f, 1.0f);
            } else {
                fM63436m = 0.0f;
            }
            zM91770i2 = xq00Var.m91770i(vum0Var) | xq00Var.m91770i(qs3Var) | xq00Var.m91768h(z6) | xq00Var.m91762e(ko70Var.ordinal()) | xq00Var.m91768h(z7);
            objM91750T3 = xq00Var.m91750T();
            if (zM91770i2) {
                z12 = z6;
                z13 = z7;
                objM91750T3 = new zzu(0, qs3Var, vum0Var, ko70Var, z12, z13);
                qs3Var2 = qs3Var;
                xq00Var.m91793t0(objM91750T3);
            } else {
                z12 = z6;
                z13 = z7;
                objM91750T3 = new zzu(0, qs3Var, vum0Var, ko70Var, z12, z13);
                qs3Var2 = qs3Var;
                xq00Var.m91793t0(objM91750T3);
            }
            fxh0 fxh0VarM45144n8 = glf1.m45144n(fxh0Var2, (gh00) objM91750T3);
            wb9Var = d7f0.f46166e;
            m6d0VarM36007d = dha.m36007d(wb9Var, false);
            fxh0Var4 = fxh0Var2;
            iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0VarM91778m = xq00Var.m91778m();
            fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM45144n8);
            soh.f211194A.getClass();
            c2087le = roh.f201257b;
            if (ug5Var != null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            yhh yhhVar119 = roh.f201262g;
            zsf1.m96835F(m6d0VarM36007d, yhhVar119, xq00Var);
            yhh yhhVar1110 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar1110, xq00Var);
            Integer numValueOf8 = Integer.valueOf(iHashCode);
            yhh yhhVar1111 = roh.f201265j;
            zsf1.m96835F(numValueOf8, yhhVar1111, xq00Var);
            vlh vlhVar8 = roh.f201266k;
            zsf1.m96833D(vlhVar8, xq00Var);
            z14 = z5;
            yhh yhhVar1112 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar1112, xq00Var);
            if (wc61Var7 != null) {
                wc61Var9 = wc61Var7;
                i10 = 390;
                f = fM63436m;
                xq00Var.m91771i0(-906533153);
                xq00Var.m91788r(false);
            } else {
                wc61Var9 = wc61Var7;
                i10 = 390;
                f = fM63436m;
                xq00Var.m91771i0(-906533153);
                xq00Var.m91788r(false);
            }
            if (wc61Var8 != null) {
                xq00Var.m91771i0(-906254401);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-906254401);
                xq00Var.m91788r(false);
            }
            objM91750T4 = xq00Var.m91750T();
            obj3 = objM91750T4;
            if (objM91750T4 == obj5) {
                Object objM49254z8 = hz40.m49254z(dau.f47107a, xq00Var);
                xq00Var.m91793t0(objM49254z8);
                obj3 = objM49254z8;
            }
            xukVar = (xuk) obj3;
            xq00Var.m91771i0(-29229382);
            q630 q630Var8 = s850.f206556a;
            fxh0VarM61814B = mi21.m61814B(xef0.f260709a, null, 3);
            if (z14) {
                qs3Var3 = qs3Var2;
                fxh0 fxh0VarM69516a8 = pb61.m69516a(cxh0Var, qs3Var3, new d0v(qs3Var3, xukVar, ko70Var, z12, z13));
                zM91770i3 = xq00Var.m91770i(qs3Var3);
                Object objM91750T118 = xq00Var.m91750T();
                if (zM91770i3) {
                    z15 = false;
                    Object a0vVar14 = new a0v(qs3Var3, false ? 1 : 0);
                    xq00Var.m91793t0(a0vVar14);
                    obj4 = a0vVar14;
                } else {
                    z15 = false;
                    Object a0vVar15 = new a0v(qs3Var3, false ? 1 : 0);
                    xq00Var.m91793t0(a0vVar15);
                    obj4 = a0vVar15;
                }
                fxh0VarM61814B = fxh0VarM61814B.mo34315F(bga.m29085g(fxh0VarM69516a8, (gh00) obj4));
            } else {
                z15 = false;
            }
            xq00Var.m91788r(z15);
            m6d0 m6d0VarM36007d9 = dha.m36007d(wb9Var, true);
            int iHashCode9 = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m9 = xq00Var.m91778m();
            fxh0 fxh0VarM48286s9 = hqg1.m48286s(xq00Var, fxh0VarM61814B);
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d9, yhhVar119, xq00Var);
            zsf1.m96835F(wpn0VarM91778m9, yhhVar1110, xq00Var);
            AbstractC0000a.m20s(iHashCode9, xq00Var, yhhVar1111, xq00Var, vlhVar8);
            zsf1.m96835F(fxh0VarM48286s9, yhhVar1112, xq00Var);
            fyfVar2 = fyfVar;
            p3n0.m69076g((i9 >> 12) & 14, fyfVar2, xq00Var, true, true);
            z4 = z14;
            fxh0Var3 = fxh0Var4;
            wc61Var6 = wc61Var8;
            wc61Var5 = wc61Var9;
        } else {
            xq00Var.m91757b0();
            fxh0Var3 = fxh0Var2;
            wc61Var5 = wc61Var3;
            z4 = z2;
            wc61Var6 = wc61Var4;
        }
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new j69(fxh0Var3, wc61Var5, wc61Var6, z4, fyfVar2, i, i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m82964b(fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(1245297973);
        int i2 = i | 6;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            gfp gfpVar = leu.f132721a;
            float f = dy01.f54145c;
            fxh0Var2 = cxh0.f43038a;
            fxh0 fxh0VarM39673I = epv0.m39673I("LoadingHorizontalListSection", mi21.m61822f(1.0f, mi21.m61826j(fxh0Var2, f, 0.0f, 2)));
            float f2 = leu.m58816b(xq00Var).f117230b.f224761d;
            float f3 = leu.m58816b(xq00Var).f117230b.f224762e;
            j4m0 j4m0Var = new j4m0(f3, f2, f3, f2);
            zi5 zi5Var = bj5.f27610a;
            xi5 xi5VarM29370g = bj5.m29370g(leu.m58816b(xq00Var).f117230b.f224761d);
            Object objM91750T = xq00Var.m91750T();
            if (objM91750T == t6x0.f217647t) {
                objM91750T = z3a0.f278835X;
                xq00Var.m91793t0(objM91750T);
            }
            fyg1.m43086j(fxh0VarM39673I, null, j4m0Var, xi5VarM29370g, null, null, false, null, (gh00) objM91750T, xq00Var, 817889280, 362);
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new i560(fxh0Var2, i, 8);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m82965c(String str, String str2, wwu wwuVar, qf40 qf40Var, eh00 eh00Var, eh00 eh00Var2, fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        cxh0 cxh0Var;
        boolean z;
        boolean z2;
        xq00 xq00Var2 = xq00Var;
        ub9 ub9Var = d7f0.f46145P0;
        xq00Var2.m91775k0(-2068422842);
        ug5 ug5Var = xq00Var2.f264811a;
        int i2 = i | (xq00Var2.m91766g(str) ? 4 : 2) | (xq00Var2.m91766g(str2) ? 32 : 16) | (xq00Var2.m91770i(wwuVar) ? 256 : 128) | (xq00Var2.m91766g(qf40Var) ? 2048 : 1024) | (xq00Var2.m91770i(eh00Var) ? 16384 : 8192) | (xq00Var2.m91770i(eh00Var2) ? 131072 : 65536) | 1572864;
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 599187) != 599186)) {
            cxh0 cxh0Var2 = cxh0.f43038a;
            fxh0 fxh0VarM39673I = epv0.m39673I("OFFLINE_ERROR_ROOT_TAG", mi21.m61820d(1.0f, cxh0Var2));
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46174i, false);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM39673I);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (ug5Var == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            yhh yhhVar = roh.f201262g;
            zsf1.m96835F(m6d0VarM36007d, yhhVar, xq00Var2);
            yhh yhhVar2 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yhh yhhVar3 = roh.f201265j;
            zsf1.m96835F(numValueOf, yhhVar3, xq00Var2);
            vlh vlhVar = roh.f201266k;
            zsf1.m96833D(vlhVar, xq00Var2);
            yhh yhhVar4 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var2);
            fxh0 fxh0VarM96830A = zsf1.m96830A(mi21.m61822f(1.0f, mi21.m61842z(oyf1.m68493v0(cxh0Var2, oyf1.m68467i0(0, 0, 1, xq00Var2), false, 14), null, 3)), 0.0f, leu.m58816b(xq00Var2).f117230b.f224763f, 1);
            WeakHashMap weakHashMap = cxd1.f42984x;
            fxh0 fxh0VarM90478H = xfg1.m90478H(fxh0VarM96830A, bxd1.m30815d(xq00Var2).f42991g);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, ub9Var, xq00Var2, 0);
            int iHashCode2 = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var2, fxh0VarM90478H);
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a, yhhVar, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var2);
            AbstractC0000a.m20s(iHashCode2, xq00Var2, yhhVar3, xq00Var2, vlhVar);
            zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var2);
            if (wwuVar != null) {
                xq00Var2.m91771i0(15732168);
                cxh0Var = cxh0Var2;
                z = false;
                y85.m93057b(wwuVar, qgj.f188480a, mi21.m61834r(leu.m58816b(xq00Var2).f117235g.f159608f, cxh0Var2), 0L, 0L, false, xq00Var, 56 | ((i2 >> 6) & 14), 56);
                xq00Var2 = xq00Var;
                xq00Var2.m91788r(false);
            } else {
                cxh0Var = cxh0Var2;
                z = false;
                xq00Var2.m91771i0(15908992);
                xq00Var2.m91788r(false);
            }
            xq00 xq00Var3 = xq00Var2;
            cxh0 cxh0Var3 = cxh0Var;
            boolean z3 = z;
            ahf1.m25932d(str, zsf1.m96830A(cxh0Var, leu.m58816b(xq00Var2).f117230b.f224763f, 0.0f, 2), fr0.m42477u(cxh0Var, leu.m58816b(xq00Var2).f117230b.f224761d, xq00Var2, xq00Var2).f64969e, leu.m58815a(xq00Var2).f112824b.f138757a, new h171(3), null, 0, false, null, 0, null, xq00Var3, i2 & 14, 0, 2016);
            ahf1.m25932d(str2, zsf1.m96830A(cxh0Var3, leu.m58816b(xq00Var2).f117230b.f224763f, 0.0f, 2), fr0.m42477u(cxh0Var3, leu.m58816b(xq00Var2).f117230b.f224761d, xq00Var2, xq00Var2).f64974j, leu.m58815a(xq00Var2).f112824b.f138757a, new h171(3), null, 0, false, null, 0, null, xq00Var3, (i2 >> 3) & 14, 0, 2016);
            if (qf40Var.isEmpty()) {
                z2 = true;
                xq00Var2.m91771i0(17245216);
                xq00Var2.m91788r(z3);
            } else {
                xq00Var2.m91771i0(16688797);
                if (!qf40Var.isEmpty()) {
                    Iterator<E> it = qf40Var.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            xq00Var2.m91771i0(16877184);
                            xq00Var2.m91788r(z3);
                            break;
                        } else if (((ayk0) it.next()) instanceof zxk0) {
                            xq00Var2.m91771i0(16723424);
                            AbstractC0000a.m22u(cxh0Var3, leu.m58816b(xq00Var2).f117230b.f224765h, xq00Var2, z3);
                            break;
                        }
                    }
                } else {
                    xq00Var2.m91771i0(16877184);
                    xq00Var2.m91788r(z3);
                    break;
                }
                aaf aafVarM87496a2 = w9f.m87496a(bj5.f27612c, ub9Var, xq00Var2, z3 ? 1 : 0);
                int iHashCode3 = Long.hashCode(xq00Var2.f264809T);
                wpn0 wpn0VarM91778m3 = xq00Var2.m91778m();
                fxh0 fxh0VarM48286s3 = hqg1.m48286s(xq00Var2, cxh0Var3);
                soh.f211194A.getClass();
                C2087le c2087le2 = roh.f201257b;
                xq00Var2.m91779m0();
                if (xq00Var2.f264808S) {
                    xq00Var2.m91776l(c2087le2);
                } else {
                    xq00Var2.m91799w0();
                }
                zsf1.m96835F(aafVarM87496a2, roh.f201262g, xq00Var2);
                zsf1.m96835F(wpn0VarM91778m3, roh.f201261f, xq00Var2);
                zsf1.m96835F(Integer.valueOf(iHashCode3), roh.f201265j, xq00Var2);
                zsf1.m96833D(roh.f201266k, xq00Var2);
                Iterator itM42470n = fr0.m42470n(xq00Var2, fxh0VarM48286s3, roh.f201259d, -1971157358, qf40Var);
                while (itM42470n.hasNext()) {
                    ayk0 ayk0Var = (ayk0) itM42470n.next();
                    if (ayk0Var instanceof zxk0) {
                        xq00Var2.m91771i0(384989213);
                        mif1.m61869b((ry8) eh00Var.invoke(), ayk0Var, null, null, xq00Var2, 0, 12);
                        xq00Var2.m91788r(z3);
                    } else {
                        if (!(ayk0Var instanceof wxk0)) {
                            throw lq51.m59703i(384987933, xq00Var2, z3);
                        }
                        xq00Var2.m91771i0(384992352);
                        mif1.m61869b((ry8) eh00Var2.invoke(), ayk0Var, null, null, xq00Var2, 0, 12);
                        xq00Var2.m91788r(z3);
                    }
                }
                z2 = true;
                a831.m25018j(xq00Var2, z3, true, z3);
            }
            xq00Var2.m91788r(z2);
            xq00Var2.m91788r(z2);
            fxh0Var2 = cxh0Var3;
        } else {
            xq00Var2.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new oba(str, str2, wwuVar, qf40Var, eh00Var, eh00Var2, fxh0Var2, i);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final Drawable m82966d(p340 p340Var, Resources resources) {
        if (p340Var instanceof ufs) {
            return ((ufs) p340Var).f229869a;
        }
        return p340Var instanceof rh9 ? new BitmapDrawable(resources, ((rh9) p340Var).f199177a) : new n540(p340Var, 0);
    }

    /* JADX INFO: renamed from: e */
    public static final p340 m82967e(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? new rh9(((BitmapDrawable) drawable).getBitmap()) : new ufs(drawable);
    }

    /* JADX INFO: renamed from: f */
    public static rh9 m82968f(Bitmap bitmap) {
        return new rh9(bitmap);
    }

    /* JADX INFO: renamed from: i */
    public static bgg0 m82969i(Integer num, st91 st91Var) {
        return new bgg0(num, st91Var);
    }

    /* JADX INFO: renamed from: j */
    public static final String m82970j(String str, String str2, Mode mode) throws UnsupportedEncodingException {
        String strEncode = URLEncoder.encode(str, "UTF-8");
        String strName = mode.name();
        StringBuilder sbM38573v = edb.m38573v("spotify:internal:martini:report-a-problem:", strEncode, "?viewUri=", str2, "&mode=");
        sbM38573v.append(strName);
        return sbM38573v.toString();
    }

    /* JADX INFO: renamed from: l */
    public static final Single m82971l(eiq0 eiq0Var) {
        return eiq0Var.mo39110a().map(hvi0.f95739i);
    }

    /* JADX INFO: renamed from: n */
    public static final Maybe m82972n(eiq0 eiq0Var) {
        return eiq0Var.mo39110a().flatMapMaybe(iaz.f100392b1);
    }

    /* JADX INFO: renamed from: p */
    public static void m82973p(bb41 bb41Var, ron ronVar) {
        bb41Var.f25433f = ronVar;
    }

    /* JADX INFO: renamed from: q */
    public static void m82974q(bb41 bb41Var, er70 er70Var) {
        bb41Var.f25429b = er70Var;
    }

    /* JADX INFO: renamed from: r */
    public static void m82975r(bb41 bb41Var, er70 er70Var) {
        bb41Var.f25430c = er70Var;
    }

    /* JADX INFO: renamed from: s */
    public static void m82976s(bb41 bb41Var, er70 er70Var) {
        bb41Var.f25432e = er70Var;
    }

    /* JADX INFO: renamed from: t */
    public static void m82977t(bb41 bb41Var, i4t0 i4t0Var) {
        bb41Var.f25431d = i4t0Var;
    }

    /* JADX INFO: renamed from: u */
    public static final float m82978u(float f, ko70 ko70Var) {
        return ko70Var == ko70.f124556a ? f : -f;
    }

    /* JADX INFO: renamed from: v */
    public static Bitmap m82979v(p340 p340Var) {
        int iMo68988d = p340Var.mo68988d();
        int iMo68986b = p340Var.mo68986b();
        boolean z = p340Var instanceof rh9;
        Bitmap.Config config = z ? ((rh9) p340Var).f199177a.getConfig() : null;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        if (z) {
            Bitmap bitmap = ((rh9) p340Var).f199177a;
            if (bitmap.getWidth() == iMo68988d && bitmap.getHeight() == iMo68986b && bitmap.getConfig() == config) {
                return bitmap;
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMo68988d, iMo68986b, config);
        p340Var.mo68987c(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0031  */
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
    /* JADX INFO: renamed from: w */
    public static final b250 m82980w(gkm0 gkm0Var, b250 b250Var) {
        b250 lbfVar;
        b250 b250Var2 = fau.f67640b;
        Integer num = gkm0Var.f80837a;
        if (num != null) {
            rq91 rq91Var = new rq91(num.intValue());
            if (b250Var2.equals(b250Var2) && rq91Var.equals(b250Var2)) {
                lbfVar = b250Var2;
            } else {
                lbfVar = rq91Var;
                if (!b250Var2.equals(b250Var2)) {
                    if (rq91Var.equals(b250Var2)) {
                        lbfVar = b250Var2;
                    } else {
                        lbfVar = new lbf(b250Var2, rq91Var);
                    }
                }
            }
        } else {
            lbfVar = b250Var2;
        }
        zt91 zt91Var = gkm0Var.f80838b;
        if (zt91Var != null) {
            oq91 oq91Var = new oq91(new lpl(b250Var, zt91Var, 0));
            if (lbfVar.equals(b250Var2) && oq91Var.equals(b250Var2)) {
                return b250Var2;
            }
            if (lbfVar.equals(b250Var2)) {
                return oq91Var;
            }
            if (!oq91Var.equals(b250Var2)) {
                return new lbf(lbfVar, oq91Var);
            }
        }
        return lbfVar;
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo36572A(gpf1 gpf1Var, Thread thread);

    /* JADX INFO: renamed from: B */
    public abstract boolean mo36573B(wsf1 wsf1Var, yof1 yof1Var, yof1 yof1Var2);

    /* JADX INFO: renamed from: C */
    public abstract boolean mo36574C(lpf1 lpf1Var, Object obj, Object obj2);

    /* JADX INFO: renamed from: D */
    public abstract boolean mo36575D(lpf1 lpf1Var, gpf1 gpf1Var, gpf1 gpf1Var2);

    /* JADX INFO: renamed from: g */
    public o35 mo48938g(Context context, Looper looper, twy twyVar, Object obj, wj10 wj10Var, xj10 xj10Var) {
        return mo52256h(context, looper, twyVar, obj, (p3f1) wj10Var, (p3f1) xj10Var);
    }

    /* JADX INFO: renamed from: h */
    public o35 mo52256h(Context context, Looper looper, twy twyVar, Object obj, p3f1 p3f1Var, p3f1 p3f1Var2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    /* JADX INFO: renamed from: k */
    public abstract String mo55160k();

    /* JADX INFO: renamed from: m */
    public abstract nmn0 mo55161m();

    /* JADX INFO: renamed from: o */
    public abstract qf40 mo55162o();

    /* JADX INFO: renamed from: x */
    public abstract yof1 mo36576x(wsf1 wsf1Var);

    /* JADX INFO: renamed from: y */
    public abstract gpf1 mo36577y(wsf1 wsf1Var);

    /* JADX INFO: renamed from: z */
    public abstract void mo36578z(gpf1 gpf1Var, gpf1 gpf1Var2);
}
