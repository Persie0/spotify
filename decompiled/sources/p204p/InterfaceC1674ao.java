package p204p;

import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: renamed from: p.ao */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\tH§@¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m24212d2 = {"Lp/ao;", "", "Lp/ptb0;", "request", "Lio/reactivex/rxjava3/core/Single;", "Lp/o2x0;", "", "b", "(Lp/ptb0;)Lio/reactivex/rxjava3/core/Single;", "Lp/pya1;", "Lp/sya1;", "a", "(Lp/pya1;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_login_magiclinkapi-magiclinkapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface InterfaceC1674ao {
    @j3m0("accountrecovery/v1/username-login-hint")
    @rn20({"No-Webgate-Authentication: true"})
    /* JADX INFO: renamed from: a */
    Object m26552a(@h4a pya1 pya1Var, fbk<? super sya1> fbkVar);

    @j3m0("accountrecovery/v3/magiclink/")
    @rn20({"No-Webgate-Authentication: true"})
    /* JADX INFO: renamed from: b */
    Single<o2x0<String>> m26553b(@h4a ptb0 request);
}
