package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class kwf1 {

    /* JADX INFO: renamed from: a */
    public final String f127089a;

    public kwf1(String str) {
        this.f127089a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kwf1) {
            return this.f127089a.equals(((kwf1) obj).f127089a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f127089a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return dq60.m36616p(this.f127089a, "}", new StringBuilder("AddonExceptionMetadata{packageName="));
    }
}
