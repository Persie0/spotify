package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class z1l implements h2l {

    /* JADX INFO: renamed from: a */
    public final String f278326a;

    public z1l(String str) {
        this.f278326a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z1l) && wj50.m88271j(this.f278326a, ((z1l) obj).f278326a);
    }

    public final int hashCode() {
        return this.f278326a.hashCode();
    }
}
