package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class izy0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f107306a;

    public izy0(ArrayList arrayList) {
        this.f107306a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof izy0) && this.f107306a.equals(((izy0) obj).f107306a);
    }

    public final int hashCode() {
        return this.f107306a.hashCode();
    }
}
