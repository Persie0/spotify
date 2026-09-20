package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import p204p.haz;
import p204p.hwi0;
import p204p.s571;

/* JADX INFO: loaded from: classes.dex */
class JniNativeApi implements hwi0 {

    /* JADX INFO: renamed from: b */
    public static final boolean f2399b;

    /* JADX INFO: renamed from: c */
    public static final C0165c f2400c = new C0165c();

    /* JADX INFO: renamed from: a */
    public final Context f2401a;

    static {
        boolean z;
        try {
            System.loadLibrary("crashlytics");
            z = true;
        } catch (UnsatisfiedLinkError e) {
            haz hazVar = haz.f89320X;
            e.getLocalizedMessage();
            hazVar.m46949m();
            z = false;
        }
        f2399b = z;
    }

    public JniNativeApi(Context context) {
        this.f2401a = context;
    }

    /* JADX INFO: renamed from: a */
    public static void m1883a(ArrayList arrayList, PackageInfo packageInfo) {
        haz hazVar = haz.f89320X;
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null) {
            Collections.addAll(arrayList, strArr);
        }
        File file = new File(applicationInfo.dataDir, s571.m77251j("files/splitcompat/", Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode), "/verified-splits"));
        if (!file.exists()) {
            file.getAbsolutePath();
            hazVar.m46947g();
            return;
        }
        File[] fileArrListFiles = file.listFiles(f2400c);
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        file.getAbsolutePath();
        hazVar.m46947g();
        for (File file2 : fileArrListFiles) {
            file2.getName();
            hazVar.m46947g();
            arrayList.add(file2.getAbsolutePath());
        }
    }

    private native boolean nativeInit(String[] strArr, Object obj);

    /* JADX INFO: renamed from: b */
    public final boolean m1884b(AssetManager assetManager, String str) {
        String str2 = Build.CPU_ABI;
        Context context = this.f2401a;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 9216);
            ArrayList<String> arrayList = new ArrayList(10);
            arrayList.add(packageInfo.applicationInfo.sourceDir);
            m1883a(arrayList, packageInfo);
            String[] strArr = packageInfo.applicationInfo.sharedLibraryFiles;
            if (strArr != null) {
                Collections.addAll(arrayList, strArr);
            }
            ArrayList arrayList2 = new ArrayList(10);
            File parentFile = new File(packageInfo.applicationInfo.nativeLibraryDir).getParentFile();
            if (parentFile != null) {
                arrayList2.add(new File(parentFile, str2).getPath());
                if (str2.startsWith("arm64")) {
                    arrayList2.add(new File(parentFile, "arm64").getPath());
                } else if (str2.startsWith("arm")) {
                    arrayList2.add(new File(parentFile, "arm").getPath());
                }
            }
            for (String str3 : arrayList) {
                if (str3.endsWith(".apk")) {
                    arrayList2.add(str3 + "!/lib/" + str2);
                }
            }
            arrayList2.add(System.getProperty("java.library.path"));
            arrayList2.add(packageInfo.applicationInfo.nativeLibraryDir);
            String str4 = File.pathSeparator;
            String[] strArr2 = {TextUtils.join(str4, arrayList), TextUtils.join(str4, arrayList2)};
            return f2399b && nativeInit(new String[]{strArr2[0], strArr2[1], str}, assetManager);
        } catch (PackageManager.NameNotFoundException e) {
            haz.f89320X.m46948k();
            throw new RuntimeException(e);
        }
    }
}
