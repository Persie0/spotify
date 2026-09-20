package p204p;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.base.java.logging.Logger;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.music.R;
import com.spotify.ontour.uiusecases.elements.dateoverlay.DateOverlayView;
import com.spotify.player.model.PlayerState;
import com.spotify.puffin_esperanto.proto.C1257xc49a5cdf;
import com.spotify.recently_played_esperanto.proto.GetRecentlyPlayedTracksResponse;
import com.spotify.widgets.npvwidget.WidgetInteraction;
import com.spotify.yourlibrary.uiusecases.elements.accessory.AccessoryView;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class fkr0 implements BiFunction, w1j0, Function, Predicate, com.spotify.mobius.functions.BiFunction, oec1, z7g1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f70613a;

    /* JADX INFO: renamed from: b */
    public static final fkr0 f70604b = new fkr0(0);

    /* JADX INFO: renamed from: c */
    public static final fkr0 f70605c = new fkr0(1);

    /* JADX INFO: renamed from: d */
    public static final fkr0 f70606d = new fkr0(2);

    /* JADX INFO: renamed from: e */
    public static final fkr0 f70607e = new fkr0(3);

    /* JADX INFO: renamed from: f */
    public static final fkr0 f70608f = new fkr0(4);

    /* JADX INFO: renamed from: g */
    public static final fkr0 f70609g = new fkr0(5);

    /* JADX INFO: renamed from: h */
    public static final fkr0 f70610h = new fkr0(6);

    /* JADX INFO: renamed from: i */
    public static final fkr0 f70611i = new fkr0(8);

    /* JADX INFO: renamed from: t */
    public static final fkr0 f70612t = new fkr0(9);

    /* JADX INFO: renamed from: X */
    public static final fkr0 f70598X = new fkr0(10);

    /* JADX INFO: renamed from: Y */
    public static final fkr0 f70600Y = new fkr0(11);

    /* JADX INFO: renamed from: Z */
    public static final fkr0 f70602Z = new fkr0(12);

    /* JADX INFO: renamed from: L0 */
    public static final fkr0 f70586L0 = new fkr0(13);

    /* JADX INFO: renamed from: M0 */
    public static final fkr0 f70587M0 = new fkr0(14);

    /* JADX INFO: renamed from: N0 */
    public static final fkr0 f70588N0 = new fkr0(15);

    /* JADX INFO: renamed from: O0 */
    public static final fkr0 f70589O0 = new fkr0(16);

    /* JADX INFO: renamed from: P0 */
    public static final fkr0 f70590P0 = new fkr0(17);

    /* JADX INFO: renamed from: Q0 */
    public static final fkr0 f70591Q0 = new fkr0(18);

    /* JADX INFO: renamed from: R0 */
    public static final fkr0 f70592R0 = new fkr0(19);

    /* JADX INFO: renamed from: S0 */
    public static final fkr0 f70593S0 = new fkr0(20);

    /* JADX INFO: renamed from: T0 */
    public static final fkr0 f70594T0 = new fkr0(21);

    /* JADX INFO: renamed from: U0 */
    public static final fkr0 f70595U0 = new fkr0(23);

    /* JADX INFO: renamed from: V0 */
    public static final fkr0 f70596V0 = new fkr0(24);

    /* JADX INFO: renamed from: W0 */
    public static final fkr0 f70597W0 = new fkr0(25);

    /* JADX INFO: renamed from: X0 */
    public static final fkr0 f70599X0 = new fkr0(26);

    /* JADX INFO: renamed from: Y0 */
    public static final fkr0 f70601Y0 = new fkr0(27);

    /* JADX INFO: renamed from: Z0 */
    public static final fkr0 f70603Z0 = new fkr0(28);

    public /* synthetic */ fkr0(int i) {
        this.f70613a = i;
    }

    /* JADX INFO: renamed from: a */
    public static d3q m41929a(Context context, View view, e940 e940Var, boolean z, boolean z2) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.library_row_layout, (ViewGroup) null, false);
        int i = R.id.accessory;
        AccessoryView accessoryView = (AccessoryView) vie1.m85629k(viewInflate, R.id.accessory);
        if (accessoryView != null) {
            i = R.id.artwork;
            ArtworkView artworkView = (ArtworkView) vie1.m85629k(viewInflate, R.id.artwork);
            if (artworkView != null) {
                i = R.id.content_column;
                LinearLayout linearLayout = (LinearLayout) vie1.m85629k(viewInflate, R.id.content_column);
                if (linearLayout != null) {
                    i = R.id.date_overlay;
                    DateOverlayView dateOverlayView = (DateOverlayView) vie1.m85629k(viewInflate, R.id.date_overlay);
                    if (dateOverlayView != null) {
                        i = R.id.progress;
                        View viewM85629k = vie1.m85629k(viewInflate, R.id.progress);
                        if (viewM85629k != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                            i = R.id.subtitle;
                            TextView textView = (TextView) vie1.m85629k(viewInflate, R.id.subtitle);
                            if (textView != null) {
                                i = R.id.subtitle_container;
                                LinearLayout linearLayout2 = (LinearLayout) vie1.m85629k(viewInflate, R.id.subtitle_container);
                                if (linearLayout2 != null) {
                                    i = R.id.title;
                                    TextView textView2 = (TextView) vie1.m85629k(viewInflate, R.id.title);
                                    if (textView2 != null) {
                                        nap.m64024q(-1, -2, constraintLayout);
                                        int dimensionPixelSize = context.getResources().getDimensionPixelSize(z ? R.dimen.library_row_denser_rows_cover_artwork_size : R.dimen.library_row_cover_art_size);
                                        constraintLayout.setMinHeight(dimensionPixelSize);
                                        ViewGroup.LayoutParams layoutParams = artworkView.getLayoutParams();
                                        if (layoutParams == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                                        }
                                        h6j h6jVar = (h6j) layoutParams;
                                        ((ViewGroup.MarginLayoutParams) h6jVar).width = dimensionPixelSize;
                                        ((ViewGroup.MarginLayoutParams) h6jVar).height = dimensionPixelSize;
                                        artworkView.setLayoutParams(h6jVar);
                                        artworkView.setViewContext(new r96(e940Var));
                                        q3r0 q3r0VarM26334q = alf1.m26334q(constraintLayout);
                                        Collections.addAll(q3r0VarM26334q.f184932c, textView2, textView);
                                        Collections.addAll(q3r0VarM26334q.f184933d, artworkView, dateOverlayView);
                                        q3r0VarM26334q.f184934e = false;
                                        q3r0VarM26334q.m72126a();
                                        textView2.setMaxLines(z2 ? 2 : 1);
                                        if (view != null) {
                                            psg1.m70832H(viewM85629k, view);
                                        } else {
                                            viewM85629k.setVisibility(8);
                                        }
                                        na6.m63961i(constraintLayout instanceof job, "Invalid row root, %s", constraintLayout);
                                        return new d3q(constraintLayout, accessoryView, artworkView, textView2, textView, linearLayout2, linearLayout, dateOverlayView);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    /* JADX INFO: renamed from: c */
    public static Next m41930c(xnb1 xnb1Var, String str) {
        return Next.m15605a(Effects.m15571a(new pm70(str, xnb1Var.f263576a)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0098, code lost:
    
        if (r0.equals("AVAILABLE") == false) goto L43;
     */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo98394apply(Object obj) {
        int i = this.f70613a;
        boolean z = true;
        nau nauVar = nau.f152117a;
        switch (i) {
            case 2:
                byte[] bArr = (byte[]) obj;
                try {
                    return C1257xc49a5cdf.m20016o(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.puffin_esperanto.proto.PuffinProcessingCompatibilityOuterClass.PuffinProcessingCompatibility: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 3:
                return Boolean.valueOf(((Float) obj).floatValue() >= 3.0f);
            case 4:
                return (GetRecentlyPlayedTracksResponse) GetRecentlyPlayedTracksResponse.m20235o().build();
            case 5:
                return gw90.f84957a;
            case 10:
                na6.m63957e("[Puffin] DisableProcessing failed: " + ((Throwable) obj));
                return Completable.m23286j(ivk.f106229a);
            case 14:
                return new nz21(((Boolean) obj).booleanValue());
            case 15:
                Map map = (Map) obj;
                String str = (String) map.get("smart-shuffle");
                if (str != null) {
                    int iHashCode = str.hashCode();
                    if (iHashCode == 1487498288) {
                        str.equals("UNAVAILABLE");
                    } else if (iHashCode != 2052692649) {
                        if (iHashCode == 2079508185 && str.equals("FORCED")) {
                            if (!dxf1.m37222K(map)) {
                                return u431.f226572b;
                            }
                            return u431.f226571a;
                        }
                    }
                    break;
                }
                return u431.f226573c;
            case 16:
                nx50 nx50Var = (nx50) obj;
                if (!nx50Var.f159369b && !nx50Var.f159370c) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 18:
                Logger.m3967c((Throwable) obj, "Assisted Curation: Failed to get episode recommendations", new Object[0]);
                return nauVar;
            case 19:
                return (Single) obj;
            case 20:
                Logger.m3967c((Throwable) obj, "Failed to lookup track when trying to navigate to an album.", new Object[0]);
                Set set = dd41.f47702f;
                return Single.just(new r1j0(r46.m74726U(WidgetInteraction.Background.DESTINATION_HOME)));
            case 25:
                Logger.m3967c((Throwable) obj, "Assisted Curation: Failed to fetch Your Episodes", new Object[0]);
                return nauVar;
            default:
                return Boolean.valueOf(gwg1.m45948t((String) ((Map) obj).get("filter-age-restricted-content"), false));
        }
    }

    @Override // p204p.oec1
    /* JADX INFO: renamed from: b */
    public eh00 mo41931b(AbstractC2441u6 abstractC2441u6) {
        e800 e800Var = new e800(abstractC2441u6, 1);
        abstractC2441u6.addOnAttachStateChangeListener(e800Var);
        return new gnb1(14, abstractC2441u6, e800Var);
    }

    @Override // p204p.w1j0
    /* JADX INFO: renamed from: g */
    public v1j0 mo24517g(Intent intent, e301 e301Var) {
        String str = e301Var.f55571a;
        Set set = dd41.f47702f;
        dd41 dd41VarM74726U = r46.m74726U(intent.getDataString());
        String strM35694A = dd41VarM74726U.m35694A();
        return (strM35694A == null || !wj50.m88271j(dd41VarM74726U.m35721s(), str)) ? p1j0.f173119a : new u1j0(s0s0.class, new t0s0(strM35694A, str), uzq0.f235620a);
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f70613a) {
            case 11:
                return !((iqx) ((gqx) obj)).f104863f;
            case 12:
                return !((iqx) ((gqx) obj)).f104863f;
            case 17:
                return ((PlayerState) obj).track().mo49279c();
            case 21:
                Collection collectionValues = ((Map) obj).values();
                if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        if (((ozw0) it.next()) instanceof mzw0) {
                            return false;
                        }
                    }
                }
                return true;
            default:
                return ((xul0) obj).mo49279c();
        }
    }

    @Override // p204p.z7g1
    public t9g1 zzb(Class cls) {
        if (!r3g1.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (t9g1) r3g1.m74642m(cls.asSubclass(r3g1.class)).mo29132j(3);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    @Override // p204p.z7g1
    public boolean zzc(Class cls) {
        return r3g1.class.isAssignableFrom(cls);
    }

    public fkr0(nc2 nc2Var) {
        this.f70613a = 29;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008d  */
    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        boolean z;
        int i;
        switch (this.f70613a) {
            case 0:
                return new d5x0(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            case 6:
                igr igrVar = (igr) obj;
                boolean z2 = false;
                if (dxf1.m37244s("is-mobile-only-tier", (Map) obj2)) {
                    return new xcw0(false, false);
                }
                boolean z3 = igrVar instanceof hgr;
                if (z3) {
                    ArrayList arrayList = ((hgr) igrVar).f91192a;
                    if (arrayList.isEmpty()) {
                        i = 0;
                    } else {
                        Iterator it = arrayList.iterator();
                        i = 0;
                        while (it.hasNext()) {
                            if (((fgr) it.next()).f69387b && (i = i + 1) < 0) {
                                h6f.m46721R();
                                throw null;
                            }
                        }
                    }
                    if (i > 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (z3 && rqg1.m76239j(((hgr) igrVar).f91192a)) {
                    z2 = true;
                }
                return new xcw0(z, z2);
            case 8:
                float fFloatValue = ((Number) obj2).floatValue();
                String str = ((pd40) obj).f176349a;
                if (str.length() == 0) {
                    str = null;
                }
                return new j6y0(true, str, fFloatValue);
            case 9:
                return new pqm0((am81) obj, (Boolean) obj2);
            default:
                return k621.m55575c((k621) obj, null, null, null, null, null, (mui0) obj2, false, null, null, 0, null, 16351);
        }
    }
}
