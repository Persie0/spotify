package p204p;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes7.dex */
public final class qc71 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f187276a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ eh00 f187277b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wum0 f187278c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc71(xre xreVar, wum0 wum0Var, eh00 eh00Var) {
        super(0);
        this.f187278c = wum0Var;
        this.f187277b = eh00Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f187276a) {
            case 0:
                long jUptimeMillis = SystemClock.uptimeMillis();
                wum0 wum0Var = this.f187278c;
                if (jUptimeMillis - wum0Var.m89067v() > 300) {
                    this.f187277b.invoke();
                }
                wum0Var.m89068w(jUptimeMillis);
                break;
            default:
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                wum0 wum0Var2 = this.f187278c;
                if (jUptimeMillis2 - wum0Var2.m89067v() > 1000) {
                    wum0Var2.m89068w(jUptimeMillis2);
                    this.f187277b.invoke();
                }
                break;
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc71(eh00 eh00Var, wum0 wum0Var) {
        super(0);
        this.f187277b = eh00Var;
        this.f187278c = wum0Var;
    }
}
