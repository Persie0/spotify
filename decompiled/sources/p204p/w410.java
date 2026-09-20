package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@rtz0
public final class w410 {
    public static final v410 Companion = new v410();

    /* JADX INFO: renamed from: b */
    public static final fr70[] f247674b = {q3d0.m72078I(2, u410.f226548b)};

    /* JADX INFO: renamed from: a */
    public final List f247675a;

    public w410() {
        this.f247675a = lau.f131415a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w410) && wj50.m88271j(this.f247675a, ((w410) obj).f247675a);
    }

    public final int hashCode() {
        return this.f247675a.hashCode();
    }

    public /* synthetic */ w410(int i, List list) {
        if (1 == (i & 1)) {
            this.f247675a = list;
        } else {
            edo.m38617p(i, 1, t410.f216875a.getDescriptor());
            throw null;
        }
    }
}
