package p204p;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class v50 {

    /* JADX INFO: renamed from: a */
    public final Map f237274a;

    public /* synthetic */ v50(Map map) {
        this.f237274a = map;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public Object m84669a(s50 s50Var, ibk ibkVar) {
        u50 u50Var;
        if (ibkVar instanceof u50) {
            u50Var = (u50) ibkVar;
            int i = u50Var.f226867d;
            if ((i & Integer.MIN_VALUE) != 0) {
                u50Var.f226867d = i - Integer.MIN_VALUE;
            } else {
                u50Var = new u50(this, ibkVar);
            }
        } else {
            u50Var = new u50(this, ibkVar);
        }
        Object objMo33757a = u50Var.f226865b;
        int i2 = u50Var.f226867d;
        if (i2 == 0) {
            bga.m29073P(objMo33757a);
            Set set = dd41.f47702f;
            he41 he41Var = r46.m74726U((String) g6f.m43741q0(s50Var.f205670a)).f47710d;
            fka1 type = he41Var != null ? he41Var.getType() : null;
            if (wj50.m88271j(type, avp0.f20242e) || wj50.m88271j(type, ivp0.f106258f)) {
                return new t50(f3m.f65531a, s50Var.f205670a);
            }
            jn80 jn80Var = (jn80) this.f237274a.get(s50Var.f205671b);
            if (jn80Var != null) {
                u50Var.f226864a = s50Var;
                u50Var.f226867d = 1;
                objMo33757a = jn80Var.mo33757a(s50Var, u50Var);
                yuk yukVar = yuk.f276404a;
                if (objMo33757a == yukVar) {
                    return yukVar;
                }
            }
            return new t50(x2m.f257521a, s50Var.f205670a);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s50Var = u50Var.f226864a;
        bga.m29073P(objMo33757a);
        t50 t50Var = (t50) objMo33757a;
        if (t50Var != null) {
            return t50Var;
        }
        return new t50(x2m.f257521a, s50Var.f205670a);
    }
}
