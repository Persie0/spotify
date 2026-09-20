package com.spotify.player.model.command;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import p204p.C2244p5;
import p204p.dq60;
import p204p.edb;
import p204p.xul0;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_AddToQueueCommand extends AddToQueueCommand {
    private final xul0 loggingParams;
    private final xul0 options;
    private final ContextTrack track;

    public /* synthetic */ AutoValue_AddToQueueCommand(ContextTrack contextTrack, xul0 xul0Var, xul0 xul0Var2, int i) {
        this(contextTrack, xul0Var, xul0Var2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AddToQueueCommand) {
            AddToQueueCommand addToQueueCommand = (AddToQueueCommand) obj;
            if (this.track.equals(addToQueueCommand.track()) && this.options.equals(addToQueueCommand.options()) && this.loggingParams.equals(addToQueueCommand.loggingParams())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.track.hashCode() ^ 1000003) * 1000003) ^ this.options.hashCode()) * 1000003) ^ this.loggingParams.hashCode();
    }

    @Override // com.spotify.player.model.command.AddToQueueCommand
    public xul0 loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.AddToQueueCommand
    public xul0 options() {
        return this.options;
    }

    @Override // com.spotify.player.model.command.AddToQueueCommand
    public AddToQueueCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return dq60.m36616p(String.valueOf(this.loggingParams), "}", edb.m38573v("AddToQueueCommand{track=", String.valueOf(this.track), ", options=", String.valueOf(this.options), ", loggingParams="));
    }

    @Override // com.spotify.player.model.command.AddToQueueCommand
    public ContextTrack track() {
        return this.track;
    }

    private AutoValue_AddToQueueCommand(ContextTrack contextTrack, xul0 xul0Var, xul0 xul0Var2) {
        this.track = contextTrack;
        this.options = xul0Var;
        this.loggingParams = xul0Var2;
    }

    public static final class Builder extends AddToQueueCommand.Builder {
        private xul0 loggingParams;
        private xul0 options;
        private ContextTrack track;

        public Builder() {
            C2244p5 c2244p5 = C2244p5.f174033a;
            this.options = c2244p5;
            this.loggingParams = c2244p5;
        }

        @Override // com.spotify.player.model.command.AddToQueueCommand.Builder
        public AddToQueueCommand build() {
            ContextTrack contextTrack = this.track;
            if (contextTrack != null) {
                return new AutoValue_AddToQueueCommand(contextTrack, this.options, this.loggingParams, 0);
            }
            throw new IllegalStateException("Missing required properties: track");
        }

        @Override // com.spotify.player.model.command.AddToQueueCommand.Builder
        public AddToQueueCommand.Builder loggingParams(LoggingParams loggingParams) {
            this.loggingParams = xul0.m92201d(loggingParams);
            return this;
        }

        @Override // com.spotify.player.model.command.AddToQueueCommand.Builder
        public AddToQueueCommand.Builder options(CommandOptions commandOptions) {
            this.options = xul0.m92201d(commandOptions);
            return this;
        }

        @Override // com.spotify.player.model.command.AddToQueueCommand.Builder
        public AddToQueueCommand.Builder track(ContextTrack contextTrack) {
            if (contextTrack == null) {
                throw new NullPointerException("Null track");
            }
            this.track = contextTrack;
            return this;
        }

        public Builder(AddToQueueCommand addToQueueCommand) {
            C2244p5 c2244p5 = C2244p5.f174033a;
            this.options = c2244p5;
            this.loggingParams = c2244p5;
            this.track = addToQueueCommand.track();
            this.options = addToQueueCommand.options();
            this.loggingParams = addToQueueCommand.loggingParams();
        }
    }
}
