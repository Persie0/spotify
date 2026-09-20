package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class bfm0 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final int f26744a;

    public bfm0(int i) {
        this.f26744a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bfm0) && this.f26744a == ((bfm0) obj).f26744a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f26744a);
    }
}
