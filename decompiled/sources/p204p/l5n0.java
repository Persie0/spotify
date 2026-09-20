package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes9.dex */
public final class l5n0 {

    /* JADX INFO: renamed from: a */
    public final Integer f129980a;

    /* JADX INFO: renamed from: b */
    public final Integer f129981b;

    public l5n0(int i, Integer num) {
        Integer numValueOf = (i & 4) != 0 ? null : Integer.valueOf(R.string.settings_item_samsung_cta_linked);
        this.f129980a = num;
        this.f129981b = numValueOf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5n0)) {
            return false;
        }
        l5n0 l5n0Var = (l5n0) obj;
        return this.f129980a.equals(l5n0Var.f129980a) && wj50.m88271j(this.f129981b, l5n0Var.f129981b);
    }

    public final int hashCode() {
        int iHashCode = this.f129980a.hashCode() * 31;
        Integer num = this.f129981b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
