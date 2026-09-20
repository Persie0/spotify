package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface ra9 {
    /* JADX INFO: renamed from: a */
    static pa9 m75103a(ra9 ra9Var, String str, l1p0 l1p0Var, iac1 iac1Var, l89 l89Var, List list, boolean z, azu0 azu0Var, mgy mgyVar, int i) {
        if ((i & 2) != 0) {
            l1p0Var = null;
        }
        if ((i & 4) != 0) {
            iac1Var = new iac1();
        }
        if ((i & 8) != 0) {
            l89Var = null;
        }
        if ((i & 16) != 0) {
            list = lau.f131415a;
        }
        if ((i & 32) != 0) {
            z = false;
        }
        if ((i & 64) != 0) {
            azu0Var = null;
        }
        ogy ngyVar = mgyVar;
        if ((i & 256) != 0) {
            ngyVar = new ngy(false);
        }
        return ra9Var.mo72487c(str, l1p0Var, iac1Var, l89Var, list, z, azu0Var, null, ngyVar);
    }

    /* JADX INFO: renamed from: b */
    void mo72486b(pa9 pa9Var);

    /* JADX INFO: renamed from: c */
    pa9 mo72487c(String str, l1p0 l1p0Var, iac1 iac1Var, l89 l89Var, List list, boolean z, azu0 azu0Var, liz lizVar, ogy ogyVar);
}
