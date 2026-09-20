package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class m3j implements o3j {

    /* JADX INFO: renamed from: a */
    public final String f139670a;

    /* JADX INFO: renamed from: b */
    public final boolean f139671b;

    public m3j(String str, boolean z) {
        this.f139670a = str;
        this.f139671b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3j)) {
            return false;
        }
        m3j m3jVar = (m3j) obj;
        return wj50.m88271j(this.f139670a, m3jVar.f139670a) && this.f139671b == m3jVar.f139671b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f139671b) + (this.f139670a.hashCode() * 31);
    }
}
