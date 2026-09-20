package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class h5t extends o5t {

    /* JADX INFO: renamed from: a */
    public final String f87897a;

    public h5t(String str) {
        this.f87897a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h5t) && wj50.m88271j(this.f87897a, ((h5t) obj).f87897a);
    }

    public final int hashCode() {
        return this.f87897a.hashCode();
    }
}
