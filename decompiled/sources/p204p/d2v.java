package p204p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: classes9.dex */
public final class d2v {

    /* JADX INFO: renamed from: a */
    public final PlayerState f44673a;

    /* JADX INFO: renamed from: b */
    public final wb50 f44674b;

    public d2v(PlayerState playerState, wb50 wb50Var) {
        this.f44673a = playerState;
        this.f44674b = wb50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2v)) {
            return false;
        }
        d2v d2vVar = (d2v) obj;
        return wj50.m88271j(this.f44673a, d2vVar.f44673a) && wj50.m88271j(this.f44674b, d2vVar.f44674b);
    }

    public final int hashCode() {
        return this.f44674b.hashCode() + (this.f44673a.hashCode() * 31);
    }
}
