package p204p;

import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class kre0 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f125626a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f125627b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f125628c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f125629d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f125630e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f125631f;

    public /* synthetic */ kre0(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.f125626a = i2;
        this.f125628c = obj;
        this.f125629d = obj2;
        this.f125630e = obj3;
        this.f125631f = obj4;
        this.f125627b = i;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0075 A[PHI: r10
      0x0075: PHI (r10v10 java.lang.Integer) = (r10v3 java.lang.Integer), (r10v11 java.lang.Integer) binds: [B:32:0x008e, B:27:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: b */
    public Object m57156b(gre0 gre0Var, fbk fbkVar) {
        jre0 jre0Var;
        Integer num;
        dre0 zz11Var;
        Object objM94777f;
        gh00 gh00Var;
        if (fbkVar instanceof jre0) {
            jre0Var = (jre0) fbkVar;
            int i = jre0Var.f115168d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jre0Var.f115168d = i - Integer.MIN_VALUE;
            } else {
                jre0Var = new jre0(this, fbkVar);
            }
        } else {
            jre0Var = new jre0(this, fbkVar);
        }
        Object obj = jre0Var.f115166b;
        int i2 = jre0Var.f115168d;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i2 == 0) {
            bga.m29073P(obj);
            Integer num2 = null;
            int i3 = 0;
            if (gre0Var instanceof fre0) {
                Iterator it = ((qf40) this.f125628c).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i3 = -1;
                        break;
                    }
                    zqe0 zqe0Var = (zqe0) it.next();
                    if ((zqe0Var instanceof vqe0) && wj50.m88271j(((vqe0) zqe0Var).getId(), ((fre0) gre0Var).f72473a)) {
                        break;
                    }
                    i3++;
                }
                num = new Integer(i3);
                if (num.intValue() != -1) {
                    num2 = num;
                }
            } else {
                if (!(gre0Var instanceof ere0)) {
                    throw new NoWhenBranchMatchedException();
                }
                num = new Integer(0);
                if (!((Boolean) ((rv41) this.f125629d).getValue()).booleanValue()) {
                    num2 = num;
                }
            }
            if (num2 != null) {
                yw70 yw70Var = (yw70) this.f125630e;
                gh00 gh00Var2 = (gh00) this.f125631f;
                int iIntValue = num2.intValue();
                int i4 = yw70Var.m94779h().f214607m + yw70Var.m94779h().f214606l;
                tw70 tw70Var = (tw70) g6f.m43689C0(yw70Var.m94779h().f214605k);
                int i5 = this.f125627b;
                if (tw70Var == null || tw70Var.f224325a >= iIntValue) {
                    tw70 tw70Var2 = (tw70) g6f.m43689C0(yw70Var.m94779h().f214605k);
                    bre0 bre0Var = bre0.f30083a;
                    if (tw70Var2 == null || tw70Var2.f224325a != iIntValue) {
                        tw70 tw70Var3 = (tw70) g6f.m43745s0(yw70Var.m94779h().f214605k);
                        if (tw70Var3 != null && tw70Var3.f224325a == iIntValue) {
                            tw70 tw70Var4 = (tw70) g6f.m43745s0(yw70Var.m94779h().f214605k);
                            if (tw70Var4 == null || tw70Var4.f224340p != 0) {
                                zz11Var = new zz11(iIntValue, 20);
                            } else {
                                zz11Var = bre0Var;
                            }
                        } else if (iIntValue == 0) {
                            zz11Var = cre0.f41284a;
                        } else {
                            zz11Var = bre0Var;
                        }
                    } else {
                        tw70 tw70Var5 = (tw70) g6f.m43689C0(yw70Var.m94779h().f214605k);
                        if (tw70Var5 != null && tw70Var5.f224340p + tw70Var5.f224341q <= i4) {
                            zz11Var = bre0Var;
                        } else {
                            zz11Var = ((tw70) g6f.m43687A0(yw70Var.m94779h().f214605k)).f224341q <= i4 ? new qr8(iIntValue, i4, i5) : new zz11(iIntValue, 20);
                        }
                    }
                } else {
                    zz11Var = new qr8(iIntValue, i4, i5);
                }
                jre0Var.f115165a = gh00Var2;
                jre0Var.f115168d = 1;
                boolean zMo30298d = zz11Var.mo30298d();
                yuk yukVar = yuk.f276404a;
                if (!zMo30298d || (objM94777f = yw70Var.m94777f(zz11Var.mo30296a(), zz11Var.mo30297b(), jre0Var)) != yukVar) {
                    objM94777f = w2a1Var;
                }
                if (objM94777f == yukVar) {
                    return yukVar;
                }
                gh00Var = gh00Var2;
            }
            return w2a1Var;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        gh00Var = jre0Var.f115165a;
        bga.m29073P(obj);
        gh00Var.invoke(lpe0.f135748a);
        return w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0090  */
    /* JADX WARN: Code duplicated, block: B:62:0x0127  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        q8m0 q8m0Var;
        gg01 gg01Var;
        xf01 xf01Var;
        int i;
        niz nizVar;
        tf01 tf01Var;
        int i2;
        xf01 xf01Var2;
        int i3 = this.f125626a;
        yuk yukVar = yuk.f276404a;
        w2a1 w2a1Var = w2a1.f247311a;
        int i4 = this.f125627b;
        Object obj2 = this.f125630e;
        Object obj3 = this.f125628c;
        Object obj4 = this.f125631f;
        Object obj5 = this.f125629d;
        switch (i3) {
            case 0:
                return m57156b((gre0) obj, fbkVar);
            case 1:
                if (fbkVar instanceof q8m0) {
                    q8m0Var = (q8m0) fbkVar;
                    int i5 = q8m0Var.f186341b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        q8m0Var.f186341b = i5 - Integer.MIN_VALUE;
                    } else {
                        q8m0Var = new q8m0(this, fbkVar);
                    }
                } else {
                    q8m0Var = new q8m0(this, fbkVar);
                }
                Object obj6 = q8m0Var.f186340a;
                int i6 = q8m0Var.f186341b;
                if (i6 == 0) {
                    bga.m29073P(obj6);
                    List listM85244j = vdm.m85244j(i4, (String) obj4, (vdm) obj5, (ebf0) ((xv41) obj2).getValue());
                    q8m0Var.f186341b = 1;
                    if (((niz) obj3).emit(listM85244j, q8m0Var) == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj6);
                }
                return w2a1Var;
            case 2:
                if (fbkVar instanceof gg01) {
                    gg01Var = (gg01) fbkVar;
                    int i7 = gg01Var.f79502b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        gg01Var.f79502b = i7 - Integer.MIN_VALUE;
                    } else {
                        gg01Var = new gg01(this, fbkVar);
                    }
                } else {
                    gg01Var = new gg01(this, fbkVar);
                }
                Object obj7 = gg01Var.f79501a;
                int i8 = gg01Var.f79502b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        i2 = gg01Var.f79504d;
                        xf01Var = gg01Var.f79506f;
                        nizVar = gg01Var.f79503c;
                        bga.m29073P(obj7);
                    } else {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj7);
                    }
                    return w2a1Var;
                }
                bga.m29073P(obj7);
                niz nizVar2 = (niz) obj3;
                wd01 wd01Var = (wd01) obj;
                xf01Var = (xf01) obj5;
                i = 0;
                if (wd01Var != null) {
                    hg01 hg01Var = (hg01) obj2;
                    gg01Var.f79503c = nizVar2;
                    gg01Var.f79506f = xf01Var;
                    gg01Var.f79504d = 0;
                    gg01Var.f79502b = 1;
                    int i9 = hg01.f90976r;
                    hg01Var.getClass();
                    Object objM87918a = ((wf01) obj4).m87918a(i4 + ".subject", wd01Var, new wg4(i4, hg01Var, wd01Var, null), gg01Var);
                    if (objM87918a == yukVar) {
                        return yukVar;
                    }
                    nizVar = nizVar2;
                    obj7 = objM87918a;
                    i2 = 0;
                } else {
                    nizVar = nizVar2;
                    tf01Var = null;
                }
                xf01Var2 = new xf01(tf01Var, xf01Var.f260802b, xf01Var.f260803c);
                gg01Var.f79503c = null;
                gg01Var.f79506f = null;
                gg01Var.f79504d = i;
                gg01Var.f79502b = 2;
                if (nizVar.emit(xf01Var2, gg01Var) == yukVar) {
                    return yukVar;
                }
                return w2a1Var;
                tf01Var = (tf01) obj7;
                i = i2;
                xf01Var2 = new xf01(tf01Var, xf01Var.f260802b, xf01Var.f260803c);
                gg01Var.f79503c = null;
                gg01Var.f79506f = null;
                gg01Var.f79504d = i;
                gg01Var.f79502b = 2;
                if (nizVar.emit(xf01Var2, gg01Var) == yukVar) {
                    return yukVar;
                }
                return w2a1Var;
            default:
                qho qhoVar = (qho) obj;
                ogo ogoVar = (ogo) obj5;
                pir0 pir0Var = (pir0) obj4;
                bw41 bw41Var = (bw41) obj3;
                if (qhoVar instanceof oho) {
                    ogo ogoVar2 = bw41Var.f31536a;
                    if (ogoVar2 != null && ogoVar2 != ogoVar) {
                        ogoVar2.dispose();
                    }
                    bw41Var.f31536a = ogoVar;
                    bw41Var.f31537b = obj2;
                    pir0Var.setValue(new d230(obj2));
                } else if (qhoVar instanceof pho) {
                    Object obj8 = bw41Var.f31537b;
                    pir0Var.setValue(obj8 != null ? new d230(obj8) : c230.f33284a);
                } else {
                    if (!(qhoVar instanceof nho)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Object obj9 = bw41Var.f31537b;
                    Object b230Var = (obj9 == null || i4 == 1) ? new b230(((nho) qhoVar).f154041a) : new d230(obj9);
                    pir0Var.setValue(b230Var);
                }
                return w2a1Var;
        }
    }

    public kre0(qf40 qf40Var, rv41 rv41Var, int i, yw70 yw70Var, gh00 gh00Var) {
        this.f125626a = 0;
        this.f125628c = qf40Var;
        this.f125629d = rv41Var;
        this.f125627b = i;
        this.f125630e = yw70Var;
        this.f125631f = gh00Var;
    }
}
