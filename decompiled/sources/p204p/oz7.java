package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class oz7 extends w3l {

    /* JADX INFO: renamed from: a */
    public final u3l f172141a;

    /* JADX INFO: renamed from: b */
    public final List f172142b;

    /* JADX INFO: renamed from: c */
    public final List f172143c;

    /* JADX INFO: renamed from: d */
    public final Boolean f172144d;

    /* JADX INFO: renamed from: e */
    public final v3l f172145e;

    /* JADX INFO: renamed from: f */
    public final List f172146f;

    /* JADX INFO: renamed from: g */
    public final int f172147g;

    public oz7(u3l u3lVar, List list, List list2, Boolean bool, v3l v3lVar, List list3, int i) {
        this.f172141a = u3lVar;
        this.f172142b = list;
        this.f172143c = list2;
        this.f172144d = bool;
        this.f172145e = v3lVar;
        this.f172146f = list3;
        this.f172147g = i;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        Boolean bool;
        v3l v3lVar;
        List list3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof w3l) {
            oz7 oz7Var = (oz7) ((w3l) obj);
            List list4 = oz7Var.f172146f;
            v3l v3lVar2 = oz7Var.f172145e;
            Boolean bool2 = oz7Var.f172144d;
            List list5 = oz7Var.f172143c;
            List list6 = oz7Var.f172142b;
            if (this.f172141a.equals(oz7Var.f172141a) && ((list = this.f172142b) != null ? list.equals(list6) : list6 == null) && ((list2 = this.f172143c) != null ? list2.equals(list5) : list5 == null) && ((bool = this.f172144d) != null ? bool.equals(bool2) : bool2 == null) && ((v3lVar = this.f172145e) != null ? v3lVar.equals(v3lVar2) : v3lVar2 == null) && ((list3 = this.f172146f) != null ? list3.equals(list4) : list4 == null) && this.f172147g == oz7Var.f172147g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f172141a.hashCode() ^ 1000003) * 1000003;
        List list = this.f172142b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f172143c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f172144d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        v3l v3lVar = this.f172145e;
        int iHashCode5 = (iHashCode4 ^ (v3lVar == null ? 0 : v3lVar.hashCode())) * 1000003;
        List list3 = this.f172146f;
        return ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.f172147g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.f172141a);
        sb.append(", customAttributes=");
        sb.append(this.f172142b);
        sb.append(", internalKeys=");
        sb.append(this.f172143c);
        sb.append(", background=");
        sb.append(this.f172144d);
        sb.append(", currentProcessDetails=");
        sb.append(this.f172145e);
        sb.append(", appProcessDetails=");
        sb.append(this.f172146f);
        sb.append(", uiOrientation=");
        return klh.m56832d(this.f172147g, "}", sb);
    }
}
