package p204p;

import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.compose.p002ui.platform.ComposeView;
import com.spotify.encoreconsumermobile.elements.playprogressbar.PlayProgressBarView;
import com.spotify.encoremobile.component.icons.IconCheckAltFill;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.mobile.android.spotlets.show.proto.ShowDecorateRequest$ProtoDecorateResponse;
import com.spotify.mobile.android.spotlets.show.proto.ShowDecorateRequest$ProtoDecorateShowItem;
import com.spotify.mobile.android.spotlets.show.proto.ShowMetadata$ProtoShowMetadata;
import com.spotify.mobile.android.spotlets.show.proto.ShowState$ProtoShowCollectionState;
import com.spotify.mobile.android.spotlets.show.proto.ShowState$ProtoShowOfflineState;
import com.spotify.mobile.android.spotlets.show.proto.ShowState$ProtoShowPlayState;
import com.spotify.mobius.android.MobiusLoopViewModel;
import com.spotify.mobius.functions.Consumer;
import com.spotify.music.R;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class hmm0 extends ri00 implements gh00 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f93002h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hmm0(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f93002h = i4;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        Object ruwVar;
        Object ruwVar2;
        Object value;
        ult0 ult0VarM83402c;
        switch (this.f93002h) {
            case 0:
                eh00 eh00Var = (eh00) obj;
                pmm0 pmm0Var = (pmm0) this.f78014b;
                if (pmm0Var.f179119t.f50563Z.mo31463e().mo33098e() == qjo.f189275c) {
                    eh00Var.invoke();
                } else {
                    pmm0Var.f179109Z.add(eh00Var);
                }
                return w2a1.f247311a;
            case 1:
                yen0 yen0Var = (yen0) obj;
                len0 len0Var = (len0) this.f78014b;
                if (yen0Var instanceof yen0) {
                    len0Var.m58799j1().m15621f(new pyw(yen0Var.f272019a));
                    return w2a1.f247311a;
                }
                len0Var.getClass();
                throw new NoWhenBranchMatchedException();
            case 2:
                mhr0 mhr0Var = (mhr0) obj;
                len0 len0Var2 = (len0) this.f78014b;
                a1x a1xVar = a1x.f11486a;
                if (mhr0Var instanceof jhr0) {
                    MobiusLoopViewModel mobiusLoopViewModelM58799j1 = len0Var2.m58799j1();
                    aw40 aw40Var = ((jhr0) mhr0Var).f112556a;
                    if (aw40Var instanceof zv40) {
                        ruwVar2 = new uuw(((zv40) aw40Var).f286607b, ((zv40) aw40Var).f286606a);
                    } else if (aw40Var instanceof xv40) {
                        ruwVar2 = new suw(((xv40) aw40Var).f266275b, ((xv40) aw40Var).f266274a);
                    } else {
                        if (!(aw40Var instanceof yv40)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ruwVar2 = new ruw(((yv40) aw40Var).f276566a);
                    }
                    mobiusLoopViewModelM58799j1.m15621f(ruwVar2);
                } else if (mhr0Var instanceof ihr0) {
                    MobiusLoopViewModel mobiusLoopViewModelM58799j2 = len0Var2.m58799j1();
                    dis disVar = ((ihr0) mhr0Var).f102351a;
                    if (disVar instanceof cis) {
                        ruwVar = new suw(((cis) disVar).f38430b, ((cis) disVar).f38429a);
                    } else {
                        if (!(disVar instanceof bis)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ruwVar = new ruw(((bis) disVar).f27536a);
                    }
                    mobiusLoopViewModelM58799j2.m15621f(ruwVar);
                } else if (mhr0Var instanceof ghr0) {
                    MobiusLoopViewModel mobiusLoopViewModelM58799j3 = len0Var2.m58799j1();
                    i6e i6eVar = ((ghr0) mhr0Var).f79971a;
                    if (!(i6eVar instanceof i6e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mobiusLoopViewModelM58799j3.m15621f(new suw(i6eVar.f99217b, i6eVar.f99216a));
                } else if (mhr0Var instanceof fhr0) {
                    MobiusLoopViewModel mobiusLoopViewModelM58799j4 = len0Var2.m58799j1();
                    qyd qydVar = ((fhr0) mhr0Var).f69699a;
                    if (!(qydVar instanceof qyd)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mobiusLoopViewModelM58799j4.m15621f(new suw(qydVar.f193872b, String.valueOf(qydVar.f193871a)));
                } else if (mhr0Var instanceof hhr0) {
                    len0Var2.m58799j1().m15621f(euw.f63100a);
                } else if (mhr0Var instanceof khr0) {
                    len0Var2.m58799j1().m15621f(a1xVar);
                } else {
                    len0Var2.getClass();
                    if (!(mhr0Var instanceof lhr0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    tgn0 tgn0Var = ((lhr0) mhr0Var).f133640a;
                    if (tgn0Var instanceof rgn0) {
                        rgn0 rgn0Var = (rgn0) tgn0Var;
                        len0Var2.m58799j1().m15621f(new zyw(((ven0) len0Var2.m58799j1().m15622g()).mo77923t(), rgn0Var.f198984a, rgn0Var.f198985b));
                    } else if (tgn0Var instanceof qgn0) {
                        len0Var2.m58799j1().m15621f(new yyw(((ven0) len0Var2.m58799j1().m15622g()).mo77923t()));
                    } else if (tgn0Var instanceof pgn0) {
                        len0Var2.m58799j1().m15621f(a1xVar);
                    } else if (tgn0Var instanceof sgn0) {
                        sgn0 sgn0Var = (sgn0) tgn0Var;
                        len0Var2.m58799j1().m15621f(new uyw(sgn0Var.f208907a, sgn0Var.f208908b));
                    } else if (tgn0Var instanceof ngn0) {
                        len0Var2.m58799j1().m15621f(new ruw(((ngn0) tgn0Var).f153743a));
                    } else if (tgn0Var instanceof lgn0) {
                        len0Var2.m58799j1().m15621f(new syw(((ven0) len0Var2.m58799j1().m15622g()).mo77923t(), ((lgn0) tgn0Var).f133250a));
                    } else if (tgn0Var instanceof kgn0) {
                        len0Var2.m58799j1().m15621f(new ryw(((ven0) len0Var2.m58799j1().m15622g()).mo77923t()));
                    } else if (tgn0Var instanceof mgn0) {
                        len0Var2.m58799j1().m15621f(new tyw(((mgn0) tgn0Var).f143601a));
                    } else {
                        if (!(tgn0Var instanceof ogn0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        len0Var2.m58799j1().m15621f(new wyw(((ven0) len0Var2.m58799j1().m15622g()).mo77923t()));
                    }
                }
                return w2a1.f247311a;
            case 3:
                int i = ((roz) obj).f201376a;
                ((qyn0) this.f78014b).getClass();
                return aqz.f18873b;
            case 4:
                KeyEvent keyEvent = ((eu60) obj).f62887a;
                qyn0 qyn0Var = (qyn0) this.f78014b;
                qyn0Var.getClass();
                boolean zM74214a = false;
                if (erg1.m39801t(keyEvent) == 2) {
                    long jM29083e = bga.m29083e(keyEvent.getKeyCode());
                    if (ut60.m83924a(jM29083e, ut60.f233821p)) {
                        zM74214a = qyn0Var.m74214a(keyEvent.isShiftPressed() ? 33 : 130);
                    } else if (ut60.m83924a(jM29083e, ut60.f233810e)) {
                        zM74214a = qyn0Var.m74214a(130);
                    } else if (ut60.m83924a(jM29083e, ut60.f233809d)) {
                        zM74214a = qyn0Var.m74214a(33);
                    }
                }
                return Boolean.valueOf(zM74214a);
            case 5:
                ((xp80) ((tp80) this.f78014b)).m91651b((rp80) obj);
                return w2a1.f247311a;
            case 6:
                return new loo0(((moo0) this.f78014b).f145716a.f115962f.m54310e(((hoo0) obj).f93584a), 0);
            case 7:
                mqo0 mqo0Var = (mqo0) obj;
                d5a0 d5a0Var = ((PlayProgressBarView) this.f78014b).f3714R0;
                boolean z = mqo0Var.f146325b;
                float f = mqo0Var.f146326c;
                if (z || (f > 0.0f && (f < 1.0d || !mqo0Var.f146324a))) {
                    ((ProgressBar) d5a0Var.f45382d).setProgress(q3d0.m72083N(f * 100));
                    ((ProgressBar) d5a0Var.f45382d).setVisibility(0);
                } else {
                    ((ProgressBar) d5a0Var.f45382d).setVisibility(8);
                }
                return w2a1.f247311a;
            case 8:
                ((IconCheckAltFill) ((PlayProgressBarView) this.f78014b).f3714R0.f45381c).setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
                return w2a1.f247311a;
            case 9:
                mqo0 mqo0Var2 = (mqo0) obj;
                EncoreTextView encoreTextView = (EncoreTextView) ((PlayProgressBarView) this.f78014b).f3714R0.f45383e;
                int i2 = mqo0Var2.f146327d;
                encoreTextView.setText(i2 == 2 ? encoreTextView.getContext().getString(R.string.finished_progress) : encoreTextView.getContext().getString(R.string.played_progress));
                encoreTextView.setTextColor(vtg1.m86387n(encoreTextView, mqo0Var2.f146328e.f170422b));
                encoreTextView.setVisibility((!mqo0Var2.f146324a || i2 == 3) ? 8 : 0);
                return w2a1.f247311a;
            case 10:
                ((jh50) this.f78014b).mo53360v0((gh00) obj);
                return w2a1.f247311a;
            case 11:
                v9p0 v9p0Var = (v9p0) obj;
                pap0 pap0Var = (pap0) this.f78014b;
                if (pap0Var.f175589c) {
                    ph50 ph50Var = v9p0Var.f239015c;
                    if (ph50Var != null) {
                        pap0Var.f175591e.add(ph50Var);
                    }
                } else {
                    ph50 ph50Var2 = v9p0Var.f239015c;
                    if (ph50Var2 != null) {
                        ph50Var2.m69964q();
                    }
                }
                pap0Var.f175590d++;
                pap0Var.f175592f.remove(v9p0Var);
                return w2a1.f247311a;
            case 12:
                return ((fe00) this.f78014b).m41404e((ShowDecorateRequest$ProtoDecorateResponse) obj);
            case 13:
                return ((fe00) this.f78014b).m41404e((ShowDecorateRequest$ProtoDecorateResponse) obj);
            case 14:
                ShowDecorateRequest$ProtoDecorateResponse showDecorateRequest$ProtoDecorateResponse = (ShowDecorateRequest$ProtoDecorateResponse) obj;
                fe00 fe00Var = (fe00) this.f78014b;
                fe00Var.getClass();
                if (showDecorateRequest$ProtoDecorateResponse == null) {
                    return null;
                }
                ae50<ShowDecorateRequest$ProtoDecorateShowItem> ae50VarM15484o = showDecorateRequest$ProtoDecorateResponse.m15484o();
                int iM31820L = c95.m31820L(i6f.m49804T(ae50VarM15484o, 10));
                if (iM31820L < 16) {
                    iM31820L = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
                for (ShowDecorateRequest$ProtoDecorateShowItem showDecorateRequest$ProtoDecorateShowItem : ae50VarM15484o) {
                    String link = showDecorateRequest$ProtoDecorateShowItem.getLink();
                    ShowMetadata$ProtoShowMetadata showMetadata$ProtoShowMetadataM15486o = showDecorateRequest$ProtoDecorateShowItem.m15486o();
                    if (!showDecorateRequest$ProtoDecorateShowItem.m15490s()) {
                        showMetadata$ProtoShowMetadataM15486o = null;
                    }
                    ShowState$ProtoShowCollectionState showState$ProtoShowCollectionStateM15485n = showDecorateRequest$ProtoDecorateShowItem.m15485n();
                    if (!showDecorateRequest$ProtoDecorateShowItem.m15489r()) {
                        showState$ProtoShowCollectionStateM15485n = null;
                    }
                    ShowState$ProtoShowPlayState showState$ProtoShowPlayStateM15488q = showDecorateRequest$ProtoDecorateShowItem.m15488q();
                    if (!showDecorateRequest$ProtoDecorateShowItem.m15492u()) {
                        showState$ProtoShowPlayStateM15488q = null;
                    }
                    ShowState$ProtoShowOfflineState showState$ProtoShowOfflineStateM15487p = showDecorateRequest$ProtoDecorateShowItem.m15487p();
                    if (!showDecorateRequest$ProtoDecorateShowItem.m15491t()) {
                        showState$ProtoShowOfflineStateM15487p = null;
                    }
                    linkedHashMap.put(link, fe00Var.m41403d(showMetadata$ProtoShowMetadataM15486o, showState$ProtoShowCollectionStateM15485n, showState$ProtoShowPlayStateM15488q, showState$ProtoShowOfflineStateM15487p));
                }
                return linkedHashMap;
            case 15:
                kt51 kt51Var = (kt51) this.f78014b;
                kt51Var.getClass();
                View viewInflate = LayoutInflater.from((Context) obj).inflate(R.layout.subscriber_podcast_dialog, (ViewGroup) null, false);
                kt51Var.m57308b(viewInflate);
                return viewInflate;
            case 16:
                return Boolean.valueOf(((y7a) this.f78014b).m92990a((Throwable) obj));
            case 17:
                return Boolean.valueOf(((y7a) this.f78014b).m92990a((Throwable) obj));
            case 18:
                Intent intent = (Intent) obj;
                ((mjq0) this.f78014b).getClass();
                return Boolean.valueOf(intent != null ? intent.getBooleanExtra("PremiumCheckoutActivity", false) : false);
            case 19:
                y9r0 y9r0Var = (y9r0) obj;
                z9r0 z9r0Var = (z9r0) this.f78014b;
                synchronized (z9r0Var.f280866b) {
                    if (z9r0Var.f280867c == y9r0Var) {
                        z9r0Var.f280867c = null;
                    }
                    break;
                }
                return w2a1.f247311a;
            case 20:
                return Boolean.valueOf(bk5.m29621l0((Object[]) this.f78014b, (View) obj));
            case 21:
                String str = (String) obj;
                zv41 zv41Var = ((olt0) this.f78014b).f166922t;
                do {
                    value = zv41Var.getValue();
                    ult0VarM83402c = (ult0) value;
                    if (!ult0VarM83402c.f231641d) {
                        ult0VarM83402c = ult0.m83402c(ult0VarM83402c, null, str, false, 11);
                    }
                } while (!zv41Var.m97089k(value, ult0VarM83402c));
                return w2a1.f247311a;
            case 22:
                return Boolean.valueOf(((zrt0) ((yrt0) this.f78014b)).mo28437g(((Number) obj).intValue()) == 1);
            case 23:
                gvt0.m45901a((gvt0) this.f78014b, ((Number) obj).intValue());
                return w2a1.f247311a;
            case 24:
                ((Consumer) this.f78014b).accept((qku0) obj);
                return w2a1.f247311a;
            case 25:
                return ((g3f) ((e3f) this.f78014b)).m43486b((m0r) obj);
            case 26:
                return ((g3f) ((e3f) this.f78014b)).m43486b((m0r) obj);
            case 27:
                return ((g3f) ((e3f) this.f78014b)).m43486b((m0r) obj);
            case 28:
                return umv0.m83491e((umv0) this.f78014b, (smv0) obj);
            default:
                j1w0 j1w0Var = (j1w0) this.f78014b;
                j1w0Var.getClass();
                ComposeView composeView = new ComposeView(((ViewGroup) obj).getContext(), null, 0, 6, null);
                composeView.setContent(new fyf(new h1w0(j1w0Var, 2), true, 528552825));
                return composeView;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hmm0(Object obj, int i) {
        super(1, obj, fe00.class, "createEpisodes", "createEpisodes(Lcom/spotify/mobile/android/spotlets/show/proto/ShowDecorateRequest$ProtoDecorateResponse;)Ljava/util/Map;", 0, 0);
        this.f93002h = i;
        switch (i) {
            case 13:
                super(1, obj, fe00.class, "createEpisodes", "createEpisodes(Lcom/spotify/mobile/android/spotlets/show/proto/ShowDecorateRequest$ProtoDecorateResponse;)Ljava/util/Map;", 0, 0);
                break;
            case 14:
                super(1, obj, fe00.class, "createShows", "createShows(Lcom/spotify/mobile/android/spotlets/show/proto/ShowDecorateRequest$ProtoDecorateResponse;)Ljava/util/Map;", 0, 0);
                break;
            case 20:
                super(1, obj, bk5.class, "contains", "contains([Ljava/lang/Object;Ljava/lang/Object;)Z", 1, 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hmm0(pmm0 pmm0Var) {
        super(1, pmm0Var, pmm0.class, "runWhenUIHolderLoaded", "runWhenUIHolderLoaded(Lkotlin/jvm/functions/Function0;)V", 0, 0);
        this.f93002h = 0;
    }
}
