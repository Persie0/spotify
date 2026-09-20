package p204p;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\u0007J*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m24212d2 = {"Lp/mp31;", "", "", "trackUri", "Lp/o2x0;", "Lp/p3x0;", "c", "(Ljava/lang/String;Lp/fbk;)Ljava/lang/Object;", "artistUri", "a", "collaboratorId", "b", "(Ljava/lang/String;Ljava/lang/String;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_songdna_sharemenuimpl-sharemenuimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface mp31 {
    @zk00("shareables/sticker/artist-dna/{artistUri}")
    /* JADX INFO: renamed from: a */
    Object m62430a(@ubn0("artistUri") String str, fbk<? super o2x0<p3x0>> fbkVar);

    @zk00("shareables/sticker/artist-blend-dna/{artistUri}")
    /* JADX INFO: renamed from: b */
    Object m62431b(@ubn0("artistUri") String str, @hit0("collabArtistUri") String str2, fbk<? super o2x0<p3x0>> fbkVar);

    @zk00("shareables/sticker/song-dna/{trackUri}")
    /* JADX INFO: renamed from: c */
    Object m62432c(@ubn0("trackUri") String str, fbk<? super o2x0<p3x0>> fbkVar);
}
