package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

/* JADX INFO: loaded from: classes9.dex */
@JsonTypeInfo
public abstract class TimerType {

    public static abstract class Clear extends TimerType {
        public static Clear create() {
            return TimerType.clear();
        }
    }

    public static abstract class Duration extends TimerType {
        public static Duration create(long j) {
            return TimerType.duration(j);
        }

        public abstract long durationSeconds();
    }

    public static abstract class EndOfTrack extends TimerType {
        public static EndOfTrack create() {
            return TimerType.endOfTrack();
        }
    }

    public static Clear clear() {
        return new AutoValue_TimerType_Clear();
    }

    public static Duration duration(long j) {
        return new AutoValue_TimerType_Duration(j);
    }

    public static EndOfTrack endOfTrack() {
        return new AutoValue_TimerType_EndOfTrack();
    }
}
