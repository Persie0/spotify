package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes10.dex */
public final class r58 extends v58 {

    /* JADX INFO: renamed from: a */
    public final boolean f195984a;

    /* JADX INFO: renamed from: b */
    public final String f195985b;

    /* JADX INFO: renamed from: c */
    public final Integer f195986c;

    /* JADX INFO: renamed from: d */
    public final boolean f195987d;

    public r58(Integer num, String str, boolean z, boolean z2) {
        this.f195984a = z;
        this.f195985b = str;
        this.f195986c = num;
        this.f195987d = z2;
    }

    @Override // p204p.v58
    /* JADX INFO: renamed from: a */
    public final boolean mo74810a() {
        return this.f195984a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r58)) {
            return false;
        }
        r58 r58Var = (r58) obj;
        return this.f195984a == r58Var.f195984a && wj50.m88271j(this.f195985b, r58Var.f195985b) && wj50.m88271j(this.f195986c, r58Var.f195986c) && this.f195987d == r58Var.f195987d;
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(R.string.puffin_autodetect_subtitle, mt60.m62800g(R.string.compatible_title, s571.m77243b(Boolean.hashCode(this.f195984a) * 31, 31, this.f195985b), 31), 31);
        Integer num = this.f195986c;
        return Boolean.hashCode(this.f195987d) + mt60.m62800g(R.raw.puffin_animation_autodetect, (iM62800g + (num == null ? 0 : num.hashCode())) * 31, 31);
    }
}
