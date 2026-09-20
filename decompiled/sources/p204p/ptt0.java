package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class ptt0 {

    /* JADX INFO: renamed from: a */
    public final be01 f181254a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f181255b;

    public ptt0(be01 be01Var, ArrayList arrayList) {
        this.f181254a = be01Var;
        this.f181255b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ptt0)) {
            return false;
        }
        ptt0 ptt0Var = (ptt0) obj;
        return this.f181254a.equals(ptt0Var.f181254a) && this.f181255b.equals(ptt0Var.f181255b);
    }

    public final int hashCode() {
        return this.f181255b.hashCode() + (this.f181254a.f26239a.hashCode() * 31);
    }
}
