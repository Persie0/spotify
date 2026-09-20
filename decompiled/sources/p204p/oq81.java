package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class oq81 implements ktx {

    /* JADX INFO: renamed from: a */
    public final ArrayList f168135a;

    public oq81(ArrayList arrayList) {
        this.f168135a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oq81) && this.f168135a.equals(((oq81) obj).f168135a);
    }

    public final int hashCode() {
        return this.f168135a.hashCode();
    }
}
