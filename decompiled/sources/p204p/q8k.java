package p204p;

import com.spotify.player.model.command.PlayCommand;

/* JADX INFO: loaded from: classes9.dex */
public final class q8k implements f0b {

    /* JADX INFO: renamed from: a */
    public final PlayCommand f186331a;

    public q8k(PlayCommand playCommand) {
        this.f186331a = playCommand;
    }

    /* JADX INFO: renamed from: a */
    public final PlayCommand m72335a() {
        return this.f186331a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q8k) && wj50.m88271j(this.f186331a, ((q8k) obj).f186331a);
    }

    public final int hashCode() {
        return this.f186331a.hashCode();
    }
}
