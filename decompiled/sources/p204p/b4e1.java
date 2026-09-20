package p204p;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.R;
import com.spotify.transcript.uiusecases.zoomimageview.ZoomViewArea;

/* JADX INFO: loaded from: classes7.dex */
public final class b4e1 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23338a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f23339b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b4e1(Object obj, int i) {
        super(0);
        this.f23338a = i;
        this.f23339b = obj;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f23338a) {
            case 0:
                return new cjc0(((g4e1) this.f23339b).f76405d, a4e1.f12229b);
            case 1:
                return new cjc0(((eae1) this.f23339b).f57648c, a4e1.f12210L0);
            case 2:
                return sam.m77645B(Boolean.valueOf(((w9e1) this.f23339b).f249166a));
            case 3:
                return new tw71((gae1) this.f23339b);
            case 4:
                return new cjc0((dut) ((hbo) ((nyz0) this.f23339b).f159963f).get(), a4e1.f12218T0);
            case 5:
                return new cjc0((dut) ((nce1) this.f23339b).f152502a.get(), ube1.f228729d);
            case 6:
                return new po31((os60) this.f23339b);
            case 7:
                return (LinearLayoutCompat) ((View) ((wg61) ((he90) this.f23339b).f90378b).getValue()).findViewById(R.id.your_episodes_settings_content);
            case 8:
                dxc1 dxc1Var = (dxc1) this.f23339b;
                cne1 cne1Var = new cne1();
                cne1Var.f39990Q1 = (c700) dxc1Var.f53930b;
                return cne1Var;
            case 9:
                qne1 qne1Var = (qne1) this.f23339b;
                bji bjiVar = qne1Var.f190572e;
                if (bjiVar != null) {
                    return (qne1) bjiVar.mo29483e(new jzn0(qne1Var, 16));
                }
                return null;
            case 10:
                eqe1 eqe1Var = (eqe1) this.f23339b;
                bji bjiVar2 = eqe1Var.f61874b;
                if (bjiVar2 != null) {
                    return (eqe1) bjiVar2.mo29483e(new jzn0(eqe1Var, 17));
                }
                return null;
            case 11:
                iqe1 iqe1Var = (iqe1) this.f23339b;
                bji bjiVar3 = iqe1Var.f104752f;
                if (bjiVar3 != null) {
                    return (iqe1) bjiVar3.mo29483e(new au3(iqe1Var, 18));
                }
                return null;
            case 12:
                ite1 ite1Var = (ite1) this.f23339b;
                i4t0 i4t0Var = ite1Var.f105540a;
                vmz vmzVar = ite1Var.f105544e;
                fbk fbkVar = null;
                return ((ajq0) i4t0Var.get()).f16338b.m43659l() ? xtm0.m92074U(mvl0.m62953p(g0g1.m43301f(vmzVar.m86024a("employee", false), vmzVar.m86024a("restrict-settings-for-child", false), vmzVar.m86024a("is-standalone-audiobooks", false), new kmx(mvl0.m62953p(new kmx(vmzVar.m86026c("type", ""), 9)), 11), gte1.f84160h)), new jke1(fbkVar, ite1Var, 1)) : new ysk(fbkVar, 27);
            case 13:
                bye1 bye1Var = (bye1) this.f23339b;
                bji bjiVar4 = bye1Var.f32183b;
                if (bjiVar4 != null) {
                    return (bye1) bjiVar4.mo29483e(new jzn0(bye1Var, 18));
                }
                return null;
            case 14:
                return new xye1(new ugy0((ygy0) this.f23339b, obd1.f163623f, (gh00) null, hex0.f90527S0, foc1.f71504e, (eh00) null, 100));
            case 15:
                return ((fye1) this.f23339b).mo40307a();
            default:
                View zoomParentView = ((ZoomViewArea) this.f23339b).getZoomParentView();
                if (zoomParentView instanceof RecyclerView) {
                    return new mkv0(0, (RecyclerView) zoomParentView);
                }
                if (zoomParentView instanceof ViewGroup) {
                    return new mkv0(1, (ViewGroup) zoomParentView);
                }
                throw new IllegalStateException("Unsupported type " + (zoomParentView != null ? zoomParentView.getClass() : null) + ", it must be ViewGroup or RecyclerView.");
        }
    }
}
