package p204p;

import io.ably.lib.types.AblyException;
import io.ably.lib.types.ErrorInfo;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
public abstract class syi {

    /* JADX INFO: renamed from: a */
    public final wzi f215253a;

    /* JADX INFO: renamed from: b */
    public final ErrorInfo f215254b;

    /* JADX INFO: renamed from: c */
    public final boolean f215255c;

    /* JADX INFO: renamed from: d */
    public final boolean f215256d;

    /* JADX INFO: renamed from: e */
    public final boolean f215257e;

    /* JADX INFO: renamed from: f */
    public long f215258f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ vyi f215259g;

    public syi(vyi vyiVar, wzi wziVar, boolean z, boolean z2, boolean z3, long j, ErrorInfo errorInfo) {
        this.f215259g = vyiVar;
        this.f215253a = wziVar;
        this.f215255c = z;
        this.f215256d = z2;
        this.f215257e = z3;
        this.f215258f = j;
        this.f215254b = errorInfo;
    }

    /* JADX INFO: renamed from: a */
    public void mo63203a(tyi tyiVar, yzi yziVar) {
        if (yziVar != null) {
            if (this.f215256d) {
                vyi vyiVar = this.f215259g;
                ErrorInfo errorInfo = vyi.f246121y;
                synchronized (vyiVar) {
                    while (vyiVar.f246128f.size() > 0) {
                        try {
                            try {
                                vyiVar.m86800t((qyi) vyiVar.f246128f.get(0));
                            } catch (AblyException e) {
                                tx8.m81890e("p.vyi", "sendQueuedMessages(): Unexpected error sending queued messages", e);
                            }
                            vyiVar.f246128f.remove(0);
                        } catch (Throwable th) {
                            vyiVar.f246128f.remove(0);
                            throw th;
                        }
                    }
                }
            } else if (!this.f215255c) {
                vyi vyiVar2 = this.f215259g;
                ErrorInfo errorInfo2 = tyiVar.f224977b;
                ErrorInfo errorInfo3 = vyi.f246121y;
                synchronized (vyiVar2) {
                    try {
                        Iterator it = vyiVar2.f246128f.iterator();
                        while (it.hasNext()) {
                            uuf uufVar = ((qyi) it.next()).f193907b;
                            if (uufVar != null) {
                                try {
                                    uufVar.onError(errorInfo2);
                                } catch (Throwable th2) {
                                    tx8.m81890e("p.vyi", "failQueuedMessages(): Unexpected error calling listener", th2);
                                }
                            }
                        }
                        vyiVar2.f246128f.clear();
                        pyi pyiVar = vyiVar2.f246129g;
                        synchronized (pyiVar) {
                            try {
                                Iterator it2 = ((ArrayList) pyiVar.f183410b).iterator();
                                while (it2.hasNext()) {
                                    uuf uufVar2 = ((qyi) it2.next()).f193907b;
                                    if (uufVar2 != null) {
                                        uufVar2.onError(errorInfo2);
                                    }
                                }
                                ((ArrayList) pyiVar.f183410b).clear();
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            }
            Iterator it3 = this.f215259g.f246125c.f188382a.values().iterator();
            while (it3.hasNext()) {
                mo60258b(tyiVar, (mmc) it3.next());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public tyi mo60259c() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public abstract tyi mo60260d(tyi tyiVar);

    /* JADX INFO: renamed from: b */
    public void mo60258b(tyi tyiVar, mmc mmcVar) {
    }
}
