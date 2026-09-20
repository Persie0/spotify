package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes6.dex */
public final class n4v implements t4v {

    /* JADX INFO: renamed from: a */
    public final boolean f150426a;

    /* JADX INFO: renamed from: b */
    public final boolean f150427b;

    public n4v(boolean z, boolean z2) {
        this.f150426a = z;
        this.f150427b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4v)) {
            return false;
        }
        n4v n4vVar = (n4v) obj;
        return this.f150426a == n4vVar.f150426a && this.f150427b == n4vVar.f150427b;
    }

    @Override // p204p.t4v
    /* JADX INFO: renamed from: f */
    public final boolean mo63686f() {
        return this.f150426a;
    }

    @Override // p204p.t4v
    /* JADX INFO: renamed from: g */
    public final int mo63687g() {
        return R.string.feedback_option_inaccurate;
    }

    @Override // p204p.t4v
    public final boolean getEnabled() {
        return this.f150427b;
    }

    @Override // p204p.t4v
    /* JADX INFO: renamed from: h */
    public final int mo63688h() {
        return 4;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f150427b) + (Boolean.hashCode(this.f150426a) * 31);
    }
}
