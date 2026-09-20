package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class lns0 implements mns0 {

    /* JADX INFO: renamed from: a */
    public final String f135220a;

    public lns0(String str) {
        this.f135220a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lns0) && wj50.m88271j(this.f135220a, ((lns0) obj).f135220a);
    }

    public final int hashCode() {
        return this.f135220a.hashCode();
    }
}
