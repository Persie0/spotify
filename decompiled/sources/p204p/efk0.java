package p204p;

import com.spotify.base.java.logging.Logger;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class efk0 {

    /* JADX INFO: renamed from: a */
    public final wpi0 f59061a = new wpi0(new cfk0(null, xek0.f260733a));

    /* JADX INFO: renamed from: b */
    public final int f59062b = 10;

    /* JADX INFO: renamed from: c */
    public final ArrayDeque f59063c = new ArrayDeque();

    /* JADX INFO: renamed from: d */
    public final AtomicInteger f59064d = new AtomicInteger(0);

    /* JADX INFO: renamed from: a */
    public final synchronized void m38737a(dfk0 dfk0Var) {
        try {
            boolean zM88271j = wj50.m88271j(((cfk0) this.f59061a.getValue()).f37397a, dfk0Var);
            if (zM88271j) {
                this.f59061a.m88718c(new cfk0(null, xek0.f260733a));
            }
            this.f59063c.removeIf(new n7j0(dfk0Var, 2));
            if (zM88271j) {
                ArrayDeque arrayDeque = this.f59063c;
                if (!arrayDeque.isEmpty()) {
                    this.f59061a.m88718c(arrayDeque.remove());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m38738b(dfk0 dfk0Var, bfk0 bfk0Var) {
        try {
            wpi0 wpi0Var = this.f59061a;
            if (((cfk0) wpi0Var.getValue()).f37397a == null || wj50.m88271j(((cfk0) wpi0Var.getValue()).f37397a, dfk0Var)) {
                this.f59061a.m88718c(new cfk0(dfk0Var, bfk0Var));
            } else {
                if (this.f59063c.size() >= this.f59062b) {
                    Logger.m3973i("NowPlayingVisibility: Dropped pending state due to queue overflow: " + ((cfk0) this.f59063c.remove()), new Object[0]);
                }
                ArrayDeque arrayDeque = this.f59063c;
                cfk0 cfk0Var = new cfk0(dfk0Var, bfk0Var);
                j6f.m52566X(arrayDeque, new gxj0(cfk0Var, 17), true);
                arrayDeque.add(cfk0Var);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
