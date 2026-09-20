package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class k2b {

    /* JADX INFO: renamed from: a */
    public final String f118586a;

    public k2b(String str) {
        this.f118586a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k2b) && wj50.m88271j(this.f118586a, ((k2b) obj).f118586a);
    }

    public final int hashCode() {
        return this.f118586a.hashCode();
    }
}
