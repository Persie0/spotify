package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class mfj implements pfj {

    /* JADX INFO: renamed from: a */
    public final String f143074a;

    public mfj(String str) {
        this.f143074a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mfj) && wj50.m88271j(this.f143074a, ((mfj) obj).f143074a);
    }

    public final int hashCode() {
        return this.f143074a.hashCode();
    }
}
