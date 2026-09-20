package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xbb0 implements zbb0 {

    /* JADX INFO: renamed from: a */
    public final String f259878a;

    public xbb0(String str) {
        this.f259878a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xbb0) && wj50.m88271j(this.f259878a, ((xbb0) obj).f259878a);
    }

    public final int hashCode() {
        return this.f259878a.hashCode();
    }
}
