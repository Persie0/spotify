package com.spotify.player.model.command.options;

import p204p.C2244p5;
import p204p.edb;
import p204p.hzq0;
import p204p.klh;
import p204p.xul0;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_CommandOptions extends CommandOptions {
    private final xul0 onlyForLocalDevice;
    private final xul0 onlyForPlaybackId;
    private final xul0 overrideRestrictions;
    private final xul0 systemInitiated;

    public /* synthetic */ AutoValue_CommandOptions(xul0 xul0Var, xul0 xul0Var2, xul0 xul0Var3, xul0 xul0Var4, int i) {
        this(xul0Var, xul0Var2, xul0Var3, xul0Var4);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CommandOptions) {
            CommandOptions commandOptions = (CommandOptions) obj;
            if (this.overrideRestrictions.equals(commandOptions.overrideRestrictions()) && this.onlyForLocalDevice.equals(commandOptions.onlyForLocalDevice()) && this.systemInitiated.equals(commandOptions.systemInitiated()) && this.onlyForPlaybackId.equals(commandOptions.onlyForPlaybackId())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.overrideRestrictions.hashCode() ^ 1000003) * 1000003) ^ this.onlyForLocalDevice.hashCode()) * 1000003) ^ this.systemInitiated.hashCode()) * 1000003) ^ this.onlyForPlaybackId.hashCode();
    }

    @Override // com.spotify.player.model.command.options.CommandOptions
    public xul0 onlyForLocalDevice() {
        return this.onlyForLocalDevice;
    }

    @Override // com.spotify.player.model.command.options.CommandOptions
    public xul0 onlyForPlaybackId() {
        return this.onlyForPlaybackId;
    }

    @Override // com.spotify.player.model.command.options.CommandOptions
    public xul0 overrideRestrictions() {
        return this.overrideRestrictions;
    }

    @Override // com.spotify.player.model.command.options.CommandOptions
    public xul0 systemInitiated() {
        return this.systemInitiated;
    }

    @Override // com.spotify.player.model.command.options.CommandOptions
    public CommandOptions.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.overrideRestrictions);
        String strValueOf2 = String.valueOf(this.onlyForLocalDevice);
        return klh.m56837i(edb.m38573v("CommandOptions{overrideRestrictions=", strValueOf, ", onlyForLocalDevice=", strValueOf2, ", systemInitiated="), String.valueOf(this.systemInitiated), ", onlyForPlaybackId=", String.valueOf(this.onlyForPlaybackId), "}");
    }

    private AutoValue_CommandOptions(xul0 xul0Var, xul0 xul0Var2, xul0 xul0Var3, xul0 xul0Var4) {
        this.overrideRestrictions = xul0Var;
        this.onlyForLocalDevice = xul0Var2;
        this.systemInitiated = xul0Var3;
        this.onlyForPlaybackId = xul0Var4;
    }

    public static final class Builder extends CommandOptions.Builder {
        private xul0 onlyForLocalDevice;
        private xul0 onlyForPlaybackId;
        private xul0 overrideRestrictions;
        private xul0 systemInitiated;

        public Builder() {
            C2244p5 c2244p5 = C2244p5.f174033a;
            this.overrideRestrictions = c2244p5;
            this.onlyForLocalDevice = c2244p5;
            this.systemInitiated = c2244p5;
            this.onlyForPlaybackId = c2244p5;
        }

        @Override // com.spotify.player.model.command.options.CommandOptions.Builder
        public CommandOptions build() {
            return new AutoValue_CommandOptions(this.overrideRestrictions, this.onlyForLocalDevice, this.systemInitiated, this.onlyForPlaybackId, 0);
        }

        @Override // com.spotify.player.model.command.options.CommandOptions.Builder
        public CommandOptions.Builder onlyForLocalDevice(boolean z) {
            this.onlyForLocalDevice = new hzq0(Boolean.valueOf(z));
            return this;
        }

        @Override // com.spotify.player.model.command.options.CommandOptions.Builder
        public CommandOptions.Builder onlyForPlaybackId(String str) {
            this.onlyForPlaybackId = xul0.m92201d(str);
            return this;
        }

        @Override // com.spotify.player.model.command.options.CommandOptions.Builder
        public CommandOptions.Builder overrideRestrictions(boolean z) {
            this.overrideRestrictions = new hzq0(Boolean.valueOf(z));
            return this;
        }

        @Override // com.spotify.player.model.command.options.CommandOptions.Builder
        public CommandOptions.Builder systemInitiated(boolean z) {
            this.systemInitiated = new hzq0(Boolean.valueOf(z));
            return this;
        }

        public Builder(CommandOptions commandOptions) {
            C2244p5 c2244p5 = C2244p5.f174033a;
            this.overrideRestrictions = c2244p5;
            this.onlyForLocalDevice = c2244p5;
            this.systemInitiated = c2244p5;
            this.onlyForPlaybackId = c2244p5;
            this.overrideRestrictions = commandOptions.overrideRestrictions();
            this.onlyForLocalDevice = commandOptions.onlyForLocalDevice();
            this.systemInitiated = commandOptions.systemInitiated();
            this.onlyForPlaybackId = commandOptions.onlyForPlaybackId();
        }
    }
}
