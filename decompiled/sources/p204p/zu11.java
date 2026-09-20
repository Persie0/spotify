package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class zu11 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f286320a;

    public zu11(ArrayList arrayList) {
        this.f286320a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zu11) && this.f286320a.equals(((zu11) obj).f286320a);
    }

    public final int hashCode() {
        return this.f286320a.hashCode();
    }
}
