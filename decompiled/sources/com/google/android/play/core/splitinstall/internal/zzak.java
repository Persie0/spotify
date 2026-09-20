package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import com.google.android.play.core.splitcompat.SplitCompat;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p204p.mwf1;
import p204p.q0h1;

/* JADX INFO: loaded from: classes.dex */
public final class zzak implements com.google.android.play.core.splitinstall.zzh {
    private final Context zza;
    private final mwf1 zzb;
    private final zzam zzc;
    private final Executor zzd;
    private final q0h1 zze;

    public zzak(Context context, Executor executor, zzam zzamVar, mwf1 mwf1Var, q0h1 q0h1Var) {
        this.zza = context;
        this.zzb = mwf1Var;
        this.zzc = zzamVar;
        this.zzd = executor;
        this.zze = q0h1Var;
    }

    public static /* bridge */ /* synthetic */ void zzb(zzak zzakVar, List list, com.google.android.play.core.splitinstall.zzf zzfVar) {
        Integer numZze = zzakVar.zze(list);
        if (numZze == null) {
            return;
        }
        if (numZze.intValue() == 0) {
            zzfVar.zzc();
        } else {
            zzfVar.zzb(numZze.intValue());
        }
    }

    public static /* bridge */ /* synthetic */ void zzc(zzak zzakVar, com.google.android.play.core.splitinstall.zzf zzfVar) {
        try {
            if (SplitCompat.zzd(zzbr.zza(zzakVar.zza))) {
                zzfVar.zza();
            } else {
                zzfVar.zzb(-12);
            }
        } catch (Exception unused) {
            zzfVar.zzb(-12);
        }
    }

    @SplitInstallErrorCode
    private final Integer zze(List list) {
        FileLock fileLockTryLock;
        int i;
        try {
            mwf1 mwf1Var = this.zzb;
            mwf1Var.getClass();
            FileChannel channel = new RandomAccessFile(new File(mwf1Var.m63018g(), "lock.tmp"), "rw").getChannel();
            Integer numValueOf = null;
            try {
                try {
                    fileLockTryLock = channel.tryLock();
                } catch (OverlappingFileLockException unused) {
                    fileLockTryLock = null;
                }
                if (fileLockTryLock != null) {
                    try {
                        Iterator it = list.iterator();
                        while (true) {
                            i = 0;
                            if (!it.hasNext()) {
                                break;
                            }
                            Intent intent = (Intent) it.next();
                            String stringExtra = intent.getStringExtra("split_id");
                            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.zza.getContentResolver().openAssetFileDescriptor(intent.getData(), "r");
                            try {
                                mwf1 mwf1Var2 = this.zzb;
                                mwf1Var2.getClass();
                                File file = new File(mwf1Var2.m63018g(), "unverified-splits");
                                mwf1.m63014e(file);
                                File fileM63013d = mwf1.m63013d(file, String.valueOf(stringExtra).concat(".apk"));
                                if ((fileM63013d.exists() && fileM63013d.length() != assetFileDescriptorOpenAssetFileDescriptor.getLength()) || !fileM63013d.exists()) {
                                    mwf1 mwf1Var3 = this.zzb;
                                    mwf1Var3.getClass();
                                    File file2 = new File(mwf1Var3.m63018g(), "verified-splits");
                                    mwf1.m63014e(file2);
                                    if (!mwf1.m63013d(file2, String.valueOf(stringExtra).concat(".apk")).exists()) {
                                        BufferedInputStream bufferedInputStream = new BufferedInputStream(assetFileDescriptorOpenAssetFileDescriptor.createInputStream());
                                        try {
                                            FileOutputStream fileOutputStream = new FileOutputStream(fileM63013d);
                                            try {
                                                byte[] bArr = new byte[4096];
                                                while (true) {
                                                    int i2 = bufferedInputStream.read(bArr);
                                                    if (i2 <= 0) {
                                                        break;
                                                    }
                                                    fileOutputStream.write(bArr, 0, i2);
                                                    try {
                                                        bufferedInputStream.close();
                                                    } catch (Throwable th) {
                                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th);
                                                    }
                                                    throw th;
                                                }
                                                fileOutputStream.close();
                                                bufferedInputStream.close();
                                            } catch (Throwable th2) {
                                                try {
                                                    fileOutputStream.close();
                                                } catch (Throwable th3) {
                                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                                                }
                                                throw th2;
                                            }
                                        } catch (Throwable th4) {
                                            bufferedInputStream.close();
                                            throw th4;
                                        }
                                    }
                                }
                                if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                                    assetFileDescriptorOpenAssetFileDescriptor.close();
                                }
                            } catch (Throwable th5) {
                                if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                                    try {
                                        assetFileDescriptorOpenAssetFileDescriptor.close();
                                    } catch (Throwable th6) {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th5, th6);
                                    }
                                }
                                throw th5;
                            }
                        }
                        mwf1 mwf1Var4 = this.zzb;
                        mwf1Var4.getClass();
                        File file3 = new File(mwf1Var4.m63018g(), "unverified-splits");
                        mwf1.m63014e(file3);
                        File[] fileArrListFiles = file3.listFiles();
                        try {
                            if (this.zzc.zzc(fileArrListFiles) && this.zzc.zza(fileArrListFiles)) {
                                mwf1 mwf1Var5 = this.zzb;
                                mwf1Var5.getClass();
                                File file4 = new File(mwf1Var5.m63018g(), "unverified-splits");
                                mwf1.m63014e(file4);
                                File[] fileArrListFiles2 = file4.listFiles();
                                Arrays.sort(fileArrListFiles2);
                                int length = fileArrListFiles2.length;
                                while (true) {
                                    length--;
                                    if (length < 0) {
                                        break;
                                    }
                                    File file5 = fileArrListFiles2[length];
                                    file5.setWritable(false, true);
                                    file5.setWritable(false, false);
                                    File file6 = fileArrListFiles2[length];
                                    mwf1 mwf1Var6 = this.zzb;
                                    mwf1Var6.getClass();
                                    File file7 = new File(mwf1Var6.m63018g(), "verified-splits");
                                    mwf1.m63014e(file7);
                                    file6.renameTo(mwf1.m63013d(file7, file6.getName()));
                                }
                            } else {
                                i = -11;
                            }
                        } catch (Exception unused2) {
                        }
                    } catch (IOException | Exception unused3) {
                        i = -13;
                    }
                    numValueOf = Integer.valueOf(i);
                    fileLockTryLock.release();
                }
                if (channel != null) {
                    channel.close();
                }
                return numValueOf;
            } catch (Throwable th7) {
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (Throwable th8) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th7, th8);
                    }
                }
                throw th7;
            }
        } catch (Exception unused4) {
            return -13;
        }
    }

    @Override // com.google.android.play.core.splitinstall.zzh
    public final void zzd(List list, com.google.android.play.core.splitinstall.zzf zzfVar) {
        if (!SplitCompat.zze()) {
            throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
        }
        this.zzd.execute(new zzaj(this, list, zzfVar));
    }
}
