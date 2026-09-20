package p204p;

import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import com.comscore.streaming.ContentType;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class hfs {

    /* JADX INFO: renamed from: a */
    public static final float f90797a = 60;

    /* JADX INFO: renamed from: b */
    public static final float f90798b = 8;

    /* JADX INFO: renamed from: c */
    public static final float f90799c = 16;

    /* JADX WARN: Code duplicated, block: B:138:0x042e  */
    /* JADX WARN: Code duplicated, block: B:142:0x045b  */
    /* JADX WARN: Code duplicated, block: B:144:0x0476  */
    /* JADX WARN: Code duplicated, block: B:147:0x0492  */
    /* JADX WARN: Code duplicated, block: B:148:0x04a1  */
    /* JADX INFO: renamed from: a */
    public static final void m47366a(ko70 ko70Var, qf40 qf40Var, qf40 qf40Var2, int i, als alsVar, gh00 gh00Var, fxh0 fxh0Var, de71 de71Var, List list, String str, xq00 xq00Var, int i2) {
        xq00 xq00Var2;
        Object folVar;
        kqi0 kqi0Var;
        ia7 ia7Var;
        jc20 jc20Var;
        ib31 ib31Var;
        yw70 yw70Var;
        ib31 ib31Var2;
        kqi0 kqi0Var2;
        int length;
        cxh0 cxh0Var;
        boolean z;
        boolean z2;
        fxh0 fxh0VarM61824h;
        boolean zM91770i;
        Object objM91750T;
        ia7 ia7Var2 = t6x0.f217647t;
        xq00Var.m91775k0(-793620169);
        int i3 = i2 | (xq00Var.m91762e(ko70Var.ordinal()) ? 4 : 2) | (xq00Var.m91766g(qf40Var) ? 32 : 16) | (xq00Var.m91766g(qf40Var2) ? 256 : 128) | (xq00Var.m91762e(i) ? 2048 : 1024) | (xq00Var.m91770i(alsVar) ? 16384 : 8192) | (xq00Var.m91770i(gh00Var) ? 131072 : 65536) | (xq00Var.m91770i(fxh0Var) ? 1048576 : 524288) | (xq00Var.m91762e(de71Var == null ? -1 : de71Var.ordinal()) ? 8388608 : 4194304) | (xq00Var.m91766g(list) ? 67108864 : 33554432) | (xq00Var.m91766g(str) ? 536870912 : 268435456);
        if (xq00Var.m91752Y(i3 & 1, (306783379 & i3) != 306783378)) {
            boolean z3 = (i3 & 896) == 256;
            Object objM91750T2 = xq00Var.m91750T();
            if (z3 || objM91750T2 == ia7Var2) {
                objM91750T2 = g6f.m43736n1(qf40Var2);
                xq00Var.m91793t0(objM91750T2);
            }
            Set set = (Set) objM91750T2;
            Integer num = (Integer) g6f.m43745s0(qf40Var2);
            int iIntValue = num != null ? num.intValue() : 0;
            Integer num2 = (Integer) g6f.m43689C0(qf40Var2);
            int iIntValue2 = num2 != null ? num2.intValue() : 0;
            float f = leu.m58816b(xq00Var).f117230b.f224764g;
            yqq yqqVar = (yqq) xq00Var.m91774k(wsh.f254617h);
            float fMo35989Z0 = yqqVar.mo35989Z0(f);
            jc20 jc20Var2 = (jc20) xq00Var.m91774k(wsh.f254621l);
            xq00Var.m91771i0(1835222804);
            float fMo35989Z1 = yqqVar.mo35989Z0(leu.m58816b(xq00Var).f117232d.f137887c);
            xq00Var.m91788r(false);
            float fMo35989Z2 = yqqVar.mo35989Z0(f90797a);
            float fMo35989Z3 = yqqVar.mo35989Z0(f90798b);
            float fMo35989Z4 = yqqVar.mo35989Z0(f90799c);
            xq00Var.m91771i0(1835232849);
            float fMo35989Z5 = yqqVar.mo35989Z0(leu.m58816b(xq00Var).f117230b.f224759b - ((leu.m58816b(xq00Var).f117232d.f137887c - leu.m58816b(xq00Var).f117232d.f137886b) / 2));
            xq00Var.m91788r(false);
            Object objM91750T3 = xq00Var.m91750T();
            if (objM91750T3 == ia7Var2) {
                objM91750T3 = sam.m77645B(new ifs(false, false, 0.0f, 0.0f, -1, -1, 0.0f, null, 0, 0.0f, false));
                xq00Var.m91793t0(objM91750T3);
            }
            kqi0 kqi0Var3 = (kqi0) objM91750T3;
            Object objM91750T4 = xq00Var.m91750T();
            if (objM91750T4 == ia7Var2) {
                objM91750T4 = sam.m77645B(Float.valueOf(0.0f));
                xq00Var.m91793t0(objM91750T4);
            }
            kqi0 kqi0Var4 = (kqi0) objM91750T4;
            Object objM91750T5 = xq00Var.m91750T();
            if (objM91750T5 == ia7Var2) {
                objM91750T5 = new ib31();
                xq00Var.m91793t0(objM91750T5);
            }
            ib31 ib31Var3 = (ib31) objM91750T5;
            Object objM91750T6 = xq00Var.m91750T();
            if (objM91750T6 == ia7Var2) {
                objM91750T6 = new ib31();
                xq00Var.m91793t0(objM91750T6);
            }
            ib31 ib31Var4 = (ib31) objM91750T6;
            kqi0 kqi0VarM77651H = sam.m77651H(gh00Var, xq00Var);
            Object objM91750T7 = xq00Var.m91750T();
            if (objM91750T7 == ia7Var2) {
                objM91750T7 = sam.m77645B(null);
                xq00Var.m91793t0(objM91750T7);
            }
            kqi0 kqi0Var5 = (kqi0) objM91750T7;
            Object objM91750T8 = xq00Var.m91750T();
            if (objM91750T8 == ia7Var2) {
                objM91750T8 = sam.m77645B("");
                xq00Var.m91793t0(objM91750T8);
            }
            kqi0 kqi0Var6 = (kqi0) objM91750T8;
            Object objM91750T9 = xq00Var.m91750T();
            if (objM91750T9 == ia7Var2) {
                objM91750T9 = j4x.m52407e(0, xq00Var);
            }
            vum0 vum0Var = (vum0) objM91750T9;
            zks zksVar = new zks(3, 2);
            Object objM91750T10 = xq00Var.m91750T();
            if (objM91750T10 == ia7Var2) {
                objM91750T10 = sam.m77645B(null);
                xq00Var.m91793t0(objM91750T10);
            }
            kqi0 kqi0Var7 = (kqi0) objM91750T10;
            boolean z4 = kqi0Var7.getValue() == null;
            if (!qf40Var2.equals(kqi0Var7.getValue())) {
                kqi0Var7.setValue(qf40Var2);
                de71 de71Var2 = (de71) kqi0Var5.getValue();
                if (de71Var2 == null) {
                    de71Var2 = de71Var;
                }
                m47367b(kqi0Var3, jc20Var2, kqi0VarM77651H, new l00(iIntValue, iIntValue2, de71Var2, z4));
                kqi0Var5.setValue(null);
            }
            boolean zM91770i2 = xq00Var.m91770i(kqi0Var4) | xq00Var.m91770i(kqi0Var3) | xq00Var.m91770i(jc20Var2) | xq00Var.m91770i(kqi0VarM77651H);
            Object objM91750T11 = xq00Var.m91750T();
            if (zM91770i2 || objM91750T11 == ia7Var2) {
                objM91750T11 = new pek(kqi0Var4, kqi0Var3, jc20Var2, kqi0VarM77651H);
                xq00Var.m91793t0(objM91750T11);
            }
            fxh0 fxh0VarM85877w = vkf1.m85877w(fxh0Var, (gh00) objM91750T11);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM85877w);
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
            yw70 yw70VarM30763a = bx70.m30763a(0, 3, xq00Var);
            Integer numValueOf = Integer.valueOf(((ifs) kqi0Var3.getValue()).f101822i);
            boolean zM91770i3 = xq00Var.m91770i(kqi0Var3) | ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 32) | ((i3 & 234881024) == 67108864) | xq00Var.m91770i(yw70VarM30763a);
            Object objM91750T12 = xq00Var.m91750T();
            if (zM91770i3 || objM91750T12 == ia7Var2) {
                kqi0Var = kqi0Var3;
                folVar = new fol(26, qf40Var, list, yw70VarM30763a, kqi0Var, null);
                xq00Var.m91793t0(folVar);
            } else {
                folVar = objM91750T12;
                kqi0Var = kqi0Var3;
            }
            hz40.m49237i(numValueOf, (th00) folVar, xq00Var);
            Boolean boolValueOf = Boolean.valueOf(((ifs) kqi0Var.getValue()).m50447b());
            boolean zM91770i4 = xq00Var.m91770i(kqi0Var) | xq00Var.m91760d(fMo35989Z0) | xq00Var.m91760d(fMo35989Z2) | xq00Var.m91760d(fMo35989Z3) | xq00Var.m91760d(fMo35989Z4) | xq00Var.m91770i(yw70VarM30763a) | xq00Var.m91770i(jc20Var2) | xq00Var.m91770i(kqi0VarM77651H) | xq00Var.m91762e(iIntValue) | xq00Var.m91762e(iIntValue2) | xq00Var.m91770i(ib31Var3) | xq00Var.m91770i(ib31Var4);
            Object objM91750T13 = xq00Var.m91750T();
            if (zM91770i4) {
                ia7Var = ia7Var2;
            } else {
                ia7Var = ia7Var2;
                if (objM91750T13 != ia7Var) {
                    jc20Var = jc20Var2;
                    ib31Var2 = ib31Var4;
                    ib31Var = ib31Var3;
                    yw70Var = yw70VarM30763a;
                    kqi0Var2 = kqi0VarM77651H;
                }
                hz40.m49237i(boolValueOf, (th00) objM91750T13, xq00Var);
                ia7 ia7Var3 = ia7Var;
                xq00Var2 = xq00Var;
                qqg1.m73533c(new c4t0[]{wsh.f254623n.mo30068a(ko70Var), d2m0.f44585a.mo30068a(null)}, rkk.m75772x(472792753, new efs(list, f, yw70Var, ib31Var, ib31Var2, qf40Var, set, kqi0Var, i, iIntValue, iIntValue2, kqi0Var5, kqi0Var2, kqi0Var6, alsVar, zksVar, vum0Var, jc20Var, kqi0Var4, str, qf40Var2, fMo35989Z1, fMo35989Z5), xq00Var2), xq00Var2, 56);
                length = ((String) kqi0Var6.getValue()).length();
                cxh0Var = cxh0.f43038a;
                if (length > 0) {
                    xq00Var2.m91771i0(-495944560);
                    xq00Var2.m91765f0(1785117348, Integer.valueOf(vum0Var.m86437v()));
                    z = true;
                    fxh0 fxh0VarM97185e = zxc.m97185e(0.0f, mi21.m61834r(1, cxh0Var));
                    zM91770i = xq00Var2.m91770i(kqi0Var6);
                    objM91750T = xq00Var2.m91750T();
                    if (zM91770i || objM91750T == ia7Var3) {
                        objM91750T = new hek(kqi0Var6, 26);
                        xq00Var2.m91793t0(objM91750T);
                    }
                    z2 = false;
                    dha.m36004a(zoz0.m96644b(fxh0VarM97185e, false, (gh00) objM91750T), xq00Var2, 0);
                    xq00Var2.m91788r(false);
                    xq00Var2.m91788r(false);
                } else {
                    z = true;
                    z2 = false;
                    xq00Var2.m91771i0(-495697583);
                    xq00Var2.m91788r(false);
                }
                fxh0VarM61824h = mi21.m61824h(f, mi21.m61822f(1.0f, cxh0Var));
                if (list.isEmpty()) {
                    xq00Var2.m91771i0(-495591594);
                    dvg1.m37100b(r3a.f195461b, fxh0VarM61824h, xq00Var2, 6);
                    xq00Var2.m91788r(z2);
                } else {
                    xq00Var2.m91771i0(-495504143);
                    xq00Var2.m91788r(z2);
                }
                dvg1.m37100b(r3a.f195462c, pha.f177517a.mo66945a(fxh0VarM61824h, d7f0.f46155Y), xq00Var2, 6);
                xq00Var2.m91788r(z);
            }
            jc20Var = jc20Var2;
            ib31Var = ib31Var3;
            yw70Var = yw70VarM30763a;
            objM91750T13 = new ves(fMo35989Z0, fMo35989Z2, fMo35989Z3, fMo35989Z4, yw70Var, iIntValue, iIntValue2, ib31Var, ib31Var4, kqi0Var, jc20Var, kqi0VarM77651H, null);
            ib31Var2 = ib31Var4;
            kqi0Var2 = kqi0VarM77651H;
            xq00Var.m91793t0(objM91750T13);
            hz40.m49237i(boolValueOf, (th00) objM91750T13, xq00Var);
            ia7 ia7Var4 = ia7Var;
            xq00Var2 = xq00Var;
            qqg1.m73533c(new c4t0[]{wsh.f254623n.mo30068a(ko70Var), d2m0.f44585a.mo30068a(null)}, rkk.m75772x(472792753, new efs(list, f, yw70Var, ib31Var, ib31Var2, qf40Var, set, kqi0Var, i, iIntValue, iIntValue2, kqi0Var5, kqi0Var2, kqi0Var6, alsVar, zksVar, vum0Var, jc20Var, kqi0Var4, str, qf40Var2, fMo35989Z1, fMo35989Z5), xq00Var2), xq00Var2, 56);
            length = ((String) kqi0Var6.getValue()).length();
            cxh0Var = cxh0.f43038a;
            if (length > 0) {
                xq00Var2.m91771i0(-495944560);
                xq00Var2.m91765f0(1785117348, Integer.valueOf(vum0Var.m86437v()));
                z = true;
                fxh0 fxh0VarM97185e2 = zxc.m97185e(0.0f, mi21.m61834r(1, cxh0Var));
                zM91770i = xq00Var2.m91770i(kqi0Var6);
                objM91750T = xq00Var2.m91750T();
                if (zM91770i) {
                    objM91750T = new hek(kqi0Var6, 26);
                    xq00Var2.m91793t0(objM91750T);
                } else {
                    objM91750T = new hek(kqi0Var6, 26);
                    xq00Var2.m91793t0(objM91750T);
                }
                z2 = false;
                dha.m36004a(zoz0.m96644b(fxh0VarM97185e2, false, (gh00) objM91750T), xq00Var2, 0);
                xq00Var2.m91788r(false);
                xq00Var2.m91788r(false);
            } else {
                z = true;
                z2 = false;
                xq00Var2.m91771i0(-495697583);
                xq00Var2.m91788r(false);
            }
            fxh0VarM61824h = mi21.m61824h(f, mi21.m61822f(1.0f, cxh0Var));
            if (list.isEmpty()) {
                xq00Var2.m91771i0(-495591594);
                dvg1.m37100b(r3a.f195461b, fxh0VarM61824h, xq00Var2, 6);
                xq00Var2.m91788r(z2);
            } else {
                xq00Var2.m91771i0(-495504143);
                xq00Var2.m91788r(z2);
            }
            dvg1.m37100b(r3a.f195462c, pha.f177517a.mo66945a(fxh0VarM61824h, d7f0.f46155Y), xq00Var2, 6);
            xq00Var2.m91788r(z);
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C2474ux(i, i2, str, list, alsVar, gh00Var, qf40Var, qf40Var2, ko70Var, fxh0Var, de71Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m47367b(kqi0 kqi0Var, jc20 jc20Var, rv41 rv41Var, j10 j10Var) {
        llv0 llv0Var;
        yk91 yk91Var;
        llv0 llv0Var2;
        de71 de71Var;
        de71 de71Var2;
        ifs ifsVarM50446a;
        yk91 yk91Var2;
        ifs ifsVar = (ifs) kqi0Var.getValue();
        int i = ifsVar.f101822i;
        boolean z = ifsVar.f101814a;
        boolean z2 = j10Var instanceof m00;
        qft qftVar = qft.f188290a;
        if (z2) {
            llv0Var = new llv0(ifs.m50446a(ifsVar, true, false, ((m00) j10Var).f138480a, 0.0f, -1, 0, 0.0f, null, 0, 0.0f, false, 2026), Collections.singletonList(qftVar));
        } else if (j10Var instanceof C1878fz) {
            llv0Var = new llv0(ifs.m50446a(ifsVar, false, true, 0.0f, ((C1878fz) j10Var).f74876a, 0, -1, 0.0f, null, 0, 0.0f, false, 2005), Collections.singletonList(qftVar));
        } else {
            boolean z3 = j10Var instanceof C2108lz;
            de71 de71Var3 = de71.f48000b;
            de71 de71Var4 = de71.f47999a;
            Integer numValueOf = null;
            if (z3) {
                C2108lz c2108lz = (C2108lz) j10Var;
                Integer num = c2108lz.f138157d;
                float f = c2108lz.f138154a;
                if (ifsVar.m50447b()) {
                    if (z) {
                        de71Var2 = de71Var4;
                        ifsVarM50446a = ifs.m50446a(ifsVar, false, false, ifsVar.f101816c + f, 0.0f, 0, 0, 0.0f, null, 0, 0.0f, false, 2043);
                    } else {
                        de71Var2 = de71Var4;
                        ifsVarM50446a = ifs.m50446a(ifsVar, false, false, 0.0f, ifsVar.f101817d + f, 0, 0, 0.0f, null, 0, 0.0f, false, 2039);
                    }
                    boolean z4 = ifsVarM50446a.f101814a;
                    if (z4) {
                        if (num != 0) {
                            int iIntValue = num.intValue();
                            int i2 = c2108lz.f138156c;
                            if (iIntValue > i2) {
                                iIntValue = i2;
                            }
                            numValueOf = Integer.valueOf(iIntValue);
                        }
                        yk91Var2 = new yk91(numValueOf, Integer.valueOf(ifsVarM50446a.f101818e), de71Var2);
                    } else {
                        if (num != 0) {
                            int iIntValue2 = num.intValue();
                            int i3 = c2108lz.f138155b;
                            if (iIntValue2 < i3) {
                                iIntValue2 = i3;
                            }
                            numValueOf = Integer.valueOf(iIntValue2);
                        }
                        yk91Var2 = new yk91(numValueOf, Integer.valueOf(ifsVarM50446a.f101819f), de71Var3);
                    }
                    Integer num2 = (Integer) yk91Var2.f273650a;
                    int iIntValue3 = ((Number) yk91Var2.f273651b).intValue();
                    de71 de71Var5 = (de71) yk91Var2.f273652c;
                    if (num2 == null || num2.intValue() == iIntValue3) {
                        llv0Var = new llv0(ifsVarM50446a);
                    } else {
                        llv0Var2 = new llv0(z4 ? ifs.m50446a(ifsVarM50446a, false, false, 0.0f, 0.0f, num2.intValue(), 0, 0.0f, null, 0, 0.0f, false, 2031) : ifs.m50446a(ifsVarM50446a, false, false, 0.0f, 0.0f, 0, num2.intValue(), 0.0f, null, 0, 0.0f, false, 2015), Collections.singletonList(new eft(de71Var5, num2.intValue())));
                        llv0Var = llv0Var2;
                    }
                } else {
                    llv0Var = new llv0(ifsVar);
                }
            } else if (j10Var instanceof C1996iz) {
                llv0Var = new llv0(ifs.m50446a(ifsVar, false, false, 0.0f, 0.0f, -1, -1, 0.0f, null, 0, 0.0f, false, 1996));
            } else if (j10Var instanceof k00) {
                llv0Var = new llv0(ifsVar, Collections.singletonList(new fft(((k00) j10Var).f117831a)));
            } else if (j10Var instanceof C2432ty) {
                llv0Var = new llv0(ifs.m50446a(ifsVar, false, false, 0.0f, 0.0f, 0, 0, ((C2432ty) j10Var).f224789a, null, 0, 0.0f, false, 1983));
            } else if (j10Var instanceof n00) {
                float f2 = ((n00) j10Var).f148850a;
                llv0Var = f2 == ifsVar.f101823j ? new llv0(ifsVar) : new llv0(ifs.m50446a(ifsVar, false, false, 0.0f, 0.0f, 0, 0, 0.0f, null, 0, f2, false, 1535));
            } else if (j10Var instanceof l00) {
                l00 l00Var = (l00) j10Var;
                if (ifsVar.m50447b()) {
                    llv0Var = new llv0(ifsVar);
                } else {
                    boolean z5 = l00Var.f128248d;
                    int i4 = l00Var.f128245a;
                    if (z5 || (de71Var = l00Var.f128247c) == de71Var4) {
                        llv0Var = new llv0(ifs.m50446a(ifsVar, false, false, 0.0f, 0.0f, 0, 0, 0.0f, Integer.valueOf(i4), i + 1, 0.0f, false, 639));
                    } else if (de71Var == de71Var3) {
                        i4 = l00Var.f128246b;
                        llv0Var = new llv0(ifs.m50446a(ifsVar, false, false, 0.0f, 0.0f, 0, 0, 0.0f, Integer.valueOf(i4), i + 1, 0.0f, false, 639));
                    } else {
                        llv0Var = new llv0(ifsVar);
                    }
                }
            } else if (j10Var instanceof C2273py) {
                C2273py c2273py = (C2273py) j10Var;
                if (ifsVar.m50447b()) {
                    Integer num3 = c2273py.f183282c;
                    int i5 = c2273py.f183280a;
                    int i6 = c2273py.f183281b;
                    if (!z ? num3 == null || num3.intValue() > i5 : num3 == null || num3.intValue() < i6) {
                        if (z) {
                            if (num3 != null) {
                                int iIntValue4 = num3.intValue();
                                if (iIntValue4 <= i6) {
                                    i6 = iIntValue4;
                                }
                                numValueOf = Integer.valueOf(i6);
                            }
                            yk91Var = new yk91(numValueOf, Integer.valueOf(ifsVar.f101818e), de71Var4);
                        } else {
                            if (num3 != null) {
                                int iIntValue5 = num3.intValue();
                                if (iIntValue5 >= i5) {
                                    i5 = iIntValue5;
                                }
                                numValueOf = Integer.valueOf(i5);
                            }
                            yk91Var = new yk91(numValueOf, Integer.valueOf(ifsVar.f101819f), de71Var3);
                        }
                        Integer num4 = (Integer) yk91Var.f273650a;
                        int iIntValue6 = ((Number) yk91Var.f273651b).intValue();
                        de71 de71Var6 = (de71) yk91Var.f273652c;
                        if (num4 == null || num4.intValue() == iIntValue6) {
                            llv0Var = new llv0(ifsVar);
                        } else {
                            llv0Var2 = new llv0(z ? ifs.m50446a(ifsVar, false, false, 0.0f, 0.0f, num4.intValue(), 0, 0.0f, null, 0, 0.0f, false, 2031) : ifs.m50446a(ifsVar, false, false, 0.0f, 0.0f, 0, num4.intValue(), 0.0f, null, 0, 0.0f, false, 2015), Collections.singletonList(new eft(de71Var6, num4.intValue())));
                            llv0Var = llv0Var2;
                        }
                    } else {
                        llv0Var = new llv0(ifsVar);
                    }
                } else {
                    llv0Var = new llv0(ifsVar);
                }
            } else {
                if (!(j10Var instanceof C2393sy)) {
                    throw new NoWhenBranchMatchedException();
                }
                llv0Var = new llv0(ifs.m50446a(ifsVar, false, false, 0.0f, 0.0f, 0, 0, 0.0f, Integer.valueOf(((C2393sy) j10Var).f215076a), i + 1, 0.0f, true, 639));
            }
        }
        kqi0Var.setValue(llv0Var.f134715a);
        for (tmt tmtVar : llv0Var.f134716b) {
            if (tmtVar instanceof qft) {
                ((ado0) jc20Var).m25615a(0);
            } else if (tmtVar instanceof eft) {
                eft eftVar = (eft) tmtVar;
                ((gh00) rv41Var.getValue()).invoke(new ee71(eftVar.f59121a, eftVar.f59122b));
            } else {
                if (!(tmtVar instanceof fft)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((gh00) rv41Var.getValue()).invoke(new fe71(((fft) tmtVar).f69085a));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m47368c(int i, String str, String str2, xq00 xq00Var, fxh0 fxh0Var) {
        int i2;
        fxh0 fxh0VarM96644b;
        String str3 = str;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(1287554645);
        if ((i & 6) == 0) {
            i2 = (xq00Var2.m91766g(str3) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(fxh0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var2.m91766g(str2) ? 256 : 128;
        }
        int i3 = i2;
        if (xq00Var2.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            vb9 vb9Var = d7f0.f46142M0;
            fxh0 fxh0VarM64246i = nec.m64246i(mi21.m61822f(1.0f, fxh0Var), leu.m58815a(xq00Var2).f112823a.f229876c, kxf1.f127485a);
            cxh0 cxh0Var = cxh0.f43038a;
            if (str2 != null) {
                xq00Var2.m91771i0(389442265);
                boolean z = (i3 & 896) == 256;
                Object objM91750T = xq00Var2.m91750T();
                if (z || objM91750T == t6x0.f217647t) {
                    objM91750T = new eml(str2, 27);
                    xq00Var2.m91793t0(objM91750T);
                }
                fxh0VarM96644b = zoz0.m96644b(cxh0Var, false, (gh00) objM91750T);
                xq00Var2.m91788r(false);
            } else {
                xq00Var2.m91771i0(389443581);
                xq00Var2.m91788r(false);
                fxh0VarM96644b = cxh0Var;
            }
            fxh0 fxh0VarMo34315F = fxh0VarM64246i.mo34315F(fxh0VarM96644b);
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, vb9Var, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarMo34315F);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
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
            zsf1.m96835F(irx0VarM36744a, roh.f201262g, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var2);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var2);
            zsf1.m96833D(roh.f201266k, xq00Var2);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var2);
            y85.m93057b(lru.f136360c, qgj.f188480a, mi21.m61834r(10, cxh0Var), leu.m58815a(xq00Var2).f112824b.f138757a, 0L, false, xq00Var2, lru.f136361d | 48, 48);
            riw0.m75615i(xq00Var2, mi21.m61838v(leu.m58816b(xq00Var2).f117230b.f224762e, cxh0Var));
            str3 = str;
            ahf1.m25932d(str3, zsf1.m96830A(cxh0Var, 0.0f, leu.m58816b(xq00Var2).f117230b.f224761d, 1), leu.m58818d(xq00Var2).f64972h, leu.m58815a(xq00Var2).f112824b.f138757a, null, null, 0, false, null, 0, null, xq00Var, i3 & 14, 0, 2032);
            xq00Var2 = xq00Var;
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new xad(str3, fxh0Var, str2, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:195:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:196:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:199:0x02da A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:200:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:205:0x0325 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:206:0x0327  */
    /* JADX WARN: Code duplicated, block: B:209:0x0360  */
    /* JADX WARN: Code duplicated, block: B:211:0x0367  */
    /* JADX WARN: Code duplicated, block: B:212:0x036b  */
    /* JADX WARN: Code duplicated, block: B:214:0x0398  */
    /* JADX INFO: renamed from: d */
    public static final void m47369d(Float f, float f2, float f3, wb9 wb9Var, String str, String str2, String str3, float f4, i4s0 i4s0Var, gh00 gh00Var, eh00 eh00Var, gh00 gh00Var2, eh00 eh00Var2, ifs ifsVar, xq00 xq00Var, int i, int i2) {
        int i3;
        int i4;
        ifs ifsVar2;
        String str4;
        xq00 xq00Var2;
        String str5;
        float fFloatValue;
        i4s0 i4s0Var2;
        boolean z;
        boolean z2;
        boolean zM91770i;
        Object objM91750T;
        int i5;
        boolean z3;
        boolean zM91770i2;
        Object objM91750T2;
        m6d0 m6d0VarM36007d;
        int iHashCode;
        wpn0 wpn0VarM91778m;
        fxh0 fxh0VarM48286s;
        C2087le c2087le;
        xq00Var.m91775k0(38782571);
        int i6 = i & 6;
        pha phaVar = pha.f177517a;
        if (i6 == 0) {
            i3 = i | (xq00Var.m91770i(phaVar) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= xq00Var.m91766g(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= xq00Var.m91760d(f2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= xq00Var.m91760d(f3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= xq00Var.m91770i(wb9Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= xq00Var.m91766g(str) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= xq00Var.m91766g(str2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= xq00Var.m91766g(str3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= xq00Var.m91760d(f4) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= (i & 1073741824) == 0 ? xq00Var.m91766g(i4s0Var) : xq00Var.m91770i(i4s0Var) ? 536870912 : 268435456;
        }
        int i7 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (xq00Var.m91770i(gh00Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= xq00Var.m91770i(eh00Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= xq00Var.m91770i(gh00Var2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= xq00Var.m91770i(eh00Var2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            ifsVar2 = ifsVar;
            i4 |= xq00Var.m91766g(ifsVar2) ? 16384 : 8192;
        } else {
            ifsVar2 = ifsVar;
        }
        if (xq00Var.m91752Y(i7 & 1, ((i7 & 306783379) == 306783378 && (i4 & 9363) == 9362) ? false : true)) {
            xq00Var.m91761d0();
            if ((i & 1) != 0 && !xq00Var.m91735E()) {
                xq00Var.m91757b0();
            }
            xq00Var.m91790s();
            kqi0 kqi0VarM77651H = sam.m77651H(eh00Var, xq00Var);
            kqi0 kqi0VarM77651H2 = sam.m77651H(gh00Var2, xq00Var);
            kqi0 kqi0VarM77651H3 = sam.m77651H(eh00Var2, xq00Var);
            kqi0 kqi0VarM77651H4 = sam.m77651H(gh00Var, xq00Var);
            kqi0 kqi0VarM77651H5 = sam.m77651H(f, xq00Var);
            Object objM91750T3 = xq00Var.m91750T();
            ia7 ia7Var = t6x0.f217647t;
            if (objM91750T3 == ia7Var) {
                objM91750T3 = sam.m77645B(Boolean.FALSE);
                xq00Var.m91793t0(objM91750T3);
            }
            kqi0 kqi0Var = (kqi0) objM91750T3;
            float f5 = 2 * (-f2);
            Float f6 = (Float) kqi0VarM77651H5.getValue();
            float fFloatValue2 = f6 != null ? f6.floatValue() : f5;
            n05 n05VarM53286y = ((Boolean) kqi0Var.getValue()).booleanValue() ? jg31.m53286y(0.0f, 400.0f, null, 5) : jg31.m53284w();
            boolean zM91770i3 = xq00Var.m91770i(kqi0Var);
            Object objM91750T4 = xq00Var.m91750T();
            if (zM91770i3 || objM91750T4 == ia7Var) {
                objM91750T4 = new hek(kqi0Var, 29);
                xq00Var.m91793t0(objM91750T4);
            }
            rv41 rv41VarM79506b = sw4.m79506b(fFloatValue2, n05VarM53286y, null, (gh00) objM91750T4, xq00Var, 0, 12);
            xq00Var2 = xq00Var;
            if (((Boolean) kqi0Var.getValue()).booleanValue()) {
                fFloatValue = ((Number) rv41VarM79506b.getValue()).floatValue();
            } else {
                Float f7 = (Float) kqi0VarM77651H5.getValue();
                fFloatValue = f7 != null ? f7.floatValue() : f5;
            }
            boolean z4 = fFloatValue < ifsVar2.f101823j;
            wb9 wb9Var2 = d7f0.f46174i;
            fxh0 fxh0VarM97185e = zxc.m97185e(z4 ? 0.0f : 1.0f, mi21.m61834r(leu.m58816b(xq00Var2).f117232d.f137887c, phaVar.mo66945a(cxh0.f43038a, wb9Var)));
            boolean zM91760d = ((i7 & 896) == 256) | ((i7 & 7168) == 2048) | xq00Var2.m91760d(fFloatValue);
            Object objM91750T5 = xq00Var2.m91750T();
            if (zM91760d || objM91750T5 == ia7Var) {
                objM91750T5 = new ffs(f3, fFloatValue, f2, 0);
                xq00Var2.m91793t0(objM91750T5);
            }
            fxh0 fxh0VarM29069L = bga.m29069L(fxh0VarM97185e, (gh00) objM91750T5);
            boolean z5 = ((458752 & i7) == 131072) | ((3670016 & i7) == 1048576) | ((29360128 & i7) == 8388608);
            if ((1879048192 & i7) != 536870912) {
                if ((i7 & 1073741824) != 0) {
                    i4s0Var2 = i4s0Var;
                    if (xq00Var2.m91770i(i4s0Var2)) {
                    }
                    boolean z6 = z5 | z;
                    if ((234881024 & i7) == 67108864) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zM91770i = z6 | z2 | xq00Var2.m91770i(kqi0VarM77651H4);
                    objM91750T = xq00Var2.m91750T();
                    if (!zM91770i || objM91750T == ia7Var) {
                        str4 = str;
                        i5 = i7;
                        z3 = false;
                        i4s0 i4s0Var3 = i4s0Var2;
                        str5 = str2;
                        hj9 hj9Var = new hj9(str4, str5, str3, i4s0Var3, f4, kqi0VarM77651H4);
                        xq00Var2.m91793t0(hj9Var);
                        objM91750T = hj9Var;
                    } else {
                        str4 = str;
                        str5 = str2;
                        i5 = i7;
                        z3 = false;
                    }
                    fxh0 fxh0VarM96643a = zoz0.m96643a(fxh0VarM29069L, (gh00) objM91750T);
                    zM91770i2 = xq00Var2.m91770i(kqi0VarM77651H) | xq00Var2.m91770i(kqi0Var) | xq00Var2.m91770i(kqi0VarM77651H3) | xq00Var2.m91770i(kqi0VarM77651H2);
                    objM91750T2 = xq00Var2.m91750T();
                    if (zM91770i2 || objM91750T2 == ia7Var) {
                        objM91750T2 = new kvd(kqi0VarM77651H, kqi0Var, kqi0VarM77651H3, kqi0VarM77651H2, 1);
                        xq00Var2.m91793t0(objM91750T2);
                    }
                    fxh0 fxh0VarM69516a = pb61.m69516a(fxh0VarM96643a, w2a1.f247311a, (PointerInputEventHandler) objM91750T2);
                    m6d0VarM36007d = dha.m36007d(wb9Var2, z3);
                    iHashCode = Long.hashCode(xq00Var2.f264809T);
                    wpn0VarM91778m = xq00Var2.m91778m();
                    fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM69516a);
                    soh.f211194A.getClass();
                    c2087le = roh.f201257b;
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
                    zug1.m97024a((i5 >> 15) & 126, str4, str5, xq00Var2, null);
                    xq00Var2.m91788r(true);
                } else {
                    i4s0Var2 = i4s0Var;
                }
                z = false;
                boolean z7 = z5 | z;
                if ((234881024 & i7) == 67108864) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zM91770i = z7 | z2 | xq00Var2.m91770i(kqi0VarM77651H4);
                objM91750T = xq00Var2.m91750T();
                if (zM91770i) {
                    str4 = str;
                    i5 = i7;
                    z3 = false;
                    i4s0 i4s0Var4 = i4s0Var2;
                    str5 = str2;
                    hj9 hj9Var2 = new hj9(str4, str5, str3, i4s0Var4, f4, kqi0VarM77651H4);
                    xq00Var2.m91793t0(hj9Var2);
                    objM91750T = hj9Var2;
                } else {
                    str4 = str;
                    i5 = i7;
                    z3 = false;
                    i4s0 i4s0Var5 = i4s0Var2;
                    str5 = str2;
                    hj9 hj9Var3 = new hj9(str4, str5, str3, i4s0Var5, f4, kqi0VarM77651H4);
                    xq00Var2.m91793t0(hj9Var3);
                    objM91750T = hj9Var3;
                }
                fxh0 fxh0VarM96643a2 = zoz0.m96643a(fxh0VarM29069L, (gh00) objM91750T);
                zM91770i2 = xq00Var2.m91770i(kqi0VarM77651H) | xq00Var2.m91770i(kqi0Var) | xq00Var2.m91770i(kqi0VarM77651H3) | xq00Var2.m91770i(kqi0VarM77651H2);
                objM91750T2 = xq00Var2.m91750T();
                if (zM91770i2) {
                    objM91750T2 = new kvd(kqi0VarM77651H, kqi0Var, kqi0VarM77651H3, kqi0VarM77651H2, 1);
                    xq00Var2.m91793t0(objM91750T2);
                } else {
                    objM91750T2 = new kvd(kqi0VarM77651H, kqi0Var, kqi0VarM77651H3, kqi0VarM77651H2, 1);
                    xq00Var2.m91793t0(objM91750T2);
                }
                fxh0 fxh0VarM69516a2 = pb61.m69516a(fxh0VarM96643a2, w2a1.f247311a, (PointerInputEventHandler) objM91750T2);
                m6d0VarM36007d = dha.m36007d(wb9Var2, z3);
                iHashCode = Long.hashCode(xq00Var2.f264809T);
                wpn0VarM91778m = xq00Var2.m91778m();
                fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM69516a2);
                soh.f211194A.getClass();
                c2087le = roh.f201257b;
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
                zug1.m97024a((i5 >> 15) & 126, str4, str5, xq00Var2, null);
                xq00Var2.m91788r(true);
            } else {
                i4s0Var2 = i4s0Var;
            }
            z = true;
            boolean z8 = z5 | z;
            if ((234881024 & i7) == 67108864) {
                z2 = true;
            } else {
                z2 = false;
            }
            zM91770i = z8 | z2 | xq00Var2.m91770i(kqi0VarM77651H4);
            objM91750T = xq00Var2.m91750T();
            if (zM91770i) {
                str4 = str;
                i5 = i7;
                z3 = false;
                i4s0 i4s0Var6 = i4s0Var2;
                str5 = str2;
                hj9 hj9Var4 = new hj9(str4, str5, str3, i4s0Var6, f4, kqi0VarM77651H4);
                xq00Var2.m91793t0(hj9Var4);
                objM91750T = hj9Var4;
            } else {
                str4 = str;
                i5 = i7;
                z3 = false;
                i4s0 i4s0Var7 = i4s0Var2;
                str5 = str2;
                hj9 hj9Var5 = new hj9(str4, str5, str3, i4s0Var7, f4, kqi0VarM77651H4);
                xq00Var2.m91793t0(hj9Var5);
                objM91750T = hj9Var5;
            }
            fxh0 fxh0VarM96643a3 = zoz0.m96643a(fxh0VarM29069L, (gh00) objM91750T);
            zM91770i2 = xq00Var2.m91770i(kqi0VarM77651H) | xq00Var2.m91770i(kqi0Var) | xq00Var2.m91770i(kqi0VarM77651H3) | xq00Var2.m91770i(kqi0VarM77651H2);
            objM91750T2 = xq00Var2.m91750T();
            if (zM91770i2) {
                objM91750T2 = new kvd(kqi0VarM77651H, kqi0Var, kqi0VarM77651H3, kqi0VarM77651H2, 1);
                xq00Var2.m91793t0(objM91750T2);
            } else {
                objM91750T2 = new kvd(kqi0VarM77651H, kqi0Var, kqi0VarM77651H3, kqi0VarM77651H2, 1);
                xq00Var2.m91793t0(objM91750T2);
            }
            fxh0 fxh0VarM69516a3 = pb61.m69516a(fxh0VarM96643a3, w2a1.f247311a, (PointerInputEventHandler) objM91750T2);
            m6d0VarM36007d = dha.m36007d(wb9Var2, z3);
            iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0VarM91778m = xq00Var2.m91778m();
            fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM69516a3);
            soh.f211194A.getClass();
            c2087le = roh.f201257b;
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
            zug1.m97024a((i5 >> 15) & 126, str4, str5, xq00Var2, null);
            xq00Var2.m91788r(true);
        } else {
            str4 = str;
            xq00Var2 = xq00Var;
            str5 = str2;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new gfs(f, f2, f3, wb9Var, str4, str5, str3, f4, i4s0Var, gh00Var, eh00Var, gh00Var2, eh00Var2, ifsVar, i, i2);
        }
    }
}
