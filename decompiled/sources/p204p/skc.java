package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class skc implements tkc {

    /* JADX INFO: renamed from: a */
    public final String f210076a;

    public skc(String str) {
        this.f210076a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof skc) && wj50.m88271j(this.f210076a, ((skc) obj).f210076a);
    }

    public final int hashCode() {
        return this.f210076a.hashCode();
    }
}
