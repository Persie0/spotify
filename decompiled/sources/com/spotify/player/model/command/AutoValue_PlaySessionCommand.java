package com.spotify.player.model.command;

import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayOptions;
import p204p.C2244p5;
import p204p.dq60;
import p204p.xul0;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_PlaySessionCommand extends PlaySessionCommand {
    private final xul0 loggingParams;
    private final xul0 playOptions;

    public /* synthetic */ AutoValue_PlaySessionCommand(xul0 xul0Var, xul0 xul0Var2, int i) {
        this(xul0Var, xul0Var2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlaySessionCommand) {
            PlaySessionCommand playSessionCommand = (PlaySessionCommand) obj;
            if (this.playOptions.equals(playSessionCommand.playOptions()) && this.loggingParams.equals(playSessionCommand.loggingParams())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.playOptions.hashCode() ^ 1000003) * 1000003) ^ this.loggingParams.hashCode();
    }

    @Override // com.spotify.player.model.command.PlaySessionCommand
    public xul0 loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.PlaySessionCommand
    public xul0 playOptions() {
        return this.playOptions;
    }

    @Override // com.spotify.player.model.command.PlaySessionCommand
    public PlaySessionCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return dq60.m36615o("PlaySessionCommand{playOptions=", String.valueOf(this.playOptions), ", loggingParams=", String.valueOf(this.loggingParams), "}");
    }

    private AutoValue_PlaySessionCommand(xul0 xul0Var, xul0 xul0Var2) {
        this.playOptions = xul0Var;
        this.loggingParams = xul0Var2;
    }

    public static final class Builder extends PlaySessionCommand.Builder {
        private xul0 loggingParams;
        private xul0 playOptions;

        public Builder() {
            C2244p5 c2244p5 = C2244p5.f174033a;
            this.playOptions = c2244p5;
            this.loggingParams = c2244p5;
        }

        @Override // com.spotify.player.model.command.PlaySessionCommand.Builder
        public PlaySessionCommand build() {
            return new AutoValue_PlaySessionCommand(this.playOptions, this.loggingParams, 0);
        }

        @Override // com.spotify.player.model.command.PlaySessionCommand.Builder
        public PlaySessionCommand.Builder loggingParams(LoggingParams loggingParams) {
            this.loggingParams = xul0.m92201d(loggingParams);
            return this;
        }

        @Override // com.spotify.player.model.command.PlaySessionCommand.Builder
        public PlaySessionCommand.Builder playOptions(PlayOptions playOptions) {
            this.playOptions = xul0.m92201d(playOptions);
            return this;
        }

        public Builder(PlaySessionCommand playSessionCommand) {
            C2244p5 c2244p5 = C2244p5.f174033a;
            this.playOptions = c2244p5;
            this.loggingParams = c2244p5;
            this.playOptions = playSessionCommand.playOptions();
            this.loggingParams = playSessionCommand.loggingParams();
        }
    }
}
