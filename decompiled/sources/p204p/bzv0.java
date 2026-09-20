package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class bzv0 implements ktx {

    /* JADX INFO: renamed from: a */
    public final ArrayList f32603a;

    public bzv0(ArrayList arrayList) {
        this.f32603a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bzv0) && this.f32603a.equals(((bzv0) obj).f32603a);
    }

    public final int hashCode() {
        return this.f32603a.hashCode();
    }
}
