package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes11.dex */
public final class pa5 {

    /* JADX INFO: renamed from: a */
    public final za5 f175400a;

    /* JADX INFO: renamed from: b */
    public final int f175401b;

    public pa5(za5 za5Var, int i) {
        this.f175400a = za5Var;
        this.f175401b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pa5)) {
            return false;
        }
        pa5 pa5Var = (pa5) obj;
        return this.f175400a.equals(pa5Var.f175400a) && this.f175401b == pa5Var.f175401b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f175401b) + mt60.m62800g(R.string.app_icon_option_default, this.f175400a.hashCode() * 31, 31);
    }
}
