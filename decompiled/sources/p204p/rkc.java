package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class rkc implements tkc {

    /* JADX INFO: renamed from: a */
    public final String f200047a;

    public rkc(String str) {
        this.f200047a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rkc) && wj50.m88271j(this.f200047a, ((rkc) obj).f200047a);
    }

    public final int hashCode() {
        return this.f200047a.hashCode();
    }
}
