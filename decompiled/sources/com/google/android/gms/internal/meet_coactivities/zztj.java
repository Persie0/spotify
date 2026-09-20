package com.google.android.gms.internal.meet_coactivities;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class zztj extends IOException {
    private boolean zza;

    public zztj(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public static zzti zza() {
        return new zzti("Protocol message tag had invalid wire type.");
    }

    public static zztj zzb() {
        return new zztj("Protocol message end-group tag did not match expected tag.");
    }

    public static zztj zzc() {
        return new zztj("Protocol message contained an invalid tag (zero).");
    }

    public static zztj zzd() {
        return new zztj("Protocol message had invalid UTF-8.");
    }

    public static zztj zze() {
        return new zztj("CodedInputStream encountered a malformed varint.");
    }

    public static zztj zzf() {
        return new zztj("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zztj zzg() {
        return new zztj("Failed to parse the message.");
    }

    public static zztj zzh() {
        return new zztj("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static zztj zzi() {
        return new zztj("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final void zzj() {
        this.zza = true;
    }

    public final boolean zzk() {
        return this.zza;
    }

    public zztj(String str) {
        super(str);
    }
}
