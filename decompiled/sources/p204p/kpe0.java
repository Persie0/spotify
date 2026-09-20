package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.CappingState;

/* JADX INFO: loaded from: classes8.dex */
public final class kpe0 {

    /* JADX INFO: renamed from: a */
    public final String f125049a;

    /* JADX INFO: renamed from: b */
    public final CappingState f125050b;

    static {
        CappingState.Companion companion = CappingState.INSTANCE;
    }

    public kpe0(String str, CappingState cappingState) {
        this.f125049a = str;
        this.f125050b = cappingState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (kpe0.class.equals(obj != null ? obj.getClass() : null)) {
            return wj50.m88271j(this.f125049a, ((kpe0) obj).f125049a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f125049a.hashCode();
    }
}
