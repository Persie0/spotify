package p204p;

import android.os.Bundle;
import android.os.Process;
import com.google.android.play.core.integrity.StandardIntegrityException;

/* JADX INFO: loaded from: classes.dex */
public final class b1f1 extends v0f1 implements x2f1 {

    /* JADX INFO: renamed from: l */
    public final ev61 f22310l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ d1f1 f22311m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f22312n;

    /* JADX INFO: renamed from: o */
    public final c3f1 f22313o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ d1f1 f22314p;

    public b1f1(d1f1 d1f1Var, ev61 ev61Var, byte b) {
        this.f22311m = d1f1Var;
        attachInterface(this, "com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
        this.f22310l = ev61Var;
    }

    @Override // p204p.x2f1
    /* JADX INFO: renamed from: H */
    public void mo27904H(Bundle bundle) {
        switch (this.f22312n) {
            case 0:
                m27905b2(bundle);
                this.f22313o.m31382b("onRequestExpressIntegrityToken", new Object[0]);
                this.f22314p.f44258d.getClass();
                int i = bundle.getInt("error");
                StandardIntegrityException standardIntegrityException = i != 0 ? new StandardIntegrityException(i, null) : null;
                ev61 ev61Var = this.f22310l;
                if (standardIntegrityException != null) {
                    ev61Var.m40098c(standardIntegrityException);
                    return;
                }
                bundle.getLong("request.token.sid");
                edb.m38560i(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat("IntegrityDialogWrapper");
                String string = bundle.getString("token");
                if (string == null) {
                    throw new NullPointerException("Null token");
                }
                ev61Var.m40099d(new f1f1(string));
                return;
            default:
                m27905b2(bundle);
                return;
        }
    }

    /* JADX INFO: renamed from: b2 */
    public final void m27905b2(Bundle bundle) {
        this.f22311m.f44259e.m40479c(this.f22310l);
    }

    /* JADX INFO: renamed from: c2 */
    public final void m27906c2(Bundle bundle) {
        this.f22311m.f44259e.m40479c(this.f22310l);
    }

    @Override // p204p.x2f1
    /* JADX INFO: renamed from: s1 */
    public void mo27907s1(Bundle bundle) {
        switch (this.f22312n) {
            case 1:
                m27906c2(bundle);
                this.f22313o.m31382b("onWarmUpExpressIntegrityToken", new Object[0]);
                this.f22314p.f44258d.getClass();
                int i = bundle.getInt("error");
                StandardIntegrityException standardIntegrityException = i != 0 ? new StandardIntegrityException(i, null) : null;
                ev61 ev61Var = this.f22310l;
                if (standardIntegrityException == null) {
                    ev61Var.m40099d(Long.valueOf(bundle.getLong("warm.up.sid")));
                } else {
                    ev61Var.m40098c(standardIntegrityException);
                }
                break;
            default:
                m27906c2(bundle);
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b1f1(d1f1 d1f1Var, ev61 ev61Var, int i) {
        this(d1f1Var, ev61Var, (byte) 0);
        this.f22312n = i;
        switch (i) {
            case 1:
                this.f22314p = d1f1Var;
                this(d1f1Var, ev61Var, (byte) 0);
                this.f22313o = new c3f1("OnWarmUpIntegrityTokenCallback");
                break;
            default:
                this.f22314p = d1f1Var;
                this.f22313o = new c3f1("OnRequestIntegrityTokenCallback");
                break;
        }
    }
}
