package com.spotify.player.model;

import p204p.dq60;
import p204p.edb;
import p204p.klh;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_PlayerError extends PlayerError {
    private final String contextUri;
    private final ErrorType error;
    private final String reasons;
    private final String trackUri;
    private final String viewUri;

    public static final class Builder extends PlayerError.Builder {
        private String contextUri;
        private ErrorType error;
        private String reasons;
        private String trackUri;
        private String viewUri;

        public Builder() {
        }

        @Override // com.spotify.player.model.PlayerError.Builder
        public PlayerError build() {
            String str;
            String str2;
            String str3;
            String str4;
            ErrorType errorType = this.error;
            if (errorType != null && (str = this.trackUri) != null && (str2 = this.contextUri) != null && (str3 = this.viewUri) != null && (str4 = this.reasons) != null) {
                return new AutoValue_PlayerError(errorType, str, str2, str3, str4, 0);
            }
            StringBuilder sb = new StringBuilder();
            if (this.error == null) {
                sb.append(" error");
            }
            if (this.trackUri == null) {
                sb.append(" trackUri");
            }
            if (this.contextUri == null) {
                sb.append(" contextUri");
            }
            if (this.viewUri == null) {
                sb.append(" viewUri");
            }
            if (this.reasons == null) {
                sb.append(" reasons");
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
        }

        @Override // com.spotify.player.model.PlayerError.Builder
        public PlayerError.Builder contextUri(String str) {
            if (str == null) {
                throw new NullPointerException("Null contextUri");
            }
            this.contextUri = str;
            return this;
        }

        @Override // com.spotify.player.model.PlayerError.Builder
        public PlayerError.Builder error(ErrorType errorType) {
            if (errorType == null) {
                throw new NullPointerException("Null error");
            }
            this.error = errorType;
            return this;
        }

        @Override // com.spotify.player.model.PlayerError.Builder
        public PlayerError.Builder reasons(String str) {
            if (str == null) {
                throw new NullPointerException("Null reasons");
            }
            this.reasons = str;
            return this;
        }

        @Override // com.spotify.player.model.PlayerError.Builder
        public PlayerError.Builder trackUri(String str) {
            if (str == null) {
                throw new NullPointerException("Null trackUri");
            }
            this.trackUri = str;
            return this;
        }

        @Override // com.spotify.player.model.PlayerError.Builder
        public PlayerError.Builder viewUri(String str) {
            if (str == null) {
                throw new NullPointerException("Null viewUri");
            }
            this.viewUri = str;
            return this;
        }

        public Builder(PlayerError playerError) {
            this.error = playerError.error();
            this.trackUri = playerError.trackUri();
            this.contextUri = playerError.contextUri();
            this.viewUri = playerError.viewUri();
            this.reasons = playerError.reasons();
        }
    }

    public /* synthetic */ AutoValue_PlayerError(ErrorType errorType, String str, String str2, String str3, String str4, int i) {
        this(errorType, str, str2, str3, str4);
    }

    @Override // com.spotify.player.model.PlayerError
    public String contextUri() {
        return this.contextUri;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayerError) {
            PlayerError playerError = (PlayerError) obj;
            if (this.error.equals(playerError.error()) && this.trackUri.equals(playerError.trackUri()) && this.contextUri.equals(playerError.contextUri()) && this.viewUri.equals(playerError.viewUri()) && this.reasons.equals(playerError.reasons())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.player.model.PlayerError
    public ErrorType error() {
        return this.error;
    }

    public int hashCode() {
        return ((((((((this.error.hashCode() ^ 1000003) * 1000003) ^ this.trackUri.hashCode()) * 1000003) ^ this.contextUri.hashCode()) * 1000003) ^ this.viewUri.hashCode()) * 1000003) ^ this.reasons.hashCode();
    }

    @Override // com.spotify.player.model.PlayerError
    public String reasons() {
        return this.reasons;
    }

    @Override // com.spotify.player.model.PlayerError
    public PlayerError.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.error);
        String str = this.trackUri;
        String str2 = this.contextUri;
        String str3 = this.viewUri;
        String str4 = this.reasons;
        StringBuilder sbM38573v = edb.m38573v("PlayerError{error=", strValueOf, ", trackUri=", str, ", contextUri=");
        klh.m56844p(sbM38573v, str2, ", viewUri=", str3, ", reasons=");
        return dq60.m36616p(str4, "}", sbM38573v);
    }

    @Override // com.spotify.player.model.PlayerError
    public String trackUri() {
        return this.trackUri;
    }

    @Override // com.spotify.player.model.PlayerError
    public String viewUri() {
        return this.viewUri;
    }

    private AutoValue_PlayerError(ErrorType errorType, String str, String str2, String str3, String str4) {
        this.error = errorType;
        this.trackUri = str;
        this.contextUri = str2;
        this.viewUri = str3;
        this.reasons = str4;
    }
}
