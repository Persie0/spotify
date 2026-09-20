package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes6.dex */
public final class s4v implements t4v {

    /* JADX INFO: renamed from: a */
    public final boolean f205641a;

    /* JADX INFO: renamed from: b */
    public final boolean f205642b;

    public s4v(boolean z, boolean z2) {
        this.f205641a = z;
        this.f205642b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4v)) {
            return false;
        }
        s4v s4vVar = (s4v) obj;
        return this.f205641a == s4vVar.f205641a && this.f205642b == s4vVar.f205642b;
    }

    @Override // p204p.t4v
    /* JADX INFO: renamed from: f */
    public final boolean mo63686f() {
        return this.f205641a;
    }

    @Override // p204p.t4v
    /* JADX INFO: renamed from: g */
    public final int mo63687g() {
        return R.string.feedback_option_wrong_music;
    }

    @Override // p204p.t4v
    public final boolean getEnabled() {
        return this.f205642b;
    }

    @Override // p204p.t4v
    /* JADX INFO: renamed from: h */
    public final int mo63688h() {
        return 2;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f205642b) + (Boolean.hashCode(this.f205641a) * 31);
    }
}
