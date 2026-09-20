package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class lu2 implements mu2 {

    /* JADX INFO: renamed from: a */
    public static final lu2 f136960a = new lu2();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof lu2);
    }

    @Override // p204p.mu2
    public final String getSessionId() {
        throw new IllegalStateException("Uninitialized session does not have a sessionId");
    }

    public final int hashCode() {
        return 543477918;
    }

    public final String toString() {
        return "Uninitialized";
    }
}
