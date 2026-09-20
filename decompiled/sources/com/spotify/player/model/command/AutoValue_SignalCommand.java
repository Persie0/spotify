package com.spotify.player.model.command;

import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import p204p.C2244p5;
import p204p.edb;
import p204p.klh;
import p204p.xul0;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_SignalCommand extends SignalCommand {
    private final xul0 loggingParams;
    private final xul0 options;
    private final xul0 parameters;
    private final String signalId;

    public /* synthetic */ AutoValue_SignalCommand(String str, xul0 xul0Var, xul0 xul0Var2, xul0 xul0Var3, int i) {
        this(str, xul0Var, xul0Var2, xul0Var3);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SignalCommand) {
            SignalCommand signalCommand = (SignalCommand) obj;
            if (this.signalId.equals(signalCommand.signalId()) && this.parameters.equals(signalCommand.parameters()) && this.options.equals(signalCommand.options()) && this.loggingParams.equals(signalCommand.loggingParams())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.signalId.hashCode() ^ 1000003) * 1000003) ^ this.parameters.hashCode()) * 1000003) ^ this.options.hashCode()) * 1000003) ^ this.loggingParams.hashCode();
    }

    @Override // com.spotify.player.model.command.SignalCommand
    public xul0 loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.SignalCommand
    public xul0 options() {
        return this.options;
    }

    @Override // com.spotify.player.model.command.SignalCommand
    public xul0 parameters() {
        return this.parameters;
    }

    @Override // com.spotify.player.model.command.SignalCommand
    public String signalId() {
        return this.signalId;
    }

    @Override // com.spotify.player.model.command.SignalCommand
    public SignalCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        String str = this.signalId;
        String strValueOf = String.valueOf(this.parameters);
        return klh.m56837i(edb.m38573v("SignalCommand{signalId=", str, ", parameters=", strValueOf, ", options="), String.valueOf(this.options), ", loggingParams=", String.valueOf(this.loggingParams), "}");
    }

    private AutoValue_SignalCommand(String str, xul0 xul0Var, xul0 xul0Var2, xul0 xul0Var3) {
        this.signalId = str;
        this.parameters = xul0Var;
        this.options = xul0Var2;
        this.loggingParams = xul0Var3;
    }

    public static final class Builder extends SignalCommand.Builder {
        private xul0 loggingParams;
        private xul0 options;
        private xul0 parameters;
        private String signalId;

        public Builder() {
            C2244p5 c2244p5 = C2244p5.f174033a;
            this.parameters = c2244p5;
            this.options = c2244p5;
            this.loggingParams = c2244p5;
        }

        @Override // com.spotify.player.model.command.SignalCommand.Builder
        public SignalCommand build() {
            String str = this.signalId;
            if (str != null) {
                return new AutoValue_SignalCommand(str, this.parameters, this.options, this.loggingParams, 0);
            }
            throw new IllegalStateException("Missing required properties: signalId");
        }

        @Override // com.spotify.player.model.command.SignalCommand.Builder
        public SignalCommand.Builder loggingParams(LoggingParams loggingParams) {
            this.loggingParams = xul0.m92201d(loggingParams);
            return this;
        }

        @Override // com.spotify.player.model.command.SignalCommand.Builder
        public SignalCommand.Builder options(CommandOptions commandOptions) {
            this.options = xul0.m92201d(commandOptions);
            return this;
        }

        @Override // com.spotify.player.model.command.SignalCommand.Builder
        public SignalCommand.Builder parameters(String str) {
            this.parameters = xul0.m92201d(str);
            return this;
        }

        @Override // com.spotify.player.model.command.SignalCommand.Builder
        public SignalCommand.Builder signalId(String str) {
            if (str == null) {
                throw new NullPointerException("Null signalId");
            }
            this.signalId = str;
            return this;
        }

        public Builder(SignalCommand signalCommand) {
            C2244p5 c2244p5 = C2244p5.f174033a;
            this.parameters = c2244p5;
            this.options = c2244p5;
            this.loggingParams = c2244p5;
            this.signalId = signalCommand.signalId();
            this.parameters = signalCommand.parameters();
            this.options = signalCommand.options();
            this.loggingParams = signalCommand.loggingParams();
        }
    }
}
