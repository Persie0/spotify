package com.spotify.player.model.command;

import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.TimerType;
import p204p.C2244p5;
import p204p.dq60;
import p204p.edb;
import p204p.xul0;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_SetSleepTimerCommand extends SetSleepTimerCommand {
    private final xul0 loggingParams;
    private final xul0 options;
    private final TimerType timerType;

    public /* synthetic */ AutoValue_SetSleepTimerCommand(TimerType timerType, xul0 xul0Var, xul0 xul0Var2, int i) {
        this(timerType, xul0Var, xul0Var2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SetSleepTimerCommand) {
            SetSleepTimerCommand setSleepTimerCommand = (SetSleepTimerCommand) obj;
            if (this.timerType.equals(setSleepTimerCommand.timerType()) && this.options.equals(setSleepTimerCommand.options()) && this.loggingParams.equals(setSleepTimerCommand.loggingParams())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.timerType.hashCode() ^ 1000003) * 1000003) ^ this.options.hashCode()) * 1000003) ^ this.loggingParams.hashCode();
    }

    @Override // com.spotify.player.model.command.SetSleepTimerCommand
    public xul0 loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.SetSleepTimerCommand
    public xul0 options() {
        return this.options;
    }

    @Override // com.spotify.player.model.command.SetSleepTimerCommand
    public TimerType timerType() {
        return this.timerType;
    }

    @Override // com.spotify.player.model.command.SetSleepTimerCommand
    public SetSleepTimerCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return dq60.m36616p(String.valueOf(this.loggingParams), "}", edb.m38573v("SetSleepTimerCommand{timerType=", String.valueOf(this.timerType), ", options=", String.valueOf(this.options), ", loggingParams="));
    }

    private AutoValue_SetSleepTimerCommand(TimerType timerType, xul0 xul0Var, xul0 xul0Var2) {
        this.timerType = timerType;
        this.options = xul0Var;
        this.loggingParams = xul0Var2;
    }

    public static final class Builder extends SetSleepTimerCommand.Builder {
        private xul0 loggingParams;
        private xul0 options;
        private TimerType timerType;

        public Builder() {
            C2244p5 c2244p5 = C2244p5.f174033a;
            this.options = c2244p5;
            this.loggingParams = c2244p5;
        }

        @Override // com.spotify.player.model.command.SetSleepTimerCommand.Builder
        public SetSleepTimerCommand build() {
            TimerType timerType = this.timerType;
            if (timerType != null) {
                return new AutoValue_SetSleepTimerCommand(timerType, this.options, this.loggingParams, 0);
            }
            throw new IllegalStateException("Missing required properties: timerType");
        }

        @Override // com.spotify.player.model.command.SetSleepTimerCommand.Builder
        public SetSleepTimerCommand.Builder loggingParams(LoggingParams loggingParams) {
            this.loggingParams = xul0.m92201d(loggingParams);
            return this;
        }

        @Override // com.spotify.player.model.command.SetSleepTimerCommand.Builder
        public SetSleepTimerCommand.Builder options(CommandOptions commandOptions) {
            this.options = xul0.m92201d(commandOptions);
            return this;
        }

        @Override // com.spotify.player.model.command.SetSleepTimerCommand.Builder
        public SetSleepTimerCommand.Builder timerType(TimerType timerType) {
            if (timerType == null) {
                throw new NullPointerException("Null timerType");
            }
            this.timerType = timerType;
            return this;
        }

        public Builder(SetSleepTimerCommand setSleepTimerCommand) {
            C2244p5 c2244p5 = C2244p5.f174033a;
            this.options = c2244p5;
            this.loggingParams = c2244p5;
            this.timerType = setSleepTimerCommand.timerType();
            this.options = setSleepTimerCommand.options();
            this.loggingParams = setSleepTimerCommand.loggingParams();
        }
    }
}
