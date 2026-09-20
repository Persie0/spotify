package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class fnm0 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final String f71323a;

    public fnm0(String str) {
        this.f71323a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fnm0) && wj50.m88271j(this.f71323a, ((fnm0) obj).f71323a);
    }

    public final int hashCode() {
        return this.f71323a.hashCode();
    }
}
