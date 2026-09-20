package p204p;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\u0006J\u001a\u0010\n\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m24212d2 = {"Lp/wbi;", "", "", "artistId", "Lp/sci;", "c", "(Ljava/lang/String;Lp/fbk;)Ljava/lang/Object;", "friendId", "Lp/w2a1;", "b", "a", "src_main_java_com_spotify_ontour_concertfriendmatcherimpl-concertfriendmatcherimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface wbi {
    @pem("concerts-friend-matcher/v1/blocked-friends/{friend_id}")
    /* JADX INFO: renamed from: a */
    Object m87669a(@ubn0("friend_id") String str, fbk<? super w2a1> fbkVar);

    @j3m0("concerts-friend-matcher/v1/blocked-friends/{friend_id}")
    /* JADX INFO: renamed from: b */
    Object m87670b(@ubn0("friend_id") String str, fbk<? super w2a1> fbkVar);

    @zk00("concerts-friend-matcher/v1/matches/{artist_id}")
    /* JADX INFO: renamed from: c */
    Object m87671c(@ubn0("artist_id") String str, fbk<? super sci> fbkVar);
}
