package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class aai extends nai {

    /* JADX INFO: renamed from: a */
    public final d5x f13848a;

    public aai(d5x d5xVar) {
        this.f13848a = d5xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aai) && wj50.m88271j(this.f13848a, ((aai) obj).f13848a);
    }

    public final int hashCode() {
        return this.f13848a.hashCode();
    }
}
