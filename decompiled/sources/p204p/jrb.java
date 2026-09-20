package p204p;

import androidx.compose.p002ui.geometry.Size;

/* JADX INFO: loaded from: classes.dex */
public final class jrb {

    /* JADX INFO: renamed from: a */
    public yqq f115127a;

    /* JADX INFO: renamed from: b */
    public ko70 f115128b;

    /* JADX INFO: renamed from: c */
    public wqb f115129c;

    /* JADX INFO: renamed from: d */
    public long f115130d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jrb)) {
            return false;
        }
        jrb jrbVar = (jrb) obj;
        return wj50.m88271j(this.f115127a, jrbVar.f115127a) && this.f115128b == jrbVar.f115128b && wj50.m88271j(this.f115129c, jrbVar.f115129c) && Size.m262c(this.f115130d, jrbVar.f115130d);
    }

    public final int hashCode() {
        return Long.hashCode(this.f115130d) + ((this.f115129c.hashCode() + ((this.f115128b.hashCode() + (this.f115127a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.f115127a + ", layoutDirection=" + this.f115128b + ", canvas=" + this.f115129c + ", size=" + ((Object) Size.m267h(this.f115130d)) + ')';
    }
}
