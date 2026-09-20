package p204p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import spotify.your_library.esperanto.proto.PinRequest;
import spotify.your_library.esperanto.proto.YourLibraryDecorateRequest;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryLabelAndImage;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryPredefinedPlaylistConfig;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs;

/* JADX INFO: loaded from: classes2.dex */
public final class yse1 {

    /* JADX INFO: renamed from: a */
    public final tre1 f275760a;

    /* JADX INFO: renamed from: b */
    public final wg61 f275761b = new wg61(ine1.f103964e);

    /* JADX INFO: renamed from: c */
    public final YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs f275762c;

    public yse1(jiq jiqVar, tre1 tre1Var, zs60 zs60Var) {
        this.f275760a = tre1Var;
        coe1 coe1VarM98220r = YourLibraryConfig$YourLibraryLabelAndImage.m98220r();
        coe1VarM98220r.m33503r("_");
        coe1VarM98220r.m33501m("_");
        YourLibraryConfig$YourLibraryLabelAndImage yourLibraryConfig$YourLibraryLabelAndImage = (YourLibraryConfig$YourLibraryLabelAndImage) coe1VarM98220r.build();
        coe1 coe1VarM98220r2 = YourLibraryConfig$YourLibraryLabelAndImage.m98220r();
        coe1VarM98220r2.m33503r("_");
        coe1VarM98220r2.m33501m("_");
        coe1VarM98220r2.m33502q(true);
        YourLibraryConfig$YourLibraryLabelAndImage yourLibraryConfig$YourLibraryLabelAndImage2 = (YourLibraryConfig$YourLibraryLabelAndImage) coe1VarM98220r2.build();
        doe1 doe1VarM98224q = YourLibraryConfig$YourLibraryPredefinedPlaylistConfig.m98224q();
        iqe1 iqe1Var = jiqVar.f112811a;
        boolean zM51356a = iqe1Var.m51356a();
        eoe1 eoe1Var = eoe1.INCLUDE_ALWAYS;
        eoe1 eoe1Var2 = eoe1.INCLUDE_IF_NOT_EMPTY;
        doe1VarM98224q.m36531q(zM51356a ? eoe1Var : eoe1Var2);
        YourLibraryConfig$YourLibraryPredefinedPlaylistConfig yourLibraryConfig$YourLibraryPredefinedPlaylistConfig = (YourLibraryConfig$YourLibraryPredefinedPlaylistConfig) doe1VarM98224q.build();
        doe1 doe1VarM98224q2 = YourLibraryConfig$YourLibraryPredefinedPlaylistConfig.m98224q();
        doe1VarM98224q2.m36531q(iqe1Var.m51356a() ? eoe1Var : eoe1Var2);
        YourLibraryConfig$YourLibraryPredefinedPlaylistConfig yourLibraryConfig$YourLibraryPredefinedPlaylistConfig2 = (YourLibraryConfig$YourLibraryPredefinedPlaylistConfig) doe1VarM98224q2.build();
        doe1 doe1VarM98224q3 = YourLibraryConfig$YourLibraryPredefinedPlaylistConfig.m98224q();
        doe1VarM98224q3.m36531q(eoe1Var2);
        YourLibraryConfig$YourLibraryPredefinedPlaylistConfig yourLibraryConfig$YourLibraryPredefinedPlaylistConfig3 = (YourLibraryConfig$YourLibraryPredefinedPlaylistConfig) doe1VarM98224q3.build();
        doe1 doe1VarM98224q4 = YourLibraryConfig$YourLibraryPredefinedPlaylistConfig.m98224q();
        doe1VarM98224q4.m36531q(eoe1Var2);
        foe1 foe1VarM98235x = YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs.m98235x();
        foe1VarM98235x.m42282w(yourLibraryConfig$YourLibraryLabelAndImage2);
        foe1VarM98235x.m42276q(yourLibraryConfig$YourLibraryPredefinedPlaylistConfig2);
        foe1VarM98235x.m42283x(yourLibraryConfig$YourLibraryLabelAndImage);
        foe1VarM98235x.m42281v(yourLibraryConfig$YourLibraryPredefinedPlaylistConfig);
        foe1VarM98235x.m42285z(yourLibraryConfig$YourLibraryPredefinedPlaylistConfig2);
        foe1VarM98235x.m42278s(yourLibraryConfig$YourLibraryPredefinedPlaylistConfig3);
        this.f275762c = (YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs) foe1VarM98235x.build();
    }

    /* JADX INFO: renamed from: a */
    public final Observable m94462a(String str) {
        moe1 moe1VarM98162r = YourLibraryDecorateRequest.m98162r();
        moe1VarM98162r.m62397q(str);
        moe1VarM98162r.m62398r(this.f275762c);
        return this.f275760a.m81348c((YourLibraryDecorateRequest) moe1VarM98162r.build()).map(new pjc1(this)).onErrorReturnItem(ype1.f274930a);
    }

    /* JADX INFO: renamed from: b */
    public final Observable m94463b(String str, voc1 voc1Var) {
        return (voc1Var.equals(xoc1.f264129l2) || voc1Var.equals(xoc1.f264209v2) || voc1Var.equals((voc1) this.f275761b.getValue())) ? m94462a(str) : Observable.just(ype1.f274930a);
    }

    /* JADX INFO: renamed from: c */
    public final Single m94464c(String str) {
        d3o0 d3o0VarM98132o = PinRequest.m98132o();
        d3o0VarM98132o.m34887m(str);
        return this.f275760a.callSingle("spotify.your_library_esperanto.proto.YourLibraryService", "UnPin", (PinRequest) d3o0VarM98132o.build()).map(koq0.f124888Z0).map(wvq0.f255565Y0);
    }
}
