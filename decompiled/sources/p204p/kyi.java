package p204p;

import io.ably.lib.types.ErrorInfo;
import java.util.HashMap;

/* JADX INFO: loaded from: classes16.dex */
public final class kyi implements hyi {

    /* JADX INFO: renamed from: a */
    public final ky30 f127864a;

    /* JADX INFO: renamed from: b */
    public final tyi f127865b;

    /* JADX INFO: renamed from: c */
    public yzi f127866c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vyi f127867d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f127868e;

    public kyi(vyi vyiVar, ky30 ky30Var, tyi tyiVar, int i) {
        this.f127868e = i;
        this.f127867d = vyiVar;
        this.f127864a = ky30Var;
        this.f127865b = tyiVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m57717a() {
        yzi yziVar = this.f127866c;
        if (yziVar != null) {
            wzi wziVar = yziVar.f277831b;
            wzi wziVar2 = yziVar.f277830a;
            vyi vyiVar = this.f127867d;
            if (wziVar != wziVar2) {
                txi txiVar = vyiVar.f246126d;
                txiVar.getClass();
                txiVar.f224707c = wziVar;
                txiVar.m28214b(new Object[]{yziVar}, wziVar.f256616a);
            }
            HashMap map = vyiVar.f246135m;
            tyi tyiVar = this.f127865b;
            ((syi) map.get(tyiVar.f224976a)).mo63203a(tyiVar, this.f127866c);
            if (vyiVar.f246136n.f215257e) {
                vyiVar.m86787e();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m57718b() {
        m57717a();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021 A[Catch: all -> 0x001e, TRY_ENTER, TryCatch #0 {, blocks: (B:6:0x0010, B:8:0x0014, B:13:0x0021, B:15:0x0029, B:18:0x003f, B:20:0x0045, B:23:0x004c, B:25:0x0050, B:26:0x006b, B:28:0x0071, B:30:0x0075, B:32:0x0079, B:35:0x0083, B:37:0x0091, B:38:0x0093, B:34:0x007d, B:22:0x0049), top: B:44:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0029 A[Catch: all -> 0x001e, TRY_LEAVE, TryCatch #0 {, blocks: (B:6:0x0010, B:8:0x0014, B:13:0x0021, B:15:0x0029, B:18:0x003f, B:20:0x0045, B:23:0x004c, B:25:0x0050, B:26:0x006b, B:28:0x0071, B:30:0x0075, B:32:0x0079, B:35:0x0083, B:37:0x0091, B:38:0x0093, B:34:0x007d, B:22:0x0049), top: B:44:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x003f A[Catch: all -> 0x001e, TRY_ENTER, TryCatch #0 {, blocks: (B:6:0x0010, B:8:0x0014, B:13:0x0021, B:15:0x0029, B:18:0x003f, B:20:0x0045, B:23:0x004c, B:25:0x0050, B:26:0x006b, B:28:0x0071, B:30:0x0075, B:32:0x0079, B:35:0x0083, B:37:0x0091, B:38:0x0093, B:34:0x007d, B:22:0x0049), top: B:44:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0049 A[Catch: all -> 0x001e, TryCatch #0 {, blocks: (B:6:0x0010, B:8:0x0014, B:13:0x0021, B:15:0x0029, B:18:0x003f, B:20:0x0045, B:23:0x004c, B:25:0x0050, B:26:0x006b, B:28:0x0071, B:30:0x0075, B:32:0x0079, B:35:0x0083, B:37:0x0091, B:38:0x0093, B:34:0x007d, B:22:0x0049), top: B:44:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0050 A[Catch: all -> 0x001e, TryCatch #0 {, blocks: (B:6:0x0010, B:8:0x0014, B:13:0x0021, B:15:0x0029, B:18:0x003f, B:20:0x0045, B:23:0x004c, B:25:0x0050, B:26:0x006b, B:28:0x0071, B:30:0x0075, B:32:0x0079, B:35:0x0083, B:37:0x0091, B:38:0x0093, B:34:0x007d, B:22:0x0049), top: B:44:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x007d A[Catch: all -> 0x001e, TryCatch #0 {, blocks: (B:6:0x0010, B:8:0x0014, B:13:0x0021, B:15:0x0029, B:18:0x003f, B:20:0x0045, B:23:0x004c, B:25:0x0050, B:26:0x006b, B:28:0x0071, B:30:0x0075, B:32:0x0079, B:35:0x0083, B:37:0x0091, B:38:0x0093, B:34:0x007d, B:22:0x0049), top: B:44:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0091 A[Catch: all -> 0x001e, TryCatch #0 {, blocks: (B:6:0x0010, B:8:0x0014, B:13:0x0021, B:15:0x0029, B:18:0x003f, B:20:0x0045, B:23:0x004c, B:25:0x0050, B:26:0x006b, B:28:0x0071, B:30:0x0075, B:32:0x0079, B:35:0x0083, B:37:0x0091, B:38:0x0093, B:34:0x007d, B:22:0x0049), top: B:44:0x0010 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:15:0x0029, please report this as an issue */
    /* JADX INFO: renamed from: c */
    public final void m57719c() {
        yzi yziVar;
        tyi tyiVarMo60260d;
        wzi wziVar;
        wzi wziVar2;
        wzi wziVar3;
        syi syiVar;
        ErrorInfo errorInfo;
        vyi vyiVar = this.f127867d;
        ky30 ky30Var = this.f127864a;
        tyi tyiVar = this.f127865b;
        ErrorInfo errorInfo2 = vyi.f246121y;
        synchronized (vyiVar) {
            yziVar = null;
            if (ky30Var == null) {
                tyiVarMo60260d = vyiVar.f246136n.mo60260d(tyiVar);
                if (tyiVarMo60260d == null) {
                    tx8.m81897l("p.vyi", "setState(): not transitioning; not a valid transition " + tyiVar.f224976a);
                } else {
                    wziVar = tyiVar.f224976a;
                    if (wziVar != wzi.connected) {
                        vyiVar.f246146x = 0;
                    } else {
                        vyiVar.f246146x = 0;
                    }
                    wziVar2 = wzi.disconnected;
                    if (wziVar == wziVar2) {
                        syi syiVar2 = (syi) vyiVar.f246135m.get(wziVar2);
                        long j = vyiVar.f246124b.f7157a.disconnectedRetryTimeout;
                        int i = vyiVar.f246146x + 1;
                        vyiVar.f246146x = i;
                        syiVar2.f215258f = tx8.m81893h(i, j);
                    }
                    wziVar3 = tyiVar.f224976a;
                    if (wziVar3 != wzi.closing) {
                        txi txiVar = vyiVar.f246126d;
                        txiVar.f224709e = null;
                        txiVar.f224708d = null;
                    } else {
                        txi txiVar2 = vyiVar.f246126d;
                        txiVar2.f224709e = null;
                        txiVar2.f224708d = null;
                    }
                    wzi wziVar4 = tyiVarMo60260d.f224976a;
                    syiVar = (syi) vyiVar.f246135m.get(wziVar4);
                    errorInfo = tyiVarMo60260d.f224977b;
                    if (errorInfo == null) {
                        errorInfo = syiVar.f215254b;
                    }
                    tx8.m81897l("p.vyi", "setState(): setting " + syiVar.f215253a + "; reason " + errorInfo);
                    yziVar = new yzi(vyiVar.f246136n.f215253a, wziVar4, errorInfo);
                    vyiVar.f246136n = syiVar;
                    vyiVar.f246137o = errorInfo;
                }
            } else if (ky30Var != vyiVar.f246139q) {
                tx8.m81897l("p.vyi", "setState: action received for superseded transport; discarding");
            } else {
                tyiVarMo60260d = vyiVar.f246136n.mo60260d(tyiVar);
                if (tyiVarMo60260d == null) {
                    tx8.m81897l("p.vyi", "setState(): not transitioning; not a valid transition " + tyiVar.f224976a);
                } else {
                    wziVar = tyiVar.f224976a;
                    if (wziVar != wzi.connected || wziVar == wzi.suspended) {
                        vyiVar.f246146x = 0;
                    }
                    wziVar2 = wzi.disconnected;
                    if (wziVar == wziVar2) {
                        syi syiVar3 = (syi) vyiVar.f246135m.get(wziVar2);
                        long j2 = vyiVar.f246124b.f7157a.disconnectedRetryTimeout;
                        int i2 = vyiVar.f246146x + 1;
                        vyiVar.f246146x = i2;
                        syiVar3.f215258f = tx8.m81893h(i2, j2);
                    }
                    wziVar3 = tyiVar.f224976a;
                    if (wziVar3 != wzi.closing || wziVar3 == wzi.closed || wziVar3 == wzi.suspended || wziVar3 == wzi.failed) {
                        txi txiVar3 = vyiVar.f246126d;
                        txiVar3.f224709e = null;
                        txiVar3.f224708d = null;
                    }
                    wzi wziVar5 = tyiVarMo60260d.f224976a;
                    syiVar = (syi) vyiVar.f246135m.get(wziVar5);
                    errorInfo = tyiVarMo60260d.f224977b;
                    if (errorInfo == null) {
                        errorInfo = syiVar.f215254b;
                    }
                    tx8.m81897l("p.vyi", "setState(): setting " + syiVar.f215253a + "; reason " + errorInfo);
                    yziVar = new yzi(vyiVar.f246136n.f215253a, wziVar5, errorInfo);
                    vyiVar.f246136n = syiVar;
                    vyiVar.f246137o = errorInfo;
                }
            }
        }
        this.f127866c = yziVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        switch (this.f127868e) {
            case 0:
                m57719c();
                m57717a();
                break;
            default:
                m57718b();
                break;
        }
    }
}
