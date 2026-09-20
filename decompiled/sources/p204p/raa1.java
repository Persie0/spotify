package p204p;

import com.spotify.bluejay.data.api.GenerationServiceException;
import com.spotify.personalizedepisodes.contentservice.p124v1.CreateOrUpdateScheduleRequest;
import com.spotify.personalizedepisodes.contentservice.p124v1.CreateOrUpdateScheduleResponse;
import com.spotify.personalizedepisodes.contentservice.p124v1.GetEntityDetailsResponse;
import com.spotify.personalizedepisodes.contentservice.p124v1.PromptDetails;
import com.spotify.personalizedepisodes.contentservice.p124v1.ScheduledPrompt;
import com.spotify.personalizedepisodes.contentservice.p124v1.ToolSelection;
import com.spotify.personalizedepisodes.contentservice.p124v1.TriggerGenerationRequest;

/* JADX INFO: loaded from: classes5.dex */
public final class raa1 {

    /* JADX INFO: renamed from: a */
    public final saa1 f197245a;

    public raa1(saa1 saa1Var) {
        this.f197245a = saa1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m75104a(p810 p810Var, ibk ibkVar) throws GenerationServiceException {
        oaa1 oaa1Var;
        if (ibkVar instanceof oaa1) {
            oaa1Var = (oaa1) ibkVar;
            int i = oaa1Var.f163285c;
            if ((i & Integer.MIN_VALUE) != 0) {
                oaa1Var.f163285c = i - Integer.MIN_VALUE;
            } else {
                oaa1Var = new oaa1(this, ibkVar);
            }
        } else {
            oaa1Var = new oaa1(this, ibkVar);
        }
        Object objM77617a = oaa1Var.f163283a;
        int i2 = oaa1Var.f163285c;
        if (i2 == 0) {
            bga.m29073P(objM77617a);
            String str = p810Var.f174809a;
            oaa1Var.f163285c = 1;
            objM77617a = this.f197245a.m77617a(str, oaa1Var);
            yuk yukVar = yuk.f276404a;
            if (objM77617a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM77617a);
        }
        o2x0 o2x0Var = (o2x0) objM77617a;
        if (!o2x0Var.f161171a.f149852O0) {
            throw iyg1.m51936w(o2x0Var);
        }
        Object obj = o2x0Var.f161172b;
        if (obj == null) {
            throw new IllegalArgumentException("Response body is null for successful get entity details response");
        }
        ScheduledPrompt scheduledPromptM17418n = ((GetEntityDetailsResponse) obj).m17418n();
        String id = scheduledPromptM17418n.getId();
        ney0 ney0VarM57601D = kxf1.m57601D(scheduledPromptM17418n.m17497t());
        PromptDetails promptDetailsM17496s = scheduledPromptM17418n.m17496s();
        nks0 nks0Var = new nks0(promptDetailsM17496s.m17470n(), promptDetailsM17496s.m17471p());
        String strM17494q = scheduledPromptM17418n.m17494q();
        boolean zM17493p = scheduledPromptM17418n.m17493p();
        boolean zM17492o = scheduledPromptM17418n.m17492o();
        g081 g081Var = new g081(scheduledPromptM17418n.m17498u().m17528p());
        String strM17495r = scheduledPromptM17418n.m17495r();
        if (strM17495r.length() <= 0) {
            strM17495r = null;
        }
        return new q810(new yfy0(id, ney0VarM57601D, nks0Var, strM17494q, zM17493p, scheduledPromptM17418n.m17500w() ? new dsc1(scheduledPromptM17418n.m17499v().getId(), scheduledPromptM17418n.m17499v().getName(), scheduledPromptM17418n.m17499v().getDescription(), scheduledPromptM17418n.m17499v().m17549o()) : null, zM17492o, g081Var, strM17495r));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m75105b(kk91 kk91Var, ibk ibkVar) throws GenerationServiceException {
        paa1 paa1Var;
        if (ibkVar instanceof paa1) {
            paa1Var = (paa1) ibkVar;
            int i = paa1Var.f175460c;
            if ((i & Integer.MIN_VALUE) != 0) {
                paa1Var.f175460c = i - Integer.MIN_VALUE;
            } else {
                paa1Var = new paa1(this, ibkVar);
            }
        } else {
            paa1Var = new paa1(this, ibkVar);
        }
        Object objM77619c = paa1Var.f175458a;
        int i2 = paa1Var.f175460c;
        if (i2 == 0) {
            bga.m29073P(objM77619c);
            jk91 jk91VarM17534o = TriggerGenerationRequest.m17534o();
            jk91VarM17534o.m53586m(kk91Var.f123545a);
            TriggerGenerationRequest triggerGenerationRequest = (TriggerGenerationRequest) jk91VarM17534o.build();
            paa1Var.f175460c = 1;
            objM77619c = this.f197245a.m77619c(triggerGenerationRequest, paa1Var);
            yuk yukVar = yuk.f276404a;
            if (objM77619c == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM77619c);
        }
        o2x0 o2x0Var = (o2x0) objM77619c;
        if (o2x0Var.f161171a.f149852O0) {
            return w2a1.f247311a;
        }
        throw iyg1.m51936w(o2x0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m75106c(pda1 pda1Var, ibk ibkVar) throws GenerationServiceException {
        qaa1 qaa1Var;
        String strM17405n;
        if (ibkVar instanceof qaa1) {
            qaa1Var = (qaa1) ibkVar;
            int i = qaa1Var.f186835c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qaa1Var.f186835c = i - Integer.MIN_VALUE;
            } else {
                qaa1Var = new qaa1(this, ibkVar);
            }
        } else {
            qaa1Var = new qaa1(this, ibkVar);
        }
        Object objM77618b = qaa1Var.f186833a;
        int i2 = qaa1Var.f186835c;
        if (i2 == 0) {
            bga.m29073P(objM77618b);
            dal dalVarM17404v = CreateOrUpdateScheduleRequest.m17404v();
            dalVarM17404v.m35491m(pda1Var.f176397a);
            dalVarM17404v.m35496u(pda1Var.f176398b);
            ney0 ney0Var = pda1Var.f176399c;
            if (ney0Var != null) {
                dalVarM17404v.m35495t(kxf1.m57602E(ney0Var));
            }
            String str = pda1Var.f176400d;
            if (str != null) {
                dalVarM17404v.m35494s(str);
            }
            String str2 = pda1Var.f176401e;
            if (str2 != null) {
                dalVarM17404v.m35498w(str2);
            }
            Boolean bool = pda1Var.f176402f;
            if (bool != null) {
                dalVarM17404v.m35492q(bool.booleanValue());
            }
            g081 g081Var = pda1Var.f176403g;
            if (g081Var != null) {
                f081 f081VarM17527q = ToolSelection.m17527q();
                f081VarM17527q.m40444m(g081Var.f75311a);
                dalVarM17404v.m35497v((ToolSelection) f081VarM17527q.build());
            }
            String str3 = pda1Var.f176404h;
            if (str3 != null) {
                dalVarM17404v.m35493r(str3);
            }
            CreateOrUpdateScheduleRequest createOrUpdateScheduleRequest = (CreateOrUpdateScheduleRequest) dalVarM17404v.build();
            qaa1Var.f186835c = 1;
            objM77618b = this.f197245a.m77618b(createOrUpdateScheduleRequest, qaa1Var);
            yuk yukVar = yuk.f276404a;
            if (objM77618b == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM77618b);
        }
        o2x0 o2x0Var = (o2x0) objM77618b;
        if (!o2x0Var.f161171a.f149852O0) {
            throw iyg1.m51936w(o2x0Var);
        }
        CreateOrUpdateScheduleResponse createOrUpdateScheduleResponse = (CreateOrUpdateScheduleResponse) o2x0Var.f161172b;
        String str4 = null;
        if (createOrUpdateScheduleResponse != null && (strM17405n = createOrUpdateScheduleResponse.m17405n()) != null && strM17405n.length() > 0) {
            str4 = strM17405n;
        }
        return new qda1(str4);
    }
}
