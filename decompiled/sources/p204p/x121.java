package p204p;

import java.util.TimeZone;

/* JADX INFO: loaded from: classes10.dex */
public final class x121 {

    /* JADX INFO: renamed from: a */
    public final p221 f257040a;

    /* JADX INFO: renamed from: b */
    public final wg61 f257041b;

    /* JADX INFO: renamed from: c */
    public Boolean f257042c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ezw0 f257043d;

    public x121(ezw0 ezw0Var, p221 p221Var) {
        this.f257043d = ezw0Var;
        this.f257040a = p221Var;
        this.f257041b = new wg61(new ahz0(27, ezw0Var, this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: a */
    public final Object m89618a(ibk ibkVar) {
        v121 v121Var;
        ezw0 ezw0Var = this.f257043d;
        mpk mpkVar = (mpk) ezw0Var.f64485b;
        if (ibkVar instanceof v121) {
            v121Var = (v121) ibkVar;
            int i = v121Var.f236226c;
            if ((i & Integer.MIN_VALUE) != 0) {
                v121Var.f236226c = i - Integer.MIN_VALUE;
            } else {
                v121Var = new v121(this, ibkVar);
            }
        } else {
            v121Var = new v121(this, ibkVar);
        }
        Object objInvoke = v121Var.f236224a;
        int i2 = v121Var.f236226c;
        p221 p221Var = this.f257040a;
        if (i2 == 0) {
            bga.m29073P(objInvoke);
            gh00 gh00Var = p221Var.f173225b;
            v121Var.f236226c = 1;
            objInvoke = gh00Var.invoke(v121Var);
            yuk yukVar = yuk.f276404a;
            if (objInvoke == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objInvoke);
        }
        jba0 jba0Var = (jba0) objInvoke;
        if (jba0Var == null) {
            return Boolean.FALSE;
        }
        xre xreVar = mpkVar.f146045a;
        ((wy3) xreVar).getClass();
        z050 z050VarM95040p6 = z050.m95040p6(System.currentTimeMillis());
        ((wy3) xreVar).getClass();
        if (pze1.m71734n6(z050VarM95040p6, gze1.m46197n(TimeZone.getDefault().getID())).f183683d.f131611d.compareTo(jba0Var) >= 0) {
            return Boolean.FALSE;
        }
        z050 z050VarM74378f = ((r0e1) ezw0Var.f64486c).m74378f(p221Var);
        if (z050VarM74378f == null) {
            return Boolean.TRUE;
        }
        gce gceVar = gce.DAYS;
        ((wy3) mpkVar.f146045a).getClass();
        z050 z050VarM95040p7 = z050.m95040p6(System.currentTimeMillis());
        gceVar.getClass();
        return Boolean.valueOf(z050VarM74378f.mo27576m(z050VarM95040p7, gceVar) < 30);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m89619b(ibk ibkVar) {
        w121 w121Var;
        Boolean bool;
        if (ibkVar instanceof w121) {
            w121Var = (w121) ibkVar;
            int i = w121Var.f246931c;
            if ((i & Integer.MIN_VALUE) != 0) {
                w121Var.f246931c = i - Integer.MIN_VALUE;
            } else {
                w121Var = new w121(this, ibkVar);
            }
        } else {
            w121Var = new w121(this, ibkVar);
        }
        Object objM89618a = w121Var.f246929a;
        int i2 = w121Var.f246931c;
        if (i2 == 0) {
            bga.m29073P(objM89618a);
            bool = this.f257042c;
            if (bool == null) {
                w121Var.f246931c = 1;
                objM89618a = m89618a(w121Var);
                Object obj = yuk.f276404a;
                if (objM89618a == obj) {
                    return obj;
                }
            }
            return Boolean.valueOf(bool.booleanValue());
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bga.m29073P(objM89618a);
        bool = (Boolean) objM89618a;
        bool.getClass();
        this.f257042c = bool;
        return Boolean.valueOf(bool.booleanValue());
    }
}
