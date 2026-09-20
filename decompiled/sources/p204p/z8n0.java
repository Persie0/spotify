package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class z8n0 extends c9n0 {

    /* JADX INFO: renamed from: a */
    public final String f280503a;

    public z8n0(String str) {
        this.f280503a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z8n0) && wj50.m88271j(this.f280503a, ((z8n0) obj).f280503a);
    }

    public final int hashCode() {
        return this.f280503a.hashCode();
    }

    public final String toString() {
        return "LocalVerifyPassword()";
    }
}
