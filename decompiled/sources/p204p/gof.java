package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.common_capping.esperanto.proto.CommonCappingOuterClass$GetQuotaStateAtRequest;
import com.spotify.common_capping.esperanto.proto.CommonCappingOuterClass$GetQuotaStateAtResponse;
import com.spotify.common_capping.esperanto.proto.CommonCappingOuterClass$IsCappedRequest;
import com.spotify.common_capping.esperanto.proto.CommonCappingOuterClass$IsCappedResponse;
import com.spotify.common_capping.esperanto.proto.CommonCappingOuterClass$ObserveCapStateChangedRequest;
import com.spotify.common_capping.esperanto.proto.CommonCappingOuterClass$ReportConsumptionRequest;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class gof {

    /* JADX INFO: renamed from: a */
    public final sr6 f82949a;

    public gof(sr6 sr6Var) {
        this.f82949a = sr6Var;
    }

    /* JADX INFO: renamed from: e */
    public static nof m45342e(hey heyVar) {
        switch (heyVar.ordinal()) {
            case 0:
                return nof.PICK_AND_SHUFFLE;
            case 1:
                return nof.AUDIOBOOKS;
            case 2:
                return nof.LYRICS;
            case 3:
                return nof.BLUEJAY;
            case 4:
                return nof.KALLAX;
            case 5:
                return nof.PROMPT_PLAYLIST;
            case 6:
                return nof.RUNNING_MODE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Enum m45343a(hey heyVar, int i, ibk ibkVar) {
        cof cofVar;
        gof gofVar;
        if (ibkVar instanceof cof) {
            cofVar = (cof) ibkVar;
            int i2 = cofVar.f40249d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cofVar.f40249d = i2 - Integer.MIN_VALUE;
            } else {
                cofVar = new cof(this, ibkVar);
            }
        } else {
            cofVar = new cof(this, ibkVar);
        }
        Object objM79101z = cofVar.f40247b;
        int i3 = cofVar.f40249d;
        if (i3 == 0) {
            bga.m29073P(objM79101z);
            oof oofVarM6899p = CommonCappingOuterClass$GetQuotaStateAtRequest.m6899p();
            oofVarM6899p.m67505q(m45342e(heyVar));
            oofVarM6899p.m67504m(i);
            CommonCappingOuterClass$GetQuotaStateAtRequest commonCappingOuterClass$GetQuotaStateAtRequest = (CommonCappingOuterClass$GetQuotaStateAtRequest) oofVarM6899p.build();
            wj50.m88279p(commonCappingOuterClass$GetQuotaStateAtRequest);
            cofVar.f40246a = this;
            cofVar.f40249d = 1;
            objM79101z = this.f82949a.m79101z(commonCappingOuterClass$GetQuotaStateAtRequest, cofVar);
            yuk yukVar = yuk.f276404a;
            if (objM79101z == yukVar) {
                return yukVar;
            }
            gofVar = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gofVar = cofVar.f40246a;
            bga.m29073P(objM79101z);
        }
        sof sofVarM6901n = ((CommonCappingOuterClass$GetQuotaStateAtResponse) objM79101z).m6901n();
        gofVar.getClass();
        int iOrdinal = sofVarM6901n.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return j0u0.f107558b;
            }
            if (iOrdinal == 2) {
                return j0u0.f107559c;
            }
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return j0u0.f107557a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m45344b(hey heyVar, ibk ibkVar) {
        dof dofVar;
        if (ibkVar instanceof dof) {
            dofVar = (dof) ibkVar;
            int i = dofVar.f51030c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dofVar.f51030c = i - Integer.MIN_VALUE;
            } else {
                dofVar = new dof(this, ibkVar);
            }
        } else {
            dofVar = new dof(this, ibkVar);
        }
        Object objM79031G = dofVar.f51028a;
        int i2 = dofVar.f51030c;
        if (i2 == 0) {
            bga.m29073P(objM79031G);
            qof qofVarM6903o = CommonCappingOuterClass$IsCappedRequest.m6903o();
            qofVarM6903o.m73392m(m45342e(heyVar));
            CommonCappingOuterClass$IsCappedRequest commonCappingOuterClass$IsCappedRequest = (CommonCappingOuterClass$IsCappedRequest) qofVarM6903o.build();
            dofVar.f51030c = 1;
            objM79031G = this.f82949a.m79031G(commonCappingOuterClass$IsCappedRequest, dofVar);
            yuk yukVar = yuk.f276404a;
            if (objM79031G == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM79031G);
        }
        return qyg1.m74178H(((CommonCappingOuterClass$IsCappedResponse) objM79031G).m6905n());
    }

    /* JADX INFO: renamed from: c */
    public final yxb m45345c(hey heyVar) {
        rof rofVarM6907o = CommonCappingOuterClass$ObserveCapStateChangedRequest.m6907o();
        rofVarM6907o.m76047m(m45342e(heyVar));
        return new yxb(mvl0.m62953p(this.f82949a.m79039O((CommonCappingOuterClass$ObserveCapStateChangedRequest) rofVarM6907o.build())), 20);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m45346d(hey heyVar, String str, long j, String str2, ibk ibkVar) throws Exception {
        fof fofVar;
        if (ibkVar instanceof fof) {
            fofVar = (fof) ibkVar;
            int i = fofVar.f71524f;
            if ((i & Integer.MIN_VALUE) != 0) {
                fofVar.f71524f = i - Integer.MIN_VALUE;
            } else {
                fofVar = new fof(this, ibkVar);
            }
        } else {
            fofVar = new fof(this, ibkVar);
        }
        Object obj = fofVar.f71522d;
        int i2 = fofVar.f71524f;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                uof uofVarM6917r = CommonCappingOuterClass$ReportConsumptionRequest.m6917r();
                uofVarM6917r.m83619s(m45342e(heyVar));
                uofVarM6917r.m83618r(str);
                uofVarM6917r.m83616m(j);
                uofVarM6917r.m83617q(str2);
                CommonCappingOuterClass$ReportConsumptionRequest commonCappingOuterClass$ReportConsumptionRequest = (CommonCappingOuterClass$ReportConsumptionRequest) uofVarM6917r.build();
                sr6 sr6Var = this.f82949a;
                wj50.m88279p(commonCappingOuterClass$ReportConsumptionRequest);
                fofVar.f71519a = heyVar;
                fofVar.f71520b = str;
                fofVar.f71521c = j;
                fofVar.f71524f = 1;
                Object objM79056c0 = sr6Var.m79056c0(commonCappingOuterClass$ReportConsumptionRequest, fofVar);
                yuk yukVar = yuk.f276404a;
                if (objM79056c0 == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = fofVar.f71521c;
                str = fofVar.f71520b;
                heyVar = fofVar.f71519a;
                bga.m29073P(obj);
            }
            Objects.toString(heyVar);
            return w2a1.f247311a;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append(heyVar);
            sb.append(": Failed to add ");
            sb.append(j);
            sb.append(" consumption [");
            Logger.m3967c(e, dq60.m36616p(str, "]", sb), new Object[0]);
            throw e;
        }
    }
}
