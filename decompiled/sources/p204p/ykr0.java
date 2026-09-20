package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Completable;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes5.dex */
public final class ykr0 implements fwz0 {

    /* JADX INFO: renamed from: a */
    public final i4t0 f273819a;

    /* JADX INFO: renamed from: b */
    public final i4t0 f273820b;

    public ykr0(i4t0 i4t0Var, i4t0 i4t0Var2) {
        this.f273819a = i4t0Var;
        this.f273820b = i4t0Var2;
    }

    /* JADX INFO: renamed from: a */
    public final vjz m94116a() {
        return new vjz(mvl0.m62953p(new rxp0(((vmz) this.f273819a.get()).m86026c("campfire-played-receipts", "1"), 11)), new zyj0(3, 5, null), 2);
    }

    /* JADX INFO: renamed from: b */
    public final vjz m94117b() {
        return new vjz(mvl0.m62953p(new rxp0(((vmz) this.f273819a.get()).m86026c("campfire-saved-receipts", "1"), 12)), new zyj0(3, 6, null), 2);
    }

    /* JADX INFO: renamed from: c */
    public final vjz m94118c() {
        return new vjz(mvl0.m62953p(new rxp0(((vmz) this.f273819a.get()).m86026c("campfire-seen-receipts", "1"), 13)), new zyj0(3, 7, null), 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m94119d(boolean z, ibk ibkVar) {
        vkr0 vkr0Var;
        if (ibkVar instanceof vkr0) {
            vkr0Var = (vkr0) ibkVar;
            int i = vkr0Var.f242281c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vkr0Var.f242281c = i - Integer.MIN_VALUE;
            } else {
                vkr0Var = new vkr0(this, ibkVar);
            }
        } else {
            vkr0Var = new vkr0(this, ibkVar);
        }
        Object obj = vkr0Var.f242279a;
        int i2 = vkr0Var.f242281c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                Completable completableM81762b = ((twx0) this.f273820b.get()).m81762b("campfire-played-receipts", z ? "1" : "0");
                vkr0Var.f242281c = 1;
                Object objM96565n = zn91.m96565n(completableM81762b, vkr0Var);
                yuk yukVar = yuk.f276404a;
                if (objM96565n == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.m3967c(e2, "Failed to update played receipts product state", new Object[0]);
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m94120e(boolean z, ibk ibkVar) {
        wkr0 wkr0Var;
        if (ibkVar instanceof wkr0) {
            wkr0Var = (wkr0) ibkVar;
            int i = wkr0Var.f252295c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wkr0Var.f252295c = i - Integer.MIN_VALUE;
            } else {
                wkr0Var = new wkr0(this, ibkVar);
            }
        } else {
            wkr0Var = new wkr0(this, ibkVar);
        }
        Object obj = wkr0Var.f252293a;
        int i2 = wkr0Var.f252295c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                Completable completableM81762b = ((twx0) this.f273820b.get()).m81762b("campfire-saved-receipts", z ? "1" : "0");
                wkr0Var.f252295c = 1;
                Object objM96565n = zn91.m96565n(completableM81762b, wkr0Var);
                yuk yukVar = yuk.f276404a;
                if (objM96565n == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.m3967c(e2, "Failed to update saved receipts product state", new Object[0]);
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m94121f(boolean z, ibk ibkVar) {
        xkr0 xkr0Var;
        if (ibkVar instanceof xkr0) {
            xkr0Var = (xkr0) ibkVar;
            int i = xkr0Var.f262929c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xkr0Var.f262929c = i - Integer.MIN_VALUE;
            } else {
                xkr0Var = new xkr0(this, ibkVar);
            }
        } else {
            xkr0Var = new xkr0(this, ibkVar);
        }
        Object obj = xkr0Var.f262927a;
        int i2 = xkr0Var.f262929c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                Completable completableM81762b = ((twx0) this.f273820b.get()).m81762b("campfire-seen-receipts", z ? "1" : "0");
                xkr0Var.f262929c = 1;
                Object objM96565n = zn91.m96565n(completableM81762b, xkr0Var);
                yuk yukVar = yuk.f276404a;
                if (objM96565n == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.m3967c(e2, "Failed to update seen receipts product state", new Object[0]);
        }
        return w2a1.f247311a;
    }

    @Override // p204p.fwz0
    public final Object getApi() {
        return this;
    }

    @Override // p204p.hgm
    public final void shutdown() {
    }
}
