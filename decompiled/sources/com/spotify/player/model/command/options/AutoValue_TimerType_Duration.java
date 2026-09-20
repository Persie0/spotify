package com.spotify.player.model.command.options;

import p204p.edb;

/* JADX INFO: loaded from: classes9.dex */
final class AutoValue_TimerType_Duration extends TimerType.Duration {
    private final long durationSeconds;

    public AutoValue_TimerType_Duration(long j) {
        this.durationSeconds = j;
    }

    @Override // com.spotify.player.model.command.options.TimerType.Duration
    public long durationSeconds() {
        return this.durationSeconds;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof TimerType.Duration) && this.durationSeconds == ((TimerType.Duration) obj).durationSeconds();
    }

    public int hashCode() {
        long j = this.durationSeconds;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public String toString() {
        return edb.m38562k(this.durationSeconds, "Duration{durationSeconds=", "}");
    }
}
