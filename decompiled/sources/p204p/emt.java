package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class emt implements pmt {

    /* JADX INFO: renamed from: a */
    public final String f60980a;

    public emt(String str) {
        this.f60980a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof emt) && wj50.m88271j(this.f60980a, ((emt) obj).f60980a);
    }

    public final int hashCode() {
        return this.f60980a.hashCode();
    }
}
