package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class c1l implements h2l {

    /* JADX INFO: renamed from: a */
    public final String f33150a;

    public c1l(String str) {
        this.f33150a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c1l) && wj50.m88271j(this.f33150a, ((c1l) obj).f33150a);
    }

    public final int hashCode() {
        return this.f33150a.hashCode();
    }
}
