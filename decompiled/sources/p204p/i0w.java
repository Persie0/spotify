package p204p;

import com.spotify.extendedmetadata.extensions.episodeaccessimpl.proto.PodcastSubscription;

/* JADX INFO: loaded from: classes.dex */
public final class i0w implements aqx {
    @Override // p204p.aqx
    /* JADX INFO: renamed from: a */
    public final ktx mo26903a(byte[] bArr) {
        PodcastSubscription podcastSubscriptionM10112r = PodcastSubscription.m10112r(bArr);
        boolean zM10114o = podcastSubscriptionM10112r.m10114o();
        boolean zM10115p = podcastSubscriptionM10112r.m10115p();
        String strM10118o = podcastSubscriptionM10112r.m10116q().m10118o();
        wj50.m88279p(strM10118o);
        if (strM10118o.length() <= 0) {
            strM10118o = null;
        }
        return new g0w(strM10118o, h0w.f86362a[podcastSubscriptionM10112r.m10113n().ordinal()] == 1 ? 2 : 1, zM10114o, zM10115p);
    }

    @Override // p204p.aqx
    /* JADX INFO: renamed from: b */
    public final int mo26904b() {
        return 30;
    }

    @Override // p204p.aqx
    public final Class type() {
        return g0w.class;
    }
}
