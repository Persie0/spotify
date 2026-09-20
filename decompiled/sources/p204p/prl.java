package p204p;

import android.content.Context;
import androidx.credentials.exceptions.CreateCredentialException;
import com.spotify.login.credentialmanager.passkeys.PasskeysApiException;
import com.spotify.passkeys.p122v1.StartRegistrationResponse;
import io.reactivex.rxjava3.core.Observable;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class prl {

    /* JADX INFO: renamed from: a */
    public final wrl f180632a;

    /* JADX INFO: renamed from: b */
    public final qrl f180633b;

    /* JADX INFO: renamed from: c */
    public final e6a0 f180634c;

    /* JADX INFO: renamed from: d */
    public final c9k f180635d;

    /* JADX INFO: renamed from: e */
    public final hb11 f180636e = j0g1.m52092t(0, 0, 0, 7);

    /* JADX INFO: renamed from: f */
    public final hb11 f180637f = j0g1.m52092t(0, 0, 0, 7);

    /* JADX INFO: renamed from: g */
    public final hb11 f180638g = j0g1.m52092t(0, 0, 0, 7);

    public prl(Context context, wrl wrlVar, luk lukVar, qrl qrlVar, e6a0 e6a0Var) {
        this.f180632a = wrlVar;
        this.f180633b = qrlVar;
        this.f180634c = e6a0Var;
        this.f180635d = p3n0.m69075f(lukVar);
        qrlVar.f191881b.mo59114a(new qbq0(qrlVar.f191880a.f241825a, "google_play_services_status", Collections.singletonMap("value", String.valueOf(uj10.f230858e.m85679c(context, vj10.f241853a)))));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: a */
    public static final Object m70721a(prl prlVar, gal galVar, m7n0 m7n0Var, ibk ibkVar) {
        orl orlVar;
        Object objM37925s;
        qrl qrlVar = prlVar.f180633b;
        viy0 viy0Var = qrlVar.f191880a;
        ubq0 ubq0Var = qrlVar.f191881b;
        if (ibkVar instanceof orl) {
            orlVar = (orl) ibkVar;
            int i = orlVar.f168620c;
            if ((i & Integer.MIN_VALUE) != 0) {
                orlVar.f168620c = i - Integer.MIN_VALUE;
            } else {
                orlVar = new orl(prlVar, ibkVar);
            }
        } else {
            orlVar = new orl(prlVar, ibkVar);
        }
        Object obj = orlVar.f168618a;
        int i2 = orlVar.f168620c;
        if (i2 == 0) {
            bga.m29073P(obj);
            e6a0 e6a0Var = prlVar.f180634c;
            String str = galVar.f78067a;
            StartRegistrationResponse startRegistrationResponse = m7n0Var.f140808b;
            orlVar.f168620c = 1;
            objM37925s = e6a0Var.m37925s(str, startRegistrationResponse, orlVar);
            yuk yukVar = yuk.f276404a;
            if (objM37925s == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            objM37925s = ((s6x0) obj).f206218a;
        }
        Throwable thM77348a = s6x0.m77348a(objM37925s);
        int i3 = 4;
        Map map = null;
        if (thM77348a == null) {
            ubq0Var.mo59114a(new qbq0(viy0Var.f241825a, i3, map, "credential_manager_register_passkey_success"));
        } else {
            ubq0Var.mo59114a(new qbq0(viy0Var.f241825a, i3, map, "credential_manager_register_passkey_failure"));
            if (thM77348a instanceof PasskeysApiException) {
                qrlVar.m73626c(((PasskeysApiException) thM77348a).f5308a, "error_endpoint_passkeys-v1_passkey_register_finish");
            }
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: e */
    public static final void m70725e(prl prlVar, CreateCredentialException createCredentialException) {
        String string;
        CharSequence charSequence = createCredentialException.f822b;
        if (charSequence == null || (string = charSequence.toString()) == null) {
            string = "Unknown Error";
        }
        qrl qrlVar = prlVar.f180633b;
        qrlVar.f191881b.mo59114a(new qbq0(qrlVar.f191880a.f241825a, "credential_manager_save_credentials_failure", kkc0.m56695h0(new pqm0("errorMsg", string), new pqm0("errorType", createCredentialException.getF828c()))));
    }

    /* JADX INFO: renamed from: g */
    public static void m70726g(prl prlVar) {
        x0h1.m89578u(prlVar.f180635d, null, 0, new jil(prlVar, bsl.f30348a, null, 3), 3);
    }

    /* JADX INFO: renamed from: f */
    public final Observable m70727f() {
        return k0e1.m54988g(this.f180638g, dau.f47107a);
    }
}
