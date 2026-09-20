package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class qdu implements udu {

    /* JADX INFO: renamed from: a */
    public final String f187755a;

    public qdu(String str) {
        this.f187755a = str;
        if (wl51.m88460J0(str)) {
            throw new IllegalArgumentException("Please consider providing a non-empty disabled reason to provide a more accessible experience for everyone.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qdu) && wj50.m88271j(this.f187755a, ((qdu) obj).f187755a);
    }

    public final int hashCode() {
        return this.f187755a.hashCode();
    }
}
