package p204p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class mw50 extends mnz {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Iterable f147714b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f147715c;

    public mw50(Iterable iterable, int i) {
        this.f147714b = iterable;
        this.f147715c = i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterable iterable = this.f147714b;
        boolean z = iterable instanceof List;
        int i = this.f147715c;
        if (z) {
            List list = (List) iterable;
            return list.subList(Math.min(list.size(), i), list.size()).iterator();
        }
        Iterator it = iterable.iterator();
        it.getClass();
        c95.m31844j(i >= 0, "numberToAdvance must be nonnegative");
        for (int i2 = 0; i2 < i && it.hasNext(); i2++) {
            it.next();
        }
        return new lw50(it);
    }
}
