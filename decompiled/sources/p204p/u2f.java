package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class u2f {

    /* JADX INFO: renamed from: a */
    public final boolean f226089a;

    /* JADX INFO: renamed from: b */
    public final String f226090b;

    public u2f(boolean z, String str) {
        this.f226089a = z;
        this.f226090b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2f)) {
            return false;
        }
        u2f u2fVar = (u2f) obj;
        return this.f226089a == u2fVar.f226089a && wj50.m88271j(this.f226090b, u2fVar.f226090b);
    }

    public final int hashCode() {
        return this.f226090b.hashCode() + (Boolean.hashCode(this.f226089a) * 31);
    }
}
