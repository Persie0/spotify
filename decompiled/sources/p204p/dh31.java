package p204p;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.RemoteViews;
import android.widget.TextView;
import com.comscore.streaming.AdvertisementType;
import com.comscore.streaming.ContentDistributionModel;
import com.comscore.util.crashreport.CrashReportManager;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.spotify.base.java.logging.Logger;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class dh31 implements Function, rdc1, r7l0, fl11, InterfaceC2207oa, vd21, tut {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48972a;

    /* JADX INFO: renamed from: b */
    public final Object f48973b;

    /* JADX INFO: renamed from: c */
    public final Object f48974c;

    public /* synthetic */ dh31(int i, Object obj, Object obj2) {
        this.f48972a = i;
        this.f48973b = obj;
        this.f48974c = obj2;
    }

    /* JADX INFO: renamed from: h */
    public static RemoteViews m35964h(Context context, hg41 hg41Var) {
        String packageName = context.getPackageName();
        boolean z = hg41Var.f91034j;
        RemoteViews remoteViews = new RemoteViews(packageName, z ? R.layout.material_you_widget : R.layout.widget);
        Bitmap bitmap = hg41Var.f91025a;
        if (bitmap != null) {
            remoteViews.setImageViewBitmap(R.id.coverart, bitmap);
        } else {
            remoteViews.setImageViewResource(R.id.coverart, R.drawable.widget_placeholder);
        }
        remoteViews.setTextViewText(R.id.title, hg41Var.f91028d);
        remoteViews.setTextViewText(R.id.artist, hg41Var.f91029e);
        if (!z) {
            remoteViews.setInt(R.id.info_container, "setBackgroundColor", hg41Var.f91026b);
            remoteViews.setInt(R.id.controls, "setBackgroundColor", hg41Var.f91027c);
        }
        m35967y(remoteViews, context, hg41Var.f91030f);
        m35965w(remoteViews, context, hg41Var.f91031g);
        m35966x(remoteViews, context, hg41Var.f91032h);
        PendingIntent pendingIntent = hg41Var.f91033i;
        remoteViews.setOnClickPendingIntent(R.id.widget_layout, pendingIntent);
        remoteViews.setOnClickPendingIntent(R.id.coverart, pendingIntent);
        remoteViews.setOnClickPendingIntent(R.id.title, pendingIntent);
        remoteViews.setOnClickPendingIntent(R.id.artist, pendingIntent);
        return remoteViews;
    }

    /* JADX INFO: renamed from: w */
    public static void m35965w(RemoteViews remoteViews, Context context, n3h1 n3h1Var) {
        if (n3h1Var instanceof voo0) {
            remoteViews.setViewVisibility(R.id.btn_play_disabled, 8);
            remoteViews.setViewVisibility(R.id.btn_play_normal, 8);
            remoteViews.setViewVisibility(R.id.btn_pause_disabled, 0);
            remoteViews.setViewVisibility(R.id.btn_pause_normal, 8);
            return;
        }
        if (n3h1Var instanceof woo0) {
            remoteViews.setViewVisibility(R.id.btn_play_disabled, 8);
            remoteViews.setViewVisibility(R.id.btn_play_normal, 8);
            remoteViews.setViewVisibility(R.id.btn_pause_disabled, 8);
            remoteViews.setViewVisibility(R.id.btn_pause_normal, 0);
            remoteViews.setOnClickPendingIntent(R.id.btn_pause_normal, PendingIntent.getBroadcast(context, 1, ((woo0) n3h1Var).f253525b, 201326592));
            return;
        }
        if (n3h1Var instanceof xoo0) {
            remoteViews.setViewVisibility(R.id.btn_play_disabled, 0);
            remoteViews.setViewVisibility(R.id.btn_play_normal, 8);
            remoteViews.setViewVisibility(R.id.btn_pause_disabled, 8);
            remoteViews.setViewVisibility(R.id.btn_pause_normal, 8);
            return;
        }
        if (!(n3h1Var instanceof yoo0)) {
            throw new NoWhenBranchMatchedException();
        }
        remoteViews.setViewVisibility(R.id.btn_play_disabled, 8);
        remoteViews.setViewVisibility(R.id.btn_play_normal, 0);
        remoteViews.setViewVisibility(R.id.btn_pause_disabled, 8);
        remoteViews.setViewVisibility(R.id.btn_pause_normal, 8);
        remoteViews.setOnClickPendingIntent(R.id.btn_play_normal, PendingIntent.getBroadcast(context, 1, ((yoo0) n3h1Var).f274711b, 201326592));
    }

    /* JADX INFO: renamed from: x */
    public static void m35966x(RemoteViews remoteViews, Context context, c95 c95Var) {
        if (!(c95Var instanceof xk21)) {
            remoteViews.setViewVisibility(R.id.btn_next_disabled, 0);
            remoteViews.setViewVisibility(R.id.btn_next_normal, 8);
        } else {
            remoteViews.setViewVisibility(R.id.btn_next_disabled, 8);
            remoteViews.setViewVisibility(R.id.btn_next_normal, 0);
            remoteViews.setOnClickPendingIntent(R.id.btn_next_normal, PendingIntent.getBroadcast(context, 1, ((xk21) c95Var).f262266e, 201326592));
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m35967y(RemoteViews remoteViews, Context context, c95 c95Var) {
        if (!(c95Var instanceof xk21)) {
            remoteViews.setViewVisibility(R.id.btn_prev_disabled, 0);
            remoteViews.setViewVisibility(R.id.btn_prev_normal, 8);
        } else {
            remoteViews.setViewVisibility(R.id.btn_prev_disabled, 8);
            remoteViews.setViewVisibility(R.id.btn_prev_normal, 0);
            remoteViews.setOnClickPendingIntent(R.id.btn_prev_normal, PendingIntent.getBroadcast(context, 1, ((xk21) c95Var).f262266e, 201326592));
        }
    }

    @Override // p204p.vd21
    /* JADX INFO: renamed from: V */
    public void mo27465V() {
        ParagraphView paragraphView = (ParagraphView) this.f48973b;
        paragraphView.setVisibility(0);
        paragraphView.setAlpha(0.0f);
        paragraphView.m4191u(((rbm) this.f48974c).f197634i);
    }

    @Override // p204p.fl11
    /* JADX INFO: renamed from: a */
    public tjo mo25659a() {
        return (tjo) this.f48973b;
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        return ((lo51) this.f48973b).f135305c && ((aq51) this.f48974c).m26741a(((ihi) obj).f102294a);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        int i = this.f48972a;
        Object obj2 = this.f48973b;
        Object obj3 = this.f48974c;
        switch (i) {
            case 0:
                String str = ((xg31) obj).f261192a ? x09.f256832d : x09.f256833e;
                return x09.m89509H((x09) ((khy0) obj2).f122742b, str, null, 2, null).toObservable().map(new wah1(str, 11)).timeout(10000L, TimeUnit.MILLISECONDS, (Scheduler) obj3, Observable.error(new TimeoutException())).onErrorReturn(new jbh1(str, 9));
            case 1:
                return Collections.singletonMap(((n3v0) obj2).f150140d.f204979a, new z19(new z2c((List) obj, false, null, gbu.f78413a, new nd6(31)).mo34825c((List) obj3)));
            case 12:
                Logger.m3967c((Throwable) obj, "Assisted Curation: Failed to expand episode recommendations", new Object[0]);
                return ((ok21) obj2).m67129k((AbstractC1961i) obj3, lau.f131415a, false);
            case 19:
                gqx gqxVar = (gqx) obj;
                String str2 = (String) obj2;
                ktx ktxVar = gqxVar.mo45449a(ks81.class, str2).f72301b;
                if (ktxVar != null) {
                    return ((AbstractC1806e9) obj3).mo38176r1(ktxVar);
                }
                int i2 = gqxVar.mo45449a(ks81.class, str2).f72302c.f61974b;
                StringBuilder sbM38572u = edb.m38572u("Missing metadata for Uri: ", str2, ". Response cacheStatus: ");
                sbM38572u.append(j4x.m52422t(i2));
                sbM38572u.append(".");
                throw new IllegalStateException(sbM38572u.toString());
            case 20:
                Boolean bool = (Boolean) obj;
                dd41 dd41Var = (dd41) obj3;
                en81 en81Var = (en81) obj2;
                if (!en81Var.f61105t.f116131c || !bool.booleanValue()) {
                    return !en81Var.f61103h.m92790a() ? en81Var.m39479e(dd41Var) : en81Var.m39477c(dd41Var).flatMap(new ae41(12, en81Var, dd41Var));
                }
                String strConcat = "spotify:internal:multi-song-track:".concat(dd41Var.m35710h());
                Set set = dd41.f47702f;
                return Single.just(new r1j0(r46.m74726U(strConcat)));
            default:
                Boolean bool2 = (Boolean) obj;
                i82 i82Var = (i82) obj3;
                wu81 wu81Var = (wu81) obj2;
                boolean z = wu81Var.f255125c;
                boolean z2 = !z;
                boolean z3 = !bool2.booleanValue();
                return ((z4w) ((p4w) i82Var.f99668d)).m95379m(wu81Var.f255124b, null, null, (voc1) i82Var.f99666b, new a5w(null, z2, false, false, bool2.booleanValue() || z, false, true, false, false, !z, false, false, bool2.booleanValue(), i82Var.f99665a, false, z3, null, null, false, false, false, false, null, false, null, false, null, 1073695781));
        }
    }

    @Override // p204p.tut
    /* JADX INFO: renamed from: b */
    public void mo27645b(Object obj) {
        ((tut) this.f48973b).mo27645b(((gh00) this.f48974c).invoke(obj));
    }

    /* JADX INFO: renamed from: c */
    public i8g0 m35968c(String str) {
        return new i8g0(str, ((thm0) this.f48974c).m80861b(j101.f107584a));
    }

    @Override // p204p.fl11
    /* JADX INFO: renamed from: d */
    public boolean mo25662d(km51 km51Var, Object obj) {
        bm41 bm41Var = (bm41) obj;
        am41 am41Var = (am41) this.f48974c;
        String str = am41Var.f17041b;
        String str2 = am41Var.f17042c;
        uu41 uu41Var = bm41Var.f28377b;
        boolean z = uu41Var != null && uu41Var.f234107b;
        boolean z2 = uu41Var != null && uu41Var.f234106a;
        hz80 hz80Var = bm41Var.f28376a;
        mzs0 mzs0VarM38006g0 = e72.m38006g0(km51Var, str, z, z2, hz80Var.f96832h, str2, null, hz80Var.f96818S0, hz80Var.f96822X);
        return (mzs0VarM38006g0 instanceof yqr0 ? (yqr0) mzs0VarM38006g0 : null) != null;
    }

    @Override // p204p.tut
    public void dispose() {
        ((tut) this.f48973b).dispose();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: e */
    public Object m35969e(int i, vqb vqbVar, ibk ibkVar) {
        jc61 jc61Var;
        Context context = (Context) this.f48973b;
        if (ibkVar instanceof jc61) {
            jc61Var = (jc61) ibkVar;
            int i2 = jc61Var.f111005e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jc61Var.f111005e = i2 - Integer.MIN_VALUE;
            } else {
                jc61Var = new jc61(this, ibkVar);
            }
        } else {
            jc61Var = new jc61(this, ibkVar);
        }
        Object objM86755t = jc61Var.f111003c;
        int i3 = jc61Var.f111005e;
        if (i3 == 0) {
            bga.m29073P(objM86755t);
            fiz fizVarM70708b = ((prb) this.f48974c).m70708b();
            jc61Var.f111002b = vqbVar;
            jc61Var.f111001a = i;
            jc61Var.f111005e = 1;
            objM86755t = vyf1.m86755t(fizVarM70708b, jc61Var);
            yuk yukVar = yuk.f276404a;
            if (objM86755t == yukVar) {
                return yukVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = jc61Var.f111001a;
            vqbVar = jc61Var.f111002b;
            bga.m29073P(objM86755t);
        }
        hc61 cc61Var = null;
        if (((Boolean) objM86755t).booleanValue() && vqbVar != null) {
            String string = context.getString(R.string.canvas_content_description);
            String str = vqbVar.f243909b;
            if (str.length() != 0) {
                int iM38547C = edb.m38547C(vqbVar.f243911d);
                if (iM38547C == 0) {
                    cc61Var = new cc61(Uri.parse(str), string);
                } else if (iM38547C == 1 || iM38547C == 2 || iM38547C == 3) {
                    cc61Var = new fc61(Uri.parse(str), string);
                }
            }
        }
        long jM75432b = rfg1.m75432b(i);
        String string2 = context.getString(R.string.color_swatch_content_description);
        ArrayList arrayList = new ArrayList();
        if (cc61Var != null) {
            arrayList.add(cc61Var);
        }
        arrayList.add(new zb61(h6f.m46715L(new Integer(rfg1.m75429D(jM75432b)), new Integer(rfg1.m75429D(jM75432b))), string2));
        arrayList.add(new zb61(h6f.m46715L(new Integer(rfg1.m75429D(jM75432b)), new Integer(rfg1.m75429D(n6f.f150862b))), string2));
        if (arrayList.size() < 3) {
            arrayList.add(new zb61(h6f.m46715L(-15987957, -15987957), context.getString(R.string.color_swatch_content_description)));
        }
        arrayList.add(new dc61(Uri.parse("https://sharing-assets.spotifycdn.com/IA/themed_scribbles.png"), context.getString(R.string.themed_swatch_content_description)));
        return new ic61(arrayList);
    }

    /* JADX INFO: renamed from: f */
    public void m35970f() {
        ((yum0) this.f48974c).setValue(null);
        l1a1 l1a1Var = (l1a1) this.f48973b;
        l1a1Var.f128677b.clear();
        l1a1Var.f128678c.clear();
    }

    /* JADX INFO: renamed from: g */
    public axx m35971g(avo0 avo0Var, String str) {
        Uri uri;
        String str2 = avo0Var.f20232a;
        Set set = dd41.f47702f;
        dd41 dd41VarM74726U = r46.m74726U(str2);
        gn80 gn80Var = dd41VarM74726U.f47709c;
        String strM35976m = avo0Var.f20237f;
        String str3 = avo0Var.f20232a;
        if (str3.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || str3.equals("spotify:collection:tracks") || str3.equals("spotify:internal:collection:tracks") || (bm51.m29803n0(str3, "spotify:user:", false) && bm51.m29796g0(str3, ":collection", false))) {
            return m35975l(avo0Var, Uri.parse("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ"), gn80Var, strM35976m);
        }
        he41 he41Var = dd41VarM74726U.f47710d;
        fka1 type = he41Var != null ? he41Var.getType() : null;
        if (type == ivp0.f106258f) {
            uri = Uri.parse(r46.m74728W(dd41VarM74726U.m35710h()).m35694A());
            strM35976m = m35976m(avo0Var, strM35976m);
        } else if (type != avp0.f20242e) {
            switch (gn80Var.ordinal()) {
                case 30:
                case 42:
                case 174:
                case 176:
                case 861:
                    uri = Uri.parse(str3);
                    strM35976m = avo0Var.f20235d;
                    break;
                case 33:
                case 60:
                case 197:
                case 286:
                case 349:
                case 650:
                case 755:
                case 756:
                case 757:
                case 758:
                case 760:
                case ContentDistributionModel.TV_AND_ONLINE /* 901 */:
                case ContentDistributionModel.EXCLUSIVELY_ONLINE /* 902 */:
                case 928:
                case 965:
                    uri = Uri.parse(str3);
                    break;
                case 169:
                    uri = Uri.parse("spotify:playlist:37i9dQZF1CIl0ks0ynmzpD");
                    break;
                case 198:
                    uri = Uri.parse("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ");
                    break;
                case 210:
                case AdvertisementType.ON_DEMAND_PRE_ROLL /* 211 */:
                    String strM35694A = r46.m74736w(str).m35694A();
                    uri = strM35694A == null ? Uri.EMPTY : Uri.parse(strM35694A);
                    break;
                case 845:
                case 925:
                    uri = Uri.parse(str3);
                    break;
                default:
                    uri = Uri.EMPTY;
                    break;
            }
        } else {
            uri = Uri.parse(str3);
            strM35976m = m35976m(avo0Var, strM35976m);
        }
        return m35975l(avo0Var, uri, gn80Var, strM35976m);
    }

    @Override // p204p.rdc1
    public View getRoot() {
        return (h9q) this.f48973b;
    }

    /* JADX INFO: renamed from: i */
    public void m35972i() {
        ((wy3) ((xre) this.f48973b)).getClass();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        Iterator it = ((LinkedHashMap) this.f48974c).values().iterator();
        while (it.hasNext() && jElapsedRealtimeNanos - ((Number) it.next()).longValue() > 86400000000000L) {
            it.remove();
        }
    }

    /* JADX INFO: renamed from: j */
    public void m35973j() {
        yum0 yum0Var = (yum0) this.f48974c;
        oa31 oa31VarM58610i = lb5.m58610i();
        gh00 gh00VarMo28816e = oa31VarM58610i != null ? oa31VarM58610i.mo28816e() : null;
        oa31 oa31VarM58611j = lb5.m58611j(oa31VarM58610i);
        try {
            sf71 sf71Var = (sf71) yum0Var.getValue();
            lb5.m58615n(oa31VarM58610i, oa31VarM58611j, gh00VarMo28816e);
            if (sf71Var != null) {
                l1a1 l1a1Var = (l1a1) this.f48973b;
                gb31 gb31Var = l1a1Var.f128677b;
                gb31 gb31Var2 = l1a1Var.f128678c;
                gb31Var2.clear();
                while (gb31Var2.size() + gb31Var.size() > l1a1Var.f128676a - 1) {
                    j6f.m52568Z(gb31Var);
                }
                gb31Var.add(sf71Var);
            }
            yum0Var.setValue(null);
        } catch (Throwable th) {
            lb5.m58615n(oa31VarM58610i, oa31VarM58611j, gh00VarMo28816e);
            throw th;
        }
    }

    /* JADX INFO: renamed from: k */
    public xug0 m35974k() {
        jh91 jh91Var = ((hj91) this.f48974c).f91998a;
        if (wj50.m88271j(jh91Var, ch91.f37968d)) {
            return new xug0(2);
        }
        if (wj50.m88271j(jh91Var, dh91.f49023d)) {
            return new xug0(3);
        }
        if (wj50.m88271j(jh91Var, fh91.f69614d)) {
            return new xug0(5);
        }
        if (wj50.m88271j(jh91Var, gh91.f79859d)) {
            return new xug0(6);
        }
        if (wj50.m88271j(jh91Var, eh91.f59520d)) {
            return new xug0(4);
        }
        if (wj50.m88271j(jh91Var, hh91.f91309d)) {
            return new xug0(7);
        }
        if (wj50.m88271j(jh91Var, ih91.f102214d)) {
            return new xug0(8);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: l */
    public axx m35975l(avo0 avo0Var, Uri uri, gn80 gn80Var, String str) {
        int i;
        Uri uri2;
        Uri uri3;
        Uri uri4;
        Uri uriM34434e;
        czd0 czd0Var = (czd0) this.f48973b;
        Uri uri5 = Uri.EMPTY;
        if (uri == uri5) {
            na6.m63957e("Couldn't create a playable uri from the playlistUri = " + avo0Var.f20232a + ", linkType = " + gn80Var);
            return null;
        }
        int iOrdinal = gn80Var.ordinal();
        int i2 = 3;
        if (iOrdinal != 42) {
            i = iOrdinal != 861 ? 3 : 2;
        } else {
            i = 1;
        }
        String str2 = avo0Var.f20238g;
        if (str2 != null) {
            Uri uri6 = Uri.parse(str2);
            Uri uriM34434e2 = czd0Var.m34434e(uri6, i, 3);
            Uri uriM34434e3 = czd0Var.m34434e(uri6, i, 2);
            uriM34434e = czd0Var.m34434e(uri6, i, 1);
            uri2 = uri6;
            uri3 = uriM34434e2;
            uri4 = uriM34434e3;
        } else {
            uri2 = uri5;
            uri3 = uri2;
            uri4 = uri3;
            uriM34434e = uri4;
        }
        String string = uri.toString();
        String str3 = avo0Var.f20234c;
        String string2 = uri.toString();
        Set set = dd41.f47702f;
        return new axx(string, null, str3, str, uri2, uri3, uri4, uriM34434e, uri, Uri.parse(r46.m74726U(string2).m35728z()), 1, false, false, false, false, i2, 4, null, null, null, false, null, null, null, 0, null, avo0Var.f20236e, null, null, null, null, null, null, 536870912, 2);
    }

    /* JADX INFO: renamed from: m */
    public String m35976m(avo0 avo0Var, String str) {
        Context context = (Context) this.f48974c;
        if (TextUtils.isEmpty(str)) {
            return TextUtils.isEmpty(avo0Var.f20235d) ? context.getString(R.string.playlist_fallback_general_subtitle) : context.getString(R.string.playlist_fallback_subtitle, avo0Var.f20235d);
        }
        return str;
    }

    /* JADX INFO: renamed from: n */
    public d850 m35977n(String str) {
        kv91 kv91Var = (kv91) ((n8n) this.f48974c).get();
        yt91 yt91VarM96903c = ((d2h0) this.f48973b).f44567a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("user_plan_card", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
        yt91VarM96903c2.f276055i.add(new bu91("add_member_help_row", null, null, null, null));
        yt91VarM96903c2.f276056j = false;
        zt91 zt91VarM94607a = yt91VarM96903c2.m94607a();
        dv91 dv91Var = new dv91("hit", 1);
        String string = str.toString();
        if (string == null) {
            string = "";
        }
        return kv91Var.mo57453r(new av91("", "", dv91Var, new bv91("navigate_to_webview_uri", 1, Collections.singletonMap("destination", string)), zt91VarM94607a, st91.f213865b, System.currentTimeMillis()), null);
    }

    @Override // p204p.tut
    /* JADX INFO: renamed from: o */
    public void mo27656o(Object obj, cvt cvtVar) {
        ((tut) this.f48973b).mo27656o(obj, cvtVar);
    }

    @Override // p204p.r7l0
    public void onComplete(Task task) {
        e741 e741Var = (e741) this.f48973b;
        SplitInstallSessionState splitInstallSessionState = (SplitInstallSessionState) this.f48974c;
        if (e741Var.m38059e(g6f.m43753y0(splitInstallSessionState.moduleNames(), null, null, null, null, 63))) {
            e741Var.m38058d(g6f.m43753y0(splitInstallSessionState.moduleNames(), null, null, null, null, 63));
        }
    }

    /* JADX INFO: renamed from: p */
    public void m35978p() {
        kv91 kv91Var = (kv91) ((lgm) this.f48974c).get();
        yt91 yt91VarM96903c = ((i8g0) this.f48973b).f99785b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("add_to_plan_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
    }

    /* JADX INFO: renamed from: q */
    public d850 m35979q(String str) {
        kv91 kv91Var = (kv91) ((er70) this.f48974c).get();
        hog0 hog0Var = (hog0) this.f48973b;
        yt91 yt91VarM96903c = hog0Var.f93538c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("live_room_dialog", str, null, null, null));
        yt91VarM96903c.f276056j = true;
        return kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c.m94607a(), hog0Var.f93537b, System.currentTimeMillis()), null);
    }

    /* JADX INFO: renamed from: r */
    public d850 m35980r(String str) {
        kv91 kv91Var = (kv91) ((n8n) this.f48974c).get();
        yt91 yt91VarM96903c = ((d2h0) this.f48973b).f44567a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("user_plan_card", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
        yt91VarM96903c2.f276055i.add(new bu91("manage_member_row", null, null, null, null));
        yt91VarM96903c2.f276056j = false;
        zt91 zt91VarM94607a = yt91VarM96903c2.m94607a();
        dv91 dv91Var = new dv91("hit", 1);
        String string = str.toString();
        if (string == null) {
            string = "";
        }
        return kv91Var.mo57453r(new av91("", "", dv91Var, new bv91("navigate_to_webview_uri", 1, Collections.singletonMap("destination", string)), zt91VarM94607a, st91.f213865b, System.currentTimeMillis()), null);
    }

    /* JADX INFO: renamed from: s */
    public void m35981s() {
        ((kv91) this.f48973b).mo57453r(new av91("", "", new dv91("hit", 1), new bv91("retry", 1, nau.f152117a), ((cbh0) this.f48974c).f36128b, st91.f213865b, System.currentTimeMillis()), null);
    }

    /* JADX INFO: renamed from: t */
    public void m35982t() {
        kv91 kv91Var = (kv91) this.f48974c;
        l9g0 l9g0Var = (l9g0) this.f48973b;
        yt91 yt91VarM96903c = l9g0Var.f131086b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("your_dj_nudge", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = zt91VarM94607a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        nu91Var.f158542f = l9g0Var.f131087c;
        kv91Var.mo57449i((ou91) nu91Var.m87248a(), null);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0072  */
    /* JADX INFO: renamed from: u */
    public void m35983u(sf71 sf71Var) {
        sf71 sf71Var2;
        sf71 sf71Var3;
        yum0 yum0Var = (yum0) this.f48974c;
        String str = sf71Var.f208489c;
        oa31 oa31VarM58610i = lb5.m58610i();
        gh00 gh00VarMo28816e = oa31VarM58610i != null ? oa31VarM58610i.mo28816e() : null;
        oa31 oa31VarM58611j = lb5.m58611j(oa31VarM58610i);
        try {
            sf71 sf71Var4 = (sf71) yum0Var.getValue();
            lb5.m58615n(oa31VarM58610i, oa31VarM58611j, gh00VarMo28816e);
            if (sf71Var4 == null) {
                yum0Var.setValue(sf71Var);
                return;
            }
            boolean z = sf71Var4.f208493g;
            String str2 = sf71Var4.f208488b;
            String str3 = sf71Var4.f208489c;
            int i = sf71Var4.f208487a;
            int i2 = sf71Var4.f208494h;
            if (z) {
                boolean z2 = sf71Var.f208493g;
                String str4 = sf71Var.f208488b;
                int i3 = sf71Var.f208487a;
                if (z2) {
                    long j = sf71Var.f208492f;
                    long j2 = sf71Var4.f208492f;
                    if (j < j2 || j - j2 >= CrashReportManager.TIME_WINDOW || wj50.m88271j(str3, "\n") || wj50.m88271j(str3, "\r\n") || wj50.m88271j(str, "\n") || wj50.m88271j(str, "\r\n") || i2 != sf71Var.f208494h) {
                        sf71Var2 = null;
                    } else {
                        if (i2 == 1 && str3.length() + i == i3) {
                            sf71Var3 = new sf71(sf71Var4.f208487a, "", s571.m77250i(str3, str), sf71Var4.f208490d, sf71Var.f208491e, sf71Var4.f208492f, false, 64);
                        } else if (i2 != 2 || sf71Var4.m77999a() != sf71Var.m77999a() || (sf71Var4.m77999a() != 1 && sf71Var4.m77999a() != 2)) {
                            sf71Var2 = null;
                        } else if (i == str4.length() + i3) {
                            sf71Var3 = new sf71(sf71Var.f208487a, s571.m77250i(str4, str2), "", sf71Var4.f208490d, sf71Var.f208491e, sf71Var4.f208492f, false, 64);
                        } else {
                            int i4 = sf71Var4.f208487a;
                            if (i4 == i3) {
                                sf71Var2 = new sf71(i4, s571.m77250i(str2, str4), "", sf71Var4.f208490d, sf71Var.f208491e, sf71Var4.f208492f, false, 64);
                            } else {
                                sf71Var2 = null;
                            }
                        }
                        sf71Var2 = sf71Var3;
                    }
                } else {
                    sf71Var2 = null;
                }
            } else {
                sf71Var2 = null;
            }
            if (sf71Var2 != null) {
                yum0Var.setValue(sf71Var2);
            } else {
                m35973j();
                yum0Var.setValue(sf71Var);
            }
        } catch (Throwable th) {
            lb5.m58615n(oa31VarM58610i, oa31VarM58611j, gh00VarMo28816e);
            throw th;
        }
    }

    /* JADX INFO: renamed from: v */
    public synchronized void m35984v(byte[] bArr) {
        ((LinkedHashMap) this.f48974c).remove(new n461(bArr));
    }

    public dh31(xre xreVar) {
        this.f48972a = 13;
        this.f48973b = xreVar;
        this.f48974c = new LinkedHashMap();
    }

    public dh31(sf71 sf71Var, l1a1 l1a1Var) {
        this.f48972a = 16;
        this.f48973b = l1a1Var;
        this.f48974c = sam.m77645B(sf71Var);
    }

    public dh31(h9q h9qVar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f48972a = 2;
        this.f48973b = h9qVar;
        this.f48974c = textView5;
    }

    public dh31(am41 am41Var) {
        this.f48972a = 7;
        this.f48974c = am41Var;
        this.f48973b = pag1.m69486v(new rko(wyx.f256380X, 1, zl41.f283936i, new pko(new cm41(am41Var, 0)), zl41.f283937t), new rko(t6x0.f217619L0, 2, zl41.f283934g, new pko(zl41.f283933f), zl41.f283935h), ek41.f60379f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ dh31() {
        this.f48972a = 16;
        lau lauVar = lau.f131415a;
        this((sf71) null, new l1a1(100, lauVar, lauVar));
    }

    public dh31(czd0 czd0Var, Context context, mi80 mi80Var, ure ureVar) {
        this.f48972a = 3;
        this.f48973b = czd0Var;
        this.f48974c = context;
    }

    public dh31(Scheduler scheduler, Scheduler scheduler2) {
        this.f48972a = 4;
        this.f48974c = scheduler;
        this.f48973b = scheduler2;
    }
}
