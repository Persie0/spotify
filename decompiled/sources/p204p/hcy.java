package p204p;

import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.culturalmoments.faneventredemption.FanEventRedemptionFailureException;
import com.spotify.fanevents.p067v1.VerifyRedemptionCodeRequest;
import com.spotify.fanevents.p067v1.VerifyRedemptionCodeResponse;
import java.io.Serializable;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes6.dex */
public final class hcy {

    /* JADX INFO: renamed from: a */
    public final vcy f89929a;

    public hcy(vcy vcyVar) {
        this.f89929a = vcyVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Serializable m47142a(String str, String str2, ibk ibkVar) {
        gcy gcyVar;
        Object c6x0Var;
        if (ibkVar instanceof gcy) {
            gcyVar = (gcy) ibkVar;
            int i = gcyVar.f78669c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gcyVar.f78669c = i - Integer.MIN_VALUE;
            } else {
                gcyVar = new gcy(this, ibkVar);
            }
        } else {
            gcyVar = new gcy(this, ibkVar);
        }
        Object objM85204a = gcyVar.f78667a;
        int i2 = gcyVar.f78669c;
        int i3 = 5;
        try {
            if (i2 == 0) {
                bga.m29073P(objM85204a);
                vcy vcyVar = this.f89929a;
                vdb1 vdb1VarM10959p = VerifyRedemptionCodeRequest.m10959p();
                vdb1VarM10959p.m85219q(str);
                vdb1VarM10959p.m85218m(str2);
                VerifyRedemptionCodeRequest verifyRedemptionCodeRequest = (VerifyRedemptionCodeRequest) vdb1VarM10959p.build();
                gcyVar.f78669c = 1;
                objM85204a = vcyVar.m85204a(verifyRedemptionCodeRequest, gcyVar);
                yuk yukVar = yuk.f276404a;
                if (objM85204a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM85204a);
            }
            VerifyRedemptionCodeResponse verifyRedemptionCodeResponse = (VerifyRedemptionCodeResponse) objM85204a;
            int iOrdinal = verifyRedemptionCodeResponse.m10960n().ordinal();
            if (iOrdinal != 0 && iOrdinal != 1) {
                if (iOrdinal == 2) {
                    c6x0Var = zcy.f281585a;
                } else if (iOrdinal == 3) {
                    c6x0Var = zcy.f281586b;
                } else if (iOrdinal == 4) {
                    c6x0Var = zcy.f281587c;
                } else if (iOrdinal != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                Throwable thM77348a = s6x0.m77348a(c6x0Var);
                if (thM77348a == null) {
                    return (zcy) c6x0Var;
                }
                if ((thM77348a instanceof o1a1) || (thM77348a instanceof InvalidProtocolBufferException)) {
                    i3 = 4;
                } else if (thM77348a instanceof HttpException) {
                    int i4 = ((HttpException) thM77348a).f288164a;
                    if (400 <= i4 && i4 < 500) {
                        i3 = 3;
                    } else if (500 <= i4 && i4 < 600) {
                        i3 = 2;
                    }
                } else if ((thM77348a instanceof UnknownHostException) || (thM77348a instanceof ConnectException)) {
                    i3 = 1;
                }
                return new c6x0(new FanEventRedemptionFailureException(i3, thM77348a));
            }
            throw new o1a1("Unexpected redemption state: " + verifyRedemptionCodeResponse.m10960n());
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
    }
}
