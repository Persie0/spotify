package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class w8z {

    /* JADX INFO: renamed from: a */
    public final String f249038a;

    /* JADX INFO: renamed from: b */
    public final eyl0 f249039b;

    /* JADX INFO: renamed from: c */
    public final boolean f249040c;

    /* JADX INFO: renamed from: d */
    public final Map f249041d;

    /* JADX INFO: renamed from: e */
    public final boolean f249042e;

    public w8z(String str, eyl0 eyl0Var, boolean z, Map map, boolean z2) {
        this.f249038a = str;
        this.f249039b = eyl0Var;
        this.f249040c = z;
        this.f249041d = map;
        this.f249042e = z2;
    }

    /* JADX INFO: renamed from: a */
    public static w8z m87477a(w8z w8zVar, String str, eyl0 eyl0Var, Map map, int i) {
        if ((i & 1) != 0) {
            str = w8zVar.f249038a;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            eyl0Var = w8zVar.f249039b;
        }
        eyl0 eyl0Var2 = eyl0Var;
        boolean z = (i & 4) != 0 ? w8zVar.f249040c : false;
        if ((i & 8) != 0) {
            map = w8zVar.f249041d;
        }
        boolean z2 = w8zVar.f249042e;
        w8zVar.getClass();
        return new w8z(str2, eyl0Var2, z, map, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8z)) {
            return false;
        }
        w8z w8zVar = (w8z) obj;
        return wj50.m88271j(this.f249038a, w8zVar.f249038a) && wj50.m88271j(this.f249039b, w8zVar.f249039b) && this.f249040c == w8zVar.f249040c && wj50.m88271j(this.f249041d, w8zVar.f249041d) && this.f249042e == w8zVar.f249042e;
    }

    public final int hashCode() {
        String str = this.f249038a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        eyl0 eyl0Var = this.f249039b;
        return Boolean.hashCode(this.f249042e) + edb.m38557f(s571.m77245d((iHashCode + (eyl0Var != null ? eyl0Var.hashCode() : 0)) * 31, 31, this.f249040c), 31, this.f249041d);
    }
}
