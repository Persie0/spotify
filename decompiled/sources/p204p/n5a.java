package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class n5a {

    /* JADX INFO: renamed from: a */
    public final String f150509a;

    public n5a(String str) {
        this.f150509a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n5a) && wj50.m88271j(this.f150509a, ((n5a) obj).f150509a);
    }

    public final int hashCode() {
        return this.f150509a.hashCode();
    }
}
