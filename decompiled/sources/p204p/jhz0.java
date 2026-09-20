package p204p;

import android.R;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.spotify.externalintegration.http.Section;
import com.spotify.externalintegration.http.SectionItem;
import com.spotify.externalintegration.http.UnauthenticatedExperienceItem;
import com.spotify.externalintegration.http.UnauthenticatedExperiencesResponse;
import com.spotify.player.model.ContextTrack;
import com.spotify.show_esperanto.proto.GetShowResponse;
import com.spotify.stream_reporting_esperanto.proto.StatusResponseOuterClass$StatusResponse;
import com.spotify.transcript.list.TranscriptListView;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableCombineLatest;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeMap;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeTimeoutMaybe;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public class jhz0 implements Function, ant, InterfaceC2207oa, r7l0, t6l0, q5w0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f112586a;

    /* JADX INFO: renamed from: b */
    public final Object f112587b;

    public /* synthetic */ jhz0(Object obj, int i) {
        this.f112586a = i;
        this.f112587b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public Object m53432a(alt altVar, ibk ibkVar) {
        lk91 lk91Var;
        if (ibkVar instanceof lk91) {
            lk91Var = (lk91) ibkVar;
            int i = lk91Var.f134297d;
            if ((i & Integer.MIN_VALUE) != 0) {
                lk91Var.f134297d = i - Integer.MIN_VALUE;
            } else {
                lk91Var = new lk91(this, ibkVar);
            }
        } else {
            lk91Var = new lk91(this, ibkVar);
        }
        Object obj = lk91Var.f134295b;
        int i2 = lk91Var.f134297d;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ivw ivwVar = lk91Var.f134294a;
            bga.m29073P(obj);
            return ivwVar;
        }
        bga.m29073P(obj);
        e601 e601Var = (e601) this.f112587b;
        Uri uri = altVar.f16980b;
        String str = altVar.f16979a;
        ivw ivwVar2 = ivw.f106292a;
        lk91Var.f134294a = ivwVar2;
        lk91Var.f134297d = 1;
        e601Var.m37867a(uri, str, true);
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        return w2a1Var == yukVar ? yukVar : ivwVar2;
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        return ((ke4) this.f112587b).m56180b();
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        Flowable flowableM23313I;
        switch (this.f112586a) {
            case 0:
                return new CompletableFromAction(new ehz0((lhz0) this.f112587b, 2)).m23307y();
            case 2:
                return new hhs0(((gfs0) this.f112587b).f79465b);
            case 4:
                return ((fm11) this.f112587b).f70923b.m47133i((GetShowResponse) obj);
            case 5:
                y5f y5fVar = (y5f) ((Map) obj).get((String) ((ezw0) this.f112587b).f64486c);
                return Boolean.valueOf(y5fVar != null ? y5fVar.f269417a : false);
            case 6:
                return Observable.create(new y3z0(10, (dr11) this.f112587b, (qgu0) obj));
            case 7:
                amv0 amv0Var = ((t621) this.f112587b).f217425c;
                MaybeMap maybeMapM23369g = ufc1.m82972n(amv0Var.f17207b).m23369g(Functions.m23425b(ciq0.class));
                TimeUnit timeUnit = TimeUnit.SECONDS;
                Scheduler scheduler = amv0Var.f17208c;
                aiq0 aiq0Var = aiq0.f16080a;
                return new MaybeTimeoutMaybe(maybeMapM23369g, Maybe.m23364m(3L, timeUnit, scheduler), Maybe.m23363f(aiq0Var)).m23366c(aiq0Var).flatMap(new djs0(amv0Var, 10)).cast(ciq0.class).subscribeOn(amv0Var.f17209d).map(pmr0.f179201M0);
            case 9:
                return ((i431) this.f112587b).m49647f(((ubp0) obj).f228853a);
            case 12:
                pqm0 pqm0Var = (pqm0) obj;
                List list = (List) pqm0Var.f180350a;
                if (!((Boolean) pqm0Var.f180351b).booleanValue() || list.isEmpty()) {
                    return Flowable.m23313I(nau.f152117a);
                }
                HashSet hashSet = new HashSet();
                ArrayList<ContextTrack> arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (hashSet.add(((ContextTrack) obj2).uri())) {
                        arrayList.add(obj2);
                    }
                }
                a5y a5yVar = (a5y) this.f112587b;
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                for (ContextTrack contextTrack : arrayList) {
                    Float fM24822b = a5y.m24822b(contextTrack);
                    if (fM24822b == null || wj50.m88269i(fM24822b, 1.0f)) {
                        flowableM23313I = Flowable.m23313I(zy31.f287482a);
                    } else {
                        String strUri = contextTrack.uri();
                        flowableM23313I = ((jpx) ((epx) a5yVar.f12643b)).m53978b(new C1668ai((String) a5yVar.f12645d, false, (gh00) new zpz0(strUri, 26))).takeUntil(loq0.f135511T0).map(new q1h1(strUri, 11)).doOnError(cz31.f43454b).onErrorReturnItem(Float.valueOf(0.0f)).toFlowable(BackpressureStrategy.f7190d).m23331J(new dz31(fM24822b, 0));
                    }
                    arrayList2.add(flowableM23313I.m23331J(new dhw0(contextTrack)));
                }
                koq0 koq0Var = koq0.f124876Q0;
                int i = Flowable.f7192a;
                ObjectHelper.m23450a(i, "bufferSize");
                return new FlowableCombineLatest(arrayList2, koq0Var, i);
            case 15:
                String str = (String) obj;
                zf41 zf41Var = (zf41) this.f112587b;
                return wj50.m88271j(zf41Var.f282210e, str) ? CompletableEmpty.f7437a : zpk.m96686b(zf41Var.f282206a, "sp_accept_language", Uri.encode(str)).m23295g(new yf41(0, zf41Var, str)).m23296h(cz31.f43459e).m23299p(Functions.f7232h);
            case 16:
                fr41 fr41Var = (fr41) this.f112587b;
                return ((Boolean) obj).booleanValue() ? fr41Var.f72367i.f111831b.firstOrError().flatMap(new gc41(fr41Var, 1)) : Single.just(new yk91(Boolean.FALSE, null, null));
            case 19:
                ((ij51) this.f112587b).m50777V((StatusResponseOuterClass$StatusResponse) obj, 2);
                return CompletableEmpty.f7437a;
            case 24:
                ik81 ik81Var = (ik81) this.f112587b;
                return new FlowableTake(Flowable.m23322h((Flowable) ik81Var.f103059b, ik81Var.m50927g(), wnq0.f253243T0).m23331J(new oh3(ik81Var, 29)));
            case 26:
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ((TranscriptListView) this.f112587b).getLayoutManager();
                return new c291(linearLayoutManager.m939g1(), linearLayoutManager.m942i1());
            case 28:
                dh31 dh31Var = (dh31) this.f112587b;
                List list2 = ((UnauthenticatedExperiencesResponse) obj).unauthenticatedExperiences;
                ArrayList arrayList3 = new ArrayList();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    j6f.m52564V(((UnauthenticatedExperienceItem) it.next()).f4078a, arrayList3);
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    j6f.m52564V(((Section) it2.next()).f4064b, arrayList4);
                }
                ArrayList arrayList5 = new ArrayList(i6f.m49804T(arrayList4, 10));
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(bjf1.m29412t((SectionItem) it3.next(), (gd40) dh31Var.f48973b, (czd0) dh31Var.f48974c, null));
                }
                return new fxx(arrayList5, null, null, null);
            default:
                List list3 = ((emt0) this.f112587b).f60981c;
                int iM31820L = c95.m31820L(i6f.m49804T(list3, 10));
                if (iM31820L < 16) {
                    iM31820L = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
                for (Object obj3 : list3) {
                    linkedHashMap.put(obj3, null);
                }
                return new dot0(linkedHashMap);
        }
    }

    /* JADX INFO: renamed from: b */
    public List m53433b() {
        return g6f.m43728j1((Iterable) ((er70) this.f112587b).get());
    }

    @Override // p204p.q5w0
    /* JADX INFO: renamed from: c */
    public void mo33206c(long j, String str) {
        ((z9q0) ((j56) this.f112587b).f108890d).mo33365e();
    }

    @Override // p204p.q5w0
    /* JADX INFO: renamed from: d */
    public void mo33207d(long j, String str) {
        ((z9q0) ((j56) this.f112587b).f108890d).mo33366f();
    }

    /* JADX INFO: renamed from: f */
    public void mo53434f() {
        View view = (View) this.f112587b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m53435g(String str, double d, long j) {
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f112587b;
        Object copyOnWriteArrayList = concurrentHashMap.get(str);
        if (copyOnWriteArrayList == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str, (copyOnWriteArrayList = new CopyOnWriteArrayList()))) != null) {
            copyOnWriteArrayList = objPutIfAbsent;
        }
        ((CopyOnWriteArrayList) copyOnWriteArrayList).add(new tbf0(d, j));
    }

    /* JADX INFO: renamed from: h */
    public void m53436h(Map map, juk jukVar) {
        e371 e371Var = new e371(8, map, this);
        if (jukVar == null) {
            e371Var.invoke();
        } else {
            x0h1.m89578u(kk40.m56661c(opo.m67570t(njg1.m64613f(), jukVar)), null, 0, new r611(e371Var, null, 10), 3);
        }
    }

    /* JADX INFO: renamed from: i */
    public void mo53437i() {
        View viewFindViewById;
        View view = (View) this.f112587b;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new rsz0(viewFindViewById, 7));
    }

    @Override // p204p.r7l0
    public void onComplete(Task task) {
        e741 e741Var = (e741) this.f112587b;
        if (task.mo1518j()) {
            for (SplitInstallSessionState splitInstallSessionState : (List) task.mo1515g()) {
                if (splitInstallSessionState.status() == 2) {
                    e741Var.f56827d.cancelInstall(splitInstallSessionState.sessionId()).mo1510b(new dh31(5, e741Var, splitInstallSessionState));
                }
            }
        }
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        String string;
        switch (this.f112586a) {
            case 1:
                ktx0 ktx0Var = (ktx0) obj;
                snz0 snz0Var = (snz0) this.f112587b;
                ek20 ek20Var = snz0Var.f211064h;
                Resources resources = snz0Var.f211057a.getContext().getResources();
                if (wj50.m88271j(ktx0Var, itx0.f105787a)) {
                    string = resources.getQuantityString(com.spotify.music.R.plurals.line_selected, 0, 0);
                } else if (ktx0Var instanceof jtx0) {
                    int i = ((jtx0) ktx0Var).f115982a;
                    string = resources.getQuantityString(com.spotify.music.R.plurals.line_selected, i, Integer.valueOf(i));
                } else {
                    if (!wj50.m88271j(ktx0Var, htx0.f95208a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    string = resources.getString(com.spotify.music.R.string.max_lines_selected);
                }
                ek20 ek20Var2 = new ek20(ek20Var.f60342c, ek20Var.f60340a, ek20Var.f60343d, string);
                hxt hxtVar = snz0Var.f211063g;
                if (hxtVar != null) {
                    hxtVar.m49046g(ek20Var2);
                    return;
                }
                return;
            default:
                la51 la51Var = (la51) obj;
                pi6 pi6Var = (pi6) this.f112587b;
                View view = (View) pi6Var.f177838f;
                View view2 = pi6Var.f177834b;
                if (la51Var instanceof ia51) {
                    view2.setVisibility(8);
                    view.setVisibility(8);
                    return;
                }
                if (la51Var instanceof ja51) {
                    view2.setVisibility(0);
                    view.setVisibility(8);
                    return;
                } else if (la51Var instanceof ha51) {
                    view2.setVisibility(8);
                    view.setVisibility(0);
                    return;
                } else {
                    if (!(la51Var instanceof ka51)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    view2.setVisibility(8);
                    view.setVisibility(8);
                    ((ca51) pi6Var.f177840h).setVisibility(0);
                    ((v951) pi6Var.f177839g).setVisibility(0);
                    return;
                }
        }
    }

    @Override // p204p.t6l0
    /* JADX INFO: renamed from: x */
    public swd1 mo24684x(View view, swd1 swd1Var) {
        ((ConstraintLayout) this.f112587b).setPadding(0, swd1Var.f214650a.mo51806g(519).f53849b, 0, 0);
        return swd1.f214649b;
    }

    public jhz0(int i) {
        this.f112586a = i;
        switch (i) {
            case 22:
                this.f112587b = new ConcurrentHashMap();
                break;
            default:
                this.f112587b = new iwr();
                break;
        }
    }

    @Override // p204p.q5w0
    /* JADX INFO: renamed from: e */
    public void mo33208e(long j, String str) {
    }
}
