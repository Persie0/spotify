package com.spotify.player.model;

import p204p.s571;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_PlayerSession extends PlayerSession {
    private final String session;

    public static final class Builder extends PlayerSession.Builder {
        private String session;

        public Builder() {
        }

        @Override // com.spotify.player.model.PlayerSession.Builder
        public PlayerSession build() {
            String str = this.session;
            if (str != null) {
                return new AutoValue_PlayerSession(str, 0);
            }
            throw new IllegalStateException("Missing required properties: session");
        }

        @Override // com.spotify.player.model.PlayerSession.Builder
        public PlayerSession.Builder session(String str) {
            if (str == null) {
                throw new NullPointerException("Null session");
            }
            this.session = str;
            return this;
        }

        public Builder(PlayerSession playerSession) {
            this.session = playerSession.session();
        }
    }

    public /* synthetic */ AutoValue_PlayerSession(String str, int i) {
        this(str);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayerSession) {
            return this.session.equals(((PlayerSession) obj).session());
        }
        return false;
    }

    public int hashCode() {
        return this.session.hashCode() ^ 1000003;
    }

    @Override // com.spotify.player.model.PlayerSession
    public String session() {
        return this.session;
    }

    @Override // com.spotify.player.model.PlayerSession
    public PlayerSession.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return s571.m77251j("PlayerSession{session=", this.session, "}");
    }

    private AutoValue_PlayerSession(String str) {
        this.session = str;
    }
}
