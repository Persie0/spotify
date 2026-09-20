package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class gcm0 implements qfm0 {

    /* JADX INFO: renamed from: a */
    public final Map f78622a;

    public gcm0(Map map) {
        this.f78622a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gcm0) && wj50.m88271j(this.f78622a, ((gcm0) obj).f78622a);
    }

    public final int hashCode() {
        return this.f78622a.hashCode();
    }
}
