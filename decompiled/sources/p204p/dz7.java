package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dz7 extends l3l {

    /* JADX INFO: renamed from: a */
    public final List f54546a;

    /* JADX INFO: renamed from: b */
    public final String f54547b;

    public dz7(List list, String str) {
        this.f54546a = list;
        this.f54547b = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof l3l) {
            dz7 dz7Var = (dz7) ((l3l) obj);
            String str2 = dz7Var.f54547b;
            if (this.f54546a.equals(dz7Var.f54546a) && ((str = this.f54547b) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f54546a.hashCode() ^ 1000003) * 1000003;
        String str = this.f54547b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.f54546a);
        sb.append(", orgId=");
        return dq60.m36616p(this.f54547b, "}", sb);
    }
}
