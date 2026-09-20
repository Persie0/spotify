package p204p;

import com.spotify.esperanto.esperanto.Transport;

/* JADX INFO: loaded from: classes.dex */
public final class ld91 implements od91 {

    /* JADX INFO: renamed from: a */
    public final Transport f132104a;

    public ld91(Transport transport) {
        this.f132104a = transport;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ld91) && wj50.m88271j(this.f132104a, ((ld91) obj).f132104a);
    }

    public final int hashCode() {
        return this.f132104a.hashCode();
    }
}
