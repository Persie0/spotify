package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class bw81 implements ew81 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f31584a;

    public bw81(ArrayList arrayList) {
        this.f31584a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bw81) && this.f31584a.equals(((bw81) obj).f31584a);
    }

    public final int hashCode() {
        return this.f31584a.hashCode();
    }
}
