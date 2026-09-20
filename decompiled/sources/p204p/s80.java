package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes5.dex */
public final class s80 extends a90 {

    /* JADX INFO: renamed from: d */
    public final String f206503d;

    public s80(String str) {
        super(R.string.actions_picker_copy, zou.f284873c, 1);
        this.f206503d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s80) && wj50.m88271j(this.f206503d, ((s80) obj).f206503d);
    }

    public final int hashCode() {
        return this.f206503d.hashCode();
    }
}
