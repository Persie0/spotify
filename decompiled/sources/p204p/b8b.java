package p204p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkDatabase;
import com.spotify.mobius.MobiusLoop;
import com.spotify.music.R;
import com.spotify.proactiveplatforms.npvwidget.CoverScreenWidgetProvider;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b8b extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f24543a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f24544b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b8b(Object obj, int i) {
        super(0);
        this.f24543a = i;
        this.f24544b = obj;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = this.f24543a;
        char c = 1;
        fbk fbkVar = null;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj = this.f24544b;
        switch (i) {
            case 0:
                return ((daj0) ((c8b) obj).f35162f.get()).m35487b();
            case 1:
                l0e1 l0e1Var = (l0e1) obj;
                WorkDatabase workDatabase = l0e1Var.f128405B0;
                fr2 fr2Var = new fr2(26, workDatabase, l0e1Var);
                workDatabase.getClass();
                workDatabase.m59193w(new hjx0(0, fr2Var));
                cv9.m33989g(l0e1Var);
                return w2a1Var;
            case 2:
                return nxf1.m65833l(new b6b((cyb) obj, fbkVar, 6));
            case 3:
                yk0.m93949a((yk0) obj).f141552a.start();
                return w2a1Var;
            case 4:
                return cct.m32296A(((ubc) obj).f228685b, njg1.m64613f());
            case 5:
                return (z4l0) obj;
            case 6:
                g3f g3fVar = (g3f) obj;
                return g3fVar.f76201b.m94282d(g3fVar.f76200a);
            case 7:
                return ((bii0) obj).getF3300l1().f243453a;
            case 8:
                cwf cwfVar = (cwf) obj;
                return new dh00(cwfVar.f42742f, new awf(cwfVar, c == true ? 1 : 0));
            case 9:
                return ((o1i) obj).f160738L0.m50029l();
            case 10:
                hsi hsiVar = (hsi) obj;
                bji bjiVar = hsiVar.f94721V;
                if (bjiVar != null) {
                    return (hsi) bjiVar.mo29483e(new au3(hsiVar, 12));
                }
                return null;
            case 11:
                return (dut) ((mhj) obj).f143802b.invoke();
            case 12:
                return Integer.valueOf(((List) obj).size());
            case 13:
                ((tuk) obj).f223870Z = null;
                return w2a1Var;
            case 14:
                CoverScreenWidgetProvider coverScreenWidgetProvider = (CoverScreenWidgetProvider) obj;
                return coverScreenWidgetProvider.f6506e.mo25796a(new yfk(coverScreenWidgetProvider, 13));
            case 15:
                ((f9l) obj).f67287a.mo47345e();
                return w2a1Var;
            case 16:
                MobiusLoop mobiusLoop = ((r6m) obj).f196322c;
                if (mobiusLoop != null) {
                    return bnf1.m29974j(mobiusLoop);
                }
                wj50.m88260d0("loop");
                throw null;
            case 17:
                ((hfm) obj).mo24745d("");
                return w2a1Var;
            case 18:
                return new gj80(((rho) obj).f199261a.getString(R.string.data_saver_indicator_message), ej80.f60159a);
            case 19:
                kuo kuoVar = (kuo) obj;
                fv31 fv31Var = kuo.f126644c;
                if (((iuo) kuoVar.m57410b().f180351b) != iuo.LOGGED_OUT) {
                    lv31 lv31VarEdit = kuoVar.f126646a.edit();
                    lv31VarEdit.m60053f(kuo.f126644c);
                    lv31VarEdit.m60053f(kuo.f126645d);
                    lv31VarEdit.m60054g();
                }
                return w2a1Var;
            case 20:
                x0p x0pVar = (x0p) obj;
                if (x0pVar.m89590d() && x0pVar.f256933o) {
                    x0pVar.f256941w = new zca(3);
                    x0pVar.f256943y.add(x0pVar.f256923e.m83914b());
                    x0pVar.m89597l(5);
                }
                return w2a1Var;
            case 21:
                ((jac) obj).mo47358a();
                return w2a1Var;
            case 22:
                return cct.m32296A(((x7p) obj).f258959d, njg1.m64613f());
            case 23:
                return (zmd0) ((aqp) obj).f18747a.get();
            case 24:
                return lzj.m60389y(u7n.m82510h((u7n) obj).m86695w().getContext(), R.drawable.encore_icon_chevron_right_16);
            case 25:
                q2r0 q2r0VarM72029b = q2r0.m72029b(LayoutInflater.from((Context) obj));
                q2r0VarM72029b.m72030a().setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                q3r0 q3r0VarM26334q = alf1.m26334q(q2r0VarM72029b.m72030a());
                Collections.addAll(q3r0VarM26334q.f184933d, q2r0VarM72029b.f184701b);
                q3r0VarM26334q.m72126a();
                return q2r0VarM72029b;
            case 26:
                luk lukVar = ((u2q) obj).f226132d;
                x461 x461VarM64613f = njg1.m64613f();
                lukVar.getClass();
                return cct.m32296A(lukVar, x461VarM64613f);
            case 27:
                ((RecyclerView) za7.m95752a((za7) obj).f27888c).mo1035v0(0);
                return w2a1Var;
            case 28:
                qly0 qly0Var = (qly0) obj;
                return Boolean.valueOf(qly0Var.f189945e.m86437v() != Integer.MAX_VALUE && qly0Var.f189941a.m86437v() >= qly0Var.f189945e.m86437v());
            default:
                return (e0s) ((er70) obj).get();
        }
    }
}
