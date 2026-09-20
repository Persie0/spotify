package p204p;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class dnz extends AbstractC2522w6 implements ot51 {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f50899f = AtomicLongFieldUpdater.newUpdater(dnz.class, "requested$volatile");

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f50900g = AtomicReferenceFieldUpdater.newUpdater(dnz.class, Object.class, "producer$volatile");
    private volatile boolean cancellationRequested;

    /* JADX INFO: renamed from: d */
    public final fiz f50901d;

    /* JADX INFO: renamed from: e */
    public final ft51 f50902e;
    private volatile /* synthetic */ Object producer$volatile;
    private volatile /* synthetic */ long requested$volatile;

    public dnz(fiz fizVar, ft51 ft51Var, juk jukVar) {
        super(jukVar, false, true);
        this.f50901d = fizVar;
        this.f50902e = ft51Var;
        this.producer$volatile = new bnz(0, this.f248218c, this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX INFO: renamed from: z0 */
    public static final Object m36501z0(dnz dnzVar, fbk fbkVar) {
        cnz cnzVar;
        dnzVar.getClass();
        w2a1 w2a1Var = w2a1.f247311a;
        if (fbkVar instanceof cnz) {
            cnzVar = (cnz) fbkVar;
            int i = cnzVar.f40136c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cnzVar.f40136c = i - Integer.MIN_VALUE;
            } else {
                cnzVar = new cnz(dnzVar, fbkVar);
            }
        } else {
            cnzVar = new cnz(dnzVar, fbkVar);
        }
        Object obj = cnzVar.f40134a;
        yuk yukVar = yuk.f276404a;
        int i2 = cnzVar.f40136c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                cnzVar.f40136c = 1;
                Object objCollect = dnzVar.f50901d.collect(new ncp(dnzVar, 22), cnzVar);
                if (objCollect != yukVar) {
                    objCollect = w2a1Var;
                }
                if (objCollect == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
            try {
                dnzVar.f50902e.onComplete();
            } catch (Throwable th) {
                srz.m79154l(th, dnzVar.f248218c);
            }
        } catch (Throwable th2) {
            if (!dnzVar.cancellationRequested || dnzVar.isActive() || th2 != dnzVar.mo26603h()) {
                try {
                    dnzVar.f50902e.onError(th2);
                } catch (Throwable th3) {
                    y85.m93061f(th2, th3);
                    srz.m79154l(th2, dnzVar.f248218c);
                }
            }
        }
        return w2a1Var;
    }

    @Override // p204p.ot51
    public final /* synthetic */ void cancel() {
        this.cancellationRequested = true;
        mo26601e(null);
    }

    @Override // p204p.ot51
    public final void request(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        long j3;
        fbk fbkVar;
        if (j <= 0) {
            return;
        }
        do {
            atomicLongFieldUpdater = f50899f;
            j2 = atomicLongFieldUpdater.get(this);
            j3 = j2 + j;
            if (j3 <= 0) {
                j3 = Long.MAX_VALUE;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, j3));
        if (j2 <= 0) {
            do {
                fbkVar = (fbk) f50900g.getAndSet(this, null);
            } while (fbkVar == null);
            fbkVar.resumeWith(w2a1.f247311a);
        }
    }
}
