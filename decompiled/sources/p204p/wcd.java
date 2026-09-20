package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class wcd implements qdd {

    /* JADX INFO: renamed from: a */
    public final String f250018a;

    public wcd(String str) {
        this.f250018a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wcd) && wj50.m88271j(this.f250018a, ((wcd) obj).f250018a);
    }

    public final int hashCode() {
        return this.f250018a.hashCode();
    }
}
