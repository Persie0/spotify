package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class i3y {

    /* JADX INFO: renamed from: a */
    public final Object f98348a;

    /* JADX INFO: renamed from: b */
    public final boolean f98349b;

    public i3y(Object obj, boolean z) {
        this.f98348a = obj;
        this.f98349b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3y)) {
            return false;
        }
        i3y i3yVar = (i3y) obj;
        return wj50.m88271j(this.f98348a, i3yVar.f98348a) && this.f98349b == i3yVar.f98349b;
    }

    public final int hashCode() {
        Object obj = this.f98348a;
        return Boolean.hashCode(this.f98349b) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }
}
