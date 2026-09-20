package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class n4i {

    /* JADX INFO: renamed from: a */
    public final String f150348a;

    public n4i(String str) {
        this.f150348a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n4i) && wj50.m88271j(this.f150348a, ((n4i) obj).f150348a);
    }

    public final int hashCode() {
        return this.f150348a.hashCode();
    }
}
