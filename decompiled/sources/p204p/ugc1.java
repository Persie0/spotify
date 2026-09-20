package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ugc1 implements hes0 {

    /* JADX INFO: renamed from: a */
    public final Object f230114a;

    public ugc1(List list) {
        this.f230114a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ugc1) && this.f230114a.equals(((ugc1) obj).f230114a);
    }

    public final int hashCode() {
        return this.f230114a.hashCode();
    }
}
