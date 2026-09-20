package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class f5y0 {

    /* JADX INFO: renamed from: a */
    public final String f66222a;

    public f5y0(String str) {
        this.f66222a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f5y0) && wj50.m88271j(this.f66222a, ((f5y0) obj).f66222a);
    }

    public final int hashCode() {
        return this.f66222a.hashCode();
    }
}
