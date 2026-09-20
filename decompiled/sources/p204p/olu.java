package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class olu implements slu {

    /* JADX INFO: renamed from: a */
    public final tlu f166923a;

    public olu(tlu tluVar) {
        this.f166923a = tluVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof olu) && wj50.m88271j(this.f166923a, ((olu) obj).f166923a);
    }

    public final int hashCode() {
        return this.f166923a.hashCode();
    }
}
