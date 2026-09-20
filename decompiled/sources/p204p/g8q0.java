package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class g8q0 extends i8q0 {

    /* JADX INFO: renamed from: a */
    public final Exception f77574a;

    public g8q0(Exception exc) {
        this.f77574a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g8q0) && wj50.m88271j(this.f77574a, ((g8q0) obj).f77574a);
    }

    public final int hashCode() {
        return this.f77574a.hashCode();
    }
}
