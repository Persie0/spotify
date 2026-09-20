package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class oju0 implements tju0 {

    /* JADX INFO: renamed from: a */
    public final String f166145a;

    public oju0(String str) {
        this.f166145a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oju0) && wj50.m88271j(this.f166145a, ((oju0) obj).f166145a);
    }

    public final int hashCode() {
        return this.f166145a.hashCode();
    }
}
