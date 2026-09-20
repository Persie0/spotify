package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dmr {

    /* JADX INFO: renamed from: a */
    public final String f50603a;

    public dmr(String str) {
        this.f50603a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dmr) && wj50.m88271j(this.f50603a, ((dmr) obj).f50603a);
    }

    public final int hashCode() {
        return this.f50603a.hashCode();
    }
}
