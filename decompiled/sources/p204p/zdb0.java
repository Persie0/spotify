package p204p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: classes8.dex */
public final class zdb0 implements qeb0 {

    /* JADX INFO: renamed from: a */
    public final ContextTrack f281671a;

    /* JADX INFO: renamed from: b */
    public final String f281672b;

    /* JADX INFO: renamed from: c */
    public final String f281673c;

    public zdb0(ContextTrack contextTrack, String str, String str2) {
        this.f281671a = contextTrack;
        this.f281672b = str;
        this.f281673c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zdb0)) {
            return false;
        }
        zdb0 zdb0Var = (zdb0) obj;
        return wj50.m88271j(this.f281671a, zdb0Var.f281671a) && wj50.m88271j(this.f281672b, zdb0Var.f281672b) && wj50.m88271j(this.f281673c, zdb0Var.f281673c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f281671a.hashCode() * 31, 31, this.f281672b);
        String str = this.f281673c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
