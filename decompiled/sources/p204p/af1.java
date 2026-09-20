package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class af1 implements cf1 {

    /* JADX INFO: renamed from: a */
    public final String f14998a;

    public af1(String str) {
        this.f14998a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof af1) && wj50.m88271j(this.f14998a, ((af1) obj).f14998a);
    }

    public final int hashCode() {
        return this.f14998a.hashCode();
    }
}
