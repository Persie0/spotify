package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ktl implements ktx {

    /* JADX INFO: renamed from: a */
    public final ArrayList f126355a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f126356b;

    public ktl(ArrayList arrayList, ArrayList arrayList2) {
        this.f126355a = arrayList;
        this.f126356b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ktl)) {
            return false;
        }
        ktl ktlVar = (ktl) obj;
        return this.f126355a.equals(ktlVar.f126355a) && this.f126356b.equals(ktlVar.f126356b);
    }

    public final int hashCode() {
        return this.f126356b.hashCode() + (this.f126355a.hashCode() * 31);
    }
}
