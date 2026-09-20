package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.idj.p082v1.GetPermissionRequest;
import com.spotify.idj.p082v1.GetPermissionResponse;
import com.spotify.idj.p082v1.MicPermissionPageRequest;
import com.spotify.idj.p082v1.MicPermissionPageResponse;
import com.spotify.idj.p082v1.SetPermissionRequest;
import com.spotify.idj.p082v1.SetPermissionResponse;
import java.io.Serializable;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class psc1 {

    /* JADX INFO: renamed from: a */
    public final lsc1 f180815a;

    public psc1(lsc1 lsc1Var) {
        this.f180815a = lsc1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70772a(unn0 unn0Var, hdf0 hdf0Var, ibk ibkVar) {
        msc1 msc1Var;
        pdf0 pdf0Var;
        x8j x8jVar;
        if (ibkVar instanceof msc1) {
            msc1Var = (msc1) ibkVar;
            int i = msc1Var.f146754c;
            if ((i & Integer.MIN_VALUE) != 0) {
                msc1Var.f146754c = i - Integer.MIN_VALUE;
            } else {
                msc1Var = new msc1(this, ibkVar);
            }
        } else {
            msc1Var = new msc1(this, ibkVar);
        }
        Object objM59829b = msc1Var.f146752a;
        int i2 = msc1Var.f146754c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM59829b);
                lsc1 lsc1Var = this.f180815a;
                kdf0 kdf0VarM11990q = MicPermissionPageRequest.m11990q();
                kdf0VarM11990q.m56173r();
                int iOrdinal = unn0Var.ordinal();
                if (iOrdinal == 0) {
                    throw new IllegalStateException("GRANTED permission state should not be passed to toMicPermissionState()");
                }
                if (iOrdinal == 1) {
                    pdf0Var = pdf0.PERMISSION_NEVER_SEEN;
                } else if (iOrdinal == 2) {
                    pdf0Var = pdf0.PERMISSION_TEMPORARILY_DENIED;
                } else {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pdf0Var = pdf0.PERMISSION_PERMANENTLY_DENIED;
                }
                kdf0VarM11990q.m56172q(pdf0Var);
                int iOrdinal2 = hdf0Var.ordinal();
                if (iOrdinal2 == 0) {
                    x8jVar = x8j.CONSUMER_UNSPECIFIED;
                } else if (iOrdinal2 == 1) {
                    x8jVar = x8j.CONSUMER_DJ;
                } else if (iOrdinal2 == 2) {
                    x8jVar = x8j.CONSUMER_AGENT;
                } else {
                    if (iOrdinal2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    x8jVar = x8j.CONSUMER_AUDIO_RECOGNITION;
                }
                kdf0VarM11990q.m56171m(x8jVar);
                MicPermissionPageRequest micPermissionPageRequest = (MicPermissionPageRequest) kdf0VarM11990q.build();
                msc1Var.f146754c = 1;
                objM59829b = lsc1Var.m59829b(micPermissionPageRequest, msc1Var);
                yuk yukVar = yuk.f276404a;
                if (objM59829b == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM59829b);
            }
            return (MicPermissionPageResponse) objM59829b;
        } catch (Exception e) {
            Logger.m3966b("Failed to get mic permission page from idj-state-manager", e);
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Serializable m70773b(ibk ibkVar) {
        nsc1 nsc1Var;
        if (ibkVar instanceof nsc1) {
            nsc1Var = (nsc1) ibkVar;
            int i = nsc1Var.f157749c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nsc1Var.f157749c = i - Integer.MIN_VALUE;
            } else {
                nsc1Var = new nsc1(this, ibkVar);
            }
        } else {
            nsc1Var = new nsc1(this, ibkVar);
        }
        Object objM59828a = nsc1Var.f157747a;
        int i2 = nsc1Var.f157749c;
        if (i2 == 0) {
            bga.m29073P(objM59828a);
            ba10 ba10VarM11981o = GetPermissionRequest.m11981o();
            ba10VarM11981o.m28555m();
            GetPermissionRequest getPermissionRequest = (GetPermissionRequest) ba10VarM11981o.build();
            wj50.m88279p(getPermissionRequest);
            nsc1Var.f157749c = 1;
            objM59828a = this.f180815a.m59828a(getPermissionRequest, nsc1Var);
            yuk yukVar = yuk.f276404a;
            if (objM59828a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM59828a);
        }
        GetPermissionResponse getPermissionResponse = (GetPermissionResponse) objM59828a;
        if (getPermissionResponse.m11983o() == onn0.SUCCESS) {
            return Boolean.valueOf(getPermissionResponse.m11982n());
        }
        Logger.m3966b("Failed to get voice data permission from idj-state-manager: " + getPermissionResponse.m11983o(), new Object[0]);
        return new c6x0(new Exception("Failed to get voice data permission: " + getPermissionResponse.m11983o()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Serializable m70774c(boolean z, ibk ibkVar) {
        osc1 osc1Var;
        if (ibkVar instanceof osc1) {
            osc1Var = (osc1) ibkVar;
            int i = osc1Var.f168800d;
            if ((i & Integer.MIN_VALUE) != 0) {
                osc1Var.f168800d = i - Integer.MIN_VALUE;
            } else {
                osc1Var = new osc1(this, ibkVar);
            }
        } else {
            osc1Var = new osc1(this, ibkVar);
        }
        Object objM59830c = osc1Var.f168798b;
        int i2 = osc1Var.f168800d;
        if (i2 == 0) {
            bga.m29073P(objM59830c);
            s501 s501VarM11998p = SetPermissionRequest.m11998p();
            s501VarM11998p.m77214m();
            s501VarM11998p.m77215q(z);
            SetPermissionRequest setPermissionRequest = (SetPermissionRequest) s501VarM11998p.build();
            wj50.m88279p(setPermissionRequest);
            osc1Var.f168797a = z;
            osc1Var.f168800d = 1;
            objM59830c = this.f180815a.m59830c(setPermissionRequest, osc1Var);
            yuk yukVar = yuk.f276404a;
            if (objM59830c == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = osc1Var.f168797a;
            bga.m29073P(objM59830c);
        }
        SetPermissionResponse setPermissionResponse = (SetPermissionResponse) objM59830c;
        if (setPermissionResponse.m11999n() == onn0.SUCCESS) {
            return Boolean.valueOf(z);
        }
        Logger.m3966b("Failed to set voice data storage permission in idj-state-manager: " + setPermissionResponse.m11999n(), new Object[0]);
        return new c6x0(new Exception("Failed to set voice data permission: " + setPermissionResponse.m11999n()));
    }
}
