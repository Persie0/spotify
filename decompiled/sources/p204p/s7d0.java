package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes2.dex */
public final class s7d0 extends e7d0 {

    /* JADX INFO: renamed from: d */
    public final boolean f206338d;

    public s7d0(boolean z) {
        super(z ? R.drawable.mediaservice_vector_repeat_one : R.drawable.mediaservice_vector_repeat_all, R.string.toggle_repeat_label, "TURN_REPEAT_OFF");
        this.f206338d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s7d0) && this.f206338d == ((s7d0) obj).f206338d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f206338d);
    }
}
