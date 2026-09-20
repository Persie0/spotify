package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class r3i0 implements s3i0 {

    /* JADX INFO: renamed from: a */
    public final String f195513a;

    /* JADX INFO: renamed from: b */
    public final String f195514b;

    public r3i0(String str, String str2) {
        this.f195513a = str;
        this.f195514b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r3i0)) {
            return false;
        }
        r3i0 r3i0Var = (r3i0) obj;
        return wj50.m88271j(this.f195513a, r3i0Var.f195513a) && wj50.m88271j(this.f195514b, r3i0Var.f195514b);
    }

    public final int hashCode() {
        return this.f195514b.hashCode() + (this.f195513a.hashCode() * 31);
    }
}
