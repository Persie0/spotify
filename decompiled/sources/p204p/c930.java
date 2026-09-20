package p204p;

import com.spotify.jam.internal.socialconnect.models.RequestQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class c930 extends l930 {

    /* JADX INFO: renamed from: a */
    public final s160 f35377a;

    /* JADX INFO: renamed from: b */
    public final RequestQueue f35378b;

    public c930(s160 s160Var, RequestQueue requestQueue) {
        this.f35377a = s160Var;
        this.f35378b = requestQueue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c930)) {
            return false;
        }
        c930 c930Var = (c930) obj;
        return this.f35377a == c930Var.f35377a && wj50.m88271j(this.f35378b, c930Var.f35378b);
    }

    public final int hashCode() {
        int iHashCode = this.f35377a.hashCode() * 31;
        RequestQueue requestQueue = this.f35378b;
        return iHashCode + (requestQueue == null ? 0 : requestQueue.hashCode());
    }
}
