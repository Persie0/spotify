package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ze00 {

    /* JADX INFO: renamed from: a */
    public final String f281841a;

    /* JADX INFO: renamed from: b */
    public final String f281842b;

    /* JADX INFO: renamed from: c */
    public final boolean f281843c;

    public ze00(String str, String str2, boolean z) {
        this.f281841a = str;
        this.f281842b = str2;
        this.f281843c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ze00)) {
            return false;
        }
        ze00 ze00Var = (ze00) obj;
        return wj50.m88271j(this.f281841a, ze00Var.f281841a) && wj50.m88271j(this.f281842b, ze00Var.f281842b) && this.f281843c == ze00Var.f281843c;
    }

    public final int hashCode() {
        int iHashCode = this.f281841a.hashCode() * 31;
        String str = this.f281842b;
        return Boolean.hashCode(this.f281843c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
