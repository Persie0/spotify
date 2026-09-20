package p204p;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes3.dex */
public final class y2f1 implements j2f1 {

    /* JADX INFO: renamed from: c */
    public static final String f268606c;

    /* JADX INFO: renamed from: a */
    public final ove f268607a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f268608b;

    static {
        String canonicalName = y2f1.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = y2f1.class.getSimpleName();
        }
        f268606c = canonicalName;
    }

    public y2f1(ove oveVar, SharedPreferences sharedPreferences) {
        this.f268607a = oveVar;
        this.f268608b = sharedPreferences;
    }

    /* JADX INFO: renamed from: a */
    public static String m92703a(Context context) {
        return Build.VERSION.SDK_INT >= 30 ? context.getPackageManager().getInstallSourceInfo(context.getPackageName()).getInstallingPackageName() : String.valueOf(context.getPackageManager().getInstallerPackageName(context.getPackageName()));
    }

    /* JADX INFO: renamed from: b */
    public static long m92704b(ZipFile zipFile) {
        ArrayList list = Collections.list(zipFile.entries());
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = list.get(i2);
            i2++;
            if (bm51.m29803n0(((ZipEntry) obj).getName(), "classes", false)) {
                arrayList.add(obj);
            }
        }
        int size2 = arrayList.size();
        long size3 = 0;
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            size3 += ((ZipEntry) obj2).getSize();
        }
        return size3;
    }

    /* JADX INFO: renamed from: c */
    public static long m92705c(ZipFile zipFile) {
        ArrayList list = Collections.list(zipFile.entries());
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i = 0;
        while (i < size) {
            Object obj = list.get(i);
            i++;
            ZipEntry zipEntry = (ZipEntry) obj;
            zipEntry.isDirectory();
            if (bm51.m29803n0(zipEntry.getName(), "classes", false)) {
                arrayList.add(obj);
            }
        }
        int size2 = arrayList.size();
        long crc = 0;
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            ZipEntry zipEntry2 = (ZipEntry) obj2;
            String str = "entry name = " + zipEntry2 + ", entry size = " + zipEntry2.getSize();
            utu0 utu0Var = gk71.f80747a;
            utu0Var.m83940H(f268606c);
            utu0Var.m83952u(str, new Object[0]);
            crc += zipEntry2.getCrc();
        }
        return crc;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m92706d(Context context) {
        String strM92703a = m92703a(context);
        if (strM92703a == null) {
            return false;
        }
        int iHashCode = strM92703a.hashCode();
        if (iHashCode == -1859733809) {
            return strM92703a.equals("com.amazon.venezia");
        }
        if (iHashCode == -1637701853) {
            return strM92703a.equals("com.huawei.appmarket");
        }
        if (iHashCode != -1225090538) {
            return iHashCode == -1046965711 && strM92703a.equals("com.android.vending");
        }
        return strM92703a.equals("com.sec.android.app.samsungapps");
    }
}
