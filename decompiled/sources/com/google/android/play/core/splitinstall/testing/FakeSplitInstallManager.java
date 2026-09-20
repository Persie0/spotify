package com.google.android.play.core.splitinstall.testing;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallRequest;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener;
import com.google.android.play.core.splitinstall.internal.zzbs;
import com.google.android.play.core.splitinstall.internal.zzbw;
import com.google.android.play.core.splitinstall.internal.zzbx;
import com.google.android.play.core.splitinstall.internal.zzby;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p204p.bga;
import p204p.hg0;
import p204p.w550;
import p204p.wze1;

/* JADX INFO: loaded from: classes4.dex */
public class FakeSplitInstallManager implements SplitInstallManager {
    public static final /* synthetic */ int zza = 0;
    private static final long zzb = TimeUnit.SECONDS.toMillis(1);
    private final Handler zzc;
    private final Context zzd;
    private final com.google.android.play.core.splitinstall.zzs zze;
    private final zzby zzf;
    private final zzbs zzg;
    private final com.google.android.play.core.splitinstall.internal.zzt zzh;
    private final com.google.android.play.core.splitinstall.internal.zzt zzi;
    private final Executor zzj;
    private final com.google.android.play.core.splitinstall.zzg zzk;
    private final File zzl;
    private final AtomicReference zzm;
    private final Set zzn;
    private final Set zzo;
    private final AtomicBoolean zzp;
    private final zzj zzq;

    @Deprecated
    public FakeSplitInstallManager(Context context, File file) {
        this(context, file, new com.google.android.play.core.splitinstall.zzs(context, context.getPackageName()), new zzby() { // from class: com.google.android.play.core.splitinstall.testing.zze
            @Override // com.google.android.play.core.splitinstall.internal.zzby
            public final Object zza() {
                int i = FakeSplitInstallManager.zza;
                return zzv.zza;
            }
        });
    }

    private final Task zzk(@SplitInstallErrorCode final int i) {
        zzn(new zzr() { // from class: com.google.android.play.core.splitinstall.testing.zzp
            @Override // com.google.android.play.core.splitinstall.testing.zzr
            public final SplitInstallSessionState zza(SplitInstallSessionState splitInstallSessionState) {
                int i2 = i;
                int i3 = FakeSplitInstallManager.zza;
                if (splitInstallSessionState == null) {
                    return null;
                }
                return SplitInstallSessionState.create(splitInstallSessionState.sessionId(), 6, i2, splitInstallSessionState.bytesDownloaded(), splitInstallSessionState.totalBytesToDownload(), splitInstallSessionState.moduleNames(), splitInstallSessionState.languages());
            }
        });
        return bga.m29101w(new SplitInstallException(i));
    }

    private final com.google.android.play.core.splitinstall.zzk zzl() {
        try {
            com.google.android.play.core.splitinstall.zzk zzkVarZza = this.zze.zza(this.zzd.getPackageManager().getPackageInfo(this.zzd.getPackageName(), 128).applicationInfo.metaData);
            if (zzkVarZza != null) {
                return zzkVarZza;
            }
            throw new IllegalStateException("Language information could not be found. Make sure you are using the target application context, not the tests context, and the app is built as a bundle.");
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalStateException("App is not found in PackageManager", e);
        }
    }

    private final SplitInstallSessionState zzm() {
        return (SplitInstallSessionState) this.zzm.get();
    }

    private final synchronized SplitInstallSessionState zzn(zzr zzrVar) {
        boolean z;
        SplitInstallSessionState splitInstallSessionStateZzm = zzm();
        SplitInstallSessionState splitInstallSessionStateZza = zzrVar.zza(splitInstallSessionStateZzm);
        AtomicReference atomicReference = this.zzm;
        while (true) {
            if (atomicReference.compareAndSet(splitInstallSessionStateZzm, splitInstallSessionStateZza)) {
                z = true;
            } else if (atomicReference.get() != splitInstallSessionStateZzm) {
                z = false;
            } else {
                continue;
            }
            if (z) {
                return splitInstallSessionStateZza;
            }
            if (atomicReference.get() != splitInstallSessionStateZzm) {
                return null;
            }
        }
    }

    private static String zzo(String str) {
        return str.split("\\.config\\.", 2)[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzp(List list, List list2, List list3, long j, boolean z) {
        this.zzk.zza().zzd(list, new zzq(this, list2, list3, j, z, list));
    }

    private final void zzq(final SplitInstallSessionState splitInstallSessionState) {
        this.zzc.post(new Runnable() { // from class: com.google.android.play.core.splitinstall.testing.zzf
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzg(splitInstallSessionState);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzr(List list, List list2, long j) {
        this.zzn.addAll(list);
        this.zzo.addAll(list2);
        Long lValueOf = Long.valueOf(j);
        zzs(5, 0, lValueOf, lValueOf, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzs(final int i, final int i2, final Long l, final Long l2, final List list, final Integer num, final List list2) {
        SplitInstallSessionState splitInstallSessionStateZzn = zzn(new zzr() { // from class: com.google.android.play.core.splitinstall.testing.zzg
            @Override // com.google.android.play.core.splitinstall.testing.zzr
            public final SplitInstallSessionState zza(SplitInstallSessionState splitInstallSessionState) {
                Integer num2 = num;
                int i3 = i;
                int i4 = i2;
                Long l3 = l;
                Long l4 = l2;
                List<String> listModuleNames = list;
                List<String> listLanguages = list2;
                int i5 = FakeSplitInstallManager.zza;
                SplitInstallSessionState splitInstallSessionStateCreate = splitInstallSessionState == null ? SplitInstallSessionState.create(0, 0, 0, 0L, 0L, new ArrayList(), new ArrayList()) : splitInstallSessionState;
                int iSessionId = num2 == null ? splitInstallSessionStateCreate.sessionId() : num2.intValue();
                long jBytesDownloaded = l3 == null ? splitInstallSessionStateCreate.bytesDownloaded() : l3.longValue();
                long jLongValue = l4 == null ? splitInstallSessionStateCreate.totalBytesToDownload() : l4.longValue();
                if (listModuleNames == null) {
                    listModuleNames = splitInstallSessionStateCreate.moduleNames();
                }
                if (listLanguages == null) {
                    listLanguages = splitInstallSessionStateCreate.languages();
                }
                return SplitInstallSessionState.create(iSessionId, i3, i4, jBytesDownloaded, jLongValue, listModuleNames, listLanguages);
            }
        });
        if (splitInstallSessionStateZzn == null) {
            return false;
        }
        zzq(splitInstallSessionStateZzn);
        return true;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task cancelInstall(final int i) {
        try {
            SplitInstallSessionState splitInstallSessionStateZzn = zzn(new zzr() { // from class: com.google.android.play.core.splitinstall.testing.zzh
                @Override // com.google.android.play.core.splitinstall.testing.zzr
                public final SplitInstallSessionState zza(final SplitInstallSessionState splitInstallSessionState) {
                    final int i2 = i;
                    return (SplitInstallSessionState) zzbx.zzc(new Callable() { // from class: com.google.android.play.core.splitinstall.testing.zzo
                        @Override // java.util.concurrent.Callable
                        public final Object call() throws SplitInstallException {
                            int iStatus;
                            SplitInstallSessionState splitInstallSessionState2 = splitInstallSessionState;
                            int i3 = i2;
                            int i4 = FakeSplitInstallManager.zza;
                            if (splitInstallSessionState2 != null && i3 == splitInstallSessionState2.sessionId() && ((iStatus = splitInstallSessionState2.status()) == 1 || iStatus == 2 || iStatus == 8 || iStatus == 9 || iStatus == 7)) {
                                return SplitInstallSessionState.create(i3, 7, splitInstallSessionState2.errorCode(), splitInstallSessionState2.bytesDownloaded(), splitInstallSessionState2.totalBytesToDownload(), splitInstallSessionState2.moduleNames(), splitInstallSessionState2.languages());
                            }
                            throw new SplitInstallException(-3);
                        }
                    });
                }
            });
            if (splitInstallSessionStateZzn != null) {
                zzq(splitInstallSessionStateZzn);
            }
            return bga.m29102x(null);
        } catch (zzbx e) {
            return bga.m29101w(e.zzb(SplitInstallException.class));
        }
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task deferredInstall(List<String> list) {
        return bga.m29101w(new SplitInstallException(-5));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task deferredLanguageInstall(List<Locale> list) {
        return bga.m29101w(new SplitInstallException(-5));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task deferredLanguageUninstall(List<Locale> list) {
        return bga.m29101w(new SplitInstallException(-5));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task deferredUninstall(List<String> list) {
        return bga.m29101w(new SplitInstallException(-5));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Set<String> getInstalledLanguages() {
        HashSet hashSet = new HashSet();
        if (this.zze.zzd() != null) {
            hashSet.addAll(this.zze.zzd());
        }
        hashSet.addAll(this.zzo);
        return hashSet;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Set<String> getInstalledModules() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.zze.zzc());
        hashSet.addAll(this.zzn);
        return hashSet;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task getSessionState(int i) {
        SplitInstallSessionState splitInstallSessionStateZzm = zzm();
        return (splitInstallSessionStateZzm == null || splitInstallSessionStateZzm.sessionId() != i) ? bga.m29101w(new SplitInstallException(-4)) : bga.m29102x(splitInstallSessionStateZzm);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task getSessionStates() {
        SplitInstallSessionState splitInstallSessionStateZzm = zzm();
        return bga.m29102x(splitInstallSessionStateZzm != null ? Collections.singletonList(splitInstallSessionStateZzm) : Collections.EMPTY_LIST);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void registerListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.zzi.zza(splitInstallStateUpdatedListener);
    }

    public void setShouldNetworkError(boolean z) {
        this.zzp.set(z);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, Activity activity, int i) {
        return false;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task startInstall(SplitInstallRequest splitInstallRequest) {
        Integer numZza;
        int i;
        File[] fileArr;
        try {
            final SplitInstallRequest splitInstallRequest2 = splitInstallRequest;
            SplitInstallSessionState splitInstallSessionStateZzn = zzn(new zzr() { // from class: com.google.android.play.core.splitinstall.testing.zzk
                @Override // com.google.android.play.core.splitinstall.testing.zzr
                public final SplitInstallSessionState zza(final SplitInstallSessionState splitInstallSessionState) {
                    final SplitInstallRequest splitInstallRequest3 = splitInstallRequest2;
                    return (SplitInstallSessionState) zzbx.zzc(new Callable() { // from class: com.google.android.play.core.splitinstall.testing.zzn
                        @Override // java.util.concurrent.Callable
                        public final Object call() throws SplitInstallException {
                            SplitInstallSessionState splitInstallSessionState2 = splitInstallSessionState;
                            SplitInstallRequest splitInstallRequest4 = splitInstallRequest3;
                            int i2 = FakeSplitInstallManager.zza;
                            if (splitInstallSessionState2 == null || splitInstallSessionState2.hasTerminalStatus()) {
                                return SplitInstallSessionState.create(splitInstallSessionState2 != null ? 1 + splitInstallSessionState2.sessionId() : 1, 1, 0, 0L, 0L, splitInstallRequest4.getModuleNames(), new ArrayList());
                            }
                            throw new SplitInstallException(-1);
                        }
                    });
                }
            });
            if (splitInstallSessionStateZzn == null) {
                return zzk(-100);
            }
            int iSessionId = splitInstallSessionStateZzn.sessionId();
            final ArrayList arrayList = new ArrayList();
            Iterator<Locale> it = splitInstallRequest2.getLanguages().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getLanguage());
            }
            HashSet hashSet = new HashSet();
            final ArrayList arrayList2 = new ArrayList();
            File[] fileArrListFiles = this.zzl.listFiles(new FileFilter() { // from class: com.google.android.play.core.splitinstall.testing.zzl
                @Override // java.io.FileFilter
                public final boolean accept(File file) {
                    int i2 = FakeSplitInstallManager.zza;
                    return file.getName().endsWith(".apk");
                }
            });
            if (fileArrListFiles == null) {
                return zzk(-5);
            }
            int i2 = 0;
            long length = 0;
            while (i2 < fileArrListFiles.length) {
                File file = fileArrListFiles[i2];
                String strZza = zzbw.zza(file);
                String strZzo = zzo(strZza);
                hashSet.add(strZza);
                if (splitInstallRequest2.getModuleNames().contains(strZzo)) {
                    String strZzo2 = zzo(strZza);
                    HashSet<String> hashSet2 = new HashSet(this.zzg.zza());
                    Map mapZza = zzl().zza(Arrays.asList(strZzo2));
                    HashSet hashSet3 = new HashSet();
                    Iterator it2 = mapZza.values().iterator();
                    while (it2.hasNext()) {
                        hashSet3.addAll((Set) it2.next());
                    }
                    HashSet hashSet4 = new HashSet();
                    for (String str : hashSet2) {
                        int i3 = iSessionId;
                        if (str.contains("_")) {
                            str = str.split("_", -1)[0];
                        }
                        hashSet4.add(str);
                        fileArrListFiles = fileArrListFiles;
                        iSessionId = i3;
                    }
                    i = iSessionId;
                    fileArr = fileArrListFiles;
                    hashSet4.addAll(this.zzo);
                    hashSet4.addAll(arrayList);
                    HashSet hashSet5 = new HashSet();
                    for (Map.Entry entry : mapZza.entrySet()) {
                        if (hashSet4.contains(entry.getKey())) {
                            hashSet5.addAll((Collection) entry.getValue());
                        }
                    }
                    if (!hashSet3.contains(strZza) || hashSet5.contains(strZza)) {
                        length += file.length();
                        arrayList2.add(file);
                        break;
                    }
                    i2++;
                    splitInstallRequest2 = splitInstallRequest;
                    fileArrListFiles = fileArr;
                    iSessionId = i;
                } else {
                    i = iSessionId;
                    fileArr = fileArrListFiles;
                }
                List<Locale> languages = splitInstallRequest.getLanguages();
                ArrayList arrayList3 = new ArrayList(this.zzn);
                arrayList3.addAll(Arrays.asList("", "base"));
                Map mapZza2 = zzl().zza(arrayList3);
                for (Locale locale : languages) {
                    if (mapZza2.containsKey(locale.getLanguage()) && ((Set) mapZza2.get(locale.getLanguage())).contains(strZza)) {
                        length += file.length();
                        arrayList2.add(file);
                        break;
                        break;
                    }
                }
                i2++;
                splitInstallRequest2 = splitInstallRequest;
                fileArrListFiles = fileArr;
                iSessionId = i;
            }
            int i4 = iSessionId;
            hashSet.toString();
            String.valueOf(splitInstallRequest.getModuleNames());
            if (splitInstallRequest.getModuleNames().size() != 1 || (numZza = (Integer) ((zzv) this.zzf.zza()).zzb().get(splitInstallRequest.getModuleNames().get(0))) == null) {
                numZza = ((zzv) this.zzf.zza()).zza();
            }
            if (numZza != null) {
                return zzk(numZza.intValue());
            }
            if (!hashSet.containsAll(new HashSet(splitInstallRequest.getModuleNames()))) {
                return zzk(-2);
            }
            Long lValueOf = Long.valueOf(length);
            List moduleNames = splitInstallRequest.getModuleNames();
            Integer numValueOf = Integer.valueOf(i4);
            zzs(1, 0, 0L, lValueOf, moduleNames, numValueOf, arrayList);
            this.zzj.execute(new Runnable() { // from class: com.google.android.play.core.splitinstall.testing.zzm
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzi(arrayList2, arrayList);
                }
            });
            return bga.m29102x(numValueOf);
        } catch (zzbx e) {
            return zzk(((SplitInstallException) e.zzb(SplitInstallException.class)).getErrorCode());
        }
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void unregisterListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.zzi.zzb(splitInstallStateUpdatedListener);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void zza(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.zzh.zza(splitInstallStateUpdatedListener);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void zzb(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.zzh.zzb(splitInstallStateUpdatedListener);
    }

    public final File zzc() {
        return this.zzl;
    }

    public final /* synthetic */ void zzf(final long j, final List list, final List list2, final List list3) {
        long jMin = 0;
        for (int i = 0; i < 3; i++) {
            jMin = Math.min(j, (j / 3) + jMin);
            zzs(2, 0, Long.valueOf(jMin), Long.valueOf(j), null, null, null);
            SystemClock.sleep(zzb);
            SplitInstallSessionState splitInstallSessionStateZzm = zzm();
            if (splitInstallSessionStateZzm.status() == 9 || splitInstallSessionStateZzm.status() == 7 || splitInstallSessionStateZzm.status() == 6) {
                return;
            }
        }
        this.zzj.execute(new Runnable() { // from class: com.google.android.play.core.splitinstall.testing.zzd
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzh(list, list2, list3, j);
            }
        });
    }

    public final /* synthetic */ void zzg(SplitInstallSessionState splitInstallSessionState) {
        this.zzh.zzc(splitInstallSessionState);
        this.zzi.zzc(splitInstallSessionState);
    }

    public final /* synthetic */ void zzh(List list, List list2, List list3, long j) {
        if (this.zzp.get()) {
            zzs(6, -6, null, null, null, null, null);
        } else if (this.zzk.zza() != null) {
            zzp(list, list2, list3, j, false);
        } else {
            zzr(list2, list3, j);
        }
    }

    public final /* synthetic */ void zzi(List list, final List list2) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            String strZza = zzbw.zza(file);
            Uri uriFromFile = Uri.fromFile(file);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriFromFile, this.zzd.getContentResolver().getType(uriFromFile));
            intent.addFlags(1);
            intent.putExtra("module_name", zzo(strZza));
            intent.putExtra("split_id", strZza);
            arrayList.add(intent);
            arrayList2.add(zzo(zzbw.zza(file)));
        }
        SplitInstallSessionState splitInstallSessionStateZzm = zzm();
        if (splitInstallSessionStateZzm == null) {
            return;
        }
        final long j = splitInstallSessionStateZzm.totalBytesToDownload();
        this.zzj.execute(new Runnable() { // from class: com.google.android.play.core.splitinstall.testing.zzi
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzf(j, arrayList, arrayList2, list2);
            }
        });
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, hg0 hg0Var) {
        return false;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, w550 w550Var, int i) {
        return false;
    }

    public FakeSplitInstallManager(Context context, File file, com.google.android.play.core.splitinstall.zzs zzsVar, zzby zzbyVar) {
        ThreadPoolExecutor threadPoolExecutorM89424E = wze1.m89424E();
        zzbs zzbsVar = new zzbs(context);
        zzj zzjVar = new Object() { // from class: com.google.android.play.core.splitinstall.testing.zzj
        };
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzm = new AtomicReference();
        this.zzn = Collections.synchronizedSet(new HashSet());
        this.zzo = Collections.synchronizedSet(new HashSet());
        this.zzp = new AtomicBoolean(false);
        this.zzd = context;
        this.zzl = file;
        this.zze = zzsVar;
        this.zzf = zzbyVar;
        this.zzj = threadPoolExecutorM89424E;
        this.zzg = zzbsVar;
        this.zzq = zzjVar;
        this.zzi = new com.google.android.play.core.splitinstall.internal.zzt();
        this.zzh = new com.google.android.play.core.splitinstall.internal.zzt();
        this.zzk = com.google.android.play.core.splitinstall.zzo.INSTANCE;
    }
}
