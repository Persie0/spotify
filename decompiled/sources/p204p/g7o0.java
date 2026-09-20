package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class g7o0 extends uv50 {

    /* JADX INFO: renamed from: c */
    public final String f77313c;

    public g7o0(String str) {
        super(2);
        this.f77313c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g7o0) && wj50.m88271j(this.f77313c, ((g7o0) obj).f77313c);
    }

    public final int hashCode() {
        return this.f77313c.hashCode();
    }

    public final String toString() {
        return dq60.m36617q(new StringBuilder("PlaceholderText(text="), this.f77313c, ')');
    }
}
