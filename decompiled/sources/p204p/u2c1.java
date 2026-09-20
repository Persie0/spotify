package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class u2c1 implements b3c1 {

    /* JADX INFO: renamed from: a */
    public final Exception f226066a;

    public u2c1(Exception exc) {
        this.f226066a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u2c1) && this.f226066a.equals(((u2c1) obj).f226066a);
    }

    public final int hashCode() {
        return this.f226066a.hashCode();
    }
}
