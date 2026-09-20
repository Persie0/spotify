package p204p;

import java.util.ArrayList;

/* JADX INFO: renamed from: p.mn */
/* JADX INFO: loaded from: classes4.dex */
public final class C2133mn implements InterfaceC2183nn {

    /* JADX INFO: renamed from: a */
    public final ArrayList f145291a;

    public C2133mn(ArrayList arrayList) {
        this.f145291a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2133mn) && this.f145291a.equals(((C2133mn) obj).f145291a);
    }

    public final int hashCode() {
        return this.f145291a.hashCode();
    }
}
