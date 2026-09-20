package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@rtz0
public final class zsx {
    public static final ysx Companion = new ysx();

    /* JADX INFO: renamed from: b */
    public static final fr70[] f286011b = {q3d0.m72078I(2, tdv.f219507a1)};

    /* JADX INFO: renamed from: a */
    public final List f286012a;

    public /* synthetic */ zsx(int i, List list) {
        if ((i & 1) == 0) {
            this.f286012a = lau.f131415a;
        } else {
            this.f286012a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zsx) && wj50.m88271j(this.f286012a, ((zsx) obj).f286012a);
    }

    public final int hashCode() {
        return this.f286012a.hashCode();
    }
}
