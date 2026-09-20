package p204p;

import androidx.compose.material.AnchoredDragFinishedSignal;
import com.comscore.streaming.ContentType;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRefCount;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes8.dex */
public abstract class hxh {

    /* JADX INFO: renamed from: a */
    public static final C2617yl f96228a = new C2617yl("RESUME_TOKEN", 8);

    /* JADX INFO: renamed from: b */
    public static sd40 f96229b;

    /* JADX WARN: Code duplicated, block: B:175:0x0297  */
    /* JADX WARN: Code duplicated, block: B:176:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:178:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:180:0x0301  */
    /* JADX WARN: Code duplicated, block: B:183:0x032e  */
    /* JADX WARN: Code duplicated, block: B:184:0x0330  */
    /* JADX WARN: Code duplicated, block: B:187:0x0341  */
    /* JADX WARN: Code duplicated, block: B:188:0x0343  */
    /* JADX WARN: Code duplicated, block: B:197:0x0359  */
    /* JADX WARN: Code duplicated, block: B:200:0x0365  */
    /* JADX WARN: Code duplicated, block: B:201:0x0367  */
    /* JADX WARN: Code duplicated, block: B:204:0x036f  */
    /* JADX WARN: Code duplicated, block: B:205:0x0371  */
    /* JADX WARN: Code duplicated, block: B:208:0x037e  */
    /* JADX WARN: Code duplicated, block: B:211:0x0384  */
    /* JADX WARN: Code duplicated, block: B:212:0x0396  */
    /* JADX WARN: Code duplicated, block: B:216:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:219:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:220:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:223:0x03da A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:224:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:227:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:233:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:236:0x0401  */
    /* JADX WARN: Code duplicated, block: B:237:0x0403  */
    /* JADX WARN: Code duplicated, block: B:240:0x040b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:243:0x0411  */
    /* JADX WARN: Code duplicated, block: B:245:0x044a  */
    /* JADX WARN: Code duplicated, block: B:247:0x0468  */
    /* JADX WARN: Code duplicated, block: B:250:0x047a  */
    /* JADX WARN: Code duplicated, block: B:253:0x0486  */
    /* JADX WARN: Code duplicated, block: B:256:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:257:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:260:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:261:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:270:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:273:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:274:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:277:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:278:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:281:0x0505  */
    /* JADX WARN: Code duplicated, block: B:282:0x0507  */
    /* JADX WARN: Code duplicated, block: B:286:0x0511  */
    /* JADX WARN: Code duplicated, block: B:291:0x0544  */
    /* JADX WARN: Code duplicated, block: B:292:0x0546  */
    /* JADX WARN: Code duplicated, block: B:295:0x0552  */
    /* JADX WARN: Code duplicated, block: B:296:0x0554  */
    /* JADX WARN: Code duplicated, block: B:305:0x0565  */
    /* JADX WARN: Code duplicated, block: B:308:0x056f  */
    /* JADX WARN: Code duplicated, block: B:309:0x0571  */
    /* JADX WARN: Code duplicated, block: B:312:0x0579  */
    /* JADX WARN: Code duplicated, block: B:314:0x057d  */
    /* JADX WARN: Code duplicated, block: B:315:0x0580  */
    /* JADX WARN: Code duplicated, block: B:316:0x0586 A[PHI: r18
      0x0586: PHI (r18v5 p.ia7) = (r12v8 p.ia7), (r18v8 p.ia7) binds: [B:311:0x0577, B:314:0x057d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:319:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:320:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:326:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:336:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:338:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:339:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:342:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:343:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:346:0x0608  */
    /* JADX WARN: Code duplicated, block: B:347:0x060a  */
    /* JADX WARN: Code duplicated, block: B:351:0x0619  */
    /* JADX INFO: renamed from: a */
    public static final void m49014a(g9t g9tVar, nx4 nx4Var, long j, float f, float f2, float f3, float f4, sb91 sb91Var, fxh0 fxh0Var, boolean z, boolean z2, boolean z3, th00 th00Var, qf40 qf40Var, boolean z4, c9m c9mVar, xq00 xq00Var, int i, int i2) {
        int i3;
        int i4;
        fxh0 fxh0Var2;
        boolean z5;
        float f5;
        float f6;
        xq00 xq00Var2;
        jc20 jc20Var;
        int i5;
        ia7 ia7Var;
        int i6;
        Object objM91750T;
        Set set;
        Object objM91750T2;
        uum0 uum0Var;
        Object objM91750T3;
        uum0 uum0Var2;
        int i7;
        boolean z6;
        boolean z7;
        int i8;
        boolean z8;
        int i9;
        boolean z9;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        jc20 jc20Var2;
        uum0 uum0Var3;
        Object umkVar;
        int i11;
        int i12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i13;
        boolean z16;
        boolean z17;
        Object objM91750T4;
        ia7 ia7Var2;
        boolean z18;
        boolean zM91762e;
        Object smkVar;
        uum0 uum0Var4;
        ia7 ia7Var3;
        Set set2;
        uum0 uum0Var5;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean zM91770i;
        Object objM91750T5;
        jc20 jc20Var3;
        boolean z23;
        Object objM91750T6;
        uum0 uum0Var6;
        ia7 ia7Var4;
        int i14;
        boolean z24;
        boolean z25;
        int i15;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean zM91770i2;
        Object objM91750T7;
        ia7 ia7Var5;
        ia7 ia7Var6;
        int i16;
        jc20 jc20Var4;
        int i17;
        g9t g9tVar2;
        Object tmkVar;
        Object objM91750T8;
        boolean z29;
        boolean zM91762e2;
        Object objM91750T9;
        boolean z30;
        boolean z31;
        boolean z32;
        Object objM91750T10;
        nx4 nx4Var2 = nx4Var;
        boolean z33 = z;
        boolean z34 = z2;
        th00 th00Var2 = th00Var;
        xq00 xq00Var3 = xq00Var;
        ia7 ia7Var7 = t6x0.f217647t;
        xq00Var3.m91775k0(-1782966753);
        if ((i & 6) == 0) {
            i3 = (xq00Var3.m91766g(g9tVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? xq00Var3.m91766g(nx4Var2) : xq00Var3.m91770i(nx4Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= xq00Var3.m91764f(j) ? 256 : 128;
        }
        int i18 = i3;
        if ((i & 3072) == 0) {
            i18 |= xq00Var3.m91760d(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i18 |= xq00Var3.m91760d(f2) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i18 |= xq00Var3.m91760d(f3) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i18 |= xq00Var3.m91760d(f4) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i18 |= xq00Var3.m91766g(sb91Var) ? 8388608 : 4194304;
        }
        int i19 = i18 | 100663296;
        if ((i & 805306368) == 0) {
            i19 |= xq00Var3.m91768h(z33) ? 536870912 : 268435456;
        }
        int i20 = i19;
        if ((i2 & 6) == 0) {
            i4 = i2 | (xq00Var3.m91768h(z34) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= xq00Var3.m91768h(z3) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= xq00Var3.m91770i(th00Var2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= xq00Var3.m91766g(qf40Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= xq00Var3.m91768h(z4) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= xq00Var3.m91762e(c9mVar == null ? -1 : c9mVar.ordinal()) ? 131072 : 65536;
        }
        int i21 = i4;
        if (xq00Var3.m91752Y(i20 & 1, ((i20 & 306783379) == 306783378 && (i21 & 74899) == 74898) ? false : true)) {
            jc20 jc20Var5 = (jc20) xq00Var3.m91774k(wsh.f254621l);
            float f7 = sb91Var.f207390c;
            float f8 = sb91Var.f207391d;
            float f9 = f7 * f8;
            float f10 = sb91Var.f207389b * f8;
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
            int iHashCode = Long.hashCode(xq00Var3.f264809T);
            wpn0 wpn0VarM91778m = xq00Var3.m91778m();
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var3, cxh0Var);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var3.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var3.m91779m0();
            if (xq00Var3.f264808S) {
                xq00Var3.m91776l(c2087le);
            } else {
                xq00Var3.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var3);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var3);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var3);
            zsf1.m96833D(roh.f201266k, xq00Var3);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var3);
            xq00Var3.m91771i0(739109033);
            Iterator it = g9tVar.f77870a.iterator();
            int i22 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i23 = i22 + 1;
                if (i22 < 0) {
                    h6f.m46722S();
                    throw null;
                }
                rp3 rp3Var = (rp3) next;
                xq00Var3.m91765f0(639122617, Integer.valueOf(i22));
                yq3 yq3Var = rp3Var.f201409b;
                boolean z35 = yq3Var == yq3.f275128a || yq3Var == yq3.f275130c;
                if (!z35 || z33) {
                    z5 = false;
                    if (z35 || z34) {
                        if (rp3Var.m76096b()) {
                            f5 = 0.4f * f;
                        } else {
                            if (z35) {
                                f6 = f;
                            } else {
                                gw4 gw4Var = nx4Var2.f159355a;
                                float f11 = 1.0f;
                                if (nx4Var2.f159358d.getValue() == null && ((Number) gw4Var.m45912e()).floatValue() < 1.0f && nx4Var2.m65816b()) {
                                    float fFloatValue = ((Number) gw4Var.m45912e()).floatValue();
                                    if (fFloatValue < 0.2f) {
                                        f11 = 1.0f - (fFloatValue / 0.2f);
                                    } else {
                                        f11 = fFloatValue > 0.8f ? (fFloatValue - 0.8f) / 0.2f : 0.0f;
                                    }
                                }
                                f5 = f * f11;
                            }
                            if (rp3Var.m76096b()) {
                                xq00Var3.m91771i0(-1661198165);
                                long jM49020g = m49020g(f9, f2, f3, 16.0f, rp3Var.f201408a);
                                psh.m70857a(f6, 0.0f, ((i20 >> 6) & 14) | 384, 48, j, 0L, xq00Var, mi21.m61834r(16.0f, bga.m29070M(cxh0Var, acs.m25482a(jM49020g), acs.m25483b(jM49020g))));
                                z23 = false;
                                xq00Var.m91788r(false);
                                jc20Var3 = jc20Var5;
                                ia7Var3 = ia7Var7;
                                cxh0Var = cxh0Var;
                                xq00Var3 = xq00Var;
                                it = it;
                                f10 = f10;
                            } else {
                                xq00Var2 = xq00Var3;
                                if (z35) {
                                    xq00Var2.m91771i0(-1660358530);
                                    objM91750T6 = xq00Var2.m91750T();
                                    if (objM91750T6 == ia7Var7) {
                                        objM91750T6 = a831.m25015g(Float.NaN, xq00Var2);
                                    }
                                    uum0Var6 = (uum0) objM91750T6;
                                    ia7Var4 = ia7Var7;
                                    long jM49020g2 = m49020g(f9, f2, f3, 44.0f, rp3Var.f201408a);
                                    fxh0 fxh0VarM61834r = mi21.m61834r(44.0f, bga.m29070M(cxh0Var, acs.m25482a(jM49020g2), acs.m25483b(jM49020g2)));
                                    i14 = i20 & 14;
                                    if (i14 == 4) {
                                        z24 = true;
                                    } else {
                                        z24 = false;
                                    }
                                    boolean zM91762e3 = z24 | xq00Var2.m91762e(i22) | xq00Var2.m91760d(f10);
                                    if ((i20 & 3670016) == 1048576) {
                                        z25 = true;
                                    } else {
                                        z25 = false;
                                    }
                                    boolean z36 = z25 | zM91762e3;
                                    i15 = i20 & ContentType.LONG_FORM_ON_DEMAND;
                                    if (i15 != 32 || ((i20 & 64) != 0 && xq00Var2.m91770i(nx4Var2))) {
                                        z26 = true;
                                    } else {
                                        z26 = false;
                                    }
                                    boolean z37 = z36 | z26;
                                    if ((i21 & 57344) == 16384) {
                                        z27 = true;
                                    } else {
                                        z27 = false;
                                    }
                                    boolean z38 = z27 | z37;
                                    if ((i21 & 458752) == 131072) {
                                        z28 = true;
                                    } else {
                                        z28 = false;
                                    }
                                    zM91770i2 = z38 | z28 | xq00Var2.m91770i(jc20Var5);
                                    objM91750T7 = xq00Var2.m91750T();
                                    if (zM91770i2) {
                                        ia7Var5 = ia7Var4;
                                    } else {
                                        ia7Var5 = ia7Var4;
                                        if (objM91750T7 == ia7Var5) {
                                            i16 = 4;
                                            jc20Var4 = jc20Var5;
                                            ia7Var6 = ia7Var5;
                                            tmkVar = objM91750T7;
                                            i17 = i22;
                                            g9tVar2 = g9tVar;
                                        }
                                        gh00 gh00Var = (gh00) tmkVar;
                                        objM91750T8 = xq00Var2.m91750T();
                                        if (objM91750T8 == ia7Var6) {
                                            objM91750T8 = bpj.f29500Z;
                                            xq00Var2.m91793t0(objM91750T8);
                                        }
                                        eh00 eh00Var = (eh00) objM91750T8;
                                        if (i14 == i16) {
                                            z29 = true;
                                        } else {
                                            z29 = false;
                                        }
                                        zM91762e2 = z29 | xq00Var2.m91762e(i17);
                                        objM91750T9 = xq00Var2.m91750T();
                                        if (zM91762e2 || objM91750T9 == ia7Var6) {
                                            objM91750T9 = new gs1(g9tVar2, i17, uum0Var6, 6);
                                            xq00Var2.m91793t0(objM91750T9);
                                        }
                                        eh00 eh00Var2 = (eh00) objM91750T9;
                                        if (i15 != 32 || ((i20 & 64) != 0 && xq00Var2.m91770i(nx4Var2))) {
                                            z30 = true;
                                        } else {
                                            z30 = false;
                                        }
                                        if ((i21 & 896) == 256) {
                                            z31 = true;
                                        } else {
                                            z31 = false;
                                        }
                                        z32 = z30 | z31;
                                        objM91750T10 = xq00Var2.m91750T();
                                        if (z32 || objM91750T10 == ia7Var6) {
                                            objM91750T10 = new z9b(uum0Var6, nx4Var2, th00Var, 29);
                                            xq00Var2.m91793t0(objM91750T10);
                                        }
                                        psh.m70858b(j, f6, gh00Var, fxh0VarM61834r, 0.0f, eh00Var, eh00Var2, (eh00) objM91750T10, xq00Var2, ((i20 >> 6) & 14) | 1573248);
                                        z23 = false;
                                        xq00Var2.m91788r(false);
                                        f10 = f10;
                                        jc20Var3 = jc20Var4;
                                        i21 = i21;
                                        xq00Var3 = xq00Var2;
                                        ia7Var3 = ia7Var6;
                                    }
                                    jc20 jc20Var6 = jc20Var5;
                                    i17 = i22;
                                    i16 = 4;
                                    ia7Var6 = ia7Var5;
                                    g9tVar2 = g9tVar;
                                    tmkVar = new tmk(g9tVar2, i17, f10, f4, nx4Var2, z4, c9mVar, uum0Var6, jc20Var6);
                                    jc20Var4 = jc20Var6;
                                    xq00Var2.m91793t0(tmkVar);
                                    gh00 gh00Var2 = (gh00) tmkVar;
                                    objM91750T8 = xq00Var2.m91750T();
                                    if (objM91750T8 == ia7Var6) {
                                        objM91750T8 = bpj.f29500Z;
                                        xq00Var2.m91793t0(objM91750T8);
                                    }
                                    eh00 eh00Var3 = (eh00) objM91750T8;
                                    if (i14 == i16) {
                                        z29 = true;
                                    } else {
                                        z29 = false;
                                    }
                                    zM91762e2 = z29 | xq00Var2.m91762e(i17);
                                    objM91750T9 = xq00Var2.m91750T();
                                    if (zM91762e2) {
                                        objM91750T9 = new gs1(g9tVar2, i17, uum0Var6, 6);
                                        xq00Var2.m91793t0(objM91750T9);
                                    } else {
                                        objM91750T9 = new gs1(g9tVar2, i17, uum0Var6, 6);
                                        xq00Var2.m91793t0(objM91750T9);
                                    }
                                    eh00 eh00Var4 = (eh00) objM91750T9;
                                    if (i15 != 32) {
                                        z30 = true;
                                    } else {
                                        z30 = true;
                                    }
                                    if ((i21 & 896) == 256) {
                                        z31 = true;
                                    } else {
                                        z31 = false;
                                    }
                                    z32 = z30 | z31;
                                    objM91750T10 = xq00Var2.m91750T();
                                    if (z32) {
                                        objM91750T10 = new z9b(uum0Var6, nx4Var2, th00Var, 29);
                                        xq00Var2.m91793t0(objM91750T10);
                                    } else {
                                        objM91750T10 = new z9b(uum0Var6, nx4Var2, th00Var, 29);
                                        xq00Var2.m91793t0(objM91750T10);
                                    }
                                    psh.m70858b(j, f6, gh00Var2, fxh0VarM61834r, 0.0f, eh00Var3, eh00Var4, (eh00) objM91750T10, xq00Var2, ((i20 >> 6) & 14) | 1573248);
                                    z23 = false;
                                    xq00Var2.m91788r(false);
                                    f10 = f10;
                                    jc20Var3 = jc20Var4;
                                    i21 = i21;
                                    xq00Var3 = xq00Var2;
                                    ia7Var3 = ia7Var6;
                                } else {
                                    jc20Var = jc20Var5;
                                    cxh0 cxh0Var2 = cxh0Var;
                                    it = it;
                                    i5 = i21;
                                    ia7Var = ia7Var7;
                                    i6 = i22;
                                    xq00Var2.m91771i0(-1657816158);
                                    objM91750T = xq00Var2.m91750T();
                                    if (objM91750T == ia7Var) {
                                        objM91750T = new LinkedHashSet();
                                        xq00Var2.m91793t0(objM91750T);
                                    }
                                    set = (Set) objM91750T;
                                    objM91750T2 = xq00Var2.m91750T();
                                    if (objM91750T2 == ia7Var) {
                                        objM91750T2 = a831.m25015g(Float.NaN, xq00Var2);
                                    }
                                    uum0Var = (uum0) objM91750T2;
                                    objM91750T3 = xq00Var2.m91750T();
                                    if (objM91750T3 == ia7Var) {
                                        objM91750T3 = a831.m25015g(Float.NaN, xq00Var2);
                                    }
                                    uum0Var2 = (uum0) objM91750T3;
                                    long jM49020g3 = m49020g(f9, f2, f3, 44.0f, rp3Var.f201408a);
                                    cxh0Var = cxh0Var2;
                                    fxh0 fxh0VarM61834r2 = mi21.m61834r(44.0f, bga.m29070M(cxh0Var, acs.m25482a(jM49020g3), acs.m25483b(jM49020g3)));
                                    i7 = i20 & 14;
                                    if (i7 == 4) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    boolean zM91762e4 = z6 | xq00Var2.m91762e(i6) | xq00Var2.m91760d(f10);
                                    if ((i20 & 3670016) == 1048576) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    boolean z39 = zM91762e4 | z7;
                                    i8 = i20 & ContentType.LONG_FORM_ON_DEMAND;
                                    if (i8 != 32 || ((i20 & 64) != 0 && xq00Var2.m91770i(nx4Var2))) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    boolean z40 = z39 | z8;
                                    i9 = i5 & 57344;
                                    if (i9 == 16384) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    boolean z41 = z40 | z9;
                                    i10 = i5 & 7168;
                                    if (i10 == 2048) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    boolean zM91770i3 = z41 | z10 | xq00Var2.m91770i(jc20Var);
                                    if ((i5 & 458752) == 131072) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    z12 = zM91770i3 | z11;
                                    Object objM91750T11 = xq00Var2.m91750T();
                                    if (!z12 || objM91750T11 == ia7Var) {
                                        jc20Var2 = jc20Var;
                                        uum0Var3 = uum0Var;
                                        i11 = i8;
                                        i12 = 4;
                                        umkVar = new umk(g9tVar, i6, f10, f4, nx4Var2, z4, qf40Var, uum0Var3, jc20Var2, c9mVar, uum0Var2);
                                        xq00Var2.m91793t0(umkVar);
                                    } else {
                                        i11 = i8;
                                        i12 = 4;
                                        jc20Var2 = jc20Var;
                                        uum0Var3 = uum0Var;
                                        umkVar = objM91750T11;
                                    }
                                    gh00 gh00Var3 = (gh00) umkVar;
                                    if (i7 == i12) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    boolean zM91762e5 = xq00Var2.m91762e(i6) | z13;
                                    if ((i5 & ContentType.LONG_FORM_ON_DEMAND) == 32) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    boolean z42 = zM91762e5 | z14;
                                    if (i11 != 32 || ((i20 & 64) != 0 && xq00Var2.m91770i(nx4Var2))) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    boolean z43 = z42 | z15;
                                    i21 = i5;
                                    i13 = i21 & 896;
                                    if (i13 == 256) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    z17 = z43 | z16;
                                    objM91750T4 = xq00Var2.m91750T();
                                    if (z17) {
                                        ia7Var2 = ia7Var;
                                        vmk vmkVar = new vmk(g9tVar, i6, z3, nx4Var2, th00Var);
                                        xq00Var2.m91793t0(vmkVar);
                                        objM91750T4 = vmkVar;
                                    } else if (objM91750T4 == ia7Var) {
                                        ia7Var = ia7Var;
                                        ia7Var2 = ia7Var;
                                        vmk vmkVar2 = new vmk(g9tVar, i6, z3, nx4Var2, th00Var);
                                        xq00Var2.m91793t0(vmkVar2);
                                        objM91750T4 = vmkVar2;
                                    } else {
                                        ia7Var2 = ia7Var;
                                    }
                                    eh00 eh00Var5 = (eh00) objM91750T4;
                                    if (i7 == i12) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                    zM91762e = xq00Var2.m91762e(i6) | z18;
                                    Object objM91750T12 = xq00Var2.m91750T();
                                    if (!zM91762e || objM91750T12 == ia7Var2) {
                                        uum0Var4 = uum0Var2;
                                        ia7Var3 = ia7Var2;
                                        uum0 uum0Var7 = uum0Var3;
                                        set2 = set;
                                        smkVar = new smk(g9tVar, i6, set2, uum0Var7, uum0Var4, 0);
                                        uum0Var5 = uum0Var7;
                                        xq00Var2.m91793t0(smkVar);
                                    } else {
                                        uum0Var4 = uum0Var2;
                                        smkVar = objM91750T12;
                                        ia7Var3 = ia7Var2;
                                        uum0Var5 = uum0Var3;
                                        set2 = set;
                                    }
                                    eh00 eh00Var6 = (eh00) smkVar;
                                    if (i11 != 32 || ((i20 & 64) != 0 && xq00Var2.m91770i(nx4Var))) {
                                        z19 = true;
                                    } else {
                                        z19 = false;
                                    }
                                    if (i10 == 2048) {
                                        z20 = true;
                                    } else {
                                        z20 = false;
                                    }
                                    boolean z44 = z19 | z20;
                                    if (i13 == 256) {
                                        z21 = true;
                                    } else {
                                        z21 = false;
                                    }
                                    boolean zM91762e6 = z44 | z21 | xq00Var2.m91762e(i6);
                                    if (i9 == 16384) {
                                        z22 = true;
                                    } else {
                                        z22 = false;
                                    }
                                    zM91770i = zM91762e6 | z22 | xq00Var2.m91770i(jc20Var2);
                                    objM91750T5 = xq00Var2.m91750T();
                                    if (!zM91770i || objM91750T5 == ia7Var3) {
                                        jc20 jc20Var7 = jc20Var2;
                                        mga mgaVar = new mga(uum0Var5, uum0Var4, nx4Var, qf40Var, th00Var, i6, z4, jc20Var7, set2);
                                        jc20Var3 = jc20Var7;
                                        xq00Var2.m91793t0(mgaVar);
                                        objM91750T5 = mgaVar;
                                    } else {
                                        jc20Var3 = jc20Var2;
                                    }
                                    xq00Var3 = xq00Var2;
                                    psh.m70858b(j, f6, gh00Var3, fxh0VarM61834r2, 0.0f, eh00Var5, eh00Var6, (eh00) objM91750T5, xq00Var3, ((i20 >> 6) & 14) | 384);
                                    z23 = false;
                                    xq00Var3.m91788r(false);
                                }
                            }
                            xq00Var3.m91788r(z23);
                        }
                        f6 = f5;
                        if (rp3Var.m76096b()) {
                            xq00Var3.m91771i0(-1661198165);
                            long jM49020g4 = m49020g(f9, f2, f3, 16.0f, rp3Var.f201408a);
                            psh.m70857a(f6, 0.0f, ((i20 >> 6) & 14) | 384, 48, j, 0L, xq00Var, mi21.m61834r(16.0f, bga.m29070M(cxh0Var, acs.m25482a(jM49020g4), acs.m25483b(jM49020g4))));
                            z23 = false;
                            xq00Var.m91788r(false);
                            jc20Var3 = jc20Var5;
                            ia7Var3 = ia7Var7;
                            cxh0Var = cxh0Var;
                            xq00Var3 = xq00Var;
                            it = it;
                            f10 = f10;
                        } else {
                            xq00Var2 = xq00Var3;
                            if (z35) {
                                xq00Var2.m91771i0(-1660358530);
                                objM91750T6 = xq00Var2.m91750T();
                                if (objM91750T6 == ia7Var7) {
                                    objM91750T6 = a831.m25015g(Float.NaN, xq00Var2);
                                }
                                uum0Var6 = (uum0) objM91750T6;
                                ia7Var4 = ia7Var7;
                                long jM49020g5 = m49020g(f9, f2, f3, 44.0f, rp3Var.f201408a);
                                fxh0 fxh0VarM61834r3 = mi21.m61834r(44.0f, bga.m29070M(cxh0Var, acs.m25482a(jM49020g5), acs.m25483b(jM49020g5)));
                                i14 = i20 & 14;
                                if (i14 == 4) {
                                    z24 = true;
                                } else {
                                    z24 = false;
                                }
                                boolean zM91762e7 = z24 | xq00Var2.m91762e(i22) | xq00Var2.m91760d(f10);
                                if ((i20 & 3670016) == 1048576) {
                                    z25 = true;
                                } else {
                                    z25 = false;
                                }
                                boolean z310 = z25 | zM91762e7;
                                i15 = i20 & ContentType.LONG_FORM_ON_DEMAND;
                                if (i15 != 32) {
                                    z26 = true;
                                } else {
                                    z26 = true;
                                }
                                boolean z311 = z310 | z26;
                                if ((i21 & 57344) == 16384) {
                                    z27 = true;
                                } else {
                                    z27 = false;
                                }
                                boolean z312 = z27 | z311;
                                if ((i21 & 458752) == 131072) {
                                    z28 = true;
                                } else {
                                    z28 = false;
                                }
                                zM91770i2 = z312 | z28 | xq00Var2.m91770i(jc20Var5);
                                objM91750T7 = xq00Var2.m91750T();
                                if (zM91770i2) {
                                    ia7Var5 = ia7Var4;
                                    if (objM91750T7 == ia7Var5) {
                                        i16 = 4;
                                        jc20Var4 = jc20Var5;
                                        ia7Var6 = ia7Var5;
                                        tmkVar = objM91750T7;
                                        i17 = i22;
                                        g9tVar2 = g9tVar;
                                    }
                                    gh00 gh00Var4 = (gh00) tmkVar;
                                    objM91750T8 = xq00Var2.m91750T();
                                    if (objM91750T8 == ia7Var6) {
                                        objM91750T8 = bpj.f29500Z;
                                        xq00Var2.m91793t0(objM91750T8);
                                    }
                                    eh00 eh00Var7 = (eh00) objM91750T8;
                                    if (i14 == i16) {
                                        z29 = true;
                                    } else {
                                        z29 = false;
                                    }
                                    zM91762e2 = z29 | xq00Var2.m91762e(i17);
                                    objM91750T9 = xq00Var2.m91750T();
                                    if (zM91762e2) {
                                        objM91750T9 = new gs1(g9tVar2, i17, uum0Var6, 6);
                                        xq00Var2.m91793t0(objM91750T9);
                                    } else {
                                        objM91750T9 = new gs1(g9tVar2, i17, uum0Var6, 6);
                                        xq00Var2.m91793t0(objM91750T9);
                                    }
                                    eh00 eh00Var8 = (eh00) objM91750T9;
                                    if (i15 != 32) {
                                        z30 = true;
                                    } else {
                                        z30 = true;
                                    }
                                    if ((i21 & 896) == 256) {
                                        z31 = true;
                                    } else {
                                        z31 = false;
                                    }
                                    z32 = z30 | z31;
                                    objM91750T10 = xq00Var2.m91750T();
                                    if (z32) {
                                        objM91750T10 = new z9b(uum0Var6, nx4Var2, th00Var, 29);
                                        xq00Var2.m91793t0(objM91750T10);
                                    } else {
                                        objM91750T10 = new z9b(uum0Var6, nx4Var2, th00Var, 29);
                                        xq00Var2.m91793t0(objM91750T10);
                                    }
                                    psh.m70858b(j, f6, gh00Var4, fxh0VarM61834r3, 0.0f, eh00Var7, eh00Var8, (eh00) objM91750T10, xq00Var2, ((i20 >> 6) & 14) | 1573248);
                                    z23 = false;
                                    xq00Var2.m91788r(false);
                                    f10 = f10;
                                    jc20Var3 = jc20Var4;
                                    i21 = i21;
                                    xq00Var3 = xq00Var2;
                                    ia7Var3 = ia7Var6;
                                } else {
                                    ia7Var5 = ia7Var4;
                                }
                                jc20 jc20Var8 = jc20Var5;
                                i17 = i22;
                                i16 = 4;
                                ia7Var6 = ia7Var5;
                                g9tVar2 = g9tVar;
                                tmkVar = new tmk(g9tVar2, i17, f10, f4, nx4Var2, z4, c9mVar, uum0Var6, jc20Var8);
                                jc20Var4 = jc20Var8;
                                xq00Var2.m91793t0(tmkVar);
                                gh00 gh00Var5 = (gh00) tmkVar;
                                objM91750T8 = xq00Var2.m91750T();
                                if (objM91750T8 == ia7Var6) {
                                    objM91750T8 = bpj.f29500Z;
                                    xq00Var2.m91793t0(objM91750T8);
                                }
                                eh00 eh00Var9 = (eh00) objM91750T8;
                                if (i14 == i16) {
                                    z29 = true;
                                } else {
                                    z29 = false;
                                }
                                zM91762e2 = z29 | xq00Var2.m91762e(i17);
                                objM91750T9 = xq00Var2.m91750T();
                                if (zM91762e2) {
                                    objM91750T9 = new gs1(g9tVar2, i17, uum0Var6, 6);
                                    xq00Var2.m91793t0(objM91750T9);
                                } else {
                                    objM91750T9 = new gs1(g9tVar2, i17, uum0Var6, 6);
                                    xq00Var2.m91793t0(objM91750T9);
                                }
                                eh00 eh00Var10 = (eh00) objM91750T9;
                                if (i15 != 32) {
                                    z30 = true;
                                } else {
                                    z30 = true;
                                }
                                if ((i21 & 896) == 256) {
                                    z31 = true;
                                } else {
                                    z31 = false;
                                }
                                z32 = z30 | z31;
                                objM91750T10 = xq00Var2.m91750T();
                                if (z32) {
                                    objM91750T10 = new z9b(uum0Var6, nx4Var2, th00Var, 29);
                                    xq00Var2.m91793t0(objM91750T10);
                                } else {
                                    objM91750T10 = new z9b(uum0Var6, nx4Var2, th00Var, 29);
                                    xq00Var2.m91793t0(objM91750T10);
                                }
                                psh.m70858b(j, f6, gh00Var5, fxh0VarM61834r3, 0.0f, eh00Var9, eh00Var10, (eh00) objM91750T10, xq00Var2, ((i20 >> 6) & 14) | 1573248);
                                z23 = false;
                                xq00Var2.m91788r(false);
                                f10 = f10;
                                jc20Var3 = jc20Var4;
                                i21 = i21;
                                xq00Var3 = xq00Var2;
                                ia7Var3 = ia7Var6;
                            } else {
                                jc20Var = jc20Var5;
                                cxh0 cxh0Var3 = cxh0Var;
                                it = it;
                                i5 = i21;
                                ia7Var = ia7Var7;
                                i6 = i22;
                                xq00Var2.m91771i0(-1657816158);
                                objM91750T = xq00Var2.m91750T();
                                if (objM91750T == ia7Var) {
                                    objM91750T = new LinkedHashSet();
                                    xq00Var2.m91793t0(objM91750T);
                                }
                                set = (Set) objM91750T;
                                objM91750T2 = xq00Var2.m91750T();
                                if (objM91750T2 == ia7Var) {
                                    objM91750T2 = a831.m25015g(Float.NaN, xq00Var2);
                                }
                                uum0Var = (uum0) objM91750T2;
                                objM91750T3 = xq00Var2.m91750T();
                                if (objM91750T3 == ia7Var) {
                                    objM91750T3 = a831.m25015g(Float.NaN, xq00Var2);
                                }
                                uum0Var2 = (uum0) objM91750T3;
                                long jM49020g6 = m49020g(f9, f2, f3, 44.0f, rp3Var.f201408a);
                                cxh0Var = cxh0Var3;
                                fxh0 fxh0VarM61834r4 = mi21.m61834r(44.0f, bga.m29070M(cxh0Var, acs.m25482a(jM49020g6), acs.m25483b(jM49020g6)));
                                i7 = i20 & 14;
                                if (i7 == 4) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                boolean zM91762e8 = z6 | xq00Var2.m91762e(i6) | xq00Var2.m91760d(f10);
                                if ((i20 & 3670016) == 1048576) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                boolean z313 = zM91762e8 | z7;
                                i8 = i20 & ContentType.LONG_FORM_ON_DEMAND;
                                if (i8 != 32) {
                                    z8 = true;
                                } else {
                                    z8 = true;
                                }
                                boolean z45 = z313 | z8;
                                i9 = i5 & 57344;
                                if (i9 == 16384) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                boolean z46 = z45 | z9;
                                i10 = i5 & 7168;
                                if (i10 == 2048) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                boolean zM91770i4 = z46 | z10 | xq00Var2.m91770i(jc20Var);
                                if ((i5 & 458752) == 131072) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                z12 = zM91770i4 | z11;
                                Object objM91750T13 = xq00Var2.m91750T();
                                if (z12) {
                                    jc20Var2 = jc20Var;
                                    uum0Var3 = uum0Var;
                                    i11 = i8;
                                    i12 = 4;
                                    umkVar = new umk(g9tVar, i6, f10, f4, nx4Var2, z4, qf40Var, uum0Var3, jc20Var2, c9mVar, uum0Var2);
                                    xq00Var2.m91793t0(umkVar);
                                } else {
                                    jc20Var2 = jc20Var;
                                    uum0Var3 = uum0Var;
                                    i11 = i8;
                                    i12 = 4;
                                    umkVar = new umk(g9tVar, i6, f10, f4, nx4Var2, z4, qf40Var, uum0Var3, jc20Var2, c9mVar, uum0Var2);
                                    xq00Var2.m91793t0(umkVar);
                                }
                                gh00 gh00Var6 = (gh00) umkVar;
                                if (i7 == i12) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                boolean zM91762e9 = xq00Var2.m91762e(i6) | z13;
                                if ((i5 & ContentType.LONG_FORM_ON_DEMAND) == 32) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                boolean z47 = zM91762e9 | z14;
                                if (i11 != 32) {
                                    z15 = true;
                                } else {
                                    z15 = true;
                                }
                                boolean z48 = z47 | z15;
                                i21 = i5;
                                i13 = i21 & 896;
                                if (i13 == 256) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                z17 = z48 | z16;
                                objM91750T4 = xq00Var2.m91750T();
                                if (z17) {
                                    ia7Var2 = ia7Var;
                                    vmk vmkVar3 = new vmk(g9tVar, i6, z3, nx4Var2, th00Var);
                                    xq00Var2.m91793t0(vmkVar3);
                                    objM91750T4 = vmkVar3;
                                } else if (objM91750T4 == ia7Var) {
                                    ia7Var = ia7Var;
                                    ia7Var2 = ia7Var;
                                    vmk vmkVar4 = new vmk(g9tVar, i6, z3, nx4Var2, th00Var);
                                    xq00Var2.m91793t0(vmkVar4);
                                    objM91750T4 = vmkVar4;
                                } else {
                                    ia7Var2 = ia7Var;
                                }
                                eh00 eh00Var11 = (eh00) objM91750T4;
                                if (i7 == i12) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                zM91762e = xq00Var2.m91762e(i6) | z18;
                                Object objM91750T14 = xq00Var2.m91750T();
                                if (zM91762e) {
                                    uum0Var4 = uum0Var2;
                                    ia7Var3 = ia7Var2;
                                    uum0 uum0Var8 = uum0Var3;
                                    set2 = set;
                                    smkVar = new smk(g9tVar, i6, set2, uum0Var8, uum0Var4, 0);
                                    uum0Var5 = uum0Var8;
                                    xq00Var2.m91793t0(smkVar);
                                } else {
                                    uum0Var4 = uum0Var2;
                                    ia7Var3 = ia7Var2;
                                    uum0 uum0Var9 = uum0Var3;
                                    set2 = set;
                                    smkVar = new smk(g9tVar, i6, set2, uum0Var9, uum0Var4, 0);
                                    uum0Var5 = uum0Var9;
                                    xq00Var2.m91793t0(smkVar);
                                }
                                eh00 eh00Var12 = (eh00) smkVar;
                                if (i11 != 32) {
                                    z19 = true;
                                } else {
                                    z19 = true;
                                }
                                if (i10 == 2048) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                                boolean z49 = z19 | z20;
                                if (i13 == 256) {
                                    z21 = true;
                                } else {
                                    z21 = false;
                                }
                                boolean zM91762e10 = z49 | z21 | xq00Var2.m91762e(i6);
                                if (i9 == 16384) {
                                    z22 = true;
                                } else {
                                    z22 = false;
                                }
                                zM91770i = zM91762e10 | z22 | xq00Var2.m91770i(jc20Var2);
                                objM91750T5 = xq00Var2.m91750T();
                                if (zM91770i) {
                                    jc20 jc20Var9 = jc20Var2;
                                    mga mgaVar2 = new mga(uum0Var5, uum0Var4, nx4Var, qf40Var, th00Var, i6, z4, jc20Var9, set2);
                                    jc20Var3 = jc20Var9;
                                    xq00Var2.m91793t0(mgaVar2);
                                    objM91750T5 = mgaVar2;
                                } else {
                                    jc20 jc20Var10 = jc20Var2;
                                    mga mgaVar3 = new mga(uum0Var5, uum0Var4, nx4Var, qf40Var, th00Var, i6, z4, jc20Var10, set2);
                                    jc20Var3 = jc20Var10;
                                    xq00Var2.m91793t0(mgaVar3);
                                    objM91750T5 = mgaVar3;
                                }
                                xq00Var3 = xq00Var2;
                                psh.m70858b(j, f6, gh00Var6, fxh0VarM61834r4, 0.0f, eh00Var11, eh00Var12, (eh00) objM91750T5, xq00Var3, ((i20 >> 6) & 14) | 384);
                                z23 = false;
                                xq00Var3.m91788r(false);
                            }
                        }
                        xq00Var3.m91788r(z23);
                    } else {
                        xq00Var3.m91788r(false);
                    }
                    nx4Var2 = nx4Var;
                    z33 = z;
                    z34 = z2;
                    th00Var2 = th00Var;
                    f10 = f10;
                    ia7Var7 = ia7Var3;
                    jc20Var5 = jc20Var3;
                    it = it;
                    i22 = i23;
                    cxh0Var = cxh0Var;
                } else {
                    z5 = false;
                    xq00Var3.m91788r(false);
                }
                jc20Var3 = jc20Var5;
                ia7Var3 = ia7Var7;
                cxh0Var = cxh0Var;
                it = it;
                f10 = f10;
                nx4Var2 = nx4Var;
                z33 = z;
                z34 = z2;
                th00Var2 = th00Var;
                f10 = f10;
                ia7Var7 = ia7Var3;
                jc20Var5 = jc20Var3;
                it = it;
                i22 = i23;
                cxh0Var = cxh0Var;
            }
            xq00Var3.m91788r(false);
            xq00Var3.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var3.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var3.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new wmk(g9tVar, nx4Var, j, f, f2, f3, f4, sb91Var, fxh0Var2, z, z2, z3, th00Var, qf40Var, z4, c9mVar, i, i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m49015b(drw0 drw0Var, eh00 eh00Var, eh00 eh00Var2, fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(-1092391838);
        ug5 ug5Var = xq00Var2.f264811a;
        int i2 = i | (xq00Var2.m91766g(drw0Var) ? 4 : 2) | (xq00Var2.m91770i(eh00Var) ? 32 : 16) | (xq00Var2.m91770i(eh00Var2) ? 256 : 128) | 3072;
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            ub9 ub9Var = d7f0.f46145P0;
            zi5 zi5Var = bj5.f27610a;
            xi5 xi5VarM29370g = bj5.m29370g(leu.m58816b(xq00Var2).f117230b.f224761d);
            long j = leu.m58815a(xq00Var2).f112823a.f229876c;
            fmx0 fmx0VarM47993b = hmx0.m47993b(leu.m58816b(xq00Var2).f117234f.f148188d);
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM96865y = zsf1.m96865y(leu.m58816b(xq00Var2).f117233e.f137888d, nec.m64246i(cxh0Var, j, fmx0VarM47993b));
            aaf aafVarM87496a = w9f.m87496a(xi5VarM29370g, ub9Var, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM96865y);
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
            zsf1.m96835F(aafVarM87496a, yhhVar, xq00Var2);
            yhh yhhVar2 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yhh yhhVar3 = roh.f201265j;
            zsf1.m96835F(numValueOf, yhhVar3, xq00Var2);
            vlh vlhVar = roh.f201266k;
            zsf1.m96833D(vlhVar, xq00Var2);
            yhh yhhVar4 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var2);
            xi5 xi5VarM29370g2 = bj5.m29370g(leu.m58816b(xq00Var2).f117230b.f224761d);
            fxh0 fxh0VarM68493v0 = oyf1.m68493v0(mi21.m61822f(1.0f, cxh0Var), oyf1.m68467i0(0, 0, 1, xq00Var2), false, 14);
            aaf aafVarM87496a2 = w9f.m87496a(xi5VarM29370g2, ub9Var, xq00Var2, 0);
            int iHashCode2 = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var2, fxh0VarM68493v0);
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a2, yhhVar, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var2);
            AbstractC0000a.m20s(iHashCode2, xq00Var2, yhhVar3, xq00Var2, vlhVar);
            zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var2);
            ahf1.m25932d(drw0Var.f52402a, mi21.m61822f(1.0f, cxh0Var), leu.m58818d(xq00Var2).f64969e, leu.m58815a(xq00Var2).f112824b.f138757a, new h171(3), null, 0, false, null, 0, null, xq00Var, 0, 0, 2016);
            ahf1.m25932d(drw0Var.f52403b, mi21.m61822f(1.0f, cxh0Var), leu.m58818d(xq00Var).f64974j, leu.m58815a(xq00Var).f112824b.f138757a, new h171(3), null, 0, false, null, 0, null, xq00Var, 0, 0, 2016);
            xq00Var2 = xq00Var;
            xq00Var2.m91788r(true);
            riw0.m75615i(xq00Var2, mi21.m61824h(leu.m58816b(xq00Var2).f117230b.f224761d, cxh0Var));
            tgu tguVar = new tgu(4);
            u40 u40Var = u40.f226523c;
            dyu.m37371c(new peu(u40Var, eh00Var), tguVar, null, null, null, null, null, null, null, null, rkk.m75772x(-1440333299, new crw0(drw0Var, 0), xq00Var2), xq00Var2, 0, 48, 2044);
            dyu.m37371c(new peu(u40Var, eh00Var2), wgu.f251150c, null, null, null, null, null, null, null, null, rkk.m75772x(-594345674, new crw0(drw0Var, 1), xq00Var2), xq00Var2, 0, 48, 2044);
            xq00Var2.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var2.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new jsl0((Object) drw0Var, (Object) eh00Var, (Object) eh00Var2, (Object) fxh0Var2, i, 26);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final sgc0 m49016c() {
        return new sgc0(nau.f152117a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public static final Object m49017d(eh00 eh00Var, th00 th00Var, ibk ibkVar) {
        mr3 mr3Var;
        if (ibkVar instanceof mr3) {
            mr3Var = (mr3) ibkVar;
            int i = mr3Var.f146412b;
            if ((i & Integer.MIN_VALUE) != 0) {
                mr3Var.f146412b = i - Integer.MIN_VALUE;
            } else {
                mr3Var = new mr3(ibkVar);
            }
        } else {
            mr3Var = new mr3(ibkVar);
        }
        Object obj = mr3Var.f146411a;
        int i2 = mr3Var.f146412b;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                ur3 ur3Var = new ur3(eh00Var, th00Var, null, 0);
                mr3Var.f146412b = 1;
                Object objM56684z = kk40.m56684z(ur3Var, mr3Var);
                yuk yukVar = yuk.f276404a;
                if (objM56684z == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
        } catch (AnchoredDragFinishedSignal unused) {
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: e */
    public static final Flowable m49018e(Flowable flowable, boolean z) {
        return z ? new FlowableRefCount(flowable.m23336Q()) : flowable;
    }

    /* JADX INFO: renamed from: f */
    public static final String m49019f(dxh dxhVar) {
        String str;
        dhb dhbVar = dxhVar.f53984g;
        if (dhbVar == null) {
            return "";
        }
        String str2 = dhbVar.f49044l;
        if (str2.length() == 0) {
            str2 = "unknown";
        }
        ArrayList<phb> arrayList = dhbVar.f49039g;
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        for (phb phbVar : arrayList) {
            if (phbVar instanceof lhb) {
                str = "remind_me";
            } else if (phbVar instanceof jhb) {
                str = "join_waitlist";
            } else if (phbVar instanceof ohb) {
                str = "waitlisted";
            } else if (phbVar instanceof ihb) {
                str = "cant_attend";
            } else if (phbVar instanceof khb) {
                str = "not_interested";
            } else if (phbVar instanceof hhb) {
                str = "buy_tickets";
            } else if (phbVar instanceof mhb) {
                str = "see_all_events";
            } else {
                if (!(phbVar instanceof nhb)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "share";
            }
            arrayList2.add(str);
        }
        return g6f.m43753y0(g6f.m43700N0(arrayList2, Collections.singletonList(str2)), "|", null, null, null, 62);
    }

    /* JADX INFO: renamed from: g */
    public static final long m49020g(float f, float f2, float f3, float f4, long j) {
        float f5 = f4 / 2;
        return (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (j >> 32)) * f) - f5)) << 32) | (((long) Float.floatToRawIntBits((((1.0f - Float.intBitsToFloat((int) (j & 4294967295L))) * f3) + f2) - f5)) & 4294967295L);
    }

    /* JADX INFO: renamed from: h */
    public static final String m49021h(String str) {
        char cCharAt;
        if (str.length() == 0 || 'a' > (cCharAt = str.charAt(0)) || cCharAt >= '{') {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        sb.append(Character.toUpperCase(cCharAt));
        sb.append((CharSequence) str, 1, str.length());
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public static final void m49022i(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(s571.m77247f(i, "index: ", i2, ", size: "));
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m49023j(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(s571.m77247f(i, "index: ", i2, ", size: "));
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m49024k(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            StringBuilder sbM36619s = dq60.m36619s(i, i2, "fromIndex: ", ", toIndex: ", ", size: ");
            sbM36619s.append(i3);
            throw new IndexOutOfBoundsException(sbM36619s.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(s571.m77247f(i, "fromIndex: ", i2, " > toIndex: "));
        }
    }

    /* JADX INFO: renamed from: l */
    public static final fcu m49025l(j2r j2rVar) {
        return new fcu(j2rVar, 0);
    }

    /* JADX INFO: renamed from: m */
    public static final ArrayList m49026m(List list, Set set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!set.contains(((cfv0) obj).f37460b)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public static fef0 m49027n(fef0 fef0Var, ko70 ko70Var, if71 if71Var, yqq yqqVar, hzz hzzVar) {
        if (fef0Var != null && ko70Var == fef0Var.f68754a && gwg1.m45952x(if71Var, ko70Var).equals(fef0Var.f68755b) && yqqVar.mo24619j() == fef0Var.f68756c.f285431a && hzzVar == fef0Var.f68757d) {
            return fef0Var;
        }
        fef0 fef0Var2 = fef0.f68753h;
        if (fef0Var2 != null && ko70Var == fef0Var2.f68754a && gwg1.m45952x(if71Var, ko70Var).equals(fef0Var2.f68755b) && yqqVar.mo24619j() == fef0Var2.f68756c.f285431a && hzzVar == fef0Var2.f68757d) {
            return fef0Var2;
        }
        fef0 fef0Var3 = new fef0(ko70Var, gwg1.m45952x(if71Var, ko70Var), new zqq(yqqVar.mo24619j(), yqqVar.mo24617W0()), hzzVar);
        fef0.f68753h = fef0Var3;
        return fef0Var3;
    }

    /* JADX INFO: renamed from: o */
    public static final Set m49028o(ixh ixhVar, boolean z) {
        String str = ixhVar.f106689a;
        if (wl51.m88460J0(str)) {
            return gbu.f78413a;
        }
        x401 x401Var = new x401();
        if (z) {
            x401Var.add(new dvh(str, ixhVar.f106690b, ixhVar.f106692d));
        }
        x401Var.add(new lvh(str));
        x401Var.add(new mvh(str));
        return n0e1.m63425d(x401Var);
    }

    /* JADX INFO: renamed from: p */
    public static final t050 m49029p(z8k z8kVar, ojk0 ojk0Var, pjk0 pjk0Var, pjk0 pjk0Var2, pjk0 pjk0Var3, pjk0 pjk0Var4, pjk0 pjk0Var5) {
        return ((b9k) z8kVar).m28489g("RemoveEpisodesAfterPlayingDaemon", new jq9(ojk0Var, pjk0Var, pjk0Var2, pjk0Var3, pjk0Var4, pjk0Var5, 20));
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m49030q(int i, String str) {
        char cCharAt = str.charAt(i);
        return 'A' <= cCharAt && cCharAt < '[';
    }

    /* JADX INFO: renamed from: r */
    public static final boolean m49031r(dxh dxhVar, String str, String str2, String str3) {
        return wj50.m88271j(dxhVar.f53978a, str) && wj50.m88271j(dxhVar.f53979b, str2) && wj50.m88271j(dxhVar.f53980c, str3);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m49032s(z5q0 z5q0Var) {
        return z5q0Var.m95467a();
    }

    /* JADX INFO: renamed from: t */
    public static final mft m49033t(pvh0 pvh0Var) {
        boolean z = pvh0Var.f181769c;
        String str = pvh0Var.f181759Q0;
        Set set = pvh0Var.f181775i;
        return new mft(z, str, pvh0Var.f181768b, pvh0Var.f181771e, set, pvh0Var.f181773g, pvh0Var.f181776t, pvh0Var.f181761S0 * 2);
    }

    /* JADX INFO: renamed from: u */
    public static final String m49034u(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('A' <= cCharAt && cCharAt < '[') {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: v */
    public static final pvh0 m49035v(pvh0 pvh0Var) {
        List<cfv0> list = pvh0Var.f181758P0;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        for (cfv0 cfv0Var : list) {
            boolean z = false;
            boolean z2 = ((pvh0Var.f181765Y || !cfv0Var.f37467i) && (pvh0Var.f181754L0 || !cfv0Var.f37457X)) ? cfv0Var.f37466h : false;
            if ((pvh0Var.f181756N0 && cfv0Var.f37464f) || (pvh0Var.f181757O0 && cfv0Var.f37467i)) {
                z = true;
            }
            arrayList.add(cfv0.m32672c(cfv0Var, false, false, null, z2, z, ContentType.SHORT_FORM_ON_DEMAND));
        }
        return pvh0.m71193c(pvh0Var, null, false, false, null, false, false, false, null, null, false, null, false, null, false, false, arrayList, null, 1966079);
    }
}
