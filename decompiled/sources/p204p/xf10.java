package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ClientMessage;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ConflictResolutionStrategy;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponse;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.Pacing;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.PacingTimeUnit;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Format;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.templates.BottomSheetTemplate;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.completable.CompletableCreate;
import java.util.UUID;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class xf10 {

    /* JADX INFO: renamed from: a */
    public final ske f260807a;

    /* JADX INFO: renamed from: b */
    public final vmz f260808b;

    /* JADX INFO: renamed from: c */
    public final e940 f260809c;

    /* JADX INFO: renamed from: d */
    public final jz6 f260810d;

    /* JADX INFO: renamed from: e */
    public final yum0 f260811e = sam.m77645B(null);

    public xf10(ske skeVar, vmz vmzVar, e940 e940Var, jz6 jz6Var) {
        this.f260807a = skeVar;
        this.f260808b = vmzVar;
        this.f260809c = e940Var;
        this.f260810d = jz6Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m90446a(String str, ibk ibkVar) {
        rf10 rf10Var;
        if (ibkVar instanceof rf10) {
            rf10Var = (rf10) ibkVar;
            int i = rf10Var.f198483c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rf10Var.f198483c = i - Integer.MIN_VALUE;
            } else {
                rf10Var = new rf10(this, ibkVar);
            }
        } else {
            rf10Var = new rf10(this, ibkVar);
        }
        Object obj = rf10Var.f198481a;
        int i2 = rf10Var.f198483c;
        boolean z = true;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                CompletableCreate completableCreateM60189o = this.f260809c.mo24613j(str).m60189o();
                rf10Var.f198483c = 1;
                Object objM96565n = zn91.m96565n(completableCreateM60189o, rf10Var);
                yuk yukVar = yuk.f276404a;
                if (objM96565n == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            z = false;
        }
        return qyg1.m74178H(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c7, code lost:
    
        if (r1 == r7) goto L25;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m90447b(eh00 eh00Var, ibk ibkVar) {
        sf10 sf10Var;
        eh00 eh00Var2;
        Object objM90446a;
        if (ibkVar instanceof sf10) {
            sf10Var = (sf10) ibkVar;
            int i = sf10Var.f208435d;
            if ((i & Integer.MIN_VALUE) != 0) {
                sf10Var.f208435d = i - Integer.MIN_VALUE;
            } else {
                sf10Var = new sf10(this, ibkVar);
            }
        } else {
            sf10Var = new sf10(this, ibkVar);
        }
        Object objM96567o = sf10Var.f208433b;
        int i2 = sf10Var.f208435d;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            eh00Var2 = eh00Var;
            sf10Var.f208432a = eh00Var2;
            sf10Var.f208435d = 1;
            objM90446a = m90446a("https://wear.spotifycdn.com/glasses_account_linking_nudge.webp", sf10Var);
            if (objM90446a != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            eh00 eh00Var3 = sf10Var.f208432a;
            bga.m29073P(objM96567o);
            objM90446a = objM96567o;
            eh00Var2 = eh00Var3;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM96567o);
        }
        MessageResponse messageResponse = (MessageResponse) objM96567o;
        if (!(messageResponse instanceof MessageResponse.Success)) {
            return qyg1.m74178H(false);
        }
        MessageResponse.Success success = (MessageResponse.Success) messageResponse;
        success.getMessageRequestId();
        this.f260811e.setValue(success.getToken());
        return qyg1.m74178H(true);
        boolean zBooleanValue = ((Boolean) objM90446a).booleanValue();
        jz6 jz6Var = this.f260810d;
        if (!zBooleanValue) {
            jz6Var.m54840c(1, 2, 7);
            return qyg1.m74178H(false);
        }
        C2020jm c2020jm = new C2020jm(new tf10(this, eh00Var2, 0));
        jz6Var.m54840c(1, 1, 1);
        Single singleM78369c = ske.m78369c(this.f260807a, "glasses_account_linking_nudge", null, null, geg1.m44518y(new ClientMessage("GLASSES_ACCOUNT_LINKING_NUDGE", UUID.randomUUID().toString(), new Format.BottomSheet(new BottomSheetTemplate.CustomBottomSheet(new gut(c2020jm, new vf10(this, 0)))), gbu.f78413a, new Pacing(0, PacingTimeUnit.HOURS))), null, null, null, ConflictResolutionStrategy.DISMISS_OTHER, null, 374);
        sf10Var.f208432a = null;
        sf10Var.f208435d = 2;
        objM96567o = zn91.m96567o(singleM78369c, sf10Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ee, code lost:
    
        if (r1 == r9) goto L31;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m90448c(eh00 eh00Var, ibk ibkVar) {
        wf10 wf10Var;
        eh00 eh00Var2;
        Object objM90446a;
        eh00 eh00Var3;
        if (ibkVar instanceof wf10) {
            wf10Var = (wf10) ibkVar;
            int i = wf10Var.f250663d;
            if ((i & Integer.MIN_VALUE) != 0) {
                wf10Var.f250663d = i - Integer.MIN_VALUE;
            } else {
                wf10Var = new wf10(this, ibkVar);
            }
        } else {
            wf10Var = new wf10(this, ibkVar);
        }
        Object objM96567o = wf10Var.f250661b;
        int i2 = wf10Var.f250663d;
        jz6 jz6Var = this.f260810d;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            eh00Var2 = eh00Var;
            wf10Var.f250660a = eh00Var2;
            wf10Var.f250663d = 1;
            objM90446a = m90446a("https://wear.spotifycdn.com/glasses-education-step1.webp", wf10Var);
            if (objM90446a != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            eh00 eh00Var4 = wf10Var.f250660a;
            bga.m29073P(objM96567o);
            objM90446a = objM96567o;
            eh00Var2 = eh00Var4;
        } else if (i2 == 2) {
            eh00Var3 = wf10Var.f250660a;
            bga.m29073P(objM96567o);
            gf10 gf10Var = new gf10(((Boolean) objM96567o).booleanValue(), new tf10(this, eh00Var3, 1));
            jz6Var.m54840c(2, 1, 1);
            Single singleM78369c = ske.m78369c(this.f260807a, "glasses_education_flow", null, null, geg1.m44518y(new ClientMessage("GLASSES_EDUCATION_FLOW", UUID.randomUUID().toString(), new Format.BottomSheet(new BottomSheetTemplate.CustomBottomSheet(new gut(gf10Var, new vf10(this, 1)))), gbu.f78413a, new Pacing(0, PacingTimeUnit.HOURS))), null, null, null, ConflictResolutionStrategy.DISMISS_OTHER, null, 374);
            wf10Var.f250660a = null;
            wf10Var.f250663d = 3;
            objM96567o = zn91.m96567o(singleM78369c, wf10Var);
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM96567o);
        }
        MessageResponse messageResponse = (MessageResponse) objM96567o;
        if (!(messageResponse instanceof MessageResponse.Success)) {
            return qyg1.m74178H(false);
        }
        MessageResponse.Success success = (MessageResponse.Success) messageResponse;
        success.getMessageRequestId();
        this.f260811e.setValue(success.getToken());
        return qyg1.m74178H(true);
        if (!((Boolean) objM90446a).booleanValue()) {
            jz6Var.m54840c(2, 2, 7);
            return qyg1.m74178H(false);
        }
        kmx kmxVarM31952q = c9g1.m31952q(this.f260808b);
        wf10Var.f250660a = eh00Var2;
        wf10Var.f250663d = 2;
        Object objM86755t = vyf1.m86755t(kmxVarM31952q, wf10Var);
        if (objM86755t != obj) {
            eh00Var3 = eh00Var2;
            objM96567o = objM86755t;
            gf10 gf10Var2 = new gf10(((Boolean) objM96567o).booleanValue(), new tf10(this, eh00Var3, 1));
            jz6Var.m54840c(2, 1, 1);
            Single singleM78369c2 = ske.m78369c(this.f260807a, "glasses_education_flow", null, null, geg1.m44518y(new ClientMessage("GLASSES_EDUCATION_FLOW", UUID.randomUUID().toString(), new Format.BottomSheet(new BottomSheetTemplate.CustomBottomSheet(new gut(gf10Var2, new vf10(this, 1)))), gbu.f78413a, new Pacing(0, PacingTimeUnit.HOURS))), null, null, null, ConflictResolutionStrategy.DISMISS_OTHER, null, 374);
            wf10Var.f250660a = null;
            wf10Var.f250663d = 3;
            objM96567o = zn91.m96567o(singleM78369c2, wf10Var);
        }
        return obj;
    }
}
