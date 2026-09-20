package p204p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class u7d1 extends i500 {

    /* JADX INFO: renamed from: A1 */
    public final zga1 f227576A1;

    /* JADX INFO: renamed from: B1 */
    public if0 f227577B1;

    /* JADX INFO: renamed from: C1 */
    public z7d1 f227578C1;

    /* JADX INFO: renamed from: D1 */
    public Scheduler f227579D1;

    /* JADX INFO: renamed from: E1 */
    public b4e f227580E1;

    /* JADX INFO: renamed from: F1 */
    public d4e f227581F1;

    /* JADX INFO: renamed from: G1 */
    public wy91 f227582G1;

    /* JADX INFO: renamed from: H1 */
    public rkj0 f227583H1;

    /* JADX INFO: renamed from: I1 */
    public ubq0 f227584I1;

    /* JADX INFO: renamed from: J1 */
    public jye1 f227585J1;

    /* JADX INFO: renamed from: K1 */
    public dt81 f227586K1;

    /* JADX INFO: renamed from: L1 */
    public final CompositeDisposable f227587L1 = new CompositeDisposable();

    /* JADX INFO: renamed from: M1 */
    public final wg61 f227588M1 = new wg61(new v7z0(this, 19));

    public u7d1(zga1 zga1Var) {
        this.f227576A1 = zga1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: h1 */
    public static final Object m82507h1(u7d1 u7d1Var, ibk ibkVar) {
        s7d1 s7d1Var;
        u7d1Var.getClass();
        if (ibkVar instanceof s7d1) {
            s7d1Var = (s7d1) ibkVar;
            int i = s7d1Var.f206341c;
            if ((i & Integer.MIN_VALUE) != 0) {
                s7d1Var.f206341c = i - Integer.MIN_VALUE;
            } else {
                s7d1Var = new s7d1(u7d1Var, ibkVar);
            }
        } else {
            s7d1Var = new s7d1(u7d1Var, ibkVar);
        }
        Object objM67489H = s7d1Var.f206339a;
        int i2 = s7d1Var.f206341c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM67489H);
                Context contextM49702X0 = u7d1Var.m49702X0();
                wy91 wy91Var = u7d1Var.f227582G1;
                if (wy91Var == null) {
                    wj50.m88260d0("unauthConfigurationProvider");
                    throw null;
                }
                rkj0 rkj0Var = u7d1Var.f227583H1;
                if (rkj0Var == null) {
                    wj50.m88260d0("ageSignalOverride");
                    throw null;
                }
                ubq0 ubq0Var = u7d1Var.f227584I1;
                if (ubq0Var == null) {
                    wj50.m88260d0("preAuthUbiTracker");
                    throw null;
                }
                jye1 jye1Var = u7d1Var.f227585J1;
                if (jye1Var == null) {
                    wj50.m88260d0("eventSenderPublisher");
                    throw null;
                }
                ioc1 ioc1Var = new ioc1(jye1Var, 4);
                dt81 dt81Var = u7d1Var.f227586K1;
                if (dt81Var == null) {
                    wj50.m88260d0("trackerIds");
                    throw null;
                }
                ood0 ood0VarM56792z = huf1.m48650j(contextM49702X0, wy91Var, rkj0Var, new lj7(ubq0Var, ioc1Var, dt81Var)).m56792z();
                s7d1Var.f206341c = 1;
                objM67489H = ood0VarM56792z.m67489H(s7d1Var);
                yuk yukVar = yuk.f276404a;
                if (objM67489H == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM67489H);
            }
            oh2 oh2Var = (oh2) objM67489H;
            if (oh2Var instanceof mh2) {
                return null;
            }
            if (!(oh2Var instanceof nh2)) {
                throw new NoWhenBranchMatchedException();
            }
            if (((nh2) oh2Var).f153844a == 2) {
                return (nh2) oh2Var;
            }
            return null;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.m3973i("WarmupFragment", "Warmup age verification failed, continuing", e2);
            return null;
        }
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: E0 */
    public final void mo875E0(Context context) {
        this.f227576A1.mo24367f(this);
        super.mo875E0(context);
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: F0 */
    public final void mo876F0(Bundle bundle) {
        super.mo876F0(bundle);
        z7d1 z7d1Var = this.f227578C1;
        if (z7d1Var != null) {
            z7d1Var.m95551a();
        } else {
            wj50.m88260d0("presenter");
            throw null;
        }
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: G0 */
    public final View mo877G0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_warmup, viewGroup, false);
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: I0 */
    public final void mo878I0() {
        this.f227587L1.m23396g();
        this.f98702f1 = true;
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: O0 */
    public final void mo880O0(Bundle bundle) {
        z7d1 z7d1Var = this.f227578C1;
        if (z7d1Var != null) {
            bundle.putBoolean("key_pses_request_suspended", z7d1Var.f280180g);
        } else {
            wj50.m88260d0("presenter");
            throw null;
        }
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: R0 */
    public final void mo881R0(View view, Bundle bundle) {
        View viewFindViewById = view.findViewById(R.id.loading_spinner);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(((Boolean) this.f227588M1.getValue()).booleanValue() ? 0 : 8);
        }
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: S0 */
    public final void mo49696S0(Bundle bundle) {
        this.f98702f1 = true;
        z7d1 z7d1Var = this.f227578C1;
        if (z7d1Var == null) {
            wj50.m88260d0("presenter");
            throw null;
        }
        if (bundle == null || !bundle.getBoolean("key_pses_request_suspended", false)) {
            return;
        }
        z7d1Var.m95551a();
    }

    /* JADX INFO: renamed from: i1 */
    public final if0 m82508i1() {
        if0 if0Var = this.f227577B1;
        if (if0Var != null) {
            return if0Var;
        }
        wj50.m88260d0("zeroNavigator");
        throw null;
    }
}
