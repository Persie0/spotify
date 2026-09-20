package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class o7b0 extends t7b0 {

    /* JADX INFO: renamed from: a */
    public final String f162509a;

    public o7b0(String str) {
        this.f162509a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o7b0) && wj50.m88271j(this.f162509a, ((o7b0) obj).f162509a);
    }

    public final int hashCode() {
        return this.f162509a.hashCode();
    }
}
