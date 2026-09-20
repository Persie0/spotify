package p204p;

import android.net.NetworkRequest;

/* JADX INFO: loaded from: classes.dex */
public final class thj0 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f220444b = 0;

    /* JADX INFO: renamed from: a */
    public final Object f220445a;

    static {
        gaz.m44194g("NetworkRequestCompat");
    }

    public thj0(NetworkRequest networkRequest) {
        this.f220445a = networkRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof thj0) && wj50.m88271j(this.f220445a, ((thj0) obj).f220445a);
    }

    public final int hashCode() {
        Object obj = this.f220445a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "NetworkRequestCompat(wrapped=" + this.f220445a + ')';
    }
}
