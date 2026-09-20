package com.spotify.player.model.command;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import java.util.List;
import p204p.C2244p5;
import p204p.dq60;
import p204p.edb;
import p204p.klh;
import p204p.pf40;
import p204p.pmf0;
import p204p.xul0;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_SetQueueCommand extends SetQueueCommand {
    private final xul0 loggingParams;
    private final pf40 nextTracks;
    private final xul0 options;
    private final pf40 prevTracks;
    private final String queueRevision;

    public /* synthetic */ AutoValue_SetQueueCommand(String str, pf40 pf40Var, pf40 pf40Var2, xul0 xul0Var, xul0 xul0Var2, int i) {
        this(str, pf40Var, pf40Var2, xul0Var, xul0Var2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SetQueueCommand) {
            SetQueueCommand setQueueCommand = (SetQueueCommand) obj;
            if (this.queueRevision.equals(setQueueCommand.queueRevision())) {
                pf40 pf40Var = this.prevTracks;
                pf40 pf40VarPrevTracks = setQueueCommand.prevTracks();
                pf40Var.getClass();
                if (pmf0.m70330p(pf40Var, pf40VarPrevTracks)) {
                    pf40 pf40Var2 = this.nextTracks;
                    pf40 pf40VarNextTracks = setQueueCommand.nextTracks();
                    pf40Var2.getClass();
                    if (pmf0.m70330p(pf40Var2, pf40VarNextTracks) && this.options.equals(setQueueCommand.options()) && this.loggingParams.equals(setQueueCommand.loggingParams())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((this.queueRevision.hashCode() ^ 1000003) * 1000003) ^ this.prevTracks.hashCode()) * 1000003) ^ this.nextTracks.hashCode()) * 1000003) ^ this.options.hashCode()) * 1000003) ^ this.loggingParams.hashCode();
    }

    @Override // com.spotify.player.model.command.SetQueueCommand
    public xul0 loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.SetQueueCommand
    public pf40 nextTracks() {
        return this.nextTracks;
    }

    @Override // com.spotify.player.model.command.SetQueueCommand
    public xul0 options() {
        return this.options;
    }

    @Override // com.spotify.player.model.command.SetQueueCommand
    public pf40 prevTracks() {
        return this.prevTracks;
    }

    @Override // com.spotify.player.model.command.SetQueueCommand
    public String queueRevision() {
        return this.queueRevision;
    }

    @Override // com.spotify.player.model.command.SetQueueCommand
    public SetQueueCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        String str = this.queueRevision;
        String strValueOf = String.valueOf(this.prevTracks);
        String strValueOf2 = String.valueOf(this.nextTracks);
        String strValueOf3 = String.valueOf(this.options);
        String strValueOf4 = String.valueOf(this.loggingParams);
        StringBuilder sbM38573v = edb.m38573v("SetQueueCommand{queueRevision=", str, ", prevTracks=", strValueOf, ", nextTracks=");
        klh.m56844p(sbM38573v, strValueOf2, ", options=", strValueOf3, ", loggingParams=");
        return dq60.m36616p(strValueOf4, "}", sbM38573v);
    }

    private AutoValue_SetQueueCommand(String str, pf40 pf40Var, pf40 pf40Var2, xul0 xul0Var, xul0 xul0Var2) {
        this.queueRevision = str;
        this.prevTracks = pf40Var;
        this.nextTracks = pf40Var2;
        this.options = xul0Var;
        this.loggingParams = xul0Var2;
    }

    public static final class Builder extends SetQueueCommand.Builder {
        private xul0 loggingParams;
        private pf40 nextTracks;
        private xul0 options;
        private pf40 prevTracks;
        private String queueRevision;

        public Builder() {
            C2244p5 c2244p5 = C2244p5.f174033a;
            this.options = c2244p5;
            this.loggingParams = c2244p5;
        }

        @Override // com.spotify.player.model.command.SetQueueCommand.Builder
        public SetQueueCommand build() {
            pf40 pf40Var;
            pf40 pf40Var2;
            String str = this.queueRevision;
            if (str != null && (pf40Var = this.prevTracks) != null && (pf40Var2 = this.nextTracks) != null) {
                return new AutoValue_SetQueueCommand(str, pf40Var, pf40Var2, this.options, this.loggingParams, 0);
            }
            StringBuilder sb = new StringBuilder();
            if (this.queueRevision == null) {
                sb.append(" queueRevision");
            }
            if (this.prevTracks == null) {
                sb.append(" prevTracks");
            }
            if (this.nextTracks == null) {
                sb.append(" nextTracks");
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
        }

        @Override // com.spotify.player.model.command.SetQueueCommand.Builder
        public SetQueueCommand.Builder loggingParams(LoggingParams loggingParams) {
            this.loggingParams = xul0.m92201d(loggingParams);
            return this;
        }

        @Override // com.spotify.player.model.command.SetQueueCommand.Builder
        public SetQueueCommand.Builder nextTracks(List<ContextTrack> list) {
            this.nextTracks = pf40.m69791p(list);
            return this;
        }

        @Override // com.spotify.player.model.command.SetQueueCommand.Builder
        public SetQueueCommand.Builder options(CommandOptions commandOptions) {
            this.options = xul0.m92201d(commandOptions);
            return this;
        }

        @Override // com.spotify.player.model.command.SetQueueCommand.Builder
        public SetQueueCommand.Builder prevTracks(List<ContextTrack> list) {
            this.prevTracks = pf40.m69791p(list);
            return this;
        }

        @Override // com.spotify.player.model.command.SetQueueCommand.Builder
        public SetQueueCommand.Builder queueRevision(String str) {
            if (str == null) {
                throw new NullPointerException("Null queueRevision");
            }
            this.queueRevision = str;
            return this;
        }

        public Builder(SetQueueCommand setQueueCommand) {
            C2244p5 c2244p5 = C2244p5.f174033a;
            this.options = c2244p5;
            this.loggingParams = c2244p5;
            this.queueRevision = setQueueCommand.queueRevision();
            this.prevTracks = setQueueCommand.prevTracks();
            this.nextTracks = setQueueCommand.nextTracks();
            this.options = setQueueCommand.options();
            this.loggingParams = setQueueCommand.loggingParams();
        }
    }
}
