package p204p;

import com.spotify.podcast.access.proto.OfferExplanation;

/* JADX INFO: loaded from: classes6.dex */
public final class yfe0 {

    /* JADX INFO: renamed from: a */
    public final String f272213a;

    /* JADX INFO: renamed from: b */
    public final String f272214b;

    /* JADX INFO: renamed from: c */
    public final int f272215c;

    /* JADX INFO: renamed from: d */
    public final String f272216d;

    /* JADX INFO: renamed from: e */
    public final OfferExplanation f272217e;

    public /* synthetic */ yfe0() {
        this("", "", 0, "", null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yfe0)) {
            return false;
        }
        yfe0 yfe0Var = (yfe0) obj;
        return wj50.m88271j(this.f272213a, yfe0Var.f272213a) && wj50.m88271j(this.f272214b, yfe0Var.f272214b) && this.f272215c == yfe0Var.f272215c && wj50.m88271j(this.f272216d, yfe0Var.f272216d) && wj50.m88271j(this.f272217e, yfe0Var.f272217e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(mt60.m62800g(this.f272215c, s571.m77243b(this.f272213a.hashCode() * 31, 31, this.f272214b), 31), 31, this.f272216d);
        OfferExplanation offerExplanation = this.f272217e;
        return iM77243b + (offerExplanation == null ? 0 : offerExplanation.hashCode());
    }

    public yfe0(String str, String str2, int i, String str3, OfferExplanation offerExplanation) {
        this.f272213a = str;
        this.f272214b = str2;
        this.f272215c = i;
        this.f272216d = str3;
        this.f272217e = offerExplanation;
    }
}
