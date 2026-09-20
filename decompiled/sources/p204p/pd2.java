package p204p;

import com.spotify.base.java.logging.Logger;
import java.util.TimeZone;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class pd2 implements hc50 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f176336a;

    /* JADX INFO: renamed from: b */
    public final Object f176337b;

    public /* synthetic */ pd2(Object obj, int i) {
        this.f176336a = i;
        this.f176337b = obj;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:40|21|(1:43)(1:24)) */
    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0089  */
    /* JADX WARN: Code duplicated, block: B:33:0x009f  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:40:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        r12 = 0;
        r1 = r6;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0087 -> B:35:0x00a1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x009f -> B:34:0x00a0). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m69637b(pd2 pd2Var, ibk ibkVar) {
        od2 od2Var;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (ibkVar instanceof od2) {
            od2Var = (od2) ibkVar;
            int i7 = od2Var.f164077g;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                od2Var.f164077g = i7 - Integer.MIN_VALUE;
            } else {
                od2Var = new od2(pd2Var, ibkVar);
            }
        } else {
            od2Var = new od2(pd2Var, ibkVar);
        }
        Object objM76978s = od2Var.f164075e;
        int i8 = od2Var.f164077g;
        yuk yukVar = yuk.f276404a;
        if (i8 == 0) {
            bga.m29073P(objM76978s);
            i = 3;
            i2 = 0;
            if (i2 >= i) {
                return new ud2(new ld2(5));
            }
            nd2 nd2Var = new nd2(pd2Var, null, 1);
            od2Var.getClass();
            od2Var.f164071a = i;
            od2Var.f164072b = i2;
            od2Var.f164073c = i2;
            od2Var.f164074d = 0;
            od2Var.f164077g = 1;
            objM76978s = s1h1.m76978s(2000L, nd2Var, od2Var);
            if (objM76978s == yukVar) {
                return yukVar;
            }
            i6 = 0;
            i5 = i2;
        } else if (i8 == 1) {
            i6 = od2Var.f164074d;
            i2 = od2Var.f164073c;
            i5 = od2Var.f164072b;
            i = od2Var.f164071a;
            try {
                bga.m29073P(objM76978s);
            } catch (TimeoutCancellationException unused) {
                int i9 = i6;
                i3 = i5;
                Logger.m3973i("AgeSignalInterceptor", edb.m38563l("Timeout on attempt ", i2 + 1, "/3 for interceptor"));
                if (i2 < 2) {
                    od2Var.getClass();
                    od2Var.f164071a = i;
                    od2Var.f164072b = i3;
                    od2Var.f164073c = i2;
                    od2Var.f164074d = i9;
                    od2Var.f164077g = 2;
                    if (njg1.m64619l(500L, od2Var) == yukVar) {
                        return yukVar;
                    }
                    i4 = i;
                    i = i4;
                }
                i2 = i3 + 1;
                if (i2 >= i) {
                    return new ud2(new ld2(5));
                }
                nd2 nd2Var2 = new nd2(pd2Var, null, 1);
                od2Var.getClass();
                od2Var.f164071a = i;
                od2Var.f164072b = i2;
                od2Var.f164073c = i2;
                od2Var.f164074d = 0;
                od2Var.f164077g = 1;
                objM76978s = s1h1.m76978s(2000L, nd2Var2, od2Var);
                if (objM76978s == yukVar) {
                    return yukVar;
                }
                i6 = 0;
                i5 = i2;
            }
        } else {
            if (i8 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = od2Var.f164072b;
            i4 = od2Var.f164071a;
            bga.m29073P(objM76978s);
            i = i4;
            i2 = i3 + 1;
            if (i2 >= i) {
                return new ud2(new ld2(5));
            }
            nd2 nd2Var3 = new nd2(pd2Var, null, 1);
            od2Var.getClass();
            od2Var.f164071a = i;
            od2Var.f164072b = i2;
            od2Var.f164073c = i2;
            od2Var.f164074d = 0;
            od2Var.f164077g = 1;
            objM76978s = s1h1.m76978s(2000L, nd2Var3, od2Var);
            if (objM76978s == yukVar) {
                return yukVar;
            }
            i6 = 0;
            i5 = i2;
        }
        return (wd2) objM76978s;
    }

    @Override // p204p.hc50
    /* JADX INFO: renamed from: a */
    public final n2x0 mo47096a(kvu0 kvu0Var) {
        auw0 auw0Var;
        String str;
        Integer num;
        switch (this.f176336a) {
            case 0:
                auw0 auw0Var2 = kvu0Var.f126959e;
                wd2 wd2Var = (wd2) x0h1.m89581x(dau.f47107a, new nd2(this, null, 0));
                String strValueOf = "UNKNOWN";
                if (wd2Var instanceof vd2) {
                    rc2 rc2Var = ((vd2) wd2Var).f240299a;
                    jc2 jc2Var = rc2Var.f197692b;
                    int iIntValue = 0;
                    int i = jc2Var != null ? jc2Var.f110942a : 0;
                    if (jc2Var != null && (num = jc2Var.f110943b) != null) {
                        iIntValue = num.intValue();
                    }
                    if (i != 0) {
                        if (iIntValue == 0) {
                            strValueOf = String.valueOf(i);
                        } else {
                            strValueOf = i + "-" + iIntValue;
                        }
                    }
                    ztw0 ztw0VarM27219b = auw0Var2.m27219b();
                    ztw0VarM27219b.f286277c.m77929c("x-age-signal-status", fr0.m42450A(rc2Var.f197691a));
                    ztw0VarM27219b.f286277c.m77929c("x-age-signal-range", strValueOf);
                    ztw0VarM27219b.f286277c.m77929c("x-age-signal-source", fr0.m42482z(rc2Var.f197694d));
                    int i2 = rc2Var.f197693c;
                    if (i2 == 1) {
                        str = "PENDING";
                    } else if (i2 == 2) {
                        str = "DENIED";
                    } else if (i2 == 3) {
                        str = "APPROVED";
                    } else {
                        if (i2 != 4) {
                            throw null;
                        }
                        str = "NOT_APPLICABLE";
                    }
                    ztw0VarM27219b.f286277c.m77929c("x-age-signal-change-status", str);
                    auw0Var = new auw0(ztw0VarM27219b);
                } else {
                    if (!(wd2Var instanceof ud2)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ztw0 ztw0VarM27219b2 = auw0Var2.m27219b();
                    ztw0VarM27219b2.f286277c.m77929c("x-age-signal-status", "UNKNOWN");
                    auw0Var = new auw0(ztw0VarM27219b2);
                }
                return kvu0Var.m57489b(auw0Var);
            case 1:
                ztw0 ztw0VarM27219b3 = kvu0Var.f126959e.m27219b();
                ztw0VarM27219b3.m96953f(gu31.class, new gu31((String) this.f176337b));
                return kvu0Var.m57489b(new auw0(ztw0VarM27219b3));
            default:
                auw0 auw0Var3 = kvu0Var.f126959e;
                if (auw0Var3.f20039c.m78534b("Time-Zone") == null) {
                    ztw0 ztw0VarM27219b4 = auw0Var3.m27219b();
                    ((wy3) ((xre) this.f176337b)).getClass();
                    ztw0VarM27219b4.f286277c.m77925B("Time-Zone", TimeZone.getDefault().getID());
                    auw0Var3 = new auw0(ztw0VarM27219b4);
                }
                return kvu0Var.m57489b(auw0Var3);
        }
    }
}
