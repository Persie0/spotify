package com.spotify.player.model.command;

import com.spotify.player.model.PauseResumeOrigin;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import p204p.C2244p5;
import p204p.dq60;
import p204p.edb;
import p204p.xul0;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_ResumeCommand extends ResumeCommand {
    private final xul0 loggingParams;
    private final xul0 options;
    private final xul0 resumeOrigin;

    public /* synthetic */ AutoValue_ResumeCommand(xul0 xul0Var, xul0 xul0Var2, xul0 xul0Var3, int i) {
        this(xul0Var, xul0Var2, xul0Var3);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ResumeCommand) {
            ResumeCommand resumeCommand = (ResumeCommand) obj;
            if (this.options.equals(resumeCommand.options()) && this.loggingParams.equals(resumeCommand.loggingParams()) && this.resumeOrigin.equals(resumeCommand.resumeOrigin())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.options.hashCode() ^ 1000003) * 1000003) ^ this.loggingParams.hashCode()) * 1000003) ^ this.resumeOrigin.hashCode();
    }

    @Override // com.spotify.player.model.command.ResumeCommand
    public xul0 loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.ResumeCommand
    public xul0 options() {
        return this.options;
    }

    @Override // com.spotify.player.model.command.ResumeCommand
    public xul0 resumeOrigin() {
        return this.resumeOrigin;
    }

    @Override // com.spotify.player.model.command.ResumeCommand
    public ResumeCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return dq60.m36616p(String.valueOf(this.resumeOrigin), "}", edb.m38573v("ResumeCommand{options=", String.valueOf(this.options), ", loggingParams=", String.valueOf(this.loggingParams), ", resumeOrigin="));
    }

    private AutoValue_ResumeCommand(xul0 xul0Var, xul0 xul0Var2, xul0 xul0Var3) {
        this.options = xul0Var;
        this.loggingParams = xul0Var2;
        this.resumeOrigin = xul0Var3;
    }

    public static final class Builder extends ResumeCommand.Builder {
        private xul0 loggingParams;
        private xul0 options;
        private xul0 resumeOrigin;

        public Builder() {
            C2244p5 c2244p5 = C2244p5.f174033a;
            this.options = c2244p5;
            this.loggingParams = c2244p5;
            this.resumeOrigin = c2244p5;
        }

        @Override // com.spotify.player.model.command.ResumeCommand.Builder
        public ResumeCommand build() {
            return new AutoValue_ResumeCommand(this.options, this.loggingParams, this.resumeOrigin, 0);
        }

        @Override // com.spotify.player.model.command.ResumeCommand.Builder
        public ResumeCommand.Builder loggingParams(LoggingParams loggingParams) {
            this.loggingParams = xul0.m92201d(loggingParams);
            return this;
        }

        @Override // com.spotify.player.model.command.ResumeCommand.Builder
        public ResumeCommand.Builder options(CommandOptions commandOptions) {
            this.options = xul0.m92201d(commandOptions);
            return this;
        }

        @Override // com.spotify.player.model.command.ResumeCommand.Builder
        public ResumeCommand.Builder resumeOrigin(PauseResumeOrigin pauseResumeOrigin) {
            this.resumeOrigin = xul0.m92201d(pauseResumeOrigin);
            return this;
        }

        public Builder(ResumeCommand resumeCommand) {
            C2244p5 c2244p5 = C2244p5.f174033a;
            this.options = c2244p5;
            this.loggingParams = c2244p5;
            this.resumeOrigin = c2244p5;
            this.options = resumeCommand.options();
            this.loggingParams = resumeCommand.loggingParams();
            this.resumeOrigin = resumeCommand.resumeOrigin();
        }
    }
}
