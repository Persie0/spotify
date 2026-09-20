package com.spotify.player.model.command;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.SkipToPrevTrackOptions;
import p204p.C2244p5;
import p204p.dq60;
import p204p.edb;
import p204p.xul0;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_SkipToPrevTrackCommand extends SkipToPrevTrackCommand {
    private final xul0 loggingParams;
    private final xul0 options;
    private final xul0 track;

    public /* synthetic */ AutoValue_SkipToPrevTrackCommand(xul0 xul0Var, xul0 xul0Var2, xul0 xul0Var3, int i) {
        this(xul0Var, xul0Var2, xul0Var3);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SkipToPrevTrackCommand) {
            SkipToPrevTrackCommand skipToPrevTrackCommand = (SkipToPrevTrackCommand) obj;
            if (this.track.equals(skipToPrevTrackCommand.track()) && this.options.equals(skipToPrevTrackCommand.options()) && this.loggingParams.equals(skipToPrevTrackCommand.loggingParams())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.track.hashCode() ^ 1000003) * 1000003) ^ this.options.hashCode()) * 1000003) ^ this.loggingParams.hashCode();
    }

    @Override // com.spotify.player.model.command.SkipToPrevTrackCommand
    public xul0 loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.SkipToPrevTrackCommand
    public xul0 options() {
        return this.options;
    }

    @Override // com.spotify.player.model.command.SkipToPrevTrackCommand
    public SkipToPrevTrackCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return dq60.m36616p(String.valueOf(this.loggingParams), "}", edb.m38573v("SkipToPrevTrackCommand{track=", String.valueOf(this.track), ", options=", String.valueOf(this.options), ", loggingParams="));
    }

    @Override // com.spotify.player.model.command.SkipToPrevTrackCommand
    public xul0 track() {
        return this.track;
    }

    private AutoValue_SkipToPrevTrackCommand(xul0 xul0Var, xul0 xul0Var2, xul0 xul0Var3) {
        this.track = xul0Var;
        this.options = xul0Var2;
        this.loggingParams = xul0Var3;
    }

    public static final class Builder extends SkipToPrevTrackCommand.Builder {
        private xul0 loggingParams;
        private xul0 options;
        private xul0 track;

        public Builder() {
            C2244p5 c2244p5 = C2244p5.f174033a;
            this.track = c2244p5;
            this.options = c2244p5;
            this.loggingParams = c2244p5;
        }

        @Override // com.spotify.player.model.command.SkipToPrevTrackCommand.Builder
        public SkipToPrevTrackCommand build() {
            return new AutoValue_SkipToPrevTrackCommand(this.track, this.options, this.loggingParams, 0);
        }

        @Override // com.spotify.player.model.command.SkipToPrevTrackCommand.Builder
        public SkipToPrevTrackCommand.Builder loggingParams(LoggingParams loggingParams) {
            this.loggingParams = xul0.m92201d(loggingParams);
            return this;
        }

        @Override // com.spotify.player.model.command.SkipToPrevTrackCommand.Builder
        public SkipToPrevTrackCommand.Builder options(SkipToPrevTrackOptions skipToPrevTrackOptions) {
            this.options = xul0.m92201d(skipToPrevTrackOptions);
            return this;
        }

        @Override // com.spotify.player.model.command.SkipToPrevTrackCommand.Builder
        public SkipToPrevTrackCommand.Builder track(ContextTrack contextTrack) {
            this.track = xul0.m92201d(contextTrack);
            return this;
        }

        public Builder(SkipToPrevTrackCommand skipToPrevTrackCommand) {
            C2244p5 c2244p5 = C2244p5.f174033a;
            this.track = c2244p5;
            this.options = c2244p5;
            this.loggingParams = c2244p5;
            this.track = skipToPrevTrackCommand.track();
            this.options = skipToPrevTrackCommand.options();
            this.loggingParams = skipToPrevTrackCommand.loggingParams();
        }
    }
}
