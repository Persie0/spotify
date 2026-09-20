package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes6.dex */
public final class wv31 {

    /* JADX INFO: renamed from: a */
    public final Integer f255389a;

    /* JADX INFO: renamed from: b */
    public final Integer f255390b;

    /* JADX INFO: renamed from: c */
    public final Integer f255391c;

    /* JADX INFO: renamed from: d */
    public final Integer f255392d;

    public wv31(Integer num, Integer num2, Integer num3, int i) {
        Integer numValueOf = Integer.valueOf(R.dimen.spacer_8);
        num = (i & 1) != 0 ? null : num;
        num2 = (i & 2) != 0 ? null : num2;
        num3 = (i & 4) != 0 ? null : num3;
        numValueOf = (i & 8) != 0 ? null : numValueOf;
        this.f255389a = num;
        this.f255390b = num2;
        this.f255391c = num3;
        this.f255392d = numValueOf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wv31)) {
            return false;
        }
        wv31 wv31Var = (wv31) obj;
        return wj50.m88271j(this.f255389a, wv31Var.f255389a) && wj50.m88271j(this.f255390b, wv31Var.f255390b) && wj50.m88271j(this.f255391c, wv31Var.f255391c) && wj50.m88271j(this.f255392d, wv31Var.f255392d);
    }

    public final int hashCode() {
        Integer num = this.f255389a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f255390b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f255391c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f255392d;
        return iHashCode3 + (num4 != null ? num4.hashCode() : 0);
    }
}
