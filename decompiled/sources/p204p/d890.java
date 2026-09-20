package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class d890 extends e890 {

    /* JADX INFO: renamed from: a */
    public final sco f46409a;

    public d890(sco scoVar) {
        this.f46409a = scoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d890.class != obj.getClass()) {
            return false;
        }
        return this.f46409a.equals(((d890) obj).f46409a);
    }

    public final int hashCode() {
        return this.f46409a.hashCode() + (d890.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f46409a + '}';
    }
}
