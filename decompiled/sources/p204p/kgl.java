package p204p;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class kgl implements Connection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f122414a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f122415b;

    /* JADX INFO: renamed from: c */
    public final Object f122416c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f122417d;

    public kgl(vlu0 vlu0Var, Consumer consumer) {
        this.f122417d = vlu0Var;
        this.f122416c = vlu0Var.f242599b.m71927a(vlu0Var.f242600c, vlu0Var.f242603f, new hmm0(1, consumer, Consumer.class, "accept", "accept(Ljava/lang/Object;)V", 0, 0, 24));
    }

    @Override // com.spotify.mobius.Connection, com.spotify.mobius.functions.Consumer
    public final void accept(Object obj) {
        String str;
        switch (this.f122414a) {
            case 0:
                as21 as21Var = (as21) obj;
                if (as21Var instanceof yr21) {
                    ((Consumer) this.f122416c).accept(new k5s0(s601.m77309l0(this.f122415b ? Collections.singleton((String) this.f122417d) : gbu.f78413a, g6f.m43736n1(((yr21) as21Var).f275372b))));
                    return;
                } else {
                    if (!as21Var.equals(zr21.f285528a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
            case 1:
                yku0 yku0Var = (yku0) obj;
                qlu0 qlu0Var = (qlu0) this.f122416c;
                vlu0 vlu0Var = (vlu0) this.f122417d;
                if (!vlu0Var.f242604g || this.f122415b) {
                    vlu0.m85977a(vlu0Var, qlu0Var, yku0Var, false);
                    return;
                } else {
                    this.f122415b = true;
                    vlu0.m85977a(vlu0Var, qlu0Var, yku0Var, true);
                    return;
                }
            default:
                ph3 ph3Var = (ph3) obj;
                ik81 ik81Var = (ik81) this.f122416c;
                ovf ovfVar = (ovf) ik81Var.f103066i;
                jz80 jz80Var = ph3Var.f177454b;
                if (!this.f122415b) {
                    this.f122415b = true;
                    View view = ovfVar.getView();
                    view.requestFocus();
                    InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
                    if (inputMethodManager != null && !inputMethodManager.showSoftInput(view, 1)) {
                        inputMethodManager.toggleSoftInput(2, 0);
                    }
                }
                ((Connection) this.f122417d).accept(ph3Var);
                RecyclerView recyclerView = (RecyclerView) ((uoa) ik81Var.f103059b).f232365e;
                ovf ovfVar2 = (ovf) ik81Var.f103065h;
                zv41 zv41Var = (zv41) ik81Var.f103056X;
                dw50 dw50Var = jz80Var.f117620c;
                gvl0 gvl0Var = jz80Var.f117618a;
                if (dw50Var instanceof xv50) {
                    ibj ibjVar = gvl0Var.f84784e;
                    if (!(ibjVar instanceof gbj)) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    String str2 = ((gbj) ibjVar).f78311a;
                    if (str2 == null || str2.length() == 0) {
                        zv41Var.getClass();
                        zv41Var.m97091m(null, ore1.f168548a);
                        ovfVar2.getView().setVisibility(0);
                        ovfVar2.mo2820d(d880.f46404a);
                        recyclerView.setVisibility(4);
                    } else {
                        zv41Var.getClass();
                        zv41Var.m97091m(null, nre1.f157545a);
                        ovfVar2.getView().setVisibility(0);
                        ovfVar2.mo2820d(new c880(str2));
                        recyclerView.setVisibility(4);
                    }
                } else {
                    boolean z = dw50Var instanceof i6a0;
                    pre1 pre1Var = pre1.f180578a;
                    if (z) {
                        recyclerView.setVisibility(0);
                        ovfVar2.getView().setVisibility(8);
                        zv41Var.getClass();
                        zv41Var.m97091m(null, pre1Var);
                    } else {
                        zv41Var.getClass();
                        zv41Var.m97091m(null, pre1Var);
                    }
                }
                ibj ibjVar2 = gvl0Var.f84784e;
                gbj gbjVar = ibjVar2 instanceof gbj ? (gbj) ibjVar2 : null;
                if (gbjVar == null || (str = gbjVar.f78311a) == null) {
                    str = "";
                }
                ovfVar.mo2820d(new pwy0(str));
                return;
        }
    }

    @Override // com.spotify.mobius.Connection, com.spotify.mobius.disposables.Disposable
    public final void dispose() {
        switch (this.f122414a) {
            case 0:
            case 1:
                break;
            default:
                ((Connection) this.f122417d).dispose();
                ik81 ik81Var = (ik81) this.f122416c;
                di41 di41Var = (di41) ik81Var.f103067t;
                if (di41Var != null) {
                    di41Var.mo26601e(null);
                }
                ((View) ((uoa) ik81Var.f103059b).f232366f).setOnTouchListener(null);
                ((ovf) ik81Var.f103066i).mo2821c(ube1.f228719X0);
                break;
        }
    }

    public kgl(ik81 ik81Var, Connection connection) {
        this.f122416c = ik81Var;
        this.f122417d = connection;
    }

    public kgl(Consumer consumer, boolean z, String str) {
        this.f122416c = consumer;
        this.f122415b = z;
        this.f122417d = str;
    }

    /* JADX INFO: renamed from: a */
    private final void m56364a() {
    }

    /* JADX INFO: renamed from: b */
    private final void m56365b() {
    }
}
