package p204p;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.spotify.music.R;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class wo10 {

    /* JADX INFO: renamed from: b */
    public static boolean f253336b = false;

    /* JADX INFO: renamed from: c */
    public static boolean f253337c = false;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f253339e = 0;

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f253335a = new AtomicBoolean();

    /* JADX INFO: renamed from: d */
    public static final AtomicBoolean f253338d = new AtomicBoolean();

    /* JADX INFO: renamed from: a */
    public static void m88615a(Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        vj10 vj10Var = vj10.f241854b;
        int iM85679c = vj10Var.m85679c(context, 11925000);
        if (iM85679c != 0) {
            Intent intentM85678a = vj10Var.m85678a(iM85679c, context, "e");
            new StringBuilder(String.valueOf(iM85679c).length() + 46);
            if (intentM85678a != null) {
                throw new GooglePlayServicesRepairableException("Google Play Services not available");
            }
            throw new GooglePlayServicesNotAvailableException(iM85679c);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m88616b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m88617c(int i) {
        return lzi.m60322k(i);
    }

    /* JADX INFO: renamed from: d */
    public static Context m88618d(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m88619e(Context context) {
        if (!f253337c) {
            try {
                PackageInfo packageInfo = ffe1.m41527a(context).f247445a.getPackageManager().getPackageInfo("com.google.android.gms", Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
                ip10.m51223a(context);
                if (packageInfo == null || ip10.m51224c(packageInfo, false) || !ip10.m51224c(packageInfo, true)) {
                    f253336b = false;
                } else {
                    f253336b = true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            } finally {
                f253337c = true;
            }
        }
        return f253336b || !"user".equals(Build.TYPE);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x019b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:73:0x0146  */
    /* JADX WARN: Code duplicated, block: B:80:0x0167  */
    /* JADX WARN: Code duplicated, block: B:81:0x0169  */
    /* JADX WARN: Code duplicated, block: B:84:0x016e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0172  */
    /* JADX WARN: Code duplicated, block: B:87:0x0197  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b0 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x01b2 A[RETURN] */
    /* JADX INFO: renamed from: f */
    public static int m88620f(Context context, int i) {
        boolean z;
        PackageInfo packageInfo;
        int i2;
        int i3;
        ApplicationInfo applicationInfo;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f253338d.get()) {
            synchronized (vie1.f241689c) {
                try {
                    if (!vie1.f241690d) {
                        vie1.f241690d = true;
                        try {
                            Bundle bundle = ffe1.m41527a(context).f247445a.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                            if (bundle != null) {
                                bundle.getString("com.google.app.id");
                                vie1.f241691e = bundle.getInt("com.google.android.gms.version");
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int i4 = vie1.f241691e;
            if (i4 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i4 != 12451000) {
                int i5 = vj10.f241853a;
                StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 104 + String.valueOf(i4).length() + 194);
                sb.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
                sb.append(i5);
                sb.append(" but found ");
                sb.append(i4);
                sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                throw new GooglePlayServicesIncorrectManifestValueException(sb.toString());
            }
        }
        if (lqg1.m59757y(context)) {
            z = false;
        } else {
            if (lqg1.f136046c == null) {
                lqg1.f136046c = Boolean.valueOf(u1h1.m82225t() ? context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") : context.getPackageManager().hasSystemFeature("android.hardware.type.iot"));
            }
            if (lqg1.f136046c.booleanValue()) {
                z = false;
            } else {
                z = true;
            }
        }
        ig31.m50498p(i >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", Build.VERSION.SDK_INT >= 28 ? 134225984 : 8256);
            } catch (PackageManager.NameNotFoundException unused3) {
                String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing.");
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
            ip10.m51223a(context);
            if (!ip10.m51224c(packageInfo2, true)) {
                String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid.");
            } else {
                if (!z) {
                    if (z) {
                    }
                    i2 = packageInfo2.versionCode;
                    if (i2 == -1) {
                        i3 = -1;
                    } else {
                        i3 = i2 / 1000;
                    }
                    if (i3 < (i != -1 ? i / 1000 : -1)) {
                        new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i).length() + 11 + String.valueOf(i2).length());
                        return 2;
                    }
                    applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    }
                    if (applicationInfo.enabled) {
                        return 0;
                    }
                    return 3;
                }
                ig31.m50506x(packageInfo);
                if (!ip10.m51224c(packageInfo, true)) {
                    String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid.");
                } else {
                    if (z || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                        i2 = packageInfo2.versionCode;
                        if (i2 == -1) {
                            i3 = -1;
                        } else {
                            i3 = i2 / 1000;
                        }
                        if (i3 < (i != -1 ? i / 1000 : -1)) {
                            new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i).length() + 11 + String.valueOf(i2).length());
                            return 2;
                        }
                        applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            try {
                                applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                            } catch (PackageManager.NameNotFoundException unused4) {
                                String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info.");
                                return 1;
                            }
                        }
                        if (applicationInfo.enabled) {
                            return 3;
                        }
                        return 0;
                    }
                    String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services.");
                }
            }
            return 9;
        } catch (PackageManager.NameNotFoundException unused5) {
            String.valueOf(packageName).concat(" requires Google Play services, but they are missing.");
            return 1;
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m88621g(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m88622h(Context context) {
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}
