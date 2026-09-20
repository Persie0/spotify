package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class yhu extends AbstractC1806e9 {

    /* JADX INFO: renamed from: c */
    public final int f272973c;

    public yhu(int i) {
        super(new qju(i), 7);
        this.f272973c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yhu) && this.f272973c == ((yhu) obj).f272973c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f272973c);
    }

    @Override // p204p.AbstractC1806e9
    public final String toString() {
        return "Contrasting(colorSet=" + yds.m93469F(this.f272973c) + ")";
    }
}
