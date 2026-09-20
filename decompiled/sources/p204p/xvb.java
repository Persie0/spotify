package p204p;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.SparseArray;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class xvb implements nb40 {

    /* JADX INFO: renamed from: a */
    public int f266335a;

    /* JADX INFO: renamed from: b */
    public boolean f266336b;

    /* JADX INFO: renamed from: c */
    public final Object f266337c;

    /* JADX INFO: renamed from: d */
    public Object f266338d;

    /* JADX INFO: renamed from: e */
    public Object f266339e;

    /* JADX INFO: renamed from: f */
    public Object f266340f;

    /* JADX INFO: renamed from: g */
    public Object f266341g;

    public xvb(nb40 nb40Var) {
        this.f266337c = new Object();
        this.f266335a = 0;
        this.f266336b = false;
        this.f266341g = new a440(this, 1);
        this.f266338d = nb40Var;
        this.f266339e = nb40Var.getSurface();
    }

    @Override // p204p.nb40
    /* JADX INFO: renamed from: a */
    public ua40 mo26025a() {
        b440 b440Var;
        synchronized (this.f266337c) {
            ua40 ua40VarMo26025a = ((nb40) this.f266338d).mo26025a();
            if (ua40VarMo26025a != null) {
                this.f266335a++;
                b440Var = new b440(ua40VarMo26025a);
                b440Var.m60747a((a440) this.f266341g);
            } else {
                b440Var = null;
            }
        }
        return b440Var;
    }

    @Override // p204p.nb40
    /* JADX INFO: renamed from: b */
    public int mo26026b() {
        int iMo26026b;
        synchronized (this.f266337c) {
            iMo26026b = ((nb40) this.f266338d).mo26026b();
        }
        return iMo26026b;
    }

    /* JADX INFO: renamed from: c */
    public void m92219c(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m92220h((wdb) it.next());
        }
    }

    @Override // p204p.nb40
    public void close() {
        synchronized (this.f266337c) {
            try {
                Surface surface = (Surface) this.f266339e;
                if (surface != null) {
                    surface.release();
                }
                ((nb40) this.f266338d).close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p204p.nb40
    /* JADX INFO: renamed from: d */
    public int mo26027d() {
        int iMo26027d;
        synchronized (this.f266337c) {
            iMo26027d = ((nb40) this.f266338d).mo26027d();
        }
        return iMo26027d;
    }

    @Override // p204p.nb40
    /* JADX INFO: renamed from: e */
    public int mo26028e() {
        int iMo26028e;
        synchronized (this.f266337c) {
            iMo26028e = ((nb40) this.f266338d).mo26028e();
        }
        return iMo26028e;
    }

    @Override // p204p.nb40
    /* JADX INFO: renamed from: f */
    public void mo26029f() {
        synchronized (this.f266337c) {
            ((nb40) this.f266338d).mo26029f();
        }
    }

    @Override // p204p.nb40
    /* JADX INFO: renamed from: g */
    public void mo26030g(mb40 mb40Var, Executor executor) {
        synchronized (this.f266337c) {
            ((nb40) this.f266338d).mo26030g(new k9w0(5, this, mb40Var), executor);
        }
    }

    @Override // p204p.nb40
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f266337c) {
            surface = ((nb40) this.f266338d).getSurface();
        }
        return surface;
    }

    /* JADX INFO: renamed from: h */
    public void m92220h(wdb wdbVar) {
        ArrayList arrayList = (ArrayList) this.f266339e;
        if (arrayList.contains(wdbVar)) {
            return;
        }
        arrayList.add(wdbVar);
    }

    /* JADX INFO: renamed from: i */
    public void m92221i(phi phiVar) {
        for (sy7 sy7Var : phiVar.mo39827b()) {
            lpi0 lpi0Var = (lpi0) this.f266338d;
            lpi0Var.getClass();
            try {
                lpi0Var.mo39828c(sy7Var);
            } catch (IllegalArgumentException unused) {
            }
            ((lpi0) this.f266338d).m59674w(sy7Var, phiVar.mo39831g(sy7Var), phiVar.mo39828c(sy7Var));
        }
    }

    /* JADX INFO: renamed from: j */
    public yvb m92222j() {
        ArrayList arrayList = new ArrayList((HashSet) this.f266337c);
        jvl0 jvl0VarM54384j = jvl0.m54384j((lpi0) this.f266338d);
        int i = this.f266335a;
        ArrayList arrayList2 = new ArrayList((ArrayList) this.f266339e);
        boolean z = this.f266336b;
        nqi0 nqi0Var = (nqi0) this.f266340f;
        fs61 fs61Var = fs61.f72777b;
        ArrayMap arrayMap = new ArrayMap();
        for (String str : nqi0Var.f72778a.keySet()) {
            arrayMap.put(str, nqi0Var.f72778a.get(str));
        }
        return new yvb(arrayList, jvl0VarM54384j, i, arrayList2, z, new fs61(arrayMap), (ceb) this.f266341g);
    }

    /* JADX INFO: renamed from: k */
    public vpj m92223k() {
        Intent intent = (Intent) this.f266337c;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f266336b);
        suj sujVar = (suj) this.f266338d;
        Integer num = (Integer) sujVar.f214135a;
        Integer num2 = (Integer) sujVar.f214136b;
        Integer num3 = (Integer) sujVar.f214137c;
        Bundle bundle2 = new Bundle();
        if (num != null) {
            bundle2.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        if (num2 != null) {
            bundle2.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num2.intValue());
        }
        if (num3 != null) {
            bundle2.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num3.intValue());
        }
        intent.putExtras(bundle2);
        Bundle bundle3 = (Bundle) this.f266341g;
        if (bundle3 != null) {
            intent.putExtras(bundle3);
        }
        if (((SparseArray) this.f266340f) != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", (SparseArray) this.f266340f);
            intent.putExtras(bundle4);
        }
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f266335a);
        int i = Build.VERSION.SDK_INT;
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        String languageTag = adjustedDefault.size() > 0 ? adjustedDefault.get(0).toLanguageTag() : null;
        if (!TextUtils.isEmpty(languageTag)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", languageTag);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (i >= 34) {
            if (((ActivityOptions) this.f266339e) == null) {
                this.f266339e = ActivityOptions.makeBasic();
            }
            AbstractC1665af.m25767Q((ActivityOptions) this.f266339e);
        }
        if (i >= 36) {
            if (((ActivityOptions) this.f266339e) == null) {
                this.f266339e = ActivityOptions.makeBasic();
            }
            AbstractC2291qf.m72680e((ActivityOptions) this.f266339e, !intent.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false));
        }
        ActivityOptions activityOptions = (ActivityOptions) this.f266339e;
        return new vpj(8, intent, activityOptions != null ? activityOptions.toBundle() : null);
    }

    @Override // p204p.nb40
    /* JADX INFO: renamed from: l */
    public int mo26035l() {
        int iMo26035l;
        synchronized (this.f266337c) {
            iMo26035l = ((nb40) this.f266338d).mo26035l();
        }
        return iMo26035l;
    }

    /* JADX INFO: renamed from: m */
    public void m92224m() {
        synchronized (this.f266337c) {
            try {
                this.f266336b = true;
                ((nb40) this.f266338d).mo26029f();
                if (this.f266335a == 0) {
                    close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m92225n(int i) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException("Invalid value for the colorScheme argument");
        }
        ((Intent) this.f266337c).putExtra("androidx.browser.customtabs.extra.COLOR_SCHEME", i);
    }

    /* JADX INFO: renamed from: o */
    public void m92226o(int i, uhc uhcVar) {
        if (i < 0 || i > 2 || i == 0) {
            throw new IllegalArgumentException(s571.m77246e(i, "Invalid colorScheme: "));
        }
        if (((SparseArray) this.f266340f) == null) {
            this.f266340f = new SparseArray();
        }
        SparseArray sparseArray = (SparseArray) this.f266340f;
        uhcVar.getClass();
        Bundle bundle = new Bundle();
        Integer num = (Integer) uhcVar.f230411b;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = (Integer) uhcVar.f230412c;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = (Integer) uhcVar.f230413d;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = (Integer) uhcVar.f230414e;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        sparseArray.put(i, bundle);
    }

    @Override // p204p.nb40
    /* JADX INFO: renamed from: p */
    public ua40 mo26039p() {
        b440 b440Var;
        synchronized (this.f266337c) {
            ua40 ua40VarMo26039p = ((nb40) this.f266338d).mo26039p();
            if (ua40VarMo26039p != null) {
                this.f266335a++;
                b440Var = new b440(ua40VarMo26039p);
                b440Var.m60747a((a440) this.f266341g);
            } else {
                b440Var = null;
            }
        }
        return b440Var;
    }

    /* JADX INFO: renamed from: q */
    public void m92227q() {
        ((Intent) this.f266337c).putExtra("androidx.browser.customtabs.extra.ENABLE_EPHEMERAL_BROWSING", true);
    }

    /* JADX INFO: renamed from: r */
    public void m92228r() {
        Intent intent = (Intent) this.f266337c;
        this.f266335a = 2;
        intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
    }

    /* JADX INFO: renamed from: s */
    public void m92229s() {
        ((Intent) this.f266337c).putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
    }

    /* JADX INFO: renamed from: t */
    public void m92230t(int i) {
        ((suj) this.f266338d).f214135a = Integer.valueOf(i | (-16777216));
    }

    /* JADX INFO: renamed from: u */
    public void m92231u() {
        ((Intent) this.f266337c).putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
    }

    public xvb(int i) {
        switch (i) {
            case 1:
                this.f266337c = new Intent("android.intent.action.VIEW");
                this.f266338d = new suj();
                this.f266335a = 0;
                this.f266336b = true;
                break;
            default:
                this.f266337c = new HashSet();
                this.f266338d = lpi0.m59671t();
                this.f266335a = -1;
                this.f266339e = new ArrayList();
                this.f266336b = false;
                this.f266340f = nqi0.m65450a();
                break;
        }
    }

    public xvb(yvb yvbVar) {
        HashSet hashSet = new HashSet();
        this.f266337c = hashSet;
        this.f266338d = lpi0.m59671t();
        this.f266335a = -1;
        ArrayList arrayList = new ArrayList();
        this.f266339e = arrayList;
        this.f266336b = false;
        this.f266340f = nqi0.m65450a();
        hashSet.addAll(yvbVar.f276632a);
        this.f266338d = lpi0.m59672u(yvbVar.f276633b);
        this.f266335a = yvbVar.f276634c;
        arrayList.addAll(yvbVar.f276635d);
        this.f266336b = yvbVar.f276636e;
        fs61 fs61Var = yvbVar.f276637f;
        ArrayMap arrayMap = new ArrayMap();
        for (String str : fs61Var.f72778a.keySet()) {
            arrayMap.put(str, fs61Var.f72778a.get(str));
        }
        this.f266340f = new nqi0(arrayMap);
    }

    public xvb(nbm nbmVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.f266337c = intent;
        this.f266338d = new suj();
        this.f266335a = 0;
        this.f266336b = true;
        if (nbmVar != null) {
            intent.setPackage(nbmVar.f152321c.getPackageName());
            jbm jbmVar = nbmVar.f152320b;
            PendingIntent pendingIntent = nbmVar.f152322d;
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", jbmVar);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            intent.putExtras(bundle);
        }
    }
}
