package p204p;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class qmc extends enc {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f190191f = AtomicIntegerFieldUpdater.newUpdater(qmc.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* JADX INFO: renamed from: d */
    public final nzu0 f190192d;

    /* JADX INFO: renamed from: e */
    public final boolean f190193e;

    public /* synthetic */ qmc(nzu0 nzu0Var, boolean z) {
        this(nzu0Var, z, dau.f47107a, -3, 1);
    }

    @Override // p204p.enc, p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        int i = this.f61129b;
        yuk yukVar = yuk.f276404a;
        if (i == -3) {
            boolean z = this.f190193e;
            if (z && f190191f.getAndSet(this, 1) == 1) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
            }
            Object objM76630o = rxf1.m76630o(nizVar, this.f190192d, z, fbkVar);
            if (objM76630o == yukVar) {
                return objM76630o;
            }
        } else {
            Object objCollect = super.collect(nizVar, fbkVar);
            if (objCollect == yukVar) {
                return objCollect;
            }
        }
        return w2a1.f247311a;
    }

    @Override // p204p.enc
    /* JADX INFO: renamed from: f */
    public final String mo39485f() {
        return "channel=" + this.f190192d;
    }

    @Override // p204p.enc
    /* JADX INFO: renamed from: g */
    public final Object mo39486g(sir0 sir0Var, fbk fbkVar) {
        Object objM76630o = rxf1.m76630o(new gsz0(sir0Var), this.f190192d, this.f190193e, fbkVar);
        return objM76630o == yuk.f276404a ? objM76630o : w2a1.f247311a;
    }

    @Override // p204p.enc
    /* JADX INFO: renamed from: h */
    public final enc mo39487h(juk jukVar, int i, int i2) {
        return new qmc(this.f190192d, this.f190193e, jukVar, i, i2);
    }

    @Override // p204p.enc
    /* JADX INFO: renamed from: i */
    public final fiz mo39488i() {
        return new qmc(this.f190192d, this.f190193e);
    }

    @Override // p204p.enc
    /* JADX INFO: renamed from: j */
    public final nzu0 mo39489j(xuk xukVar) {
        if (this.f190193e && f190191f.getAndSet(this, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
        return this.f61129b == -3 ? this.f190192d : super.mo39489j(xukVar);
    }

    public qmc(nzu0 nzu0Var, boolean z, juk jukVar, int i, int i2) {
        super(jukVar, i, i2);
        this.f190192d = nzu0Var;
        this.f190193e = z;
    }
}
