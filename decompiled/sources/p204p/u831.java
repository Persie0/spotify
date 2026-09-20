package p204p;

import com.comscore.util.crashreport.CrashReportManager;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Format;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.templates.SnackBarTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;

/* JADX INFO: loaded from: classes8.dex */
public final class u831 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ c931 f227802a;

    public u831(c931 c931Var) {
        this.f227802a = c931Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m82550b(boolean z, fbk fbkVar) {
        t831 t831Var;
        c931 c931Var;
        pqm0 pqm0Var;
        MessageResponseToken messageResponseToken;
        SnackBarTemplate snackBarTemplate;
        MessageResponseToken messageResponseToken2;
        Message.CreativeMessage messageData;
        if (fbkVar instanceof t831) {
            t831Var = (t831) fbkVar;
            int i = t831Var.f217955d;
            if ((i & Integer.MIN_VALUE) != 0) {
                t831Var.f217955d = i - Integer.MIN_VALUE;
            } else {
                t831Var = new t831(this, fbkVar);
            }
        } else {
            t831Var = new t831(this, fbkVar);
        }
        Object obj = t831Var.f217953b;
        int i2 = t831Var.f217955d;
        if (i2 == 0) {
            bga.m29073P(obj);
            if (z && (pqm0Var = (c931Var = this.f227802a).f35390l) != null && (messageResponseToken = (MessageResponseToken) pqm0Var.f180350a) != null) {
                ((bdl0) c931Var.f35381c).m28838a(messageResponseToken);
                pqm0 pqm0Var2 = c931Var.f35390l;
                String strButtonText = null;
                if (((Format.SnackBar) ((pqm0Var2 == null || (messageResponseToken2 = (MessageResponseToken) pqm0Var2.f180350a) == null || (messageData = messageResponseToken2.getMessageData()) == null) ? null : messageData.getFormat())).getAutoDismissEnabled()) {
                    pqm0 pqm0Var3 = c931Var.f35390l;
                    if (pqm0Var3 != null && (snackBarTemplate = (SnackBarTemplate) pqm0Var3.f180351b) != null) {
                        strButtonText = snackBarTemplate.buttonText();
                    }
                    if (strButtonText != null && strButtonText.length() == 0) {
                        strButtonText = "Done";
                    }
                    int i3 = (strButtonText == null || strButtonText.length() <= 0) ? 3000 : CrashReportManager.TIME_WINDOW;
                    t831Var.f217952a = c931Var;
                    t831Var.f217955d = 1;
                    Object objM64619l = njg1.m64619l(i3, t831Var);
                    yuk yukVar = yuk.f276404a;
                    if (objM64619l == yukVar) {
                        return yukVar;
                    }
                }
            }
            return w2a1.f247311a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c931Var = t831Var.f217952a;
        bga.m29073P(obj);
        cds0 cds0Var = c931Var.f35391m;
        if (cds0Var != null && cds0Var.f36944b.f158717a.getValue() == gds0.f78939b) {
            cds0Var.f36945c.f68558a.m72300d();
        }
        return w2a1.f247311a;
    }

    @Override // p204p.niz
    public final /* bridge */ /* synthetic */ Object emit(Object obj, fbk fbkVar) {
        return m82550b(((Boolean) obj).booleanValue(), fbkVar);
    }
}
