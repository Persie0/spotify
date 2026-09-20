package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class dm2 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f50402a;

    /* JADX INFO: renamed from: b */
    public final String f50403b;

    public dm2(ArrayList arrayList, String str) {
        this.f50402a = arrayList;
        this.f50403b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dm2)) {
            return false;
        }
        dm2 dm2Var = (dm2) obj;
        return this.f50402a.equals(dm2Var.f50402a) && wj50.m88271j(this.f50403b, dm2Var.f50403b);
    }

    public final int hashCode() {
        int iHashCode = this.f50402a.hashCode() * 31;
        String str = this.f50403b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
