package p204p;

import com.spotify.intentrouter.core.MatcherCollisionException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class pcf {

    /* JADX INFO: renamed from: a */
    public final uo80 f176068a;

    /* JADX INFO: renamed from: b */
    public final ecf f176069b;

    /* JADX INFO: renamed from: c */
    public ocf f176070c;

    public pcf(uo80 uo80Var, ecf ecfVar) {
        this.f176068a = uo80Var;
        this.f176069b = ecfVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m69577a(pnx0 pnx0Var) {
        ArrayList arrayList = new ArrayList();
        for (qy7 qy7Var : this.f176068a.f232357a) {
            if (qy7Var.f193840a.match(pnx0Var)) {
                arrayList.add(qy7Var);
            }
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        if (listUnmodifiableList.size() == 0) {
            ocf ocfVar = this.f176070c;
            if (ocfVar != null) {
                ocfVar.mo65508a(pnx0Var);
            }
            return false;
        }
        if (listUnmodifiableList.size() > 1) {
            ocf ocfVar2 = this.f176070c;
            if (ocfVar2 != null) {
                ocfVar2.mo65510c(pnx0Var, listUnmodifiableList);
            }
            throw MatcherCollisionException.m12028a(pnx0Var, listUnmodifiableList);
        }
        qy7 qy7Var2 = (qy7) listUnmodifiableList.get(0);
        ocf ocfVar3 = this.f176070c;
        if (ocfVar3 != null) {
            ocfVar3.mo65509b(pnx0Var, qy7Var2);
        }
        this.f176069b.mo38493f(qy7Var2.f193841b.m71678u(pnx0Var));
        return true;
    }
}
