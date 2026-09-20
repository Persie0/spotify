package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class l9v0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f131181a;

    /* JADX INFO: renamed from: b */
    public final pxj f131182b;

    public l9v0(ArrayList arrayList, pxj pxjVar) {
        this.f131181a = arrayList;
        this.f131182b = pxjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9v0)) {
            return false;
        }
        l9v0 l9v0Var = (l9v0) obj;
        return this.f131181a.equals(l9v0Var.f131181a) && this.f131182b == l9v0Var.f131182b;
    }

    public final int hashCode() {
        int iHashCode = this.f131181a.hashCode() * 31;
        pxj pxjVar = this.f131182b;
        return iHashCode + (pxjVar == null ? 0 : pxjVar.hashCode());
    }
}
