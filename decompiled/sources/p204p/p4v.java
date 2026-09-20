package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes6.dex */
public final class p4v implements t4v {

    /* JADX INFO: renamed from: a */
    public final boolean f174012a;

    /* JADX INFO: renamed from: b */
    public final boolean f174013b;

    public p4v(boolean z, boolean z2) {
        this.f174012a = z;
        this.f174013b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4v)) {
            return false;
        }
        p4v p4vVar = (p4v) obj;
        return this.f174012a == p4vVar.f174012a && this.f174013b == p4vVar.f174013b;
    }

    @Override // p204p.t4v
    /* JADX INFO: renamed from: f */
    public final boolean mo63686f() {
        return this.f174012a;
    }

    @Override // p204p.t4v
    /* JADX INFO: renamed from: g */
    public final int mo63687g() {
        return R.string.feedback_option_misunderstood;
    }

    @Override // p204p.t4v
    public final boolean getEnabled() {
        return this.f174013b;
    }

    @Override // p204p.t4v
    /* JADX INFO: renamed from: h */
    public final int mo63688h() {
        return 3;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f174013b) + (Boolean.hashCode(this.f174012a) * 31);
    }
}
