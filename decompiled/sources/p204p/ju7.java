package p204p;

import spotify.your_library.esperanto.proto.YourLibraryRequest;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryFilters;

/* JADX INFO: loaded from: classes9.dex */
public final class ju7 {

    /* JADX INFO: renamed from: a */
    public final tre1 f116040a;

    /* JADX INFO: renamed from: b */
    public final YourLibraryRequest f116041b;

    public ju7(tre1 tre1Var) {
        this.f116040a = tre1Var;
        jqe1 jqe1VarM98173q = YourLibraryRequest.m98173q();
        kqe1 kqe1VarM98179G = YourLibraryRequestHeader.m98179G();
        aoe1 aoe1VarM98214r = YourLibraryConfig$YourLibraryFilters.m98214r();
        aoe1VarM98214r.m26586q(boe1.SHOW);
        kqe1VarM98179G.m57106t(aoe1VarM98214r);
        kqe1VarM98179G.m57103q(true);
        kqe1VarM98179G.m57101K();
        kqe1VarM98179G.m57093C(1);
        jqe1VarM98173q.m54085m(kqe1VarM98179G);
        this.f116041b = (YourLibraryRequest) jqe1VarM98173q.build();
    }
}
