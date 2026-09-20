package p204p;

import android.os.SystemClock;
import com.spotify.base.java.logging.Logger;
import com.spotify.read_reporting_esperanto.proto.ReadInterval;
import com.spotify.read_reporting_esperanto.proto.ReadStartRequest;
import com.spotify.read_reporting_esperanto.proto.ReadStartResponse;
import com.spotify.read_reporting_esperanto.proto.ReadUpdateRequest;
import java.util.concurrent.CancellationException;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes10.dex */
public final class yqu0 implements oqu0, onp {

    /* JADX INFO: renamed from: h */
    public static final long f275299h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ int f275300i = 0;

    /* JADX INFO: renamed from: a */
    public final sr6 f275301a;

    /* JADX INFO: renamed from: b */
    public final gb80 f275302b;

    /* JADX INFO: renamed from: c */
    public final xre f275303c;

    /* JADX INFO: renamed from: d */
    public final c9k f275304d;

    /* JADX INFO: renamed from: e */
    public bqa f275305e;

    /* JADX INFO: renamed from: f */
    public boolean f275306f;

    /* JADX INFO: renamed from: g */
    public gva f275307g;

    static {
        hvi0 hvi0Var = cks.f39079b;
        f275299h = jwg1.m54449D(3, ils.SECONDS);
    }

    public yqu0(sr6 sr6Var, gb80 gb80Var, xre xreVar, luk lukVar) {
        this.f275301a = sr6Var;
        this.f275302b = gb80Var;
        this.f275303c = xreVar;
        this.f275304d = AbstractC0000a.m16o(lukVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: a */
    public static final Object m94394a(yqu0 yqu0Var, String str, int i, int i2, boolean z, long j, long j2, ibk ibkVar) {
        xqu0 xqu0Var;
        yqu0Var.getClass();
        if (ibkVar instanceof xqu0) {
            xqu0Var = (xqu0) ibkVar;
            int i3 = xqu0Var.f265120c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                xqu0Var.f265120c = i3 - Integer.MIN_VALUE;
            } else {
                xqu0Var = new xqu0(yqu0Var, ibkVar);
            }
        } else {
            xqu0Var = new xqu0(yqu0Var, ibkVar);
        }
        Object objM94396b = xqu0Var.f265118a;
        int i4 = xqu0Var.f265120c;
        if (i4 == 0) {
            bga.m29073P(objM94396b);
            bru0 bru0VarM20194t = ReadStartRequest.m20194t();
            bru0VarM20194t.m30328m(str);
            hqu0 hqu0VarM20187p = ReadInterval.m20187p();
            hqu0VarM20187p.m48312q(i);
            hqu0VarM20187p.m48311m(i2);
            bru0VarM20194t.m30329q(hqu0VarM20187p);
            bru0VarM20194t.m30333u(j);
            bru0VarM20194t.m30331s(j2);
            bru0VarM20194t.m30332t();
            bru0VarM20194t.m30330r(z);
            gh00 zmyVar = new zmy(yqu0Var, (ReadStartRequest) bru0VarM20194t.build(), null, 19);
            xqu0Var.f265120c = 1;
            objM94396b = yqu0Var.m94396b(zmyVar, xqu0Var);
            Object obj = yuk.f276404a;
            if (objM94396b == obj) {
                return obj;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM94396b);
        }
        ReadStartResponse readStartResponse = (ReadStartResponse) objM94396b;
        if (readStartResponse == null || readStartResponse.m20197o() != b151.SUCCESS) {
            Logger.m3973i("[ReadReporting] readStart failed: %s", readStartResponse != null ? readStartResponse.m20197o() : "timeout");
        } else {
            yqu0Var.f275307g = readStartResponse.m20196n();
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: d */
    public static Object m94395d(yqu0 yqu0Var, hqu0 hqu0Var, long j, long j2, Boolean bool, Boolean bool2, mb61 mb61Var, int i) {
        fbk fbkVar = null;
        if ((i & 1) != 0) {
            hqu0Var = null;
        }
        if ((i & 8) != 0) {
            bool = null;
        }
        if ((i & 16) != 0) {
            bool2 = null;
        }
        gva gvaVar = yqu0Var.f275307g;
        if (gvaVar != null) {
            cru0 cru0VarM20204t = ReadUpdateRequest.m20204t();
            cru0VarM20204t.m33751t(gvaVar);
            cru0VarM20204t.m33752u(j);
            cru0VarM20204t.m33750s(j2);
            if (hqu0Var != null) {
                cru0VarM20204t.m33747m(hqu0Var);
            }
            if (bool != null) {
                cru0VarM20204t.m33748q(bool.booleanValue());
            }
            if (bool2 != null) {
                cru0VarM20204t.m33749r(bool2.booleanValue());
            }
            Object objM94396b = yqu0Var.m94396b(new zmy(yqu0Var, (ReadUpdateRequest) cru0VarM20204t.build(), fbkVar, 20), mb61Var);
            if (objM94396b == yuk.f276404a) {
                return objM94396b;
            }
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m94396b(gh00 gh00Var, ibk ibkVar) {
        qqu0 qqu0Var;
        if (ibkVar instanceof qqu0) {
            qqu0Var = (qqu0) ibkVar;
            int i = qqu0Var.f191656c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qqu0Var.f191656c = i - Integer.MIN_VALUE;
            } else {
                qqu0Var = new qqu0(this, ibkVar);
            }
        } else {
            qqu0Var = new qqu0(this, ibkVar);
        }
        Object obj = qqu0Var.f191654a;
        int i2 = qqu0Var.f191656c;
        fbk fbkVar = null;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
                return obj;
            }
            bga.m29073P(obj);
            long j = f275299h;
            ry2 ry2Var = new ry2(gh00Var, fbkVar, 5);
            qqu0Var.f191656c = 1;
            Object objM76981v = s1h1.m76981v(j, ry2Var, qqu0Var);
            yuk yukVar = yuk.f276404a;
            return objM76981v == yukVar ? yukVar : objM76981v;
        } catch (CancellationException e) {
            qlg1.m73220y(qqu0Var.getContext());
            Logger.m3973i("[ReadReporting] transport error: %s", e.getMessage());
            return null;
        } catch (Exception e2) {
            Logger.m3973i("[ReadReporting] rpc failed: %s", e2.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m94397c(vh00 vh00Var) {
        wy3 wy3Var = (wy3) this.f275303c;
        wy3Var.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        wy3Var.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        bqa bqaVar = this.f275305e;
        unc uncVar = bqaVar != null ? new unc(bqaVar.mo30231j(new rqu0(vh00Var, jCurrentTimeMillis, jElapsedRealtime, null))) : null;
        if (uncVar == null || (uncVar.f232139a instanceof tnc)) {
            Logger.m3973i("[ReadReporting] operation dropped — no active session queue", new Object[0]);
        }
    }

    @Override // p204p.onp
    public final void onStart(hc80 hc80Var) {
        m94397c(new vqu0(this, null, 0));
    }

    @Override // p204p.onp
    public final void onStop(hc80 hc80Var) {
        m94397c(new vqu0(this, null, 1));
    }
}
