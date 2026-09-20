package p204p;

import com.spotify.upselloffer.endpointimpl.proto.GetUpsellOfferRequest;
import com.spotify.upselloffer.endpointimpl.proto.GetUpsellOfferResponse;

/* JADX INFO: loaded from: classes2.dex */
public final class aia1 {

    /* JADX INFO: renamed from: a */
    public final utk0 f15924a;

    public aia1(utk0 utk0Var) {
        this.f15924a = utk0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m26066a(ibk ibkVar) {
        zha1 zha1Var;
        if (ibkVar instanceof zha1) {
            zha1Var = (zha1) ibkVar;
            int i = zha1Var.f282862c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zha1Var.f282862c = i - Integer.MIN_VALUE;
            } else {
                zha1Var = new zha1(this, ibkVar);
            }
        } else {
            zha1Var = new zha1(this, ibkVar);
        }
        Object objM83930a = zha1Var.f282860a;
        int i2 = zha1Var.f282862c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM83930a);
                utk0 utk0Var = this.f15924a;
                hc10 hc10VarM22034p = GetUpsellOfferRequest.m22034p();
                hc10VarM22034p.m47089m(ihf1.m50632p());
                GetUpsellOfferRequest getUpsellOfferRequest = (GetUpsellOfferRequest) hc10VarM22034p.build();
                zha1Var.f282862c = 1;
                objM83930a = utk0Var.m83930a(getUpsellOfferRequest, zha1Var);
                yuk yukVar = yuk.f276404a;
                if (objM83930a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM83930a);
            }
            GetUpsellOfferResponse getUpsellOfferResponse = (GetUpsellOfferResponse) objM83930a;
            return (getUpsellOfferResponse.m22036o() && getUpsellOfferResponse.m22035n().m22040q()) ? new mtk0(getUpsellOfferResponse.m22035n().m22038n(), getUpsellOfferResponse.m22035n().m22039p()) : ltk0.f136821a;
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            return new ktk0(message);
        }
    }
}
