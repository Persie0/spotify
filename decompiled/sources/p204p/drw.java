package p204p;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.mdata.cosmos.proto.InvalidateCacheRequest;
import com.spotify.music.R;
import com.spotify.player.model.command.SkipToPrevTrackCommand;
import com.spotify.yourlibrary.uiusecases.filterrow.chips.LibraryChipsView;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.mixed.CompletableAndThenObservable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class drw implements wh00, ant, Function, x920, Predicate, im6, mu61, pal0, hbb {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52399a;

    /* JADX INFO: renamed from: b */
    public final Object f52400b;

    public /* synthetic */ drw(Object obj, int i) {
        this.f52399a = i;
        this.f52400b = obj;
    }

    /* JADX INFO: renamed from: d */
    public static String m36739d(Intent intent) {
        String string;
        Bundle extras = intent.getExtras();
        String str = "";
        if (extras != null && (string = extras.getString("query", "")) != null) {
            str = string;
        }
        return "spotify://search/".concat(str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public Object m36740a(String str, k8j0 k8j0Var, ibk ibkVar) {
        bb10 bb10Var;
        if (ibkVar instanceof bb10) {
            bb10Var = (bb10) ibkVar;
            int i = bb10Var.f25385e;
            if ((i & Integer.MIN_VALUE) != 0) {
                bb10Var.f25385e = i - Integer.MIN_VALUE;
            } else {
                bb10Var = new bb10(this, ibkVar);
            }
        } else {
            bb10Var = new bb10(this, ibkVar);
        }
        Object objM95890h = bb10Var.f25383c;
        int i2 = bb10Var.f25385e;
        if (i2 == 0) {
            bga.m29073P(objM95890h);
            zby zbyVar = (zby) this.f52400b;
            bb10Var.f25381a = k8j0Var;
            bb10Var.f25382b = str;
            bb10Var.f25385e = 1;
            objM95890h = zbyVar.m95890h(str, bb10Var);
            yuk yukVar = yuk.f276404a;
            if (objM95890h == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = bb10Var.f25382b;
            k8j0Var = bb10Var.f25381a;
            bga.m29073P(objM95890h);
        }
        return new hee0(str, (xce0) objM95890h, oee0.f164407a, k8j0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.wh00, io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        Single singleJust;
        Observable observableFlatMapObservable;
        tu40 tu40VarM86410b;
        int i = this.f52399a;
        int i2 = 19;
        boolean z = true;
        z = true;
        Object obj2 = this.f52400b;
        switch (i) {
            case 0:
                hrw hrwVar = (hrw) obj2;
                return hrwVar.m48413b(new xcw(7, SkipToPrevTrackCommand.create(), hrwVar)).flatMap(new brw(hrwVar, z ? 1 : 0));
            case 2:
                rqw rqwVar = (rqw) ((bi1) obj2).f27309b;
                String str = ((qu90) obj).f192609a;
                u9f0 u9f0Var = rqwVar.f201899a;
                rl50 rl50VarM13429q = InvalidateCacheRequest.m13429q();
                rl50VarM13429q.m75813q(str);
                rl50VarM13429q.m75814r(ntx.LIVESTREAM_ENTITY);
                return u9f0Var.callSingle("spotify.mdata_esperanto.proto.MetadataService", "Expire", (InvalidateCacheRequest) rl50VarM13429q.build()).map(uty.f234007L0).ignoreElement().m23294e(Single.just(pv90.f181672a));
            case 4:
                return azx.m27700a((azx) obj2, (roa) obj);
            case 5:
                uv11 uv11Var = uv11.f234312b;
                Set setM77306i0 = s601.m77306i0(uv11Var);
                if (!((Boolean) obj).booleanValue()) {
                    xt80 xt80Var = (xt80) obj2;
                    if (((xt80Var != null ? xt80Var.f265798f : 0) == 5) == false) {
                        z = false;
                    }
                }
                uv11 uv11Var2 = uv11.f234311a;
                if (z) {
                    setM77306i0.add(uv11Var2);
                }
                if (z) {
                    uv11Var = uv11Var2;
                }
                return new wv11(setM77306i0, uv11Var, z);
            case 6:
                return new gwe1(new y3k0(((jve1) obj2).f116342c, (w0k0) obj));
            case 14:
                return ((f120) obj2).f64767a.m43317a(((to9) obj).f222204b).onErrorReturnItem(new kg60()).toObservable();
            case 15:
                ((ax7) obj2).getClass();
                return Boolean.valueOf(((tzi) obj) instanceof szi);
            case 18:
                return new CompletableFromAction(new h331((j331) obj2, (String) obj, 1));
            case 19:
                vu40 vu40Var = (vu40) obj;
                kc5 kc5Var = (kc5) obj2;
                boolean z2 = vu40Var instanceof tu40;
                if (((z2 && ((tu40) vu40Var).f223761a) || !vu40Var.mo81548a()) && !vu40Var.mo81553g()) {
                    if (z2) {
                        tu40VarM86410b = (tu40) vu40Var;
                    } else {
                        if (!(vu40Var instanceof uu40)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        tu40VarM86410b = vu40Var.m86410b(false);
                    }
                    return Flowable.m23313I(tu40VarM86410b);
                }
                String contextUri = vu40Var.getContextUri();
                String strMo81549c = vu40Var.mo81549c();
                if (strMo81549c == null) {
                    strMo81549c = vu40Var.getUri();
                }
                if (vu40Var.mo81552f()) {
                    observableFlatMapObservable = ((fj1) kc5Var.f121370f).m41781e(contextUri).m74990q().map(b0y.f22148g);
                } else {
                    Set set = dd41.f47702f;
                    if (r46.m74726U(strMo81549c).f47709c == gn80.TRACK) {
                        singleJust = ((dn81) kc5Var.f121371g).mo36056a(Collections.singletonList(strMo81549c));
                    } else {
                        singleJust = Single.just(Collections.singletonList(strMo81549c));
                        wj50.m88279p(singleJust);
                    }
                    observableFlatMapObservable = singleJust.flatMapObservable(new tey(19, kc5Var, contextUri));
                    wj50.m88279p(observableFlatMapObservable);
                }
                return Observable.combineLatest(observableFlatMapObservable, ((i431) kc5Var.f121366b).m49650i(vu40Var.getUid(), vu40Var.getUri(), vu40Var.getContextUri(), Boolean.valueOf(vu40Var.mo81553g())), new u6x(vu40Var, 22)).distinctUntilChanged().toFlowable(BackpressureStrategy.f7190d).m23334N(vu40Var.m86410b(false));
            case 20:
                xul0 xul0Var = (xul0) obj;
                vxx vxxVar = (vxx) obj2;
                vxxVar.getClass();
                String strMo26695k = xul0Var.mo49279c() ? ((api) xul0Var.mo49278b()).mo26695k() : "";
                kv91 kv91Var = (kv91) vxxVar.f245849b;
                yt91 yt91VarM96903c = ((hih0) vxxVar.f245852e).f91822b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("play_on_device_button", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                dv91 dv91Var = new dv91("hit", 1);
                String string = strMo26695k != null ? strMo26695k.toString() : null;
                z650 z650Var = kv91Var.mo57453r(new av91("", "", dv91Var, new bv91("disconnect_from_remote_device", 1, Collections.singletonMap("remote_device_id", string != null ? string : "")), zt91VarM94607a, st91.f213865b, System.currentTimeMillis()), null).f46380a;
                if (!xul0Var.mo49279c() || ((api) xul0Var.mo49278b()).mo26697m()) {
                    return Single.just(z650Var);
                }
                r7p.m74953j((r7p) vxxVar.f245850c, z650Var.f279709a, 6);
                return ((s5p) ((voi) vxxVar.f245851d)).m77297d().filter(lby.f131774g).firstOrError().timeout(10L, TimeUnit.SECONDS, (Scheduler) vxxVar.f245853f).map(new oc50(0, z650Var));
            case 23:
                Integer num = (Integer) obj;
                Map map = (Map) ((wg61) ((s18) obj2).f204626h).getValue();
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = (String) entry.getKey();
                    int iIntValue = ((Number) entry.getValue()).intValue();
                    arrayList.add(new kkz0(new u670(iIntValue, str2), iIntValue == num.intValue()));
                }
                return arrayList;
            case 25:
                zyx zyxVar = zyx.f287722t;
                px20 px20Var = (px20) obj;
                n380 n380Var = (n380) obj2;
                y980 y980Var = n380Var.f149960c;
                boolean z3 = px20Var.f182188a;
                boolean z4 = px20Var.f182189b;
                boolean z5 = px20Var.f182190c;
                hqe1 hqe1Var = n380Var.f149959b;
                boolean zM48246e = hqe1Var.m48246e();
                boolean zM48257p = hqe1Var.m48257p();
                boolean zM48238I = hqe1Var.m48238I();
                boolean zM48261t = hqe1Var.m48261t();
                int i3 = 15;
                dau dauVar = dau.f47107a;
                String str3 = "library-import-transfer-results-banner-visible";
                if (!zM48246e && !zM48257p && !zM48238I) {
                    return zM48261t ? k0e1.m54988g(new e560(i3, mvl0.m62953p(new va3(y980Var.f270528a.f242953a, str3, i2)), y980Var), dauVar).map(zyxVar) : Observable.just(lau.f131415a);
                }
                Completable completableM23303t = z3 ? Completable.m23287k(new m380(n380Var, zM48246e, zM48257p, zM48238I)).m23303t(n380Var.f149961d) : CompletableEmpty.f7437a;
                wj50.m88279p(completableM23303t);
                CompletableAndThenObservable completableAndThenObservableM23293d = completableM23303t.m23293d(Observable.combineLatest(n380Var.m63591d(n380.f149953k), n380Var.m63591d(n380.f149954l), n380Var.m63591d(n380.f149955m), n380Var.m63591d(n380.f149956n), new l380(n380Var, z3, z4, z5)).map(new csy(n380Var, 16)));
                if (zM48261t) {
                    return Observable.combineLatest(completableAndThenObservableM23293d, k0e1.m54988g(new e560(15, mvl0.m62953p(new va3(y980Var.f270528a.f242953a, str3, 19)), y980Var), dauVar).map(zyxVar), dzx.f54793i);
                }
                return completableAndThenObservableM23293d;
            default:
                return new he80(false, (ny5) obj2, ((List) obj).size());
        }
    }

    @Override // p204p.hbb
    public Object attachCompleter(gbb gbbVar) {
        hw80 hw80Var = (hw80) this.f52400b;
        wj50.m88281r("The result can only set once!", hw80Var.f95886f == null);
        hw80Var.f95886f = gbbVar;
        return "ListFuture[" + this + "]";
    }

    @Override // p204p.x920
    /* JADX INFO: renamed from: b */
    public Object mo36147b(Object obj) {
        return Integer.valueOf(((aqx) obj).mo26904b());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [p.gh00, p.qe70] */
    @Override // p204p.pal0
    /* JADX INFO: renamed from: c */
    public void mo36741c() {
        ?? r0;
        LibraryChipsView libraryChipsView = (LibraryChipsView) this.f52400b;
        if ((!libraryChipsView.m23255x367d7863() || libraryChipsView.f7130X0.compareAndSet(false, true)) && (r0 = libraryChipsView.f7128V0) != 0) {
            r0.invoke(j5z.f109160b);
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m36742e(Intent intent) {
        String strM75246h = ((rc9) this.f52400b).m75246h(intent);
        return "android.intent.action.SEARCH".equals(intent.getAction()) && strM75246h != null && wl51.m88496t0(strM75246h, "com.google.android.googlequicksearchbox", false);
    }

    /* JADX INFO: renamed from: f */
    public void m36743f(SparseArray sparseArray) {
        sparseArray.getClass();
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            qj30 qj30Var = (qj30) sparseArray.valueAt(i);
            if (qj30Var == null) {
                throw new IllegalArgumentException(s571.m77246e(iKeyAt, "Null binder for id "));
            }
            if (iKeyAt <= 0) {
                throw new IllegalArgumentException("Illegal id registered: " + iKeyAt + "=" + String.valueOf(qj30Var) + " (only positive IDs are allowed");
            }
            ((SparseArray) this.f52400b).put(iKeyAt, qj30Var);
        }
    }

    @Override // p204p.x920
    /* JADX INFO: renamed from: g */
    public Iterator mo36148g() {
        return ((Iterable) this.f52400b).iterator();
    }

    @Override // p204p.mu61
    public void onSuccess() {
        ((yln0) this.f52400b).m94172a(null);
    }

    @Override // p204p.mu61
    /* JADX INFO: renamed from: p */
    public void mo25096p(Exception exc) {
        ((yln0) this.f52400b).m94172a(-1);
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        int i = this.f52399a;
        Object obj2 = this.f52400b;
        switch (i) {
            case 1:
                z3x z3xVar = (z3x) obj;
                s8p s8pVar = (s8p) obj2;
                wj50.m88279p(z3xVar);
                String str = z3xVar.f279050c;
                String str2 = z3xVar.f279053f;
                Context context = (Context) s8pVar.f206695c;
                sdo sdoVar = (sdo) s8pVar.f206698f;
                if (s8pVar.f206694b) {
                    ((TextView) sdoVar.f208053g).setText(String.format(context.getResources().getString(R.string.event_day_and_time), Arrays.copyOf(new Object[]{str2, z3xVar.f279054g}, 2)));
                    return;
                } else if (wj50.m88271j((x3x) s8pVar.f206696d, w3x.f247659a)) {
                    ((TextView) sdoVar.f208053g).setText(String.format(context.getResources().getString(R.string.event_row_subtitle), Arrays.copyOf(new Object[]{str, ""}, 2)));
                    return;
                } else {
                    ((TextView) sdoVar.f208053g).setText(String.format(context.getResources().getString(R.string.event_row_subtitle), Arrays.copyOf(new Object[]{str2, ""}, 2)));
                    return;
                }
            default:
                c170 c170Var = (c170) obj2;
                vxx vxxVar = (vxx) c170Var.f33007d;
                int iOrdinal = ((inc1) obj).ordinal();
                if (iOrdinal == 0) {
                    c170Var.m31246b();
                    ((EncoreButton) vxxVar.f245854g).setEnabled(false);
                    return;
                }
                if (iOrdinal == 1) {
                    c170Var.m31246b();
                    ((EncoreButton) vxxVar.f245854g).setEnabled(true);
                    return;
                }
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                EncoreTextView encoreTextView = (EncoreTextView) vxxVar.f245851d;
                EditText editText = (EditText) vxxVar.f245850c;
                encoreTextView.setVisibility(0);
                editText.setTextColor(-65536);
                Resources resources = ((FrameLayout) vxxVar.f245849b).getResources();
                ThreadLocal threadLocal = u1x0.f225931a;
                editText.setBackground(ex60.m40184r(resources, R.drawable.edittext_input_error_bg, null));
                ((EncoreTextView) vxxVar.f245851d).performAccessibilityAction(64, null);
                ((EncoreButton) vxxVar.f245854g).setEnabled(false);
                return;
        }
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        Throwable th = (Throwable) obj;
        d300 d300Var = (d300) this.f52400b;
        ((p7x) d300Var.f44718k).m69308d(m7x.EVENTS_QUEUE_RESTARTED);
        d300Var.f44713f.mo46854e("EventSender queue restarted after an error: " + th.getMessage(), th);
        return true;
    }

    public drw() {
        this.f52399a = 16;
        this.f52400b = new SparseArray();
    }

    @Override // p204p.wh00, io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public u790 mo98394apply(Object obj) {
        return x4w0.m89916G(((fi00) this.f52400b).apply(obj));
    }
}
