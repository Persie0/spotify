package p204p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: classes8.dex */
public final class dh81 {

    /* JADX INFO: renamed from: a */
    public final ContextTrack f49016a;

    /* JADX INFO: renamed from: b */
    public final osj f49017b;

    /* JADX INFO: renamed from: c */
    public final boolean f49018c;

    /* JADX INFO: renamed from: d */
    public final rqi f49019d;

    public dh81(ContextTrack contextTrack, osj osjVar, boolean z, rqi rqiVar) {
        this.f49016a = contextTrack;
        this.f49017b = osjVar;
        this.f49018c = z;
        this.f49019d = rqiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh81)) {
            return false;
        }
        dh81 dh81Var = (dh81) obj;
        return wj50.m88271j(this.f49016a, dh81Var.f49016a) && this.f49017b == dh81Var.f49017b && this.f49018c == dh81Var.f49018c && wj50.m88271j(this.f49019d, dh81Var.f49019d);
    }

    public final int hashCode() {
        return this.f49019d.hashCode() + s571.m77245d((this.f49017b.hashCode() + (this.f49016a.hashCode() * 31)) * 31, 31, this.f49018c);
    }
}
