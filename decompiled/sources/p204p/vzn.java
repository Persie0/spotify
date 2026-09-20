package p204p;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.opengl.GLES20;
import android.view.ViewGroup;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import com.spotify.music.R;
import com.spotify.player.esperanto.proto.EsSignalRequest$SignalRequest;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableObserveOn;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDoOnLifecycle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class vzn implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f246486a;

    /* JADX INFO: renamed from: b */
    public final Object f246487b;

    /* JADX INFO: renamed from: c */
    public Object f246488c;

    /* JADX INFO: renamed from: d */
    public final Object f246489d;

    public /* synthetic */ vzn(Object obj, Object obj2, Object obj3, int i) {
        this.f246486a = i;
        this.f246489d = obj;
        this.f246487b = obj2;
        this.f246488c = obj3;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [p.gh00, p.qe70] */
    /* JADX INFO: renamed from: a */
    public Uri m86904a(InterfaceC2415th interfaceC2415th) {
        Uri.Builder builderBuildUpon = ((Uri) this.f246487b).buildUpon();
        for (Map.Entry entry : ((Map) ((qe70) this.f246488c).invoke(interfaceC2415th)).entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return builderBuildUpon.build();
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        Completable completableM49642a;
        Single singleM25048a;
        switch (this.f246486a) {
            case 20:
                x28 x28Var = (x28) this.f246487b;
                tu40 tu40Var = (tu40) this.f246489d;
                if (!((Boolean) obj).booleanValue() || tu40Var.f223761a) {
                    n93 n93Var = (n93) x28Var.f257389h;
                    String str = (String) x28Var.f257383b;
                    boolean z = tu40Var.f223761a;
                    String strMo81549c = tu40Var.mo81549c();
                    if (strMo81549c == null) {
                        strMo81549c = tu40Var.getUri();
                    }
                    return n93Var.m63880c(Collections.singletonList(strMo81549c), str, tu40Var.f223765e, z, new f93(27, ((cb3) this.f246488c).f36000a)).ignoreElement();
                }
                i431 i431Var = (i431) x28Var.f257386e;
                k331 k331Var = (k331) x28Var.f257390i;
                if (k331Var.m55226b()) {
                    r7k r7kVar = (r7k) i431Var.f98423q.getValue();
                    tow towVarM17992q = EsSignalRequest$SignalRequest.m17992q();
                    towVarM17992q.m81225r("plus");
                    completableM49642a = r7kVar.callSingle("spotify.player.esperanto.proto.ContextPlayer", "Signal", (EsSignalRequest$SignalRequest) towVarM17992q.build()).map(njy0.f154680Q0).ignoreElement();
                } else {
                    completableM49642a = i431Var.m49642a(tu40Var.f223763c, tu40Var.f223762b, tu40Var.f223765e);
                }
                CompletableObserveOn completableObserveOnM23298o = completableM49642a.m23298o((Scheduler) x28Var.f257379X);
                if (((qq4) k331Var.f118755a.get()).m73468C()) {
                    singleM25048a = Single.just(Boolean.TRUE);
                    wj50.m88279p(singleM25048a);
                } else {
                    singleM25048a = a8q.m25048a((a8q) x28Var.f257377M0);
                }
                return completableObserveOnM23298o.m23292c(singleM25048a.flatMap(new p7o(8, x28Var, tu40Var)).flatMapCompletable(new ybn(15, x28Var, tu40Var))).m23300q(new fs9(x28Var, 27));
            default:
                wr11 wr11Var = (wr11) obj;
                List list = (List) this.f246487b;
                sdo sdoVar = (sdo) this.f246489d;
                return wr11Var == wr11.f254245c ? ((t4f) sdoVar.f208049c).m80060a(sdo.m77847C(list, r5f.PRERELEASE)).ignoreElement() : ((n5f) sdoVar.f208048b).m63720a(sdo.m77848D(list, (d850) this.f246488c)).ignoreElement();
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m86905b(InterfaceC2415th interfaceC2415th) {
        PackageManager packageManager = ((Context) this.f246489d).getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(m86904a(interfaceC2415th));
        return !packageManager.queryIntentActivities(intent, 0).isEmpty();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public Object m86906c(voc1 voc1Var, String str, f3o0 f3o0Var, ibk ibkVar) {
        w4p w4pVar;
        if (ibkVar instanceof w4p) {
            w4pVar = (w4p) ibkVar;
            int i = w4pVar.f247865f;
            if ((i & Integer.MIN_VALUE) != 0) {
                w4pVar.f247865f = i - Integer.MIN_VALUE;
            } else {
                w4pVar = new w4p(this, ibkVar);
            }
        } else {
            w4pVar = new w4p(this, ibkVar);
        }
        Object objM96571q = w4pVar.f247863d;
        int i2 = w4pVar.f247865f;
        if (i2 == 0) {
            bga.m29073P(objM96571q);
            Observable observableM94463b = ((yse1) this.f246489d).m94463b(str, voc1Var);
            w4pVar.f247860a = voc1Var;
            w4pVar.f247861b = str;
            w4pVar.f247862c = f3o0Var;
            w4pVar.f247865f = 1;
            objM96571q = zn91.m96571q(observableM94463b, 1, null, w4pVar);
            yuk yukVar = yuk.f276404a;
            if (objM96571q == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f3o0Var = w4pVar.f247862c;
            str = w4pVar.f247861b;
            voc1Var = w4pVar.f247860a;
            bga.m29073P(objM96571q);
        }
        zpe1 zpe1Var = (zpe1) objM96571q;
        if (zpe1Var.equals(xpe1.f264625a)) {
            return ((yb81) this.f246488c).m93243f(str, f3o0Var);
        }
        if (zpe1Var instanceof ype1) {
            return null;
        }
        return ((da80) this.f246487b).m35410f(str, f3o0Var, voc1Var);
    }

    /* JADX INFO: renamed from: d */
    public void m86907d(wsv0 wsv0Var, ce10 ce10Var) throws VideoFrameProcessingException, GlUtil$GlException {
        ykn yknVar = (ykn) this.f246487b;
        if (((xd10) this.f246488c) == null) {
            try {
                xd10 xd10Var = new xd10((Context) this.f246489d, R.raw.vertex_shader_transformation_es2, R.raw.fragment_shader_alpha_scale_es2);
                this.f246488c = xd10Var;
                xd10Var.m90401d(mjx0.m62000D());
                ((xd10) this.f246488c).m90403f("uTexTransformationMatrix", mjx0.m62037o());
            } catch (IOException e) {
                throw new VideoFrameProcessingException(e);
            }
        }
        int i = ce10Var.f36991b;
        int i2 = ce10Var.f36993d;
        int i3 = ce10Var.f36992c;
        mjx0.m62047y(i, i3, i2);
        yknVar.f273754X = new di21(i3, i2);
        mjx0.m62035m();
        xd10 xd10Var2 = (xd10) this.f246488c;
        xd10Var2.getClass();
        GLES20.glUseProgram(xd10Var2.f260345a);
        mjx0.m62033k();
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        mjx0.m62033k();
        for (int i4 = wsv0Var.f254765d - 1; i4 >= 0; i4--) {
            sd10 sd10Var = (sd10) wsv0Var.get(i4);
            xd10 xd10Var3 = (xd10) this.f246488c;
            xd10Var3.getClass();
            ce10 ce10Var2 = sd10Var.f207852a;
            urb1 urb1Var = sd10Var.f207853b;
            xd10Var3.m90405h(ce10Var2.f36990a, 0, "uTexSampler");
            xd10Var3.m90403f("uTransformationMatrix", yknVar.mo71964b0(new di21(ce10Var2.f36992c, ce10Var2.f36993d), urb1Var));
            xd10Var3.m90402e("uAlphaScale", 1.0f);
            xd10Var3.m90399b();
            GLES20.glDrawArrays(5, 0, 4);
            mjx0.m62033k();
        }
        GLES20.glDisable(3042);
        mjx0.m62033k();
    }

    /* JADX INFO: renamed from: e */
    public Observable m86908e() {
        return Observable.combineLatest(new ObservableFromPublisher((FlowableDoOnLifecycle) this.f246489d).map(pqa.f180225U0), Observable.combineLatest(((s5p) ((voi) this.f246487b)).m77297d(), k0e1.m54988g(new thl(((mb80) this.f246488c).f141817b.current(), this, 27), dau.f47107a), new iq3(this, 8)).defaultIfEmpty(Boolean.FALSE), xwe.f266654V0);
    }

    public vzn(l8x l8xVar, yb11 yb11Var) {
        this.f246486a = 17;
        this.f246489d = l8xVar;
        this.f246487b = yb11Var;
    }

    public vzn(qzn qznVar, ri5 ri5Var, n95 n95Var, dt81 dt81Var) {
        this.f246486a = 19;
        this.f246489d = qznVar;
        this.f246487b = n95Var;
        this.f246488c = dt81Var;
    }

    public vzn(Context context, ViewGroup viewGroup) {
        this.f246486a = 26;
        this.f246489d = context;
        this.f246487b = viewGroup;
        this.f246488c = new wg61(new wep(this, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public vzn(Context context, Uri uri, gh00 gh00Var) {
        this.f246486a = 18;
        this.f246489d = context;
        this.f246487b = uri;
        this.f246488c = (qe70) gh00Var;
    }

    public vzn(ye50 ye50Var, fiz fizVar) {
        this.f246486a = 16;
        this.f246489d = ye50Var;
        this.f246487b = fizVar;
        this.f246488c = new wg61(new sho(this, 1));
    }

    public vzn(wt80 wt80Var, String str, mi80 mi80Var, pne1 pne1Var, luk lukVar, tre1 tre1Var) {
        this.f246486a = 28;
        this.f246489d = wt80Var;
        this.f246487b = lukVar;
        this.f246488c = tre1Var;
    }

    public vzn(qga1 qga1Var) {
        this.f246486a = 15;
        this.f246489d = qga1Var;
        int i = 23;
        this.f246487b = new zao(this, 0, i);
        this.f246488c = new zao(this, 1, i);
    }

    public vzn(Context context) {
        this.f246486a = 24;
        this.f246489d = context;
        this.f246487b = new ykn();
    }

    public vzn(jfn jfnVar, l3n l3nVar, mrq mrqVar) {
        this.f246486a = 10;
        this.f246489d = l3nVar;
        this.f246487b = jfnVar;
        this.f246488c = new p8o(this, 23);
    }

    public vzn(bgn bgnVar, l3n l3nVar, orq orqVar) {
        this.f246486a = 4;
        this.f246489d = l3nVar;
        this.f246487b = bgnVar;
        this.f246488c = new tzn(this, 14);
    }

    public vzn(dgn dgnVar, cu50 cu50Var) {
        this.f246486a = 7;
        this.f246489d = cu50Var;
        this.f246487b = dgnVar;
        this.f246488c = be21.m28868a(new p8o(this, 7));
    }

    public vzn(oen oenVar, l3n l3nVar, mrq mrqVar) {
        this.f246486a = 14;
        this.f246489d = l3nVar;
        this.f246487b = oenVar;
        this.f246488c = new hbo(this, 9);
    }

    public vzn(ol71 ol71Var) {
        this.f246486a = 9;
        this.f246489d = ol71Var;
        int i = 17;
        this.f246488c = b2s.m27972b(new s7o(this, 1, i));
        this.f246487b = new s7o(this, 0, i);
    }

    public vzn(uez0 uez0Var, vez0 vez0Var) {
        this.f246486a = 3;
        this.f246489d = uez0Var;
        int i = 6;
        this.f246488c = b2s.m27972b(new d3o(this, 1, i));
        this.f246487b = new d3o(this, 0, i);
    }

    public vzn(dm21 dm21Var, em21 em21Var) {
        this.f246486a = 5;
        this.f246489d = dm21Var;
        int i = 26;
        this.f246488c = b2s.m27972b(new d3o(this, 1, i));
        this.f246487b = new d3o(this, 0, i);
    }

    public vzn(meb1 meb1Var, ffb1 ffb1Var) {
        this.f246486a = 12;
        this.f246489d = meb1Var;
        int i = 5;
        this.f246487b = new zao(this, 1, i);
        this.f246488c = new zao(this, 0, i);
    }

    public vzn(ven venVar, l3n l3nVar, urq urqVar) {
        this.f246486a = 6;
        this.f246489d = l3nVar;
        this.f246487b = venVar;
        this.f246488c = be21.m28868a(new tzn(this, 27));
    }

    public vzn(rmn rmnVar, l3n l3nVar, esq esqVar) {
        this.f246486a = 13;
        this.f246489d = rmnVar;
        int i = 14;
        this.f246487b = new zao(this, 1, i);
        this.f246488c = be21.m28868a(new zao(this, 0, i));
    }

    public vzn(jcb1 jcb1Var, kcb1 kcb1Var) {
        this.f246486a = 11;
        this.f246489d = jcb1Var;
        int i = 3;
        this.f246488c = be21.m28868a(new zao(this, 0, i));
        this.f246487b = b2s.m27972b(new zao(this, 1, i));
    }

    public vzn(pzt0 pzt0Var, eoh eohVar, qzt0 qzt0Var) {
        this.f246486a = 2;
        this.f246489d = pzt0Var;
        int i = 14;
        this.f246488c = b2s.m27972b(new oyn(this, 1, i));
        this.f246487b = be21.m28868a(new oyn(this, 0, i));
    }

    public vzn(pg51 pg51Var, ch51 ch51Var) {
        this.f246486a = 8;
        this.f246489d = pg51Var;
        int i = 8;
        this.f246488c = be21.m28868a(new s7o(this, 1, i));
        this.f246487b = be21.m28868a(new s7o(this, 0, i));
    }

    public vzn(jct0 jct0Var, ynh ynhVar, kct0 kct0Var, dcm0 dcm0Var) {
        this.f246486a = 1;
        this.f246489d = jct0Var;
        this.f246487b = dcm0Var;
        this.f246488c = b2s.m27972b(new tzn(this, 4));
    }

    public vzn(bat0 bat0Var, ikh ikhVar, cat0 cat0Var, dcm0 dcm0Var) {
        this.f246486a = 0;
        this.f246489d = bat0Var;
        this.f246487b = dcm0Var;
        this.f246488c = b2s.m27972b(new tzn(this, 2));
    }
}
