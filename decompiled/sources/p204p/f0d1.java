package p204p;

import com.spotify.voting.proto.p180v1.GetVotingRootRequest;
import com.spotify.voting.proto.p180v1.GetVotingRootResponse;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class f0d1 {

    /* JADX INFO: renamed from: a */
    public final j2d1 f64614a;

    public f0d1(j2d1 j2d1Var) {
        this.f64614a = j2d1Var;
    }

    /* JADX INFO: renamed from: c */
    public static i1d1 m40471c(GetVotingRootResponse getVotingRootResponse, int i, String str, String str2, String str3, String str4) {
        String title = getVotingRootResponse.getTitle();
        int iM22381v = getVotingRootResponse.m22359p().m22381v();
        GetVotingRootResponse.VotingSection votingSectionM22359p = getVotingRootResponse.m22359p();
        gm20 gm20Var = new gm20(votingSectionM22359p.getTitle(), votingSectionM22359p.getSubtitle(), votingSectionM22359p.m22376q(), opo.m67574x(votingSectionM22359p.m22382w()), votingSectionM22359p.m22380u(), votingSectionM22359p.m22379t(), opo.m67574x(votingSectionM22359p.m22377r()), votingSectionM22359p.m22375o(), votingSectionM22359p.m22374n());
        ae50<GetVotingRootResponse.Nominee> ae50VarM22378s = getVotingRootResponse.m22359p().m22378s();
        ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM22378s, 10));
        for (GetVotingRootResponse.Nominee nominee : ae50VarM22378s) {
            arrayList.add(new jnj0(0, nominee.m22372o(), nominee.m22371n(), nominee.getTitle(), nominee.getSubtitle()));
        }
        GetVotingRootResponse.BottomSheet bottomSheetM22357n = getVotingRootResponse.m22357n();
        cba cbaVar = new cba(bottomSheetM22357n.m22367u(), bottomSheetM22357n.m22362o(), bottomSheetM22357n.m22364q(), bottomSheetM22357n.m22363p(), bottomSheetM22357n.m22365s(), bottomSheetM22357n.m22361n(), bottomSheetM22357n.m22366t());
        GetVotingRootResponse.ErrorMessage errorMessageM22358o = getVotingRootResponse.m22358o();
        return new i1d1(str, str2, title, iM22381v, gm20Var, arrayList, cbaVar, new ifw(errorMessageM22358o.getTitle(), errorMessageM22358o.getSubtitle(), errorMessageM22358o.m22369o(), errorMessageM22358o.m22370p(), false), false, i, str3, str4);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m40472a(String str, ibk ibkVar) {
        c0d1 c0d1Var;
        if (ibkVar instanceof c0d1) {
            c0d1Var = (c0d1) ibkVar;
            int i = c0d1Var.f32751d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0d1Var.f32751d = i - Integer.MIN_VALUE;
            } else {
                c0d1Var = new c0d1(this, ibkVar);
            }
        } else {
            c0d1Var = new c0d1(this, ibkVar);
        }
        Object objMo52213a = c0d1Var.f32749b;
        int i2 = c0d1Var.f32751d;
        if (i2 == 0) {
            bga.m29073P(objMo52213a);
            xc10 xc10VarM22356o = GetVotingRootRequest.m22356o();
            xc10VarM22356o.m90336m(str);
            GetVotingRootRequest getVotingRootRequest = (GetVotingRootRequest) xc10VarM22356o.build();
            wj50.m88279p(getVotingRootRequest);
            c0d1Var.f32748a = str;
            c0d1Var.f32751d = 1;
            objMo52213a = this.f64614a.mo52213a(getVotingRootRequest, c0d1Var);
            yuk yukVar = yuk.f276404a;
            if (objMo52213a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c0d1Var.f32748a;
            bga.m29073P(objMo52213a);
        }
        String str2 = str;
        return m40471c((GetVotingRootResponse) objMo52213a, 1, str2, edb.m38564m("spotify:playlist:", str2), null, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m40473b(String str, String str2, ibk ibkVar) {
        d0d1 d0d1Var;
        if (ibkVar instanceof d0d1) {
            d0d1Var = (d0d1) ibkVar;
            int i = d0d1Var.f43854e;
            if ((i & Integer.MIN_VALUE) != 0) {
                d0d1Var.f43854e = i - Integer.MIN_VALUE;
            } else {
                d0d1Var = new d0d1(this, ibkVar);
            }
        } else {
            d0d1Var = new d0d1(this, ibkVar);
        }
        Object objMo52217e = d0d1Var.f43852c;
        int i2 = d0d1Var.f43854e;
        if (i2 == 0) {
            bga.m29073P(objMo52217e);
            d0d1Var.f43850a = str;
            d0d1Var.f43851b = str2;
            d0d1Var.f43854e = 1;
            objMo52217e = this.f64614a.mo52217e(str, d0d1Var);
            yuk yukVar = yuk.f276404a;
            if (objMo52217e == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = d0d1Var.f43851b;
            str = d0d1Var.f43850a;
            bga.m29073P(objMo52217e);
        }
        String str3 = str2;
        GetVotingRootResponse getVotingRootResponse = (GetVotingRootResponse) objMo52217e;
        Set set = dd41.f47702f;
        String strM35712j = r46.m74726U(str3).m35712j();
        String str4 = strM35712j == null ? "" : strM35712j;
        dd41 dd41VarM74726U = r46.m74726U(str);
        String strM35717o = dd41VarM74726U.m35717o(2);
        String str5 = strM35717o == null ? "" : strM35717o;
        String strM35717o2 = dd41VarM74726U.m35717o(3);
        return m40471c(getVotingRootResponse, 2, str4, str3, str5, strM35717o2 == null ? "" : strM35717o2);
    }
}
