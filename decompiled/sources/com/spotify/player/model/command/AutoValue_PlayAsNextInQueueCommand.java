package com.spotify.player.model.command;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import java.util.List;
import p204p.C2244p5;
import p204p.dq60;
import p204p.edb;
import p204p.pf40;
import p204p.pmf0;
import p204p.xul0;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_PlayAsNextInQueueCommand extends PlayAsNextInQueueCommand {
    private final xul0 loggingParams;
    private final xul0 options;
    private final pf40 tracks;

    public /* synthetic */ AutoValue_PlayAsNextInQueueCommand(pf40 pf40Var, xul0 xul0Var, xul0 xul0Var2, int i) {
        this(pf40Var, xul0Var, xul0Var2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayAsNextInQueueCommand) {
            PlayAsNextInQueueCommand playAsNextInQueueCommand = (PlayAsNextInQueueCommand) obj;
            pf40 pf40Var = this.tracks;
            pf40 pf40VarTracks = playAsNextInQueueCommand.tracks();
            pf40Var.getClass();
            if (pmf0.m70330p(pf40Var, pf40VarTracks) && this.options.equals(playAsNextInQueueCommand.options()) && this.loggingParams.equals(playAsNextInQueueCommand.loggingParams())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.tracks.hashCode() ^ 1000003) * 1000003) ^ this.options.hashCode()) * 1000003) ^ this.loggingParams.hashCode();
    }

    @Override // com.spotify.player.model.command.PlayAsNextInQueueCommand
    public xul0 loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.PlayAsNextInQueueCommand
    public xul0 options() {
        return this.options;
    }

    @Override // com.spotify.player.model.command.PlayAsNextInQueueCommand
    public PlayAsNextInQueueCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return dq60.m36616p(String.valueOf(this.loggingParams), "}", edb.m38573v("PlayAsNextInQueueCommand{tracks=", String.valueOf(this.tracks), ", options=", String.valueOf(this.options), ", loggingParams="));
    }

    @Override // com.spotify.player.model.command.PlayAsNextInQueueCommand
    public pf40 tracks() {
        return this.tracks;
    }

    private AutoValue_PlayAsNextInQueueCommand(pf40 pf40Var, xul0 xul0Var, xul0 xul0Var2) {
        this.tracks = pf40Var;
        this.options = xul0Var;
        this.loggingParams = xul0Var2;
    }

    public static final class Builder extends PlayAsNextInQueueCommand.Builder {
        private xul0 loggingParams;
        private xul0 options;
        private pf40 tracks;

        public Builder() {
            C2244p5 c2244p5 = C2244p5.f174033a;
            this.options = c2244p5;
            this.loggingParams = c2244p5;
        }

        @Override // com.spotify.player.model.command.PlayAsNextInQueueCommand.Builder
        public PlayAsNextInQueueCommand build() {
            pf40 pf40Var = this.tracks;
            if (pf40Var != null) {
                return new AutoValue_PlayAsNextInQueueCommand(pf40Var, this.options, this.loggingParams, 0);
            }
            throw new IllegalStateException("Missing required properties: tracks");
        }

        @Override // com.spotify.player.model.command.PlayAsNextInQueueCommand.Builder
        public PlayAsNextInQueueCommand.Builder loggingParams(LoggingParams loggingParams) {
            this.loggingParams = xul0.m92201d(loggingParams);
            return this;
        }

        @Override // com.spotify.player.model.command.PlayAsNextInQueueCommand.Builder
        public PlayAsNextInQueueCommand.Builder options(CommandOptions commandOptions) {
            this.options = xul0.m92201d(commandOptions);
            return this;
        }

        @Override // com.spotify.player.model.command.PlayAsNextInQueueCommand.Builder
        public PlayAsNextInQueueCommand.Builder tracks(List<ContextTrack> list) {
            this.tracks = pf40.m69791p(list);
            return this;
        }

        public Builder(PlayAsNextInQueueCommand playAsNextInQueueCommand) {
            C2244p5 c2244p5 = C2244p5.f174033a;
            this.options = c2244p5;
            this.loggingParams = c2244p5;
            this.tracks = playAsNextInQueueCommand.tracks();
            this.options = playAsNextInQueueCommand.options();
            this.loggingParams = playAsNextInQueueCommand.loggingParams();
        }
    }
}
