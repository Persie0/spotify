package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ujy implements yjy {

    /* JADX INFO: renamed from: a */
    public final String f231176a;

    public ujy(String str) {
        this.f231176a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ujy) && wj50.m88271j(this.f231176a, ((ujy) obj).f231176a);
    }

    public final int hashCode() {
        return this.f231176a.hashCode();
    }
}
