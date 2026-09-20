package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class mj01 implements oj01 {

    /* JADX INFO: renamed from: a */
    public final String f144141a;

    public mj01(String str) {
        this.f144141a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mj01) && wj50.m88271j(this.f144141a, ((mj01) obj).f144141a);
    }

    public final int hashCode() {
        return this.f144141a.hashCode();
    }
}
