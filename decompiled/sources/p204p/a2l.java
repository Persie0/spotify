package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class a2l implements h2l {

    /* JADX INFO: renamed from: a */
    public final String f11693a;

    public a2l(String str) {
        this.f11693a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a2l) && wj50.m88271j(this.f11693a, ((a2l) obj).f11693a);
    }

    public final int hashCode() {
        return this.f11693a.hashCode();
    }
}
