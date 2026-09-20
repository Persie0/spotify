package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes6.dex */
public final class r4v implements t4v {

    /* JADX INFO: renamed from: a */
    public final boolean f195855a;

    /* JADX INFO: renamed from: b */
    public final boolean f195856b;

    public r4v(boolean z, boolean z2) {
        this.f195855a = z;
        this.f195856b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4v)) {
            return false;
        }
        r4v r4vVar = (r4v) obj;
        return this.f195855a == r4vVar.f195855a && this.f195856b == r4vVar.f195856b;
    }

    @Override // p204p.t4v
    /* JADX INFO: renamed from: f */
    public final boolean mo63686f() {
        return this.f195855a;
    }

    @Override // p204p.t4v
    /* JADX INFO: renamed from: g */
    public final int mo63687g() {
        return R.string.feedback_option_other;
    }

    @Override // p204p.t4v
    public final boolean getEnabled() {
        return this.f195856b;
    }

    @Override // p204p.t4v
    /* JADX INFO: renamed from: h */
    public final int mo63688h() {
        return 6;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f195856b) + (Boolean.hashCode(this.f195855a) * 31);
    }
}
