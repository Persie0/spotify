package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class q3k extends z2h1 {

    /* JADX INFO: renamed from: b */
    public final t3k f184894b;

    /* JADX INFO: renamed from: c */
    public final t3k f184895c;

    public q3k(t3k t3kVar, t3k t3kVar2) {
        this.f184894b = t3kVar;
        this.f184895c = t3kVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3k)) {
            return false;
        }
        q3k q3kVar = (q3k) obj;
        return wj50.m88271j(this.f184894b, q3kVar.f184894b) && wj50.m88271j(this.f184895c, q3kVar.f184895c);
    }

    public final int hashCode() {
        return this.f184895c.hashCode() + (this.f184894b.hashCode() * 31);
    }
}
