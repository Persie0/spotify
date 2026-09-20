package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class r6l implements x6l {

    /* JADX INFO: renamed from: a */
    public final String f196314a;

    public r6l(String str) {
        this.f196314a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r6l) && wj50.m88271j(this.f196314a, ((r6l) obj).f196314a);
    }

    public final int hashCode() {
        String str = this.f196314a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
