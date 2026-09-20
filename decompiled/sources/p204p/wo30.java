package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final enum wo30 extends op30 {
    @Override // p204p.lk30
    /* JADX INFO: renamed from: k */
    public final int mo25406k(fk30 fk30Var) {
        mp30 mp30Var;
        fk30Var.getClass();
        qk30 qk30VarText = fk30Var.text();
        if (qk30VarText.title() == null || (qk30VarText.subtitle() == null && qk30VarText.accessory() == null && qk30VarText.description() == null)) {
            if (fk30Var.text().description() != null) {
                mp30Var = mp30.f145844b;
            } else {
                mp30Var = opo.m67557g(fk30Var) ? mp30.f145846d : mp30.f145845c;
            }
        } else if (opo.m67557g(fk30Var)) {
            int i = ro30.f201061a;
            mp30Var = fk30Var.custom().boolValue("hubs:glue:muted", false) ? mp30.f145851i : mp30.f145850h;
        } else if (fk30Var.custom().intValue("row_number") != null) {
            int i2 = ro30.f201061a;
            mp30Var = fk30Var.custom().boolValue("hubs:glue:muted", false) ? mp30.f145842Y : mp30.f145841X;
        } else {
            int i3 = ro30.f201061a;
            mp30Var = fk30Var.custom().boolValue("hubs:glue:muted", false) ? mp30.f145852t : mp30.f145849g;
        }
        return mp30Var.f145853a;
    }
}
