package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class rwb {

    /* JADX INFO: renamed from: a */
    public final String f203314a;

    /* JADX INFO: renamed from: b */
    public final long f203315b;

    public rwb(String str, long j) {
        this.f203314a = str;
        this.f203315b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rwb)) {
            return false;
        }
        rwb rwbVar = (rwb) obj;
        return wj50.m88271j(this.f203314a, rwbVar.f203314a) && this.f203315b == rwbVar.f203315b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f203315b) + (this.f203314a.hashCode() * 31);
    }
}
