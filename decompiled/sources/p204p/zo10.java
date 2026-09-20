package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class zo10 implements bp10 {

    /* JADX INFO: renamed from: a */
    public final Exception f284620a;

    public zo10(Exception exc) {
        this.f284620a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zo10) && wj50.m88271j(this.f284620a, ((zo10) obj).f284620a);
    }

    public final int hashCode() {
        return this.f284620a.hashCode();
    }
}
