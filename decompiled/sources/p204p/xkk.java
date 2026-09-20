package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xkk {

    /* JADX INFO: renamed from: a */
    public final String f262385a;

    /* JADX INFO: renamed from: b */
    public final long f262386b;

    public xkk(String str, long j) {
        this.f262385a = str;
        this.f262386b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xkk)) {
            return false;
        }
        xkk xkkVar = (xkk) obj;
        if (!wj50.m88271j(this.f262385a, xkkVar.f262385a)) {
            return false;
        }
        long j = xkkVar.f262386b;
        int i = n6f.f150872l;
        return as91.m27074b(this.f262386b, j);
    }

    public final int hashCode() {
        int iHashCode = this.f262385a.hashCode() * 31;
        int i = n6f.f150872l;
        return Long.hashCode(this.f262386b) + iHashCode;
    }
}
