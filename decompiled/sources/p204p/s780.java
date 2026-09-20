package p204p;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.spotify.aiplaylist.promptcreation.presentation.MessageInputView;
import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import com.spotify.liveeventslocation.p099v1.locationsuggest.LocationSuggestRequest;
import com.spotify.liveeventslocation.p099v1.locationsuggest.LocationSuggestResponse;
import com.spotify.liveeventslocation.p099v1.locationsuggest.LocationSuggestion;
import com.spotify.mainlayout.p106ui.view.MainLayout;
import com.spotify.metadata.esperanto.proto.GetEntityRequest;
import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;
import com.spotify.music.R;
import com.spotify.nowplayingmini.nowplayingmini.NowPlayingMiniMode;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class s780 implements ry71, Function, h9f, InterfaceC1698bb, ant, w2d0, Producer, InterfaceC2207oa {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f206295a;

    /* JADX INFO: renamed from: b */
    public final Object f206296b;

    public /* synthetic */ s780(Object obj, int i) {
        this.f206295a = i;
        this.f206296b = obj;
    }

    @Override // p204p.h9f
    /* JADX INFO: renamed from: a */
    public void mo46867a(int i) {
        ((nn90) this.f206296b).f156379h.getBackground().setTint(i);
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        switch (this.f206295a) {
            case 7:
                return !((lo51) this.f206296b).f135306d;
            case 23:
                return ((ihi) obj).f102296c == u300.MUSIC_GUESSER && ((nn40) this.f206296b).f156326b;
            default:
                ihi ihiVar = (ihi) obj;
                mb4 mb4Var = (mb4) this.f206296b;
                return mb4Var.m61346b() && !(mb4Var.m61347c() && ihiVar.f102296c == u300.ARTIST_MUSIC_VIDEOS);
        }
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, java.util.Map] */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        Boolean boolValueOf;
        switch (this.f206295a) {
            case 2:
                xq80 xq80Var = (xq80) obj;
                return ((Observable) ((fh3) ((z9p) this.f206296b).f280845d).invoke(xq80Var)).flatMap(new pj70(xq80Var, 4));
            case 6:
                yjf yjfVar = (yjf) this.f206296b;
                return new nlf(yjfVar.f273356a, yjfVar.f273357b, yjfVar.f273358c, (Throwable) obj);
            case 8:
                lk51 lk51Var = (lk51) obj;
                Context context = ((d9k) ((li80) this.f206296b).f133742d).f46849a;
                return (lk51Var == lk51.f134265f || lk51Var == lk51.f134266g) ? new f5b0(context.getString(R.string.lossless_label, Arrays.copyOf(new Object[0], 0)), context.getString(R.string.lossless_label_style_prefix, Arrays.copyOf(new Object[0], 0))) : new f5b0();
            case 9:
                tc91 tc91Var = (tc91) obj;
                if (tc91Var instanceof sc91) {
                    beb0 beb0Var = (beb0) this.f206296b;
                    return new ofb0(beb0Var.f26321a, ((sc91) tc91Var).f207670a, beb0Var.f26323c);
                }
                if (tc91Var instanceof rc91) {
                    return nfb0.f153310a;
                }
                throw new NoWhenBranchMatchedException();
            case 12:
                ta0 ta0Var = (ta0) obj;
                if (ta0Var instanceof oa0) {
                    return new CompletableFromAction(new jn10(3, (nt70) this.f206296b, ta0Var));
                }
                if (ta0Var.equals(pa0.f175333a) || ta0Var.equals(qa0.f186702a) || (ta0Var instanceof sa0)) {
                    return CompletableEmpty.f7437a;
                }
                throw new NoWhenBranchMatchedException();
            case 14:
                PlayerState playerState = (PlayerState) obj;
                boolean z = playerState.isPlaying() && !playerState.isPaused();
                k78 k78Var = ((x9d0) this.f206296b).f259327a;
                ExternalAccessoryDescription externalAccessoryDescription = k78Var.f120010b;
                myx myxVar = k78Var.f120009a;
                return z ? myxVar.m63222i(externalAccessoryDescription).ignoreElement() : myxVar.m63217c(externalAccessoryDescription).ignoreElement();
            case 16:
                o9e0 o9e0Var = (o9e0) obj;
                zby zbyVar = ((t9e0) this.f206296b).f218274a;
                String str = o9e0Var.f163007b;
                boolean z2 = o9e0Var.f163008c;
                return zby.m95883k(zbyVar, str, null, null, null, Boolean.valueOf(z2), null, 46).m23293d(Observable.just(new y9e0(z2))).onErrorReturn(new pj70(o9e0Var, 21));
            case 19:
                Object obj2 = ((sef0) this.f206296b).f208285b.get((NowPlayingMiniMode) obj);
                wj50.m88279p(obj2);
                return (SingleSource) obj2;
            case 22:
                List list = (List) obj;
                b1i0 b1i0Var = (b1i0) this.f206296b;
                return Collections.singletonMap(b1i0Var.f22362g.f204979a, new z19(new z2c(list, false, null, gbu.f78413a, b1i0Var.f22360e)));
            case 25:
                return new CompletableFromAction(new lbj0((nbj0) this.f206296b, (Integer) obj, 0));
            case 26:
                cej0 cej0Var = (cej0) this.f206296b;
                int iIntValue = ((Integer) obj).intValue();
                mii0 mii0Var = cej0Var.f37144f;
                if (mii0Var != null) {
                    boolValueOf = Boolean.valueOf(iIntValue == 0 || ((Boolean) mii0Var.invoke()).booleanValue());
                } else {
                    boolValueOf = null;
                }
                return Boolean.valueOf(boolValueOf != null ? boolValueOf.booleanValue() : false);
            case 27:
                fxx fxxVar = (fxx) obj;
                List list2 = fxxVar.f74479a;
                gh00 gh00Var = (gh00) this.f206296b;
                ArrayList arrayList = new ArrayList(i6f.m49804T(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add((axx) gh00Var.invoke((axx) it.next()));
                }
                return fxx.m43028a(fxxVar, arrayList, null, 14);
            default:
                elt eltVar = (elt) obj;
                if (eltVar instanceof dlt) {
                    return vie1.m85642x(dau.f47107a, new hrt0(((dlt) eltVar).f50353c, (flw0) this.f206296b, null, 29)).onErrorComplete(olr0.f166904h);
                }
                if (eltVar instanceof clt) {
                    return Observable.empty();
                }
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // p204p.ry71
    /* JADX INFO: renamed from: b */
    public Object mo50034b(int i) {
        return ((ynd1) this.f206296b).m94251f(i, false);
    }

    /* JADX INFO: renamed from: c */
    public int m77362c(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (m77368j()) {
            int left = view.getLeft();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            return left - (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0);
        }
        int right = view.getRight();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        return right + (marginLayoutParams != null ? marginLayoutParams.rightMargin : 0);
    }

    @Override // p204p.ry71
    public void cancel() {
        ((ynd1) this.f206296b).m94247a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public Serializable m77363d(String str, ibk ibkVar) {
        cm90 cm90Var;
        s780 s780Var;
        if (ibkVar instanceof cm90) {
            cm90Var = (cm90) ibkVar;
            int i = cm90Var.f39619d;
            if ((i & Integer.MIN_VALUE) != 0) {
                cm90Var.f39619d = i - Integer.MIN_VALUE;
            } else {
                cm90Var = new cm90(this, ibkVar);
            }
        } else {
            cm90Var = new cm90(this, ibkVar);
        }
        Object objM36401d = cm90Var.f39617b;
        int i2 = cm90Var.f39619d;
        if (i2 == 0) {
            bga.m29073P(objM36401d);
            rb5 rb5Var = (rb5) this.f206296b;
            cm90Var.f39616a = this;
            cm90Var.f39619d = 1;
            dma0 dma0VarM13046o = LocationSuggestRequest.m13046o();
            dma0VarM13046o.m36404m(str);
            LocationSuggestRequest locationSuggestRequest = (LocationSuggestRequest) dma0VarM13046o.build();
            dm90 dm90Var = (dm90) rb5Var.f197471b;
            wj50.m88279p(locationSuggestRequest);
            objM36401d = dm90Var.m36401d(locationSuggestRequest, cm90Var);
            yuk yukVar = yuk.f276404a;
            if (objM36401d == yukVar) {
                return yukVar;
            }
            s780Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s780Var = cm90Var.f39616a;
            bga.m29073P(objM36401d);
        }
        ae50<LocationSuggestion> ae50VarM13047n = ((LocationSuggestResponse) objM36401d).m13047n();
        s780Var.getClass();
        ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM13047n, 10));
        for (LocationSuggestion locationSuggestion : ae50VarM13047n) {
            arrayList.add(new d510(locationSuggestion.m13049o(), locationSuggestion.m13048n()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public boolean m77364e() {
        return ((q54) this.f206296b).m72188b();
    }

    @Override // p204p.ry71
    /* JADX INFO: renamed from: f */
    public Object mo76694f(int i, se21 se21Var) {
        return ((ynd1) this.f206296b).m94251f(i, true);
    }

    /* JADX INFO: renamed from: g */
    public View m77365g(zvb0 zvb0Var) {
        MainLayout mainLayout = (MainLayout) this.f206296b;
        int iOrdinal = zvb0Var.f286677a.ordinal();
        if (iOrdinal == 0) {
            View nowPlayingViewRegionExpanded = mainLayout.getNowPlayingViewRegionExpanded();
            wj50.m88279p(nowPlayingViewRegionExpanded);
            return nowPlayingViewRegionExpanded;
        }
        if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        View nowPlayingViewRegionCollapsed = mainLayout.getNowPlayingViewRegionCollapsed();
        wj50.m88279p(nowPlayingViewRegionCollapsed);
        return nowPlayingViewRegionCollapsed;
    }

    @Override // com.spotify.mobius.functions.Producer
    public Object get() {
        return new SchedulerWorkRunner(((eoh0) this.f206296b).f61427b);
    }

    /* JADX INFO: renamed from: h */
    public int m77366h(View view) {
        return m77368j() ? view.getRight() : view.getLeft();
    }

    /* JADX INFO: renamed from: i */
    public boolean m77367i() {
        return ((q54) this.f206296b).m72187a();
    }

    /* JADX INFO: renamed from: j */
    public boolean m77368j() {
        return ((MainLayout) this.f206296b).getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: k */
    public Single m77369k(String str) {
        jge jgeVar = (jge) this.f206296b;
        r810 r810VarM15420o = GetEntityRequest.m15420o();
        r810VarM15420o.m74969m(str);
        return jgeVar.m53295a((GetEntityRequest) r810VarM15420o.build()).map(isy.f105334N0);
    }

    /* JADX INFO: renamed from: l */
    public gng0 m77370l() {
        return new gng0((st91) this.f206296b);
    }

    /* JADX INFO: renamed from: m */
    public void m77371m() {
        ((MaterialButtonToggleGroup) this.f206296b).invalidate();
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        switch (this.f206295a) {
            case 10:
                jkb0 jkb0Var = (jkb0) this.f206296b;
                sbb0 sbb0Var = ((s7f) obj).f206351b;
                boolean z = sbb0Var.f207413f;
                int i = sbb0Var.f207408a;
                if (z) {
                    View view = jkb0Var.f113267X1;
                    if (view != null) {
                        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{i, sbb0Var.f207409b}));
                        return;
                    } else {
                        wj50.m88260d0("rootView");
                        throw null;
                    }
                }
                View view2 = jkb0Var.f113267X1;
                if (view2 != null) {
                    view2.setBackgroundColor(i);
                    return;
                } else {
                    wj50.m88260d0("rootView");
                    throw null;
                }
            default:
                ((MessageInputView) this.f206296b).setSaveButtonClickListener((String) ((xul0) obj).mo49283h());
                return;
        }
    }
}
