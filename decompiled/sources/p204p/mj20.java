package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class mj20 {

    /* JADX INFO: renamed from: a */
    public final String f144150a;

    public mj20(String str) {
        this.f144150a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mj20) && wj50.m88271j(this.f144150a, ((mj20) obj).f144150a);
    }

    public final int hashCode() {
        return this.f144150a.hashCode();
    }
}
