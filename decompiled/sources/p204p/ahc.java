package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ahc extends uv50 {

    /* JADX INFO: renamed from: c */
    public final String f15666c;

    public ahc(String str) {
        super(1);
        this.f15666c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ahc) && wj50.m88271j(this.f15666c, ((ahc) obj).f15666c);
    }

    public final int hashCode() {
        return this.f15666c.hashCode();
    }

    public final String toString() {
        return dq60.m36617q(new StringBuilder("CategoryTitle(title="), this.f15666c, ')');
    }
}
