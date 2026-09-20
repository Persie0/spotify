package p204p;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.accountswitching.accountpickerimpl.AccountPickerActivity;
import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ErrorType;
import com.spotify.player.model.command.PlayAsNextInQueueCommand;
import com.spotify.player.model.command.SkipToPrevTrackCommand;
import com.spotify.player.model.command.options.SkipToPrevTrackOptions;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class c730 implements ly30, hu30, t6l0, Function, u150, w1j0, jgz0, Producer, SingleOnSubscribe, InterfaceC2207oa {

    /* JADX INFO: renamed from: c */
    public static final String[] f34731c = {"", "k", "m", "b", "t"};

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34732a;

    /* JADX INFO: renamed from: b */
    public Object f34733b;

    @Override // p204p.hu30
    /* JADX INFO: renamed from: a */
    public String mo31672a(float f, kb8 kb8Var) {
        return m31676f(f).concat("");
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        return ((fjf0) this.f34733b).f70257i0;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x012a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0134  */
    /* JADX WARN: Code duplicated, block: B:50:0x014d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0148 A[SYNTHETIC] */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        Iterator it;
        Object next;
        InterfaceC2415th interfaceC2415th;
        Object next2;
        switch (this.f34732a) {
            case 3:
                C2385sq c2385sq = (C2385sq) obj;
                C1681av c1681avMo39715f = ((InterfaceC1823eq) ((C2467uq) this.f34733b).f232865a.get()).mo39715f();
                return Observable.just(new C2544wq(c1681avMo39715f != null ? c1681avMo39715f.f20052a : null, c2385sq.f212976a, false));
            case 7:
                li7 li7Var = ((dz0) this.f34733b).f54468b;
                String str = ((g5y0) obj).f76785a;
                fv31 fv31Var = nc11.f152394b;
                lv31 lv31VarEdit = ((nc11) li7Var).f152396a.edit();
                if (str != null) {
                    lv31VarEdit.m60051d(fv31Var, str);
                } else {
                    lv31VarEdit.m60053f(fv31Var);
                }
                lv31VarEdit.m60054g();
                return m321.f139519a;
            case 8:
                return ((c41) this.f34733b).f33796a.mo39716g(((s31) obj).f205152b).ignoreElement().m23307y();
            case 10:
                Uri uri = Uri.parse(((oz1) obj).f171925a);
                jyx0 jyx0Var = (jyx0) ((twz0) this.f34733b).f224526c;
                wj50.m88279p(uri);
                return jyx0Var.m54823b(uri).onErrorReturnItem(uri).map(k8f0.f120348e);
            case 15:
                return Single.create(new qgj0((hv3) this.f34733b, 16));
            case 18:
                String strM91874w = xqg1.m91874w((String) ((ch4) this.f34733b).f37892B.getValue(), (v140) obj);
                return strM91874w == null ? "" : strM91874w;
            case 20:
                hd5 hd5Var = (hd5) this.f34733b;
                if (((Boolean) obj).booleanValue()) {
                    return new ObservableFromPublisher(hd5Var.f89998c.m23331J(k8f0.f120351h).m23331J(s0o0.f204464h).m23356t(Functions.f7225a));
                }
                lv31 lv31VarEdit2 = hd5Var.f90000e.edit();
                lv31VarEdit2.m60049b(hd5.f89992L0, hd5Var.f90005t);
                lv31VarEdit2.m60055h();
                Observable observableNever = Observable.never();
                wj50.m88279p(observableNever);
                return observableNever;
            case 22:
                String str2 = (String) obj;
                jr5 jr5Var = (jr5) this.f34733b;
                if (str2.length() == 0) {
                    return Single.just(new cr5(ErrorType.UNKNOWN));
                }
                return jr5Var.m54172d(jr5Var.f115086j.mo48412a(new w7p0(PlayAsNextInQueueCommand.create(Collections.singletonList(ContextTrack.create(str2))))), jr5Var.m54173e());
            case 25:
                r57 r57Var = (r57) obj;
                u57 u57Var = (u57) this.f34733b;
                u57Var.getClass();
                boolean zM82398a = u57.m82398a(r57Var);
                String str3 = r57Var.f195981c;
                Integer num = r57Var.f195980b;
                if (zM82398a || num == null || num.intValue() != 8) {
                    return r57Var;
                }
                xy9 xy9Var = u57Var.f226919e;
                xy9Var.getClass();
                String str4 = null;
                if (num != null && num.intValue() == 8) {
                    List list = (List) ((avo) ((InterfaceC2258pj) xy9Var.f267257a.get())).f20229f.getValue();
                    if (list.size() == 1) {
                        str4 = ((C1742ci) ((InterfaceC2415th) list.get(0))).f38159b;
                    } else if (str3 != null) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next2 = it2.next();
                                C1742ci c1742ci = (C1742ci) ((InterfaceC2415th) next2);
                                if (c1742ci.f38166i.m74362a() == null || !wj50.m88271j(c1742ci.f38166i.m74362a(), str3)) {
                                }
                            } else {
                                next2 = null;
                            }
                        }
                        InterfaceC2415th interfaceC2415th2 = (InterfaceC2415th) next2;
                        if (interfaceC2415th2 != null) {
                            str4 = ((C1742ci) interfaceC2415th2).f38159b;
                        } else {
                            it = list.iterator();
                            do {
                                if (it.hasNext()) {
                                    next = it.next();
                                } else {
                                    next = null;
                                }
                                interfaceC2415th = (InterfaceC2415th) next;
                                if (interfaceC2415th != null) {
                                    str4 = ((C1742ci) interfaceC2415th).f38159b;
                                }
                            } while (!wj50.m88271j(((C1742ci) ((InterfaceC2415th) next)).f38164g, Boolean.TRUE));
                            interfaceC2415th = (InterfaceC2415th) next;
                            if (interfaceC2415th != null) {
                                str4 = ((C1742ci) interfaceC2415th).f38159b;
                            }
                        }
                    } else {
                        it = list.iterator();
                        do {
                            if (it.hasNext()) {
                                next = it.next();
                            } else {
                                next = null;
                            }
                            interfaceC2415th = (InterfaceC2415th) next;
                            if (interfaceC2415th != null) {
                                str4 = ((C1742ci) interfaceC2415th).f38159b;
                            }
                        } while (!wj50.m88271j(((C1742ci) ((InterfaceC2415th) next)).f38164g, Boolean.TRUE));
                        interfaceC2415th = (InterfaceC2415th) next;
                        if (interfaceC2415th != null) {
                            str4 = ((C1742ci) interfaceC2415th).f38159b;
                        }
                    }
                }
                return str4 != null ? new r57(str4, str3, num, r57Var.f195982d) : r57Var;
            case 26:
                kc5 kc5Var = (kc5) this.f34733b;
                return ((jyx0) kc5Var.f121371g).m54823b(Uri.parse(((czd) obj).f43533a)).timeout(2L, TimeUnit.SECONDS, Single.error(new TimeoutException())).observeOn((Scheduler) kc5Var.f121369e).map(use.f233616i);
            case 28:
                uzx uzxVar = ((ya8) this.f34733b).f270832l;
                if (((Boolean) obj).booleanValue()) {
                    return ((c0y) uzxVar.f235651a.f246568h).m31200i(-15000L, C2244p5.f174033a);
                }
                c0y c0yVar = (c0y) uzxVar.f235651a.f246568h;
                c0yVar.getClass();
                return c0yVar.f32913j.mo48412a(new f8p0(SkipToPrevTrackCommand.builder().options(SkipToPrevTrackOptions.builder().allowSeeking(Boolean.TRUE).build()).build())).doOnSuccess(new yzx(c0yVar, 1));
            default:
                return (yr8) ((sn91) ((c97) this.f34733b).f35414c).invoke((ity) obj);
        }
    }

    @Override // p204p.ly30
    /* JADX INFO: renamed from: b */
    public String mo31673b(float f) {
        return m31676f(f).concat("");
    }

    @Override // p204p.jgz0
    /* JADX INFO: renamed from: c */
    public fiz mo24677c(String str, List list) {
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ruv ruvVar = (ruv) it.next();
            arrayList.add(new fc0(ruvVar.f202915a, new nu71(ruvVar.f202916b.f143675a), new nu71(ruvVar.f202917c.f143675a)));
        }
        return new nzx0(new C1977ig(((bua1) this.f34733b).f31074c, (fbk) null, arrayList, str));
    }

    @Override // p204p.u150
    /* JADX INFO: renamed from: d */
    public s150 mo31674d() {
        u150 u150Var;
        lwf lwfVar = (lwf) ((idd1) this.f34733b).f101071c.getValue();
        if (lwfVar == null || (u150Var = lwfVar.f137561e) == null) {
            return null;
        }
        return u150Var.mo31674d();
    }

    /* JADX INFO: renamed from: e */
    public void m31675e(char c) {
        if (c > 127) {
            throw new IllegalArgumentException("Can only match ASCII characters");
        }
        ((BitSet) this.f34733b).set(c);
    }

    /* JADX INFO: renamed from: f */
    public String m31676f(double d) {
        String str = ((DecimalFormat) this.f34733b).format(d);
        int numericValue = Character.getNumericValue(str.charAt(str.length() - 1));
        String strReplaceAll = str.replaceAll("E[0-9][0-9]", f34731c[Integer.valueOf(Character.getNumericValue(str.charAt(str.length() - 2)) + "" + numericValue).intValue() / 3]);
        while (true) {
            if (strReplaceAll.length() <= 5 && !strReplaceAll.matches("[0-9]+\\.[a-z]")) {
                return strReplaceAll;
            }
            strReplaceAll = strReplaceAll.substring(0, strReplaceAll.length() - 2) + strReplaceAll.substring(strReplaceAll.length() - 1);
        }
    }

    @Override // p204p.w1j0
    /* JADX INFO: renamed from: g */
    public v1j0 mo24517g(Intent intent, e301 e301Var) {
        h62.m46703a((h62) ((la2) this.f34733b).f131226b, null);
        return p1j0.f173119a;
    }

    @Override // com.spotify.mobius.functions.Producer
    public Object get() {
        return new SchedulerWorkRunner(((oj3) this.f34733b).f165941b);
    }

    /* JADX INFO: renamed from: h */
    public void m31677h(q2x q2xVar, q6a0 q6a0Var, d850 d850Var) {
        ws50 ws50Var = ((z53) this.f34733b).f279455b;
        int i = q6a0Var.f185712a;
        nw80 nw80Var = q6a0Var.f185720i;
        int iOrdinal = q2xVar.ordinal();
        if (iOrdinal == 0) {
            ws50Var.m88874a(new ss50(i, nw80Var));
        } else if (iOrdinal == 1) {
            ws50Var.m88874a(new us50(i, nw80Var));
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ws50Var.m88874a(new ts50(i, nw80Var, null, d850Var, 4));
        }
    }

    /* JADX INFO: renamed from: i */
    public void m31678i(char c, char c2) {
        while (c <= c2) {
            m31675e(c);
            c = (char) (c + 1);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m31679j() {
        ((wek0) this.f34733b).m87889c();
    }

    @Override // io.reactivex.rxjava3.core.SingleOnSubscribe
    public void subscribe(SingleEmitter singleEmitter) {
        bji bjiVar;
        bji bjiVar2;
        bji bjiVar3;
        switch (this.f34732a) {
            case 17:
                z84 z84Var = (z84) this.f34733b;
                fnk0 fnk0Var = z84Var.f280356g;
                if (fnk0Var == null || !fnk0Var.m42228h("android-gen-alpha-blocking.is_managed_account_allowlisting_requests_page_enabled")) {
                    bjiVar = fnk0Var;
                    bjiVar = z84Var.f280357h;
                }
                if (bjiVar != null) {
                }
                break;
            case 18:
            default:
                gi5 gi5Var = (gi5) this.f34733b;
                fnk0 fnk0Var2 = gi5Var.f80068r;
                if (fnk0Var2 == null || !fnk0Var2.m42228h("apps-music-libs-eventsender.rate_limiting_rule_1_events_per_time_unit")) {
                    bjiVar3 = fnk0Var2;
                    bjiVar3 = gi5Var.f80069s;
                }
                if (bjiVar3 != null) {
                }
                break;
            case 19:
                bl4 bl4Var = (bl4) this.f34733b;
                fnk0 fnk0Var3 = bl4Var.f28087l;
                if (fnk0Var3 == null || !fnk0Var3.m42228h("android-perf-tracking.jank_coordinator_enabled")) {
                    bjiVar2 = fnk0Var3;
                    bjiVar2 = bl4Var.f28088m;
                }
                if (bjiVar2 != null) {
                }
                break;
        }
    }

    @Override // p204p.t6l0
    /* JADX INFO: renamed from: x */
    public swd1 mo24684x(View view, swd1 swd1Var) {
        dx40 dx40VarMo51806g = swd1Var.f214650a.mo51806g(519);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = dx40VarMo51806g.f53849b;
        view.setLayoutParams(marginLayoutParams);
        nh61 nh61Var = ((AccountPickerActivity) this.f34733b).f2677e1;
        if (nh61Var == null) {
            wj50.m88260d0("binding");
            throw null;
        }
        RecyclerView recyclerView = (RecyclerView) nh61Var.f153886d;
        recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), dx40VarMo51806g.f53851d);
        return swd1.f214649b;
    }

    public /* synthetic */ c730(Object obj, int i) {
        this.f34732a = i;
        this.f34733b = obj;
    }

    public c730(RecyclerView recyclerView, rls0 rls0Var) {
        this.f34732a = 6;
        this.f34733b = rls0Var;
        recyclerView.setAdapter(rls0Var);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        cmp cmpVar = new cmp();
        cmpVar.f207636g = false;
        recyclerView.setItemAnimator(cmpVar);
        recyclerView.setClipToPadding(false);
        p3h1.m69032r(recyclerView, z90.f280625f);
    }
}
