package p204p;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class edi0 implements fke {

    /* JADX INFO: renamed from: a */
    public final String f58523a;

    /* JADX INFO: renamed from: b */
    public final String f58524b;

    /* JADX INFO: renamed from: c */
    public final wg61 f58525c;

    /* JADX INFO: renamed from: d */
    public final wg61 f58526d;

    /* JADX INFO: renamed from: e */
    public final wg61 f58527e;

    public edi0(Application application, String str, String str2) {
        this.f58523a = str;
        this.f58524b = str2;
        this.f58525c = new wg61(new pr0(18, this, application));
        this.f58526d = new wg61(new kjd0(22, this, application));
        this.f58527e = new wg61(new nf60(this, application));
    }

    /* JADX INFO: renamed from: b */
    public static final String m38596b(edi0 edi0Var, PackageManager packageManager, String str) {
        try {
            return Build.VERSION.SDK_INT >= 30 ? packageManager.getInstallSourceInfo(str).getInstallingPackageName() : packageManager.getInstallerPackageName(str);
        } catch (PackageManager.NameNotFoundException e) {
            Logger.m3974j(e, "Failed to get installer package", new Object[0]);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX INFO: renamed from: c */
    public final Uri m38597c() {
        String str;
        String strM38598d = m38598d();
        if (strM38598d == null) {
            str = null;
        } else {
            int iHashCode = strM38598d.hashCode();
            if (iHashCode != -1859733809) {
                if (iHashCode != -1225090538) {
                    if (iHashCode == -1046965711 && strM38598d.equals("com.android.vending")) {
                        str = "market://details?id=";
                    } else {
                        str = null;
                    }
                } else if (strM38598d.equals("com.sec.android.app.samsungapps")) {
                    str = "samsungapps://ProductDetail/";
                } else {
                    str = null;
                }
            } else if (strM38598d.equals("com.amazon.venezia")) {
                str = "https://www.amazon.com/gp/mas/dl/android?p=";
            } else {
                str = null;
            }
        }
        if (str == null) {
            return null;
        }
        return Uri.parse(str + ((PackageInfo) this.f58525c.getValue()).packageName);
    }

    /* JADX INFO: renamed from: d */
    public final String m38598d() {
        return (String) this.f58526d.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final String m38599e() {
        String str = ((PackageInfo) this.f58525c.getValue()).versionName;
        wj50.m88279p(str);
        return str;
    }
}
