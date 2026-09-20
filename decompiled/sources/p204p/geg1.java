package p204p;

import android.content.Context;
import android.util.Base64;
import android.view.ViewGroup;
import androidx.car.app.model.Alert;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import com.comscore.streaming.ContentType;
import com.spotify.base.java.logging.Logger;
import com.spotify.recents.recentsdatasourceimpl.GroupMetadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class geg1 {

    /* JADX INFO: renamed from: a */
    public static final tm91 f79120a = new tm91(new b771(16), new b771(25));

    /* JADX INFO: renamed from: b */
    public static final tm91 f79121b = new tm91(new b771(26), new b771(27));

    /* JADX INFO: renamed from: c */
    public static final tm91 f79122c = new tm91(new b771(28), new b771(29));

    /* JADX INFO: renamed from: d */
    public static final tm91 f79123d = new tm91(new p4b1(0), new p4b1(1));

    /* JADX INFO: renamed from: e */
    public static final tm91 f79124e = new tm91(new p4b1(2), new p4b1(3));

    /* JADX INFO: renamed from: f */
    public static final tm91 f79125f = new tm91(new b771(17), new b771(18));

    /* JADX INFO: renamed from: g */
    public static final tm91 f79126g = new tm91(new b771(19), new b771(20));

    /* JADX INFO: renamed from: h */
    public static final tm91 f79127h = new tm91(new b771(21), new b771(22));

    /* JADX INFO: renamed from: i */
    public static final tm91 f79128i = new tm91(new b771(23), new b771(24));

    /* JADX INFO: renamed from: j */
    public static sd40 f79129j;

    /* JADX INFO: renamed from: k */
    public static sd40 f79130k;

    /* JADX INFO: renamed from: A */
    public static final Object[] m44488A(Object obj) {
        Object[] objArr = new Object[32];
        objArr[0] = obj;
        return objArr;
    }

    /* JADX INFO: renamed from: B */
    public static final Object m44489B(Map map, String str, gh00 gh00Var) {
        String str2 = (String) map.get(str);
        if (str2 == null) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(str2, 0);
            wj50.m88279p(bArrDecode);
            return gh00Var.invoke(bArrDecode);
        } catch (IllegalArgumentException unused) {
            edb.m38545A("BrowseDestination: Error parsing proto field for key '", str, "'");
            return null;
        }
    }

    /* JADX INFO: renamed from: C */
    public static final uyi0 m44490C(aaj0[] aaj0VarArr, xq00 xq00Var) {
        Context context = (Context) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f502b);
        Object[] objArrCopyOf = Arrays.copyOf(aaj0VarArr, aaj0VarArr.length);
        t9y0 t9y0Var = new t9y0(new kgi(context, 3), hzh0.f96944b1);
        boolean zM91770i = xq00Var.m91770i(context);
        Object objM91750T = xq00Var.m91750T();
        if (zM91770i || objM91750T == t6x0.f217647t) {
            objM91750T = new nf60(context, 15);
            xq00Var.m91793t0(objM91750T);
        }
        uyi0 uyi0Var = (uyi0) dul.m37019v(objArrCopyOf, t9y0Var, null, (eh00) objM91750T, xq00Var, 0, 4);
        for (aaj0 aaj0Var : aaj0VarArr) {
            uyi0Var.f235286v.m38301a(aaj0Var);
        }
        return uyi0Var;
    }

    /* JADX INFO: renamed from: D */
    public static List m44491D(Iterable iterable) {
        List listM43732l1 = g6f.m43732l1(iterable);
        Collections.shuffle(listM43732l1);
        return listM43732l1;
    }

    /* JADX INFO: renamed from: E */
    public static void m44492E(int i, Object[] objArr) {
        if (i < objArr.length) {
            objArr[i] = null;
        }
    }

    /* JADX INFO: renamed from: F */
    public static final int m44493F(yfd yfdVar) {
        if (yfdVar instanceof yed) {
            return 3;
        }
        if (yfdVar instanceof dfd) {
            return 1;
        }
        if (yfdVar instanceof ffd) {
            return 2;
        }
        if (yfdVar instanceof ufd) {
            return 1;
        }
        if (yfdVar instanceof vfd) {
            return 3;
        }
        if ((yfdVar instanceof wfd) || (yfdVar instanceof sfd) || (yfdVar instanceof tfd) || (yfdVar instanceof rfd)) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0179  */
    /* JADX WARN: Code duplicated, block: B:105:0x0183  */
    /* JADX WARN: Code duplicated, block: B:107:0x0194  */
    /* JADX WARN: Code duplicated, block: B:109:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:111:0x01aa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:112:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:115:0x01bc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:123:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:126:0x0202  */
    /* JADX WARN: Code duplicated, block: B:127:0x0204  */
    /* JADX WARN: Code duplicated, block: B:130:0x020b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:131:0x020d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0223  */
    /* JADX WARN: Code duplicated, block: B:136:0x022b  */
    /* JADX WARN: Code duplicated, block: B:137:0x023a  */
    /* JADX WARN: Code duplicated, block: B:139:0x023e  */
    /* JADX WARN: Code duplicated, block: B:141:0x024c  */
    /* JADX WARN: Code duplicated, block: B:142:0x024e  */
    /* JADX WARN: Code duplicated, block: B:145:0x0255 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:146:0x0257  */
    /* JADX WARN: Code duplicated, block: B:148:0x026b  */
    /* JADX WARN: Code duplicated, block: B:150:0x026f  */
    /* JADX WARN: Code duplicated, block: B:152:0x027d  */
    /* JADX WARN: Code duplicated, block: B:153:0x027f  */
    /* JADX WARN: Code duplicated, block: B:156:0x0286 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:157:0x0288  */
    /* JADX WARN: Code duplicated, block: B:159:0x029c  */
    /* JADX WARN: Code duplicated, block: B:161:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:163:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:164:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:167:0x02b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:168:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:170:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:172:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:173:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:175:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:177:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:178:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:181:0x02ff A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:182:0x0301  */
    /* JADX WARN: Code duplicated, block: B:188:0x0330  */
    /* JADX WARN: Code duplicated, block: B:190:0x0335  */
    /* JADX WARN: Code duplicated, block: B:192:0x0342  */
    /* JADX WARN: Code duplicated, block: B:195:0x034d  */
    /* JADX WARN: Code duplicated, block: B:198:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x0321 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x008e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:83:0x0105  */
    /* JADX WARN: Code duplicated, block: B:85:0x0110  */
    /* JADX WARN: Code duplicated, block: B:86:0x0112  */
    /* JADX WARN: Code duplicated, block: B:92:0x011b  */
    /* JADX WARN: Code duplicated, block: B:93:0x011f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0144  */
    /* JADX WARN: Code duplicated, block: B:98:0x014b  */
    /* JADX WARN: Code duplicated, block: B:99:0x014f  */
    /* JADX INFO: renamed from: a */
    public static final void m44494a(n300 n300Var, gh00 gh00Var, fiz fizVar, fiz fizVar2, fxh0 fxh0Var, miq0 miq0Var, xq00 xq00Var, int i, int i2) {
        fiz fizVar3;
        fiz fizVar4;
        fxh0 fxh0Var2;
        int i3;
        miq0 miq0Var2;
        int i4;
        int i5;
        boolean z;
        fxh0 fxh0Var3;
        miq0 miq0Var3;
        pgv0 pgv0VarM91796v;
        cxh0 cxh0Var;
        fxh0 fxh0Var4;
        miq0 miq0Var4;
        fxh0 fxh0VarM96832C;
        ArrayList arrayList;
        Iterator it;
        Object next;
        ruy ruyVar;
        String str;
        aaf aafVarM87496a;
        int iHashCode;
        wpn0 wpn0VarM91778m;
        fxh0 fxh0VarM48286s;
        eh00 eh00Var;
        Iterator itM42470n;
        uuy uuyVar;
        boolean z2;
        boolean z3;
        Object objM91750T;
        boolean z4;
        Object objM91750T2;
        boolean z5;
        Object objM91750T3;
        boolean z6;
        Object objM91750T4;
        ruy ruyVar2;
        Object obj;
        boolean zM91766g;
        Object objM91750T5;
        boolean z7;
        Object objM91750T6;
        boolean z8;
        Object obj2 = t6x0.f217647t;
        qf40 qf40Var = n300Var.f149893e;
        xq00Var.m91775k0(-1558774275);
        int i6 = (i & 6) == 0 ? ((i & 8) == 0 ? xq00Var.m91766g(n300Var) : xq00Var.m91770i(n300Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i6 |= xq00Var.m91770i(gh00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            fizVar3 = fizVar;
            i6 |= xq00Var.m91770i(fizVar3) ? 256 : 128;
        } else {
            fizVar3 = fizVar;
        }
        if ((i & 3072) == 0) {
            fizVar4 = fizVar2;
            i6 |= xq00Var.m91770i(fizVar4) ? 2048 : 1024;
        } else {
            fizVar4 = fizVar2;
        }
        int i7 = i2 & 16;
        if (i7 == 0) {
            if ((i & 24576) == 0) {
                fxh0Var2 = fxh0Var;
                i6 |= xq00Var.m91770i(fxh0Var2) ? 16384 : 8192;
            }
            i3 = i2 & 32;
            if (i3 != 0) {
                if ((196608 & i) == 0) {
                    miq0Var2 = miq0Var;
                    if (xq00Var.m91770i(miq0Var2)) {
                        i4 = 131072;
                    } else {
                        i4 = 65536;
                    }
                    i6 |= i4;
                }
                i5 = i6;
                if ((74899 & i5) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (xq00Var.m91752Y(i5 & 1, z)) {
                    cxh0Var = cxh0.f43038a;
                    if (i7 != 0) {
                        fxh0Var4 = cxh0Var;
                    } else {
                        fxh0Var4 = fxh0Var2;
                    }
                    if (i3 != 0) {
                        miq0Var4 = null;
                    } else {
                        miq0Var4 = miq0Var2;
                    }
                    if (qf40Var.isEmpty()) {
                        xq00Var.m91771i0(-255417179);
                        xq00Var.m91788r(false);
                    } else {
                        xq00Var.m91771i0(-257691866);
                        fxh0VarM96832C = zsf1.m96832C(cxh0Var, 0.0f, leu.m58816b(xq00Var).f117230b.f224764g, 0.0f, 0.0f, 13);
                        arrayList = new ArrayList();
                        for (Object obj3 : qf40Var) {
                            if (obj3 instanceof ruy) {
                                arrayList.add(obj3);
                            }
                        }
                        it = arrayList.iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (((ruy) next).f202965h != null) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                        } while (!z8);
                        ruyVar = (ruy) next;
                        if (ruyVar != null) {
                            str = ruyVar.f202958a;
                        } else {
                            str = null;
                        }
                        aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var, 0);
                        iHashCode = Long.hashCode(xq00Var.f264809T);
                        wpn0VarM91778m = xq00Var.m91778m();
                        fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0Var4);
                        soh.f211194A.getClass();
                        eh00Var = roh.f201257b;
                        if (xq00Var.f264811a != null) {
                            pmg1.m70360s();
                            throw null;
                        }
                        xq00Var.m91779m0();
                        if (xq00Var.f264808S) {
                            xq00Var.m91776l(eh00Var);
                        } else {
                            xq00Var.m91799w0();
                        }
                        zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var);
                        zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
                        zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
                        zsf1.m96833D(roh.f201266k, xq00Var);
                        itM42470n = fr0.m42470n(xq00Var, fxh0VarM48286s, roh.f201259d, 526594479, qf40Var);
                        while (itM42470n.hasNext()) {
                            uuyVar = (uuy) itM42470n.next();
                            if (uuyVar instanceof ruy) {
                                xq00Var.m91771i0(-1345111184);
                                ruyVar2 = (ruy) uuyVar;
                                String str2 = ruyVar2.f202965h;
                                obj = ruyVar2.f202958a;
                                if (ruyVar2.f202960c == 5) {
                                    xq00Var.m91788r(false);
                                    itM42470n = itM42470n;
                                } else {
                                    zM91766g = xq00Var.m91766g(obj);
                                    objM91750T5 = xq00Var.m91750T();
                                    if (zM91766g || objM91750T5 == obj2) {
                                        objM91750T5 = new rka();
                                        xq00Var.m91793t0(objM91750T5);
                                    }
                                    rka rkaVar = (rka) objM91750T5;
                                    if (wj50.m88271j(obj, str) || str2 == null) {
                                        itM42470n = itM42470n;
                                        xq00Var.m91771i0(-1344795604);
                                        xq00Var.m91788r(false);
                                    } else {
                                        xq00Var.m91771i0(-1344891704);
                                        boolean zM91770i = xq00Var.m91770i(rkaVar);
                                        Object objM91750T7 = xq00Var.m91750T();
                                        if (zM91770i || objM91750T7 == obj2) {
                                            objM91750T7 = new zoy(rkaVar, null, 2);
                                            xq00Var.m91793t0(objM91750T7);
                                        }
                                        hz40.m49237i(str2, (th00) objM91750T7, xq00Var);
                                        xq00Var.m91788r(false);
                                    }
                                    fxh0 fxh0VarM70866j = psh.m70866j(fxh0VarM96832C, rkaVar);
                                    if ((i5 & ContentType.LONG_FORM_ON_DEMAND) == 32) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    objM91750T6 = xq00Var.m91750T();
                                    if (z7 || objM91750T6 == obj2) {
                                        objM91750T6 = new ooy(13, gh00Var);
                                        xq00Var.m91793t0(objM91750T6);
                                    }
                                    z2 = false;
                                    ltf1.m59883e(ruyVar2, (gh00) objM91750T6, fxh0VarM70866j, xq00Var, 0);
                                    xq00Var.m91788r(false);
                                }
                                fizVar3 = fizVar;
                                fizVar4 = fizVar2;
                                itM42470n = itM42470n;
                            } else {
                                itM42470n = itM42470n;
                                z2 = false;
                                if (uuyVar instanceof tuy) {
                                    xq00Var.m91771i0(-1344496454);
                                    vsg1.m86347g((tuy) uuyVar, fxh0VarM96832C, xq00Var, 0);
                                    xq00Var.m91788r(false);
                                } else if (uuyVar instanceof puy) {
                                    xq00Var.m91771i0(-1344392635);
                                    puy puyVar = (puy) uuyVar;
                                    if ((i5 & ContentType.LONG_FORM_ON_DEMAND) == 32) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    objM91750T4 = xq00Var.m91750T();
                                    if (z6 || objM91750T4 == obj2) {
                                        objM91750T4 = new ooy(14, gh00Var);
                                        xq00Var.m91793t0(objM91750T4);
                                    }
                                    z2 = false;
                                    yvg1.m94699e(puyVar, (gh00) objM91750T4, fxh0VarM96832C, xq00Var, 0);
                                    xq00Var.m91788r(false);
                                } else if (uuyVar instanceof ouy) {
                                    xq00Var.m91771i0(-1344118967);
                                    ouy ouyVar = (ouy) uuyVar;
                                    if ((i5 & ContentType.LONG_FORM_ON_DEMAND) == 32) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    objM91750T3 = xq00Var.m91750T();
                                    if (z5 || objM91750T3 == obj2) {
                                        objM91750T3 = new ooy(15, gh00Var);
                                        xq00Var.m91793t0(objM91750T3);
                                    }
                                    z2 = false;
                                    wvf1.m89100d(ouyVar, (gh00) objM91750T3, fxh0VarM96832C, xq00Var, 0);
                                    xq00Var.m91788r(false);
                                } else if (uuyVar instanceof nuy) {
                                    xq00Var.m91771i0(-1343875803);
                                    nuy nuyVar = (nuy) uuyVar;
                                    if ((i5 & ContentType.LONG_FORM_ON_DEMAND) == 32) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    objM91750T2 = xq00Var.m91750T();
                                    if (z4 || objM91750T2 == obj2) {
                                        objM91750T2 = new ooy(16, gh00Var);
                                        xq00Var.m91793t0(objM91750T2);
                                    }
                                    z2 = false;
                                    xuf1.m92162a(nuyVar, (gh00) objM91750T2, fxh0VarM96832C, xq00Var, 0);
                                    xq00Var.m91788r(false);
                                } else {
                                    z2 = false;
                                    if (uuyVar instanceof quy) {
                                        xq00Var.m91771i0(-1343594323);
                                        qkf1.m73086g((quy) uuyVar, fxh0VarM96832C, xq00Var, 0);
                                        xq00Var.m91788r(false);
                                    } else {
                                        if (uuyVar instanceof suy) {
                                            throw lq51.m59703i(1480629878, xq00Var, false);
                                        }
                                        xq00Var.m91771i0(-1343479685);
                                        suy suyVar = (suy) uuyVar;
                                        if ((i5 & ContentType.LONG_FORM_ON_DEMAND) == 32) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        objM91750T = xq00Var.m91750T();
                                        if (z3 || objM91750T == obj2) {
                                            objM91750T = new ooy(17, gh00Var);
                                            xq00Var.m91793t0(objM91750T);
                                        }
                                        c150.m31219a(suyVar, (gh00) objM91750T, fizVar3, fizVar4, fxh0VarM96832C, miq0Var4, xq00Var, i5 & 466816);
                                        xq00Var.m91788r(false);
                                    }
                                    fizVar3 = fizVar;
                                    fizVar4 = fizVar2;
                                    itM42470n = itM42470n;
                                }
                            }
                            fizVar3 = fizVar;
                            fizVar4 = fizVar2;
                            itM42470n = itM42470n;
                        }
                        a831.m25018j(xq00Var, false, true, false);
                    }
                    miq0Var3 = miq0Var4;
                    fxh0Var3 = fxh0Var4;
                } else {
                    xq00Var.m91757b0();
                    fxh0Var3 = fxh0Var2;
                    miq0Var3 = miq0Var2;
                }
                pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v != null) {
                    pgv0VarM91796v.f177419d = new C1745cl(n300Var, gh00Var, fizVar, fizVar2, fxh0Var3, miq0Var3, i, i2, 9);
                }
            }
            i6 |= 196608;
            miq0Var2 = miq0Var;
            i5 = i6;
            if ((74899 & i5) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (xq00Var.m91752Y(i5 & 1, z)) {
                cxh0Var = cxh0.f43038a;
                if (i7 != 0) {
                    fxh0Var4 = cxh0Var;
                } else {
                    fxh0Var4 = fxh0Var2;
                }
                if (i3 != 0) {
                    miq0Var4 = null;
                } else {
                    miq0Var4 = miq0Var2;
                }
                if (qf40Var.isEmpty()) {
                    xq00Var.m91771i0(-257691866);
                    fxh0VarM96832C = zsf1.m96832C(cxh0Var, 0.0f, leu.m58816b(xq00Var).f117230b.f224764g, 0.0f, 0.0f, 13);
                    arrayList = new ArrayList();
                    while (r13.hasNext()) {
                        if (obj3 instanceof ruy) {
                            arrayList.add(obj3);
                        }
                    }
                    it = arrayList.iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((ruy) next).f202965h != null) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                    } while (!z8);
                    ruyVar = (ruy) next;
                    if (ruyVar != null) {
                        str = ruyVar.f202958a;
                    } else {
                        str = null;
                    }
                    aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var, 0);
                    iHashCode = Long.hashCode(xq00Var.f264809T);
                    wpn0VarM91778m = xq00Var.m91778m();
                    fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0Var4);
                    soh.f211194A.getClass();
                    eh00Var = roh.f201257b;
                    if (xq00Var.f264811a != null) {
                        pmg1.m70360s();
                        throw null;
                    }
                    xq00Var.m91779m0();
                    if (xq00Var.f264808S) {
                        xq00Var.m91776l(eh00Var);
                    } else {
                        xq00Var.m91799w0();
                    }
                    zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var);
                    zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
                    zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
                    zsf1.m96833D(roh.f201266k, xq00Var);
                    itM42470n = fr0.m42470n(xq00Var, fxh0VarM48286s, roh.f201259d, 526594479, qf40Var);
                    while (itM42470n.hasNext()) {
                        uuyVar = (uuy) itM42470n.next();
                        if (uuyVar instanceof ruy) {
                            xq00Var.m91771i0(-1345111184);
                            ruyVar2 = (ruy) uuyVar;
                            String str3 = ruyVar2.f202965h;
                            obj = ruyVar2.f202958a;
                            if (ruyVar2.f202960c == 5) {
                                xq00Var.m91788r(false);
                                itM42470n = itM42470n;
                            } else {
                                zM91766g = xq00Var.m91766g(obj);
                                objM91750T5 = xq00Var.m91750T();
                                if (zM91766g) {
                                    objM91750T5 = new rka();
                                    xq00Var.m91793t0(objM91750T5);
                                } else {
                                    objM91750T5 = new rka();
                                    xq00Var.m91793t0(objM91750T5);
                                }
                                rka rkaVar2 = (rka) objM91750T5;
                                if (wj50.m88271j(obj, str)) {
                                    itM42470n = itM42470n;
                                    xq00Var.m91771i0(-1344795604);
                                    xq00Var.m91788r(false);
                                } else {
                                    itM42470n = itM42470n;
                                    xq00Var.m91771i0(-1344795604);
                                    xq00Var.m91788r(false);
                                }
                                fxh0 fxh0VarM70866j2 = psh.m70866j(fxh0VarM96832C, rkaVar2);
                                if ((i5 & ContentType.LONG_FORM_ON_DEMAND) == 32) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                objM91750T6 = xq00Var.m91750T();
                                if (z7) {
                                    objM91750T6 = new ooy(13, gh00Var);
                                    xq00Var.m91793t0(objM91750T6);
                                } else {
                                    objM91750T6 = new ooy(13, gh00Var);
                                    xq00Var.m91793t0(objM91750T6);
                                }
                                z2 = false;
                                ltf1.m59883e(ruyVar2, (gh00) objM91750T6, fxh0VarM70866j2, xq00Var, 0);
                                xq00Var.m91788r(false);
                            }
                            fizVar3 = fizVar;
                            fizVar4 = fizVar2;
                            itM42470n = itM42470n;
                        } else {
                            itM42470n = itM42470n;
                            z2 = false;
                            if (uuyVar instanceof tuy) {
                                xq00Var.m91771i0(-1344496454);
                                vsg1.m86347g((tuy) uuyVar, fxh0VarM96832C, xq00Var, 0);
                                xq00Var.m91788r(false);
                            } else if (uuyVar instanceof puy) {
                                xq00Var.m91771i0(-1344392635);
                                puy puyVar2 = (puy) uuyVar;
                                if ((i5 & ContentType.LONG_FORM_ON_DEMAND) == 32) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                objM91750T4 = xq00Var.m91750T();
                                if (z6) {
                                    objM91750T4 = new ooy(14, gh00Var);
                                    xq00Var.m91793t0(objM91750T4);
                                } else {
                                    objM91750T4 = new ooy(14, gh00Var);
                                    xq00Var.m91793t0(objM91750T4);
                                }
                                z2 = false;
                                yvg1.m94699e(puyVar2, (gh00) objM91750T4, fxh0VarM96832C, xq00Var, 0);
                                xq00Var.m91788r(false);
                            } else if (uuyVar instanceof ouy) {
                                xq00Var.m91771i0(-1344118967);
                                ouy ouyVar2 = (ouy) uuyVar;
                                if ((i5 & ContentType.LONG_FORM_ON_DEMAND) == 32) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                objM91750T3 = xq00Var.m91750T();
                                if (z5) {
                                    objM91750T3 = new ooy(15, gh00Var);
                                    xq00Var.m91793t0(objM91750T3);
                                } else {
                                    objM91750T3 = new ooy(15, gh00Var);
                                    xq00Var.m91793t0(objM91750T3);
                                }
                                z2 = false;
                                wvf1.m89100d(ouyVar2, (gh00) objM91750T3, fxh0VarM96832C, xq00Var, 0);
                                xq00Var.m91788r(false);
                            } else if (uuyVar instanceof nuy) {
                                xq00Var.m91771i0(-1343875803);
                                nuy nuyVar2 = (nuy) uuyVar;
                                if ((i5 & ContentType.LONG_FORM_ON_DEMAND) == 32) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                objM91750T2 = xq00Var.m91750T();
                                if (z4) {
                                    objM91750T2 = new ooy(16, gh00Var);
                                    xq00Var.m91793t0(objM91750T2);
                                } else {
                                    objM91750T2 = new ooy(16, gh00Var);
                                    xq00Var.m91793t0(objM91750T2);
                                }
                                z2 = false;
                                xuf1.m92162a(nuyVar2, (gh00) objM91750T2, fxh0VarM96832C, xq00Var, 0);
                                xq00Var.m91788r(false);
                            } else {
                                z2 = false;
                                if (uuyVar instanceof quy) {
                                    xq00Var.m91771i0(-1343594323);
                                    qkf1.m73086g((quy) uuyVar, fxh0VarM96832C, xq00Var, 0);
                                    xq00Var.m91788r(false);
                                } else {
                                    if (uuyVar instanceof suy) {
                                        throw lq51.m59703i(1480629878, xq00Var, false);
                                    }
                                    xq00Var.m91771i0(-1343479685);
                                    suy suyVar2 = (suy) uuyVar;
                                    if ((i5 & ContentType.LONG_FORM_ON_DEMAND) == 32) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    objM91750T = xq00Var.m91750T();
                                    if (z3) {
                                        objM91750T = new ooy(17, gh00Var);
                                        xq00Var.m91793t0(objM91750T);
                                    } else {
                                        objM91750T = new ooy(17, gh00Var);
                                        xq00Var.m91793t0(objM91750T);
                                    }
                                    c150.m31219a(suyVar2, (gh00) objM91750T, fizVar3, fizVar4, fxh0VarM96832C, miq0Var4, xq00Var, i5 & 466816);
                                    xq00Var.m91788r(false);
                                }
                                fizVar3 = fizVar;
                                fizVar4 = fizVar2;
                                itM42470n = itM42470n;
                            }
                        }
                        fizVar3 = fizVar;
                        fizVar4 = fizVar2;
                        itM42470n = itM42470n;
                    }
                    a831.m25018j(xq00Var, false, true, false);
                } else {
                    xq00Var.m91771i0(-255417179);
                    xq00Var.m91788r(false);
                }
                miq0Var3 = miq0Var4;
                fxh0Var3 = fxh0Var4;
            } else {
                xq00Var.m91757b0();
                fxh0Var3 = fxh0Var2;
                miq0Var3 = miq0Var2;
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new C1745cl(n300Var, gh00Var, fizVar, fizVar2, fxh0Var3, miq0Var3, i, i2, 9);
            }
        }
        i6 |= 24576;
        fxh0Var2 = fxh0Var;
        i3 = i2 & 32;
        if (i3 != 0) {
            if ((196608 & i) == 0) {
                miq0Var2 = miq0Var;
                if (xq00Var.m91770i(miq0Var2)) {
                    i4 = 131072;
                } else {
                    i4 = 65536;
                }
                i6 |= i4;
            }
            i5 = i6;
            if ((74899 & i5) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (xq00Var.m91752Y(i5 & 1, z)) {
                cxh0Var = cxh0.f43038a;
                if (i7 != 0) {
                    fxh0Var4 = cxh0Var;
                } else {
                    fxh0Var4 = fxh0Var2;
                }
                if (i3 != 0) {
                    miq0Var4 = null;
                } else {
                    miq0Var4 = miq0Var2;
                }
                if (qf40Var.isEmpty()) {
                    xq00Var.m91771i0(-257691866);
                    fxh0VarM96832C = zsf1.m96832C(cxh0Var, 0.0f, leu.m58816b(xq00Var).f117230b.f224764g, 0.0f, 0.0f, 13);
                    arrayList = new ArrayList();
                    while (r13.hasNext()) {
                        if (obj3 instanceof ruy) {
                            arrayList.add(obj3);
                        }
                    }
                    it = arrayList.iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((ruy) next).f202965h != null) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                    } while (!z8);
                    ruyVar = (ruy) next;
                    if (ruyVar != null) {
                        str = ruyVar.f202958a;
                    } else {
                        str = null;
                    }
                    aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var, 0);
                    iHashCode = Long.hashCode(xq00Var.f264809T);
                    wpn0VarM91778m = xq00Var.m91778m();
                    fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0Var4);
                    soh.f211194A.getClass();
                    eh00Var = roh.f201257b;
                    if (xq00Var.f264811a != null) {
                        pmg1.m70360s();
                        throw null;
                    }
                    xq00Var.m91779m0();
                    if (xq00Var.f264808S) {
                        xq00Var.m91776l(eh00Var);
                    } else {
                        xq00Var.m91799w0();
                    }
                    zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var);
                    zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
                    zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
                    zsf1.m96833D(roh.f201266k, xq00Var);
                    itM42470n = fr0.m42470n(xq00Var, fxh0VarM48286s, roh.f201259d, 526594479, qf40Var);
                    while (itM42470n.hasNext()) {
                        uuyVar = (uuy) itM42470n.next();
                        if (uuyVar instanceof ruy) {
                            xq00Var.m91771i0(-1345111184);
                            ruyVar2 = (ruy) uuyVar;
                            String str4 = ruyVar2.f202965h;
                            obj = ruyVar2.f202958a;
                            if (ruyVar2.f202960c == 5) {
                                xq00Var.m91788r(false);
                                itM42470n = itM42470n;
                            } else {
                                zM91766g = xq00Var.m91766g(obj);
                                objM91750T5 = xq00Var.m91750T();
                                if (zM91766g) {
                                    objM91750T5 = new rka();
                                    xq00Var.m91793t0(objM91750T5);
                                } else {
                                    objM91750T5 = new rka();
                                    xq00Var.m91793t0(objM91750T5);
                                }
                                rka rkaVar3 = (rka) objM91750T5;
                                if (wj50.m88271j(obj, str)) {
                                    itM42470n = itM42470n;
                                    xq00Var.m91771i0(-1344795604);
                                    xq00Var.m91788r(false);
                                } else {
                                    itM42470n = itM42470n;
                                    xq00Var.m91771i0(-1344795604);
                                    xq00Var.m91788r(false);
                                }
                                fxh0 fxh0VarM70866j3 = psh.m70866j(fxh0VarM96832C, rkaVar3);
                                if ((i5 & ContentType.LONG_FORM_ON_DEMAND) == 32) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                objM91750T6 = xq00Var.m91750T();
                                if (z7) {
                                    objM91750T6 = new ooy(13, gh00Var);
                                    xq00Var.m91793t0(objM91750T6);
                                } else {
                                    objM91750T6 = new ooy(13, gh00Var);
                                    xq00Var.m91793t0(objM91750T6);
                                }
                                z2 = false;
                                ltf1.m59883e(ruyVar2, (gh00) objM91750T6, fxh0VarM70866j3, xq00Var, 0);
                                xq00Var.m91788r(false);
                            }
                            fizVar3 = fizVar;
                            fizVar4 = fizVar2;
                            itM42470n = itM42470n;
                        } else {
                            itM42470n = itM42470n;
                            z2 = false;
                            if (uuyVar instanceof tuy) {
                                xq00Var.m91771i0(-1344496454);
                                vsg1.m86347g((tuy) uuyVar, fxh0VarM96832C, xq00Var, 0);
                                xq00Var.m91788r(false);
                            } else if (uuyVar instanceof puy) {
                                xq00Var.m91771i0(-1344392635);
                                puy puyVar3 = (puy) uuyVar;
                                if ((i5 & ContentType.LONG_FORM_ON_DEMAND) == 32) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                objM91750T4 = xq00Var.m91750T();
                                if (z6) {
                                    objM91750T4 = new ooy(14, gh00Var);
                                    xq00Var.m91793t0(objM91750T4);
                                } else {
                                    objM91750T4 = new ooy(14, gh00Var);
                                    xq00Var.m91793t0(objM91750T4);
                                }
                                z2 = false;
                                yvg1.m94699e(puyVar3, (gh00) objM91750T4, fxh0VarM96832C, xq00Var, 0);
                                xq00Var.m91788r(false);
                            } else if (uuyVar instanceof ouy) {
                                xq00Var.m91771i0(-1344118967);
                                ouy ouyVar3 = (ouy) uuyVar;
                                if ((i5 & ContentType.LONG_FORM_ON_DEMAND) == 32) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                objM91750T3 = xq00Var.m91750T();
                                if (z5) {
                                    objM91750T3 = new ooy(15, gh00Var);
                                    xq00Var.m91793t0(objM91750T3);
                                } else {
                                    objM91750T3 = new ooy(15, gh00Var);
                                    xq00Var.m91793t0(objM91750T3);
                                }
                                z2 = false;
                                wvf1.m89100d(ouyVar3, (gh00) objM91750T3, fxh0VarM96832C, xq00Var, 0);
                                xq00Var.m91788r(false);
                            } else if (uuyVar instanceof nuy) {
                                xq00Var.m91771i0(-1343875803);
                                nuy nuyVar3 = (nuy) uuyVar;
                                if ((i5 & ContentType.LONG_FORM_ON_DEMAND) == 32) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                objM91750T2 = xq00Var.m91750T();
                                if (z4) {
                                    objM91750T2 = new ooy(16, gh00Var);
                                    xq00Var.m91793t0(objM91750T2);
                                } else {
                                    objM91750T2 = new ooy(16, gh00Var);
                                    xq00Var.m91793t0(objM91750T2);
                                }
                                z2 = false;
                                xuf1.m92162a(nuyVar3, (gh00) objM91750T2, fxh0VarM96832C, xq00Var, 0);
                                xq00Var.m91788r(false);
                            } else {
                                z2 = false;
                                if (uuyVar instanceof quy) {
                                    xq00Var.m91771i0(-1343594323);
                                    qkf1.m73086g((quy) uuyVar, fxh0VarM96832C, xq00Var, 0);
                                    xq00Var.m91788r(false);
                                } else {
                                    if (uuyVar instanceof suy) {
                                        throw lq51.m59703i(1480629878, xq00Var, false);
                                    }
                                    xq00Var.m91771i0(-1343479685);
                                    suy suyVar3 = (suy) uuyVar;
                                    if ((i5 & ContentType.LONG_FORM_ON_DEMAND) == 32) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    objM91750T = xq00Var.m91750T();
                                    if (z3) {
                                        objM91750T = new ooy(17, gh00Var);
                                        xq00Var.m91793t0(objM91750T);
                                    } else {
                                        objM91750T = new ooy(17, gh00Var);
                                        xq00Var.m91793t0(objM91750T);
                                    }
                                    c150.m31219a(suyVar3, (gh00) objM91750T, fizVar3, fizVar4, fxh0VarM96832C, miq0Var4, xq00Var, i5 & 466816);
                                    xq00Var.m91788r(false);
                                }
                                fizVar3 = fizVar;
                                fizVar4 = fizVar2;
                                itM42470n = itM42470n;
                            }
                        }
                        fizVar3 = fizVar;
                        fizVar4 = fizVar2;
                        itM42470n = itM42470n;
                    }
                    a831.m25018j(xq00Var, false, true, false);
                } else {
                    xq00Var.m91771i0(-255417179);
                    xq00Var.m91788r(false);
                }
                miq0Var3 = miq0Var4;
                fxh0Var3 = fxh0Var4;
            } else {
                xq00Var.m91757b0();
                fxh0Var3 = fxh0Var2;
                miq0Var3 = miq0Var2;
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new C1745cl(n300Var, gh00Var, fizVar, fizVar2, fxh0Var3, miq0Var3, i, i2, 9);
            }
        }
        i6 |= 196608;
        miq0Var2 = miq0Var;
        i5 = i6;
        if ((74899 & i5) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (xq00Var.m91752Y(i5 & 1, z)) {
            cxh0Var = cxh0.f43038a;
            if (i7 != 0) {
                fxh0Var4 = cxh0Var;
            } else {
                fxh0Var4 = fxh0Var2;
            }
            if (i3 != 0) {
                miq0Var4 = null;
            } else {
                miq0Var4 = miq0Var2;
            }
            if (qf40Var.isEmpty()) {
                xq00Var.m91771i0(-257691866);
                fxh0VarM96832C = zsf1.m96832C(cxh0Var, 0.0f, leu.m58816b(xq00Var).f117230b.f224764g, 0.0f, 0.0f, 13);
                arrayList = new ArrayList();
                while (r13.hasNext()) {
                    if (obj3 instanceof ruy) {
                        arrayList.add(obj3);
                    }
                }
                it = arrayList.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((ruy) next).f202965h != null) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                } while (!z8);
                ruyVar = (ruy) next;
                if (ruyVar != null) {
                    str = ruyVar.f202958a;
                } else {
                    str = null;
                }
                aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var, 0);
                iHashCode = Long.hashCode(xq00Var.f264809T);
                wpn0VarM91778m = xq00Var.m91778m();
                fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0Var4);
                soh.f211194A.getClass();
                eh00Var = roh.f201257b;
                if (xq00Var.f264811a != null) {
                    pmg1.m70360s();
                    throw null;
                }
                xq00Var.m91779m0();
                if (xq00Var.f264808S) {
                    xq00Var.m91776l(eh00Var);
                } else {
                    xq00Var.m91799w0();
                }
                zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var);
                zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
                zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
                zsf1.m96833D(roh.f201266k, xq00Var);
                itM42470n = fr0.m42470n(xq00Var, fxh0VarM48286s, roh.f201259d, 526594479, qf40Var);
                while (itM42470n.hasNext()) {
                    uuyVar = (uuy) itM42470n.next();
                    if (uuyVar instanceof ruy) {
                        xq00Var.m91771i0(-1345111184);
                        ruyVar2 = (ruy) uuyVar;
                        String str5 = ruyVar2.f202965h;
                        obj = ruyVar2.f202958a;
                        if (ruyVar2.f202960c == 5) {
                            xq00Var.m91788r(false);
                            itM42470n = itM42470n;
                        } else {
                            zM91766g = xq00Var.m91766g(obj);
                            objM91750T5 = xq00Var.m91750T();
                            if (zM91766g) {
                                objM91750T5 = new rka();
                                xq00Var.m91793t0(objM91750T5);
                            } else {
                                objM91750T5 = new rka();
                                xq00Var.m91793t0(objM91750T5);
                            }
                            rka rkaVar4 = (rka) objM91750T5;
                            if (wj50.m88271j(obj, str)) {
                                itM42470n = itM42470n;
                                xq00Var.m91771i0(-1344795604);
                                xq00Var.m91788r(false);
                            } else {
                                itM42470n = itM42470n;
                                xq00Var.m91771i0(-1344795604);
                                xq00Var.m91788r(false);
                            }
                            fxh0 fxh0VarM70866j4 = psh.m70866j(fxh0VarM96832C, rkaVar4);
                            if ((i5 & ContentType.LONG_FORM_ON_DEMAND) == 32) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            objM91750T6 = xq00Var.m91750T();
                            if (z7) {
                                objM91750T6 = new ooy(13, gh00Var);
                                xq00Var.m91793t0(objM91750T6);
                            } else {
                                objM91750T6 = new ooy(13, gh00Var);
                                xq00Var.m91793t0(objM91750T6);
                            }
                            z2 = false;
                            ltf1.m59883e(ruyVar2, (gh00) objM91750T6, fxh0VarM70866j4, xq00Var, 0);
                            xq00Var.m91788r(false);
                        }
                        fizVar3 = fizVar;
                        fizVar4 = fizVar2;
                        itM42470n = itM42470n;
                    } else {
                        itM42470n = itM42470n;
                        z2 = false;
                        if (uuyVar instanceof tuy) {
                            xq00Var.m91771i0(-1344496454);
                            vsg1.m86347g((tuy) uuyVar, fxh0VarM96832C, xq00Var, 0);
                            xq00Var.m91788r(false);
                        } else if (uuyVar instanceof puy) {
                            xq00Var.m91771i0(-1344392635);
                            puy puyVar4 = (puy) uuyVar;
                            if ((i5 & ContentType.LONG_FORM_ON_DEMAND) == 32) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            objM91750T4 = xq00Var.m91750T();
                            if (z6) {
                                objM91750T4 = new ooy(14, gh00Var);
                                xq00Var.m91793t0(objM91750T4);
                            } else {
                                objM91750T4 = new ooy(14, gh00Var);
                                xq00Var.m91793t0(objM91750T4);
                            }
                            z2 = false;
                            yvg1.m94699e(puyVar4, (gh00) objM91750T4, fxh0VarM96832C, xq00Var, 0);
                            xq00Var.m91788r(false);
                        } else if (uuyVar instanceof ouy) {
                            xq00Var.m91771i0(-1344118967);
                            ouy ouyVar4 = (ouy) uuyVar;
                            if ((i5 & ContentType.LONG_FORM_ON_DEMAND) == 32) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            objM91750T3 = xq00Var.m91750T();
                            if (z5) {
                                objM91750T3 = new ooy(15, gh00Var);
                                xq00Var.m91793t0(objM91750T3);
                            } else {
                                objM91750T3 = new ooy(15, gh00Var);
                                xq00Var.m91793t0(objM91750T3);
                            }
                            z2 = false;
                            wvf1.m89100d(ouyVar4, (gh00) objM91750T3, fxh0VarM96832C, xq00Var, 0);
                            xq00Var.m91788r(false);
                        } else if (uuyVar instanceof nuy) {
                            xq00Var.m91771i0(-1343875803);
                            nuy nuyVar4 = (nuy) uuyVar;
                            if ((i5 & ContentType.LONG_FORM_ON_DEMAND) == 32) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            objM91750T2 = xq00Var.m91750T();
                            if (z4) {
                                objM91750T2 = new ooy(16, gh00Var);
                                xq00Var.m91793t0(objM91750T2);
                            } else {
                                objM91750T2 = new ooy(16, gh00Var);
                                xq00Var.m91793t0(objM91750T2);
                            }
                            z2 = false;
                            xuf1.m92162a(nuyVar4, (gh00) objM91750T2, fxh0VarM96832C, xq00Var, 0);
                            xq00Var.m91788r(false);
                        } else {
                            z2 = false;
                            if (uuyVar instanceof quy) {
                                xq00Var.m91771i0(-1343594323);
                                qkf1.m73086g((quy) uuyVar, fxh0VarM96832C, xq00Var, 0);
                                xq00Var.m91788r(false);
                            } else {
                                if (uuyVar instanceof suy) {
                                    throw lq51.m59703i(1480629878, xq00Var, false);
                                }
                                xq00Var.m91771i0(-1343479685);
                                suy suyVar4 = (suy) uuyVar;
                                if ((i5 & ContentType.LONG_FORM_ON_DEMAND) == 32) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                objM91750T = xq00Var.m91750T();
                                if (z3) {
                                    objM91750T = new ooy(17, gh00Var);
                                    xq00Var.m91793t0(objM91750T);
                                } else {
                                    objM91750T = new ooy(17, gh00Var);
                                    xq00Var.m91793t0(objM91750T);
                                }
                                c150.m31219a(suyVar4, (gh00) objM91750T, fizVar3, fizVar4, fxh0VarM96832C, miq0Var4, xq00Var, i5 & 466816);
                                xq00Var.m91788r(false);
                            }
                            fizVar3 = fizVar;
                            fizVar4 = fizVar2;
                            itM42470n = itM42470n;
                        }
                    }
                    fizVar3 = fizVar;
                    fizVar4 = fizVar2;
                    itM42470n = itM42470n;
                }
                a831.m25018j(xq00Var, false, true, false);
            } else {
                xq00Var.m91771i0(-255417179);
                xq00Var.m91788r(false);
            }
            miq0Var3 = miq0Var4;
            fxh0Var3 = fxh0Var4;
        } else {
            xq00Var.m91757b0();
            fxh0Var3 = fxh0Var2;
            miq0Var3 = miq0Var2;
        }
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C1745cl(n300Var, gh00Var, fizVar, fizVar2, fxh0Var3, miq0Var3, i, i2, 9);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m44495b(int i, int i2, List list) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i2, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            h6d0 h6d0Var = (h6d0) list.get(i3);
            float fM84555p = v3d1.m84555p(v3d1.m84552m(h6d0Var));
            if (fM84555p == 0.0f) {
                int iMin2 = Math.min(h6d0Var.mo39623w(Alert.DURATION_SHOW_INDEFINITELY), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, h6d0Var.mo39620d(iMin2));
            } else if (fM84555p > 0.0f) {
                f += fM84555p;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            h6d0 h6d0Var2 = (h6d0) list.get(i4);
            float fM84555p2 = v3d1.m84555p(v3d1.m84552m(h6d0Var2));
            if (fM84555p2 > 0.0f) {
                iMax = Math.max(iMax, h6d0Var2.mo39620d(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM84555p2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    /* JADX INFO: renamed from: c */
    public static int m44496c(int i, int i2, List list) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            h6d0 h6d0Var = (h6d0) list.get(i4);
            float fM84555p = v3d1.m84555p(v3d1.m84552m(h6d0Var));
            int iMo39623w = h6d0Var.mo39623w(i);
            if (fM84555p == 0.0f) {
                i3 += iMo39623w;
            } else if (fM84555p > 0.0f) {
                f += fM84555p;
                iMax = Math.max(iMax, Math.round(iMo39623w / fM84555p));
            }
        }
        return ((list.size() - 1) * i2) + Math.round(iMax * f) + i3;
    }

    /* JADX INFO: renamed from: d */
    public static int m44497d(int i, int i2, List list) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i2, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            h6d0 h6d0Var = (h6d0) list.get(i3);
            float fM84555p = v3d1.m84555p(v3d1.m84552m(h6d0Var));
            if (fM84555p == 0.0f) {
                int iMin2 = Math.min(h6d0Var.mo39623w(Alert.DURATION_SHOW_INDEFINITELY), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, h6d0Var.mo39621l(iMin2));
            } else if (fM84555p > 0.0f) {
                f += fM84555p;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            h6d0 h6d0Var2 = (h6d0) list.get(i4);
            float fM84555p2 = v3d1.m84555p(v3d1.m84552m(h6d0Var2));
            if (fM84555p2 > 0.0f) {
                iMax = Math.max(iMax, h6d0Var2.mo39621l(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM84555p2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    /* JADX INFO: renamed from: e */
    public static int m44498e(int i, int i2, List list) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            h6d0 h6d0Var = (h6d0) list.get(i4);
            float fM84555p = v3d1.m84555p(v3d1.m84552m(h6d0Var));
            int iMo39622u = h6d0Var.mo39622u(i);
            if (fM84555p == 0.0f) {
                i3 += iMo39622u;
            } else if (fM84555p > 0.0f) {
                f += fM84555p;
                iMax = Math.max(iMax, Math.round(iMo39622u / fM84555p));
            }
        }
        return ((list.size() - 1) * i2) + Math.round(iMax * f) + i3;
    }

    /* JADX INFO: renamed from: f */
    public static final void m44499f(o1m0 o1m0Var, eh00 eh00Var, eh00 eh00Var2, th00 th00Var, gh00 gh00Var, eh00 eh00Var3, xq00 xq00Var, int i) {
        int i2;
        th00 th00Var2;
        gh00 gh00Var2;
        eh00 eh00Var4;
        xq00 xq00Var2;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(-1106818878);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(o1m0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(eh00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(eh00Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            th00Var2 = th00Var;
            i2 |= xq00Var.m91770i(th00Var2) ? 2048 : 1024;
        } else {
            th00Var2 = th00Var;
        }
        if ((i & 24576) == 0) {
            gh00Var2 = gh00Var;
            i2 |= xq00Var.m91770i(gh00Var2) ? 16384 : 8192;
        } else {
            gh00Var2 = gh00Var;
        }
        if ((196608 & i) == 0) {
            eh00Var4 = eh00Var3;
            i2 |= xq00Var.m91770i(eh00Var4) ? 131072 : 65536;
        } else {
            eh00Var4 = eh00Var3;
        }
        int i3 = i2;
        if (!xq00Var.m91752Y(i3 & 1, (74899 & i3) != 74898)) {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        } else if (o1m0Var instanceof n1m0) {
            xq00Var.m91771i0(1498958649);
            n1m0 n1m0Var = (n1m0) o1m0Var;
            j0m0 j0m0Var = new j0m0(n1m0Var.f149472b, n1m0Var.f149471a);
            fxh0 fxh0VarM61820d = mi21.m61820d(1.0f, cxh0.f43038a);
            boolean z = ((i3 & 14) == 4) | ((i3 & 7168) == 2048) | ((i3 & 57344) == 16384) | ((i3 & 458752) == 131072);
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == ia7Var) {
                q1m0 q1m0Var = new q1m0(th00Var2, o1m0Var, gh00Var2, eh00Var4, 0);
                xq00Var.m91793t0(q1m0Var);
                objM91750T = q1m0Var;
            }
            xq00Var2 = xq00Var;
            hdg1.m47189e(j0m0Var, fxh0VarM61820d, eh00Var2, (gh00) objM91750T, xq00Var2, (i3 & 896) | 48);
            xq00Var.m91788r(false);
        } else {
            if (!(o1m0Var instanceof m1m0)) {
                throw lq51.m59703i(1498957299, xq00Var, false);
            }
            xq00Var.m91771i0(1498971121);
            m1m0 m1m0Var = (m1m0) o1m0Var;
            j0m0 j0m0Var2 = new j0m0(m1m0Var.f139034b, m1m0Var.f139033a);
            boolean z2 = ((i3 & 7168) == 2048) | ((i3 & 14) == 4) | ((i3 & 57344) == 16384) | ((i3 & 458752) == 131072);
            Object objM91750T2 = xq00Var.m91750T();
            if (z2 || objM91750T2 == ia7Var) {
                q1m0 q1m0Var2 = new q1m0(th00Var, o1m0Var, gh00Var, eh00Var3, 1);
                xq00Var.m91793t0(q1m0Var2);
                objM91750T2 = q1m0Var2;
            }
            xq00Var2 = xq00Var;
            edg1.m38584b(j0m0Var2, eh00Var, eh00Var2, (gh00) objM91750T2, xq00Var2, i3 & 1008);
            xq00Var2.m91788r(false);
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new fxa0((Object) o1m0Var, (Object) eh00Var, (Object) eh00Var2, (Object) th00Var, gh00Var, (Object) eh00Var3, i, 14);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final tm91 m44500g() {
        return new tm91(g1v.f75746b1, g1v.f75748c1);
    }

    /* JADX INFO: renamed from: h */
    public static int m44501h(int i, int i2, List list) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            h6d0 h6d0Var = (h6d0) list.get(i4);
            float fM84555p = v3d1.m84555p(v3d1.m84552m(h6d0Var));
            int iMo39620d = h6d0Var.mo39620d(i);
            if (fM84555p == 0.0f) {
                i3 += iMo39620d;
            } else if (fM84555p > 0.0f) {
                f += fM84555p;
                iMax = Math.max(iMax, Math.round(iMo39620d / fM84555p));
            }
        }
        return ((list.size() - 1) * i2) + Math.round(iMax * f) + i3;
    }

    /* JADX INFO: renamed from: i */
    public static int m44502i(int i, int i2, List list) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i2, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            h6d0 h6d0Var = (h6d0) list.get(i3);
            float fM84555p = v3d1.m84555p(v3d1.m84552m(h6d0Var));
            if (fM84555p == 0.0f) {
                int iMin2 = Math.min(h6d0Var.mo39620d(Alert.DURATION_SHOW_INDEFINITELY), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, h6d0Var.mo39623w(iMin2));
            } else if (fM84555p > 0.0f) {
                f += fM84555p;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            h6d0 h6d0Var2 = (h6d0) list.get(i4);
            float fM84555p2 = v3d1.m84555p(v3d1.m84552m(h6d0Var2));
            if (fM84555p2 > 0.0f) {
                iMax = Math.max(iMax, h6d0Var2.mo39623w(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM84555p2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    /* JADX INFO: renamed from: j */
    public static int m44503j(int i, int i2, List list) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            h6d0 h6d0Var = (h6d0) list.get(i4);
            float fM84555p = v3d1.m84555p(v3d1.m84552m(h6d0Var));
            int iMo39621l = h6d0Var.mo39621l(i);
            if (fM84555p == 0.0f) {
                i3 += iMo39621l;
            } else if (fM84555p > 0.0f) {
                f += fM84555p;
                iMax = Math.max(iMax, Math.round(iMo39621l / fM84555p));
            }
        }
        return ((list.size() - 1) * i2) + Math.round(iMax * f) + i3;
    }

    /* JADX INFO: renamed from: k */
    public static int m44504k(int i, int i2, List list) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i2, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            h6d0 h6d0Var = (h6d0) list.get(i3);
            float fM84555p = v3d1.m84555p(v3d1.m84552m(h6d0Var));
            if (fM84555p == 0.0f) {
                int iMin2 = Math.min(h6d0Var.mo39620d(Alert.DURATION_SHOW_INDEFINITELY), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, h6d0Var.mo39622u(iMin2));
            } else if (fM84555p > 0.0f) {
                f += fM84555p;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            h6d0 h6d0Var2 = (h6d0) list.get(i4);
            float fM84555p2 = v3d1.m84555p(v3d1.m84552m(h6d0Var2));
            if (fM84555p2 > 0.0f) {
                iMax = Math.max(iMax, h6d0Var2.mo39622u(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM84555p2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    /* JADX INFO: renamed from: l */
    public static final uyi0 m44505l(Context context) {
        uyi0 uyi0Var = new uyi0(context);
        eaj0 eaj0Var = uyi0Var.f235286v;
        eaj0Var.m38301a(new clh(eaj0Var));
        uyi0Var.f235286v.m38301a(new elh());
        uyi0Var.f235286v.m38301a(new hhr());
        return uyi0Var;
    }

    /* JADX INFO: renamed from: m */
    public static ro80 m44506m(List list) {
        ro80 ro80Var = (ro80) list;
        ro80Var.m76025i();
        ro80Var.f201180c = true;
        return ro80Var.f201179b > 0 ? ro80Var : ro80.f201177d;
    }

    /* JADX INFO: renamed from: n */
    public static final Object[] m44507n(Object[] objArr, boolean z) {
        return (z && objArr.getClass().equals(Object[].class)) ? objArr : Arrays.copyOf(objArr, objArr.length, Object[].class);
    }

    /* JADX INFO: renamed from: o */
    public static ro80 m44508o() {
        return new ro80(10);
    }

    /* JADX INFO: renamed from: p */
    public static ro80 m44509p() {
        return new ro80(2);
    }

    /* JADX INFO: renamed from: q */
    public static final msh m44510q(lp70 lp70Var, hsh hshVar) {
        ViewGroup.LayoutParams layoutParams = efe1.f59036a;
        return new msh(hshVar, new kx91(lp70Var));
    }

    /* JADX INFO: renamed from: r */
    public static final msh m44511r(lp70 lp70Var, hsh hshVar) {
        ViewGroup.LayoutParams layoutParams = efe1.f59036a;
        return new msh(hshVar, new kx91(lp70Var));
    }

    /* JADX INFO: renamed from: s */
    public static final List m44512s(Map map) {
        pxj pxjVar;
        Set setKeySet = map.keySet();
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (bm51.m29803n0((String) obj, "content_type_", false)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str : arrayList) {
            try {
                String strM88481e1 = wl51.m88481e1(str, "content_type_", str);
                pxj[] pxjVarArrValues = pxj.values();
                int length = pxjVarArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                    pxjVar = pxjVarArrValues[i];
                    if (pxjVar.f182320a.equalsIgnoreCase(strM88481e1)) {
                        break;
                    }
                    i++;
                }
            } catch (NoSuchElementException e) {
                Logger.m3966b(edb.m38566o("Recents: Failed to parse content tag: ", str, "\n", e.getMessage()), new Object[0]);
                pxjVar = null;
            }
            if (pxjVar != null) {
                arrayList2.add(pxjVar);
            }
        }
        return g6f.m43727j0(arrayList2);
    }

    /* JADX INFO: renamed from: t */
    public static final String m44513t(nw80 nw80Var) {
        for (String str : nw80Var.f159053g.keySet()) {
            if (bm51.m29803n0(str, "group_id_", false)) {
                return str;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static List m44514u() {
        return Collections.singletonList(qpv0.f191387a.mo54112b(upk.class));
    }

    /* JADX INFO: renamed from: v */
    public static final s4v0 m44515v(nw80 nw80Var) {
        Map map = nw80Var.f159053g;
        if (map.get("recent_type_shared") != null) {
            return s4v0.SHARED;
        }
        if (map.get("recent_type_saved") != null) {
            return s4v0.SAVED;
        }
        return map.get("recent_type_auto_generated") != null ? s4v0.AUTO_GENERATED : s4v0.PLAYED;
    }

    /* JADX INFO: renamed from: w */
    public static final int m44516w(int i, int i2) {
        return (i >> i2) & 31;
    }

    /* JADX INFO: renamed from: x */
    public static final boolean m44517x(nw80 nw80Var, boolean z) {
        try {
            if (new gf41(nw80Var.f159049c).f79270c == df41.EPISODE) {
                return z || m44512s(nw80Var.f159053g).contains(pxj.MUSIC);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: y */
    public static List m44518y(Object obj) {
        return Collections.singletonList(obj);
    }

    /* JADX INFO: renamed from: z */
    public static final GroupMetadata m44519z(Map map) {
        String str = (String) map.get("group_metadata");
        if (str == null) {
            return null;
        }
        try {
            return GroupMetadata.m20334s(Base64.decode(str, 0));
        } catch (Exception unused) {
            return null;
        }
    }
}
