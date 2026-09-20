package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class c8z extends f8z {

    /* JADX INFO: renamed from: a */
    public final String f35336a;

    /* JADX INFO: renamed from: b */
    public final boolean f35337b;

    public c8z(String str, boolean z) {
        this.f35336a = str;
        this.f35337b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8z)) {
            return false;
        }
        c8z c8zVar = (c8z) obj;
        return wj50.m88271j(this.f35336a, c8zVar.f35336a) && this.f35337b == c8zVar.f35337b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f35337b) + (this.f35336a.hashCode() * 31);
    }
}
