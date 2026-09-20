package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class b7b0 extends t7b0 {

    /* JADX INFO: renamed from: a */
    public final String f24205a;

    public b7b0(String str) {
        this.f24205a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b7b0) && wj50.m88271j(this.f24205a, ((b7b0) obj).f24205a);
    }

    public final int hashCode() {
        return this.f24205a.hashCode();
    }
}
