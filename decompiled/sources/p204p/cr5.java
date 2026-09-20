package p204p;

import com.spotify.player.model.ErrorType;

/* JADX INFO: loaded from: classes4.dex */
public final class cr5 extends er5 {

    /* JADX INFO: renamed from: a */
    public final ErrorType f41190a;

    public cr5(ErrorType errorType) {
        this.f41190a = errorType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cr5) && this.f41190a == ((cr5) obj).f41190a;
    }

    public final int hashCode() {
        return this.f41190a.hashCode();
    }
}
