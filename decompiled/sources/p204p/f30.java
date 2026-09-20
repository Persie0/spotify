package p204p;

import android.app.Activity;
import androidx.compose.p002ui.text.intl.LocaleList;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class f30 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f65325a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f65326b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f30(Object obj, int i) {
        super(0);
        this.f65325a = i;
        this.f65326b = obj;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        Observable observableM42227g;
        Observable observableObserveOn;
        Observable observableFlatMapSingle;
        ConnectableObservable connectableObservableReplay;
        Observable observableM42227g2;
        Observable observableObserveOn2;
        Observable observableFlatMapSingle2;
        ConnectableObservable connectableObservableReplay2;
        Observable observableM42227g3;
        Observable observableObserveOn3;
        Observable observableFlatMapSingle3;
        ConnectableObservable connectableObservableReplay3;
        Observable observableM42227g4;
        Observable observableObserveOn4;
        Observable observableFlatMapSingle4;
        ConnectableObservable connectableObservableReplay4;
        Observable observableM42227g5;
        Observable observableObserveOn5;
        Observable observableFlatMapSingle5;
        ConnectableObservable connectableObservableReplay5;
        Observable observableM42227g6;
        Observable observableObserveOn6;
        Observable observableFlatMapSingle6;
        ConnectableObservable connectableObservableReplay6;
        Observable observableM42227g7;
        Observable observableObserveOn7;
        Observable observableFlatMapSingle7;
        ConnectableObservable connectableObservableReplay7;
        Observable observableM42227g8;
        Observable observableObserveOn8;
        Observable observableFlatMapSingle8;
        ConnectableObservable connectableObservableReplay8;
        Observable observableM42227g9;
        Observable observableObserveOn9;
        Observable observableFlatMapSingle9;
        ConnectableObservable connectableObservableReplay9;
        int i = this.f65325a;
        int i2 = 2;
        int i3 = 17;
        int i4 = 13;
        int i5 = 0;
        w2a1 w2a1Var = w2a1.f247311a;
        int i6 = 1;
        Object obj = this.f65326b;
        switch (i) {
            case 0:
                return (y30) ((g30) obj).f76049Z.getValue();
            case 1:
                Activity activity = (Activity) obj;
                if (activity != null) {
                    activity.finishAffinity();
                }
                return w2a1Var;
            case 2:
                return ((ck2) obj).f38770i.mo54385a("martini");
            case 3:
                pn2 pn2Var = (pn2) obj;
                return ((njn) pn2Var.f179288b.get()).m64637a(new w62(pn2Var, i2));
            case 4:
                String strM34801c = ((a33) obj).f11830b.m34801c();
                if (strM34801c == null) {
                    strM34801c = "";
                }
                return pp91.m70529j(pft0.m69840u("cwp_autoplay_key", strM34801c));
            case 5:
                ((ya3) obj).f270743c.getClass();
                return new ea3();
            case 6:
                hv3 hv3Var = (hv3) obj;
                fnk0 fnk0Var = hv3Var.f95575d;
                return (fnk0Var == null || (observableM42227g = fnk0Var.m42227g()) == null || (observableObserveOn = observableM42227g.observeOn(Schedulers.f10370c)) == null || (observableFlatMapSingle = observableObserveOn.flatMapSingle(new c730(hv3Var, 15))) == null || (connectableObservableReplay = observableFlatMapSingle.replay(1)) == null) ? Observable.never() : connectableObservableReplay.m23778f();
            case 7:
                ay3 ay3Var = (ay3) obj;
                bji bjiVar = ay3Var.f21081l;
                if (bjiVar != null) {
                    return (ay3) bjiVar.mo29483e(new au3(ay3Var, i6));
                }
                return null;
            case 8:
                fy3 fy3Var = (fy3) obj;
                fnk0 fnk0Var2 = fy3Var.f74512c;
                return (fnk0Var2 == null || (observableM42227g2 = fnk0Var2.m42227g()) == null || (observableObserveOn2 = observableM42227g2.observeOn(Schedulers.f10370c)) == null || (observableFlatMapSingle2 = observableObserveOn2.flatMapSingle(new fj1(fy3Var, i4))) == null || (connectableObservableReplay2 = observableFlatMapSingle2.replay(1)) == null) ? Observable.never() : connectableObservableReplay2.m23778f();
            case 9:
                jfa0 jfa0VarM29060C = bga.m29060C(((oz3) obj).getConfiguration());
                if (jfa0VarM29060C.f111869a.f122114a.isEmpty()) {
                    jfa0VarM29060C = jfa0.m53163d(wjf1.m88307r());
                }
                int iM53165c = jfa0VarM29060C.m53165c();
                ArrayList arrayList = new ArrayList(iM53165c);
                while (i5 < iM53165c) {
                    Locale localeM53164b = jfa0VarM29060C.m53164b(i5);
                    wj50.m88279p(localeM53164b);
                    arrayList.add(new hfa0(localeM53164b));
                    i5++;
                }
                return new LocaleList(arrayList);
            case 10:
                m34 m34Var = (m34) obj;
                bji bjiVar2 = m34Var.f139522b;
                if (bjiVar2 != null) {
                    return (m34) bjiVar2.mo29483e(new au3(m34Var, i2));
                }
                return null;
            case 11:
                w44 w44Var = (w44) obj;
                bji bjiVar3 = w44Var.f247702e;
                if (bjiVar3 != null) {
                    return (w44) bjiVar3.mo29483e(new v44(w44Var, i5));
                }
                return null;
            case 12:
                w54 w54Var = (w54) obj;
                fnk0 fnk0Var3 = w54Var.f247990i;
                return (fnk0Var3 == null || (observableM42227g3 = fnk0Var3.m42227g()) == null || (observableObserveOn3 = observableM42227g3.observeOn(Schedulers.f10370c)) == null || (observableFlatMapSingle3 = observableObserveOn3.flatMapSingle(new hd41(w54Var, i4))) == null || (connectableObservableReplay3 = observableFlatMapSingle3.replay(1)) == null) ? Observable.never() : connectableObservableReplay3.m23778f();
            case 13:
                s84 s84Var = (s84) obj;
                bji bjiVar4 = s84Var.f206539c;
                if (bjiVar4 != null) {
                    return (s84) bjiVar4.mo29483e(new au3(s84Var, 3));
                }
                return null;
            case 14:
                z84 z84Var = (z84) obj;
                fnk0 fnk0Var4 = z84Var.f280356g;
                return (fnk0Var4 == null || (observableM42227g4 = fnk0Var4.m42227g()) == null || (observableObserveOn4 = observableM42227g4.observeOn(Schedulers.f10370c)) == null || (observableFlatMapSingle4 = observableObserveOn4.flatMapSingle(new az1(z84Var, i3))) == null || (connectableObservableReplay4 = observableFlatMapSingle4.replay(1)) == null) ? Observable.never() : connectableObservableReplay4.m23778f();
            case 15:
                b94 b94Var = (b94) obj;
                fnk0 fnk0Var5 = b94Var.f24761g;
                return (fnk0Var5 == null || (observableM42227g5 = fnk0Var5.m42227g()) == null || (observableObserveOn5 = observableM42227g5.observeOn(Schedulers.f10370c)) == null || (observableFlatMapSingle5 = observableObserveOn5.flatMapSingle(new ihj0(b94Var, 16))) == null || (connectableObservableReplay5 = observableFlatMapSingle5.replay(1)) == null) ? Observable.never() : connectableObservableReplay5.m23778f();
            case 16:
                d94 d94Var = (d94) obj;
                fnk0 fnk0Var6 = d94Var.f46665b;
                return (fnk0Var6 == null || (observableM42227g6 = fnk0Var6.m42227g()) == null || (observableObserveOn6 = observableM42227g6.observeOn(Schedulers.f10370c)) == null || (observableFlatMapSingle6 = observableObserveOn6.flatMapSingle(new hd41(d94Var, 14))) == null || (connectableObservableReplay6 = observableFlatMapSingle6.replay(1)) == null) ? Observable.never() : connectableObservableReplay6.m23778f();
            case 17:
                ib4 ib4Var = (ib4) obj;
                bji bjiVar5 = ib4Var.f100430b;
                if (bjiVar5 != null) {
                    return (ib4) bjiVar5.mo29483e(new au3(ib4Var, 4));
                }
                return null;
            case 18:
                gd4 gd4Var = (gd4) obj;
                bji bjiVar6 = gd4Var.f78724b;
                if (bjiVar6 != null) {
                    return (gd4) bjiVar6.mo29483e(new au3(gd4Var, 6));
                }
                return null;
            case 19:
                yf4 yf4Var = (yf4) obj;
                bji bjiVar7 = yf4Var.f272120f;
                if (bjiVar7 != null) {
                    return (yf4) bjiVar7.mo29483e(new ef4(yf4Var, 11));
                }
                return null;
            case 20:
                eh4 eh4Var = (eh4) obj;
                fnk0 fnk0Var7 = eh4Var.f59494l;
                return (fnk0Var7 == null || (observableM42227g7 = fnk0Var7.m42227g()) == null || (observableObserveOn7 = observableM42227g7.observeOn(Schedulers.f10370c)) == null || (observableFlatMapSingle7 = observableObserveOn7.flatMapSingle(new c961(eh4Var, i3))) == null || (connectableObservableReplay7 = observableFlatMapSingle7.replay(1)) == null) ? Observable.never() : connectableObservableReplay7.m23778f();
            case 21:
                yk4 yk4Var = (yk4) obj;
                bji bjiVar8 = yk4Var.f273566b;
                if (bjiVar8 != null) {
                    return (yk4) bjiVar8.mo29483e(new nj4(yk4Var, i4));
                }
                return null;
            case 22:
                bl4 bl4Var = (bl4) obj;
                fnk0 fnk0Var8 = bl4Var.f28087l;
                return (fnk0Var8 == null || (observableM42227g8 = fnk0Var8.m42227g()) == null || (observableObserveOn8 = observableM42227g8.observeOn(Schedulers.f10370c)) == null || (observableFlatMapSingle8 = observableObserveOn8.flatMapSingle(new az1(bl4Var, 19))) == null || (connectableObservableReplay8 = observableFlatMapSingle8.replay(1)) == null) ? Observable.never() : connectableObservableReplay8.m23778f();
            case 23:
                cp4 cp4Var = (cp4) obj;
                bji bjiVar9 = cp4Var.f40441y;
                if (bjiVar9 != null) {
                    return (cp4) bjiVar9.mo29483e(new au3(cp4Var, 8));
                }
                return null;
            case 24:
                hu4 hu4Var = (hu4) obj;
                if (hu4Var.f95276e && hu4Var.isAttachedToWindow() && hu4Var.getView().getParent() == hu4Var) {
                    hu4Var.getSnapshotObserver().f108103a.m61344d(hu4Var, qm4.f190058d, hu4Var.getUpdate());
                }
                return w2a1Var;
            case 25:
                gi5 gi5Var = (gi5) obj;
                fnk0 fnk0Var9 = gi5Var.f80068r;
                return (fnk0Var9 == null || (observableM42227g9 = fnk0Var9.m42227g()) == null || (observableObserveOn9 = observableM42227g9.observeOn(Schedulers.f10370c)) == null || (observableFlatMapSingle9 = observableObserveOn9.flatMapSingle(new ei5(gi5Var, i5))) == null || (connectableObservableReplay9 = observableFlatMapSingle9.replay(1)) == null) ? Observable.never() : connectableObservableReplay9.m23778f();
            case 26:
                yau0 yau0VarM92984c = ((y74) ((rh7) obj).f199158d.f250163d).m92984c();
                yau0 yau0Var = yau0.f271015d;
                return nhg1.m64495o(onq0.m67421e(yau0VarM92984c, t46.m80039c()));
            case 27:
                luk lukVar = ((fz9) obj).f74946d;
                x461 x461VarM64613f = njg1.m64613f();
                lukVar.getClass();
                return cct.m32296A(lukVar, x461VarM64613f);
            case 28:
                return (Set) ((mz9) obj).f148654a.get();
            default:
                whr0 whr0Var = whr0.f251426i;
                cvf1.m34048k().f251432f.mo31988d(((o2a) obj).f161005i);
                return w2a1Var;
        }
    }
}
