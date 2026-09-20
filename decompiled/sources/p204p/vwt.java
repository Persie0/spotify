package p204p;

import android.app.DatePickerDialog;
import android.view.View;
import com.spotify.mainlayout.p106ui.view.containers.MainLayoutContentContainerView;

/* JADX INFO: loaded from: classes6.dex */
public final class vwt implements ewr {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f245551a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f245552b;

    public /* synthetic */ vwt(Object obj, int i) {
        this.f245551a = i;
        this.f245552b = obj;
    }

    @Override // p204p.ewr
    public final void dispose() {
        switch (this.f245551a) {
            case 0:
                kk40.m56680v((xuk) this.f245552b, null);
                break;
            case 1:
                ((loi0) this.f245552b).m59569a(false);
                break;
            case 2:
                ((lwt) this.f245552b).dispose();
                break;
            case 3:
                ((mjh) this.f245552b).f144256b.m60493G();
                break;
            case 4:
                goc1 goc1Var = (goc1) ((ht3) this.f245552b).f94913e;
                c9k c9kVar = (c9k) goc1Var.f82941d;
                if (c9kVar != null) {
                    kk40.m56680v(c9kVar, null);
                }
                goc1Var.f82941d = null;
                goc1Var.f82942e = null;
                break;
            case 5:
                fgu fguVar = (fgu) this.f245552b;
                fguVar.f69400b = false;
                fguVar.f69399a.setValue(Boolean.FALSE);
                break;
            case 6:
                ((xkx) this.f245552b).f262952d.f240766a = null;
                break;
            case 7:
                cox coxVar = (cox) this.f245552b;
                View view = coxVar.f40362b;
                if (coxVar.f40361a) {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(coxVar);
                    coxVar.f40361a = false;
                }
                view.removeOnAttachStateChangeListener(coxVar);
                break;
            case 8:
                ((gf10) this.f245552b).f79248b.invoke();
                break;
            case 9:
                qlg1.m73214s(((cu40) ((bmh) this.f245552b).f28527c).f42046j.f35578a, null);
                break;
            case 10:
                ((gv70) this.f245552b).f84654d = null;
                break;
            case 11:
                vv70 vv70Var = (vv70) this.f245552b;
                m12 m12Var = vv70Var.f245164c;
                if (m12Var != null) {
                    m12Var.f138796b = false;
                }
                vv70Var.f245164c = null;
                break;
            case 12:
                ((qv70) this.f245552b).f192931f = true;
                break;
            case 13:
                ((bb90) this.f245552b).f25480a.m96288o(4);
                break;
            case 14:
                ((wcm) ((nod) this.f245552b).f156663g).f250070a.f38640e = null;
                break;
            case 15:
                ((MainLayoutContentContainerView) this.f245552b).f5411L0.m97090l(null);
                break;
            case 16:
                ((s2c0) this.f245552b).m84813d(false);
                break;
            case 17:
                ((vjd0) ((C2065kt) this.f245552b).f126083f).f241955c = null;
                break;
            case 18:
                ((p7x0) this.f245552b).unregister();
                break;
            case 19:
                gdf0 gdf0Var = (gdf0) this.f245552b;
                m500 m500Var = gdf0Var.f78836f;
                if (m500Var.isFinishing() && !m500Var.isChangingConfigurations()) {
                    ldf0 ldf0Var = new ldf0(false);
                    if (gdf0Var.f78842l.compareAndSet(false, true)) {
                        gdf0Var.f78840j.m61520b(ldf0Var);
                        break;
                    }
                }
                break;
            case 20:
                gsh0 gsh0Var = (gsh0) this.f245552b;
                gsh0Var.dismiss();
                gsh0Var.f83972h.m82425g();
                break;
            case 21:
                ((vxh0) this.f245552b).f245748d--;
                break;
            case 22:
                pcz0 pcz0Var = (pcz0) this.f245552b;
                if (pcz0Var != null) {
                    pcz0Var.f176300a.setValue(null);
                }
                break;
            case 23:
                ((hqc1) this.f245552b).f94105b = false;
                break;
            case 24:
                ssv0 ssv0Var = (ssv0) this.f245552b;
                if (ssv0Var != null) {
                    ssv0Var.m79224a();
                }
                break;
            case 25:
                ((eca) this.f245552b).f58278c.invoke(bda.f26063c);
                break;
            case 26:
                ((ckk0) this.f245552b).invoke();
                break;
            case 27:
                ((pmm0) this.f245552b).m70363a();
                break;
            case 28:
                ((DatePickerDialog) this.f245552b).dismiss();
                break;
            default:
                miq0 miq0Var = (miq0) this.f245552b;
                if (miq0Var != null) {
                    miq0Var.f144075f = null;
                }
                if (miq0Var != null) {
                    miq0Var.f144076g = null;
                }
                break;
        }
    }
}
