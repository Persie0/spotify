package p204p;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public final class ltr implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f136852a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f136853b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f136854c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f136855d;

    public /* synthetic */ ltr(Object obj, Object obj2, Object obj3, int i) {
        this.f136852a = i;
        this.f136853b = obj;
        this.f136854c = obj2;
        this.f136855d = obj3;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [p.qe70, p.xh00] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        gb80 lifecycle;
        gb80 lifecycle2;
        switch (this.f136852a) {
            case 0:
                ((View) this.f136853b).removeOnAttachStateChangeListener(this);
                if (((otr) this.f136854c).f170079f.f52894a) {
                    ntr ntrVar = (ntr) this.f136855d;
                    otr otrVar = ntrVar.f158131h;
                    ntrVar.f158125b = x0h1.m89578u(otrVar.f170081h, otrVar.f170074a, 0, new kp1(otrVar, ntrVar, ntrVar.f158133t, null, 14), 2);
                }
                break;
            case 1:
                ((FrameLayout) this.f136853b).removeOnAttachStateChangeListener(this);
                ((era0) this.f136854c).f62056h.requestLayout();
                ((kqi0) this.f136855d).setValue(Boolean.TRUE);
                break;
            case 2:
                ((View) this.f136853b).removeOnAttachStateChangeListener(this);
                View view2 = (View) this.f136854c;
                inl0.m51135a(view2, new vod0(6, view2, (pmm0) this.f136855d));
                break;
            case 3:
                ((hjv0) this.f136853b).mo31053s((dkv0) this.f136854c);
                ((vhc1) this.f136855d).f241472c = true;
                break;
            case 4:
                RecyclerView recyclerView = (RecyclerView) this.f136855d;
                qob1 qob1Var = (qob1) this.f136854c;
                if (((hjv0) this.f136853b).mo1617e() > 0) {
                    if (!qob1Var.f190908t && (recyclerView.getChildCount() == 0 || recyclerView.getLayoutParams().height != -2)) {
                        qob1Var.f190908t = true;
                        recyclerView.post(new vpa1(2, qob1Var, recyclerView));
                    }
                    if (!qob1Var.f190896X) {
                        qob1Var.f190896X = true;
                        recyclerView.post(new wpa1(1, qob1Var, recyclerView));
                        break;
                    }
                }
                break;
            case 5:
                ntp ntpVar = (ntp) this.f136854c;
                rlv0 rlv0Var = (rlv0) this.f136853b;
                hc80 hc80Var = (hc80) rlv0Var.f200373a;
                if (hc80Var != null && (lifecycle2 = hc80Var.getLifecycle()) != null) {
                    lifecycle2.mo31988d(ntpVar);
                }
                hc80 hc80VarM40067h = eug1.m40067h(view);
                rlv0Var.f200373a = hc80VarM40067h;
                hc80 hc80Var2 = hc80VarM40067h;
                if (hc80Var2 != null && (lifecycle = hc80Var2.getLifecycle()) != null) {
                    lifecycle.mo31986a(ntpVar);
                }
                ((vpb1) this.f136855d).invoke();
                break;
            default:
                ((View) this.f136853b).removeOnAttachStateChangeListener(this);
                ufg1.m83008j((View) this.f136854c, (qe70) this.f136855d);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f136852a) {
            case 3:
                ((hjv0) this.f136853b).mo31054t((dkv0) this.f136854c);
                ((vhc1) this.f136855d).f241472c = false;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ltr(View view, View view2, xh00 xh00Var) {
        this.f136852a = 6;
        this.f136853b = view;
        this.f136854c = view2;
        this.f136855d = (qe70) xh00Var;
    }

    /* JADX INFO: renamed from: a */
    private final void m59904a(View view) {
    }

    /* JADX INFO: renamed from: b */
    private final void m59905b(View view) {
    }

    /* JADX INFO: renamed from: c */
    private final void m59906c(View view) {
    }

    /* JADX INFO: renamed from: d */
    private final void m59907d(View view) {
    }

    /* JADX INFO: renamed from: e */
    private final void m59908e(View view) {
    }

    /* JADX INFO: renamed from: f */
    private final void m59909f(View view) {
    }
}
