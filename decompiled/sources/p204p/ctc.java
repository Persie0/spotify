package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ctc implements btc {

    /* JADX INFO: renamed from: a */
    public final String f41852a;

    public ctc(String str) {
        this.f41852a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ctc) && wj50.m88271j(this.f41852a, ((ctc) obj).f41852a);
    }

    public final int hashCode() {
        return this.f41852a.hashCode();
    }
}
