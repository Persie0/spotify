package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
@rtz0
public final class oco {
    public static final nco Companion = new nco();

    /* JADX INFO: renamed from: b */
    public static final fr70[] f163966b = {q3d0.m72078I(2, iam.f100298d)};

    /* JADX INFO: renamed from: a */
    public final List f163967a;

    public /* synthetic */ oco(int i, List list) {
        if (1 == (i & 1)) {
            this.f163967a = list;
        } else {
            edo.m38617p(i, 1, mco.f142210a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oco) && wj50.m88271j(this.f163967a, ((oco) obj).f163967a);
    }

    public final int hashCode() {
        return this.f163967a.hashCode();
    }
}
