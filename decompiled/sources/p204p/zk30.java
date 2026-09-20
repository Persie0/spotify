package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final enum zk30 extends il30 {
    @Override // p204p.lk30
    /* JADX INFO: renamed from: k */
    public final int mo25406k(fk30 fk30Var) {
        hl30 hl30Var;
        fk30Var.getClass();
        String strString = fk30Var.custom().string("titleStyle");
        if (fk30Var.text().subtitle() == null) {
            hl30Var = "description".equals(strString) ? hl30.f92600b : hl30.f92602d;
        } else if (Objects.equals(strString, "gone") || fk30Var.text().title() == null) {
            hl30Var = hl30.f92601c;
        } else {
            hl30Var = Objects.equals(fk30Var.custom().string("subtitleStyle", ""), "metadata") ? hl30.f92603e : hl30.f92604f;
        }
        return hl30Var.f92607a;
    }
}
