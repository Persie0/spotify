package p204p;

import com.spotify.concertcampaignview.p047v1.CtaType;

/* JADX INFO: loaded from: classes10.dex */
public final class b1a1 extends c1a1 {

    /* JADX INFO: renamed from: e */
    public static final b1a1 f22275e = new b1a1(250, 420, 560, 1000);

    @Override // p204p.c1a1
    /* JADX INFO: renamed from: a */
    public final float mo27900a(int i) {
        int iM38547C = edb.m38547C(i);
        return (iM38547C == 0 || iM38547C == 1) ? 225 : 264;
    }

    @Override // p204p.c1a1
    /* JADX INFO: renamed from: b */
    public final float mo27901b(int i) {
        return a1a1.f11373a[edb.m38547C(i)] == 1 ? 1200 : CtaType.BUY_TICKETS_FIELD_NUMBER;
    }
}
