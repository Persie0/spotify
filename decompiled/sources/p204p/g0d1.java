package p204p;

import com.spotify.voting.proto.p180v1.GetVotingRootResponse;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class g0d1 {

    /* JADX INFO: renamed from: a */
    public final j2d1 f75345a;

    public g0d1(j2d1 j2d1Var) {
        this.f75345a = j2d1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m43294a(String str, ibk ibkVar) {
        e0d1 e0d1Var;
        if (ibkVar instanceof e0d1) {
            e0d1Var = (e0d1) ibkVar;
            int i = e0d1Var.f54947c;
            if ((i & Integer.MIN_VALUE) != 0) {
                e0d1Var.f54947c = i - Integer.MIN_VALUE;
            } else {
                e0d1Var = new e0d1(this, ibkVar);
            }
        } else {
            e0d1Var = new e0d1(this, ibkVar);
        }
        Object objMo52217e = e0d1Var.f54945a;
        int i2 = e0d1Var.f54947c;
        if (i2 == 0) {
            bga.m29073P(objMo52217e);
            e0d1Var.f54947c = 1;
            objMo52217e = this.f75345a.mo52217e(str, e0d1Var);
            yuk yukVar = yuk.f276404a;
            if (objMo52217e == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objMo52217e);
        }
        GetVotingRootResponse getVotingRootResponse = (GetVotingRootResponse) objMo52217e;
        String title = getVotingRootResponse.getTitle();
        int iM22381v = getVotingRootResponse.m22359p().m22381v();
        GetVotingRootResponse.VotingSection votingSectionM22359p = getVotingRootResponse.m22359p();
        hm20 hm20Var = new hm20(votingSectionM22359p.getTitle(), votingSectionM22359p.getSubtitle(), votingSectionM22359p.m22380u(), votingSectionM22359p.m22379t(), votingSectionM22359p.m22375o(), votingSectionM22359p.m22374n(), opo.m67574x(votingSectionM22359p.m22377r()));
        ae50<GetVotingRootResponse.Nominee> ae50VarM22378s = getVotingRootResponse.m22359p().m22378s();
        ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM22378s, 10));
        for (GetVotingRootResponse.Nominee nominee : ae50VarM22378s) {
            arrayList.add(new knj0(0, nominee.m22372o(), nominee.m22371n(), nominee.getTitle(), nominee.getSubtitle()));
        }
        GetVotingRootResponse.BottomSheet bottomSheetM22357n = getVotingRootResponse.m22357n();
        return new j1d1(title, iM22381v, hm20Var, arrayList, new dba(bottomSheetM22357n.m22367u(), bottomSheetM22357n.m22361n(), bottomSheetM22357n.m22366t()));
    }
}
