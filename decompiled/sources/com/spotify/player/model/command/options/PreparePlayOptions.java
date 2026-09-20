package com.spotify.player.model.command.options;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.player.model.AudioStream;
import com.spotify.player.model.Suppressions;
import java.util.Set;
import p204p.btv0;
import p204p.xf40;
import p204p.xul0;

/* JADX INFO: loaded from: classes2.dex */
@JsonDeserialize
public abstract class PreparePlayOptions {
    public static final PreparePlayOptions EMPTY = builder().build();

    /* JADX INFO: loaded from: classes9.dex */
    public static abstract class Builder {
        public static Builder builder() {
            return PreparePlayOptions.builder();
        }

        public abstract Builder alwaysPlaySomething(boolean z);

        public abstract Builder audioStream(AudioStream audioStream);

        public abstract PreparePlayOptions build();

        public abstract Builder configurationOverride(xf40 xf40Var);

        public abstract Builder initiallyPaused(boolean z);

        public abstract Builder license(String str);

        public abstract Builder playbackId(String str);

        public abstract Builder playerOptionsOverride(PlayerOptionOverrides playerOptionOverrides);

        public abstract Builder prefetchLevel(PrefetchLevel prefetchLevel);

        public abstract Builder seekTo(Long l);

        public abstract Builder seekToCreatorTimestamp(String str);

        public abstract Builder sessionId(String str);

        public abstract Builder skipTo(SkipToTrack skipToTrack);

        public abstract Builder suppressions(Suppressions suppressions);

        public Builder suppressions(Set<String> set) {
            return suppressions(Suppressions.create(set));
        }

        public abstract Builder systemInitiated(boolean z);
    }

    public static Builder builder() {
        return new AutoValue_PreparePlayOptions.Builder().configurationOverride(btv0.f30940g);
    }

    public abstract xul0 alwaysPlaySomething();

    public abstract xul0 audioStream();

    public abstract xf40 configurationOverride();

    public abstract xul0 initiallyPaused();

    public abstract xul0 license();

    public abstract xul0 playbackId();

    public abstract xul0 playerOptionsOverride();

    public abstract xul0 prefetchLevel();

    public abstract xul0 seekTo();

    public abstract xul0 seekToCreatorTimestamp();

    public abstract xul0 sessionId();

    public abstract xul0 skipTo();

    public abstract xul0 suppressions();

    public abstract xul0 systemInitiated();

    public abstract Builder toBuilder();
}
