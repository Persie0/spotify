package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class de70 {

    /* JADX INFO: renamed from: a */
    public final String f47997a;

    /* JADX INFO: renamed from: b */
    public final long f47998b;

    public de70(String str, long j) {
        this.f47997a = str;
        this.f47998b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof de70)) {
            return false;
        }
        de70 de70Var = (de70) obj;
        if (!wj50.m88271j(this.f47997a, de70Var.f47997a)) {
            return false;
        }
        long j = de70Var.f47998b;
        int i = n6f.f150872l;
        return as91.m27074b(this.f47998b, j);
    }

    public final int hashCode() {
        int iHashCode = this.f47997a.hashCode() * 31;
        int i = n6f.f150872l;
        return Long.hashCode(this.f47998b) + iHashCode;
    }
}
