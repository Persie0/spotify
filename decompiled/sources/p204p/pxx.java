package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class pxx {

    /* JADX INFO: renamed from: a */
    public final boolean f183270a;

    /* JADX INFO: renamed from: b */
    public final boolean f183271b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f183272c;

    public pxx(ArrayList arrayList, boolean z, boolean z2) {
        this.f183270a = z;
        this.f183271b = z2;
        this.f183272c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxx)) {
            return false;
        }
        pxx pxxVar = (pxx) obj;
        return this.f183270a == pxxVar.f183270a && this.f183271b == pxxVar.f183271b && this.f183272c.equals(pxxVar.f183272c);
    }

    public final int hashCode() {
        return this.f183272c.hashCode() + s571.m77245d(Boolean.hashCode(this.f183270a) * 31, 31, this.f183271b);
    }
}
