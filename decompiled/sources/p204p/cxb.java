package p204p;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.cast.CastDevice;
import com.spotify.metadata.proto.Metadata$ImageGroup;
import com.spotify.music.R;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import spotify.collection.esperanto.proto.CollectionContainsResponse;
import spotify.your_library.esperanto.proto.YourLibraryContainsRequest;
import spotify.your_library.esperanto.proto.YourLibraryContainsResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class cxb implements hwe, rdc1, zd10, ae10, BiFunction, wc40, Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42971a;

    /* JADX INFO: renamed from: b */
    public Object f42972b;

    /* JADX INFO: renamed from: c */
    public Object f42973c;

    /* JADX INFO: renamed from: d */
    public Object f42974d;

    public cxb() {
        this.f42971a = 11;
    }

    /* JADX INFO: renamed from: g */
    public static final String m34242g(cxb cxbVar, Metadata$ImageGroup metadata$ImageGroup) {
        if (metadata$ImageGroup.getImageCount() <= 0) {
            return "";
        }
        String string = uh30.m83118a(gf41.m44573h(n0e1.m63415W(metadata$ImageGroup.m15443o().m15441n().m45891s())).toString()).toString();
        wj50.m88279p(string);
        return string;
    }

    @Override // p204p.hwe
    /* JADX INFO: renamed from: a */
    public boolean mo34243a() {
        return ((hwe) this.f42972b).mo34243a();
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f42971a) {
            case 17:
                zgf zgfVar = (zgf) obj;
                chf chfVar = (chf) this.f42972b;
                String str = (String) this.f42973c;
                wj50.m88279p(str);
                xgf xgfVar = new xgf(str, (String) this.f42974d);
                wj50.m88279p(zgfVar);
                return Single.create(new bxb(chfVar, xgfVar, zgfVar, 19)).subscribeOn(chfVar.f37998a);
            default:
                Object obj2 = ((s6x0) obj).f206218a;
                pl3 pl3Var = ((snj) this.f42972b).f210948d;
                fnj fnjVar = (fnj) this.f42973c;
                List list = (List) this.f42974d;
                if (s6x0.m77348a(obj2) != null) {
                    pl3Var.m70251b(fnjVar.f71308a.getUri(), cyl0.f43323b);
                    return lau.f131415a;
                }
                pl3Var.m70251b(fnjVar.f71308a.getUri(), cyl0.f43324c);
                wj50.m88279p(list);
                ArrayList arrayListM43700N0 = g6f.m43700N0((List) obj2, list);
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : arrayListM43700N0) {
                    if (!fnjVar.f71311d.contains(((b221) obj3).getUri())) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
        }
    }

    @Override // p204p.hwe
    /* JADX INFO: renamed from: b */
    public r4p mo34244b(r300 r300Var, LogSessionId logSessionId) {
        r4p r4pVarMo34244b = ((hwe) this.f42972b).mo34244b(r300Var, logSessionId);
        this.f42973c = r4pVarMo34244b.m74764c();
        return r4pVarMo34244b;
    }

    @Override // p204p.ae10
    /* JADX INFO: renamed from: c */
    public synchronized void mo25650c(ce10 ce10Var, long j) {
        ((hr81) this.f42973c).m48342s(ce10Var, j);
    }

    @Override // p204p.hwe
    /* JADX INFO: renamed from: d */
    public r4p mo34245d(r300 r300Var, LogSessionId logSessionId) {
        r4p r4pVarMo34245d = ((hwe) this.f42972b).mo34245d(r300Var, logSessionId);
        this.f42974d = r4pVarMo34245d.m74764c();
        return r4pVarMo34245d;
    }

    @Override // p204p.ae10
    /* JADX INFO: renamed from: e */
    public synchronized void mo25651e() {
        ((hr81) this.f42973c).m48330A();
    }

    @Override // p204p.hwe
    /* JADX INFO: renamed from: f */
    public boolean mo34246f() {
        return ((hwe) this.f42972b).mo34246f();
    }

    @Override // p204p.rdc1
    public View getRoot() {
        switch (this.f42971a) {
            case 2:
                return (NestedScrollView) this.f42972b;
            default:
                return (ConstraintLayout) this.f42972b;
        }
    }

    @Override // p204p.wc40
    /* JADX INFO: renamed from: h */
    public void mo26031h(int i, Bitmap bitmap) {
        ImageView imageView = (ImageView) this.f42972b;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof AnimationDrawable) {
                ((AnimationDrawable) drawable).stop();
            }
            imageView.setImageBitmap(bitmap);
        }
        new geu(bitmap).m44524b(new id8(this, 18));
    }

    /* JADX INFO: renamed from: i */
    public z9c m34247i() {
        return new z9c(this);
    }

    @Override // p204p.wc40
    /* JADX INFO: renamed from: j */
    public void mo26033j(Drawable drawable) {
        ImageView imageView = (ImageView) this.f42972b;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
            if (imageView.getDrawable() instanceof AnimationDrawable) {
                ((AnimationDrawable) imageView.getDrawable()).start();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public twy m34248k() {
        return new twy((String) this.f42973c, (String) this.f42974d, (zj5) this.f42972b);
    }

    /* JADX INFO: renamed from: l */
    public void m34249l() {
        k5m0 k5m0Var = (k5m0) this.f42974d;
        if (k5m0Var.mo55547g((Activity) this.f42972b)) {
            k5m0Var.mo55546f();
        } else {
            ((z9j0) this.f42973c).mo47345e();
        }
    }

    /* JADX INFO: renamed from: m */
    public e23 m34250m(ovf ovfVar) {
        return new e23((Flowable) this.f42972b, (pgo) this.f42973c, (l2j0) this.f42974d, ovfVar);
    }

    /* JADX INFO: renamed from: n */
    public a3k m34251n(Flowable flowable, gh00 gh00Var, ovf ovfVar) {
        return new a3k((Flowable) this.f42972b, flowable, (r4k) this.f42973c, gh00Var, (Scheduler) this.f42974d, ovfVar);
    }

    @Override // p204p.wc40
    /* JADX INFO: renamed from: o */
    public void mo26038o(Drawable drawable) {
        ImageView imageView = (ImageView) this.f42972b;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
        ((gh00) this.f42974d).invoke(null);
    }

    @Override // p204p.zd10
    public synchronized void onFlush() {
        ((hr81) this.f42973c).onFlush();
        txb1 txb1Var = (txb1) this.f42974d;
        be10 be10Var = (be10) this.f42972b;
        Objects.requireNonNull(be10Var);
        txb1Var.m81905f(new ijc(be10Var, 0), true);
    }

    /* JADX INFO: renamed from: p */
    public rnd m34252p(long j) {
        Locale locale = (Locale) this.f42974d;
        Context context = (Context) this.f42973c;
        wy3 wy3Var = (wy3) ((xre) this.f42972b);
        wy3Var.getClass();
        Calendar calendar = Calendar.getInstance();
        TimeZone timeZone = TimeZone.getTimeZone(calendar.getTimeZone().getID());
        long timeInMillis = calendar.getTimeInMillis();
        android.icu.util.Calendar calendar2 = android.icu.util.Calendar.getInstance(timeZone, locale);
        calendar2.setTimeInMillis(timeInMillis);
        wy3Var.getClass();
        Calendar calendar3 = Calendar.getInstance();
        calendar3.setTimeInMillis(j * ((long) 1000));
        TimeZone timeZone2 = TimeZone.getTimeZone(calendar3.getTimeZone().getID());
        long timeInMillis2 = calendar3.getTimeInMillis();
        android.icu.util.Calendar calendar4 = android.icu.util.Calendar.getInstance(timeZone2, locale);
        calendar4.setTimeInMillis(timeInMillis2);
        if (calendar2.getTimeInMillis() - calendar4.getTimeInMillis() < TimeUnit.SECONDS.toMillis(60L)) {
            String string = context.getString(R.string.campfire_chats_preview_now);
            return new rnd(string, string);
        }
        if (calendar2.getTimeInMillis() - calendar4.getTimeInMillis() < TimeUnit.HOURS.toMillis(1L)) {
            int minutes = (int) TimeUnit.MILLISECONDS.toMinutes(calendar2.getTimeInMillis() - calendar4.getTimeInMillis());
            return new rnd(context.getString(R.string.campfire_chats_preview_minutes, Integer.valueOf(minutes)), context.getResources().getQuantityString(R.plurals.campfire_chats_preview_minutes_content_description, minutes, Integer.valueOf(minutes)));
        }
        long timeInMillis3 = calendar2.getTimeInMillis() - calendar4.getTimeInMillis();
        TimeUnit timeUnit = TimeUnit.DAYS;
        if (timeInMillis3 < timeUnit.toMillis(1L)) {
            int hours = (int) TimeUnit.MILLISECONDS.toHours(calendar2.getTimeInMillis() - calendar4.getTimeInMillis());
            return new rnd(context.getString(R.string.campfire_chats_preview_hours, Integer.valueOf(hours)), context.getResources().getQuantityString(R.plurals.campfire_chats_preview_hours_content_description, hours, Integer.valueOf(hours)));
        }
        if (calendar2.getTimeInMillis() - calendar4.getTimeInMillis() < timeUnit.toMillis(2L)) {
            int days = (int) TimeUnit.MILLISECONDS.toDays(calendar2.getTimeInMillis() - calendar4.getTimeInMillis());
            return new rnd(context.getString(R.string.campfire_chats_preview_days, Integer.valueOf(days)), context.getResources().getQuantityString(R.plurals.campfire_chats_preview_days_content_description, days, Integer.valueOf(days)));
        }
        if (calendar2.getTimeInMillis() - calendar4.getTimeInMillis() < timeUnit.toMillis(7L)) {
            return new rnd(DateFormat.getInstanceForSkeleton("E", locale).format(calendar4.getTime()), DateFormat.getInstanceForSkeleton("EEEE", locale).format(calendar4.getTime()));
        }
        if (calendar2.get(1) == calendar4.get(1)) {
            String str = DateFormat.getInstanceForSkeleton("MMMd", locale).format(calendar4.getTime());
            wj50.m88279p(str);
            return new rnd(str, str);
        }
        String str2 = DateFormat.getInstanceForSkeleton("yMMMd", locale).format(calendar4.getTime());
        wj50.m88279p(str2);
        return new rnd(str2, str2);
    }

    /* JADX INFO: renamed from: q */
    public void m34253q() {
        kv91 kv91Var = (kv91) this.f42972b;
        bbg0 bbg0Var = (bbg0) this.f42973c;
        bbg0Var.getClass();
        yt91 yt91VarM96903c = bbg0Var.f25561b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("choose_device", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
    }

    /* JADX INFO: renamed from: r */
    public Completable m34254r(xsi xsiVar) {
        return ((Single) this.f42972b).flatMapCompletable(new fw7(28, xsiVar, this));
    }

    /* JADX INFO: renamed from: s */
    public void m34255s(String str) {
        this.f42973c = str;
    }

    /* JADX INFO: renamed from: t */
    public void m34256t() {
        Set set = Collections.EMPTY_SET;
        if (((zj5) this.f42972b) == null) {
            this.f42972b = new zj5(0);
        }
        ((zj5) this.f42972b).addAll(set);
    }

    /* JADX INFO: renamed from: u */
    public void m34257u(String str) {
        this.f42974d = str;
    }

    @Override // p204p.zd10
    /* JADX INFO: renamed from: v */
    public void mo34258v(ce10 ce10Var) {
        ((txb1) this.f42974d).m81905f(new hjc(0, this, ce10Var), true);
    }

    @Override // p204p.zd10
    /* JADX INFO: renamed from: w */
    public synchronized void mo34259w() {
        ((hr81) this.f42973c).mo34259w();
    }

    /* JADX INFO: renamed from: x */
    public void m34260x(Bundle bundle) {
        this.f42974d = bundle;
    }

    public /* synthetic */ cxb(Object obj, Object obj2, Object obj3, int i) {
        this.f42971a = i;
        this.f42972b = obj;
        this.f42973c = obj2;
        this.f42974d = obj3;
    }

    public cxb(CastDevice castDevice, m6h1 m6h1Var) {
        this.f42971a = 1;
        ig31.m50507y(castDevice, "CastDevice parameter cannot be null");
        this.f42972b = castDevice;
        this.f42973c = m6h1Var;
    }

    public cxb(Context context, xre xreVar) {
        this.f42971a = 6;
        this.f42972b = xreVar;
        this.f42973c = context;
        this.f42974d = new Locale(ihf1.m50632p());
    }

    public cxb(akm akmVar, xlg0 xlg0Var) {
        this.f42971a = 4;
        this.f42972b = akmVar;
        this.f42973c = xlg0Var;
        this.f42974d = new wg61(new fub(this, 7));
    }

    public cxb(String str, kv91 kv91Var) {
        this.f42971a = 5;
        this.f42972b = kv91Var;
        this.f42973c = str;
        this.f42974d = new wg61(new fub(this, 16));
    }

    public cxb(fiz fizVar, j2r j2rVar, t7q t7qVar) {
        this.f42971a = 7;
        this.f42972b = j2rVar;
        this.f42973c = t7qVar;
        fbk fbkVar = null;
        this.f42974d = new zux(new vjz(nxf1.m65827f(new b6b(this, fbkVar, 28)), new gc0(2, 9, fbkVar)), new eyd(mvl0.m62952o(fizVar, uio0.f230744O0), 0), new C2278q2(this, fbkVar, 19), 1);
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        x5f x5fVar = (x5f) this.f42972b;
        LinkedHashMap linkedHashMapM89985b = x5f.m89985b(x5fVar, (YourLibraryContainsResponse) obj);
        v5f v5fVar = (v5f) this.f42973c;
        YourLibraryContainsRequest yourLibraryContainsRequest = (YourLibraryContainsRequest) this.f42974d;
        wj50.m88279p(yourLibraryContainsRequest);
        return x5f.m89984a(x5fVar, (CollectionContainsResponse) obj2, linkedHashMapM89985b, v5fVar, yourLibraryContainsRequest);
    }

    public cxb(jge jgeVar, uh30 uh30Var, wt80 wt80Var) {
        this.f42971a = 26;
        this.f42972b = jgeVar;
        this.f42973c = wt80Var;
        top0 top0VarM18421v = PlaylistRequestDecorationPolicy.m18421v();
        bjp0 bjp0VarM18365h0 = PlaylistDecorationPolicy.m18365h0();
        bjp0VarM18365h0.m29514Z();
        top0VarM18421v.m81216x(bjp0VarM18365h0);
        this.f42974d = (PlaylistRequestDecorationPolicy) top0VarM18421v.build();
    }

    public cxb(kv91 kv91Var) {
        this.f42971a = 22;
        this.f42972b = kv91Var;
        this.f42973c = new bbg0(19);
        this.f42974d = new bbg0(20);
    }

    public cxb(hwe hweVar) {
        this.f42971a = 0;
        this.f42972b = hweVar;
    }

    public cxb(NestedScrollView nestedScrollView, TextView textView, RecyclerView recyclerView, View view) {
        this.f42971a = 2;
        this.f42972b = nestedScrollView;
        this.f42973c = textView;
        this.f42974d = view;
    }

    public cxb(kv91 kv91Var, l9g0 l9g0Var, dd41 dd41Var) {
        this.f42971a = 13;
        this.f42972b = kv91Var;
        this.f42974d = l9g0Var;
        String strM35694A = dd41Var.m35694A();
        this.f42973c = strM35694A == null ? "" : strM35694A;
    }

    public cxb(ud10 ud10Var, be10 be10Var, be10 be10Var2, txb1 txb1Var) {
        this.f42971a = 3;
        c95.m31845k(be10Var != be10Var2, "Creating a self loop in the chain: %s", be10Var);
        this.f42972b = be10Var;
        this.f42973c = new hr81(ud10Var, be10Var2, txb1Var);
        this.f42974d = txb1Var;
    }
}
