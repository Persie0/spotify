package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class udc {

    /* JADX INFO: renamed from: a */
    public final String f229224a;

    public udc(String str) {
        this.f229224a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof udc) && wj50.m88271j(this.f229224a, ((udc) obj).f229224a);
    }

    public final int hashCode() {
        return this.f229224a.hashCode();
    }
}
