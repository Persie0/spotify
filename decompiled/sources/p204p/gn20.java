package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class gn20 extends ln20 {

    /* JADX INFO: renamed from: a */
    public final boolean f81532a;

    public gn20(boolean z) {
        this.f81532a = z;
    }

    @Override // p204p.ln20
    /* JADX INFO: renamed from: a */
    public final String mo45287a() {
        return null;
    }

    @Override // p204p.ln20
    /* JADX INFO: renamed from: b */
    public final jn20 mo45288b() {
        return jn20.f113989a;
    }

    @Override // p204p.ln20
    /* JADX INFO: renamed from: c */
    public final String mo45289c() {
        return "";
    }

    @Override // p204p.ln20
    /* JADX INFO: renamed from: d */
    public final boolean mo45290d() {
        return this.f81532a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gn20) && this.f81532a == ((gn20) obj).f81532a;
    }

    public final int hashCode() {
        return jn20.f113989a.hashCode() + (Boolean.hashCode(this.f81532a) * 961);
    }
}
