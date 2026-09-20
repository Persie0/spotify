package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ril implements vil {

    /* JADX INFO: renamed from: a */
    public final String f199570a;

    /* JADX INFO: renamed from: b */
    public final long f199571b;

    public ril(String str, long j) {
        this.f199570a = str;
        this.f199571b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ril)) {
            return false;
        }
        ril rilVar = (ril) obj;
        return wj50.m88271j(this.f199570a, rilVar.f199570a) && this.f199571b == rilVar.f199571b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f199571b) + (this.f199570a.hashCode() * 31);
    }
}
