package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class e1x implements y2x {

    /* JADX INFO: renamed from: a */
    public final String f55267a;

    /* JADX INFO: renamed from: b */
    public final String f55268b;

    /* JADX INFO: renamed from: c */
    public final Throwable f55269c;

    public e1x(String str, String str2, Throwable th) {
        this.f55267a = str;
        this.f55268b = str2;
        this.f55269c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1x)) {
            return false;
        }
        e1x e1xVar = (e1x) obj;
        if (!wj50.m88271j(this.f55267a, e1xVar.f55267a)) {
            return false;
        }
        String str = e1xVar.f55268b;
        wp6 wp6Var = jvw0.f116535b;
        return wj50.m88271j(this.f55268b, str) && wj50.m88271j(this.f55269c, e1xVar.f55269c);
    }

    public final int hashCode() {
        int iHashCode = this.f55267a.hashCode() * 31;
        wp6 wp6Var = jvw0.f116535b;
        return this.f55269c.hashCode() + s571.m77243b(iHashCode, 31, this.f55268b);
    }
}
