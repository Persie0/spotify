package p204p;

import com.spotify.player.model.PlayerError;

/* JADX INFO: loaded from: classes8.dex */
public final class sxo0 implements uxo0 {

    /* JADX INFO: renamed from: a */
    public final PlayerError f214953a;

    public sxo0(PlayerError playerError) {
        this.f214953a = playerError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sxo0) && wj50.m88271j(this.f214953a, ((sxo0) obj).f214953a);
    }

    public final int hashCode() {
        return this.f214953a.hashCode();
    }
}
