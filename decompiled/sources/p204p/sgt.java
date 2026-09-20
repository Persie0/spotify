package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class sgt implements ymt {

    /* JADX INFO: renamed from: a */
    public final String f208931a;

    public sgt(String str) {
        this.f208931a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sgt) && wj50.m88271j(this.f208931a, ((sgt) obj).f208931a);
    }

    public final int hashCode() {
        return this.f208931a.hashCode();
    }
}
