package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gll implements jll {

    /* JADX INFO: renamed from: a */
    public final String f81106a;

    public gll(String str) {
        this.f81106a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gll) && wj50.m88271j(this.f81106a, ((gll) obj).f81106a);
    }

    public final int hashCode() {
        return this.f81106a.hashCode();
    }
}
