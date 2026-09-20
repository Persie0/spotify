package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bzr0 extends zzr0 {

    /* JADX INFO: renamed from: a */
    public final boolean f32559a;

    /* JADX INFO: renamed from: b */
    public final String f32560b;

    public bzr0(boolean z, String str) {
        this.f32559a = z;
        this.f32560b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzr0)) {
            return false;
        }
        bzr0 bzr0Var = (bzr0) obj;
        return this.f32559a == bzr0Var.f32559a && this.f32560b.equals(bzr0Var.f32560b);
    }

    public final int hashCode() {
        return this.f32560b.hashCode() + (Boolean.hashCode(this.f32559a) * 31);
    }
}
