package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class wil implements ktx {

    /* JADX INFO: renamed from: a */
    public final ArrayList f251679a;

    public wil(ArrayList arrayList) {
        this.f251679a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wil) && this.f251679a.equals(((wil) obj).f251679a);
    }

    public final int hashCode() {
        return this.f251679a.hashCode();
    }
}
