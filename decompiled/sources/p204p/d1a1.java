package p204p;

import com.spotify.concertcampaignview.p047v1.CtaType;

/* JADX INFO: loaded from: classes10.dex */
public final class d1a1 extends c1a1 {

    /* JADX INFO: renamed from: e */
    public static final d1a1 f44215e = new d1a1(250, 420, 560, 900);

    @Override // p204p.c1a1
    /* JADX INFO: renamed from: a */
    public final float mo27900a(int i) {
        int iM38547C = edb.m38547C(i);
        return (iM38547C == 0 || iM38547C == 1) ? 225 : 264;
    }

    @Override // p204p.c1a1
    /* JADX INFO: renamed from: b */
    public final float mo27901b(int i) {
        return CtaType.BUY_TICKETS_FIELD_NUMBER;
    }
}
