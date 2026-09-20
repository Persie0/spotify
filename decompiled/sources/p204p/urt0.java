package p204p;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.assistedcuration.endpointsimpl.assistedcurationsearch.p024v1.SearchProto$EntityViewUriResponse;
import com.spotify.identity.proto.p081v3.Identity$KidProfile;
import com.spotify.identity.proto.p081v3.Identity$KidProfileUpdateRequest;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.SignalCommand;
import com.spotify.signup.signup.p150v2.proto.AccountDetails;
import com.spotify.signup.signup.p150v2.proto.CreateAccountResponse;
import com.spotify.transcript.list.TranscriptListView;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import spotify.autodownload.esperanto.proto.DisableAllEnabledShowsRequest;

/* JADX INFO: loaded from: classes9.dex */
public final class urt0 implements Function, nvt0, ant, fev0, Producer, t6l0, u6m0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f233453a;

    /* JADX INFO: renamed from: b */
    public final Object f233454b;

    public /* synthetic */ urt0(int i, Object obj, Object obj2) {
        this.f233453a = i;
        this.f233454b = obj2;
    }

    /* JADX INFO: renamed from: c */
    public static void m83860c(String str, ArrayList arrayList, ArrayList arrayList2, gh00 gh00Var) {
        if (arrayList2.isEmpty()) {
            return;
        }
        xzv xzvVarM96196h = zi5.m96196h();
        xzvVarM96196h.f267791c = str;
        xzvVarM96196h.f267795g = str;
        xzvVarM96196h.f267784A = yzv.f277904b;
        arrayList.add(xzvVarM96196h.m92498c());
        boolean z = false;
        while (!arrayList2.isEmpty() && ((Boolean) gh00Var.invoke(arrayList2.get(0))).booleanValue()) {
            arrayList.add(arrayList2.remove(0));
            z = true;
        }
        if (z) {
            return;
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // p204p.fev0
    /* JADX INFO: renamed from: a */
    public Object mo28755a(fbk fbkVar) {
        return ((ojq) this.f233454b).mo26597I(fbkVar);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f233453a) {
            case 0:
                z080 z080Var = (z080) this.f233454b;
                int iOrdinal = ((s431) obj).f205428a.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        return ((hrw) z080Var.f278013d).mo48412a(new b8p0(SignalCommand.create("reshuffle"))).ignoreElement();
                    }
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return CompletableEmpty.f7437a;
            case 6:
                x1p0 x1p0Var = (x1p0) this.f233454b;
                return ((Observable) x1p0Var.f257247b).filter(zhi0.f282933Y).throttleFirst(1L, TimeUnit.SECONDS, (Scheduler) x1p0Var.f257250e).switchMapCompletable(new gjv0(x1p0Var, 1));
            case 7:
                return k0e1.m54986e(((tsb) this.f233454b).mo24819a((ContextTrack) obj), dau.f47107a);
            case 9:
                return g0b1.m43282x(dau.f47107a, new l1v0((n1v0) ((tu1) this.f233454b).f223741b, ((ary0) obj).f19167d, null, 1)).m23293d(Observable.just(qty0.f192508a));
            case 14:
                return ((Boolean) obj).booleanValue() ? new hzq0(((u2y0) this.f233454b).f226198d) : C2244p5.f174033a;
            case 15:
                r5y0 r5y0Var = (r5y0) obj;
                g140 g140VarM11933p = Identity$KidProfile.m11933p();
                g140VarM11933p.m43323m(r5y0Var.f196146e);
                Identity$KidProfile identity$KidProfile = (Identity$KidProfile) g140VarM11933p.build();
                h140 h140VarM11936p = Identity$KidProfileUpdateRequest.m11936p();
                h140VarM11936p.m46398m(identity$KidProfile);
                Identity$KidProfileUpdateRequest identity$KidProfileUpdateRequest = (Identity$KidProfileUpdateRequest) h140VarM11936p.build();
                p140 p140Var = (p140) this.f233454b;
                String str = r5y0Var.f196145d;
                wj50.m88279p(identity$KidProfileUpdateRequest);
                return p140Var.mo68767c(str, identity$KidProfileUpdateRequest).m23293d(Observable.just(new g6y0(true))).onErrorReturn(ujr0.f231110t);
            case 17:
                SearchProto$EntityViewUriResponse searchProto$EntityViewUriResponse = (SearchProto$EntityViewUriResponse) obj;
                return ((xry0) this.f233454b).f265433a.m80159a(searchProto$EntityViewUriResponse.getUrisList()).map(new gjv0(searchProto$EntityViewUriResponse, 11));
            case 19:
                rt2 rt2Var = (rt2) obj;
                ct2 ct2Var = ((icl) this.f233454b).f100838b;
                String str2 = rt2Var.f202473a;
                String str3 = rt2Var.f202475c;
                gbu gbuVar = gbu.f78413a;
                return ((lt2) ct2Var).m59861h(str2, str3, new mke0(gbuVar, gbuVar)).map(new iry0(rt2Var, 5)).onErrorReturn(new b9v0(rt2Var, 17)).toObservable();
            case 21:
                return ((ot7) this.f233454b).f168989a.callSingle("spotify.autodownload_esperanto.proto.AutoDownloadService", "DisableAllEnabledShows", DisableAllEnabledShowsRequest.m97406n()).map(msz0.f146892X).ignoreElement();
            case 25:
                CreateAccountResponse createAccountResponse = (CreateAccountResponse) obj;
                AccountDetails accountDetails = ((w421) this.f233454b).f247688b;
                return new l521(createAccountResponse, accountDetails.m21312v() ? accountDetails.m21311u() : null);
            case 27:
                String str4 = (String) obj;
                hy21 hy21Var = (hy21) ((nh80) this.f233454b).f153898e;
                wj50.m88279p(str4);
                return hy21Var.m49110d(str4).toFlowable(BackpressureStrategy.f7190d).m23360y(mmq0.f145202O0);
            case 28:
                String str5 = (String) obj;
                y431 y431Var = (y431) this.f233454b;
                if (bm51.m29803n0(str5, "spotify:episode:", false)) {
                    return vjf1.m85770t(xsr.f265652b, new h431((Object) y431Var, str5, (fbk) null, 1)).toFlowable().m23331J(new m95(y431Var, 26));
                }
                return Flowable.m23313I(v431.f237037a);
            default:
                return new bi31(((hg31) this.f233454b).f91014a, (o2x0) obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    @Override // p204p.nvt0
    /* JADX INFO: renamed from: b */
    public String mo28348b(int i) {
        String str;
        qvt0 qvt0Var = (qvt0) ((pvt0) this.f233454b);
        mhv mhvVar = (mhv) g6f.m43747t0(i, ((bdv) qvt0Var.f193099b.get()).m28854A());
        String strSubstring = null;
        if (mhvVar == null || !(mhvVar instanceof dhv)) {
            str = null;
        } else {
            bpe1 bpe1Var = ((dhv) mhvVar).f49173b;
            if (bpe1Var.f29426c) {
                str = null;
            } else {
                str = bpe1Var.f29429f;
            }
        }
        if (str != null && str.length() >= 2) {
            String strSubstring2 = str.substring(0, 2);
            if (strSubstring2.equals("D:")) {
                String strSubstring3 = str.substring(2);
                DateFormat dateFormat = (DateFormat) qvt0.f193097d.get();
                Date date = dateFormat != null ? dateFormat.parse(strSubstring3) : null;
                if (date != null) {
                    Context context = qvt0Var.f193098a;
                    if (context.getResources().getBoolean(R.bool.your_library_quick_scroll_use_date_utils)) {
                        strSubstring = DateUtils.formatDateTime(context, date.getTime(), 65568);
                        wj50.m88279p(strSubstring);
                    } else {
                        Object obj = qvt0Var.f193100c.get();
                        wj50.m88279p(obj);
                        strSubstring = ((DateFormat) obj).format(date);
                        wj50.m88279p(strSubstring);
                    }
                }
            } else if (strSubstring2.equals("S:")) {
                strSubstring = str.substring(2);
            }
        }
        return strSubstring == null ? "" : strSubstring;
    }

    /* JADX INFO: renamed from: d */
    public gt90 m83861d(int i, int i2) {
        Resources resources = (Resources) this.f233454b;
        return new gt90(resources.getString(i), resources.getString(i2), resources.getString(R.string.livestream_error_dialog_button_text), null);
    }

    /* JADX INFO: renamed from: e */
    public void m83862e(cy0 cy0Var) {
        RecyclerView recyclerView = (RecyclerView) this.f233454b;
        int i = cy0Var.f43126a;
        if (i == 1) {
            recyclerView.f1206O0.mo908o0(recyclerView, cy0Var.f43127b, cy0Var.f43129d);
            return;
        }
        if (i == 2) {
            recyclerView.f1206O0.mo911r0(recyclerView, cy0Var.f43127b, cy0Var.f43129d);
        } else if (i == 4) {
            recyclerView.f1206O0.mo914t0(recyclerView, cy0Var.f43127b, cy0Var.f43129d, cy0Var.f43128c);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.f1206O0.mo910q0(recyclerView, cy0Var.f43127b, cy0Var.f43129d);
        }
    }

    /* JADX INFO: renamed from: f */
    public dkv0 m83863f(int i) {
        RecyclerView recyclerView = (RecyclerView) this.f233454b;
        int childCount = ((RecyclerView) recyclerView.f1239f.f205269a.f80569b).getChildCount();
        dkv0 dkv0Var = null;
        for (int i2 = 0; i2 < childCount; i2++) {
            dkv0 dkv0VarM969U = RecyclerView.m969U(((RecyclerView) recyclerView.f1239f.f205269a.f80569b).getChildAt(i2));
            if (dkv0VarM969U != null && !dkv0VarM969U.m36330t() && dkv0VarM969U.f50041c == i) {
                if (!recyclerView.f1239f.f205271c.contains(dkv0VarM969U.f50039a)) {
                    dkv0Var = dkv0VarM969U;
                    break;
                }
                dkv0Var = dkv0VarM969U;
            }
        }
        if (dkv0Var == null) {
            return null;
        }
        if (!recyclerView.f1239f.f205271c.contains(dkv0Var.f50039a)) {
            return dkv0Var;
        }
        boolean z = RecyclerView.f1179Z1;
        return null;
    }

    /* JADX INFO: renamed from: g */
    public void m83864g(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = (RecyclerView) this.f233454b;
        int childCount = ((RecyclerView) recyclerView.f1239f.f205269a.f80569b).getChildCount();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = ((RecyclerView) recyclerView.f1239f.f205269a.f80569b).getChildAt(i6);
            dkv0 dkv0VarM969U = RecyclerView.m969U(childAt);
            if (dkv0VarM969U != null && !dkv0VarM969U.m36319B() && (i4 = dkv0VarM969U.f50041c) >= i && i4 < i5) {
                dkv0VarM969U.m36321k(2);
                if (obj == null) {
                    dkv0VarM969U.m36321k(1024);
                } else if ((1024 & dkv0VarM969U.f50048t) == 0) {
                    if (dkv0VarM969U.f50036X == null) {
                        ArrayList arrayList = new ArrayList();
                        dkv0VarM969U.f50036X = arrayList;
                        dkv0VarM969U.f50037Y = Collections.unmodifiableList(arrayList);
                    }
                    dkv0VarM969U.f50036X.add(obj);
                }
                ((ojv0) childAt.getLayoutParams()).f166149c = true;
            }
        }
        vjv0 vjv0Var = recyclerView.f1233c;
        ArrayList arrayList2 = vjv0Var.f242062c;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            dkv0 dkv0Var = (dkv0) arrayList2.get(size);
            if (dkv0Var != null && (i3 = dkv0Var.f50041c) >= i && i3 < i5) {
                dkv0Var.m36321k(2);
                vjv0Var.m85785h(size);
            }
        }
        recyclerView.f1198J1 = true;
    }

    @Override // com.spotify.mobius.functions.Producer
    public Object get() {
        return new DispatcherWorker(((rxy0) this.f233454b).f203765e);
    }

    /* JADX INFO: renamed from: h */
    public void m83865h(int i, int i2) {
        RecyclerView recyclerView = (RecyclerView) this.f233454b;
        int iM44966e = recyclerView.f1239f.f205269a.m44966e();
        for (int i3 = 0; i3 < iM44966e; i3++) {
            dkv0 dkv0VarM969U = RecyclerView.m969U(recyclerView.f1239f.f205269a.m44965d(i3));
            if (dkv0VarM969U != null && !dkv0VarM969U.m36319B() && dkv0VarM969U.f50041c >= i) {
                if (RecyclerView.f1180a2) {
                    dkv0VarM969U.toString();
                }
                dkv0VarM969U.m36334x(i2, false);
                recyclerView.f1194F1.f283549f = true;
            }
        }
        ArrayList arrayList = recyclerView.f1233c.f242062c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            dkv0 dkv0Var = (dkv0) arrayList.get(i4);
            if (dkv0Var != null && dkv0Var.f50041c >= i) {
                if (RecyclerView.f1180a2) {
                    dkv0Var.toString();
                }
                dkv0Var.m36334x(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1197I1 = true;
    }

    /* JADX INFO: renamed from: i */
    public void m83866i(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = (RecyclerView) this.f233454b;
        int iM44966e = recyclerView.f1239f.f205269a.m44966e();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < iM44966e; i11++) {
            dkv0 dkv0VarM969U = RecyclerView.m969U(recyclerView.f1239f.f205269a.m44965d(i11));
            if (dkv0VarM969U != null && (i9 = dkv0VarM969U.f50041c) >= i4 && i9 <= i3) {
                if (RecyclerView.f1180a2) {
                    dkv0VarM969U.toString();
                }
                if (dkv0VarM969U.f50041c == i) {
                    dkv0VarM969U.m36334x(i2 - i, false);
                } else {
                    dkv0VarM969U.m36334x(i5, false);
                }
                recyclerView.f1194F1.f283549f = true;
            }
        }
        ArrayList arrayList = recyclerView.f1233c.f242062c;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            dkv0 dkv0Var = (dkv0) arrayList.get(i12);
            if (dkv0Var != null && (i8 = dkv0Var.f50041c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    dkv0Var.m36334x(i2 - i, false);
                } else {
                    dkv0Var.m36334x(i10, false);
                }
                if (RecyclerView.f1180a2) {
                    dkv0Var.toString();
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1197I1 = true;
    }

    /* JADX INFO: renamed from: j */
    public void m83867j(ye9 ye9Var, List list) {
        ((SingleEmitter) this.f233454b).onSuccess(tvx0.m81621a(ye9Var, list, 4));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [p.gh00, p.qe70] */
    @Override // p204p.u6m0
    /* JADX INFO: renamed from: k */
    public t6m0 mo34969k(dcm0 dcm0Var, Bundle bundle) {
        return new ltx0((gh00) this.f233454b);
    }

    /* JADX INFO: renamed from: l */
    public boolean m83868l(List list, Map map) {
        if (((ke4) this.f233454b).m56181c() && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (wl51.m88496t0(((q121) it.next()).f184163a, "session_control_display", false)) {
                    Set setKeySet = map.keySet();
                    if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
                        Iterator it2 = setKeySet.iterator();
                        while (it2.hasNext()) {
                            if (wl51.m88496t0((String) it2.next(), "session_control_display", false)) {
                                return true;
                            }
                        }
                        break;
                    }
                    break;
                }
            }
        }
        return false;
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        pqm0 pqm0Var = (pqm0) obj;
        if (((Boolean) pqm0Var.f180350a).booleanValue()) {
            ht3 ht3Var = (ht3) this.f233454b;
            int iIntValue = ((Number) pqm0Var.f180351b).intValue();
            TranscriptListView transcriptListView = (TranscriptListView) ht3Var.f94911c;
            transcriptListView.m984C0();
            transcriptListView.getScroller().m68782b(iIntValue);
        }
    }

    @Override // p204p.t6l0
    /* JADX INFO: renamed from: x */
    public swd1 mo24684x(View view, swd1 swd1Var) {
        dx40 dx40VarMo51806g = swd1Var.f214650a.mo51806g(647);
        sx11 sx11Var = (sx11) this.f233454b;
        FrameLayout frameLayout = sx11Var.f214781x1;
        hy11 mainLayoutConfig = sx11Var.getMainLayoutConfig();
        s1h1 s1h1Var = mainLayoutConfig != null ? mainLayoutConfig.f96431c : null;
        if (s1h1Var instanceof fy11) {
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i = ((fy11) s1h1Var).f74504b;
            int i2 = (sx11Var.getLayoutDirection() == 1 ? dx40VarMo51806g.f53850c : dx40VarMo51806g.f53848a) + i;
            int i3 = dx40VarMo51806g.f53849b + i;
            int i4 = i + dx40VarMo51806g.f53851d;
            int marginEnd = marginLayoutParams.getMarginEnd();
            marginLayoutParams.setMarginStart(i2);
            marginLayoutParams.topMargin = i3;
            marginLayoutParams.setMarginEnd(marginEnd);
            marginLayoutParams.bottomMargin = i4;
            frameLayout.setLayoutParams(marginLayoutParams);
            return swd1.f214649b;
        }
        ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        int marginEnd2 = marginLayoutParams2.getMarginEnd();
        marginLayoutParams2.setMarginStart(0);
        marginLayoutParams2.topMargin = 0;
        marginLayoutParams2.setMarginEnd(marginEnd2);
        marginLayoutParams2.bottomMargin = 0;
        frameLayout.setLayoutParams(marginLayoutParams2);
        CoordinatorLayout coordinatorLayout = sx11Var.f214782y1;
        ViewGroup.LayoutParams layoutParams3 = coordinatorLayout.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
        int i5 = sx11Var.getLayoutDirection() == 1 ? dx40VarMo51806g.f53850c : dx40VarMo51806g.f53848a;
        int i6 = marginLayoutParams3.topMargin;
        int marginEnd3 = marginLayoutParams3.getMarginEnd();
        int i7 = marginLayoutParams3.bottomMargin;
        marginLayoutParams3.setMarginStart(i5);
        marginLayoutParams3.topMargin = i6;
        marginLayoutParams3.setMarginEnd(marginEnd3);
        marginLayoutParams3.bottomMargin = i7;
        coordinatorLayout.setLayoutParams(marginLayoutParams3);
        return swd1Var;
    }

    public /* synthetic */ urt0(Object obj, int i) {
        this.f233453a = i;
        this.f233454b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public urt0(gh00 gh00Var) {
        this.f233453a = 26;
        this.f233454b = (qe70) gh00Var;
    }
}
