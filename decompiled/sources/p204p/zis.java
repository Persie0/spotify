package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@rtz0
public final class zis {
    public static final yis Companion = new yis();

    /* JADX INFO: renamed from: d */
    public static final fr70[] f283234d = {q3d0.m72078I(2, v8s.f238674e), null, null};

    /* JADX INFO: renamed from: a */
    public final List f283235a;

    /* JADX INFO: renamed from: b */
    public final String f283236b;

    /* JADX INFO: renamed from: c */
    public final boolean f283237c;

    public /* synthetic */ zis(int i, String str, List list, boolean z) {
        if (7 != (i & 7)) {
            edo.m38617p(i, 7, xis.f261934a.getDescriptor());
            throw null;
        }
        this.f283235a = list;
        this.f283236b = str;
        this.f283237c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zis)) {
            return false;
        }
        zis zisVar = (zis) obj;
        return wj50.m88271j(this.f283235a, zisVar.f283235a) && wj50.m88271j(this.f283236b, zisVar.f283236b) && this.f283237c == zisVar.f283237c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f283237c) + s571.m77243b(this.f283235a.hashCode() * 31, 31, this.f283236b);
    }
}
