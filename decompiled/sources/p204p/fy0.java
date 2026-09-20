package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes11.dex */
public final class fy0 {

    /* JADX INFO: renamed from: a */
    public final za5 f74498a;

    /* JADX INFO: renamed from: b */
    public final int f74499b;

    /* JADX INFO: renamed from: c */
    public final boolean f74500c;

    public fy0(za5 za5Var, int i, boolean z) {
        this.f74498a = za5Var;
        this.f74499b = i;
        this.f74500c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fy0)) {
            return false;
        }
        fy0 fy0Var = (fy0) obj;
        return this.f74498a.equals(fy0Var.f74498a) && this.f74499b == fy0Var.f74499b && this.f74500c == fy0Var.f74500c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f74500c) + mt60.m62800g(this.f74499b, mt60.m62800g(R.string.app_icon_option_default, this.f74498a.hashCode() * 31, 31), 31);
    }
}
