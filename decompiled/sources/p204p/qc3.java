package p204p;

import com.spotify.allboarding.entrypoint.EntryPoint;

/* JADX INFO: loaded from: classes3.dex */
public final class qc3 extends sc3 {

    /* JADX INFO: renamed from: a */
    public final EntryPoint f187244a;

    public qc3(EntryPoint entryPoint) {
        this.f187244a = entryPoint;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qc3) && this.f187244a == ((qc3) obj).f187244a;
    }

    public final int hashCode() {
        return this.f187244a.hashCode();
    }
}
