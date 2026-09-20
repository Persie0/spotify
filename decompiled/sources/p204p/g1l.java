package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class g1l implements h2l {

    /* JADX INFO: renamed from: a */
    public final String f75649a;

    public g1l(String str) {
        this.f75649a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g1l) && wj50.m88271j(this.f75649a, ((g1l) obj).f75649a);
    }

    public final int hashCode() {
        return this.f75649a.hashCode();
    }
}
