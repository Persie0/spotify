package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class bu81 implements cu81 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f31057a;

    public bu81(ArrayList arrayList) {
        this.f31057a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bu81) && this.f31057a.equals(((bu81) obj).f31057a);
    }

    public final int hashCode() {
        return this.f31057a.hashCode();
    }
}
