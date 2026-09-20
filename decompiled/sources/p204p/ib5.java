package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes11.dex */
public final class ib5 {

    /* JADX INFO: renamed from: a */
    public final za5 f100436a;

    /* JADX INFO: renamed from: b */
    public final int f100437b;

    public ib5(za5 za5Var, int i) {
        this.f100436a = za5Var;
        this.f100437b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib5)) {
            return false;
        }
        ib5 ib5Var = (ib5) obj;
        return this.f100436a.equals(ib5Var.f100436a) && this.f100437b == ib5Var.f100437b;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + mt60.m62800g(this.f100437b, mt60.m62800g(R.string.app_icon_option_default, this.f100436a.hashCode() * 31, 31), 31);
    }
}
