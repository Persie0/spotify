package p204p;

import android.animation.Animator;
import android.content.Intent;
import android.net.Uri;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.facepile.FacePileView;
import com.spotify.initialization.app.EarlyInitializationProvider;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryLabelAndImage;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryPredefinedPlaylistConfig;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs;

/* JADX INFO: loaded from: classes7.dex */
public final class m3n implements InterfaceC2207oa, ant, Function, Producer, nka1, w1j0, Predicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f139685a;

    /* JADX INFO: renamed from: b */
    public final Object f139686b;

    public /* synthetic */ m3n(int i, Object obj, Object obj2) {
        this.f139685a = i;
        this.f139686b = obj2;
    }

    /* JADX INFO: renamed from: a */
    public hol0 m60721a() {
        fy80 fy80Var = (fy80) this.f139686b;
        m500 m500Var = fy80Var.f74639s;
        jg31.m53271i(m500Var);
        n93 n93Var = fy80Var.f74566I;
        jg31.m53271i(n93Var);
        v300 v300Var = fy80Var.f74584R;
        jg31.m53271i(v300Var);
        dxk0 dxk0Var = fy80Var.f74555C0;
        jg31.m53271i(dxk0Var);
        return new hol0(m500Var, n93Var, v300Var, dxk0Var, fy80Var.f74607c, 3);
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        u300 u300Var = ((ihi) obj).f102296c;
        return (u300Var == u300.DAYLIST || u300Var == u300.DAYLIST_SNAPSHOT) && ((qoo) this.f139686b).m73397d();
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f139685a) {
            case 5:
                boolean z = true;
                if (dxf1.m37245t("allow-connect-entry-points", (Map) obj, true) && !((s7p) this.f139686b).f206450b.isEnabled()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 12:
                return k0e1.m54986e(((tsb) this.f139686b).mo24819a((ContextTrack) obj), dau.f47107a);
            case 13:
                return (vda1) this.f139686b;
            case 15:
                t7q t7qVar = (t7q) ((xvo) this.f139686b).f266440b;
                int iOrdinal = ((qp21) obj).ordinal();
                if (iOrdinal == 0) {
                    return Single.create(new xjp(new q7q(t7qVar, 1), t7qVar, to21.f222163a));
                }
                if (iOrdinal == 1) {
                    return Single.create(new xjp(new q7q(t7qVar, 0), t7qVar, new so21(null)));
                }
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return Single.create(new xjp(new q7q(t7qVar, 2), t7qVar, new so21(null)));
            case 25:
                return ((hwk0) this.f139686b).m48940a(((i4s) obj).f98580a).distinctUntilChanged().map(hcp0.f89858Q0).onErrorComplete();
            default:
                foe1 foe1VarM98235x = YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs.m98235x();
                dse1 dse1Var = (dse1) this.f139686b;
                doe1 doe1VarM98224q = YourLibraryConfig$YourLibraryPredefinedPlaylistConfig.m98224q();
                eoe1 eoe1Var = eoe1.INCLUDE_IF_NOT_EMPTY;
                doe1VarM98224q.m36531q(eoe1Var);
                foe1VarM98235x.m42281v((YourLibraryConfig$YourLibraryPredefinedPlaylistConfig) doe1VarM98224q.build());
                doe1 doe1VarM98224q2 = YourLibraryConfig$YourLibraryPredefinedPlaylistConfig.m98224q();
                doe1VarM98224q2.m36531q(eoe1Var);
                foe1VarM98235x.m42285z((YourLibraryConfig$YourLibraryPredefinedPlaylistConfig) doe1VarM98224q2.build());
                doe1 doe1VarM98224q3 = YourLibraryConfig$YourLibraryPredefinedPlaylistConfig.m98224q();
                doe1VarM98224q3.m36531q(eoe1Var);
                foe1VarM98235x.m42278s((YourLibraryConfig$YourLibraryPredefinedPlaylistConfig) doe1VarM98224q3.build());
                coe1 coe1VarM98220r = YourLibraryConfig$YourLibraryLabelAndImage.m98220r();
                coe1VarM98220r.m33503r(dse1Var.m36763e());
                coe1VarM98220r.m33501m("https://misc.scdn.co/new-episodes/ne-cover-300x300.png");
                foe1VarM98235x.m42283x((YourLibraryConfig$YourLibraryLabelAndImage) coe1VarM98220r.build());
                if (((ouo0) obj).f170328a != 1) {
                    doe1 doe1VarM98224q4 = YourLibraryConfig$YourLibraryPredefinedPlaylistConfig.m98224q();
                    doe1VarM98224q4.m36531q(eoe1Var);
                    foe1VarM98235x.m42276q((YourLibraryConfig$YourLibraryPredefinedPlaylistConfig) doe1VarM98224q4.build());
                }
                return (YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs) foe1VarM98235x.build();
        }
    }

    @Override // p204p.nka1
    /* JADX INFO: renamed from: b */
    public void mo40487b(String str) {
        ((gh00) this.f139686b).invoke(new vuq(str));
    }

    /* JADX INFO: renamed from: c */
    public f5k m60722c(pck pckVar, boolean z) {
        return new f5k(z ? "campfire_delete_contribution_for_me" : "campfire_delete_contribution_for_everyone", (wwu) bpu.f29605c, (c5k) null, Integer.valueOf(z ? R.string.menu_item_delete_contribution_for_me : R.string.menu_item_delete_contribution_for_everyone), (String) null, false, (p221) null, new e5k(new v4k(3), 1, z ? new d5k(rhq.f199284S0, rhq.f199285T0) : new d5k(rhq.f199286U0, rhq.f199287V0), new u20(this, pckVar, z, 7)), 244);
    }

    /* JADX INFO: renamed from: d */
    public ln9 m60723d() {
        fy80 fy80Var = (fy80) this.f139686b;
        vmz vmzVar = fy80Var.f74629n;
        jg31.m53271i(vmzVar);
        gle1 gle1Var = fy80Var.f74637r;
        jg31.m53271i(gle1Var);
        l3v l3vVar = fy80Var.f74649x;
        jg31.m53271i(l3vVar);
        return new ln9(new yho(vmzVar, gle1Var, l3vVar, fy80Var.f74561F0, fy80Var.f74563G0, fy80Var.f74593V0, 9), 23);
    }

    /* JADX INFO: renamed from: e */
    public a99 m60724e() {
        fy80 fy80Var = (fy80) this.f139686b;
        mm90 mm90Var = fy80Var.f74588T;
        oyp0 oyp0Var = fy80Var.f74594W;
        mi80 mi80Var = fy80Var.f74576N;
        jg31.m53271i(mi80Var);
        epx epxVar = fy80Var.f74554C;
        jg31.m53271i(epxVar);
        pne1 pne1Var = fy80Var.f74592V;
        jg31.m53271i(pne1Var);
        ewk0 ewk0Var = fy80Var.f74600Z;
        jg31.m53271i(ewk0Var);
        da80 da80Var = new da80(mi80Var, epxVar, pne1Var, ewk0Var, 27);
        zre1 zre1Var = fy80Var.f74577N0;
        jg31.m53271i(zre1Var);
        return new a99(new z9t(mm90Var, oyp0Var, da80Var, zre1Var, 13), 29);
    }

    /* JADX INFO: renamed from: f */
    public ArrayList m60725f(long j, String str) {
        j2r j2rVar = (j2r) this.f139686b;
        String strMo48710e = ((hv31) j2rVar.f108128b).mo48710e(dct.f47639a, null);
        List<gct> list = (strMo48710e == null || strMo48710e.length() == 0) ? lau.f131415a : ((jct) ((fk60) j2rVar.f108129c).m41880a(strMo48710e, jct.Companion.serializer())).f111188a;
        long j2 = j - 86400000;
        ArrayList arrayList = new ArrayList();
        for (gct gctVar : list) {
            if (j2 < gctVar.f78656b && !wj50.m88271j(gctVar.f78655a, str)) {
                arrayList.add(gctVar);
            }
        }
        return arrayList;
    }

    @Override // p204p.w1j0
    /* JADX INFO: renamed from: g */
    public v1j0 mo24517g(Intent intent, e301 e301Var) {
        Set set = dd41.f47702f;
        dd41 dd41VarM74726U = r46.m74726U(intent.getDataString());
        Uri uri = dd41VarM74726U.f47707a;
        if (uri == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (pathSegments.size() <= 2) {
            return p1j0.f173119a;
        }
        String str = pathSegments.get(2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        z350 z350VarM63411S = n0e1.m63411S(n0e1.m63417Y(3, pathSegments.size()), 2);
        int i = z350VarM63411S.f278778a;
        int i2 = z350VarM63411S.f278779b;
        int i3 = z350VarM63411S.f278780c;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (true) {
                String str2 = pathSegments.get(i);
                String str3 = (String) g6f.m43747t0(i + 1, pathSegments);
                if (str3 != null) {
                    linkedHashMap.put(str2, str3);
                }
                if (i == i2) {
                    break;
                }
                i += i3;
            }
        }
        for (String str4 : uri.getQueryParameterNames()) {
            String queryParameter = uri.getQueryParameter(str4);
            if (queryParameter != null) {
                linkedHashMap.put(str4, bm51.m29801l0(queryParameter, "/", ":"));
            }
        }
        wj50.m88279p(str);
        return new u1j0(g4o0.class, new opr(str, linkedHashMap, nyg1.m65891r(dd41VarM74726U), nyg1.m65890q(dd41VarM74726U), true, ((t36) ((o12) this.f139686b).f160572c).m79979k()), uzq0.f235620a);
    }

    @Override // com.spotify.mobius.functions.Producer
    public Object get() {
        switch (this.f139685a) {
            case 16:
                return new SchedulerWorkRunner(((daq) this.f139686b).f47091c);
            default:
                luk lukVar = ((EarlyInitializationProvider) this.f139686b).f4270e;
                if (lukVar != null) {
                    return new DispatcherWorker(lukVar);
                }
                wj50.m88260d0("defaultDispatcher");
                throw null;
        }
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        switch (this.f139685a) {
            case 3:
                Boolean bool = (Boolean) obj;
                e4p e4pVar = (e4p) this.f139686b;
                EncoreButton encoreButton = e4pVar.f56122a;
                wj50.m88279p(bool);
                encoreButton.setLongClickable(bool.booleanValue());
                e4pVar.f56122a.setContentDescription(e4pVar.f56123b.getContext().getString(bool.booleanValue() ? R.string.endless_dj_button_content_description_with_interactivity : R.string.endless_dj_button_content_description));
                return;
            case 4:
                d7i d7iVar = (d7i) obj;
                j5p j5pVar = (j5p) this.f139686b;
                wj50.m88279p(d7iVar);
                d03 d03Var = j5pVar.f109054e;
                List list = d7iVar.f46215p;
                boolean z = false;
                if (!list.isEmpty()) {
                    c7i c7iVar = d7iVar.f46219t;
                    if ((c7iVar != null ? c7iVar.f34907e : 0) != 2) {
                        z = true;
                    }
                }
                if (z) {
                    ((ComposeView) d03Var.f43732h).setContent(new fyf(new h5p(list, j5pVar, d7iVar, 1), true, -1697095324));
                    return;
                } else {
                    ((ComposeView) d03Var.f43732h).setVisibility(8);
                    return;
                }
            case 7:
                String str = (String) obj;
                map mapVar = (map) this.f139686b;
                u12 u12Var = mapVar.f141631a;
                qyy0 qyy0Var = mapVar.f141632b;
                dxl dxlVar = new dxl(16, mapVar, qyy0Var);
                MotionLayout motionLayout = (MotionLayout) qyy0Var.f194059b;
                ArtworkView artworkView = (ArtworkView) qyy0Var.f194060c;
                if (str == null || str.length() == 0) {
                    motionLayout.m330E(R.id.start).m31746v(artworkView.getId(), 8);
                    motionLayout.m330E(R.id.end).m31746v(artworkView.getId(), 8);
                } else {
                    motionLayout.m330E(R.id.start).m31746v(artworkView.getId(), 0);
                    motionLayout.m330E(R.id.end).m31746v(artworkView.getId(), 0);
                }
                artworkView.mo2821c(dxlVar);
                artworkView.mo2820d(new z66(new h66(str), true));
                if (str == null || str.length() == 0) {
                    fn20.m42197a(u12Var, (MotionLayout) qyy0Var.f194059b, (TextView) qyy0Var.f194057Z);
                    ((BehaviorRetainingAppBarLayout) u12Var.f225650d).setBackgroundColor(mapVar.f141633c);
                    return;
                }
                return;
            case 9:
                ((ArtworkView) ((kc5) ((suo) this.f139686b).f214157b).f121367c).mo2820d(new u66(new h66((String) obj), false));
                return;
            case 14:
                g0q g0qVar = (g0q) this.f139686b;
                x1p0 x1p0Var = g0qVar.f75421f;
                fyq0 fyq0Var = g0qVar.f75413X;
                if (fyq0Var == null) {
                    wj50.m88260d0("headerModel");
                    throw null;
                }
                if (fyq0Var.f74820f) {
                    ((ImageButton) x1p0Var.f257251f).setVisibility(8);
                    return;
                } else {
                    ((ImageButton) x1p0Var.f257251f).setVisibility(0);
                    return;
                }
            case 17:
                nf81 nf81Var = (nf81) obj;
                adq adqVar = (adq) this.f139686b;
                wj50.m88279p(nf81Var);
                ContentRestrictionBadgeView contentRestrictionBadgeView = (ContentRestrictionBadgeView) adqVar.f14659d.f56511h;
                if (nf81Var.f153296l) {
                    contentRestrictionBadgeView.mo2820d(qsj.f192127a);
                    return;
                } else {
                    contentRestrictionBadgeView.mo2820d(qsj.f192130d);
                    return;
                }
            case 18:
                List list2 = (List) obj;
                tdq tdqVar = (tdq) this.f139686b;
                FacePileView facePileView = tdqVar.f219455d;
                e940 e940Var = tdqVar.f219453b;
                if (!list2.isEmpty()) {
                    list2.subList(1, list2.size());
                }
                omo0.m67370v(e940Var, null, facePileView.f3809a, list2, facePileView.f3811c, null);
                return;
            case 19:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                deq deqVar = (deq) this.f139686b;
                wg61 wg61Var = deqVar.f48154i;
                deqVar.f48144X = zBooleanValue;
                if (!zBooleanValue || ((Animator) wg61Var.getValue()).isStarted()) {
                    return;
                }
                ((Animator) wg61Var.getValue()).start();
                return;
            default:
                ((TextView) ((tw80) ((suo) this.f139686b).f214158c).f224372h).setText((String) obj);
                return;
        }
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        return !wj50.m88271j(((qa5) obj).f186753a, ((kb5) this.f139686b).m55931a());
    }

    public /* synthetic */ m3n(Object obj, int i) {
        this.f139685a = i;
        this.f139686b = obj;
    }
}
