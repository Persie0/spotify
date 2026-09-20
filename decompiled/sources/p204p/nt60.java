package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class nt60 implements rt60 {

    /* JADX INFO: renamed from: a */
    public final String f157993a;

    public nt60(String str) {
        this.f157993a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nt60) && wj50.m88271j(this.f157993a, ((nt60) obj).f157993a);
    }

    public final int hashCode() {
        return this.f157993a.hashCode();
    }
}
