package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class n5c {

    /* JADX INFO: renamed from: a */
    public final String f150524a;

    public n5c(String str) {
        this.f150524a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n5c) && wj50.m88271j(this.f150524a, ((n5c) obj).f150524a);
    }

    public final int hashCode() {
        return this.f150524a.hashCode();
    }
}
