package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ptb1 extends rtb1 {

    /* JADX INFO: renamed from: a */
    public final String f181098a;

    public ptb1(String str) {
        this.f181098a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ptb1) && wj50.m88271j(this.f181098a, ((ptb1) obj).f181098a);
    }

    public final int hashCode() {
        return this.f181098a.hashCode();
    }
}
