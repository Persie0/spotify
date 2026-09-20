package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class dr8 implements kr8 {

    /* JADX INFO: renamed from: a */
    public final Object f52190a;

    public dr8(List list) {
        this.f52190a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dr8) && this.f52190a.equals(((dr8) obj).f52190a);
    }

    public final int hashCode() {
        return this.f52190a.hashCode();
    }
}
