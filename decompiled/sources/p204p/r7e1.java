package p204p;

import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class r7e1 {

    /* JADX INFO: renamed from: a */
    public final Object f196507a;

    /* JADX INFO: renamed from: b */
    public final Object f196508b;

    /* JADX INFO: renamed from: c */
    public final Object f196509c;

    /* JADX INFO: renamed from: d */
    public final Object f196510d;

    /* JADX INFO: renamed from: e */
    public final Object f196511e;

    /* JADX INFO: renamed from: f */
    public final Object f196512f;

    /* JADX INFO: renamed from: g */
    public final Object f196513g;

    /* JADX INFO: renamed from: h */
    public final Object f196514h;

    /* JADX INFO: renamed from: i */
    public final Object f196515i;

    /* JADX INFO: renamed from: j */
    public final Object f196516j;

    public /* synthetic */ r7e1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        this.f196507a = obj;
        this.f196508b = obj2;
        this.f196509c = obj3;
        this.f196510d = obj4;
        this.f196511e = obj5;
        this.f196512f = obj6;
        this.f196513g = obj7;
        this.f196514h = obj8;
        this.f196515i = obj9;
        this.f196516j = obj10;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        if (r15 == r11) goto L29;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m74898a(String str, String str2, ibk ibkVar) {
        n7e1 n7e1Var;
        rqs0 rqs0Var;
        String str3;
        String str4;
        zus0 zus0Var;
        String str5;
        if (ibkVar instanceof n7e1) {
            n7e1Var = (n7e1) ibkVar;
            int i = n7e1Var.f151150h;
            if ((i & Integer.MIN_VALUE) != 0) {
                n7e1Var.f151150h = i - Integer.MIN_VALUE;
            } else {
                n7e1Var = new n7e1(this, ibkVar);
            }
        } else {
            n7e1Var = new n7e1(this, ibkVar);
        }
        n7e1 n7e1Var2 = n7e1Var;
        Object objM76264c = n7e1Var2.f151148f;
        int i2 = n7e1Var2.f151150h;
        Object obj = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM76264c);
                rqs0Var = (rqs0) this.f196508b;
                String str6 = (String) this.f196512f;
                zus0 zus0Var2 = new zus0(3);
                n7e1Var2.f151143a = str;
                n7e1Var2.f151144b = rqs0Var;
                n7e1Var2.f151145c = str2;
                n7e1Var2.f151146d = str6;
                n7e1Var2.f151147e = zus0Var2;
                n7e1Var2.f151150h = 1;
                Object objM74900c = m74900c(n7e1Var2);
                if (objM74900c != obj) {
                    str3 = str;
                    str4 = str6;
                    zus0Var = zus0Var2;
                    objM76264c = objM74900c;
                    str5 = str2;
                }
                return obj;
            }
            if (i2 == 1) {
                zus0 zus0Var3 = n7e1Var2.f151147e;
                String str7 = n7e1Var2.f151146d;
                String str8 = n7e1Var2.f151145c;
                rqs0Var = n7e1Var2.f151144b;
                String str9 = n7e1Var2.f151143a;
                bga.m29073P(objM76264c);
                zus0Var = zus0Var3;
                str4 = str7;
                str3 = str9;
                str5 = str8;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM76264c);
            }
            dvs0 dvs0Var = (dvs0) objM76264c;
            if (dvs0Var instanceof cvs0) {
                String str10 = ((cvs0) dvs0Var).f42536b;
                return str10 != null ? new h8e1(str10) : new p8e1(2);
            }
            if (dvs0Var instanceof bvs0) {
                return new p8e1(2);
            }
            throw new NoWhenBranchMatchedException();
            boolean zBooleanValue = ((Boolean) objM76264c).booleanValue();
            n7e1Var2.f151143a = null;
            n7e1Var2.f151144b = null;
            n7e1Var2.f151145c = null;
            n7e1Var2.f151146d = null;
            n7e1Var2.f151147e = null;
            n7e1Var2.f151150h = 2;
            objM76264c = rqs0Var.m76264c(str5, str4, zus0Var, zBooleanValue, str3, false, n7e1Var2);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return new p8e1(1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: b */
    public Object m74899b(String str, ibk ibkVar) {
        o7e1 o7e1Var;
        String str2;
        qty qtyVar;
        String str3;
        ybv ybvVar;
        if (ibkVar instanceof o7e1) {
            o7e1Var = (o7e1) ibkVar;
            int i = o7e1Var.f162530f;
            if ((i & Integer.MIN_VALUE) != 0) {
                o7e1Var.f162530f = i - Integer.MIN_VALUE;
            } else {
                o7e1Var = new o7e1(this, ibkVar);
            }
        } else {
            o7e1Var = new o7e1(this, ibkVar);
        }
        Object objM25939k = o7e1Var.f162528d;
        int i2 = o7e1Var.f162530f;
        boolean z = true;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM25939k);
                wt80 wt80Var = (wt80) this.f196507a;
                st80 st80Var = d8e1.f46434a;
                qbn0 qbn0Var = (qbn0) this.f196509c;
                o7e1Var.f162525a = str;
                o7e1Var.f162530f = 1;
                objM25939k = ahf1.m25939k(wt80Var, str, st80Var, qbn0Var, o7e1Var);
                if (objM25939k == yukVar) {
                }
                return yukVar;
            }
            if (i2 == 1) {
                str = o7e1Var.f162525a;
                bga.m29073P(objM25939k);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str3 = o7e1Var.f162527c;
                qtyVar = o7e1Var.f162526b;
                bga.m29073P(objM25939k);
            }
            boolean z2 = ((u3e1) objM25939k).f226367b;
            ybvVar = qtyVar.f192505a;
            if (!ybvVar.f271278w.f156641e && !ybvVar.f271265j) {
                z = false;
            }
            return new t8e1(new iop0(qtyVar.f192507c, z, str3, z2));
            qty qtyVar2 = (qty) objM25939k;
            if (qtyVar2 == null || (str2 = qtyVar2.f192506b) == null) {
                return s8e1.f206633a;
            }
            nlz nlzVarM72364d = ((q9e1) this.f196510d).m72364d(str);
            o7e1Var.f162525a = null;
            o7e1Var.f162526b = qtyVar2;
            o7e1Var.f162527c = str2;
            o7e1Var.f162530f = 2;
            Object objM86755t = vyf1.m86755t(nlzVarM72364d, o7e1Var);
            if (objM86755t != yukVar) {
                qtyVar = qtyVar2;
                objM25939k = objM86755t;
                str3 = str2;
                boolean z3 = ((u3e1) objM25939k).f226367b;
                ybvVar = qtyVar.f192505a;
                if (!ybvVar.f271278w.f156641e) {
                    z = false;
                }
                return new t8e1(new iop0(qtyVar.f192507c, z, str3, z3));
            }
            return yukVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public Object m74900c(ibk ibkVar) {
        p7e1 p7e1Var;
        if (ibkVar instanceof p7e1) {
            p7e1Var = (p7e1) ibkVar;
            int i = p7e1Var.f174666c;
            if ((i & Integer.MIN_VALUE) != 0) {
                p7e1Var.f174666c = i - Integer.MIN_VALUE;
            } else {
                p7e1Var = new p7e1(this, ibkVar);
            }
        } else {
            p7e1Var = new p7e1(this, ibkVar);
        }
        Object objM86757v = p7e1Var.f174664a;
        int i2 = p7e1Var.f174666c;
        if (i2 == 0) {
            bga.m29073P(objM86757v);
            vjz vjzVar = new vjz(gyf1.m46157w(((vmz) this.f196511e).m86025b("list-private-by-default"), d8e1.f46435b), new far0(3, 20, null), 2);
            p7e1Var.f174666c = 1;
            objM86757v = vyf1.m86757v(vjzVar, p7e1Var);
            yuk yukVar = yuk.f276404a;
            if (objM86757v == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86757v);
        }
        Boolean bool = (Boolean) objM86757v;
        return Boolean.valueOf(bool != null ? !bool.booleanValue() : false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public Object m74901d(String str, String str2, ibk ibkVar) {
        q7e1 q7e1Var;
        if (ibkVar instanceof q7e1) {
            q7e1Var = (q7e1) ibkVar;
            int i = q7e1Var.f186088c;
            if ((i & Integer.MIN_VALUE) != 0) {
                q7e1Var.f186088c = i - Integer.MIN_VALUE;
            } else {
                q7e1Var = new q7e1(this, ibkVar);
            }
        } else {
            q7e1Var = new q7e1(this, ibkVar);
        }
        Object objM76263a = q7e1Var.f186086a;
        int i2 = q7e1Var.f186088c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM76263a);
                rqs0 rqs0Var = (rqs0) this.f196508b;
                q7e1Var.f186088c = 1;
                objM76263a = rqs0Var.m76263a(str, str2, q7e1Var, false);
                yuk yukVar = yuk.f276404a;
                if (objM76263a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM76263a);
            }
            k7t k7tVar = (k7t) objM76263a;
            if (k7tVar instanceof j7t) {
                return r8e1.f196783a;
            }
            if (k7tVar instanceof i7t) {
                return new p8e1(2);
            }
            throw new NoWhenBranchMatchedException();
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return new p8e1(1);
        }
    }
}
