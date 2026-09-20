package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class sz80 {

    /* JADX INFO: renamed from: a */
    public final String f215425a;

    /* JADX INFO: renamed from: b */
    public final long f215426b;

    public sz80(String str, long j) {
        this.f215425a = str;
        this.f215426b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sz80)) {
            return false;
        }
        sz80 sz80Var = (sz80) obj;
        return wj50.m88271j(this.f215425a, sz80Var.f215425a) && this.f215426b == sz80Var.f215426b;
    }

    public final int hashCode() {
        String str = this.f215425a;
        return Long.hashCode(this.f215426b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
