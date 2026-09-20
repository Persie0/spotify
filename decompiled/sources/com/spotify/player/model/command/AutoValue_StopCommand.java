package com.spotify.player.model.command;

import com.spotify.player.model.command.options.LoggingParams;
import p204p.C2244p5;
import p204p.s571;
import p204p.xul0;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_StopCommand extends StopCommand {
    private final xul0 loggingParams;

    public /* synthetic */ AutoValue_StopCommand(xul0 xul0Var, int i) {
        this(xul0Var);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StopCommand) {
            return this.loggingParams.equals(((StopCommand) obj).loggingParams());
        }
        return false;
    }

    public int hashCode() {
        return this.loggingParams.hashCode() ^ 1000003;
    }

    @Override // com.spotify.player.model.command.StopCommand
    public xul0 loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.StopCommand
    public StopCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return s571.m77251j("StopCommand{loggingParams=", String.valueOf(this.loggingParams), "}");
    }

    public static final class Builder extends StopCommand.Builder {
        private xul0 loggingParams;

        public Builder() {
            this.loggingParams = C2244p5.f174033a;
        }

        @Override // com.spotify.player.model.command.StopCommand.Builder
        public StopCommand build() {
            return new AutoValue_StopCommand(this.loggingParams, 0);
        }

        @Override // com.spotify.player.model.command.StopCommand.Builder
        public StopCommand.Builder loggingParams(LoggingParams loggingParams) {
            this.loggingParams = xul0.m92201d(loggingParams);
            return this;
        }

        public Builder(StopCommand stopCommand) {
            this.loggingParams = C2244p5.f174033a;
            this.loggingParams = stopCommand.loggingParams();
        }
    }

    private AutoValue_StopCommand(xul0 xul0Var) {
        this.loggingParams = xul0Var;
    }
}
