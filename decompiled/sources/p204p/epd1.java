package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class epd1 {

    /* JADX INFO: renamed from: a */
    public final iv91 f61630a;

    /* JADX INFO: renamed from: b */
    public final tod1 f61631b;

    /* JADX INFO: renamed from: c */
    public dpd1 f61632c = cpd1.f40544a;

    public epd1(iv91 iv91Var, tod1 tod1Var) {
        this.f61630a = iv91Var;
        this.f61631b = tod1Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m39657a() {
        hv91 hv91Var;
        synchronized (this) {
            try {
                dpd1 dpd1Var = this.f61632c;
                if (dpd1Var instanceof yod1) {
                    hv91Var = ((yod1) dpd1Var).f274642a;
                    this.f61632c = new bpd1(((yod1) dpd1Var).f274642a.f95635a);
                } else {
                    if (!dpd1Var.equals(cpd1.f40544a) && !dpd1Var.equals(zod1.f284771a) && !dpd1Var.equals(apd1.f17918a) && !(dpd1Var instanceof bpd1)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hv91Var = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (hv91Var != null) {
            hv91Var.m48760a();
        }
    }
}
