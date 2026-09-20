package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class vdz0 implements xdz0 {

    /* JADX INFO: renamed from: a */
    public final String f240531a;

    public vdz0(String str) {
        this.f240531a = str;
    }

    @Override // p204p.xdz0
    /* JADX INFO: renamed from: a */
    public final String mo85272a() {
        return this.f240531a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vdz0) && wj50.m88271j(this.f240531a, ((vdz0) obj).f240531a);
    }

    public final int hashCode() {
        return this.f240531a.hashCode();
    }
}
