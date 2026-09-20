package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class gtq0 extends jjf1 {

    /* JADX INFO: renamed from: d */
    public final ArrayList f84258d;

    public gtq0(ArrayList arrayList) {
        this.f84258d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gtq0) && this.f84258d.equals(((gtq0) obj).f84258d);
    }

    public final int hashCode() {
        return this.f84258d.hashCode();
    }
}
