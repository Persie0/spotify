package p204p;

import com.google.android.recaptcha.internal.zzhg;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class aog1 {

    /* JADX INFO: renamed from: a */
    public final mb61 f17684a;

    /* JADX INFO: renamed from: b */
    public final Integer f17685b;

    /* JADX INFO: renamed from: c */
    public final int f17686c;

    /* JADX WARN: Multi-variable type inference failed */
    public aog1(int i, th00 th00Var, Integer num) {
        this.f17686c = i;
        this.f17684a = (mb61) th00Var;
        this.f17685b = num;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r8v8, types: [p.mb61, p.th00] */
    /* JADX INFO: renamed from: a */
    public final Object m26589a(log1 log1Var, fbk fbkVar) {
        xng1 xng1Var;
        Exception e;
        smg1 smg1Var;
        TimeoutCancellationException e2;
        zzhg e3;
        zz11 zz11Var = zz11.f287823d2;
        if (fbkVar instanceof xng1) {
            xng1Var = (xng1) fbkVar;
            int i = xng1Var.f263613c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xng1Var.f263613c = i - Integer.MIN_VALUE;
            } else {
                xng1Var = new xng1(this, fbkVar);
            }
        } else {
            xng1Var = new xng1(this, fbkVar);
        }
        Object obj = xng1Var.f263611a;
        int i2 = xng1Var.f263613c;
        int i3 = 8;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                d1e1 d1e1Var = log1Var.f135426b;
                smg1 smg1Var2 = new smg1(log1Var, this.f17686c, this.f17685b);
                try {
                    ?? r8 = this.f17684a;
                    xng1Var.f263614d = smg1Var2;
                    xng1Var.f263613c = 1;
                    Object objInvoke = r8.invoke(smg1Var2, xng1Var);
                    yuk yukVar = yuk.f276404a;
                    if (objInvoke == yukVar) {
                        return yukVar;
                    }
                    obj = objInvoke;
                    smg1Var = smg1Var2;
                } catch (zzhg e4) {
                    e3 = e4;
                    smg1Var = smg1Var2;
                    smg1Var.m78524b(e3);
                    throw e3;
                } catch (TimeoutCancellationException e5) {
                    e2 = e5;
                    smg1Var = smg1Var2;
                    zzhg zzhgVar = new zzhg(zz11Var, zz11.f287824e, e2.getMessage(), i3);
                    smg1Var.m78524b(zzhgVar);
                    throw zzhgVar;
                } catch (Exception e6) {
                    e = e6;
                    smg1Var = smg1Var2;
                    zzhg zzhgVar2 = new zzhg(zz11Var, zz11.f287821d, e.getMessage(), i3);
                    smg1Var.m78524b(zzhgVar2);
                    throw zzhgVar2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                smg1Var = xng1Var.f263614d;
                try {
                    bga.m29073P(obj);
                } catch (zzhg e7) {
                    e3 = e7;
                    smg1Var.m78524b(e3);
                    throw e3;
                } catch (TimeoutCancellationException e8) {
                    e2 = e8;
                    zzhg zzhgVar3 = new zzhg(zz11Var, zz11.f287824e, e2.getMessage(), i3);
                    smg1Var.m78524b(zzhgVar3);
                    throw zzhgVar3;
                } catch (Exception e9) {
                    e = e9;
                    zzhg zzhgVar4 = new zzhg(zz11Var, zz11.f287821d, e.getMessage(), i3);
                    smg1Var.m78524b(zzhgVar4);
                    throw zzhgVar4;
                }
            }
            smg1Var.f210653a.m59567c(smg1Var.m78525c(3), null);
            return obj;
        } catch (Throwable th) {
            throw th;
        }
    }
}
