package com.google.android.play.core.splitinstall;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class SplitInstallRequest {
    private final List zza;
    private final List zzb;

    public /* synthetic */ SplitInstallRequest(Builder builder, zzaj zzajVar) {
        this.zza = new ArrayList(builder.zza);
        this.zzb = new ArrayList(builder.zzb);
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public List<Locale> getLanguages() {
        return this.zzb;
    }

    public List<String> getModuleNames() {
        return this.zza;
    }

    public String toString() {
        return String.format("SplitInstallRequest{modulesNames=%s,languages=%s}", this.zza, this.zzb);
    }

    public static class Builder {
        private final List zza = new ArrayList();
        private final List zzb = new ArrayList();

        private Builder() {
        }

        public Builder addLanguage(Locale locale) {
            this.zzb.add(locale);
            return this;
        }

        public Builder addModule(String str) {
            this.zza.add(str);
            return this;
        }

        public SplitInstallRequest build() {
            return new SplitInstallRequest(this, null);
        }

        public /* synthetic */ Builder(zzai zzaiVar) {
        }
    }
}
