package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class htb0 implements itb0 {

    /* JADX INFO: renamed from: a */
    public final String f94974a;

    /* JADX INFO: renamed from: b */
    public final String f94975b;

    /* JADX INFO: renamed from: c */
    public final boolean f94976c;

    public htb0(String str, String str2, boolean z) {
        this.f94974a = str;
        this.f94975b = str2;
        this.f94976c = z;
    }

    @Override // p204p.itb0
    /* JADX INFO: renamed from: a */
    public final boolean mo45686a() {
        return this.f94976c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof htb0)) {
            return false;
        }
        htb0 htb0Var = (htb0) obj;
        return wj50.m88271j(this.f94974a, htb0Var.f94974a) && wj50.m88271j(this.f94975b, htb0Var.f94975b) && this.f94976c == htb0Var.f94976c;
    }

    @Override // p204p.itb0
    public final String getEntityUri() {
        return this.f94975b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f94976c) + s571.m77243b(this.f94974a.hashCode() * 31, 31, this.f94975b);
    }
}
