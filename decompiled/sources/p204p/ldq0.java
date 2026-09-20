package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ldq0 implements pdq0 {

    /* JADX INFO: renamed from: a */
    public final String f132320a;

    public ldq0(String str) {
        this.f132320a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ldq0) && wj50.m88271j(this.f132320a, ((ldq0) obj).f132320a);
    }

    public final int hashCode() {
        return this.f132320a.hashCode();
    }
}
