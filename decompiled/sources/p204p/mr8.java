package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class mr8 {

    /* JADX INFO: renamed from: a */
    public final String f146446a;

    /* JADX INFO: renamed from: b */
    public final String f146447b;

    public mr8(String str, String str2) {
        this.f146446a = str;
        this.f146447b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mr8)) {
            return false;
        }
        mr8 mr8Var = (mr8) obj;
        return wj50.m88271j(this.f146446a, mr8Var.f146446a) && wj50.m88271j(this.f146447b, mr8Var.f146447b);
    }

    public final int hashCode() {
        return this.f146447b.hashCode() + (this.f146446a.hashCode() * 31);
    }
}
