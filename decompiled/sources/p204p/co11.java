package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class co11 implements fo11 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f40150a;

    public co11(ArrayList arrayList) {
        this.f40150a = arrayList;
    }

    @Override // p204p.fo11
    /* JADX INFO: renamed from: a */
    public final List mo33479a() {
        return this.f40150a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof co11) && this.f40150a.equals(((co11) obj).f40150a);
    }

    public final int hashCode() {
        return this.f40150a.hashCode();
    }
}
