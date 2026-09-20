package p204p;

import kotlin.Metadata;
import spotify.physical_book_to_audiobook_lookup.p210v1.LookupRequest;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m24212d2 = {"Lp/eb7;", "", "Lspotify/physical_book_to_audiobook_lookup/v1/LookupRequest;", "data", "Lp/o2x0;", "a", "(Lspotify/physical_book_to_audiobook_lookup/v1/LookupRequest;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_pagematch_endpoint-endpoint"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface eb7 {
    @j3m0("physical-book-to-audiobook-lookup-api/v1/lookup")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Object m38354a(@h4a LookupRequest lookupRequest, fbk<? super o2x0<Object>> fbkVar);
}
