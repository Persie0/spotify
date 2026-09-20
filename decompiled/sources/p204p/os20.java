package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class os20 implements ts20 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f168716a;

    public os20(ArrayList arrayList) {
        this.f168716a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof os20) && this.f168716a.equals(((os20) obj).f168716a);
    }

    public final int hashCode() {
        return this.f168716a.hashCode();
    }
}
