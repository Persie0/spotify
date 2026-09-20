package p204p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: classes8.dex */
public final class o0x implements v2x {

    /* JADX INFO: renamed from: a */
    public final ContextTrack f160529a;

    /* JADX INFO: renamed from: b */
    public final boolean f160530b;

    /* JADX INFO: renamed from: c */
    public final boolean f160531c;

    /* JADX INFO: renamed from: d */
    public final boolean f160532d;

    /* JADX INFO: renamed from: e */
    public final boolean f160533e;

    /* JADX INFO: renamed from: f */
    public final boolean f160534f;

    /* JADX INFO: renamed from: g */
    public final jk81 f160535g;

    /* JADX INFO: renamed from: h */
    public final String f160536h;

    public o0x(ContextTrack contextTrack, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, jk81 jk81Var, String str) {
        this.f160529a = contextTrack;
        this.f160530b = z;
        this.f160531c = z2;
        this.f160532d = z3;
        this.f160533e = z4;
        this.f160534f = z5;
        this.f160535g = jk81Var;
        this.f160536h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0x)) {
            return false;
        }
        o0x o0xVar = (o0x) obj;
        return this.f160529a.equals(o0xVar.f160529a) && this.f160530b == o0xVar.f160530b && this.f160531c == o0xVar.f160531c && this.f160532d == o0xVar.f160532d && this.f160533e == o0xVar.f160533e && this.f160534f == o0xVar.f160534f && wj50.m88271j(this.f160535g, o0xVar.f160535g) && wj50.m88271j(this.f160536h, o0xVar.f160536h);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(this.f160529a.hashCode() * 31, 31, this.f160530b), 31, this.f160531c), 31, this.f160532d), 31, this.f160533e), 31, this.f160534f);
        jk81 jk81Var = this.f160535g;
        int iHashCode = (iM77245d + (jk81Var == null ? 0 : jk81Var.hashCode())) * 31;
        String str = this.f160536h;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
