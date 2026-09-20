package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class f0l implements h2l {

    /* JADX INFO: renamed from: a */
    public final String f64680a;

    public f0l(String str) {
        this.f64680a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0l) && wj50.m88271j(this.f64680a, ((f0l) obj).f64680a);
    }

    public final int hashCode() {
        return this.f64680a.hashCode();
    }
}
