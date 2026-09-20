package p204p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.spotify.allboarding.allboardingimpl.AllboardingActivity;
import com.spotify.allboarding.entrypoint.EntryPoint;
import com.spotify.collection.contentimpl.played.PlayedStateService;
import com.spotify.music.R;
import com.spotify.widgets.npvwidget.HideTooltipWorker;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class wc3 implements knx0, pad0, w111, SingleOnSubscribe {

    /* JADX INFO: renamed from: a */
    public final Context f249945a;

    public /* synthetic */ wc3(Context context, boolean z) {
        this.f249945a = context;
    }

    /* JADX INFO: renamed from: a */
    public static zs0 m87682a() {
        zs0 zs0Var = new zs0();
        zs0Var.f285796c = new zz71(true);
        zs0Var.f285797d = vsg1.m86352l(gn80.SHARE_FORMAT_ENTITY, new String[0]);
        zs0Var.f285798e = gbu.f78413a;
        pnv pnvVar = null;
        int i = 63;
        zs0Var.f285799f = new shv(pnvVar, i);
        zs0Var.f285794a = true;
        zs0Var.f285800g = z300.f278736b;
        zs0Var.f285801h = bk01.f27801a;
        zs0Var.f285798e = Collections.singleton(xp01.f264405d);
        zs0Var.f285799f = new shv(pnvVar, i);
        zs0Var.f285796c = yz71.f277726a;
        return zs0Var;
    }

    /* JADX INFO: renamed from: b */
    public void m87683b(Intent intent, Uri... uriArr) {
        Context context = this.f249945a;
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        for (Uri uri : uriArr) {
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                context.grantUriPermission(it.next().activityInfo.packageName, uri, 1);
            }
        }
    }

    @Override // p204p.pad0
    /* JADX INFO: renamed from: c */
    public qad0 mo25661c(yho yhoVar) {
        Context context;
        int i = Build.VERSION.SDK_INT;
        if (i < 31 && ((context = this.f249945a) == null || i < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            return new oh3(28).mo25661c(yhoVar);
        }
        int iM35792i = def0.m35792i(((r300) yhoVar.f272929d).f195387p);
        yif1.m93818w("Creating an asynchronous MediaCodec adapter for track type " + h0b1.m46284L(iM35792i));
        C1668ai c1668ai = new C1668ai(new sn6(iM35792i, 0), new sn6(iM35792i, 1));
        c1668ai.f15839b = true;
        return c1668ai.mo25661c(yhoVar);
    }

    /* JADX INFO: renamed from: d */
    public void m87684d(String[] strArr, boolean z) {
        Context context = this.f249945a;
        Intent intent = new Intent(context, (Class<?>) PlayedStateService.class);
        intent.putExtra("uris", strArr);
        intent.putExtra("played", z);
        intent.setAction("PlayedStateService.action.PLAYED");
        context.startService(intent);
    }

    /* JADX INFO: renamed from: e */
    public void m87685e() {
        Context context = this.f249945a;
        l0e1 l0e1VarM57799S = l0e1.m57799S(context);
        jq60.m54078x(l0e1VarM57799S.f128404A0.f49375m, "CancelWorkByTag_".concat("com.spotify.widgets.npvwidget.TAG_HIDE_TOOLTIP"), l0e1VarM57799S.f128406C0.f160371a, new b8b(l0e1VarM57799S, 1));
        l0e1.m57799S(context).m55006s(((knl0) ((knl0) new knl0(HideTooltipWorker.class).m31261h(3500L, TimeUnit.MILLISECONDS)).m31254a("com.spotify.widgets.npvwidget.TAG_HIDE_TOOLTIP")).m31255b());
    }

    @Override // p204p.knx0
    /* JADX INFO: renamed from: i */
    public Intent mo28051i(Intent intent) {
        int i = AllboardingActivity.f2768j1;
        Context context = this.f249945a;
        wj50.m88279p(context);
        return id6.m50282i(context, EntryPoint.HOME_ARTIST_HEADER);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.w111
    /* JADX INFO: renamed from: l */
    public Object mo28227l(eo01 eo01Var, fbk fbkVar) {
        lu01 lu01Var;
        sr01 sr01VarM76021b;
        Bundle bundle = eo01Var.f61265b;
        String string = bundle.getString("music_guesser.game_id");
        pnv pnvVar = null;
        Object[] objArr = 0;
        if (string == null || (lu01Var = eo01Var.f61264a) == null) {
            return null;
        }
        String string2 = bundle.getString("music_guesser.share_card_url");
        if (string2 == null) {
            string2 = "";
        }
        int i = bundle.getInt("music_guesser.background_color", 0);
        String string3 = bundle.getString("music_guesser.share_preview_title");
        if (string3 == null) {
            string3 = "";
        }
        String string4 = bundle.getString("music_guesser.share_preview_description");
        if (string4 == null) {
            string4 = "";
        }
        if (wl51.m88460J0(string2)) {
            sr01VarM76021b = new sr01(new rr01(lu01Var, vsg1.m86352l(gn80.SHARE_FORMAT_ENTITY, new String[0])), new nk01(new um01(qpv0.f191387a.mo54112b(ewv.class)), new hwv(null, new zz71(true), 0, false, new shv(pnvVar, 63), null, null), bk01.f27801a, true), new q111(z300.f278736b, gbu.f78413a, true, null));
        } else {
            ro8 ro8Var = new ro8();
            ro8Var.f201171l.add(aq01.f18050d);
            ro8Var.f201160a = lu01Var.f136946a;
            Context context = this.f249945a;
            ro8Var.m76020a(new fcr0(i, i, context.getString(R.string.gradient_background_default_content_description)));
            ro8Var.f201163d = new gcr0(string2, context.getString(R.string.image_background_default_content_description));
            String str = lu01Var.f136950e;
            ro8Var.f201164e = str != null ? str : "";
            if (string3.length() == 0) {
                string3 = null;
            }
            if (string4.length() == 0) {
                string4 = null;
            }
            ro8Var.f201168i = new ao8(objArr == true ? 1 : 0, string3, string4, 57);
            ro8Var.f201175p = xj01.f261984a;
            ro8Var.f201162c = vsg1.m86352l(gn80.SHARE_FORMAT_ENTITY, new String[0]);
            sr01VarM76021b = ro8Var.m76021b();
        }
        return new e211(Collections.singletonList(sr01VarM76021b), 0, fji.f70297b, "fast-track:".concat(string));
    }

    @Override // io.reactivex.rxjava3.core.SingleOnSubscribe
    public void subscribe(SingleEmitter singleEmitter) {
        kkc1 kkc1Var = new kkc1(singleEmitter, 3);
        ComponentName componentName = yid1.f273084l;
        Context context = this.f249945a;
        int i = 0;
        try {
            i = context.getPackageManager().getPackageInfo("com.waze", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (i < 1021549) {
            ((SingleEmitter) kkc1Var.f123567b).onSuccess(Boolean.FALSE);
        } else {
            Intent intent = new Intent();
            intent.setComponent(yid1.f273084l);
            context.bindService(intent, new mr6(3, kkc1Var, context), 1);
        }
    }

    public wc3(Context context) {
        this.f249945a = context.getApplicationContext();
    }

    public wc3(uc5 uc5Var, Context context) {
        this.f249945a = context;
    }
}
