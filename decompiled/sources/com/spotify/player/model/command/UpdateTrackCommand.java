package com.spotify.player.model.command;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: classes9.dex */
@JsonDeserialize
public abstract class UpdateTrackCommand implements Command {

    public static abstract class Builder {
        public static Builder builder() {
            return UpdateTrackCommand.builder(ContextTrack.create(""));
        }

        public abstract UpdateTrackCommand build();

        public abstract Builder track(ContextTrack contextTrack);
    }

    public static Builder builder(ContextTrack contextTrack) {
        return new AutoValue_UpdateTrackCommand.Builder().track(contextTrack);
    }

    public static UpdateTrackCommand create(ContextTrack contextTrack) {
        return builder(contextTrack).build();
    }

    public abstract Builder toBuilder();

    public abstract ContextTrack track();
}
