package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes10.dex */
public final class jpe extends tag1 {

    /* JADX INFO: renamed from: c */
    public final Uri f114630c;

    /* JADX INFO: renamed from: d */
    public final fq01 f114631d;

    /* JADX INFO: renamed from: e */
    public final qf40 f114632e;

    static {
        wg61 wg61Var = fq01.f72032c;
    }

    public jpe(Uri uri, fq01 fq01Var, qf40 qf40Var) {
        this.f114630c = uri;
        this.f114631d = fq01Var;
        this.f114632e = qf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpe)) {
            return false;
        }
        jpe jpeVar = (jpe) obj;
        return wj50.m88271j(this.f114630c, jpeVar.f114630c) && wj50.m88271j(this.f114631d, jpeVar.f114631d) && wj50.m88271j(this.f114632e, jpeVar.f114632e);
    }

    public final int hashCode() {
        return this.f114632e.hashCode() + ((this.f114631d.hashCode() + (this.f114630c.hashCode() * 31)) * 31);
    }
}
