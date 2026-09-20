package p204p;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public interface z5a1 {
    /* JADX INFO: renamed from: a */
    Map mo28289a(Set set);

    /* JADX INFO: renamed from: b */
    void mo28290b(Set set);

    /* JADX INFO: renamed from: c */
    Object mo28291c(pqm0 pqm0Var, ibk ibkVar);

    /* JADX INFO: renamed from: d */
    default Object mo28292d(pqm0 pqm0Var, ibk ibkVar) {
        Object objMo28291c = mo28291c(pqm0Var, ibkVar);
        return objMo28291c == yuk.f276404a ? objMo28291c : w2a1.f247311a;
    }

    void dispose();
}
