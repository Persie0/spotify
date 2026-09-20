package com.spotify.player.model.command.options;

import java.util.Map;
import p204p.C2244p5;
import p204p.dq60;
import p204p.edb;
import p204p.klh;
import p204p.xf40;
import p204p.xul0;
import p204p.y85;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_PlayerOptionOverrides extends PlayerOptionOverrides {
    private final xf40 modes;
    private final xul0 playbackSpeed;
    private final xul0 repeatingContext;
    private final xul0 repeatingTrack;
    private final xul0 shufflingContext;

    public /* synthetic */ AutoValue_PlayerOptionOverrides(xul0 xul0Var, xul0 xul0Var2, xul0 xul0Var3, xul0 xul0Var4, xf40 xf40Var, int i) {
        this(xul0Var, xul0Var2, xul0Var3, xul0Var4, xf40Var);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayerOptionOverrides) {
            PlayerOptionOverrides playerOptionOverrides = (PlayerOptionOverrides) obj;
            if (this.shufflingContext.equals(playerOptionOverrides.shufflingContext()) && this.repeatingContext.equals(playerOptionOverrides.repeatingContext()) && this.repeatingTrack.equals(playerOptionOverrides.repeatingTrack()) && this.playbackSpeed.equals(playerOptionOverrides.playbackSpeed())) {
                xf40 xf40Var = this.modes;
                xf40 xf40VarModes = playerOptionOverrides.modes();
                xf40Var.getClass();
                if (y85.m93065j(xf40VarModes, xf40Var)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((this.shufflingContext.hashCode() ^ 1000003) * 1000003) ^ this.repeatingContext.hashCode()) * 1000003) ^ this.repeatingTrack.hashCode()) * 1000003) ^ this.playbackSpeed.hashCode()) * 1000003) ^ this.modes.hashCode();
    }

    @Override // com.spotify.player.model.command.options.PlayerOptionOverrides
    public xf40 modes() {
        return this.modes;
    }

    @Override // com.spotify.player.model.command.options.PlayerOptionOverrides
    public xul0 playbackSpeed() {
        return this.playbackSpeed;
    }

    @Override // com.spotify.player.model.command.options.PlayerOptionOverrides
    public xul0 repeatingContext() {
        return this.repeatingContext;
    }

    @Override // com.spotify.player.model.command.options.PlayerOptionOverrides
    public xul0 repeatingTrack() {
        return this.repeatingTrack;
    }

    @Override // com.spotify.player.model.command.options.PlayerOptionOverrides
    public xul0 shufflingContext() {
        return this.shufflingContext;
    }

    @Override // com.spotify.player.model.command.options.PlayerOptionOverrides
    public PlayerOptionOverrides.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.shufflingContext);
        String strValueOf2 = String.valueOf(this.repeatingContext);
        String strValueOf3 = String.valueOf(this.repeatingTrack);
        String strValueOf4 = String.valueOf(this.playbackSpeed);
        String strValueOf5 = String.valueOf(this.modes);
        StringBuilder sbM38573v = edb.m38573v("PlayerOptionOverrides{shufflingContext=", strValueOf, ", repeatingContext=", strValueOf2, ", repeatingTrack=");
        klh.m56844p(sbM38573v, strValueOf3, ", playbackSpeed=", strValueOf4, ", modes=");
        return dq60.m36616p(strValueOf5, "}", sbM38573v);
    }

    private AutoValue_PlayerOptionOverrides(xul0 xul0Var, xul0 xul0Var2, xul0 xul0Var3, xul0 xul0Var4, xf40 xf40Var) {
        this.shufflingContext = xul0Var;
        this.repeatingContext = xul0Var2;
        this.repeatingTrack = xul0Var3;
        this.playbackSpeed = xul0Var4;
        this.modes = xf40Var;
    }

    public static final class Builder extends PlayerOptionOverrides.Builder {
        private xf40 modes;
        private xul0 playbackSpeed;
        private xul0 repeatingContext;
        private xul0 repeatingTrack;
        private xul0 shufflingContext;

        public Builder() {
            C2244p5 c2244p5 = C2244p5.f174033a;
            this.shufflingContext = c2244p5;
            this.repeatingContext = c2244p5;
            this.repeatingTrack = c2244p5;
            this.playbackSpeed = c2244p5;
        }

        @Override // com.spotify.player.model.command.options.PlayerOptionOverrides.Builder
        public PlayerOptionOverrides build() {
            if (this.modes != null) {
                return new AutoValue_PlayerOptionOverrides(this.shufflingContext, this.repeatingContext, this.repeatingTrack, this.playbackSpeed, this.modes, 0);
            }
            throw new IllegalStateException("Missing required properties: modes");
        }

        @Override // com.spotify.player.model.command.options.PlayerOptionOverrides.Builder
        public PlayerOptionOverrides.Builder modes(Map<String, String> map) {
            this.modes = xf40.m90451c(map);
            return this;
        }

        @Override // com.spotify.player.model.command.options.PlayerOptionOverrides.Builder
        public PlayerOptionOverrides.Builder playbackSpeed(Float f) {
            this.playbackSpeed = xul0.m92201d(f);
            return this;
        }

        @Override // com.spotify.player.model.command.options.PlayerOptionOverrides.Builder
        public PlayerOptionOverrides.Builder repeatingContext(Boolean bool) {
            this.repeatingContext = xul0.m92201d(bool);
            return this;
        }

        @Override // com.spotify.player.model.command.options.PlayerOptionOverrides.Builder
        public PlayerOptionOverrides.Builder repeatingTrack(Boolean bool) {
            this.repeatingTrack = xul0.m92201d(bool);
            return this;
        }

        @Override // com.spotify.player.model.command.options.PlayerOptionOverrides.Builder
        public PlayerOptionOverrides.Builder shufflingContext(Boolean bool) {
            this.shufflingContext = xul0.m92201d(bool);
            return this;
        }

        public Builder(PlayerOptionOverrides playerOptionOverrides) {
            C2244p5 c2244p5 = C2244p5.f174033a;
            this.shufflingContext = c2244p5;
            this.repeatingContext = c2244p5;
            this.repeatingTrack = c2244p5;
            this.playbackSpeed = c2244p5;
            this.shufflingContext = playerOptionOverrides.shufflingContext();
            this.repeatingContext = playerOptionOverrides.repeatingContext();
            this.repeatingTrack = playerOptionOverrides.repeatingTrack();
            this.playbackSpeed = playerOptionOverrides.playbackSpeed();
            this.modes = playerOptionOverrides.modes();
        }
    }
}
