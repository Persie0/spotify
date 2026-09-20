package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class vp50 {

    /* JADX INFO: renamed from: a */
    public final String f243598a;

    /* JADX INFO: renamed from: b */
    public final String f243599b;

    public vp50(String str, String str2) {
        this.f243598a = str;
        this.f243599b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp50)) {
            return false;
        }
        vp50 vp50Var = (vp50) obj;
        return wj50.m88271j(this.f243598a, vp50Var.f243598a) && wj50.m88271j(this.f243599b, vp50Var.f243599b);
    }

    public final int hashCode() {
        return this.f243599b.hashCode() + (this.f243598a.hashCode() * 31);
    }
}
