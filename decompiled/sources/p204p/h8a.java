package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class h8a implements x6q0 {

    /* JADX INFO: renamed from: a */
    public final boolean f88661a;

    public h8a(boolean z) {
        this.f88661a = z;
    }

    @Override // p204p.x6q0
    /* JADX INFO: renamed from: a */
    public final String mo29381a() {
        return String.valueOf(this.f88661a);
    }

    @Override // p204p.x6q0
    /* JADX INFO: renamed from: b */
    public final boolean mo41803b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h8a) && this.f88661a == ((h8a) obj).f88661a;
    }

    @Override // p204p.x6q0
    public final String getPolicyId() {
        return "/remote-config/device-is-tablet";
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f88661a);
    }
}
