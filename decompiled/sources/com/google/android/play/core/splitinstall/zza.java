package com.google.android.play.core.splitinstall;

import android.app.PendingIntent;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.android.play.core.splitinstall.model.SplitInstallSessionStatus;
import java.util.List;
import p204p.dq60;
import p204p.klh;

/* JADX INFO: loaded from: classes4.dex */
final class zza extends SplitInstallSessionState {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;
    private final long zze;
    private final List zzf;
    private final List zzg;
    private final PendingIntent zzh;
    private final List zzi;

    public zza(int i, int i2, int i3, long j, long j2, List list, List list2, PendingIntent pendingIntent, List list3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = j;
        this.zze = j2;
        this.zzf = list;
        this.zzg = list2;
        this.zzh = pendingIntent;
        this.zzi = list3;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    public final long bytesDownloaded() {
        return this.zzd;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        PendingIntent pendingIntent;
        List list3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof SplitInstallSessionState) {
            SplitInstallSessionState splitInstallSessionState = (SplitInstallSessionState) obj;
            if (this.zza == splitInstallSessionState.sessionId() && this.zzb == splitInstallSessionState.status() && this.zzc == splitInstallSessionState.errorCode() && this.zzd == splitInstallSessionState.bytesDownloaded() && this.zze == splitInstallSessionState.totalBytesToDownload() && ((list = this.zzf) != null ? list.equals(splitInstallSessionState.zzb()) : splitInstallSessionState.zzb() == null) && ((list2 = this.zzg) != null ? list2.equals(splitInstallSessionState.zza()) : splitInstallSessionState.zza() == null) && ((pendingIntent = this.zzh) != null ? pendingIntent.equals(splitInstallSessionState.resolutionIntent()) : splitInstallSessionState.resolutionIntent() == null) && ((list3 = this.zzi) != null ? list3.equals(splitInstallSessionState.zzc()) : splitInstallSessionState.zzc() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    @SplitInstallErrorCode
    public final int errorCode() {
        return this.zzc;
    }

    public final int hashCode() {
        int i = ((((this.zza ^ 1000003) * 1000003) ^ this.zzb) * 1000003) ^ this.zzc;
        long j = this.zzd;
        long j2 = j ^ (j >>> 32);
        long j3 = this.zze;
        long j4 = (j3 >>> 32) ^ j3;
        List list = this.zzf;
        int iHashCode = ((((((i * 1000003) ^ ((int) j2)) * 1000003) ^ ((int) j4)) * 1000003) ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.zzg;
        int iHashCode2 = (iHashCode ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        PendingIntent pendingIntent = this.zzh;
        int iHashCode3 = (iHashCode2 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        List list3 = this.zzi;
        return iHashCode3 ^ (list3 != null ? list3.hashCode() : 0);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    @Deprecated
    public final PendingIntent resolutionIntent() {
        return this.zzh;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    public final int sessionId() {
        return this.zza;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    @SplitInstallSessionStatus
    public final int status() {
        return this.zzb;
    }

    public final String toString() {
        int i = this.zza;
        int i2 = this.zzb;
        int i3 = this.zzc;
        long j = this.zzd;
        long j2 = this.zze;
        String strValueOf = String.valueOf(this.zzf);
        String strValueOf2 = String.valueOf(this.zzg);
        String strValueOf3 = String.valueOf(this.zzh);
        String strValueOf4 = String.valueOf(this.zzi);
        StringBuilder sbM36619s = dq60.m36619s(i, i2, "SplitInstallSessionState{sessionId=", ", status=", ", errorCode=");
        sbM36619s.append(i3);
        sbM36619s.append(", bytesDownloaded=");
        sbM36619s.append(j);
        sbM36619s.append(", totalBytesToDownload=");
        sbM36619s.append(j2);
        sbM36619s.append(", moduleNamesNullable=");
        klh.m56844p(sbM36619s, strValueOf, ", languagesNullable=", strValueOf2, ", resolutionIntent=");
        return klh.m56837i(sbM36619s, strValueOf3, ", splitFileIntents=", strValueOf4, "}");
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    public final long totalBytesToDownload() {
        return this.zze;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    public final List zza() {
        return this.zzg;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    public final List zzb() {
        return this.zzf;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    public final List zzc() {
        return this.zzi;
    }
}
