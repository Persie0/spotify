package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class zkj implements blj {

    /* JADX INFO: renamed from: a */
    public final String f283775a;

    public zkj(String str) {
        this.f283775a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zkj) && wj50.m88271j(this.f283775a, ((zkj) obj).f283775a);
    }

    public final int hashCode() {
        return this.f283775a.hashCode();
    }
}
