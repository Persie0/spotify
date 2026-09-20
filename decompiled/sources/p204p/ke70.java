package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ke70 {

    /* JADX INFO: renamed from: a */
    public final String f121822a;

    /* JADX INFO: renamed from: b */
    public final String f121823b;

    /* JADX INFO: renamed from: c */
    public final boolean f121824c;

    public ke70(String str, String str2, boolean z) {
        this.f121822a = str;
        this.f121823b = str2;
        this.f121824c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ke70)) {
            return false;
        }
        ke70 ke70Var = (ke70) obj;
        return wj50.m88271j(this.f121822a, ke70Var.f121822a) && wj50.m88271j(this.f121823b, ke70Var.f121823b) && this.f121824c == ke70Var.f121824c;
    }

    public final int hashCode() {
        int iHashCode = this.f121822a.hashCode() * 31;
        String str = this.f121823b;
        return Boolean.hashCode(this.f121824c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
