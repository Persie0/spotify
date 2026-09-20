package com.spotify.player.model.command;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import p204p.C2244p5;
import p204p.dq60;
import p204p.edb;
import p204p.xul0;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_SkipToNextTrackCommand extends SkipToNextTrackCommand {
    private final xul0 loggingParams;
    private final xul0 options;
    private final xul0 track;

    public /* synthetic */ AutoValue_SkipToNextTrackCommand(xul0 xul0Var, xul0 xul0Var2, xul0 xul0Var3, int i) {
        this(xul0Var, xul0Var2, xul0Var3);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SkipToNextTrackCommand) {
            SkipToNextTrackCommand skipToNextTrackCommand = (SkipToNextTrackCommand) obj;
            if (this.track.equals(skipToNextTrackCommand.track()) && this.options.equals(skipToNextTrackCommand.options()) && this.loggingParams.equals(skipToNextTrackCommand.loggingParams())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.track.hashCode() ^ 1000003) * 1000003) ^ this.options.hashCode()) * 1000003) ^ this.loggingParams.hashCode();
    }

    @Override // com.spotify.player.model.command.SkipToNextTrackCommand
    public xul0 loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.SkipToNextTrackCommand
    public xul0 options() {
        return this.options;
    }

    @Override // com.spotify.player.model.command.SkipToNextTrackCommand
    public SkipToNextTrackCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return dq60.m36616p(String.valueOf(this.loggingParams), "}", edb.m38573v("SkipToNextTrackCommand{track=", String.valueOf(this.track), ", options=", String.valueOf(this.options), ", loggingParams="));
    }

    @Override // com.spotify.player.model.command.SkipToNextTrackCommand
    public xul0 track() {
        return this.track;
    }

    private AutoValue_SkipToNextTrackCommand(xul0 xul0Var, xul0 xul0Var2, xul0 xul0Var3) {
        this.track = xul0Var;
        this.options = xul0Var2;
        this.loggingParams = xul0Var3;
    }

    public static final class Builder extends SkipToNextTrackCommand.Builder {
        private xul0 loggingParams;
        private xul0 options;
        private xul0 track;

        public Builder() {
            C2244p5 c2244p5 = C2244p5.f174033a;
            this.track = c2244p5;
            this.options = c2244p5;
            this.loggingParams = c2244p5;
        }

        @Override // com.spotify.player.model.command.SkipToNextTrackCommand.Builder
        public SkipToNextTrackCommand build() {
            return new AutoValue_SkipToNextTrackCommand(this.track, this.options, this.loggingParams, 0);
        }

        @Override // com.spotify.player.model.command.SkipToNextTrackCommand.Builder
        public SkipToNextTrackCommand.Builder loggingParams(LoggingParams loggingParams) {
            this.loggingParams = xul0.m92201d(loggingParams);
            return this;
        }

        @Override // com.spotify.player.model.command.SkipToNextTrackCommand.Builder
        public SkipToNextTrackCommand.Builder options(CommandOptions commandOptions) {
            this.options = xul0.m92201d(commandOptions);
            return this;
        }

        @Override // com.spotify.player.model.command.SkipToNextTrackCommand.Builder
        public SkipToNextTrackCommand.Builder track(ContextTrack contextTrack) {
            this.track = xul0.m92201d(contextTrack);
            return this;
        }

        public Builder(SkipToNextTrackCommand skipToNextTrackCommand) {
            C2244p5 c2244p5 = C2244p5.f174033a;
            this.track = c2244p5;
            this.options = c2244p5;
            this.loggingParams = c2244p5;
            this.track = skipToNextTrackCommand.track();
            this.options = skipToNextTrackCommand.options();
            this.loggingParams = skipToNextTrackCommand.loggingParams();
        }
    }
}
