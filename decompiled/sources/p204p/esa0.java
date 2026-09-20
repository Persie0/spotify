package p204p;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.inputmethod.InputMethodManager;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.tasks.Task;
import com.spotify.aiplaylist.promptcreation.presentation.MessageInputView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.music.R;
import com.spotify.on_demand_set.proto.ResponseStatus;
import com.spotify.search.esperanto.proto.OfflineSearchResponse;
import com.spotify.search.proto.OfflineAudioEpisode;
import com.spotify.search.proto.OfflinePlaylist;
import com.spotify.search.proto.OfflineTrack;
import com.spotify.widgets.npvwidget.WidgetInteraction;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableErrorSupplier;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class esa0 implements ObservableOnSubscribe, Function, w111, ant, r7l0, cvo0, BiFunction, w1j0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62320a;

    /* JADX INFO: renamed from: b */
    public final Object f62321b;

    public /* synthetic */ esa0(Object obj, int i) {
        this.f62320a = i;
        this.f62321b = obj;
    }

    /* JADX INFO: renamed from: a */
    public e2h0 m39900a() {
        return new e2h0((st91) this.f62321b);
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        f0m0 f0m0Var = (f0m0) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ((okj0) this.f62321b).getClass();
        return zBooleanValue ? new f0m0(g0m0.f75396b, f0m0Var.f64686b) : f0m0Var;
    }

    /* JADX INFO: renamed from: b */
    public void m39901b(hdn0 hdn0Var) {
        ((idn0) this.f62321b).f101183a.onNext(hdn0Var);
    }

    /* JADX INFO: renamed from: c */
    public u790 m39902c(ggd0 ggd0Var) {
        lrd0 lrd0Var = (lrd0) this.f62321b;
        int i = Build.VERSION.SDK_INT;
        if (i < 31 || i >= 33) {
            return vgg1.m85445A(Boolean.TRUE);
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return !lrd0Var.m59793l().f241489h ? lrd0Var.m59795o(true) : vgg1.m85445A(Boolean.TRUE);
        }
        us30 us30Var = new us30(15, this, ggd0Var);
        Handler handler = lrd0Var.f136265c;
        Objects.requireNonNull(handler);
        return vgg1.m85450F(us30Var, new xgi(handler, 0));
    }

    /* JADX INFO: renamed from: d */
    public void m39903d() {
        ((sem0) this.f62321b).m77919b(-1);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x005b  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX INFO: renamed from: e */
    public boolean m39904e() {
        boolean z;
        k5j0 k5j0VarMo58245h;
        String str;
        String str2;
        k5j0 k5j0VarMo58250m;
        h600 h600VarMo49777a;
        h600 h600VarMo49777a2;
        l5j0 l5j0Var = (l5j0) this.f62321b;
        ArrayDeque arrayDequeMo58246i = l5j0Var.mo58246i();
        if (arrayDequeMo58246i == null || !arrayDequeMo58246i.isEmpty()) {
            Iterator it = arrayDequeMo58246i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    k5j0VarMo58245h = l5j0Var.mo58245h();
                    str = null;
                    if (k5j0VarMo58245h != null || (h600VarMo49777a2 = k5j0VarMo58245h.mo49777a()) == null) {
                        str2 = null;
                    } else {
                        str2 = h600VarMo49777a2.f87941b;
                    }
                    if (wj50.m88271j(str2, WidgetInteraction.Background.DESTINATION_HOME)) {
                        k5j0VarMo58250m = l5j0Var.mo58250m();
                        if (k5j0VarMo58250m != null && (h600VarMo49777a = k5j0VarMo58250m.mo49777a()) != null) {
                            str = h600VarMo49777a.f87941b;
                        }
                        if (wj50.m88271j(str, WidgetInteraction.Background.DESTINATION_HOME)) {
                            z = false;
                        }
                    }
                } else if (wj50.m88271j(((cp8) it.next()).f40490b.f87941b, WidgetInteraction.Background.DESTINATION_HOME)) {
                }
                z = true;
            }
        } else {
            k5j0VarMo58245h = l5j0Var.mo58245h();
            str = null;
            if (k5j0VarMo58245h != null) {
                str2 = null;
            } else {
                str2 = null;
            }
            if (wj50.m88271j(str2, WidgetInteraction.Background.DESTINATION_HOME)) {
                k5j0VarMo58250m = l5j0Var.mo58250m();
                if (k5j0VarMo58250m != null) {
                    str = h600VarMo49777a.f87941b;
                }
                if (wj50.m88271j(str, WidgetInteraction.Background.DESTINATION_HOME)) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = true;
            }
        }
        return !z;
    }

    @Override // p204p.cvo0
    /* JADX INFO: renamed from: f */
    public boolean mo29657f(yzo0 yzo0Var) {
        String identifier = ((tai0) this.f62321b).getIdentifier();
        if (identifier != null) {
            return wj50.m88271j(yzo0Var.f277859a.f128768d.get("video_surface_identifier"), identifier);
        }
        return false;
    }

    @Override // p204p.w1j0
    /* JADX INFO: renamed from: g */
    public v1j0 mo24517g(Intent intent, e301 e301Var) {
        return oyy0.m68568b((oyy0) this.f62321b, intent, e301Var, xoc1.f263906I3);
    }

    @Override // p204p.w111
    /* JADX INFO: renamed from: l */
    public Object mo28227l(eo01 eo01Var, fbk fbkVar) {
        if (!eo01Var.f61267d.contains(umb0.f231792a)) {
            throw new IllegalStateException("Cannot invoke lyrics share entry point plugin without lyrics signal. This indicates an error with the plugin configuration");
        }
        wi01 wi01Var = (wi01) zn91.m96523K(eo01Var.f61265b, "lyrics.share.asset_content", wi01.class);
        if (wi01Var == null) {
            return null;
        }
        pcb pcbVar = (pcb) this.f62321b;
        pcbVar.f176004d = wi01Var;
        return new e211(Collections.singletonList(pcbVar.m69551e()), 0, fji.f70297b, eo01Var.f61266c instanceof k511 ? "screenshot" : "lyricssharing");
    }

    @Override // p204p.r7l0
    public void onComplete(Task task) {
        ((sir0) this.f62321b).mo30210A(null);
    }

    @Override // io.reactivex.rxjava3.core.ObservableOnSubscribe
    public void subscribe(ObservableEmitter observableEmitter) {
        observableEmitter.setCancellable(new zg0(((fsa0) this.f62321b).f72819b.subscribe(new hr5(observableEmitter, 1)), 5));
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        h8k0 h8k0Var;
        switch (this.f62320a) {
            case 8:
                ((MessageInputView) this.f62321b).setEditTextMaxLines((rz60) obj);
                return;
            case 14:
                knc1 knc1Var = (knc1) obj;
                aw5 aw5Var = (aw5) this.f62321b;
                z9j0 z9j0Var = (z9j0) aw5Var.f20393d;
                q831 q831Var = (q831) aw5Var.f20394e;
                ugz ugzVar = (ugz) aw5Var.f20395f;
                if (knc1Var.equals(qlc1.f189827a)) {
                    ((EncoreButton) ugzVar.f230294f).setEnabled(false);
                    ((ProgressBar) ugzVar.f230292d).setVisibility(8);
                    return;
                }
                if (knc1Var.equals(tlc1.f221448a)) {
                    ((EncoreButton) ugzVar.f230294f).setEnabled(true);
                    ((ProgressBar) ugzVar.f230292d).setVisibility(8);
                    return;
                }
                if (knc1Var.equals(xmc1.f263340a)) {
                    ((EncoreButton) ugzVar.f230294f).setEnabled(false);
                    ((ProgressBar) ugzVar.f230292d).setVisibility(0);
                    return;
                }
                if (knc1Var.equals(anc1.f17366a)) {
                    ((EncoreButton) ugzVar.f230294f).setEnabled(true);
                    ((ProgressBar) ugzVar.f230292d).setVisibility(8);
                    q831Var.m72305j(new g631(null, ((ConstraintLayout) ugzVar.f230290b).getResources().getString(R.string.member_details_generic_error), null, null, null, null, null, null, false));
                    return;
                } else if (knc1Var.equals(dnc1.f50755a)) {
                    ((InputMethodManager) ((Context) aw5Var.f20391b).getSystemService("input_method")).hideSoftInputFromWindow(((ConstraintLayout) ugzVar.f230290b).getWindowToken(), 0);
                    z9j0Var.mo47345e();
                    q831Var.m72305j(new g631(null, ((ConstraintLayout) ugzVar.f230290b).getResources().getString(R.string.parental_control_update_name_snackbar), null, null, null, null, null, null, false));
                    return;
                } else {
                    if (!knc1Var.equals(olc1.f166821a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z9j0Var.mo47345e();
                    return;
                }
            case 19:
                a8k0 a8k0Var = ((p8k0) ((C2636z3) this.f62321b).f278727f).f174986c;
                int iOrdinal = ((h8k0) obj).ordinal();
                if (iOrdinal == 0) {
                    if (a8k0Var.f13318h != 1) {
                        a8k0Var.f13318h = 1;
                        a8k0Var.m47712h();
                        return;
                    }
                    return;
                }
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                if (a8k0Var.f13318h != 2) {
                    a8k0Var.f13318h = 2;
                    a8k0Var.m47712h();
                    return;
                }
                return;
            default:
                zaf0 zaf0Var = (zaf0) obj;
                gbk0 gbk0Var = (gbk0) this.f62321b;
                eu6 eu6Var = gbk0Var.f78336c1;
                zaf0 zaf0Var2 = zaf0.f281059a;
                boolean z = zaf0Var == zaf0Var2;
                if (eu6Var.f62876a != z) {
                    eu6Var.f62876a = z;
                    eu6Var.m40035i();
                }
                hxt hxtVar = gbk0Var.f78330Z0;
                if (hxtVar == null) {
                    wj50.m88260d0("connectLabelVH");
                    throw null;
                }
                hxtVar.f96307t.setVisibility(zaf0Var != zaf0Var2 ? 8 : 0);
                hxt hxtVar2 = gbk0Var.f78323V0;
                i8k0 i8k0Var = (i8k0) hxtVar2.f96293f;
                if (i8k0Var != null) {
                    int iOrdinal2 = zaf0Var.ordinal();
                    if (iOrdinal2 == 0) {
                        h8k0Var = h8k0.f88723a;
                    } else {
                        if (iOrdinal2 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        h8k0Var = h8k0.f88724b;
                    }
                    hxtVar2.m49046g(new i8k0(i8k0Var.f99804a, h8k0Var, i8k0Var.f99806c));
                    return;
                }
                return;
        }
    }

    public esa0(tac0 tac0Var, uac0 uac0Var) {
        this.f62320a = 4;
        this.f62321b = tac0Var;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x024e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0260  */
    /* JADX WARN: Code duplicated, block: B:86:0x0263 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x021b A[SYNTHETIC] */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        String str;
        String str2;
        w3c0 w3c0Var;
        int i = this.f62320a;
        int i2 = 1;
        Object obj2 = this.f62321b;
        switch (i) {
            case 2:
                return new yfb0(true, ((ueb0) obj2).f229477a);
            case 4:
                ArrayList<j9o0> arrayList = ((q9o0) obj).f186641a;
                ArrayList arrayList2 = new ArrayList();
                for (j9o0 j9o0Var : arrayList) {
                    f2h1 f2h1Var = j9o0Var.f110217d;
                    if (f2h1Var instanceof gfe0) {
                        str2 = ((gfe0) f2h1Var).f79344b;
                    } else {
                        if (f2h1Var instanceof ffe0) {
                            str2 = ((ffe0) f2h1Var).f68994b;
                        } else {
                            if (!(f2h1Var instanceof hfe0) && !(f2h1Var instanceof ife0)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str = null;
                        }
                        if (str != null) {
                            w3c0Var = new w3c0(str, j9o0Var.f110214a, Integer.valueOf(j9o0Var.f110218e), j9o0Var.f110216c, j9o0Var.f110215b);
                        } else {
                            w3c0Var = null;
                        }
                        if (w3c0Var != null) {
                            arrayList2.add(w3c0Var);
                        }
                    }
                    str = str2;
                    if (str != null) {
                        w3c0Var = new w3c0(str, j9o0Var.f110214a, Integer.valueOf(j9o0Var.f110218e), j9o0Var.f110216c, j9o0Var.f110215b);
                    } else {
                        w3c0Var = null;
                    }
                    if (w3c0Var != null) {
                        arrayList2.add(w3c0Var);
                    }
                }
                return new gac0(new xac0(arrayList2), ((tac0) obj2).f218539b);
            case 9:
                bcf0 bcf0Var = (bcf0) obj2;
                return bcf0Var.f25880e.debounce(200L, TimeUnit.MILLISECONDS, bcf0Var.f25879d).take(1L);
            case 12:
                jph0.m53948a((jph0) obj2, ((soh0) obj).f211195e);
                return aph0.f17952a;
            case 16:
                Integer num = (Integer) obj;
                boolean zBooleanValue = ((Boolean) ((lcj0) ((kcj0) obj2).f121498b).invoke()).booleanValue();
                if (zBooleanValue || num.intValue() != 0) {
                    return (zBooleanValue && num.intValue() == 1) ? dej0.f48109b : dej0.f48110c;
                }
                return dej0.f48111d;
            case 17:
                by50 by50Var = (by50) obj;
                String str3 = by50Var.f32078d.f266863a;
                s5p s5pVar = (s5p) ((voi) obj2);
                Observable observableCombineLatest = Observable.combineLatest(s5pVar.m77297d().filter(jey.f111723R0).map(tky.f221245P0), s5pVar.m77301k().map(ily.f103525O0), mly.f144950P0);
                List list = uvx.f234514a;
                return observableCombineLatest.filter(nwh0.f159175a1).filter(new q1h1(str3, 8)).map(hsy.f94831P0).map(new ha80(by50Var, 24)).distinctUntilChanged();
            case 21:
                LinkedHashSet<String> linkedHashSet = ((oy21) obj).f171648a;
                rok0 rok0Var = (rok0) obj2;
                ArrayList arrayList3 = new ArrayList(i6f.m49804T(linkedHashSet, 10));
                for (String str4 : linkedHashSet) {
                    arrayList3.add((Observable) ((ConcurrentHashMap) rok0Var.f201288h).computeIfAbsent(str4, new wb90(str4, i2, rok0Var)));
                }
                return Observable.combineLatest(arrayList3, jaz.f110576Q0).map(kaz.f120987R0);
            case 22:
                OfflineSearchResponse offlineSearchResponse = (OfflineSearchResponse) obj;
                List<OfflineTrack> tracksList = offlineSearchResponse.getTracksList();
                Context context = ((kyk0) obj2).f127882a;
                String string = context.getString(R.string.collection_start_songs_title);
                ArrayList arrayList4 = new ArrayList(i6f.m49804T(tracksList, 10));
                for (OfflineTrack offlineTrack : tracksList) {
                    String name = offlineTrack.getName();
                    String strM43753y0 = g6f.m43753y0(offlineTrack.m20718o(), ", ", null, null, null, 62);
                    arrayList4.add(new w0z0(name, strM43753y0.length() == 0 ? null : strM43753y0, offlineTrack.m20720q(), offlineTrack.getUri(), null, null));
                }
                x0z0 x0z0Var = new x0z0(string, arrayList4);
                ae50<OfflineAudioEpisode> ae50VarM20708o = offlineSearchResponse.m20708o();
                String string2 = context.getString(R.string.collection_start_shows_title_podcasts_only);
                ArrayList arrayList5 = new ArrayList(i6f.m49804T(ae50VarM20708o, 10));
                for (OfflineAudioEpisode offlineAudioEpisode : ae50VarM20708o) {
                    arrayList5.add(new w0z0(offlineAudioEpisode.getName(), null, offlineAudioEpisode.m20714o(), offlineAudioEpisode.getUri(), null, null));
                }
                x0z0 x0z0Var2 = new x0z0(string2, arrayList5);
                ae50<OfflinePlaylist> ae50VarM20709p = offlineSearchResponse.m20709p();
                String string3 = context.getString(R.string.collection_start_playlists_title);
                ArrayList arrayList6 = new ArrayList(i6f.m49804T(ae50VarM20709p, 10));
                for (OfflinePlaylist offlinePlaylist : ae50VarM20709p) {
                    arrayList6.add(new w0z0(offlinePlaylist.getName(), null, offlinePlaylist.m20716n(), offlinePlaylist.getUri(), null, null));
                }
                return h6f.m46715L(x0z0Var, x0z0Var2, new x0z0(string3, arrayList6));
            case 23:
                return new r1l0((List) obj, ((q1l0) obj2).f184371g);
            default:
                ResponseStatus responseStatus = (ResponseStatus) obj;
                if (responseStatus.getStatusCode() == 200) {
                    return CompletableEmpty.f7437a;
                }
                return new CompletableErrorSupplier(new w8l0((x8l0) obj2, responseStatus, i2));
        }
    }
}
