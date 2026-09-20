package p204p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: classes2.dex */
public final class fcp0 {

    /* JADX INFO: renamed from: a */
    public final String f68220a;

    /* JADX INFO: renamed from: b */
    public final ContextTrack f68221b;

    /* JADX INFO: renamed from: c */
    public final String f68222c;

    /* JADX INFO: renamed from: d */
    public final String f68223d;

    /* JADX INFO: renamed from: e */
    public final boolean f68224e;

    public fcp0(String str, ContextTrack contextTrack, String str2, String str3, boolean z) {
        this.f68220a = str;
        this.f68221b = contextTrack;
        this.f68222c = str2;
        this.f68223d = str3;
        this.f68224e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fcp0)) {
            return false;
        }
        fcp0 fcp0Var = (fcp0) obj;
        return wj50.m88271j(this.f68220a, fcp0Var.f68220a) && wj50.m88271j(this.f68221b, fcp0Var.f68221b) && wj50.m88271j(this.f68222c, fcp0Var.f68222c) && wj50.m88271j(this.f68223d, fcp0Var.f68223d) && this.f68224e == fcp0Var.f68224e;
    }

    public final int hashCode() {
        String str = this.f68220a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ContextTrack contextTrack = this.f68221b;
        return Boolean.hashCode(this.f68224e) + s571.m77243b(s571.m77243b((iHashCode + (contextTrack != null ? contextTrack.hashCode() : 0)) * 31, 31, this.f68222c), 31, this.f68223d);
    }
}
