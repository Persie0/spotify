package com.spotify.login.adaptiveauthentication.challenge.web;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import com.spotify.music.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONException;
import p204p.anm0;
import p204p.b7a1;
import p204p.bnm0;
import p204p.c7a1;
import p204p.clq0;
import p204p.dd20;
import p204p.do70;
import p204p.ebe;
import p204p.feb;
import p204p.flw0;
import p204p.fyg1;
import p204p.gm91;
import p204p.gx31;
import p204p.hm91;
import p204p.ig10;
import p204p.jwe;
import p204p.ly71;
import p204p.mgt0;
import p204p.mpd0;
import p204p.ncg1;
import p204p.oh5;
import p204p.opo;
import p204p.qbq0;
import p204p.s3c0;
import p204p.suj;
import p204p.sv6;
import p204p.ubq0;
import p204p.uhc;
import p204p.ui5;
import p204p.un70;
import p204p.utu0;
import p204p.vpj;
import p204p.wj50;
import p204p.xvb;
import p204p.z541;
import p204p.zsr;
import p204p.zz8;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m24212d2 = {"Lcom/spotify/login/adaptiveauthentication/challenge/web/NoAnimLauncherActivity;", "Lp/dd20;", "Lp/anm0;", "<init>", "()V", "src_main_java_com_spotify_login_adaptiveauthentication-adaptiveauthentication"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NoAnimLauncherActivity extends Activity implements dd20, anm0 {

    /* JADX INFO: renamed from: h */
    public static boolean f5299h;

    /* JADX INFO: renamed from: i */
    public static int f5300i;

    /* JADX INFO: renamed from: a */
    public un70 f5301a;

    /* JADX INFO: renamed from: b */
    public boolean f5302b;

    /* JADX INFO: renamed from: c */
    public mgt0 f5303c;

    /* JADX INFO: renamed from: d */
    public hm91 f5304d;

    /* JADX INFO: renamed from: e */
    public ubq0 f5305e;

    /* JADX INFO: renamed from: f */
    public b7a1 f5306f;

    /* JADX INFO: renamed from: g */
    public zsr f5307g;

    /* JADX INFO: renamed from: c */
    public final b7a1 m13289c() {
        b7a1 b7a1Var = this.f5306f;
        if (b7a1Var != null) {
            return b7a1Var;
        }
        wj50.m88260d0("pageBoundUbiLogger");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:141:0x0348  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: d */
    public final void m13290d(Bundle bundle) throws Throwable {
        Object parcelableArrayListExtra;
        flw0 flw0Var;
        int iM38365b;
        int identifier;
        boolean z;
        ArrayList arrayListMo36517a;
        utu0 utu0Var;
        Bitmap bitmap;
        Integer num;
        Integer num2;
        IntentFilter intentFilter;
        String str;
        super.onCreate(bundle);
        int i = f5300i + 1;
        f5300i = i;
        boolean z2 = i > 1;
        boolean z3 = getIntent().getData() != null;
        String action = getIntent().getAction();
        boolean z4 = "android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action);
        if (z2 && !z3 && !z4) {
            finish();
            return;
        }
        boolean z5 = (getIntent().getFlags() & 268435456) != 0;
        boolean z6 = (getIntent().getFlags() & 524288) != 0;
        if (!z5 || z6) {
            Intent intent = new Intent(getIntent());
            intent.setFlags((getIntent().getFlags() | 268435456) & (-524289));
            startActivity(intent);
            finish();
            return;
        }
        if (bundle != null && bundle.getBoolean("android.support.customtabs.trusted.BROWSER_WAS_LAUNCHED_KEY")) {
            finish();
            return;
        }
        un70 un70VarM83535a = un70.m83535a(this);
        this.f5301a = un70VarM83535a;
        if (un70VarM83535a.f232081h == 0 ? false : isTaskRoot()) {
            un70 un70Var = this.f5301a;
            int i2 = un70Var.f232081h;
            int color = getColor(un70Var.f232082i);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            un70 un70Var2 = this.f5301a;
            this.f5303c = new mgt0(this, i2, color, un70Var2.f232084k, un70Var2.f232083j);
        }
        if (isFinishing()) {
            return;
        }
        uhc uhcVar = new uhc(Integer.valueOf(getColor(this.f5301a.f232076c) | (-16777216)), null, Integer.valueOf(getColor(this.f5301a.f232078e) | (-16777216)), Integer.valueOf(getColor(this.f5301a.f232080g)), 11);
        Uri data = getIntent().getData();
        if (data != null) {
            data.toString();
        } else {
            String str2 = this.f5301a.f232074a;
            data = str2 != null ? Uri.parse(str2) : Uri.parse("https://www.example.com/");
        }
        sv6 sv6Var = new sv6(data);
        xvb xvbVar = (xvb) sv6Var.f214340c;
        xvbVar.m92230t(getColor(this.f5301a.f232075b));
        suj sujVar = (suj) xvbVar.f266338d;
        sujVar.f214136b = Integer.valueOf((-16777216) | getColor(this.f5301a.f232077d));
        sujVar.f214137c = Integer.valueOf(getColor(this.f5301a.f232079f));
        xvbVar.m92225n(0);
        xvbVar.m92226o(2, uhcVar);
        un70 un70Var3 = this.f5301a;
        sv6Var.f214345h = un70Var3.f232087n;
        sv6Var.f214338a = un70Var3.f232088o;
        List list = un70Var3.f232085l;
        if (list != null) {
            sv6Var.f214341d = list;
        }
        Intent intent2 = getIntent();
        String action2 = intent2.getAction();
        if ("android.intent.action.SEND".equals(action2) || "android.intent.action.SEND_MULTIPLE".equals(action2)) {
            if ("android.intent.action.SEND".equals(intent2.getAction())) {
                Uri uri = (Uri) intent2.getParcelableExtra("android.intent.extra.STREAM");
                parcelableArrayListExtra = uri != null ? Collections.singletonList(uri) : null;
            } else {
                parcelableArrayListExtra = intent2.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            flw0Var = new flw0(intent2.getStringExtra("android.intent.extra.SUBJECT"), intent2.getStringExtra("android.intent.extra.TEXT"), parcelableArrayListExtra, 19);
        } else {
            flw0Var = null;
        }
        if (flw0Var != null && (str = this.f5301a.f232089p) != null) {
            try {
                sv6Var.f214344g = fyg1.m43101y(str);
                sv6Var.f214343f = flw0Var;
            } catch (JSONException e) {
                e.toString();
            }
        }
        hm91 hm91Var = new hm91(this);
        this.f5304d = hm91Var;
        oh5 oh5Var = new oh5();
        mgt0 mgt0Var = this.f5303c;
        ig10 ig10Var = new ig10(this, 9);
        gx31 gx31Var = "webview".equalsIgnoreCase(this.f5301a.f232086m) ? hm91.f92865j : hm91.f92864i;
        if (hm91Var.f92873h) {
            throw new IllegalStateException("TwaLauncher already destroyed");
        }
        int i3 = hm91Var.f92868c;
        String str3 = hm91Var.f92867b;
        if (i3 == 0) {
            if (mgt0Var != null) {
                mgt0Var.f143630h = str3;
                NoAnimLauncherActivity noAnimLauncherActivity = mgt0Var.f143623a;
                ResolveInfo resolveInfoResolveService = noAnimLauncherActivity.getPackageManager().resolveService(new Intent().setAction("android.support.customtabs.action.CustomTabsService").setPackage(str3), 64);
                boolean zHasCategory = (resolveInfoResolveService == null || (intentFilter = resolveInfoResolveService.filter) == null) ? false : intentFilter.hasCategory("androidx.browser.trusted.category.TrustedWebActivitySplashScreensV1");
                mgt0Var.f143631i = zHasCategory;
                if (zHasCategory) {
                    ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
                    Drawable drawable = noAnimLauncherActivity.getDrawable(mgt0Var.f143624b);
                    if (drawable == null) {
                        bitmap = null;
                    } else {
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                        drawable.draw(canvas);
                        bitmap = bitmapCreateBitmap;
                    }
                    mgt0Var.f143628f = bitmap;
                    if (bitmap != null) {
                        ImageView imageView = new ImageView(noAnimLauncherActivity);
                        imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        imageView.setImageBitmap(mgt0Var.f143628f);
                        imageView.setBackgroundColor(mgt0Var.f143625c);
                        imageView.setScaleType(scaleType2);
                        ImageView.ScaleType scaleType3 = ImageView.ScaleType.MATRIX;
                        noAnimLauncherActivity.setContentView(imageView);
                    }
                    if (mgt0Var.f143628f != null) {
                        jwe jweVar = mgt0.f143622l;
                        jweVar.getClass();
                        Intent intent3 = (Intent) xvbVar.m92223k().f243701b;
                        if (jweVar.m54437b(noAnimLauncherActivity, str3).f59508a) {
                            if (jweVar.m54437b(noAnimLauncherActivity, str3).f59509b) {
                                num = (Integer) vpj.m86157b(intent3, jwe.m54436a(noAnimLauncherActivity, sv6Var)).f230413d;
                            } else {
                                Bundle extras = intent3.getExtras();
                                if (extras == null) {
                                    num = null;
                                } else {
                                    num = (Integer) extras.get("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR");
                                }
                            }
                        } else if (ebe.f57907a.contains(str3)) {
                            num = -1;
                        } else {
                            num = null;
                        }
                        if (num != null) {
                            int iIntValue = num.intValue();
                            int i4 = Build.VERSION.SDK_INT;
                            noAnimLauncherActivity.getWindow().setNavigationBarColor(iIntValue);
                            if (i4 >= 26 && ncg1.m64158x(iIntValue)) {
                                View rootView = noAnimLauncherActivity.getWindow().getDecorView().getRootView();
                                rootView.setSystemUiVisibility(rootView.getSystemUiVisibility() | 16);
                            }
                        }
                        Intent intent4 = (Intent) xvbVar.m92223k().f243701b;
                        if (jweVar.m54437b(noAnimLauncherActivity, str3).f59509b) {
                            num2 = (Integer) vpj.m86157b(intent4, jwe.m54436a(noAnimLauncherActivity, sv6Var)).f230411b;
                        } else {
                            Bundle extras2 = intent4.getExtras();
                            num2 = extras2 == null ? null : (Integer) extras2.get("android.support.customtabs.extra.TOOLBAR_COLOR");
                        }
                        if (num2 != null) {
                            int iIntValue2 = num2.intValue();
                            noAnimLauncherActivity.getWindow().setStatusBarColor(iIntValue2);
                            if (ncg1.m64158x(iIntValue2)) {
                                View rootView2 = noAnimLauncherActivity.getWindow().getDecorView().getRootView();
                                rootView2.setSystemUiVisibility(rootView2.getSystemUiVisibility() | 8192);
                            }
                        }
                    }
                } else {
                    ig10Var = ig10Var;
                }
            } else {
                ig10Var = ig10Var;
            }
            feb febVar = new feb(hm91Var, sv6Var, mgt0Var, ig10Var, 23);
            if (hm91Var.f92871f != null) {
                febVar.run();
            } else {
                feb febVar2 = new feb(hm91Var, gx31Var, sv6Var, ig10Var, 24);
                if (hm91Var.f92870e == null) {
                    hm91Var.f92870e = new gm91(hm91Var, oh5Var);
                }
                gm91 gm91Var = hm91Var.f92870e;
                gm91Var.f81337b = febVar;
                gm91Var.f81338c = febVar2;
                NoAnimLauncherActivity noAnimLauncherActivity2 = hm91Var.f92866a;
                gm91Var.f141947a = noAnimLauncherActivity2.getApplicationContext();
                Intent intent5 = new Intent("android.support.customtabs.action.CustomTabsService");
                if (str3.isEmpty()) {
                    throw new IllegalArgumentException("Service Intents must be explicit");
                }
                intent5.setPackage(str3);
                noAnimLauncherActivity2.bindService(intent5, gm91Var, 1);
            }
        } else {
            gx31Var.m46011f(hm91Var.f92866a, sv6Var, str3, ig10Var);
        }
        if (!hm91Var.f92866a.getPackageManager().hasSystemFeature("org.chromium.arc")) {
            try {
                arrayListMo36517a = (Build.VERSION.SDK_INT >= 28 ? new do70() : new ui5(19)).mo36517a(hm91Var.f92866a.getPackageManager(), str3);
            } catch (PackageManager.NameNotFoundException unused) {
                arrayListMo36517a = null;
            }
            if (arrayListMo36517a == null) {
                utu0Var = null;
            } else {
                try {
                    utu0Var = new utu0(ly71.m60235a(str3, arrayListMo36517a));
                } catch (IOException unused2) {
                    utu0Var = null;
                }
            }
            SharedPreferences sharedPreferences = hm91Var.f92872g.f117738a.getApplicationContext().getSharedPreferences("com.google.androidbrowserhelper", 0);
            if (utu0Var == null) {
                sharedPreferences.edit().remove("SharedPreferencesTokenStore.TOKEN").apply();
            } else {
                byte[] bArr = ((ly71) utu0Var.f233995a).f137981a;
                sharedPreferences.edit().putString("SharedPreferencesTokenStore.TOKEN", Base64.encodeToString(Arrays.copyOf(bArr, bArr.length), 3)).apply();
            }
        }
        if (!f5299h) {
            String str4 = this.f5304d.f92867b;
            if (ebe.f57908b.contains(str4) && (iM38365b = ebe.m38365b(getPackageManager(), str4)) != 0 && iM38365b < 362600000 && (identifier = getResources().getIdentifier("string/update_chrome_toast", null, getPackageName())) != 0) {
                z = true;
                Toast.makeText(this, identifier, 1).show();
            } else {
                z = true;
            }
            f5299h = z;
        }
        if (getApplicationContext().getPackageManager().hasSystemFeature("org.chromium.arc")) {
            getSharedPreferences("TrustedWebActivityLauncherPrefs", 0).edit().putString("KEY_PROVIDER_PACKAGE", "org.chromium.arc.payment_app").apply();
        } else {
            getSharedPreferences("TrustedWebActivityLauncherPrefs", 0).edit().putString("KEY_PROVIDER_PACKAGE", this.f5304d.f92867b).apply();
        }
        s3c0.m77126a(this, this.f5304d.f92867b);
    }

    @Override // p204p.anm0
    /* JADX INFO: renamed from: g */
    public final bnm0 mo2758g() {
        return new bnm0(((zz8) m13289c()).mo24811c());
    }

    /* JADX INFO: renamed from: h */
    public final void m13291h(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("android.support.customtabs.trusted.BROWSER_WAS_LAUNCHED_KEY", this.f5302b);
    }

    @Override // p204p.dd20
    /* JADX INFO: renamed from: i */
    public final zsr mo3091i() {
        zsr zsrVar = this.f5307g;
        if (zsrVar != null) {
            return zsrVar;
        }
        wj50.m88260d0("androidInjector");
        throw null;
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        Bundle bundle2;
        opo.m67559i(this);
        m13290d(bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("PBL_STATE")) != null) {
            m13289c().mo28370b(bundle2);
        }
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        clq0 clq0Var;
        super.onDestroy();
        f5300i--;
        hm91 hm91Var = this.f5304d;
        if (hm91Var != null && !hm91Var.f92873h) {
            gm91 gm91Var = hm91Var.f92870e;
            if (gm91Var != null) {
                hm91Var.f92866a.unbindService(gm91Var);
            }
            hm91Var.f92866a = null;
            hm91Var.f92873h = true;
        }
        mgt0 mgt0Var = this.f5303c;
        if (mgt0Var == null || (clq0Var = mgt0Var.f143629g) == null) {
            return;
        }
        ((z541) clq0Var.f39346h).cancel(true);
        clq0Var.f39345g = null;
    }

    @Override // android.app.Activity
    public final void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        mgt0 mgt0Var = this.f5303c;
        if (mgt0Var != null) {
            mgt0Var.f143632j = true;
            mpd0 mpd0Var = mgt0Var.f143633k;
            if (mpd0Var != null) {
                mpd0Var.run();
                mgt0Var.f143633k = null;
            }
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        b7a1.m28369E(m13289c());
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        if (this.f5302b) {
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        ((c7a1) m13289c()).m31703F();
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        Bundle bundleMo28371f;
        m13291h(bundle);
        if (!isChangingConfigurations() || (bundleMo28371f = m13289c().mo28371f()) == null) {
            return;
        }
        bundle.putBundle("PBL_STATE", bundleMo28371f);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        ((c7a1) m13289c()).m31704G();
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        super.startActivity(intent);
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent, Bundle bundle) {
        try {
            super.startActivity(intent, bundle);
            overridePendingTransition(0, 0);
        } catch (ActivityNotFoundException unused) {
            ubq0 ubq0Var = this.f5305e;
            Map map = null;
            if (ubq0Var != null) {
                String str = "web_challenge";
                ubq0Var.mo59114a(new qbq0(str, 4, map, "no_browser"));
                Toast.makeText(this, R.string.missing_browser, 0).show();
                finish();
                return;
            }
            wj50.m88260d0("preAuthUbiTracker");
            throw null;
        }
    }
}
