package p204p;

import android.net.Uri;
import android.os.Bundle;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes8.dex */
public final class t3y implements h40 {

    /* JADX INFO: renamed from: a */
    public final m500 f216857a;

    /* JADX INFO: renamed from: b */
    public final q0f0 f216858b;

    /* JADX INFO: renamed from: c */
    public final iv91 f216859c;

    /* JADX INFO: renamed from: d */
    public final ju91 f216860d;

    public t3y(m500 m500Var, q0f0 q0f0Var, iv91 iv91Var, ju91 ju91Var) {
        this.f216857a = m500Var;
        this.f216858b = q0f0Var;
        this.f216859c = iv91Var;
        this.f216860d = ju91Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: b */
    public static final Object m80022b(t3y t3yVar, Uri uri, d850 d850Var, ibk ibkVar) {
        s3y s3yVar;
        hv91 hv91Var;
        if (ibkVar instanceof s3y) {
            s3yVar = (s3y) ibkVar;
            int i = s3yVar.f205366d;
            if ((i & Integer.MIN_VALUE) != 0) {
                s3yVar.f205366d = i - Integer.MIN_VALUE;
            } else {
                s3yVar = new s3y(t3yVar, ibkVar);
            }
        } else {
            s3yVar = new s3y(t3yVar, ibkVar);
        }
        s3y s3yVar2 = s3yVar;
        Object objM71813b = s3yVar2.f205364b;
        int i2 = s3yVar2.f205366d;
        if (i2 == 0) {
            bga.m29073P(objM71813b);
            ju91 ju91Var = t3yVar.f216860d;
            AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
            ju91Var.m54333a(xgg1.m90662N1("INAPPMESSAGE_EXTERNAL_WEB", "inappmessage/external-web", 812, "inappmessage"), uri.toString(), d850Var);
            hv91 hv91VarM51740c = t3yVar.f216859c.m51740c(uri, d850Var);
            q0f0 q0f0Var = t3yVar.f216858b;
            String string = hv91VarM51740c.f95635a.toString();
            s3yVar2.f205363a = hv91VarM51740c;
            s3yVar2.f205366d = 1;
            objM71813b = q0f0Var.m71813b(string, d850Var, null, null, s3yVar2);
            yuk yukVar = yuk.f276404a;
            if (objM71813b == yukVar) {
                return yukVar;
            }
            hv91Var = hv91VarM51740c;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hv91Var = s3yVar2.f205363a;
            bga.m29073P(objM71813b);
        }
        if (((Boolean) objM71813b).booleanValue()) {
            hv91Var.m48760a();
        }
        return w2a1.f247311a;
    }

    @Override // p204p.h40
    /* JADX INFO: renamed from: a */
    public final void mo28852a(String str, String str2, Bundle bundle, h7l0 h7l0Var) {
        h7l0Var.invoke(Boolean.FALSE);
        Serializable serializable = bundle.getSerializable("UBI_INTERACTION_LOGGING_RESULT");
        fbk fbkVar = null;
        d850 d850Var = serializable instanceof d850 ? (d850) serializable : null;
        Uri uri = Uri.parse(str2);
        boolean zM70136a = pja1.m70136a(uri);
        m500 m500Var = this.f216857a;
        if (zM70136a) {
            x0h1.m89578u(n5h1.m63737m(m500Var), null, 0, new m5u(this, uri, d850Var, fbkVar, 23), 3);
        } else {
            x0h1.m89578u(n5h1.m63737m(m500Var), null, 0, new m5u(this, str2, d850Var, fbkVar, 24), 3);
        }
    }
}
