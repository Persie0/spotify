package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class yl61 implements mn61 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f273925a;

    public yl61(ArrayList arrayList) {
        this.f273925a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yl61) && this.f273925a.equals(((yl61) obj).f273925a);
    }

    public final int hashCode() {
        return this.f273925a.hashCode();
    }
}
