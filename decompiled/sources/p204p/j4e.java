package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class j4e {

    /* JADX INFO: renamed from: a */
    public final ar91 f108673a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f108674b;

    /* JADX INFO: renamed from: c */
    public final int f108675c;

    public j4e(ar91 ar91Var, ArrayList arrayList, int i) {
        this.f108673a = ar91Var;
        this.f108674b = arrayList;
        this.f108675c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4e)) {
            return false;
        }
        j4e j4eVar = (j4e) obj;
        return this.f108673a.equals(j4eVar.f108673a) && this.f108674b.equals(j4eVar.f108674b) && this.f108675c == j4eVar.f108675c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f108675c) + lq51.m59700f(this.f108674b, this.f108673a.hashCode() * 31, 31);
    }
}
