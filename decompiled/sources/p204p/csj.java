package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class csj extends dsj {

    /* JADX INFO: renamed from: a */
    public final String f41621a;

    public csj(String str) {
        this.f41621a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof csj) && wj50.m88271j(this.f41621a, ((csj) obj).f41621a);
    }

    public final int hashCode() {
        return this.f41621a.hashCode();
    }
}
