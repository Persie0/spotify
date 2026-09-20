package p204p;

import com.spotify.adsinternal.adscore.model.Format;

/* JADX INFO: loaded from: classes4.dex */
public final class lqa0 implements rtr {

    /* JADX INFO: renamed from: a */
    public final ro0 f135997a;

    /* JADX INFO: renamed from: b */
    public final String f135998b;

    /* JADX INFO: renamed from: c */
    public final Format f135999c;

    public lqa0(ro0 ro0Var, String str, Format format) {
        this.f135997a = ro0Var;
        this.f135998b = str;
        this.f135999c = format;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqa0)) {
            return false;
        }
        lqa0 lqa0Var = (lqa0) obj;
        return wj50.m88271j(this.f135997a, lqa0Var.f135997a) && wj50.m88271j(this.f135998b, lqa0Var.f135998b) && this.f135999c == lqa0Var.f135999c;
    }

    public final int hashCode() {
        return this.f135999c.hashCode() + s571.m77243b(this.f135997a.hashCode() * 31, 31, this.f135998b);
    }
}
