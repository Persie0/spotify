package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum ei51 {
    /* JADX INFO: Fake field, exist only in values array */
    NONE("No additional details"),
    OS_VERSION(n5j.f150568a),
    CONNECT_NOT_ENABLED("Stream expansion via Connect is not enabled"),
    SOCIAL_SESSION_ROUTE("The route is part of a social session"),
    IS_A_JAM("The route is part of a Jam session");


    /* JADX INFO: renamed from: a */
    public final String f59797a;

    ei51(String str) {
        this.f59797a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f59797a;
    }
}
