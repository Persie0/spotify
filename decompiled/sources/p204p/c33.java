package p204p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes7.dex */
public final class c33 implements abm0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33535a;

    public /* synthetic */ c33(int i) {
        this.f33535a = i;
    }

    @Override // p204p.abm0
    public final cbm0 create() {
        switch (this.f33535a) {
            case 0:
                AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
                return xgg1.m90695S();
            case 1:
                AtomicReferenceArray atomicReferenceArray2 = cbm0.f36163e;
                return xgg1.m90662N1("ARTIST_MUSIC_VIDEOS", "artist/music-videos", 166, "artist");
            case 2:
                AtomicReferenceArray atomicReferenceArray3 = cbm0.f36163e;
                return xgg1.m90814j0();
            case 3:
                AtomicReferenceArray atomicReferenceArray4 = cbm0.f36163e;
                return xgg1.m90662N1("COLLECTION_SONGS", "collection/songs", 357, "collection");
            case 4:
                AtomicReferenceArray atomicReferenceArray5 = cbm0.f36163e;
                return xgg1.m90662N1("COLLECTION_PODCASTS_EPISODES_LISTENLATER", "collection/podcasts/episodes/listenlater", 348, "collection");
            case 5:
                AtomicReferenceArray atomicReferenceArray6 = cbm0.f36163e;
                return xgg1.m90662N1("LOCALFILES", "localfiles", 909, "localfiles");
            case 6:
                AtomicReferenceArray atomicReferenceArray7 = cbm0.f36163e;
                return xgg1.m90880t0();
            case 7:
                AtomicReferenceArray atomicReferenceArray8 = cbm0.f36163e;
                return xgg1.m90662N1("OFFLINE_PLAYABLE_ARTIST", "offline-playable-artist", 1325, "offline-playable-artist");
            case 8:
                AtomicReferenceArray atomicReferenceArray9 = cbm0.f36163e;
                return xgg1.m90662N1("RECOMMENDED_MUSIC_VIDEOS", "recommended-music-videos", 1577, "recommended-music-videos");
            default:
                AtomicReferenceArray atomicReferenceArray10 = cbm0.f36163e;
                return xgg1.m90662N1("STS_LOCAL_FILES", "sts/local-files", 1919, "sts");
        }
    }
}
