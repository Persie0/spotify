package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class j9x implements m9x {

    /* JADX INFO: renamed from: a */
    public final String f110263a;

    public j9x(String str) {
        this.f110263a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j9x) && wj50.m88271j(this.f110263a, ((j9x) obj).f110263a);
    }

    public final int hashCode() {
        return this.f110263a.hashCode();
    }
}
