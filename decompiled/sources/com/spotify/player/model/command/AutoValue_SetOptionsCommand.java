package com.spotify.player.model.command;

import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import java.util.Map;
import p204p.C2244p5;
import p204p.dq60;
import p204p.edb;
import p204p.hzq0;
import p204p.klh;
import p204p.xf40;
import p204p.xul0;
import p204p.y85;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_SetOptionsCommand extends SetOptionsCommand {
    private final xul0 loggingParams;
    private final xf40 modes;
    private final xul0 options;
    private final xul0 playbackSpeed;
    private final xul0 repeatingContext;
    private final xul0 repeatingTrack;
    private final xul0 shufflingContext;

    public /* synthetic */ AutoValue_SetOptionsCommand(xul0 xul0Var, xul0 xul0Var2, xul0 xul0Var3, xul0 xul0Var4, xf40 xf40Var, xul0 xul0Var5, xul0 xul0Var6, int i) {
        this(xul0Var, xul0Var2, xul0Var3, xul0Var4, xf40Var, xul0Var5, xul0Var6);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SetOptionsCommand) {
            SetOptionsCommand setOptionsCommand = (SetOptionsCommand) obj;
            if (this.repeatingTrack.equals(setOptionsCommand.repeatingTrack()) && this.repeatingContext.equals(setOptionsCommand.repeatingContext()) && this.shufflingContext.equals(setOptionsCommand.shufflingContext()) && this.playbackSpeed.equals(setOptionsCommand.playbackSpeed())) {
                xf40 xf40Var = this.modes;
                xf40 xf40VarModes = setOptionsCommand.modes();
                xf40Var.getClass();
                if (y85.m93065j(xf40VarModes, xf40Var) && this.options.equals(setOptionsCommand.options()) && this.loggingParams.equals(setOptionsCommand.loggingParams())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((this.repeatingTrack.hashCode() ^ 1000003) * 1000003) ^ this.repeatingContext.hashCode()) * 1000003) ^ this.shufflingContext.hashCode()) * 1000003) ^ this.playbackSpeed.hashCode()) * 1000003) ^ this.modes.hashCode()) * 1000003) ^ this.options.hashCode()) * 1000003) ^ this.loggingParams.hashCode();
    }

    @Override // com.spotify.player.model.command.SetOptionsCommand
    public xul0 loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.SetOptionsCommand
    public xf40 modes() {
        return this.modes;
    }

    @Override // com.spotify.player.model.command.SetOptionsCommand
    public xul0 options() {
        return this.options;
    }

    @Override // com.spotify.player.model.command.SetOptionsCommand
    public xul0 playbackSpeed() {
        return this.playbackSpeed;
    }

    @Override // com.spotify.player.model.command.SetOptionsCommand
    public xul0 repeatingContext() {
        return this.repeatingContext;
    }

    @Override // com.spotify.player.model.command.SetOptionsCommand
    public xul0 repeatingTrack() {
        return this.repeatingTrack;
    }

    @Override // com.spotify.player.model.command.SetOptionsCommand
    public xul0 shufflingContext() {
        return this.shufflingContext;
    }

    @Override // com.spotify.player.model.command.SetOptionsCommand
    public SetOptionsCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.repeatingTrack);
        String strValueOf2 = String.valueOf(this.repeatingContext);
        String strValueOf3 = String.valueOf(this.shufflingContext);
        String strValueOf4 = String.valueOf(this.playbackSpeed);
        String strValueOf5 = String.valueOf(this.modes);
        String strValueOf6 = String.valueOf(this.options);
        String strValueOf7 = String.valueOf(this.loggingParams);
        StringBuilder sbM38573v = edb.m38573v("SetOptionsCommand{repeatingTrack=", strValueOf, ", repeatingContext=", strValueOf2, ", shufflingContext=");
        klh.m56844p(sbM38573v, strValueOf3, ", playbackSpeed=", strValueOf4, ", modes=");
        klh.m56844p(sbM38573v, strValueOf5, ", options=", strValueOf6, ", loggingParams=");
        return dq60.m36616p(strValueOf7, "}", sbM38573v);
    }

    private AutoValue_SetOptionsCommand(xul0 xul0Var, xul0 xul0Var2, xul0 xul0Var3, xul0 xul0Var4, xf40 xf40Var, xul0 xul0Var5, xul0 xul0Var6) {
        this.repeatingTrack = xul0Var;
        this.repeatingContext = xul0Var2;
        this.shufflingContext = xul0Var3;
        this.playbackSpeed = xul0Var4;
        this.modes = xf40Var;
        this.options = xul0Var5;
        this.loggingParams = xul0Var6;
    }

    public static final class Builder extends SetOptionsCommand.Builder {
        private xul0 loggingParams;
        private xf40 modes;
        private xul0 options;
        private xul0 playbackSpeed;
        private xul0 repeatingContext;
        private xul0 repeatingTrack;
        private xul0 shufflingContext;

        public Builder() {
            C2244p5 c2244p5 = C2244p5.f174033a;
            this.repeatingTrack = c2244p5;
            this.repeatingContext = c2244p5;
            this.shufflingContext = c2244p5;
            this.playbackSpeed = c2244p5;
            this.options = c2244p5;
            this.loggingParams = c2244p5;
        }

        @Override // com.spotify.player.model.command.SetOptionsCommand.Builder
        public SetOptionsCommand build() {
            xf40 xf40Var = this.modes;
            if (xf40Var != null) {
                return new AutoValue_SetOptionsCommand(this.repeatingTrack, this.repeatingContext, this.shufflingContext, this.playbackSpeed, xf40Var, this.options, this.loggingParams, 0);
            }
            throw new IllegalStateException("Missing required properties: modes");
        }

        @Override // com.spotify.player.model.command.SetOptionsCommand.Builder
        public SetOptionsCommand.Builder loggingParams(LoggingParams loggingParams) {
            this.loggingParams = xul0.m92201d(loggingParams);
            return this;
        }

        @Override // com.spotify.player.model.command.SetOptionsCommand.Builder
        public SetOptionsCommand.Builder modes(Map<String, String> map) {
            this.modes = xf40.m90451c(map);
            return this;
        }

        @Override // com.spotify.player.model.command.SetOptionsCommand.Builder
        public SetOptionsCommand.Builder options(CommandOptions commandOptions) {
            this.options = xul0.m92201d(commandOptions);
            return this;
        }

        @Override // com.spotify.player.model.command.SetOptionsCommand.Builder
        public SetOptionsCommand.Builder playbackSpeed(float f) {
            this.playbackSpeed = new hzq0(Float.valueOf(f));
            return this;
        }

        @Override // com.spotify.player.model.command.SetOptionsCommand.Builder
        public SetOptionsCommand.Builder repeatingContext(boolean z) {
            this.repeatingContext = new hzq0(Boolean.valueOf(z));
            return this;
        }

        @Override // com.spotify.player.model.command.SetOptionsCommand.Builder
        public SetOptionsCommand.Builder repeatingTrack(boolean z) {
            this.repeatingTrack = new hzq0(Boolean.valueOf(z));
            return this;
        }

        @Override // com.spotify.player.model.command.SetOptionsCommand.Builder
        public SetOptionsCommand.Builder shufflingContext(boolean z) {
            this.shufflingContext = new hzq0(Boolean.valueOf(z));
            return this;
        }

        public Builder(SetOptionsCommand setOptionsCommand) {
            C2244p5 c2244p5 = C2244p5.f174033a;
            this.repeatingTrack = c2244p5;
            this.repeatingContext = c2244p5;
            this.shufflingContext = c2244p5;
            this.playbackSpeed = c2244p5;
            this.options = c2244p5;
            this.loggingParams = c2244p5;
            this.repeatingTrack = setOptionsCommand.repeatingTrack();
            this.repeatingContext = setOptionsCommand.repeatingContext();
            this.shufflingContext = setOptionsCommand.shufflingContext();
            this.playbackSpeed = setOptionsCommand.playbackSpeed();
            this.modes = setOptionsCommand.modes();
            this.options = setOptionsCommand.options();
            this.loggingParams = setOptionsCommand.loggingParams();
        }
    }
}
