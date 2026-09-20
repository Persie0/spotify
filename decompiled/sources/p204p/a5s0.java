package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class a5s0 implements c5s0 {

    /* JADX INFO: renamed from: a */
    public final String f12594a;

    public a5s0(String str) {
        this.f12594a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a5s0) && wj50.m88271j(this.f12594a, ((a5s0) obj).f12594a);
    }

    public final int hashCode() {
        return this.f12594a.hashCode();
    }
}
