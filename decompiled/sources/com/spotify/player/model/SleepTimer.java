package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@JsonTypeInfo
public interface SleepTimer {

    public static class EndOfTrack implements SleepTimer {
        public static EndOfTrack create() {
            return new EndOfTrack();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass();
        }

        public int hashCode() {
            return getClass().hashCode();
        }
    }

    public static class None implements SleepTimer {
        public static None create() {
            return new None();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass();
        }

        public int hashCode() {
            return getClass().hashCode();
        }
    }

    public static class Timestamp implements SleepTimer {
        public long timestamp;

        public Timestamp(long j) {
            this.timestamp = j;
        }

        public static Timestamp create(long j) {
            return new Timestamp(j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.timestamp == ((Timestamp) obj).timestamp;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.timestamp));
        }
    }
}
