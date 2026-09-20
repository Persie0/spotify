package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class i8i extends w8i {

    /* JADX INFO: renamed from: a */
    public final String f99793a;

    public i8i(String str) {
        this.f99793a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i8i) && wj50.m88271j(this.f99793a, ((i8i) obj).f99793a);
    }

    public final int hashCode() {
        return this.f99793a.hashCode();
    }
}
