package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class v521 extends n321 {

    /* JADX INFO: renamed from: a */
    public final String f237299a;

    /* JADX INFO: renamed from: b */
    public final Object f237300b;

    public v521(String str, Object obj) {
        this.f237299a = str;
        this.f237300b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v521)) {
            return false;
        }
        v521 v521Var = (v521) obj;
        return wj50.m88271j(this.f237299a, v521Var.f237299a) && wj50.m88271j(this.f237300b, v521Var.f237300b);
    }

    public final int hashCode() {
        return s6x0.m77349b(this.f237300b) + (this.f237299a.hashCode() * 31);
    }
}
