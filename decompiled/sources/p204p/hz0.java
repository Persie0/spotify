package p204p;

import android.view.View;
import android.view.ViewGroup;
import com.comscore.streaming.ContentType;
import com.spotify.mobius.android.MobiusLoopViewModel;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.subjects.Subject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class hz0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f96756a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f96757b;

    public /* synthetic */ hz0(Object obj, int i) {
        this.f96756a = i;
        this.f96757b = obj;
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
    @Override // com.spotify.mobius.functions.Consumer
    public final void accept(Object obj) {
        Object obj2;
        int i = this.f96756a;
        Object obj3 = this.f96757b;
        switch (i) {
            case 0:
                fz0 fz0Var = (fz0) obj;
                MobiusLoopViewModel mobiusLoopViewModel = ((kz0) obj3).f127972O1;
                if (mobiusLoopViewModel != null) {
                    mobiusLoopViewModel.m15621f(fz0Var);
                    return;
                }
                return;
            case 1:
                ObservableEmitter observableEmitter = (ObservableEmitter) obj3;
                tu2 tu2Var = ((uu2) obj).f234083d;
                if (tu2Var instanceof pu2) {
                    observableEmitter.onNext(new ss2(((pu2) tu2Var).f181310a));
                    observableEmitter.onComplete();
                    return;
                } else {
                    if (tu2Var instanceof qu2) {
                        observableEmitter.onNext(new ts2(((qu2) tu2Var).f192546a));
                        observableEmitter.onComplete();
                        return;
                    }
                    return;
                }
            case 2:
                z4m z4mVar = (z4m) obj;
                zv41 zv41Var = ((zz2) obj3).f287864c;
                wj50.m88279p(z4mVar);
                zv41Var.getClass();
                zv41Var.m97091m(null, z4mVar);
                return;
            case 3:
                List<bq5> list = (List) obj;
                vg70 vg70Var = (vg70) ((iz5) obj3).f107136e;
                ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                for (bq5 bq5Var : list) {
                    arrayList.add(new l26(bq5Var.f29676a, bq5Var.f29677b, bq5Var.f29678c));
                }
                vg70Var.mo45325C(arrayList);
                return;
            case 4:
                un7 un7Var = (un7) obj;
                zv41 zv41Var2 = ((mn7) obj3).f145327d;
                wj50.m88279p(un7Var);
                zv41Var2.getClass();
                zv41Var2.m97091m(null, un7Var);
                return;
            case 5:
                ((C1747cn) obj3).accept((mif) obj);
                return;
            case 6:
                bxk bxkVar = (bxk) obj3;
                mwk mwkVar = ((pwk) obj).f182069a;
                bxkVar.f31881e.f237239a = mwkVar;
                oge0 oge0VarMo29871c = bxkVar.f31878b.mo29871c();
                ((b8x0) oge0VarMo29871c.f165108c).m28439b((String) oge0VarMo29871c.f165109d, new n6x0(mwkVar), mwk.class);
                ((vh50) oge0VarMo29871c.f165107b).pop();
                return;
            case 7:
                z4m z4mVar2 = (z4m) obj;
                zv41 zv41Var3 = ((b6m) obj3).f23991g;
                wj50.m88279p(z4mVar2);
                zv41Var3.getClass();
                zv41Var3.m97091m(null, z4mVar2);
                return;
            case 8:
                z4m z4mVar3 = (z4m) obj;
                zv41 zv41Var4 = ((q6m) obj3).f185858f;
                wj50.m88279p(z4mVar3);
                zv41Var4.getClass();
                zv41Var4.m97091m(null, z4mVar3);
                return;
            case 9:
                ((Subject) obj3).onNext(obj);
                return;
            case 10:
                xl90 xl90Var = (xl90) obj;
                hcx hcxVar = (hcx) obj3;
                xoi0 xoi0Var = hcxVar.f89923g;
                xoi0Var.mo33104m(xl90Var);
                if ((xl90Var instanceof ul90) && ((ul90) xl90Var).f231481a != null) {
                    hcxVar.m35106i();
                } else if (xl90Var instanceof sl90) {
                    hcxVar.m35105h(((sl90) xl90Var).f210324a);
                }
                xoi0Var.mo33104m(xl90Var);
                return;
            case 11:
                gj00 gj00Var = (gj00) obj3;
                gj00Var.m35106i();
                gj00Var.f80320h.mo33104m((av41) obj);
                return;
            case 12:
                uor uorVar = (uor) obj;
                cnh0 cnh0Var = (cnh0) ((b9k) obj3).f24955a;
                wj50.m88279p(uorVar);
                cnh0Var.f40027a.accept(uorVar);
                return;
            case 13:
                tf21 tf21Var = (tf21) obj;
                xp80 xp80Var = (xp80) obj3;
                zv41 zv41Var5 = xp80Var.f264533f;
                zv41 zv41Var6 = xp80Var.f264531d;
                if (!(tf21Var instanceof rf21)) {
                    if (tf21Var instanceof kf21) {
                        t3a0 t3a0Var = new t3a0((Throwable) ((kf21) tf21Var).f122047a.get(0));
                        zv41Var5.getClass();
                        zv41Var5.m97091m(null, t3a0Var);
                        return;
                    } else {
                        if (!(tf21Var instanceof sf21)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        sp80 sp80Var = new sp80();
                        zv41Var6.getClass();
                        zv41Var6.m97091m(null, sp80Var);
                        return;
                    }
                }
                int i2 = xp80Var.f264534g;
                rf21 rf21Var = (rf21) tf21Var;
                int i3 = rf21Var.f198494d;
                int i4 = rf21Var.f198495e;
                if (i2 < i4) {
                    xp80Var.f264532e.m97090l(rf21Var.f198491a);
                    xp80Var.f264534g = i4;
                }
                if (xp80Var.f264535h < i3) {
                    sp80 sp80Var2 = new sp80(i3, rf21Var.f198496f);
                    zv41Var6.getClass();
                    zv41Var6.m97091m(null, sp80Var2);
                    xp80Var.f264535h = i3;
                }
                m3a0 m3a0Var = new m3a0(w2a1.f247311a);
                zv41Var5.getClass();
                zv41Var5.m97091m(null, m3a0Var);
                return;
            case 14:
                gcx gcxVar = (gcx) obj;
                wl90 wl90Var = (wl90) obj3;
                if (!(gcxVar instanceof ubx)) {
                    t690 t690Var = wl90Var.f252494e;
                    wj50.m88279p(gcxVar);
                    t690Var.invoke(gcxVar);
                    return;
                } else {
                    p7x0 p7x0Var = wl90Var.f252495f;
                    if (p7x0Var != null) {
                        ubx ubxVar = (ubx) gcxVar;
                        p7x0Var.mo25060a(new hla0(ubxVar.f228897a), ubxVar.f228898b.f279709a);
                        return;
                    }
                    return;
                }
            case 15:
                ne20 ne20Var = (ne20) obj;
                hak0 hak0Var = (hak0) obj3;
                if (ne20Var instanceof le20) {
                    hak0Var.f89236d.setCollapsed(true);
                    return;
                }
                hak0Var.getClass();
                if (!(ne20Var instanceof me20)) {
                    throw new NoWhenBranchMatchedException();
                }
                me20 me20Var = (me20) ne20Var;
                cak0 cak0Var = new cak0(me20Var.f142574a, me20Var.f142575b, me20Var.f142576c, me20Var.f142577d, new CompletableFromAction(new jo10(hak0Var, 18)));
                up60 up60Var = hxt.f96286w;
                sx4 sx4Var = hak0Var.f89236d;
                hxt hxtVarM50020m = ia7.m50020m(sx4Var.getContext(), hak0Var.f89236d, hak0Var.f89233a, cak0Var, null, ContentType.LONG_FORM_ON_DEMAND);
                sx4Var.removeAllViews();
                View view = hxtVarM50020m.f96307t;
                sx4Var.addView(view);
                sx4Var.setCollapsed(false);
                if (hak0Var.f89234b) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.leftMargin = 0;
                    marginLayoutParams.rightMargin = 0;
                    pc0 pc0Var = hak0Var.f89237e;
                    qr60 qr60Var = hak0.f89232f[0];
                    marginLayoutParams.bottomMargin = ((Number) pc0Var.f61172a).intValue() - ((Number) hak0Var.f89235c.getValue()).intValue();
                    view.setLayoutParams(marginLayoutParams);
                    return;
                }
                return;
            case 16:
                ((ovf) obj3).mo2820d(obj);
                return;
            case 17:
                m72 m72Var = (m72) obj;
                zv41 zv41Var7 = ((vnn0) obj3).f243180a;
                wj50.m88279p(m72Var);
                zv41Var7.getClass();
                zv41Var7.m97091m(null, m72Var);
                return;
            case 18:
                m6s0 m6s0Var = (m6s0) obj;
                zv41 zv41Var8 = ((f7s0) obj3).f66790h;
                wj50.m88279p(m6s0Var);
                zv41Var8.getClass();
                zv41Var8.m97091m(null, m6s0Var);
                return;
            case 19:
                ((MobiusLoopViewModel) obj3).m15621f((ths0) obj);
                return;
            case 20:
                w3c1 w3c1Var = (w3c1) obj;
                wj50.m88279p(w3c1Var);
                ((kqi0) obj3).setValue(w3c1Var);
                return;
            case 21:
                as21 as21Var = (as21) obj;
                zv41 zv41Var9 = ((rr21) obj3).f201934e;
                if (as21Var instanceof yr21) {
                    obj2 = ((yr21) as21Var).f275372b;
                } else {
                    if (!wj50.m88271j(as21Var, zr21.f285528a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj2 = lau.f131415a;
                }
                zv41Var9.m97090l(obj2);
                return;
            case 22:
                vyp0 vyp0Var = (vyp0) obj;
                c851 c851Var = (c851) ((ycm0) obj3).f271529d;
                wj50.m88279p(vyp0Var);
                ((a951) c851Var).m25075e(vyp0Var);
                return;
            default:
                Map map = (Map) obj;
                a951 a951Var = (a951) obj3;
                zv41 zv41Var10 = a951Var.f13479f;
                wj50.m88279p(map);
                x851 x851Var = new x851(map);
                zv41Var10.getClass();
                zv41Var10.m97091m(null, x851Var);
                a951Var.f13476c.m33101j(map);
                return;
        }
    }
}
