package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import p204p.C2244p5;
import p204p.dq60;
import p204p.xul0;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_SkipToPrevTrackOptions extends SkipToPrevTrackOptions {
    private final xul0 allowSeeking;
    private final CommandOptions commandOptions;

    public /* synthetic */ AutoValue_SkipToPrevTrackOptions(xul0 xul0Var, CommandOptions commandOptions, int i) {
        this(xul0Var, commandOptions);
    }

    @Override // com.spotify.player.model.command.options.SkipToPrevTrackOptions
    public xul0 allowSeeking() {
        return this.allowSeeking;
    }

    @Override // com.spotify.player.model.command.options.SkipToPrevTrackOptions
    @JsonUnwrapped
    public CommandOptions commandOptions() {
        return this.commandOptions;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SkipToPrevTrackOptions) {
            SkipToPrevTrackOptions skipToPrevTrackOptions = (SkipToPrevTrackOptions) obj;
            if (this.allowSeeking.equals(skipToPrevTrackOptions.allowSeeking()) && this.commandOptions.equals(skipToPrevTrackOptions.commandOptions())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.allowSeeking.hashCode() ^ 1000003) * 1000003) ^ this.commandOptions.hashCode();
    }

    @Override // com.spotify.player.model.command.options.SkipToPrevTrackOptions
    public SkipToPrevTrackOptions.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return dq60.m36615o("SkipToPrevTrackOptions{allowSeeking=", String.valueOf(this.allowSeeking), ", commandOptions=", String.valueOf(this.commandOptions), "}");
    }

    public static final class Builder extends SkipToPrevTrackOptions.Builder {
        private xul0 allowSeeking;
        private CommandOptions commandOptions;

        public Builder() {
            this.allowSeeking = C2244p5.f174033a;
        }

        @Override // com.spotify.player.model.command.options.SkipToPrevTrackOptions.Builder
        public SkipToPrevTrackOptions.Builder allowSeeking(Boolean bool) {
            this.allowSeeking = xul0.m92201d(bool);
            return this;
        }

        @Override // com.spotify.player.model.command.options.SkipToPrevTrackOptions.Builder
        public SkipToPrevTrackOptions build() {
            if (this.commandOptions != null) {
                return new AutoValue_SkipToPrevTrackOptions(this.allowSeeking, this.commandOptions, 0);
            }
            throw new IllegalStateException("Missing required properties: commandOptions");
        }

        @Override // com.spotify.player.model.command.options.SkipToPrevTrackOptions.Builder
        public SkipToPrevTrackOptions.Builder commandOptions(CommandOptions commandOptions) {
            if (commandOptions == null) {
                throw new NullPointerException("Null commandOptions");
            }
            this.commandOptions = commandOptions;
            return this;
        }

        public Builder(SkipToPrevTrackOptions skipToPrevTrackOptions) {
            this.allowSeeking = C2244p5.f174033a;
            this.allowSeeking = skipToPrevTrackOptions.allowSeeking();
            this.commandOptions = skipToPrevTrackOptions.commandOptions();
        }
    }

    private AutoValue_SkipToPrevTrackOptions(xul0 xul0Var, CommandOptions commandOptions) {
        this.allowSeeking = xul0Var;
        this.commandOptions = commandOptions;
    }
}
