package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class r0c0 implements s0c0 {

    /* JADX INFO: renamed from: a */
    public final String f194428a;

    public r0c0(String str) {
        this.f194428a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0c0) && wj50.m88271j(this.f194428a, ((r0c0) obj).f194428a);
    }

    public final int hashCode() {
        return this.f194428a.hashCode();
    }
}
