package p204p;

import androidx.car.app.model.Alert;
import spotify.your_library.esperanto.proto.YourLibraryRequest;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryFilters;
import spotify.your_library.proto.YourLibraryConfig$YourLibrarySortOrder;

/* JADX INFO: loaded from: classes9.dex */
public final class x0t {

    /* JADX INFO: renamed from: a */
    public final luu0 f256968a;

    public x0t(luk lukVar, xuk xukVar, zre1 zre1Var) {
        jqe1 jqe1VarM98173q = YourLibraryRequest.m98173q();
        kqe1 kqe1VarM98179G = YourLibraryRequestHeader.m98179G();
        kqe1VarM98179G.m57103q(true);
        kqe1VarM98179G.m57109w();
        kqe1VarM98179G.m57093C(Alert.DURATION_SHOW_INDEFINITELY);
        goe1 goe1VarM98237o = YourLibraryConfig$YourLibrarySortOrder.m98237o();
        goe1VarM98237o.m45341m(hoe1.RECENTLY_ADDED);
        kqe1VarM98179G.m57098H((YourLibraryConfig$YourLibrarySortOrder) goe1VarM98237o.build());
        aoe1 aoe1VarM98214r = YourLibraryConfig$YourLibraryFilters.m98214r();
        aoe1VarM98214r.m26586q(boe1.BY_YOU);
        aoe1VarM98214r.m26586q(boe1.PLAYLIST);
        kqe1VarM98179G.m57107u((YourLibraryConfig$YourLibraryFilters) aoe1VarM98214r.build());
        jqe1VarM98173q.m54085m(kqe1VarM98179G);
        this.f256968a = bzf1.m31027s(cyf1.m34374j(mvl0.m62953p(new vjz(new rop(zre1Var.m96762c((YourLibraryRequest) jqe1VarM98173q.build()), 1), new ic0(3, 18, null), 2)), lukVar), xukVar, hf11.f90582b, 1);
    }
}
