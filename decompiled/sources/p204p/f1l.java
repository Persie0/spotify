package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class f1l implements h2l {

    /* JADX INFO: renamed from: a */
    public final String f64923a;

    public f1l(String str) {
        this.f64923a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f1l) && wj50.m88271j(this.f64923a, ((f1l) obj).f64923a);
    }

    public final int hashCode() {
        return this.f64923a.hashCode();
    }
}
