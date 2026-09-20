package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ndr0 implements pdr0 {

    /* JADX INFO: renamed from: a */
    public final String f152828a;

    public ndr0(String str) {
        this.f152828a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ndr0) && wj50.m88271j(this.f152828a, ((ndr0) obj).f152828a);
    }

    public final int hashCode() {
        return this.f152828a.hashCode();
    }
}
