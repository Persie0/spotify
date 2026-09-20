package p204p;

import com.spotify.contentfilter.p052v1.ContentFilters;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m24212d2 = {"Lp/qs61;", "", "Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/contentfilter/v1/ContentFilters;", "p", "()Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_listuxplatformconsumers_likedsongs_shared-shared"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface qs61 {
    @zk00("content-filter/v1/liked-songs?subjective")
    /* JADX INFO: renamed from: p */
    Single<ContentFilters> m73678p();
}
