package p204p;

import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0006\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0007\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m24212d2 = {"Lp/vut0;", "", "Lio/reactivex/rxjava3/core/Single;", "Lp/rbz0;", "a", "()Lio/reactivex/rxjava3/core/Single;", "c", "b", "src_main_java_com_spotify_quickplay_quickplay-quickplay"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface vut0 {
    @zk00("topic-mix/lists/v1/shelf-uris/genre?userRanked=true&response-format=json")
    /* JADX INFO: renamed from: a */
    Single<rbz0> m86445a();

    @zk00("topic-mix/lists/v1/shelf-uris/decade?userRanked=true&response-format=json")
    /* JADX INFO: renamed from: b */
    Single<rbz0> m86446b();

    @zk00("topic-mix/lists/v1/shelf-uris/artist?userRanked=true&response-format=json")
    /* JADX INFO: renamed from: c */
    Single<rbz0> m86447c();
}
