package com.spotify.player.model.command;

import com.spotify.player.model.ContextTrack;
import p204p.s571;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_UpdateTrackCommand extends UpdateTrackCommand {
    private final ContextTrack track;

    public static final class Builder extends UpdateTrackCommand.Builder {
        private ContextTrack track;

        public Builder() {
        }

        @Override // com.spotify.player.model.command.UpdateTrackCommand.Builder
        public UpdateTrackCommand build() {
            ContextTrack contextTrack = this.track;
            if (contextTrack != null) {
                return new AutoValue_UpdateTrackCommand(0, contextTrack);
            }
            throw new IllegalStateException("Missing required properties: track");
        }

        @Override // com.spotify.player.model.command.UpdateTrackCommand.Builder
        public UpdateTrackCommand.Builder track(ContextTrack contextTrack) {
            if (contextTrack == null) {
                throw new NullPointerException("Null track");
            }
            this.track = contextTrack;
            return this;
        }

        public Builder(UpdateTrackCommand updateTrackCommand) {
            this.track = updateTrackCommand.track();
        }
    }

    public /* synthetic */ AutoValue_UpdateTrackCommand(int i, ContextTrack contextTrack) {
        this(contextTrack);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UpdateTrackCommand) {
            return this.track.equals(((UpdateTrackCommand) obj).track());
        }
        return false;
    }

    public int hashCode() {
        return this.track.hashCode() ^ 1000003;
    }

    @Override // com.spotify.player.model.command.UpdateTrackCommand
    public UpdateTrackCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return s571.m77251j("UpdateTrackCommand{track=", String.valueOf(this.track), "}");
    }

    @Override // com.spotify.player.model.command.UpdateTrackCommand
    public ContextTrack track() {
        return this.track;
    }

    private AutoValue_UpdateTrackCommand(ContextTrack contextTrack) {
        this.track = contextTrack;
    }
}
