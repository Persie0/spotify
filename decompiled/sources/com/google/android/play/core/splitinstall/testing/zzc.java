package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzc extends zzv {
    private final Integer zzb;
    private final Map zzc;

    public /* synthetic */ zzc(Integer num, Map map, zzb zzbVar) {
        this.zzb = num;
        this.zzc = map;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzv) {
            zzv zzvVar = (zzv) obj;
            Integer num = this.zzb;
            if (num != null ? num.equals(zzvVar.zza()) : zzvVar.zza() == null) {
                if (this.zzc.equals(zzvVar.zzb())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.zzb;
        return (((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.zzc.hashCode();
    }

    public final String toString() {
        return "LocalTestingConfig{defaultSplitInstallErrorCode=" + this.zzb + ", splitInstallErrorCodeByModule=" + String.valueOf(this.zzc) + "}";
    }

    @Override // com.google.android.play.core.splitinstall.testing.zzv
    @SplitInstallErrorCode
    public final Integer zza() {
        return this.zzb;
    }

    @Override // com.google.android.play.core.splitinstall.testing.zzv
    public final Map zzb() {
        return this.zzc;
    }
}
