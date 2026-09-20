package com.spotify.player.model.command;

import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import p204p.C2244p5;
import p204p.dq60;
import p204p.xul0;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_SetRepeatingContextCommand extends SetRepeatingContextCommand {
    private final xul0 loggingParams;
    private final xul0 options;
    private final boolean value;

    public /* synthetic */ AutoValue_SetRepeatingContextCommand(boolean z, xul0 xul0Var, xul0 xul0Var2, int i) {
        this(z, xul0Var, xul0Var2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SetRepeatingContextCommand) {
            SetRepeatingContextCommand setRepeatingContextCommand = (SetRepeatingContextCommand) obj;
            if (this.value == setRepeatingContextCommand.value() && this.options.equals(setRepeatingContextCommand.options()) && this.loggingParams.equals(setRepeatingContextCommand.loggingParams())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((this.value ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.options.hashCode()) * 1000003) ^ this.loggingParams.hashCode();
    }

    @Override // com.spotify.player.model.command.SetRepeatingContextCommand
    public xul0 loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.SetRepeatingContextCommand
    public xul0 options() {
        return this.options;
    }

    @Override // com.spotify.player.model.command.SetRepeatingContextCommand
    public SetRepeatingContextCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        boolean z = this.value;
        String strValueOf = String.valueOf(this.options);
        String strValueOf2 = String.valueOf(this.loggingParams);
        StringBuilder sb = new StringBuilder("SetRepeatingContextCommand{value=");
        sb.append(z);
        sb.append(", options=");
        sb.append(strValueOf);
        sb.append(", loggingParams=");
        return dq60.m36616p(strValueOf2, "}", sb);
    }

    @Override // com.spotify.player.model.command.SetRepeatingContextCommand
    public boolean value() {
        return this.value;
    }

    private AutoValue_SetRepeatingContextCommand(boolean z, xul0 xul0Var, xul0 xul0Var2) {
        this.value = z;
        this.options = xul0Var;
        this.loggingParams = xul0Var2;
    }

    public static final class Builder extends SetRepeatingContextCommand.Builder {
        private xul0 loggingParams;
        private xul0 options;
        private byte set$0;
        private boolean value;

        public Builder() {
            C2244p5 c2244p5 = C2244p5.f174033a;
            this.options = c2244p5;
            this.loggingParams = c2244p5;
        }

        @Override // com.spotify.player.model.command.SetRepeatingContextCommand.Builder
        public SetRepeatingContextCommand build() {
            if (this.set$0 == 1) {
                return new AutoValue_SetRepeatingContextCommand(this.value, this.options, this.loggingParams, 0);
            }
            throw new IllegalStateException("Missing required properties: value");
        }

        @Override // com.spotify.player.model.command.SetRepeatingContextCommand.Builder
        public SetRepeatingContextCommand.Builder loggingParams(LoggingParams loggingParams) {
            this.loggingParams = xul0.m92201d(loggingParams);
            return this;
        }

        @Override // com.spotify.player.model.command.SetRepeatingContextCommand.Builder
        public SetRepeatingContextCommand.Builder options(CommandOptions commandOptions) {
            this.options = xul0.m92201d(commandOptions);
            return this;
        }

        @Override // com.spotify.player.model.command.SetRepeatingContextCommand.Builder
        public SetRepeatingContextCommand.Builder value(boolean z) {
            this.value = z;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        public Builder(SetRepeatingContextCommand setRepeatingContextCommand) {
            C2244p5 c2244p5 = C2244p5.f174033a;
            this.options = c2244p5;
            this.loggingParams = c2244p5;
            this.value = setRepeatingContextCommand.value();
            this.options = setRepeatingContextCommand.options();
            this.loggingParams = setRepeatingContextCommand.loggingParams();
            this.set$0 = (byte) 1;
        }
    }
}
