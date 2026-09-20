package p204p;

import com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoItemsResponse;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformItemsRequest;
import com.spotify.show_esperanto.proto.MarkShowAsPlayedResponse;
import com.spotify.show_esperanto.proto.Status;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes8.dex */
public final class j4f implements omc0 {

    /* JADX INFO: renamed from: a */
    public final t4f f108682a;

    public j4f(t4f t4fVar) {
        this.f108682a = t4fVar;
    }

    /* JADX INFO: renamed from: c */
    public static final MarkShowAsPlayedResponse m52338c(j4f j4fVar, Throwable th) {
        rmc0 rmc0VarM21235p = MarkShowAsPlayedResponse.m21235p();
        l051 l051VarM21251r = Status.m21251r();
        l051VarM21251r.m57787m(m051.INTERNAL_ERROR);
        l051VarM21251r.m57788q(th.getMessage());
        rmc0VarM21235p.m75943m((Status) l051VarM21251r.build());
        return (MarkShowAsPlayedResponse) rmc0VarM21235p.build();
    }

    /* JADX INFO: renamed from: d */
    public static final MarkShowAsPlayedResponse m52339d(j4f j4fVar, CollectionPlatformEsperantoItemsResponse collectionPlatformEsperantoItemsResponse) {
        rmc0 rmc0VarM21235p = MarkShowAsPlayedResponse.m21235p();
        l051 l051VarM21251r = Status.m21251r();
        l051VarM21251r.m57787m(collectionPlatformEsperantoItemsResponse.m6875n().m6895o() == 200 ? m051.SUCCESS : m051.INTERNAL_ERROR);
        l051VarM21251r.m57788q(collectionPlatformEsperantoItemsResponse.m6875n().m6896q());
        rmc0VarM21235p.m75943m((Status) l051VarM21251r.build());
        return (MarkShowAsPlayedResponse) rmc0VarM21235p.build();
    }

    @Override // p204p.omc0
    /* JADX INFO: renamed from: a */
    public final Single mo52340a(String str, String str2) {
        r4f r4fVarM6889s = CollectionPlatformItemsRequest.m6889s();
        r4fVarM6889s.m74750t(r5f.MARKED_AS_FINISHED);
        r4fVarM6889s.m74748r(str);
        return this.f108682a.m80061b((CollectionPlatformItemsRequest) r4fVarM6889s.build()).map(new c9a(this, 11)).onErrorReturn(new a99(this, 18));
    }

    @Override // p204p.omc0
    /* JADX INFO: renamed from: b */
    public final Single mo52341b(String str, String str2) {
        r4f r4fVarM6889s = CollectionPlatformItemsRequest.m6889s();
        r4fVarM6889s.m74750t(r5f.MARKED_AS_FINISHED);
        r4fVarM6889s.m74748r(str);
        return this.f108682a.m80060a((CollectionPlatformItemsRequest) r4fVarM6889s.build()).map(new qq8(this, 16)).onErrorReturn(new ln9(this, 12));
    }
}
