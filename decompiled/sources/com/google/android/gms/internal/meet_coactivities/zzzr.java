package com.google.android.gms.internal.meet_coactivities;

import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Level;
import p204p.c95;
import p204p.dq60;
import p204p.vie1;
import p204p.wuc;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzzr {
    private static final BitSet zza;
    private final String zzb;
    private final String zzc;
    private final byte[] zzd;

    static {
        BitSet bitSet = new BitSet(127);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        for (char c = '0'; c <= '9'; c = (char) (c + 1)) {
            bitSet.set(c);
        }
        for (char c2 = 'a'; c2 <= 'z'; c2 = (char) (c2 + 1)) {
            bitSet.set(c2);
        }
        zza = bitSet;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x005b A[SYNTHETIC] */
    public zzzr(String str, boolean z, Object obj, zzzq zzzqVar) {
        c95.m31848n(str, "name");
        this.zzb = str;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        c95.m31848n(lowerCase, "name");
        c95.m31844j(!lowerCase.isEmpty(), "token must have at least 1 tchar");
        if (lowerCase.equals("connection")) {
            zzzw.zzc.logp(Level.WARNING, "io.grpc.Metadata$Key", "validateName", "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
        }
        int i = 0;
        while (i < lowerCase.length()) {
            char cCharAt = lowerCase.charAt(i);
            if (z && cCharAt == ':') {
                if (i == 0) {
                    i = 0;
                } else {
                    cCharAt = ':';
                    if (zza.get(cCharAt)) {
                        throw new IllegalArgumentException(vie1.m85638t("Invalid character '%s' in key name '%s'", Character.valueOf(cCharAt), lowerCase));
                    }
                }
            } else if (zza.get(cCharAt)) {
                throw new IllegalArgumentException(vie1.m85638t("Invalid character '%s' in key name '%s'", Character.valueOf(cCharAt), lowerCase));
            }
            i++;
        }
        this.zzc = lowerCase;
        this.zzd = lowerCase.getBytes(wuc.f255135a);
    }

    public static zzzr zzc(String str, zzzp zzzpVar) {
        return new zzzo(str, false, zzzpVar, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zzc.equals(((zzzr) obj).zzc);
    }

    public final int hashCode() {
        return this.zzc.hashCode();
    }

    public final String toString() {
        return dq60.m36616p(this.zzc, "'}", new StringBuilder("Key{name='"));
    }

    public abstract Object zza(byte[] bArr);

    public abstract byte[] zzb(Object obj);

    public final byte[] zzd() {
        return this.zzd;
    }
}
