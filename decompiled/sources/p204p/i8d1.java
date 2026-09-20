package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class i8d1 {

    /* JADX INFO: renamed from: a */
    public final String f99762a;

    public i8d1(String str) {
        this.f99762a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i8d1) && wj50.m88271j(this.f99762a, ((i8d1) obj).f99762a);
    }

    public final int hashCode() {
        return this.f99762a.hashCode();
    }
}
