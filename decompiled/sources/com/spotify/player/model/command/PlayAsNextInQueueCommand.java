package com.spotify.player.model.command;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import java.util.Collections;
import java.util.List;
import p204p.pf40;
import p204p.xul0;

/* JADX INFO: loaded from: classes9.dex */
@JsonDeserialize
public abstract class PlayAsNextInQueueCommand implements Command {

    public static abstract class Builder {
        public static Builder builder() {
            return PlayAsNextInQueueCommand.builder(Collections.EMPTY_LIST);
        }

        public abstract PlayAsNextInQueueCommand build();

        public abstract Builder loggingParams(LoggingParams loggingParams);

        public abstract Builder options(CommandOptions commandOptions);

        public abstract Builder tracks(List<ContextTrack> list);
    }

    public static Builder builder(List<ContextTrack> list) {
        return new AutoValue_PlayAsNextInQueueCommand.Builder().tracks(list);
    }

    public static PlayAsNextInQueueCommand create(List<ContextTrack> list) {
        return builder(list).build();
    }

    public abstract xul0 loggingParams();

    public abstract xul0 options();

    public abstract Builder toBuilder();

    public abstract pf40 tracks();
}
