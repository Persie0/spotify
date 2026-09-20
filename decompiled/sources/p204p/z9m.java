package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class z9m {

    /* JADX INFO: renamed from: a */
    public final String f280828a;

    /* JADX INFO: renamed from: b */
    public final String f280829b;

    public z9m(String str, String str2) {
        this.f280828a = str;
        this.f280829b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z9m)) {
            return false;
        }
        z9m z9mVar = (z9m) obj;
        return wj50.m88271j(this.f280828a, z9mVar.f280828a) && wj50.m88271j(this.f280829b, z9mVar.f280829b);
    }

    public final int hashCode() {
        return this.f280829b.hashCode() + (this.f280828a.hashCode() * 31);
    }
}
