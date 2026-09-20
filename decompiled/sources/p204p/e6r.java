package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class e6r {

    /* JADX INFO: renamed from: a */
    public final ArrayList f56710a;

    /* JADX INFO: renamed from: b */
    public final String f56711b;

    public e6r(ArrayList arrayList, String str) {
        this.f56710a = arrayList;
        this.f56711b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6r)) {
            return false;
        }
        e6r e6rVar = (e6r) obj;
        return this.f56710a.equals(e6rVar.f56710a) && this.f56711b.equals(e6rVar.f56711b);
    }

    public final int hashCode() {
        return this.f56711b.hashCode() + (this.f56710a.hashCode() * 31);
    }
}
