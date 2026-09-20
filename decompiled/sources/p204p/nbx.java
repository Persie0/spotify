package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class nbx extends gcx {

    /* JADX INFO: renamed from: a */
    public final ArrayList f152370a;

    public nbx(ArrayList arrayList) {
        this.f152370a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nbx) && this.f152370a.equals(((nbx) obj).f152370a);
    }

    public final int hashCode() {
        return this.f152370a.hashCode();
    }
}
