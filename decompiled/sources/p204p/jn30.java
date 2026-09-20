package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final enum jn30 extends rn30 {
    @Override // p204p.lk30
    /* JADX INFO: renamed from: k */
    public final int mo25406k(fk30 fk30Var) {
        on30 on30Var;
        fk30Var.getClass();
        qk30 qk30VarText = fk30Var.text();
        if (qk30VarText.title() == null || (qk30VarText.subtitle() == null && qk30VarText.accessory() == null && qk30VarText.description() == null)) {
            on30Var = fk30Var.text().title() != null ? on30.f167146c : on30.f167145b;
        } else {
            on30Var = ((fk30Var.text().subtitle() == null || Objects.equals(fk30Var.custom().string("glue:subtitleStyle", ""), "metadata")) && fk30Var.text().description() == null) ? on30.f167147d : on30.f167148e;
        }
        return on30Var.f167151a;
    }
}
