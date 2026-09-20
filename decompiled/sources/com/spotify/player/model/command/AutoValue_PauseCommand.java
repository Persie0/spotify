package com.spotify.player.model.command;

import com.spotify.player.model.PauseResumeOrigin;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import p204p.C2244p5;
import p204p.dq60;
import p204p.edb;
import p204p.xul0;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_PauseCommand extends PauseCommand {
    private final xul0 loggingParams;
    private final xul0 options;
    private final xul0 pauseOrigin;

    public /* synthetic */ AutoValue_PauseCommand(xul0 xul0Var, xul0 xul0Var2, xul0 xul0Var3, int i) {
        this(xul0Var, xul0Var2, xul0Var3);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PauseCommand) {
            PauseCommand pauseCommand = (PauseCommand) obj;
            if (this.options.equals(pauseCommand.options()) && this.loggingParams.equals(pauseCommand.loggingParams()) && this.pauseOrigin.equals(pauseCommand.pauseOrigin())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.options.hashCode() ^ 1000003) * 1000003) ^ this.loggingParams.hashCode()) * 1000003) ^ this.pauseOrigin.hashCode();
    }

    @Override // com.spotify.player.model.command.PauseCommand
    public xul0 loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.PauseCommand
    public xul0 options() {
        return this.options;
    }

    @Override // com.spotify.player.model.command.PauseCommand
    public xul0 pauseOrigin() {
        return this.pauseOrigin;
    }

    @Override // com.spotify.player.model.command.PauseCommand
    public PauseCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return dq60.m36616p(String.valueOf(this.pauseOrigin), "}", edb.m38573v("PauseCommand{options=", String.valueOf(this.options), ", loggingParams=", String.valueOf(this.loggingParams), ", pauseOrigin="));
    }

    private AutoValue_PauseCommand(xul0 xul0Var, xul0 xul0Var2, xul0 xul0Var3) {
        this.options = xul0Var;
        this.loggingParams = xul0Var2;
        this.pauseOrigin = xul0Var3;
    }

    public static final class Builder extends PauseCommand.Builder {
        private xul0 loggingParams;
        private xul0 options;
        private xul0 pauseOrigin;

        public Builder() {
            C2244p5 c2244p5 = C2244p5.f174033a;
            this.options = c2244p5;
            this.loggingParams = c2244p5;
            this.pauseOrigin = c2244p5;
        }

        @Override // com.spotify.player.model.command.PauseCommand.Builder
        public PauseCommand build() {
            return new AutoValue_PauseCommand(this.options, this.loggingParams, this.pauseOrigin, 0);
        }

        @Override // com.spotify.player.model.command.PauseCommand.Builder
        public PauseCommand.Builder loggingParams(LoggingParams loggingParams) {
            this.loggingParams = xul0.m92201d(loggingParams);
            return this;
        }

        @Override // com.spotify.player.model.command.PauseCommand.Builder
        public PauseCommand.Builder options(CommandOptions commandOptions) {
            this.options = xul0.m92201d(commandOptions);
            return this;
        }

        @Override // com.spotify.player.model.command.PauseCommand.Builder
        public PauseCommand.Builder pauseOrigin(PauseResumeOrigin pauseResumeOrigin) {
            this.pauseOrigin = xul0.m92201d(pauseResumeOrigin);
            return this;
        }

        public Builder(PauseCommand pauseCommand) {
            C2244p5 c2244p5 = C2244p5.f174033a;
            this.options = c2244p5;
            this.loggingParams = c2244p5;
            this.pauseOrigin = c2244p5;
            this.options = pauseCommand.options();
            this.loggingParams = pauseCommand.loggingParams();
            this.pauseOrigin = pauseCommand.pauseOrigin();
        }
    }
}
