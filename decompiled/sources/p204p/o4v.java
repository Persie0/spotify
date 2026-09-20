package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes6.dex */
public final class o4v implements t4v {

    /* JADX INFO: renamed from: a */
    public final boolean f161758a;

    /* JADX INFO: renamed from: b */
    public final boolean f161759b;

    public o4v(boolean z, boolean z2) {
        this.f161758a = z;
        this.f161759b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4v)) {
            return false;
        }
        o4v o4vVar = (o4v) obj;
        return this.f161758a == o4vVar.f161758a && this.f161759b == o4vVar.f161759b;
    }

    @Override // p204p.t4v
    /* JADX INFO: renamed from: f */
    public final boolean mo63686f() {
        return this.f161758a;
    }

    @Override // p204p.t4v
    /* JADX INFO: renamed from: g */
    public final int mo63687g() {
        return R.string.feedback_option_mispronounced;
    }

    @Override // p204p.t4v
    public final boolean getEnabled() {
        return this.f161759b;
    }

    @Override // p204p.t4v
    /* JADX INFO: renamed from: h */
    public final int mo63688h() {
        return 5;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f161759b) + (Boolean.hashCode(this.f161758a) * 31);
    }
}
