package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class rl90 {

    /* JADX INFO: renamed from: a */
    public final te20 f200240a;

    /* JADX INFO: renamed from: b */
    public final List f200241b;

    /* JADX INFO: renamed from: c */
    public final q9u f200242c;

    /* JADX INFO: renamed from: d */
    public final String f200243d;

    public rl90(te20 te20Var, List list, q9u q9uVar, String str) {
        this.f200240a = te20Var;
        this.f200241b = list;
        this.f200242c = q9uVar;
        this.f200243d = str;
    }

    /* JADX INFO: renamed from: a */
    public static rl90 m75815a(rl90 rl90Var, te20 te20Var, List list, q9u q9uVar, String str, int i) {
        if ((i & 1) != 0) {
            te20Var = rl90Var.f200240a;
        }
        rl90Var.getClass();
        if ((i & 8) != 0) {
            q9uVar = rl90Var.f200242c;
        }
        rl90Var.getClass();
        return new rl90(te20Var, list, q9uVar, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rl90)) {
            return false;
        }
        rl90 rl90Var = (rl90) obj;
        return wj50.m88271j(this.f200240a, rl90Var.f200240a) && wj50.m88271j(this.f200241b, rl90Var.f200241b) && wj50.m88271j(this.f200242c, rl90Var.f200242c) && wj50.m88271j(this.f200243d, rl90Var.f200243d);
    }

    public final int hashCode() {
        te20 te20Var = this.f200240a;
        int iM77244c = s571.m77244c((te20Var == null ? 0 : te20Var.hashCode()) * 31, 961, this.f200241b);
        q9u q9uVar = this.f200242c;
        int iHashCode = (iM77244c + (q9uVar == null ? 0 : q9uVar.hashCode())) * 31;
        String str = this.f200243d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
