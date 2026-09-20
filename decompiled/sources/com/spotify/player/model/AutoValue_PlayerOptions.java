package com.spotify.player.model;

import java.util.Map;
import p204p.C2244p5;
import p204p.dq60;
import p204p.hzq0;
import p204p.xf40;
import p204p.xul0;
import p204p.y85;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_PlayerOptions extends PlayerOptions {
    private final xf40 modes;
    private final xul0 playbackSpeed;
    private final boolean repeatingContext;
    private final boolean repeatingTrack;
    private final boolean shufflingContext;

    public /* synthetic */ AutoValue_PlayerOptions(boolean z, boolean z2, boolean z3, xul0 xul0Var, xf40 xf40Var, int i) {
        this(z, z2, z3, xul0Var, xf40Var);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayerOptions) {
            PlayerOptions playerOptions = (PlayerOptions) obj;
            if (this.shufflingContext == playerOptions.shufflingContext() && this.repeatingContext == playerOptions.repeatingContext() && this.repeatingTrack == playerOptions.repeatingTrack() && this.playbackSpeed.equals(playerOptions.playbackSpeed())) {
                xf40 xf40Var = this.modes;
                xf40 xf40VarModes = playerOptions.modes();
                xf40Var.getClass();
                if (y85.m93065j(xf40VarModes, xf40Var)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.shufflingContext ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.repeatingContext ? 1231 : 1237)) * 1000003) ^ (this.repeatingTrack ? 1231 : 1237)) * 1000003) ^ this.playbackSpeed.hashCode()) * 1000003) ^ this.modes.hashCode();
    }

    @Override // com.spotify.player.model.PlayerOptions
    public xf40 modes() {
        return this.modes;
    }

    @Override // com.spotify.player.model.PlayerOptions
    public xul0 playbackSpeed() {
        return this.playbackSpeed;
    }

    @Override // com.spotify.player.model.PlayerOptions
    public boolean repeatingContext() {
        return this.repeatingContext;
    }

    @Override // com.spotify.player.model.PlayerOptions
    public boolean repeatingTrack() {
        return this.repeatingTrack;
    }

    @Override // com.spotify.player.model.PlayerOptions
    public boolean shufflingContext() {
        return this.shufflingContext;
    }

    @Override // com.spotify.player.model.PlayerOptions
    public PlayerOptions.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        boolean z = this.shufflingContext;
        boolean z2 = this.repeatingContext;
        boolean z3 = this.repeatingTrack;
        String strValueOf = String.valueOf(this.playbackSpeed);
        String strValueOf2 = String.valueOf(this.modes);
        StringBuilder sb = new StringBuilder("PlayerOptions{shufflingContext=");
        sb.append(z);
        sb.append(", repeatingContext=");
        sb.append(z2);
        sb.append(", repeatingTrack=");
        sb.append(z3);
        sb.append(", playbackSpeed=");
        sb.append(strValueOf);
        sb.append(", modes=");
        return dq60.m36616p(strValueOf2, "}", sb);
    }

    public static final class Builder extends PlayerOptions.Builder {
        private xf40 modes;
        private xul0 playbackSpeed;
        private boolean repeatingContext;
        private boolean repeatingTrack;
        private byte set$0;
        private boolean shufflingContext;

        public Builder() {
            this.playbackSpeed = C2244p5.f174033a;
        }

        @Override // com.spotify.player.model.PlayerOptions.Builder
        public PlayerOptions build() {
            if (this.set$0 == 7 && this.modes != null) {
                return new AutoValue_PlayerOptions(this.shufflingContext, this.repeatingContext, this.repeatingTrack, this.playbackSpeed, this.modes, 0);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.set$0 & 1) == 0) {
                sb.append(" shufflingContext");
            }
            if ((this.set$0 & 2) == 0) {
                sb.append(" repeatingContext");
            }
            if ((this.set$0 & 4) == 0) {
                sb.append(" repeatingTrack");
            }
            if (this.modes == null) {
                sb.append(" modes");
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
        }

        @Override // com.spotify.player.model.PlayerOptions.Builder
        public PlayerOptions.Builder modes(Map<String, String> map) {
            this.modes = xf40.m90451c(map);
            return this;
        }

        @Override // com.spotify.player.model.PlayerOptions.Builder
        public PlayerOptions.Builder playbackSpeed(float f) {
            this.playbackSpeed = new hzq0(Float.valueOf(f));
            return this;
        }

        @Override // com.spotify.player.model.PlayerOptions.Builder
        public PlayerOptions.Builder repeatingContext(boolean z) {
            this.repeatingContext = z;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }

        @Override // com.spotify.player.model.PlayerOptions.Builder
        public PlayerOptions.Builder repeatingTrack(boolean z) {
            this.repeatingTrack = z;
            this.set$0 = (byte) (this.set$0 | 4);
            return this;
        }

        @Override // com.spotify.player.model.PlayerOptions.Builder
        public PlayerOptions.Builder shufflingContext(boolean z) {
            this.shufflingContext = z;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        public Builder(PlayerOptions playerOptions) {
            this.playbackSpeed = C2244p5.f174033a;
            this.shufflingContext = playerOptions.shufflingContext();
            this.repeatingContext = playerOptions.repeatingContext();
            this.repeatingTrack = playerOptions.repeatingTrack();
            this.playbackSpeed = playerOptions.playbackSpeed();
            this.modes = playerOptions.modes();
            this.set$0 = (byte) 7;
        }
    }

    private AutoValue_PlayerOptions(boolean z, boolean z2, boolean z3, xul0 xul0Var, xf40 xf40Var) {
        this.shufflingContext = z;
        this.repeatingContext = z2;
        this.repeatingTrack = z3;
        this.playbackSpeed = xul0Var;
        this.modes = xf40Var;
    }
}
