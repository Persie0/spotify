package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xgl implements ahl {

    /* JADX INFO: renamed from: a */
    public final String f261335a;

    public xgl(String str) {
        this.f261335a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xgl) && wj50.m88271j(this.f261335a, ((xgl) obj).f261335a);
    }

    @Override // p204p.ahl
    public final String getContextUri() {
        return this.f261335a;
    }

    public final int hashCode() {
        return this.f261335a.hashCode();
    }
}
