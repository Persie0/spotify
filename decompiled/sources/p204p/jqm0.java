package p204p;

import com.spotify.paidpodcastbanner.p117v1.PaidPodcastBanner;

/* JADX INFO: loaded from: classes6.dex */
public abstract class jqm0 {
    /* JADX INFO: renamed from: a */
    public static final gu8 m54107a(PaidPodcastBanner.Cta cta) {
        int i = iqm0.f104804a[cta.m16268o().ordinal()];
        int i2 = 2;
        if (i != 1) {
            i2 = i != 2 ? 1 : 3;
        }
        return new gu8(i2, cta.m16269q() ? cta.m16267n() : null);
    }

    /* JADX INFO: renamed from: b */
    public static final int m54108b(fu8 fu8Var) {
        int iOrdinal = fu8Var.ordinal();
        if (iOrdinal == 1) {
            return 2;
        }
        if (iOrdinal == 2) {
            return 3;
        }
        if (iOrdinal != 3) {
            return iOrdinal != 5 ? 1 : 5;
        }
        return 4;
    }
}
