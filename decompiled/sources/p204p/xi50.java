package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class xi50 implements zi50 {

    /* JADX INFO: renamed from: a */
    public final boolean f261767a;

    public xi50(boolean z) {
        this.f261767a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xi50) && this.f261767a == ((xi50) obj).f261767a;
    }

    @Override // p204p.zi50
    public final String getName() {
        return "local_playback_provider_state_changed";
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f261767a);
    }
}
