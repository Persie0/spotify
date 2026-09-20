package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class vt90 extends yt90 {

    /* JADX INFO: renamed from: b */
    public final ArrayList f244580b;

    public vt90(ArrayList arrayList) {
        super(is90.f105196d);
        this.f244580b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vt90) && this.f244580b.equals(((vt90) obj).f244580b);
    }

    public final int hashCode() {
        return this.f244580b.hashCode() + (is90.f105196d.hashCode() * 31);
    }
}
