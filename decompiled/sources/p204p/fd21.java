package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes8.dex */
public final class fd21 {

    /* JADX INFO: renamed from: a */
    public final String f68301a;

    /* JADX INFO: renamed from: b */
    public final int f68302b;

    /* JADX INFO: renamed from: c */
    public final boolean f68303c;

    /* JADX INFO: renamed from: d */
    public final int f68304d;

    /* JADX INFO: renamed from: e */
    public final int f68305e;

    /* JADX INFO: renamed from: f */
    public final Long f68306f;

    public fd21(String str, int i, int i2, Long l, int i3) {
        i = (i3 & 8) != 0 ? 1 : i;
        boolean z = (i3 & 16) == 0;
        int i4 = (i3 & 32) == 0 ? R.dimen.auto_download_tooltip_margin_bottom : 0;
        i2 = (i3 & 64) != 0 ? 2 : i2;
        l = (i3 & 128) != 0 ? null : l;
        this.f68301a = str;
        this.f68302b = i;
        this.f68303c = z;
        this.f68304d = i4;
        this.f68305e = i2;
        this.f68306f = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd21)) {
            return false;
        }
        fd21 fd21Var = (fd21) obj;
        return wj50.m88271j(this.f68301a, fd21Var.f68301a) && this.f68302b == fd21Var.f68302b && this.f68303c == fd21Var.f68303c && this.f68304d == fd21Var.f68304d && this.f68305e == fd21Var.f68305e && wj50.m88271j(this.f68306f, fd21Var.f68306f);
    }

    public final int hashCode() {
        String str = this.f68301a;
        int iM62800g = mt60.m62800g(this.f68305e, mt60.m62800g(this.f68304d, s571.m77245d(f710.m40938f(this.f68302b, (str == null ? 0 : str.hashCode()) * 29791, 31), 31, this.f68303c), 31), 31);
        Long l = this.f68306f;
        return iM62800g + (l != null ? l.hashCode() : 0);
    }
}
