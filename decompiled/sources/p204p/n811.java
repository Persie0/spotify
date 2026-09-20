package p204p;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J8\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\b\u0010\tJ \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\f\u0010\rJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000e\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m24212d2 = {"Lp/n811;", "", "", "link", "type", "playingFrom", "Lp/o2x0;", "Lp/p3x0;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lp/fbk;)Ljava/lang/Object;", "c", "(Ljava/lang/String;Lp/fbk;)Ljava/lang/Object;", "d", "(Ljava/lang/String;Ljava/lang/String;Lp/fbk;)Ljava/lang/Object;", "e", "src_main_java_com_spotify_share_shareables_impl-impl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface n811 {
    /* JADX INFO: renamed from: a */
    static /* synthetic */ Object m63818a(n811 n811Var, String str, String str2, fbk fbkVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPlaylistSticker");
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return n811Var.m63822d(str, str2, fbkVar);
    }

    /* JADX INFO: renamed from: f */
    static /* synthetic */ Object m63819f(n811 n811Var, String str, String str2, String str3, fbk fbkVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSticker");
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return n811Var.m63820b(str, str2, str3, fbkVar);
    }

    @zk00("shareables/sticker/{link}")
    /* JADX INFO: renamed from: b */
    Object m63820b(@ubn0("link") String str, @hit0("type") String str2, @hit0("playingFrom") String str3, fbk<? super o2x0<p3x0>> fbkVar);

    @zk00("/shareables/sticker/reserved/{link}")
    /* JADX INFO: renamed from: c */
    Object m63821c(@ubn0("link") String str, fbk<? super o2x0<p3x0>> fbkVar);

    @zk00("/shareables/sticker/playlist-with-tracks/{link}")
    /* JADX INFO: renamed from: d */
    Object m63822d(@ubn0("link") String str, @hit0("type") String str2, fbk<? super o2x0<p3x0>> fbkVar);

    @zk00("/shareables/sticker/themed/{link}")
    /* JADX INFO: renamed from: e */
    Object m63823e(@ubn0("link") String str, fbk<? super o2x0<p3x0>> fbkVar);
}
