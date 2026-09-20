package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzpn implements zzpm {
    private static final int zzc(StackTraceElement[] stackTraceElementArr, Class cls, int i) {
        String name = cls.getName();
        boolean z = false;
        for (int i2 = 3; i2 < stackTraceElementArr.length; i2++) {
            if (stackTraceElementArr[i2].getClassName().equals(name)) {
                z = true;
            } else if (z) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzpm
    public final StackTraceElement zza(Class cls, int i) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iZzc = zzc(stackTrace, cls, 3);
        if (iZzc != -1) {
            return stackTrace[iZzc];
        }
        return null;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzpm
    public final StackTraceElement[] zzb(Class cls, int i, int i2) {
        boolean z = true;
        if (i != -1 && i <= 0) {
            z = false;
        }
        zzpj.zzc(z, "maxDepth must be > 0 or -1");
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iZzc = zzc(stackTrace, cls, 3);
        if (iZzc == -1) {
            return new StackTraceElement[0];
        }
        int length = stackTrace.length - iZzc;
        if (i <= 0 || i >= length) {
            i = length;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i];
        System.arraycopy(stackTrace, iZzc, stackTraceElementArr, 0, i);
        return stackTraceElementArr;
    }
}
