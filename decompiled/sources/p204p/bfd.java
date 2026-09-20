package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class bfd extends dfd {

    /* JADX INFO: renamed from: e */
    public final String f26664e;

    /* JADX INFO: renamed from: f */
    public final long f26665f;

    /* JADX INFO: renamed from: g */
    public final long f26666g;

    /* JADX INFO: renamed from: h */
    public final String f26667h;

    public bfd(String str, long j, long j2, String str2) {
        this.f26664e = str;
        this.f26665f = j;
        this.f26666g = j2;
        this.f26667h = str2;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: D */
    public final String mo29008D() {
        return this.f26667h;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: E */
    public final String mo29009E() {
        return this.f26664e;
    }

    @Override // p204p.yfd
    /* JADX INFO: renamed from: F */
    public final long mo29010F() {
        return this.f26665f;
    }

    @Override // p204p.gfd
    /* JADX INFO: renamed from: G */
    public final long mo29011G() {
        return this.f26666g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfd)) {
            return false;
        }
        bfd bfdVar = (bfd) obj;
        return wj50.m88271j(this.f26664e, bfdVar.f26664e) && this.f26665f == bfdVar.f26665f && this.f26666g == bfdVar.f26666g && wj50.m88271j(this.f26667h, bfdVar.f26667h);
    }

    public final int hashCode() {
        return this.f26667h.hashCode() + dq60.m36605e(dq60.m36605e(this.f26664e.hashCode() * 31, this.f26665f, 31), this.f26666g, 31);
    }
}
