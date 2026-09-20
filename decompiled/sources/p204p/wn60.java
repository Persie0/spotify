package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class wn60 extends hqg1 {

    /* JADX INFO: renamed from: c */
    public final String f253079c;

    /* JADX INFO: renamed from: d */
    public final String f253080d;

    public wn60(String str, String str2) {
        this.f253079c = str;
        this.f253080d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wn60)) {
            return false;
        }
        wn60 wn60Var = (wn60) obj;
        return wj50.m88271j(this.f253079c, wn60Var.f253079c) && wj50.m88271j(this.f253080d, wn60Var.f253080d);
    }

    public final int hashCode() {
        return this.f253080d.hashCode() + (this.f253079c.hashCode() * 31);
    }

    public final String toString() {
        return this.f253079c + ':' + this.f253080d;
    }
}
