package p204p;

import com.spotify.betamax.transcoder.BetamaxTranscoderException;

/* JADX INFO: loaded from: classes10.dex */
public final class qy81 extends ty81 {

    /* JADX INFO: renamed from: a */
    public final BetamaxTranscoderException f193852a;

    public qy81(BetamaxTranscoderException betamaxTranscoderException) {
        this.f193852a = betamaxTranscoderException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qy81) && this.f193852a.equals(((qy81) obj).f193852a);
    }

    public final int hashCode() {
        return this.f193852a.hashCode();
    }
}
