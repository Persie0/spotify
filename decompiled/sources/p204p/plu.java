package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class plu implements slu {

    /* JADX INFO: renamed from: a */
    public final tlu f178783a;

    public plu(tlu tluVar) {
        this.f178783a = tluVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof plu) && wj50.m88271j(this.f178783a, ((plu) obj).f178783a);
    }

    public final int hashCode() {
        return this.f178783a.hashCode();
    }
}
