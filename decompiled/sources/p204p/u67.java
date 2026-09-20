package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class u67 implements y67 {

    /* JADX INFO: renamed from: a */
    public final String f227234a;

    public u67(String str) {
        this.f227234a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u67) && wj50.m88271j(this.f227234a, ((u67) obj).f227234a);
    }

    public final int hashCode() {
        return this.f227234a.hashCode();
    }
}
