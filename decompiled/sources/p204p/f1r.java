package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class f1r {

    /* JADX INFO: renamed from: a */
    public final String f64952a;

    public f1r(String str) {
        this.f64952a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f1r) && wj50.m88271j(this.f64952a, ((f1r) obj).f64952a);
    }

    public final int hashCode() {
        return this.f64952a.hashCode();
    }
}
