package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class p040 implements w6q0 {

    /* JADX INFO: renamed from: a */
    public final String f172483a;

    public p040(String str) {
        this.f172483a = str;
    }

    @Override // p204p.x6q0
    /* JADX INFO: renamed from: a */
    public final String mo29381a() {
        return this.f172483a;
    }

    @Override // p204p.x6q0
    /* JADX INFO: renamed from: b */
    public final boolean mo41803b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p040) && wj50.m88271j(this.f172483a, ((p040) obj).f172483a);
    }

    @Override // p204p.x6q0
    public final String getPolicyId() {
        return "/client/spotify-id";
    }

    @Override // p204p.w6q0
    public final String getStringValue() {
        return this.f172483a;
    }

    public final int hashCode() {
        return this.f172483a.hashCode();
    }
}
