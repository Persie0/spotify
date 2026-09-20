package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class quh implements l630 {

    /* JADX INFO: renamed from: a */
    public final p1i f192714a;

    /* JADX INFO: renamed from: b */
    public final String f192715b;

    /* JADX INFO: renamed from: c */
    public final b250 f192716c;

    public quh(p1i p1iVar, String str, b250 b250Var) {
        this.f192714a = p1iVar;
        this.f192715b = str;
        this.f192716c = b250Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof quh)) {
            return false;
        }
        quh quhVar = (quh) obj;
        return wj50.m88271j(this.f192714a, quhVar.f192714a) && wj50.m88271j(this.f192715b, quhVar.f192715b) && wj50.m88271j(this.f192716c, quhVar.f192716c);
    }

    @Override // p204p.l630
    public final String getId() {
        return this.f192715b;
    }

    public final int hashCode() {
        return this.f192716c.hashCode() + s571.m77243b(this.f192714a.hashCode() * 31, 31, this.f192715b);
    }
}
