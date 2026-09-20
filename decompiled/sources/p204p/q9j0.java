package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class q9j0 {
    /* JADX INFO: renamed from: a */
    public static i891 m72404a(l8j0 l8j0Var, List list, gh00 gh00Var) {
        h600 h600VarM33546a;
        h600 h600VarMo49777a;
        k5j0 k5j0VarM58475b = l8j0Var.m58475b();
        zzq0 zzq0Var = null;
        zzq0 zzq0Var2 = (k5j0VarM58475b == null || (h600VarMo49777a = k5j0VarM58475b.mo49777a()) == null) ? null : h600VarMo49777a.f87943d;
        if (list.size() > 1) {
            zzq0Var = (zzq0) gh00Var.invoke(g6f.m43687A0(list));
        } else if (l8j0Var.m58477d() != null) {
            zzq0Var = l8j0Var.m58477d().mo49777a().f87943d;
        } else {
            cp8 cp8Var = (cp8) l8j0Var.m58474a().peek();
            if (cp8Var != null && (h600VarM33546a = cp8Var.m33546a()) != null) {
                zzq0Var = h600VarM33546a.f87943d;
            }
        }
        return new i891(m72405b(zzq0Var, zzq0Var2), zzq0Var2, zzq0Var);
    }

    /* JADX INFO: renamed from: b */
    public static int m72405b(zzq0 zzq0Var, zzq0 zzq0Var2) {
        boolean z = zzq0Var2 instanceof uzq0;
        if (z && (zzq0Var instanceof uzq0)) {
            return 1;
        }
        if (z && (zzq0Var instanceof yzq0)) {
            return 2;
        }
        boolean z2 = zzq0Var2 instanceof yzq0;
        if (z2 && (zzq0Var instanceof yzq0)) {
            return 3;
        }
        if (z2 && (zzq0Var instanceof uzq0)) {
            return 4;
        }
        return (z2 && zzq0Var == null) ? 4 : 1;
    }
}
