package p204p;

import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class gwn0 {

    /* JADX INFO: renamed from: a */
    public final own0 f85050a;

    /* JADX INFO: renamed from: b */
    public final fw7 f85051b;

    /* JADX INFO: renamed from: c */
    public final lwn0 f85052c;

    public gwn0(own0 own0Var, fw7 fw7Var, lwn0 lwn0Var) {
        this.f85050a = own0Var;
        this.f85051b = fw7Var;
        this.f85052c = lwn0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: a */
    public final Object m45972a(ibk ibkVar) {
        fwn0 fwn0Var;
        own0 own0Var = this.f85050a;
        if (ibkVar instanceof fwn0) {
            fwn0Var = (fwn0) ibkVar;
            int i = fwn0Var.f74107c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fwn0Var.f74107c = i - Integer.MIN_VALUE;
            } else {
                fwn0Var = new fwn0(this, ibkVar);
            }
        } else {
            fwn0Var = new fwn0(this, ibkVar);
        }
        Object objM42948g = fwn0Var.f74105a;
        int i2 = fwn0Var.f74107c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM42948g);
                fw7 fw7Var = this.f85051b;
                fwn0Var.f74107c = 1;
                objM42948g = fw7Var.m42948g(fwn0Var);
                yuk yukVar = yuk.f276404a;
                if (objM42948g == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM42948g);
            }
            sc20 sc20Var = (sc20) objM42948g;
            if (!own0Var.m68174a().equals(sc20Var)) {
                own0Var.m68175b(sc20Var);
                lv31 lv31VarEdit = own0Var.f170741a.edit();
                lv31VarEdit.m60048a(own0.f170738b, !(sc20Var instanceof qc20));
                lv31VarEdit.m60054g();
            }
            return w2a1.f247311a;
        } catch (Exception e) {
            Logger.m3967c(e, "Failed to get hard cap education from capping metadata service", new Object[0]);
            return new c6x0(e);
        }
    }
}
