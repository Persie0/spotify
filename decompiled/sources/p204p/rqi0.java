package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class rqi0 {
    /* JADX INFO: renamed from: a */
    public static final void m76249a(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            m76251c(i, size);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m76250b(int i, int i2, List list) {
        if (i > i2) {
            m76254f(i, i2);
        }
        if (i < 0) {
            m76252d(i);
        }
        if (i2 > list.size()) {
            m76253e(i2, list.size());
        }
    }

    /* JADX INFO: renamed from: c */
    private static final void m76251c(int i, int i2) {
        throw new IndexOutOfBoundsException(edb.m38560i(i, i2, "Index ", " is out of bounds. The list has ", " elements."));
    }

    /* JADX INFO: renamed from: d */
    private static final void m76252d(int i) {
        throw new IndexOutOfBoundsException(edb.m38563l("fromIndex (", i, ") is less than 0."));
    }

    /* JADX INFO: renamed from: e */
    private static final void m76253e(int i, int i2) {
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is more than than the list size (" + i2 + ')');
    }

    /* JADX INFO: renamed from: f */
    private static final void m76254f(int i, int i2) {
        throw new IllegalArgumentException(edb.m38560i(i, i2, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
    }
}
