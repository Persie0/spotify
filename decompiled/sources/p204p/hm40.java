package p204p;

import android.content.Context;
import android.net.Uri;
import com.spotify.music.R;
import com.spotify.widgets.widgetstate.WidgetState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hm40 implements dm40 {

    /* JADX INFO: renamed from: a */
    public final k7q0 f92814a;

    /* JADX INFO: renamed from: b */
    public final h7f f92815b;

    /* JADX INFO: renamed from: c */
    public final Context f92816c;

    /* JADX INFO: renamed from: d */
    public final bsi f92817d;

    /* JADX INFO: renamed from: e */
    public final cdv f92818e;

    /* JADX INFO: renamed from: f */
    public final dg10 f92819f;

    /* JADX INFO: renamed from: g */
    public final luk f92820g;

    /* JADX INFO: renamed from: h */
    public final mi80 f92821h;

    /* JADX INFO: renamed from: i */
    public final boolean f92822i;

    public hm40(k7q0 k7q0Var, h7f h7fVar, Context context, bsi bsiVar, cdv cdvVar, dg10 dg10Var, luk lukVar, mi80 mi80Var, boolean z) {
        this.f92814a = k7q0Var;
        this.f92815b = h7fVar;
        this.f92816c = context;
        this.f92817d = bsiVar;
        this.f92818e = cdvVar;
        this.f92819f = dg10Var;
        this.f92820g = lukVar;
        this.f92821h = mi80Var;
        this.f92822i = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m47923a(hm40 hm40Var, String str, String str2, String str3, String str4, sr4 sr4Var, ibk ibkVar) {
        em40 em40Var;
        if (ibkVar instanceof em40) {
            em40Var = (em40) ibkVar;
            int i = em40Var.f60819f;
            if ((i & Integer.MIN_VALUE) != 0) {
                em40Var.f60819f = i - Integer.MIN_VALUE;
            } else {
                em40Var = new em40(hm40Var, ibkVar);
            }
        } else {
            em40Var = new em40(hm40Var, ibkVar);
        }
        Object objMo46765a = em40Var.f60817d;
        int i2 = em40Var.f60819f;
        try {
            if (i2 == 0) {
                bga.m29073P(objMo46765a);
                sr4Var.getClass();
                sr4Var.m79019k("color_extraction_inactive", null, (4 & 4) != 0);
                h7f h7fVar = hm40Var.f92815b;
                em40Var.f60814a = str;
                em40Var.f60815b = str2;
                em40Var.f60816c = sr4Var;
                em40Var.f60819f = 1;
                objMo46765a = h7fVar.mo46765a(str2, str3, str4, em40Var);
                yuk yukVar = yuk.f276404a;
                if (objMo46765a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sr4Var = em40Var.f60816c;
                str2 = em40Var.f60815b;
                str = em40Var.f60814a;
                bga.m29073P(objMo46765a);
            }
            String str5 = (String) objMo46765a;
            sr4Var.m79016f("color_extraction_inactive");
            return str5;
        } catch (Throwable th) {
            try {
                hm40Var.f92817d.m30436a(str, str2, th);
                return "";
            } finally {
                sr4Var.m79016f("color_extraction_inactive");
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final p7m m47924b(hm40 hm40Var, dev0 dev0Var, String str) {
        String string;
        String strM35835g = dev0Var.m35835g();
        String title = dev0Var.getTitle();
        Context context = hm40Var.f92816c;
        if (dev0Var.m35837j().length() > 0) {
            string = dev0Var.m35837j();
        } else {
            String string2 = dev0Var.m35838k().toString();
            hm40Var.f92821h.getClass();
            if (tg1.m80723m(string2) || s601.m77310m0(df41.COLLECTION_ALBUM, df41.COLLECTION_YOUR_EPISODES, df41.COLLECTION_NEW_EPISODES, df41.COLLECTION_ARTIST).contains(new gf41(string2).f79270c)) {
                string = context.getString(R.string.npv_widget_subtitle_yourlibrary);
                wj50.m88279p(string);
            } else {
                if (s601.m77310m0(df41.PLAYLIST, df41.PLAYLIST_V2).contains(new gf41(dev0Var.m35838k().toString()).f79270c)) {
                    string = context.getString(R.string.npv_widget_subtitle_playlist);
                    wj50.m88279p(string);
                } else {
                    string = "";
                }
            }
        }
        return new p7m(dev0Var.m35838k(), strM35835g, hm40Var.f92819f.m35915e(dev0Var.m35835g()), title, string, str);
    }

    /* JADX INFO: renamed from: c */
    public static final WidgetState.InactiveSession m47925c(hm40 hm40Var, String str, p7m p7mVar, List list, boolean z) {
        mev mevVarM32463d = hm40Var.f92818e.m32463d(z);
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dev0 dev0Var = (dev0) it.next();
            arrayList.add(dev0.m35834c(dev0Var, mvf1.m62929o(Uri.parse(dev0Var.m35835g()), dev0Var.m35838k()).toString(), hm40Var.f92819f.m35915e(dev0Var.m35835g()), 19));
        }
        return new WidgetState.InactiveSession(p7mVar, arrayList, str, mevVarM32463d.m61596b(), mevVarM32463d.m61595a(), z, hm40Var.f92822i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public static final Object m47926d(hm40 hm40Var, sr4 sr4Var, ibk ibkVar) {
        gm40 gm40Var;
        if (ibkVar instanceof gm40) {
            gm40Var = (gm40) ibkVar;
            int i = gm40Var.f81281d;
            if ((i & Integer.MIN_VALUE) != 0) {
                gm40Var.f81281d = i - Integer.MIN_VALUE;
            } else {
                gm40Var = new gm40(hm40Var, ibkVar);
            }
        } else {
            gm40Var = new gm40(hm40Var, ibkVar);
        }
        Object objM55707p = gm40Var.f81279b;
        int i2 = gm40Var.f81281d;
        if (i2 == 0) {
            bga.m29073P(objM55707p);
            sr4Var.getClass();
            sr4Var.m79019k("recommendations_loading_inactive", null, (4 & 4) != 0);
            k7q0 k7q0Var = hm40Var.f92814a;
            gm40Var.f81278a = sr4Var;
            gm40Var.f81281d = 1;
            objM55707p = k7q0Var.m55707p(gm40Var);
            yuk yukVar = yuk.f276404a;
            if (objM55707p == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sr4Var = gm40Var.f81278a;
            bga.m29073P(objM55707p);
        }
        yev0 yev0Var = (yev0) objM55707p;
        sr4Var.m79013a("recommendations_cached", pi9.m70080e(yev0Var.m93534a()));
        sr4Var.m79016f("recommendations_loading_inactive");
        return yev0Var.m93535b();
    }
}
