package com.spotify.player.model;

import java.util.Set;
import p204p.edb;
import p204p.hg40;
import p204p.klh;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_PlayOrigin extends PlayOrigin {
    private final String deviceIdentifier;
    private final String externalReferrer;
    private final hg40 featureClasses;
    private final String featureIdentifier;
    private final String featureVersion;
    private final String referrerIdentifier;
    private final String restrictionIdentifier;
    private final String viewUri;

    public static final class Builder extends PlayOrigin.Builder {
        private String deviceIdentifier;
        private String externalReferrer;
        private hg40 featureClasses;
        private String featureIdentifier;
        private String featureVersion;
        private String referrerIdentifier;
        private String restrictionIdentifier;
        private String viewUri;

        public Builder() {
        }

        @Override // com.spotify.player.model.PlayOrigin.Builder
        public PlayOrigin build() {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            hg40 hg40Var;
            String str6;
            String str7 = this.featureIdentifier;
            if (str7 != null && (str = this.featureVersion) != null && (str2 = this.viewUri) != null && (str3 = this.externalReferrer) != null && (str4 = this.referrerIdentifier) != null && (str5 = this.deviceIdentifier) != null && (hg40Var = this.featureClasses) != null && (str6 = this.restrictionIdentifier) != null) {
                return new AutoValue_PlayOrigin(str7, str, str2, str3, str4, str5, hg40Var, str6, 0);
            }
            StringBuilder sb = new StringBuilder();
            if (this.featureIdentifier == null) {
                sb.append(" featureIdentifier");
            }
            if (this.featureVersion == null) {
                sb.append(" featureVersion");
            }
            if (this.viewUri == null) {
                sb.append(" viewUri");
            }
            if (this.externalReferrer == null) {
                sb.append(" externalReferrer");
            }
            if (this.referrerIdentifier == null) {
                sb.append(" referrerIdentifier");
            }
            if (this.deviceIdentifier == null) {
                sb.append(" deviceIdentifier");
            }
            if (this.featureClasses == null) {
                sb.append(" featureClasses");
            }
            if (this.restrictionIdentifier == null) {
                sb.append(" restrictionIdentifier");
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
        }

        @Override // com.spotify.player.model.PlayOrigin.Builder
        public PlayOrigin.Builder deviceIdentifier(String str) {
            if (str == null) {
                throw new NullPointerException("Null deviceIdentifier");
            }
            this.deviceIdentifier = str;
            return this;
        }

        @Override // com.spotify.player.model.PlayOrigin.Builder
        public PlayOrigin.Builder externalReferrer(String str) {
            if (str == null) {
                throw new NullPointerException("Null externalReferrer");
            }
            this.externalReferrer = str;
            return this;
        }

        @Override // com.spotify.player.model.PlayOrigin.Builder
        public PlayOrigin.Builder featureClasses(Set<String> set) {
            this.featureClasses = hg40.m47406p(set);
            return this;
        }

        @Override // com.spotify.player.model.PlayOrigin.Builder
        public PlayOrigin.Builder featureIdentifier(String str) {
            if (str == null) {
                throw new NullPointerException("Null featureIdentifier");
            }
            this.featureIdentifier = str;
            return this;
        }

        @Override // com.spotify.player.model.PlayOrigin.Builder
        public PlayOrigin.Builder featureVersion(String str) {
            if (str == null) {
                throw new NullPointerException("Null featureVersion");
            }
            this.featureVersion = str;
            return this;
        }

        @Override // com.spotify.player.model.PlayOrigin.Builder
        public PlayOrigin.Builder referrerIdentifier(String str) {
            if (str == null) {
                throw new NullPointerException("Null referrerIdentifier");
            }
            this.referrerIdentifier = str;
            return this;
        }

        @Override // com.spotify.player.model.PlayOrigin.Builder
        public PlayOrigin.Builder restrictionIdentifier(String str) {
            if (str == null) {
                throw new NullPointerException("Null restrictionIdentifier");
            }
            this.restrictionIdentifier = str;
            return this;
        }

        @Override // com.spotify.player.model.PlayOrigin.Builder
        public PlayOrigin.Builder viewUri(String str) {
            if (str == null) {
                throw new NullPointerException("Null viewUri");
            }
            this.viewUri = str;
            return this;
        }

        public Builder(PlayOrigin playOrigin) {
            this.featureIdentifier = playOrigin.featureIdentifier();
            this.featureVersion = playOrigin.featureVersion();
            this.viewUri = playOrigin.viewUri();
            this.externalReferrer = playOrigin.externalReferrer();
            this.referrerIdentifier = playOrigin.referrerIdentifier();
            this.deviceIdentifier = playOrigin.deviceIdentifier();
            this.featureClasses = playOrigin.featureClasses();
            this.restrictionIdentifier = playOrigin.restrictionIdentifier();
        }
    }

    public /* synthetic */ AutoValue_PlayOrigin(String str, String str2, String str3, String str4, String str5, String str6, hg40 hg40Var, String str7, int i) {
        this(str, str2, str3, str4, str5, str6, hg40Var, str7);
    }

    @Override // com.spotify.player.model.PlayOrigin
    public String deviceIdentifier() {
        return this.deviceIdentifier;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayOrigin) {
            PlayOrigin playOrigin = (PlayOrigin) obj;
            if (this.featureIdentifier.equals(playOrigin.featureIdentifier()) && this.featureVersion.equals(playOrigin.featureVersion()) && this.viewUri.equals(playOrigin.viewUri()) && this.externalReferrer.equals(playOrigin.externalReferrer()) && this.referrerIdentifier.equals(playOrigin.referrerIdentifier()) && this.deviceIdentifier.equals(playOrigin.deviceIdentifier()) && this.featureClasses.equals(playOrigin.featureClasses()) && this.restrictionIdentifier.equals(playOrigin.restrictionIdentifier())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.player.model.PlayOrigin
    public String externalReferrer() {
        return this.externalReferrer;
    }

    @Override // com.spotify.player.model.PlayOrigin
    public hg40 featureClasses() {
        return this.featureClasses;
    }

    @Override // com.spotify.player.model.PlayOrigin
    public String featureIdentifier() {
        return this.featureIdentifier;
    }

    @Override // com.spotify.player.model.PlayOrigin
    public String featureVersion() {
        return this.featureVersion;
    }

    public int hashCode() {
        return ((((((((((((((this.featureIdentifier.hashCode() ^ 1000003) * 1000003) ^ this.featureVersion.hashCode()) * 1000003) ^ this.viewUri.hashCode()) * 1000003) ^ this.externalReferrer.hashCode()) * 1000003) ^ this.referrerIdentifier.hashCode()) * 1000003) ^ this.deviceIdentifier.hashCode()) * 1000003) ^ this.featureClasses.hashCode()) * 1000003) ^ this.restrictionIdentifier.hashCode();
    }

    @Override // com.spotify.player.model.PlayOrigin
    public String referrerIdentifier() {
        return this.referrerIdentifier;
    }

    @Override // com.spotify.player.model.PlayOrigin
    public String restrictionIdentifier() {
        return this.restrictionIdentifier;
    }

    @Override // com.spotify.player.model.PlayOrigin
    public PlayOrigin.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        String str = this.featureIdentifier;
        String str2 = this.featureVersion;
        String str3 = this.viewUri;
        String str4 = this.externalReferrer;
        String str5 = this.referrerIdentifier;
        String str6 = this.deviceIdentifier;
        String strValueOf = String.valueOf(this.featureClasses);
        String str7 = this.restrictionIdentifier;
        StringBuilder sbM38573v = edb.m38573v("PlayOrigin{featureIdentifier=", str, ", featureVersion=", str2, ", viewUri=");
        klh.m56844p(sbM38573v, str3, ", externalReferrer=", str4, ", referrerIdentifier=");
        klh.m56844p(sbM38573v, str5, ", deviceIdentifier=", str6, ", featureClasses=");
        return klh.m56837i(sbM38573v, strValueOf, ", restrictionIdentifier=", str7, "}");
    }

    @Override // com.spotify.player.model.PlayOrigin
    public String viewUri() {
        return this.viewUri;
    }

    private AutoValue_PlayOrigin(String str, String str2, String str3, String str4, String str5, String str6, hg40 hg40Var, String str7) {
        this.featureIdentifier = str;
        this.featureVersion = str2;
        this.viewUri = str3;
        this.externalReferrer = str4;
        this.referrerIdentifier = str5;
        this.deviceIdentifier = str6;
        this.featureClasses = hg40Var;
        this.restrictionIdentifier = str7;
    }
}
