package com.spotify.player.model.command;

import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import p204p.C2244p5;
import p204p.dq60;
import p204p.hzq0;
import p204p.klh;
import p204p.xul0;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_SeekToCommand extends SeekToCommand {
    private final xul0 creatorTimestampPositionMs;
    private final xul0 loggingParams;
    private final xul0 options;
    private final xul0 relative;
    private final long value;

    public /* synthetic */ AutoValue_SeekToCommand(long j, xul0 xul0Var, xul0 xul0Var2, xul0 xul0Var3, xul0 xul0Var4, int i) {
        this(j, xul0Var, xul0Var2, xul0Var3, xul0Var4);
    }

    @Override // com.spotify.player.model.command.SeekToCommand
    public xul0 creatorTimestampPositionMs() {
        return this.creatorTimestampPositionMs;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SeekToCommand) {
            SeekToCommand seekToCommand = (SeekToCommand) obj;
            if (this.value == seekToCommand.value() && this.relative.equals(seekToCommand.relative()) && this.options.equals(seekToCommand.options()) && this.loggingParams.equals(seekToCommand.loggingParams()) && this.creatorTimestampPositionMs.equals(seekToCommand.creatorTimestampPositionMs())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.value;
        return ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.relative.hashCode()) * 1000003) ^ this.options.hashCode()) * 1000003) ^ this.loggingParams.hashCode()) * 1000003) ^ this.creatorTimestampPositionMs.hashCode();
    }

    @Override // com.spotify.player.model.command.SeekToCommand
    public xul0 loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.SeekToCommand
    public xul0 options() {
        return this.options;
    }

    @Override // com.spotify.player.model.command.SeekToCommand
    public xul0 relative() {
        return this.relative;
    }

    @Override // com.spotify.player.model.command.SeekToCommand
    public SeekToCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        long j = this.value;
        String strValueOf = String.valueOf(this.relative);
        String strValueOf2 = String.valueOf(this.options);
        String strValueOf3 = String.valueOf(this.loggingParams);
        String strValueOf4 = String.valueOf(this.creatorTimestampPositionMs);
        StringBuilder sb = new StringBuilder("SeekToCommand{value=");
        sb.append(j);
        sb.append(", relative=");
        sb.append(strValueOf);
        klh.m56844p(sb, ", options=", strValueOf2, ", loggingParams=", strValueOf3);
        return dq60.m36618r(sb, ", creatorTimestampPositionMs=", strValueOf4, "}");
    }

    @Override // com.spotify.player.model.command.SeekToCommand
    public long value() {
        return this.value;
    }

    private AutoValue_SeekToCommand(long j, xul0 xul0Var, xul0 xul0Var2, xul0 xul0Var3, xul0 xul0Var4) {
        this.value = j;
        this.relative = xul0Var;
        this.options = xul0Var2;
        this.loggingParams = xul0Var3;
        this.creatorTimestampPositionMs = xul0Var4;
    }

    public static final class Builder extends SeekToCommand.Builder {
        private xul0 creatorTimestampPositionMs;
        private xul0 loggingParams;
        private xul0 options;
        private xul0 relative;
        private byte set$0;
        private long value;

        public Builder() {
            C2244p5 c2244p5 = C2244p5.f174033a;
            this.relative = c2244p5;
            this.options = c2244p5;
            this.loggingParams = c2244p5;
            this.creatorTimestampPositionMs = c2244p5;
        }

        @Override // com.spotify.player.model.command.SeekToCommand.Builder
        public SeekToCommand build() {
            if (this.set$0 == 1) {
                return new AutoValue_SeekToCommand(this.value, this.relative, this.options, this.loggingParams, this.creatorTimestampPositionMs, 0);
            }
            throw new IllegalStateException("Missing required properties: value");
        }

        @Override // com.spotify.player.model.command.SeekToCommand.Builder
        public SeekToCommand.Builder creatorTimestampPositionMs(long j) {
            this.creatorTimestampPositionMs = new hzq0(Long.valueOf(j));
            return this;
        }

        @Override // com.spotify.player.model.command.SeekToCommand.Builder
        public SeekToCommand.Builder loggingParams(LoggingParams loggingParams) {
            this.loggingParams = xul0.m92201d(loggingParams);
            return this;
        }

        @Override // com.spotify.player.model.command.SeekToCommand.Builder
        public SeekToCommand.Builder options(CommandOptions commandOptions) {
            this.options = xul0.m92201d(commandOptions);
            return this;
        }

        @Override // com.spotify.player.model.command.SeekToCommand.Builder
        public SeekToCommand.Builder relative(SeekToCommand.Relative relative) {
            this.relative = xul0.m92201d(relative);
            return this;
        }

        @Override // com.spotify.player.model.command.SeekToCommand.Builder
        public SeekToCommand.Builder value(long j) {
            this.value = j;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        public Builder(SeekToCommand seekToCommand) {
            C2244p5 c2244p5 = C2244p5.f174033a;
            this.relative = c2244p5;
            this.options = c2244p5;
            this.loggingParams = c2244p5;
            this.creatorTimestampPositionMs = c2244p5;
            this.value = seekToCommand.value();
            this.relative = seekToCommand.relative();
            this.options = seekToCommand.options();
            this.loggingParams = seekToCommand.loggingParams();
            this.creatorTimestampPositionMs = seekToCommand.creatorTimestampPositionMs();
            this.set$0 = (byte) 1;
        }
    }
}
