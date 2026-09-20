package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class hwt implements iwt {

    /* JADX INFO: renamed from: a */
    public final String f96042a;

    public hwt(String str) {
        this.f96042a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hwt) && wj50.m88271j(this.f96042a, ((hwt) obj).f96042a);
    }

    public final int hashCode() {
        return this.f96042a.hashCode();
    }
}
