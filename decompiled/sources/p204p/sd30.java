package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class sd30 implements td30 {

    /* JADX INFO: renamed from: a */
    public final String f207871a;

    public sd30(String str) {
        this.f207871a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sd30) && wj50.m88271j(this.f207871a, ((sd30) obj).f207871a);
    }

    public final int hashCode() {
        return this.f207871a.hashCode();
    }
}
