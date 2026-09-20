package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class a040 implements b040 {

    /* JADX INFO: renamed from: a */
    public final String f10988a;

    public a040(String str) {
        this.f10988a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a040) && wj50.m88271j(this.f10988a, ((a040) obj).f10988a);
    }

    public final int hashCode() {
        return this.f10988a.hashCode();
    }
}
