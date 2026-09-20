package p204p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: classes8.dex */
public final class bg81 {

    /* JADX INFO: renamed from: a */
    public final ContextTrack f26876a;

    /* JADX INFO: renamed from: b */
    public final v140 f26877b;

    /* JADX INFO: renamed from: c */
    public final v140 f26878c;

    /* JADX INFO: renamed from: d */
    public final thj f26879d;

    /* JADX INFO: renamed from: e */
    public final boolean f26880e;

    /* JADX INFO: renamed from: f */
    public final osj f26881f;

    /* JADX INFO: renamed from: g */
    public final boolean f26882g;

    /* JADX INFO: renamed from: h */
    public final bz31 f26883h;

    public bg81(ContextTrack contextTrack, v140 v140Var, v140 v140Var2, thj thjVar, boolean z, osj osjVar, boolean z2, bz31 bz31Var) {
        this.f26876a = contextTrack;
        this.f26877b = v140Var;
        this.f26878c = v140Var2;
        this.f26879d = thjVar;
        this.f26880e = z;
        this.f26881f = osjVar;
        this.f26882g = z2;
        this.f26883h = bz31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg81)) {
            return false;
        }
        bg81 bg81Var = (bg81) obj;
        return wj50.m88271j(this.f26876a, bg81Var.f26876a) && wj50.m88271j(this.f26877b, bg81Var.f26877b) && wj50.m88271j(this.f26878c, bg81Var.f26878c) && wj50.m88271j(this.f26879d, bg81Var.f26879d) && this.f26880e == bg81Var.f26880e && this.f26881f == bg81Var.f26881f && this.f26882g == bg81Var.f26882g && wj50.m88271j(this.f26883h, bg81Var.f26883h);
    }

    public final int hashCode() {
        return this.f26883h.hashCode() + s571.m77245d((this.f26881f.hashCode() + s571.m77245d((this.f26879d.f220443a.hashCode() + ((this.f26878c.hashCode() + ((this.f26877b.hashCode() + (this.f26876a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.f26880e)) * 31, 31, this.f26882g);
    }
}
