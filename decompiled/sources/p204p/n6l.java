package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class n6l implements p6l {

    /* JADX INFO: renamed from: a */
    public final String f150906a;

    public n6l(String str) {
        this.f150906a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n6l) && wj50.m88271j(this.f150906a, ((n6l) obj).f150906a);
    }

    public final int hashCode() {
        return this.f150906a.hashCode();
    }
}
