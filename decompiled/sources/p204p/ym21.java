package p204p;

import com.spotify.player.model.Restrictions;

/* JADX INFO: loaded from: classes8.dex */
public final class ym21 {

    /* JADX INFO: renamed from: a */
    public final am81 f274138a;

    /* JADX INFO: renamed from: b */
    public final Restrictions f274139b;

    /* JADX INFO: renamed from: c */
    public final String f274140c;

    public ym21(am81 am81Var, Restrictions restrictions, String str) {
        this.f274138a = am81Var;
        this.f274139b = restrictions;
        this.f274140c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym21)) {
            return false;
        }
        ym21 ym21Var = (ym21) obj;
        return wj50.m88271j(this.f274138a, ym21Var.f274138a) && wj50.m88271j(this.f274139b, ym21Var.f274139b) && wj50.m88271j(this.f274140c, ym21Var.f274140c);
    }

    public final int hashCode() {
        int iHashCode = (this.f274139b.hashCode() + (this.f274138a.hashCode() * 31)) * 31;
        String str = this.f274140c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
