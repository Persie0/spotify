package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class nt20 implements ot20 {

    /* JADX INFO: renamed from: a */
    public final String f157962a;

    public nt20(String str) {
        this.f157962a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nt20) && wj50.m88271j(this.f157962a, ((nt20) obj).f157962a);
    }

    @Override // p204p.ot20
    public final String getImageUrl() {
        return this.f157962a;
    }

    public final int hashCode() {
        return this.f157962a.hashCode();
    }
}
