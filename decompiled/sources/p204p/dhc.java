package p204p;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class dhc implements ed91 {

    /* JADX INFO: renamed from: a */
    public final ae00 f49047a;

    /* JADX INFO: renamed from: b */
    public final ConnectivityManager f49048b;

    /* JADX INFO: renamed from: c */
    public final Context f49049c;

    /* JADX INFO: renamed from: d */
    public final URL f49050d;

    /* JADX INFO: renamed from: e */
    public final wre f49051e;

    /* JADX INFO: renamed from: f */
    public final wre f49052f;

    /* JADX INFO: renamed from: g */
    public final int f49053g;

    public dhc(Context context, wre wreVar, wre wreVar2) {
        uk60 uk60Var = new uk60();
        oet.f164539X.m66802f(uk60Var);
        uk60Var.f231244d = true;
        this.f49047a = new ae00(uk60Var, 14);
        this.f49049c = context;
        this.f49048b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f49050d = m36009b(nva.f158845c);
        this.f49051e = wreVar2;
        this.f49052f = wreVar;
        this.f49053g = 130000;
    }

    /* JADX INFO: renamed from: b */
    public static URL m36009b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(edb.m38564m("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00ba  */
    /* JADX INFO: renamed from: a */
    public final t08 m36010a(t08 t08Var) {
        int subtype;
        String simOperator;
        NetworkInfo activeNetworkInfo = this.f49048b.getActiveNetworkInfo();
        rk0 rk0VarM79773c = t08Var.m79773c();
        rk0VarM79773c.m75704t(Build.VERSION.SDK_INT, "sdk-version");
        rk0VarM79773c.m75706v("model", Build.MODEL);
        rk0VarM79773c.m75706v("hardware", Build.HARDWARE);
        rk0VarM79773c.m75706v("device", Build.DEVICE);
        rk0VarM79773c.m75706v("product", Build.PRODUCT);
        rk0VarM79773c.m75706v("os-uild", Build.ID);
        rk0VarM79773c.m75706v("manufacturer", Build.MANUFACTURER);
        rk0VarM79773c.m75706v("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        rk0VarM79773c.m75705u(TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000);
        rk0VarM79773c.m75704t(activeNetworkInfo == null ? vgj0.NONE.m85487a() : activeNetworkInfo.getType(), "net-type");
        int i = -1;
        try {
            if (activeNetworkInfo != null) {
                subtype = activeNetworkInfo.getSubtype();
                if (subtype == -1) {
                    SparseArray sparseArray = ugj0.f230194a;
                    subtype = 100;
                } else if (((ugj0) ugj0.f230194a.get(subtype)) == null) {
                }
                rk0VarM79773c.m75704t(subtype, "mobile-subtype");
                rk0VarM79773c.m75706v("country", Locale.getDefault().getCountry());
                rk0VarM79773c.m75706v("locale", Locale.getDefault().getLanguage());
                Context context = this.f49049c;
                simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
                if (simOperator == null) {
                    simOperator = "";
                }
                rk0VarM79773c.m75706v("mcc_mnc", simOperator);
                i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                rk0VarM79773c.m75706v("application_build", Integer.toString(i));
                return rk0VarM79773c.m75710z();
            }
            SparseArray sparseArray2 = ugj0.f230194a;
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            qvf1.m74015l("CctTransportBackend");
        }
        subtype = 0;
        rk0VarM79773c.m75704t(subtype, "mobile-subtype");
        rk0VarM79773c.m75706v("country", Locale.getDefault().getCountry());
        rk0VarM79773c.m75706v("locale", Locale.getDefault().getLanguage());
        Context context2 = this.f49049c;
        simOperator = ((TelephonyManager) context2.getSystemService("phone")).getSimOperator();
        if (simOperator == null) {
            simOperator = "";
        }
        rk0VarM79773c.m75706v("mcc_mnc", simOperator);
        rk0VarM79773c.m75706v("application_build", Integer.toString(i));
        return rk0VarM79773c.m75710z();
    }
}
