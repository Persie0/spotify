package p204p;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.engage.service.AppEngageException;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class k8f1 {

    /* JADX INFO: renamed from: f */
    public static final C2617yl f120355f = new C2617yl("AppEngageService");

    /* JADX INFO: renamed from: g */
    public static final Intent f120356g = new Intent("com.google.android.engage.BIND_APP_ENGAGE_SERVICE").setPackage("com.android.vending");

    /* JADX INFO: renamed from: h */
    public static final Intent f120357h = new Intent("com.google.android.engage.BIND_APP_ENGAGE_SERVICE").setPackage("com.google.android.engage.verifyapp");

    /* JADX INFO: renamed from: i */
    public static k8f1 f120358i;

    /* JADX INFO: renamed from: a */
    public final boolean f120359a;

    /* JADX INFO: renamed from: b */
    public final boolean f120360b;

    /* JADX INFO: renamed from: c */
    public final String f120361c;

    /* JADX INFO: renamed from: d */
    public final String f120362d;

    /* JADX INFO: renamed from: e */
    public final dsg1 f120363e;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if (r8.equals("DEBUG") != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k8f1(Context context) {
        String string;
        int i;
        this.f120361c = context.getPackageName();
        C2617yl c2617yl = ddf1.f47820a;
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            string = bundle != null ? bundle.getString("com.google.android.engage.service.ENV") : null;
        } catch (PackageManager.NameNotFoundException e) {
            c2617yl.m94135f(e, "Package name not found.", new Object[0]);
        }
        string = string == null ? "DEBUG" : string;
        int i2 = 2;
        try {
            String upperCase = string.toUpperCase(Locale.getDefault());
            int iHashCode = upperCase.hashCode();
            if (iHashCode != -2056856391) {
                if (iHashCode == 64921139) {
                }
                throw new IllegalArgumentException();
            }
            if (upperCase.equals("PRODUCTION")) {
                i2 = 1;
                int i3 = -1;
                int i4 = i2 - 1;
                C2617yl c2617yl2 = f120355f;
                if (i4 != 0) {
                    this.f120362d = "1.5.1-debug";
                    this.f120359a = true;
                    this.f120360b = true;
                    try {
                        context.getPackageManager().getPackageInfo("com.google.android.engage.verifyapp", 0);
                        this.f120363e = new dsg1(rsf1.m76338w(context), c2617yl2, f120357h);
                        return;
                    } catch (PackageManager.NameNotFoundException unused) {
                        this.f120363e = null;
                        return;
                    }
                }
                this.f120362d = "1.5.1";
                if (!u0h1.m82125a(context)) {
                    this.f120363e = null;
                    this.f120359a = false;
                    this.f120360b = false;
                    return;
                } else {
                    this.f120363e = new dsg1(rsf1.m76338w(context), c2617yl2, f120356g);
                    try {
                        i = context.getPackageManager().getPackageInfo("com.android.vending", 0).versionCode;
                    } catch (PackageManager.NameNotFoundException unused2) {
                        i = -1;
                    }
                    this.f120359a = i >= 83441400;
                    try {
                        i3 = context.getPackageManager().getPackageInfo("com.android.vending", 0).versionCode;
                    } catch (PackageManager.NameNotFoundException unused3) {
                    }
                    this.f120360b = i3 >= 84080000;
                    return;
                }
            }
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e2) {
            c2617yl.m94135f(e2, s571.m77251j("Env [", string, "] is not supported. Supported values: 'debug' and 'production'."), new Object[0]);
        }
    }

    /* JADX INFO: renamed from: a */
    public final y7h1 m55746a(va91 va91Var) {
        Bundle bundle = new Bundle();
        bundle.putString("engage_sdk_version", this.f120362d);
        bundle.putString("calling_package_name", this.f120361c);
        bundle.putBundle("clusters_v2", va91Var.m85034c());
        if (this.f120363e == null) {
            return bga.m29101w(new AppEngageException(1));
        }
        if (this.f120360b) {
            return m55747b(new sqe1(this, bundle));
        }
        f120355f.m94134e("Publish clusters skipped. Please upgrade your play store version to 40.8 or above.", new Object[0]);
        return bga.m29102x(new Bundle());
    }

    /* JADX INFO: renamed from: b */
    public final y7h1 m55747b(w7f1 w7f1Var) {
        ev61 ev61Var = new ev61();
        dsg1 dsg1Var = this.f120363e;
        if (dsg1Var == null) {
            return bga.m29101w(new AppEngageException(1));
        }
        dsg1Var.m36773d(new i8g1(this, ev61Var, w7f1Var, ev61Var), ev61Var);
        return ev61Var.f63172a.mo1513e(ckr.f39074a, new dvb1());
    }
}
