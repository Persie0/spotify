package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes9.dex */
public final class vg91 {

    /* JADX INFO: renamed from: a */
    public final int f241181a;

    /* JADX INFO: renamed from: b */
    public final zg91 f241182b;

    /* JADX INFO: renamed from: c */
    public final int f241183c;

    public vg91(int i, zg91 zg91Var, int i2) {
        this.f241181a = i;
        this.f241182b = zg91Var;
        this.f241183c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vg91)) {
            return false;
        }
        vg91 vg91Var = (vg91) obj;
        return this.f241181a == vg91Var.f241181a && this.f241182b.equals(vg91Var.f241182b) && this.f241183c == vg91Var.f241183c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f241183c) + mt60.m62800g(R.string.opt_in_trial_dialog_start_trial_button, (this.f241182b.hashCode() + (Integer.hashCode(this.f241181a) * 31)) * 31, 31);
    }
}
