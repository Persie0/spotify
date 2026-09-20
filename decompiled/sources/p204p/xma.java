package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class xma implements m8d0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f263326a;

    /* JADX INFO: renamed from: b */
    public final Object f263327b;

    public /* synthetic */ xma(Object obj, int i) {
        this.f263326a = i;
        this.f263327b = obj;
    }

    @Override // p204p.m8d0
    /* JADX INFO: renamed from: a */
    public final boolean mo48695a(roa roaVar) {
        switch (this.f263326a) {
            case 0:
                return wl51.m88496t0(roaVar.f201199b, "spotify:genre:", false);
            case 1:
                return "com.spotify.browse".equals(roaVar.f201199b);
            case 2:
                Set set = dd41.f47702f;
                return r46.m74726U(roaVar.f201199b).f47709c == gn80.COLLECTION_PODCASTS_EPISODES;
            case 3:
                return roaVar.f201199b.equals("com.spotify.offline");
            case 4:
                return "com.spotify.recently-played".equals(roaVar.f201199b);
            case 5:
                return "com.spotify.your-albums".equals(roaVar.f201199b);
            case 6:
                return "com.spotify.your-artists".equals(roaVar.f201199b);
            case 7:
                return "com.spotify.your-audiobooks".equals(roaVar.f201199b);
            case 8:
                return "com.spotify.your-library".equals(roaVar.f201199b);
            case 9:
                String str = roaVar.f201199b;
                return "com.spotify.your-playlists".equals(str) || str.contains(":folder:");
            case 10:
                return "com.spotify.your-podcasts".equals(roaVar.f201199b);
            default:
                return wj50.m88271j(roaVar.f201199b, "com.spotify.downloaded");
        }
    }

    @Override // p204p.m8d0
    /* JADX INFO: renamed from: b */
    public final l8d0 mo48696b() {
        switch (this.f263326a) {
            case 0:
                return (l8d0) ((er70) this.f263327b).get();
            case 1:
                return (l8d0) ((er70) this.f263327b).get();
            case 2:
                return (l8d0) ((er70) this.f263327b).get();
            case 3:
                return (l8d0) ((er70) this.f263327b).get();
            case 4:
                return (l8d0) ((er70) this.f263327b).get();
            case 5:
                return (l8d0) ((er70) this.f263327b).get();
            case 6:
                return (l8d0) ((er70) this.f263327b).get();
            case 7:
                return (l8d0) ((er70) this.f263327b).get();
            case 8:
                return (l8d0) ((er70) this.f263327b).get();
            case 9:
                return (l8d0) ((er70) this.f263327b).get();
            case 10:
                return (l8d0) ((er70) this.f263327b).get();
            default:
                return (l8d0) ((i4t0) this.f263327b).get();
        }
    }
}
