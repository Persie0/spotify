package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class sl90 extends xl90 {

    /* JADX INFO: renamed from: a */
    public final Exception f210324a;

    public sl90(Exception exc) {
        this.f210324a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sl90) && wj50.m88271j(this.f210324a, ((sl90) obj).f210324a);
    }

    public final int hashCode() {
        return this.f210324a.hashCode();
    }
}
