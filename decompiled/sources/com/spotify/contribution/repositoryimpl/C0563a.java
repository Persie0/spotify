package com.spotify.contribution.repositoryimpl;

import com.spotify.campfire.contribution.proto.p037v1.BatchCreateContributionsRequest;
import com.spotify.campfire.contribution.proto.p037v1.BatchCreateContributionsResponse;
import com.spotify.campfire.contribution.proto.p037v1.BatchDeleteContributionsRequest;
import com.spotify.campfire.contribution.proto.p037v1.BatchDeleteContributionsResponse;
import com.spotify.campfire.contribution.proto.p037v1.BatchGetContributionCapabilitiesRequest;
import com.spotify.campfire.contribution.proto.p037v1.BatchGetContributionCapabilitiesResponse;
import com.spotify.campfire.contribution.proto.p037v1.BatchGetContributionsRequest;
import com.spotify.campfire.contribution.proto.p037v1.BatchGetContributionsResponse;
import com.spotify.campfire.contribution.proto.p037v1.BatchUpdateContributionsRequest;
import com.spotify.campfire.contribution.proto.p037v1.BatchUpdateContributionsResponse;
import com.spotify.campfire.contribution.proto.p037v1.Contribution;
import com.spotify.campfire.contribution.proto.p037v1.ContributionFilters;
import com.spotify.campfire.contribution.proto.p037v1.ContributionPagination;
import com.spotify.campfire.contribution.proto.p037v1.ContributionReference;
import com.spotify.campfire.contribution.proto.p037v1.CreateContributionRequest;
import com.spotify.campfire.contribution.proto.p037v1.CreateContributionResponse;
import com.spotify.campfire.contribution.proto.p037v1.DeleteContributionRequest;
import com.spotify.campfire.contribution.proto.p037v1.DeleteContributionResponse;
import com.spotify.campfire.contribution.proto.p037v1.GetContributionCapabilitiesRequest;
import com.spotify.campfire.contribution.proto.p037v1.GetContributionCapabilitiesResponse;
import com.spotify.campfire.contribution.proto.p037v1.GetContributionsRequest;
import com.spotify.campfire.contribution.proto.p037v1.GetContributionsResponse;
import com.spotify.campfire.contribution.proto.p037v1.UpdateContributionRequest;
import com.spotify.campfire.contribution.proto.p037v1.UpdateContributionResponse;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p204p.ae50;
import p204p.bga;
import p204p.c6x0;
import p204p.fik;
import p204p.h6f;
import p204p.i49;
import p204p.i6f;
import p204p.ibk;
import p204p.j49;
import p204p.k49;
import p204p.lau;
import p204p.lnq;
import p204p.m59;
import p204p.mnq;
import p204p.qtb;
import p204p.r710;
import p204p.rck;
import p204p.s710;
import p204p.s9a1;
import p204p.sck;
import p204p.t5l;
import p204p.t710;
import p204p.t9a1;
import p204p.tck;
import p204p.u5l;
import p204p.uck;
import p204p.vck;
import p204p.vdk;
import p204p.vhk;
import p204p.w2a1;
import p204p.wj50;
import p204p.y39;
import p204p.yik;
import p204p.yuk;
import p204p.z39;

/* JADX INFO: renamed from: com.spotify.contribution.repositoryimpl.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0563a {

    /* JADX INFO: renamed from: a */
    public final vdk f3461a;

    public C0563a(vdk vdkVar) {
        this.f3461a = vdkVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Serializable m8028a(ArrayList arrayList, ibk ibkVar) {
        rck rckVar;
        c6x0 c6x0Var;
        Object objM8037a;
        k49 k49Var;
        if (ibkVar instanceof rck) {
            rckVar = (rck) ibkVar;
            int i = rckVar.f197879d;
            if ((i & Integer.MIN_VALUE) != 0) {
                rckVar.f197879d = i - Integer.MIN_VALUE;
            } else {
                rckVar = new rck(this, ibkVar);
            }
        } else {
            rckVar = new rck(this, ibkVar);
        }
        Object objM85230a = rckVar.f197877b;
        int i2 = rckVar.f197879d;
        if (i2 == 0) {
            bga.m29073P(objM85230a);
            y39 y39VarM4214p = BatchCreateContributionsRequest.m4214p();
            ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                u5l u5lVar = (u5l) it.next();
                t5l t5lVarM4307q = CreateContributionRequest.m4307q();
                t5lVarM4307q.m80115r(AbstractC0568f.m8043g(u5lVar.m82415b()));
                t5lVarM4307q.m80113m(AbstractC0568f.m8042f(u5lVar.m82414a()));
                t5lVarM4307q.m80114q(AbstractC0568f.m8044h(yik.f273132a));
                arrayList2.add((CreateContributionRequest) t5lVarM4307q.build());
            }
            y39VarM4214p.m92735m(arrayList2);
            BatchCreateContributionsRequest batchCreateContributionsRequest = (BatchCreateContributionsRequest) y39VarM4214p.build();
            wj50.m88279p(batchCreateContributionsRequest);
            rckVar.f197876a = arrayList;
            rckVar.f197879d = 1;
            objM85230a = this.f3461a.m85230a(batchCreateContributionsRequest, rckVar);
            yuk yukVar = yuk.f276404a;
            if (objM85230a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = rckVar.f197876a;
            bga.m29073P(objM85230a);
        }
        BatchCreateContributionsResponse batchCreateContributionsResponse = (BatchCreateContributionsResponse) objM85230a;
        int iM4215n = batchCreateContributionsResponse.m4215n();
        ae50 ae50VarM4216o = batchCreateContributionsResponse.m4216o();
        ArrayList arrayList3 = new ArrayList(i6f.m49804T(arrayList, 10));
        int i3 = 0;
        for (Object obj : arrayList) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                h6f.m46722S();
                throw null;
            }
            if (i3 >= iM4215n) {
                k49Var = new k49(obj, new c6x0(ContributionApiError.EmptyResponse.f3454a));
            } else {
                CreateContributionResponse createContributionResponse = (CreateContributionResponse) ae50VarM4216o.get(i3);
                if (createContributionResponse.m4310p()) {
                    try {
                        objM8037a = AbstractC0568f.m8037a(createContributionResponse.m4308n());
                    } catch (ContributionApiError e) {
                        c6x0Var = new c6x0(e);
                        objM8037a = c6x0Var;
                    }
                    k49Var = new k49(obj, objM8037a);
                } else {
                    c6x0Var = createContributionResponse.m4311q() ? new c6x0(AbstractC0564b.m8033a(createContributionResponse.m4309o())) : new c6x0(ContributionApiError.EmptyResponse.f3454a);
                }
                objM8037a = c6x0Var;
                k49Var = new k49(obj, objM8037a);
            }
            arrayList3.add(k49Var);
            i3 = i4;
        }
        return arrayList3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Serializable m8029b(List list, ibk ibkVar) {
        sck sckVar;
        k49 k49Var;
        if (ibkVar instanceof sck) {
            sckVar = (sck) ibkVar;
            int i = sckVar.f207762d;
            if ((i & Integer.MIN_VALUE) != 0) {
                sckVar.f207762d = i - Integer.MIN_VALUE;
            } else {
                sckVar = new sck(this, ibkVar);
            }
        } else {
            sckVar = new sck(this, ibkVar);
        }
        Object objM85234e = sckVar.f207760b;
        int i2 = sckVar.f207762d;
        if (i2 == 0) {
            bga.m29073P(objM85234e);
            z39 z39VarM4219p = BatchDeleteContributionsRequest.m4219p();
            ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                mnq mnqVar = (mnq) it.next();
                lnq lnqVarM4314p = DeleteContributionRequest.m4314p();
                fik fikVarM4291q = ContributionReference.m4291q();
                fikVarM4291q.m41749m(mnqVar.m62364a());
                lnqVarM4314p.m59506m(fikVarM4291q);
                lnqVarM4314p.m59507q();
                arrayList.add((DeleteContributionRequest) lnqVarM4314p.build());
            }
            z39VarM4219p.m95266m(arrayList);
            BatchDeleteContributionsRequest batchDeleteContributionsRequest = (BatchDeleteContributionsRequest) z39VarM4219p.build();
            wj50.m88279p(batchDeleteContributionsRequest);
            sckVar.f207759a = list;
            sckVar.f207762d = 1;
            objM85234e = this.f3461a.m85234e(batchDeleteContributionsRequest, sckVar);
            yuk yukVar = yuk.f276404a;
            if (objM85234e == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = sckVar.f207759a;
            bga.m29073P(objM85234e);
        }
        BatchDeleteContributionsResponse batchDeleteContributionsResponse = (BatchDeleteContributionsResponse) objM85234e;
        int iM4220n = batchDeleteContributionsResponse.m4220n();
        ae50 ae50VarM4221o = batchDeleteContributionsResponse.m4221o();
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(list, 10));
        int i3 = 0;
        for (Object obj : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                h6f.m46722S();
                throw null;
            }
            if (i3 >= iM4220n) {
                k49Var = new k49(obj, new c6x0(ContributionApiError.EmptyResponse.f3454a));
            } else {
                DeleteContributionResponse deleteContributionResponse = (DeleteContributionResponse) ae50VarM4221o.get(i3);
                k49Var = new k49(obj, deleteContributionResponse.m4317p() ? w2a1.f247311a : deleteContributionResponse.m4316o() ? new c6x0(AbstractC0564b.m8033a(deleteContributionResponse.m4315n())) : new c6x0(ContributionApiError.EmptyResponse.f3454a));
            }
            arrayList2.add(k49Var);
            i3 = i4;
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [p.c6x0] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v8, types: [p.lau] */
    /* JADX WARN: Type inference failed for: r6v9, types: [p.c6x0] */
    /* JADX INFO: renamed from: c */
    public final Serializable m8030c(ArrayList arrayList, ibk ibkVar) {
        tck tckVar;
        Object c6x0Var;
        k49 k49Var;
        if (ibkVar instanceof tck) {
            tckVar = (tck) ibkVar;
            int i = tckVar.f219098d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tckVar.f219098d = i - Integer.MIN_VALUE;
            } else {
                tckVar = new tck(this, ibkVar);
            }
        } else {
            tckVar = new tck(this, ibkVar);
        }
        Object objM85231b = tckVar.f219096b;
        int i2 = tckVar.f219098d;
        if (i2 == 0) {
            bga.m29073P(objM85231b);
            j49 j49VarM4229p = BatchGetContributionsRequest.m4229p();
            ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                t710 t710Var = (t710) it.next();
                s710 s710VarM4332q = GetContributionsRequest.m4332q();
                s710VarM4332q.m77356r(AbstractC0568f.m8043g(t710Var.m80176c()));
                ContributionFilters contributionFiltersM8041e = AbstractC0568f.m8041e(t710Var.m80174a());
                if (contributionFiltersM8041e != null) {
                    s710VarM4332q.m77354m(contributionFiltersM8041e);
                }
                Integer numM80175b = t710Var.m80175b();
                if (numM80175b != null) {
                    int iIntValue = numM80175b.intValue();
                    vhk vhkVarM4279o = ContributionPagination.m4279o();
                    vhkVarM4279o.m85573m(iIntValue);
                    s710VarM4332q.m77355q((ContributionPagination) vhkVarM4279o.build());
                }
                arrayList2.add((GetContributionsRequest) s710VarM4332q.build());
            }
            j49VarM4229p.m52331m(arrayList2);
            BatchGetContributionsRequest batchGetContributionsRequest = (BatchGetContributionsRequest) j49VarM4229p.build();
            wj50.m88279p(batchGetContributionsRequest);
            tckVar.f219095a = arrayList;
            tckVar.f219098d = 1;
            objM85231b = this.f3461a.m85231b(batchGetContributionsRequest, tckVar);
            yuk yukVar = yuk.f276404a;
            if (objM85231b == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = tckVar.f219095a;
            bga.m29073P(objM85231b);
        }
        BatchGetContributionsResponse batchGetContributionsResponse = (BatchGetContributionsResponse) objM85231b;
        int iM4230n = batchGetContributionsResponse.m4230n();
        ae50 ae50VarM4231o = batchGetContributionsResponse.m4231o();
        ArrayList arrayList3 = new ArrayList(i6f.m49804T(arrayList, 10));
        int i3 = 0;
        for (Object obj : arrayList) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                h6f.m46722S();
                throw null;
            }
            if (i3 >= iM4230n) {
                k49Var = new k49(obj, new c6x0(ContributionApiError.EmptyResponse.f3454a));
            } else {
                GetContributionsResponse getContributionsResponse = (GetContributionsResponse) ae50VarM4231o.get(i3);
                if (getContributionsResponse.m4335p()) {
                    try {
                        ae50<Contribution> ae50VarM4338n = getContributionsResponse.m4333n().m4338n();
                        c6x0Var = new ArrayList(i6f.m49804T(ae50VarM4338n, 10));
                        for (Contribution contribution : ae50VarM4338n) {
                            wj50.m88279p(contribution);
                            c6x0Var.add(AbstractC0568f.m8037a(contribution));
                        }
                    } catch (ContributionApiError e) {
                        c6x0Var = new c6x0(e);
                    }
                } else {
                    c6x0Var = getContributionsResponse.m4336q() ? new c6x0(AbstractC0564b.m8033a(getContributionsResponse.m4334o())) : lau.f131415a;
                }
                k49Var = new k49(obj, c6x0Var);
            }
            arrayList3.add(k49Var);
            i3 = i4;
        }
        return arrayList3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Serializable m8031d(List list, ibk ibkVar) {
        uck uckVar;
        k49 k49Var;
        if (ibkVar instanceof uck) {
            uckVar = (uck) ibkVar;
            int i = uckVar.f229077d;
            if ((i & Integer.MIN_VALUE) != 0) {
                uckVar.f229077d = i - Integer.MIN_VALUE;
            } else {
                uckVar = new uck(this, ibkVar);
            }
        } else {
            uckVar = new uck(this, ibkVar);
        }
        Object objM85232c = uckVar.f229075b;
        int i2 = uckVar.f229077d;
        if (i2 == 0) {
            bga.m29073P(objM85232c);
            i49 i49VarM4224p = BatchGetContributionCapabilitiesRequest.m4224p();
            ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                qtb qtbVar = (qtb) it.next();
                r710 r710VarM4325o = GetContributionCapabilitiesRequest.m4325o();
                r710VarM4325o.m74882m(AbstractC0568f.m8040d(qtbVar));
                arrayList.add((GetContributionCapabilitiesRequest) r710VarM4325o.build());
            }
            i49VarM4224p.m49664m(arrayList);
            BatchGetContributionCapabilitiesRequest batchGetContributionCapabilitiesRequest = (BatchGetContributionCapabilitiesRequest) i49VarM4224p.build();
            wj50.m88279p(batchGetContributionCapabilitiesRequest);
            uckVar.f229074a = list;
            uckVar.f229077d = 1;
            objM85232c = this.f3461a.m85232c(batchGetContributionCapabilitiesRequest, uckVar);
            yuk yukVar = yuk.f276404a;
            if (objM85232c == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = uckVar.f229074a;
            bga.m29073P(objM85232c);
        }
        BatchGetContributionCapabilitiesResponse batchGetContributionCapabilitiesResponse = (BatchGetContributionCapabilitiesResponse) objM85232c;
        int iM4225n = batchGetContributionCapabilitiesResponse.m4225n();
        ae50 ae50VarM4226o = batchGetContributionCapabilitiesResponse.m4226o();
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(list, 10));
        int i3 = 0;
        for (Object obj : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                h6f.m46722S();
                throw null;
            }
            if (i3 >= iM4225n) {
                k49Var = new k49(obj, new c6x0(ContributionApiError.EmptyResponse.f3454a));
            } else {
                GetContributionCapabilitiesResponse getContributionCapabilitiesResponse = (GetContributionCapabilitiesResponse) ae50VarM4226o.get(i3);
                k49Var = new k49(obj, getContributionCapabilitiesResponse.hasCapabilities() ? AbstractC0568f.m8039c(getContributionCapabilitiesResponse.m4326n()) : getContributionCapabilitiesResponse.m4328p() ? new c6x0(AbstractC0564b.m8033a(getContributionCapabilitiesResponse.m4327o())) : new c6x0(ContributionApiError.EmptyResponse.f3454a));
            }
            arrayList2.add(k49Var);
            i3 = i4;
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Serializable m8032e(List list, ibk ibkVar) {
        vck vckVar;
        c6x0 c6x0Var;
        Object objM8037a;
        k49 k49Var;
        if (ibkVar instanceof vck) {
            vckVar = (vck) ibkVar;
            int i = vckVar.f240148d;
            if ((i & Integer.MIN_VALUE) != 0) {
                vckVar.f240148d = i - Integer.MIN_VALUE;
            } else {
                vckVar = new vck(this, ibkVar);
            }
        } else {
            vckVar = new vck(this, ibkVar);
        }
        Object objM85233d = vckVar.f240146b;
        int i2 = vckVar.f240148d;
        if (i2 == 0) {
            bga.m29073P(objM85233d);
            m59 m59VarM4234p = BatchUpdateContributionsRequest.m4234p();
            ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                t9a1 t9a1Var = (t9a1) it.next();
                s9a1 s9a1VarM4363p = UpdateContributionRequest.m4363p();
                fik fikVarM4291q = ContributionReference.m4291q();
                fikVarM4291q.m41749m(t9a1Var.m80274a());
                s9a1VarM4363p.m77571m(fikVarM4291q);
                s9a1VarM4363p.m77572q(AbstractC0568f.m8042f(t9a1Var.m80275b()));
                arrayList.add((UpdateContributionRequest) s9a1VarM4363p.build());
            }
            m59VarM4234p.m60849m(arrayList);
            BatchUpdateContributionsRequest batchUpdateContributionsRequest = (BatchUpdateContributionsRequest) m59VarM4234p.build();
            wj50.m88279p(batchUpdateContributionsRequest);
            vckVar.f240145a = list;
            vckVar.f240148d = 1;
            objM85233d = this.f3461a.m85233d(batchUpdateContributionsRequest, vckVar);
            yuk yukVar = yuk.f276404a;
            if (objM85233d == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = vckVar.f240145a;
            bga.m29073P(objM85233d);
        }
        BatchUpdateContributionsResponse batchUpdateContributionsResponse = (BatchUpdateContributionsResponse) objM85233d;
        int iM4235n = batchUpdateContributionsResponse.m4235n();
        ae50 ae50VarM4236o = batchUpdateContributionsResponse.m4236o();
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(list, 10));
        int i3 = 0;
        for (Object obj : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                h6f.m46722S();
                throw null;
            }
            if (i3 >= iM4235n) {
                k49Var = new k49(obj, new c6x0(ContributionApiError.EmptyResponse.f3454a));
            } else {
                UpdateContributionResponse updateContributionResponse = (UpdateContributionResponse) ae50VarM4236o.get(i3);
                if (updateContributionResponse.m4366p()) {
                    try {
                        objM8037a = AbstractC0568f.m8037a(updateContributionResponse.m4364n());
                    } catch (ContributionApiError e) {
                        c6x0Var = new c6x0(e);
                        objM8037a = c6x0Var;
                    }
                    k49Var = new k49(obj, objM8037a);
                } else {
                    c6x0Var = updateContributionResponse.m4367q() ? new c6x0(AbstractC0564b.m8033a(updateContributionResponse.m4365o())) : new c6x0(ContributionApiError.EmptyResponse.f3454a);
                }
                objM8037a = c6x0Var;
                k49Var = new k49(obj, objM8037a);
            }
            arrayList2.add(k49Var);
            i3 = i4;
        }
        return arrayList2;
    }
}
