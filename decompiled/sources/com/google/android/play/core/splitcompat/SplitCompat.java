package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.StrictMode;
import com.google.android.play.core.splitinstall.internal.zzah;
import com.google.android.play.core.splitinstall.internal.zzak;
import com.google.android.play.core.splitinstall.internal.zzam;
import com.google.android.play.core.splitinstall.internal.zzan;
import com.google.android.play.core.splitinstall.internal.zzao;
import com.google.android.play.core.splitinstall.internal.zzbh;
import com.google.android.play.core.splitinstall.zzbe;
import com.google.android.play.core.splitinstall.zzo;
import com.google.android.play.core.splitinstall.zzr;
import com.google.android.play.core.splitinstall.zzs;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p204p.dc31;
import p204p.h6f1;
import p204p.itg1;
import p204p.mwf1;
import p204p.n081;
import p204p.q0h1;
import p204p.tif1;
import p204p.wpa1;
import p204p.wze1;
import p204p.ypg1;

/* JADX INFO: loaded from: classes.dex */
public class SplitCompat {
    public static final /* synthetic */ int zza = 0;
    private static final AtomicReference zzb = new AtomicReference(null);
    private final mwf1 zzc;
    private final zzbe zzd;
    private final Set zze = new HashSet();
    private final h6f1 zzf;

    private SplitCompat(Context context) {
        try {
            mwf1 mwf1Var = new mwf1(context);
            this.zzc = mwf1Var;
            this.zzf = new h6f1(mwf1Var);
            this.zzd = new zzbe(context);
        } catch (PackageManager.NameNotFoundException e) {
            throw new zzbh("Failed to initialize FileStorage", e);
        }
    }

    public static boolean install(Context context) {
        return zzi(context, false);
    }

    public static boolean installActivity(Context context) {
        StrictMode.ThreadPolicy threadPolicy;
        if (zzj()) {
            return false;
        }
        SplitCompat splitCompat = (SplitCompat) zzb.get();
        if (splitCompat == null) {
            if (context.getApplicationContext() != null) {
                install(context.getApplicationContext());
            }
            return install(context);
        }
        h6f1 h6f1Var = splitCompat.zzf;
        Set<String> setZzf = splitCompat.zzf();
        synchronized (h6f1Var) {
            try {
                threadPolicy = StrictMode.getThreadPolicy();
                try {
                    StrictMode.allowThreadDiskReads();
                    StrictMode.allowThreadDiskWrites();
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                threadPolicy = null;
            }
            try {
                HashSet hashSet = new HashSet();
                for (String str : setZzf) {
                    mwf1 mwf1Var = h6f1Var.f88085a;
                    mwf1Var.getClass();
                    File file = new File(mwf1Var.m63018g(), "verified-splits");
                    mwf1.m63014e(file);
                    hashSet.add(mwf1.m63013d(file, String.valueOf(str).concat(".apk")));
                }
                h6f1Var.m46723a(context, hashSet);
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
            } catch (Exception unused3) {
                if (threadPolicy == null) {
                    return false;
                }
                StrictMode.setThreadPolicy(threadPolicy);
                return false;
            } catch (Throwable th) {
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                throw th;
            }
        }
        return true;
    }

    public static boolean zzd(Context context) {
        return zzi(context, true);
    }

    public static boolean zze() {
        return zzb.get() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set zzf() {
        HashSet hashSet;
        synchronized (this.zze) {
            hashSet = new HashSet(this.zze);
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg(Set set) throws IOException {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            mwf1 mwf1Var = this.zzc;
            mwf1Var.getClass();
            File file = new File(mwf1Var.m63018g(), "verified-splits");
            mwf1.m63014e(file);
            mwf1.m63012c(mwf1.m63013d(file, String.valueOf(str).concat(".apk")));
        }
        this.zzd.zzb();
    }

    private final synchronized void zzh(Context context, boolean z) {
        try {
            if (z) {
                this.zzc.m63016b();
            } else {
                wze1.m89424E().execute(new n081(this, 27));
            }
            String packageName = context.getPackageName();
            try {
                boolean z2 = false;
                String[] strArr = context.getPackageManager().getPackageInfo(packageName, 0).splitNames;
                List<String> arrayList = strArr == null ? new ArrayList() : Arrays.asList(strArr);
                HashSet<tif1> hashSetM63015a = this.zzc.m63015a();
                Set setZza = this.zzd.zza();
                HashSet hashSet = new HashSet();
                Iterator it = hashSetM63015a.iterator();
                while (it.hasNext()) {
                    String strM80924b = ((tif1) it.next()).m80924b();
                    if (arrayList.contains(strM80924b) || setZza.contains(zzs.zzb(strM80924b))) {
                        hashSet.add(strM80924b);
                        it.remove();
                    }
                }
                if (z) {
                    zzg(hashSet);
                } else if (!hashSet.isEmpty()) {
                    wze1.m89424E().execute(new wpa1(this, hashSet, z2, 16));
                }
                HashSet hashSet2 = new HashSet();
                Iterator it2 = hashSetM63015a.iterator();
                while (it2.hasNext()) {
                    String strM80924b2 = ((tif1) it2.next()).m80924b();
                    if (!zzs.zze(strM80924b2)) {
                        hashSet2.add(strM80924b2);
                    }
                }
                for (String str : arrayList) {
                    if (!zzs.zze(str)) {
                        hashSet2.add(str);
                    }
                }
                HashSet<tif1> hashSet3 = new HashSet(hashSetM63015a.size());
                for (tif1 tif1Var : hashSetM63015a) {
                    String strM80924b3 = tif1Var.m80924b();
                    int i = zzs.zza;
                    if (strM80924b3.startsWith("config.") || hashSet2.contains(zzs.zzb(tif1Var.m80924b()))) {
                        hashSet3.add(tif1Var);
                    }
                }
                ypg1 ypg1Var = new ypg1(this.zzc);
                zzan zzanVarZza = zzao.zza();
                ClassLoader classLoader = context.getClassLoader();
                ZipFile zipFile = null;
                if (z) {
                    zzanVarZza.zza(classLoader, ypg1Var.m94304a());
                } else {
                    Iterator it3 = hashSet3.iterator();
                    while (it3.hasNext()) {
                        tif1 tif1Var2 = (tif1) it3.next();
                        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                        HashSet hashSet4 = new HashSet();
                        ypg1.m94303b(tif1Var2, new dc31(ypg1Var, tif1Var2, hashSet4, atomicBoolean));
                        if (!atomicBoolean.get()) {
                            hashSet4 = null;
                        }
                        if (hashSet4 == null) {
                            it3.remove();
                        } else {
                            zzanVarZza.zza(classLoader, hashSet4);
                        }
                    }
                }
                HashSet hashSet5 = new HashSet();
                for (tif1 tif1Var3 : hashSet3) {
                    try {
                        ZipFile zipFile2 = new ZipFile(tif1Var3.m80923a());
                        try {
                            ZipEntry entry = zipFile2.getEntry("classes.dex");
                            zipFile2.close();
                            if (entry != null) {
                                mwf1 mwf1Var = this.zzc;
                                String strM80924b4 = tif1Var3.m80924b();
                                mwf1Var.getClass();
                                File file = new File(mwf1Var.m63018g(), "dex");
                                mwf1.m63014e(file);
                                File fileM63013d = mwf1.m63013d(file, strM80924b4);
                                mwf1.m63014e(fileM63013d);
                                if (!zzanVarZza.zzb(classLoader, fileM63013d, tif1Var3.m80923a(), z)) {
                                    "split was not installed ".concat(tif1Var3.m80923a().toString());
                                }
                            }
                            hashSet5.add(tif1Var3.m80923a());
                        } catch (IOException e) {
                            e = e;
                            zipFile = zipFile2;
                            if (zipFile != null) {
                                try {
                                    zipFile.close();
                                } catch (IOException e2) {
                                    try {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e2);
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            throw e;
                        }
                    } catch (IOException e3) {
                        e = e3;
                    }
                }
                this.zzf.m46723a(context, hashSet5);
                HashSet hashSet6 = new HashSet();
                for (tif1 tif1Var4 : hashSet3) {
                    if (hashSet5.contains(tif1Var4.m80923a())) {
                        hashSet6.add(tif1Var4.m80924b());
                    }
                }
                synchronized (this.zze) {
                    this.zze.addAll(hashSet6);
                }
            } catch (PackageManager.NameNotFoundException e4) {
                throw new IOException("Cannot load data for application '" + packageName + "'", e4);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private static boolean zzi(Context context, boolean z) {
        boolean z2;
        Context context2;
        if (zzj()) {
            return false;
        }
        AtomicReference atomicReference = zzb;
        SplitCompat splitCompat = new SplitCompat(context);
        while (true) {
            if (!atomicReference.compareAndSet(null, splitCompat)) {
                if (atomicReference.get() != null && atomicReference.get() != null) {
                    z2 = false;
                    break;
                }
            } else {
                z2 = true;
                break;
            }
        }
        SplitCompat splitCompat2 = (SplitCompat) zzb.get();
        if (z2) {
            context2 = context;
            zzo.INSTANCE.zzb(new zzak(context2, wze1.m89424E(), new zzam(context, splitCompat2.zzc, new zzah()), splitCompat2.zzc, new q0h1()));
            zzr.zzb(new itg1(splitCompat2));
            wze1.m89424E().execute(new n081(context2, 26));
        } else {
            context2 = context;
        }
        try {
            splitCompat2.zzh(context2, z);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean zzj() {
        return false;
    }
}
