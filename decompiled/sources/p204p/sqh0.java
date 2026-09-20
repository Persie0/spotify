package p204p;

import com.spotify.checkout.proto.model.p044v1.proto.C0495i1;
import com.spotify.checkout.proto.model.p044v1.proto.GetCheckoutPageRequest;
import com.spotify.checkout.proto.model.p044v1.proto.GetSessionStatusRequest;
import com.spotify.checkout.proto.model.p044v1.proto.GetSessionStatusResponse;
import com.spotify.checkout.proto.model.p044v1.proto.SubmitCheckoutRequest;
import com.spotify.checkout.proto.model.p044v1.proto.SubmitCheckoutResponse;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class sqh0 implements f8e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qe70 f213107a;

    /* JADX WARN: Multi-variable type inference failed */
    public sqh0(gh00 gh00Var) {
        this.f213107a = (qe70) gh00Var;
    }

    @Override // p204p.f8e
    /* JADX INFO: renamed from: a */
    public final Single mo41033a(SubmitCheckoutRequest submitCheckoutRequest) {
        C0495i1 c0495i1M6460y = SubmitCheckoutResponse.m6460y();
        c0495i1M6460y.m6584s(SubmitCheckoutResponse.Success.m6474n());
        return Single.just(c0495i1M6460y.build()).delay(1L, TimeUnit.SECONDS);
    }

    @Override // p204p.f8e
    /* JADX INFO: renamed from: b */
    public final Single mo41034b(GetSessionStatusRequest getSessionStatusRequest) {
        return Single.just(GetSessionStatusResponse.m6200o()).delay(1L, TimeUnit.SECONDS);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [p.gh00, p.qe70] */
    @Override // p204p.f8e
    /* JADX INFO: renamed from: c */
    public final Single mo41035c(GetCheckoutPageRequest getCheckoutPageRequest) {
        return Single.fromCallable(new x31((gh00) this.f213107a, getCheckoutPageRequest)).delay(1L, TimeUnit.SECONDS);
    }
}
