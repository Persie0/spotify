package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class b890 extends e890 {

    /* JADX INFO: renamed from: a */
    public final sco f24525a;

    public b890(sco scoVar) {
        this.f24525a = scoVar;
    }

    /* JADX INFO: renamed from: b */
    public final sco m28421b() {
        return this.f24525a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b890.class != obj.getClass()) {
            return false;
        }
        return this.f24525a.equals(((b890) obj).f24525a);
    }

    public final int hashCode() {
        return this.f24525a.hashCode() + (b890.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f24525a + '}';
    }

    public b890() {
        this(sco.f207772b);
    }
}
