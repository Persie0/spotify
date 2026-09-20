package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class m8i extends w8i {

    /* JADX INFO: renamed from: a */
    public final ban0 f141055a;

    public m8i(ban0 ban0Var) {
        this.f141055a = ban0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m8i) && wj50.m88271j(this.f141055a, ((m8i) obj).f141055a);
    }

    public final int hashCode() {
        return this.f141055a.hashCode();
    }
}
