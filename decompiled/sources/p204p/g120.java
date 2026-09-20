package p204p;

import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m24211d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H'¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m24212d2 = {"Lp/g120;", "", "", "invitationToken", "Lio/reactivex/rxjava3/core/Single;", "Lp/hm50;", "b", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "Lp/kg60;", "a", "Lp/nm50;", "c", "()Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_blend_tastematch-tastematch"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface g120 {
    @l3m0("blend-invitation/v2/join/{invitationToken}")
    /* JADX INFO: renamed from: a */
    Single<kg60> m43317a(@ubn0("invitationToken") String invitationToken);

    @zk00("blend-invitation/v3/view-invitation/{invitationToken}")
    /* JADX INFO: renamed from: b */
    Single<hm50> m43318b(@ubn0("invitationToken") String invitationToken);

    @j3m0("blend-invitation/v1/generate")
    /* JADX INFO: renamed from: c */
    Single<nm50> m43319c();
}
