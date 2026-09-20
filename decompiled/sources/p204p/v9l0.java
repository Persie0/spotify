package p204p;

import com.spotify.ondemandtrials.trialstartimpl.proto.CheckEligibilityRequest;
import com.spotify.ondemandtrials.trialstartimpl.proto.CheckEligibilityResponse;
import com.spotify.ondemandtrials.trialstartimpl.proto.GetTrialRequest;
import com.spotify.ondemandtrials.trialstartimpl.proto.GetTrialResponse;
import com.spotify.ondemandtrials.trialstartimpl.proto.StartTrialRequest;
import com.spotify.ondemandtrials.trialstartimpl.proto.StartTrialResponse;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class v9l0 {

    /* JADX INFO: renamed from: a */
    public final w9l0 f238978a;

    public v9l0(w9l0 w9l0Var) {
        this.f238978a = w9l0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m84970a(ibk ibkVar) {
        s9l0 s9l0Var;
        if (ibkVar instanceof s9l0) {
            s9l0Var = (s9l0) ibkVar;
            int i = s9l0Var.f206978c;
            if ((i & Integer.MIN_VALUE) != 0) {
                s9l0Var.f206978c = i - Integer.MIN_VALUE;
            } else {
                s9l0Var = new s9l0(this, ibkVar);
            }
        } else {
            s9l0Var = new s9l0(this, ibkVar);
        }
        Object objM87522d = s9l0Var.f206976a;
        int i2 = s9l0Var.f206978c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM87522d);
                w9l0 w9l0Var = this.f238978a;
                ayd aydVarM16235p = CheckEligibilityRequest.m16235p();
                aydVarM16235p.m27512m();
                CheckEligibilityRequest checkEligibilityRequest = (CheckEligibilityRequest) aydVarM16235p.build();
                s9l0Var.f206978c = 1;
                objM87522d = w9l0Var.m87522d(checkEligibilityRequest, s9l0Var);
                yuk yukVar = yuk.f276404a;
                if (objM87522d == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM87522d);
            }
            CheckEligibilityResponse checkEligibilityResponse = (CheckEligibilityResponse) objM87522d;
            boolean zM16238p = checkEligibilityResponse.m16238p();
            Integer numM74180J = qyg1.m74180J(checkEligibilityResponse.m16237o());
            if (!checkEligibilityResponse.m16241s()) {
                numM74180J = null;
            }
            Long lM74181K = qyg1.m74181K(checkEligibilityResponse.m16239q().m1969s());
            if (!checkEligibilityResponse.m16242t()) {
                lM74181K = null;
            }
            Boolean boolM74178H = checkEligibilityResponse.m16240r() ? qyg1.m74178H(checkEligibilityResponse.m16236n()) : null;
            return new qg91(numM74180J, lM74181K, zM16238p, boolM74178H != null ? boolM74178H.booleanValue() : false);
        } catch (Throwable th) {
            return new c6x0(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m84971b(ibk ibkVar) {
        t9l0 t9l0Var;
        pze1 pze1VarM71738q6;
        if (ibkVar instanceof t9l0) {
            t9l0Var = (t9l0) ibkVar;
            int i = t9l0Var.f218328c;
            if ((i & Integer.MIN_VALUE) != 0) {
                t9l0Var.f218328c = i - Integer.MIN_VALUE;
            } else {
                t9l0Var = new t9l0(this, ibkVar);
            }
        } else {
            t9l0Var = new t9l0(this, ibkVar);
        }
        Object objM87521c = t9l0Var.f218326a;
        int i2 = t9l0Var.f218328c;
        boolean z = true;
        try {
            if (i2 == 0) {
                bga.m29073P(objM87521c);
                w9l0 w9l0Var = this.f238978a;
                dc10 dc10VarM16245p = GetTrialRequest.m16245p();
                dc10VarM16245p.m35617m();
                GetTrialRequest getTrialRequest = (GetTrialRequest) dc10VarM16245p.build();
                t9l0Var.f218328c = 1;
                objM87521c = w9l0Var.m87521c(getTrialRequest, t9l0Var);
                yuk yukVar = yuk.f276404a;
                if (objM87521c == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM87521c);
            }
            GetTrialResponse getTrialResponse = (GetTrialResponse) objM87521c;
            if (getTrialResponse.m16249q()) {
                pze1VarM71738q6 = pze1.m71734n6(z050.m95040p6(System.currentTimeMillis()), yre.m94418a().f244195a).mo27575l(getTrialResponse.m16246n().m1969s(), dce.INSTANT_SECONDS);
            } else {
                pze1VarM71738q6 = null;
            }
            if (getTrialResponse.m16248p() != ec10.TRIAL_WITH_OFFLINE_ACTIVE) {
                z = false;
            }
            Integer numM74180J = qyg1.m74180J(getTrialResponse.m16247o());
            return new tg91(pze1VarM71738q6, z, numM74180J.intValue() > 0 ? numM74180J : null);
        } catch (Throwable th) {
            return new c6x0(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Serializable m84972c(ibk ibkVar) {
        u9l0 u9l0Var;
        if (ibkVar instanceof u9l0) {
            u9l0Var = (u9l0) ibkVar;
            int i = u9l0Var.f228222c;
            if ((i & Integer.MIN_VALUE) != 0) {
                u9l0Var.f228222c = i - Integer.MIN_VALUE;
            } else {
                u9l0Var = new u9l0(this, ibkVar);
            }
        } else {
            u9l0Var = new u9l0(this, ibkVar);
        }
        Object objM87519a = u9l0Var.f228220a;
        int i2 = u9l0Var.f228222c;
        boolean z = true;
        try {
            if (i2 == 0) {
                bga.m29073P(objM87519a);
                w9l0 w9l0Var = this.f238978a;
                rr41 rr41VarM16252p = StartTrialRequest.m16252p();
                rr41VarM16252p.m76277m();
                StartTrialRequest startTrialRequest = (StartTrialRequest) rr41VarM16252p.build();
                u9l0Var.f228222c = 1;
                objM87519a = w9l0Var.m87519a(startTrialRequest, u9l0Var);
                yuk yukVar = yuk.f276404a;
                if (objM87519a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM87519a);
            }
            if (((StartTrialResponse) objM87519a).m16253n() != yr41.STARTED) {
                z = false;
            }
            return qyg1.m74178H(z);
        } catch (Throwable th) {
            return new c6x0(th);
        }
    }
}
