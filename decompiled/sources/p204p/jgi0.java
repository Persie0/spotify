package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class jgi0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f112196a;

    public jgi0(ArrayList arrayList) {
        this.f112196a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jgi0) && this.f112196a.equals(((jgi0) obj).f112196a);
    }

    public final int hashCode() {
        return this.f112196a.hashCode();
    }
}
