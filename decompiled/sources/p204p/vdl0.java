package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vdl0 implements ydl0 {

    /* JADX INFO: renamed from: a */
    public final String f240418a;

    public vdl0(String str) {
        this.f240418a = str;
    }

    @Override // p204p.ydl0
    /* JADX INFO: renamed from: b */
    public final String mo25734b() {
        return this.f240418a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vdl0) && wj50.m88271j(this.f240418a, ((vdl0) obj).f240418a);
    }

    public final int hashCode() {
        return this.f240418a.hashCode();
    }
}
