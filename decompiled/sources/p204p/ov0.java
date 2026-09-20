package p204p;

import com.spotify.adsinternal.adscore.model.Format;

/* JADX INFO: loaded from: classes.dex */
public final class ov0 {

    /* JADX INFO: renamed from: a */
    public final int f170380a;

    /* JADX INFO: renamed from: b */
    public final Format f170381b;

    /* JADX INFO: renamed from: c */
    public final fh0 f170382c;

    /* JADX INFO: renamed from: d */
    public final String f170383d;

    public ov0(int i, Format format, fh0 fh0Var, String str) {
        this.f170380a = i;
        this.f170381b = format;
        this.f170382c = fh0Var;
        this.f170383d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ov0)) {
            return false;
        }
        ov0 ov0Var = (ov0) obj;
        return this.f170380a == ov0Var.f170380a && this.f170381b == ov0Var.f170381b && this.f170382c.equals(ov0Var.f170382c) && wj50.m88271j(this.f170383d, ov0Var.f170383d);
    }

    public final int hashCode() {
        return this.f170383d.hashCode() + ((this.f170382c.hashCode() + ((this.f170381b.hashCode() + (edb.m38547C(this.f170380a) * 31)) * 31)) * 31);
    }
}
