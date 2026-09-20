package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class nzj0 implements rzj0 {

    /* JADX INFO: renamed from: a */
    public final String f160099a;

    public nzj0(String str) {
        this.f160099a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nzj0) && wj50.m88271j(this.f160099a, ((nzj0) obj).f160099a);
    }

    public final int hashCode() {
        return this.f160099a.hashCode();
    }
}
