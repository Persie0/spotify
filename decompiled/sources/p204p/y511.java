package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class y511 implements ktx {

    /* JADX INFO: renamed from: a */
    public final ArrayList f269306a;

    public y511(ArrayList arrayList) {
        this.f269306a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y511) && this.f269306a.equals(((y511) obj).f269306a);
    }

    public final int hashCode() {
        return this.f269306a.hashCode();
    }
}
