package p204p;

import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m24212d2 = {"Lp/s0u;", "", "Lio/reactivex/rxjava3/core/Single;", "Lp/o2x0;", "Lp/o1u;", "b", "()Lio/reactivex/rxjava3/core/Single;", "Lp/h0u;", "request", "a", "(Lp/h0u;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_email_service-service"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface s0u {
    @l3m0("accountsettings/v1/profile/email")
    /* JADX INFO: renamed from: a */
    Single<o2x0<o1u>> m76898a(@h4a h0u request);

    @zk00("accountsettings/v1/profile/email")
    /* JADX INFO: renamed from: b */
    Single<o2x0<o1u>> m76899b();
}
