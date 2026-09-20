package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.betamax.player.exception.BetamaxException;
import com.spotify.betamax.player.exception.BetamaxPlaybackException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class lfw extends f0p0 {

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ int f133020s1;

    /* JADX INFO: renamed from: t1 */
    public final dt0 f133021t1;

    /* JADX INFO: renamed from: u1 */
    public final om0 f133022u1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lfw(dt0 dt0Var, et0 et0Var, om0 om0Var, int i) {
        super(et0Var);
        this.f133020s1 = i;
        this.f133021t1 = dt0Var;
        this.f133022u1 = om0Var;
    }

    /* JADX INFO: renamed from: X */
    public static final void m58917X(lfw lfwVar, String str, Long l) {
        om0 om0Var = lfwVar.f133022u1;
        qm0 qm0Var = qm0.ERROR;
        dt0 dt0Var = lfwVar.f133021t1;
        lfwVar.m40499V(om0Var, qm0Var, dt0Var.f52681a, Long.valueOf(l.longValue()), str, dt0Var.f52683c);
    }

    @Override // p204p.f0p0, p204p.ozo0
    /* JADX INFO: renamed from: G */
    public void mo29149G(long j, long j2) {
        switch (this.f133020s1) {
            case 2:
                if (this.f64697o1) {
                    qm0 qm0Var = qm0.RESUMED;
                    dt0 dt0Var = this.f133021t1;
                    f0p0.m40496W(this, this.f133022u1, qm0Var, dt0Var.f52681a, Long.valueOf(j), null, dt0Var.f52683c, 8);
                }
                super.mo29149G(j, j2);
                break;
            default:
                super.mo29149G(j, j2);
                break;
        }
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: I */
    public void mo25535I(BetamaxException betamaxException, long j, long j2) {
        switch (this.f133020s1) {
            case 0:
                Logger.m3974j(betamaxException, "Fatal error occurred during ad playback", new Object[0]);
                break;
        }
    }

    @Override // p204p.f0p0, p204p.ma9, p204p.ozo0
    /* JADX INFO: renamed from: M */
    public void mo29150M(long j, long j2) {
        switch (this.f133020s1) {
            case 2:
                if (!this.f64697o1) {
                    qm0 qm0Var = qm0.PAUSED;
                    dt0 dt0Var = this.f133021t1;
                    f0p0.m40496W(this, this.f133022u1, qm0Var, dt0Var.f52681a, Long.valueOf(j), null, dt0Var.f52683c, 8);
                }
                super.mo29150M(j, j2);
                break;
            default:
                super.mo29150M(j, j2);
                break;
        }
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: O */
    public void mo25536O(BetamaxPlaybackException betamaxPlaybackException, long j, long j2) {
        switch (this.f133020s1) {
            case 0:
                Logger.m3970f(betamaxPlaybackException, "Recoverable error occurred during ad playback", new Object[0]);
                break;
        }
    }

    @Override // p204p.f0p0, p204p.ma9, p204p.ozo0
    /* JADX INFO: renamed from: Q */
    public void mo25537Q(clq clqVar, int i, long j, long j2) {
        switch (this.f133020s1) {
            case 0:
                super.mo25537Q(clqVar, i, j, j2);
                kfw kfwVar = new kfw(i, this, j);
                boolean z = this.f64698p1;
                this.f64698p1 = true;
                kfwVar.invoke();
                this.f64698p1 = z;
                return;
            case 3:
                super.mo25537Q(clqVar, i, j, j2);
                int iM38547C = edb.m38547C(i);
                if (iM38547C == 0) {
                    m58918Y(qm0.ENDED, j);
                    return;
                }
                if (iM38547C != 1) {
                    if (iM38547C != 2 && iM38547C != 3 && iM38547C != 4 && iM38547C != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (this.f64697o1) {
                        return;
                    }
                    m58918Y(qm0.TERMINATED, j);
                    return;
                }
                return;
            default:
                super.mo25537Q(clqVar, i, j, j2);
                return;
        }
    }

    @Override // p204p.ma9, p204p.ozo0
    /* JADX INFO: renamed from: R */
    public void mo29151R(long j, long j2) {
        switch (this.f133020s1) {
            case 1:
                super.mo29151R(j, j2);
                gb9 gb9Var = new gb9(this, j, 1);
                boolean z = this.f64698p1;
                this.f64698p1 = true;
                gb9Var.invoke();
                this.f64698p1 = z;
                break;
            default:
                super.mo29151R(j, j2);
                break;
        }
    }

    @Override // p204p.f0p0
    /* JADX INFO: renamed from: U */
    public void mo40498U(long j) {
        switch (this.f133020s1) {
            case 3:
                m58918Y(qm0.STARTED, j);
                break;
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m58918Y(qm0 qm0Var, long j) {
        dt0 dt0Var = this.f133021t1;
        f0p0.m40496W(this, this.f133022u1, qm0Var, dt0Var.f52681a, Long.valueOf(j), null, dt0Var.f52683c, 8);
    }
}
