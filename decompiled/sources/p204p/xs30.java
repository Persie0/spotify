package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class xs30 implements ys30 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ys30 f265468a;

    public xs30(ys30 ys30Var) {
        this.f265468a = ys30Var;
    }

    @Override // p204p.ys30
    /* JADX INFO: renamed from: c */
    public final fk30 mo25398c(fk30 fk30Var) {
        fk30 fk30VarMo25398c = this.f265468a.mo25398c(fk30Var);
        List listChildren = fk30Var.children();
        if (listChildren == Collections.EMPTY_LIST) {
            return fk30VarMo25398c;
        }
        kf40 kf40Var = pf40.f176960b;
        return listChildren == wsv0.f254763e ? fk30VarMo25398c : new ws30(this, fk30VarMo25398c);
    }
}
