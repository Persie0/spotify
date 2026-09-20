package p204p;

import com.spotify.accountswitching.p009v1.GetAddAccountPageRequest;
import com.spotify.accountswitching.p009v1.GetAddAccountPageResponse;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: renamed from: p.cw */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m24212d2 = {"Lp/cw;", "", "Lcom/spotify/accountswitching/v1/GetAddAccountPageRequest;", "request", "Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/accountswitching/v1/GetAddAccountPageResponse;", "a", "(Lcom/spotify/accountswitching/v1/GetAddAccountPageRequest;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_premiumaccountmanagement_familyviewserviceimpl-familyviewserviceimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface InterfaceC1756cw {
    @j3m0("account-switching-service/v1/get-add-account-page")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Single<GetAddAccountPageResponse> m34073a(@h4a GetAddAccountPageRequest request);
}
