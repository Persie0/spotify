package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ltw0 implements ntw0 {

    /* JADX INFO: renamed from: a */
    public final String f136873a;

    public ltw0(String str) {
        this.f136873a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ltw0) && wj50.m88271j(this.f136873a, ((ltw0) obj).f136873a);
    }

    public final int hashCode() {
        return this.f136873a.hashCode();
    }
}
