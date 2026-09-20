package p204p;

import android.content.Context;
import com.spotify.mobius.coroutines.C1033x3ae6ae8e;
import com.spotify.mobius.coroutines.C1037x558fa59a;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.ResumeCommand;
import com.spotify.player.model.command.options.CommandOptions;
import io.reactivex.rxjava3.core.Flowable;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes8.dex */
public final class juc1 implements ktc1 {

    /* JADX INFO: renamed from: L0 */
    public final mmh0 f116078L0;

    /* JADX INFO: renamed from: M0 */
    public final cph f116079M0;

    /* JADX INFO: renamed from: N0 */
    public final i5x f116080N0;

    /* JADX INFO: renamed from: X */
    public final onc f116081X;

    /* JADX INFO: renamed from: Y */
    public final boolean f116082Y;

    /* JADX INFO: renamed from: Z */
    public final gh00 f116083Z;

    /* JADX INFO: renamed from: a */
    public final Context f116084a;

    /* JADX INFO: renamed from: b */
    public final q831 f116085b;

    /* JADX INFO: renamed from: c */
    public final vl91 f116086c;

    /* JADX INFO: renamed from: d */
    public final wf4 f116087d;

    /* JADX INFO: renamed from: e */
    public final luk f116088e;

    /* JADX INFO: renamed from: f */
    public final p8p0 f116089f;

    /* JADX INFO: renamed from: g */
    public final sy31 f116090g;

    /* JADX INFO: renamed from: h */
    public final ck3 f116091h;

    /* JADX INFO: renamed from: i */
    public final ftf0 f116092i;

    /* JADX INFO: renamed from: t */
    public final gtc1 f116093t;

    public juc1(Context context, InterfaceC2609yd interfaceC2609yd, Flowable flowable, q831 q831Var, vl91 vl91Var, wf4 wf4Var, luk lukVar, p8p0 p8p0Var, sy31 sy31Var, ck3 ck3Var, ftf0 ftf0Var, gh00 gh00Var, gtc1 gtc1Var) {
        this.f116084a = context;
        this.f116085b = q831Var;
        this.f116086c = vl91Var;
        this.f116087d = wf4Var;
        this.f116088e = lukVar;
        this.f116089f = p8p0Var;
        this.f116090g = sy31Var;
        this.f116091h = ck3Var;
        this.f116092i = ftf0Var;
        this.f116093t = gtc1Var;
        d0k[] d0kVarArr = bmu0.f28619a;
        this.f116081X = new onc(flowable);
        int i = 2;
        this.f116082Y = interfaceC2609yd.mo76359a(2);
        this.f116083Z = gh00Var == null ? new utc1(this, i) : gh00Var;
        utc1 utc1Var = new utc1(this, 0);
        int i2 = 1;
        vac1 vac1Var = new vac1(this, i2);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        C1033x3ae6ae8e c1033x3ae6ae8e = new C1033x3ae6ae8e();
        fuc1 fuc1Var = new fuc1(this);
        jqv0 jqv0Var = qpv0.f191387a;
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(stc1.class), c1033x3ae6ae8e.m15631a(fuc1Var));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(ttc1.class), new C1037x558fa59a().m15633a(new xtc1(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(ltc1.class), new C1037x558fa59a().m15633a(new ztc1(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(rtc1.class), new C1037x558fa59a().m15633a(new auc1(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(otc1.class), new C1037x558fa59a().m15633a(new buc1(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(ptc1.class), new C1037x558fa59a().m15633a(new huc1(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(qtc1.class), new C1037x558fa59a().m15633a(new cuc1(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(ntc1.class), new C1037x558fa59a().m15633a(new duc1(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(mtc1.class), new C1037x558fa59a().m15633a(new euc1(this)));
        this.f116078L0 = alf1.m26338u(utc1Var, vac1Var, new C1044a(lukVar, coroutinesSubtypeEffectHandlerBuilderM42464h), nub1.f158563T0, new utc1(this, i2));
        fyf fyfVar = new fyf(new qcb1(this, 14), true, 494949482);
        wpi0 wpi0Var = xwt.f266743a;
        this.f116079M0 = new cph(fyfVar, 3);
        this.f116080N0 = mhf1.m61771p(this).m94133b(myb1.f148397S0, myb1.f148398T0);
    }

    /* JADX INFO: renamed from: e */
    public static final Object m54339e(juc1 juc1Var, guc1 guc1Var) {
        Object objM96565n = zn91.m96565n(juc1Var.f116089f.mo48412a(new v7p0(PauseCommand.builder().options(CommandOptions.builder().systemInitiated(true).overrideRestrictions(true).build()).build())).ignoreElement(), guc1Var);
        return objM96565n == yuk.f276404a ? objM96565n : w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public static final Object m54340f(juc1 juc1Var, ibk ibkVar) {
        iuc1 iuc1Var;
        if (ibkVar instanceof iuc1) {
            iuc1Var = (iuc1) ibkVar;
            int i = iuc1Var.f105938c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iuc1Var.f105938c = i - Integer.MIN_VALUE;
            } else {
                iuc1Var = new iuc1(juc1Var, ibkVar);
            }
        } else {
            iuc1Var = new iuc1(juc1Var, ibkVar);
        }
        Object obj = iuc1Var.f105936a;
        int i2 = iuc1Var.f105938c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                iuc1Var.f105938c = 1;
                Object objM54341g = juc1Var.m54341g(iuc1Var);
                yuk yukVar = yuk.f276404a;
                if (objM54341g == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            na6.m63972t("Failed to resume playback", e2);
        }
        return w2a1.f247311a;
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f116080N0;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f116079M0;
    }

    /* JADX INFO: renamed from: g */
    public final Object m54341g(iuc1 iuc1Var) {
        Object objM96565n = zn91.m96565n(this.f116089f.mo48412a(new y7p0(ResumeCommand.builder().options(CommandOptions.builder().systemInitiated(true).build()).build())).ignoreElement(), iuc1Var);
        return objM96565n == yuk.f276404a ? objM96565n : w2a1.f247311a;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f116078L0;
    }
}
