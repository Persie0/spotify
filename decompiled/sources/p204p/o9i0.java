package p204p;

import com.spotify.familyverify.p064v1.GetQrCodeVerificationOnboardingRequest;
import com.spotify.familyverify.p064v1.GetQrCodeVerificationOnboardingResponse;
import com.spotify.familyverify.p064v1.StartQrCodeVerificationFlowRequest;
import com.spotify.familyverify.p064v1.StartQrCodeVerificationFlowResponse;
import com.spotify.familyverify.p064v1.VerifyQrCodeRequest;
import com.spotify.familyverify.p064v1.VerifyQrCodeResponse;

/* JADX INFO: loaded from: classes2.dex */
public final class o9i0 {

    /* JADX INFO: renamed from: a */
    public final p9i0 f163044a;

    public o9i0(p9i0 p9i0Var) {
        this.f163044a = p9i0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m66474a(boolean z, ibk ibkVar) {
        l9i0 l9i0Var;
        if (ibkVar instanceof l9i0) {
            l9i0Var = (l9i0) ibkVar;
            int i = l9i0Var.f131132c;
            if ((i & Integer.MIN_VALUE) != 0) {
                l9i0Var.f131132c = i - Integer.MIN_VALUE;
            } else {
                l9i0Var = new l9i0(this, ibkVar);
            }
        } else {
            l9i0Var = new l9i0(this, ibkVar);
        }
        Object objM69395a = l9i0Var.f131130a;
        int i2 = l9i0Var.f131132c;
        if (i2 == 0) {
            bga.m29073P(objM69395a);
            oa10 oa10VarM10618q = GetQrCodeVerificationOnboardingRequest.m10618q();
            oa10VarM10618q.m66510m();
            oa10VarM10618q.m66511q(z);
            GetQrCodeVerificationOnboardingRequest getQrCodeVerificationOnboardingRequest = (GetQrCodeVerificationOnboardingRequest) oa10VarM10618q.build();
            wj50.m88279p(getQrCodeVerificationOnboardingRequest);
            l9i0Var.f131132c = 1;
            objM69395a = this.f163044a.m69395a(getQrCodeVerificationOnboardingRequest, l9i0Var);
            yuk yukVar = yuk.f276404a;
            if (objM69395a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM69395a);
        }
        return zag1.m95790m((GetQrCodeVerificationOnboardingResponse) objM69395a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m66475b(boolean z, ibk ibkVar) {
        m9i0 m9i0Var;
        if (ibkVar instanceof m9i0) {
            m9i0Var = (m9i0) ibkVar;
            int i = m9i0Var.f141318c;
            if ((i & Integer.MIN_VALUE) != 0) {
                m9i0Var.f141318c = i - Integer.MIN_VALUE;
            } else {
                m9i0Var = new m9i0(this, ibkVar);
            }
        } else {
            m9i0Var = new m9i0(this, ibkVar);
        }
        Object objM69396b = m9i0Var.f141316a;
        int i2 = m9i0Var.f141318c;
        if (i2 == 0) {
            bga.m29073P(objM69396b);
            hr41 hr41VarM10642q = StartQrCodeVerificationFlowRequest.m10642q();
            hr41VarM10642q.m48324m();
            hr41VarM10642q.m48325q(z);
            StartQrCodeVerificationFlowRequest startQrCodeVerificationFlowRequest = (StartQrCodeVerificationFlowRequest) hr41VarM10642q.build();
            wj50.m88279p(startQrCodeVerificationFlowRequest);
            m9i0Var.f141318c = 1;
            objM69396b = this.f163044a.m69396b(startQrCodeVerificationFlowRequest, m9i0Var);
            yuk yukVar = yuk.f276404a;
            if (objM69396b == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM69396b);
        }
        return zag1.m95791n((StartQrCodeVerificationFlowResponse) objM69396b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m66476c(String str, ibk ibkVar) {
        n9i0 n9i0Var;
        if (ibkVar instanceof n9i0) {
            n9i0Var = (n9i0) ibkVar;
            int i = n9i0Var.f151808c;
            if ((i & Integer.MIN_VALUE) != 0) {
                n9i0Var.f151808c = i - Integer.MIN_VALUE;
            } else {
                n9i0Var = new n9i0(this, ibkVar);
            }
        } else {
            n9i0Var = new n9i0(this, ibkVar);
        }
        Object objM69397c = n9i0Var.f151806a;
        int i2 = n9i0Var.f151808c;
        if (i2 == 0) {
            bga.m29073P(objM69397c);
            udb1 udb1VarM10664p = VerifyQrCodeRequest.m10664p();
            udb1VarM10664p.m82849m(str);
            VerifyQrCodeRequest verifyQrCodeRequest = (VerifyQrCodeRequest) udb1VarM10664p.build();
            wj50.m88279p(verifyQrCodeRequest);
            n9i0Var.f151808c = 1;
            objM69397c = this.f163044a.m69397c(verifyQrCodeRequest, n9i0Var);
            yuk yukVar = yuk.f276404a;
            if (objM69397c == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM69397c);
        }
        return zag1.m95792o((VerifyQrCodeResponse) objM69397c);
    }
}
