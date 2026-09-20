package p204p;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class x2s0 {

    /* JADX INFO: renamed from: a */
    public static final syw0 f257555a = new syw0();

    /* JADX INFO: renamed from: b */
    public static final Object f257556b = new Object();

    /* JADX INFO: renamed from: c */
    public static hp3 f257557c = null;

    /* JADX INFO: renamed from: a */
    public static long m89769a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? z35.m95260a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX INFO: renamed from: b */
    public static hp3 m89770b() {
        hp3 hp3Var = new hp3();
        f257557c = hp3Var;
        f257555a.m63868l(hp3Var);
        return f257557c;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x002c  */
    /* JADX WARN: Code duplicated, block: B:21:0x002e  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce  */
    /* JADX INFO: renamed from: c */
    public static void m89771c(Context context, boolean z) {
        int i;
        boolean z2;
        int i2;
        File file;
        boolean z3;
        File file2;
        long length;
        boolean z4;
        File file3;
        w2s0 w2s0VarM87084a;
        w2s0 w2s0Var;
        int i3;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        if (z || f257557c == null) {
            synchronized (f257556b) {
                if (z) {
                    i = 0;
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    if (assetFileDescriptorOpenFd.getLength() > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    assetFileDescriptorOpenFd.close();
                    i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 28) {
                        file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                        long length2 = file.length();
                        if (file.exists()) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                        length = file2.length();
                        if (file2.exists()) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        long jM89769a = m89769a(context);
                        file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            w2s0VarM87084a = w2s0.m87084a(file3);
                        } else {
                            w2s0VarM87084a = null;
                        }
                        if (w2s0VarM87084a == null) {
                            if (!z2) {
                                i = 327680;
                            } else if (z3) {
                                i = 1;
                            } else if (z4) {
                                i = 2;
                            }
                        } else if (!z2) {
                            i = 327680;
                        } else if (z3) {
                            i = 1;
                        } else if (z4) {
                            i = 2;
                        }
                        if (z) {
                            i = 2;
                        }
                        if (w2s0VarM87084a != null) {
                            i = 3;
                        }
                        w2s0Var = new w2s0(1, i, jM89769a, length);
                        if (w2s0VarM87084a != null) {
                            w2s0Var.m87085b(file3);
                        } else {
                            w2s0Var.m87085b(file3);
                        }
                        m89770b();
                        return;
                    }
                    m89770b();
                    return;
                }
                if (f257557c != null) {
                    return;
                }
                i = 0;
                try {
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        if (assetFileDescriptorOpenFd.getLength() > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        assetFileDescriptorOpenFd.close();
                    } catch (Throwable th) {
                        if (assetFileDescriptorOpenFd == null) {
                            throw th;
                        }
                        try {
                            assetFileDescriptorOpenFd.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (IOException unused) {
                    z2 = false;
                }
                i2 = Build.VERSION.SDK_INT;
                if (i2 >= 28 && i2 != 30) {
                    file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length3 = file.length();
                    if (file.exists() || length3 <= 0) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file2.length();
                    if (file2.exists() || length <= 0) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    try {
                        long jM89769a2 = m89769a(context);
                        file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                w2s0VarM87084a = w2s0.m87084a(file3);
                            } catch (IOException unused2) {
                                m89770b();
                                return;
                            }
                        } else {
                            w2s0VarM87084a = null;
                        }
                        if (w2s0VarM87084a == null && w2s0VarM87084a.f247418c == jM89769a2 && (i3 = w2s0VarM87084a.f247417b) != 2) {
                            i = i3;
                        } else if (!z2) {
                            i = 327680;
                        } else if (z3) {
                            i = 1;
                        } else if (z4) {
                            i = 2;
                        }
                        if (z && z4 && i != 1) {
                            i = 2;
                        }
                        if (w2s0VarM87084a != null && w2s0VarM87084a.f247417b == 2 && i == 1 && length3 < w2s0VarM87084a.f247419d) {
                            i = 3;
                        }
                        w2s0Var = new w2s0(1, i, jM89769a2, length);
                        if (w2s0VarM87084a != null || !w2s0VarM87084a.equals(w2s0Var)) {
                            try {
                                w2s0Var.m87085b(file3);
                            } catch (IOException unused3) {
                            }
                        }
                        m89770b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused4) {
                        m89770b();
                        return;
                    }
                }
                m89770b();
                return;
                throw th;
            }
        }
    }
}
