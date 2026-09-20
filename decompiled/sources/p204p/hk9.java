package p204p;

import io.reactivex.rxjava3.core.Completable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m24212d2 = {"Lp/hk9;", "", "", "playlistId", "Lp/qk9;", "renameRequest", "Lio/reactivex/rxjava3/core/Completable;", "a", "(Ljava/lang/String;Lp/qk9;)Lio/reactivex/rxjava3/core/Completable;", "src_main_java_com_spotify_blend_edit-edit"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface hk9 {
    @l3m0("blend-writer/v1/rename/{playlistId}")
    /* JADX INFO: renamed from: a */
    Completable m47748a(@ubn0("playlistId") String playlistId, @h4a qk9 renameRequest);
}
