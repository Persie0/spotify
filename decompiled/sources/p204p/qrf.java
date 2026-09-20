package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qrf implements rrf {

    /* JADX INFO: renamed from: a */
    public final String f191829a;

    public qrf(String str) {
        this.f191829a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qrf) && wj50.m88271j(this.f191829a, ((qrf) obj).f191829a);
    }

    public final int hashCode() {
        return this.f191829a.hashCode();
    }
}
