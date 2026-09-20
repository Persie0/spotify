package p204p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: classes2.dex */
public final class txo0 implements uxo0 {

    /* JADX INFO: renamed from: a */
    public final PlayerState f224742a;

    public txo0(PlayerState playerState) {
        this.f224742a = playerState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof txo0) && wj50.m88271j(this.f224742a, ((txo0) obj).f224742a);
    }

    public final int hashCode() {
        return this.f224742a.hashCode();
    }
}
