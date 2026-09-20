package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qe11 implements ze11 {

    /* JADX INFO: renamed from: a */
    public final String f187827a;

    public qe11(String str) {
        this.f187827a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qe11) && wj50.m88271j(this.f187827a, ((qe11) obj).f187827a);
    }

    public final int hashCode() {
        return this.f187827a.hashCode();
    }
}
