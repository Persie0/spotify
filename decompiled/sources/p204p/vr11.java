package p204p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.protobuf.AbstractC0269h;
import com.spotify.music.R;
import com.spotify.prefs.esperanto.proto.EsPrefs$PrefValues;
import com.spotify.prefs.esperanto.proto.EsPrefs$SetParams;
import com.spotify.support.assertion.Assertion$RecoverableAssertionError;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes4.dex */
public final class vr11 implements Function, InterfaceC2207oa, SingleOnSubscribe, w111, pqa0, InterfaceC1667ah, ant, wb71, BiFunction, pc81 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f244049a;

    /* JADX INFO: renamed from: b */
    public Object f244050b;

    public /* synthetic */ vr11(Object obj, int i) {
        this.f244049a = i;
        this.f244050b = obj;
    }

    @Override // p204p.wb71
    /* JADX INFO: renamed from: a */
    public float mo81103a(StringBuilder sb) {
        return ((TextPaint) this.f244050b).measureText(sb, 0, sb.length());
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        return ((r741) this.f244050b).m74888c(((ihi) obj).f102294a);
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        ni00 ni00Var = (ni00) ((a531) this.f244050b).f12416d;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(gyf1.m46158x((o0a) it.next(), ((Boolean) ni00Var.invoke()).booleanValue()));
        }
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(gyf1.m46159y((fzd1) it2.next(), ((Boolean) ni00Var.invoke()).booleanValue()));
        }
        return g6f.m43700N0(arrayList2, arrayList);
    }

    /* JADX INFO: renamed from: b */
    public a021 m86259b() {
        return new a021(this);
    }

    /* JADX INFO: renamed from: c */
    public View m86260c(int i) {
        if (i == 0) {
            return new View(((o081) this.f244050b).f160270f.f149687a.getContext());
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m86261d(int i) {
        if (i == 0) {
            o081 o081Var = (o081) this.f244050b;
            if (o081Var.f160273i) {
                return;
            }
            o081Var.f160270f.f149698l = true;
            o081Var.f160273i = true;
        }
    }

    @Override // p204p.pqa0
    /* JADX INFO: renamed from: e */
    public void mo37400e(String str, String str2) {
        ((ky61) this.f244050b).mo53808b(h15.m46399f('V', str, str2, null));
    }

    /* JADX INFO: renamed from: f */
    public void m86262f(int i) {
        hv90 hv90Var = (hv90) this.f244050b;
        if (hv90Var != null) {
            hv90Var.mo48758x(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public Object m86263g(eo01 eo01Var, ibk ibkVar) {
        mg51 mg51Var;
        if (ibkVar instanceof mg51) {
            mg51Var = (mg51) ibkVar;
            int i = mg51Var.f143334c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mg51Var.f143334c = i - Integer.MIN_VALUE;
            } else {
                mg51Var = new mg51(this, ibkVar);
            }
        } else {
            mg51Var = new mg51(this, ibkVar);
        }
        Object objMo56307a = mg51Var.f143332a;
        int i2 = mg51Var.f143334c;
        if (i2 == 0) {
            bga.m29073P(objMo56307a);
            Parcelable parcelable = (Parcelable) zn91.m96523K(eo01Var.f61265b, "storytelling.share.loader_params", Parcelable.class);
            if (parcelable != null) {
                Object obj = ((Map) this.f244050b).get(parcelable.getClass());
                kg51 kg51Var = obj instanceof kg51 ? (kg51) obj : null;
                if (kg51Var != null) {
                    mg51Var.f143334c = 1;
                    objMo56307a = kg51Var.mo56307a(parcelable, mg51Var);
                    yuk yukVar = yuk.f276404a;
                    if (objMo56307a == yukVar) {
                        return yukVar;
                    }
                }
            }
            return null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bga.m29073P(objMo56307a);
        return (List) objMo56307a;
    }

    /* JADX INFO: renamed from: h */
    public void m86264h(Uri uri) {
        ((j2r) this.f244050b).f108129c = uri;
    }

    @Override // p204p.pqa0
    /* JADX INFO: renamed from: k */
    public void mo37402k(String str, String str2, Throwable th) {
        ((ky61) this.f244050b).mo53808b(h15.m46399f('V', str, str2, th));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.w111
    /* JADX INFO: renamed from: l */
    public Object mo28227l(eo01 eo01Var, fbk fbkVar) {
        lg51 lg51Var;
        String string;
        e2r e2rVar;
        String str;
        if (fbkVar instanceof lg51) {
            lg51Var = (lg51) fbkVar;
            int i = lg51Var.f133096e;
            if ((i & Integer.MIN_VALUE) != 0) {
                lg51Var.f133096e = i - Integer.MIN_VALUE;
            } else {
                lg51Var = new lg51(this, (ibk) fbkVar);
            }
        } else {
            lg51Var = new lg51(this, (ibk) fbkVar);
        }
        Object obj = lg51Var.f133094c;
        int i2 = lg51Var.f133096e;
        if (i2 == 0) {
            bga.m29073P(obj);
            e2r e2rVar2 = (e2r) zn91.m96523K(eo01Var.f61265b, "storytelling.share.destination_list_configuration", e2r.class);
            if (e2rVar2 == null || (string = eo01Var.f61265b.getString("storytelling.share.integration_id")) == null) {
                return null;
            }
            lg51Var.f133092a = e2rVar2;
            lg51Var.f133093b = string;
            lg51Var.f133096e = 1;
            Object objM86263g = m86263g(eo01Var, lg51Var);
            Object obj2 = yuk.f276404a;
            if (objM86263g == obj2) {
                return obj2;
            }
            e2rVar = e2rVar2;
            obj = objM86263g;
            str = string;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = lg51Var.f133093b;
            e2rVar = lg51Var.f133092a;
            bga.m29073P(obj);
        }
        List list = (List) obj;
        if (list == null) {
            return null;
        }
        return new e211(list, 0, new gji(new ku01(e2rVar)), str);
    }

    @Override // p204p.InterfaceC1667ah
    /* JADX INFO: renamed from: q */
    public boolean mo1561q(View view) {
        ((r7q) this.f244050b).invoke(aq81.f18139d);
        return true;
    }

    @Override // io.reactivex.rxjava3.core.SingleOnSubscribe
    public void subscribe(SingleEmitter singleEmitter) {
        singleEmitter.onSuccess(((y74) ((C2529wd) this.f244050b).f250163d).m92984c().f271016a.f126991e);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        Drawable drawableM34032e;
        pqm0 pqm0Var = (pqm0) obj;
        hv81 hv81Var = (hv81) this.f244050b;
        String str = (String) pqm0Var.f180350a;
        fw81 fw81Var = (fw81) pqm0Var.f180351b;
        ImageView imageView = hv81Var.f95630h;
        e940 e940Var = hv81Var.f95626d;
        Context context = hv81Var.f95628f;
        int iOrdinal = fw81Var.ordinal();
        if (iOrdinal == 0) {
            drawableM34032e = cve0.m34032e(context, R.drawable.encore_icon_podcasts, 4, 16);
        } else if (iOrdinal != 1) {
            return;
        } else {
            drawableM34032e = cve0.m34032e(context, R.drawable.encore_icon_audiobook, 0, 20);
        }
        e940Var.mo24607c(imageView);
        lxe lxeVarMo24613j = e940Var.mo24613j(str);
        lxeVarMo24613j.m60187m(drawableM34032e);
        lxeVarMo24613j.m60180f(drawableM34032e);
        int i = hv81Var.f95629g;
        lxeVarMo24613j.m60190p(i, i, 1);
        lxeVarMo24613j.m60178d();
        lxeVarMo24613j.m60191q(String.valueOf(qpv0.f191387a.mo54112b(hv81.class).mo29111F()));
        qv81 qv81Var = hv81Var.f95616L0;
        sv81 sv81Var = (sv81) imageView.getTag(R.id.picasso_target);
        if (sv81Var == null) {
            sv81Var = new sv81(imageView, qv81Var);
            imageView.setTag(R.id.picasso_target, sv81Var);
        } else {
            sv81Var.f214363b = qv81Var;
        }
        hv81Var.f95617M0 = sv81Var;
        lxeVarMo24613j.m60184j(sv81Var);
    }

    @Override // p204p.pc81
    /* JADX INFO: renamed from: u */
    public lkv0 mo45105u(ViewGroup viewGroup, Object obj, t9p0 t9p0Var, gxj0 gxj0Var) {
        ggb1 ggb1Var = (ggb1) this.f244050b;
        hsb1 hsb1Var = ggb1Var.f79628a;
        kac1 kac1VarM85161g = ggb1Var.f79629b.m85161g();
        return new isb1(((itb1) hsb1Var.f94654b).m51626a(), (ulp) hsb1Var.f94655c, (iac1) hsb1Var.f94658f, (e940) hsb1Var.f94656d, (Scheduler) hsb1Var.f94659g, (hgc) hsb1Var.f94660h, false, kac1VarM85161g, v8k.NOW_PLAYING_VIEW_VERTICAL_PORTRAIT, (hc80) hsb1Var.f94657e, viewGroup);
    }

    public vr11(int i) {
        this.f244049a = i;
        switch (i) {
            case 3:
                break;
            default:
                this.f244050b = new j2r();
                break;
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        p3x0 p3x0Var;
        Single singleJust;
        kyu0 kyu0Var;
        switch (this.f244049a) {
            case 2:
                Throwable th = (Throwable) obj;
                if (th instanceof HttpException) {
                    o2x0 o2x0Var = ((HttpException) th).f288166c;
                    if (o2x0Var != null && (p3x0Var = o2x0Var.f161173c) != null) {
                        AbstractC0269h abstractC0269hM74432b = ((r110) ((r2n0) this.f244050b)).m74432b(p3x0Var.m69091a(), r110.f194681b);
                        if (abstractC0269hM74432b != null && (singleJust = Single.just(abstractC0269hM74432b)) != null) {
                            return singleJust;
                        }
                    }
                    return Single.error(th);
                }
                Single singleError = Single.error(th);
                wj50.m88279p(singleError);
                return singleError;
            case 4:
                String str = (String) obj;
                r331 r331Var = (r331) this.f244050b;
                return vjf1.m85770t(dau.f47107a, new vx01(r331Var, str, null, 21)).map(new nch1(r331Var, str)).doOnError(new e03(str, 10));
            case 5:
                pua0 pua0Var = (pua0) obj;
                rk7 rk7Var = pua0Var.f181398d;
                w0b0 w0b0Var = pua0Var.f181397c;
                if (w0b0Var == null || rk7Var == null) {
                    kyu0Var = null;
                } else {
                    tyu0 tyu0Var = ((n531) this.f244050b).f150477a;
                    kyu0Var = new kyu0(tyu0Var.f225056n, tyu0Var.m82009d(ez0.m40327a(w0b0Var), rk7Var.name()));
                }
                return ((Single) pua0Var.f181396b.f122317t.invoke(pua0Var.f181395a, kyu0Var)).map(new kq11(pua0Var, 4)).onErrorReturn(olr0.f166882O0);
            case 12:
                if (((EsPrefs$PrefValues) obj).m19515o() == ((EsPrefs$SetParams) this.f244050b).m19519o()) {
                    return CompletableEmpty.f7437a;
                }
                return Completable.m23286j(new Assertion$RecoverableAssertionError("Failed to save ContextPlayerConfiguration preferences", (String) null));
            case 15:
                lcf lcfVar = (lcf) obj;
                if (lcfVar instanceof icf) {
                    cv71 cv71Var = (cv71) this.f244050b;
                    return cv71Var.f42330c.mo48412a(new x7p0(cv71Var.f42329b, false));
                }
                return Single.just(lcfVar);
            case 17:
                Map map = (Map) obj;
                String str2 = (String) ((rok0) this.f244050b).f201282b;
                if (map.get(str2) == null) {
                    return new y5f(false, false, false);
                }
                Object obj2 = map.get(str2);
                wj50.m88279p(obj2);
                return (y5f) obj2;
            case 23:
                jmt0 jmt0Var = (jmt0) obj;
                return dvg1.m37113o(((k6a1) this.f244050b).f119706a, "up-next-card", jmt0Var.f113946c, j6a1.f109266h).filter(fkr0.f70594T0).map(hkr0.f92483U0).onErrorReturn(new kq11(jmt0Var, 24));
            default:
                x1p0 x1p0Var = (x1p0) this.f244050b;
                return n0e1.m63407O((luk) x1p0Var.f257249d, new w9a1(x1p0Var, (nd3) obj, (fbk) null, 10));
        }
    }
}
