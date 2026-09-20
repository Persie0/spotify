package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class dmk0 {

    /* JADX INFO: renamed from: a */
    public static final Object[] f50555a = new Object[0];

    /* JADX INFO: renamed from: b */
    public static final jpi0 f50556b = new jpi0(0);

    /* JADX INFO: renamed from: a */
    public static final void m36418a(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            epv0.m39675K("Index " + i + " is out of bounds. The list has " + size + " elements.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m36419b(int i, int i2, List list) {
        int size = list.size();
        if (i > i2) {
            epv0.m39674J("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
            throw null;
        }
        if (i < 0) {
            epv0.m39675K("fromIndex (" + i + ") is less than 0.");
            throw null;
        }
        if (i2 <= size) {
            return;
        }
        epv0.m39675K("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
        throw null;
    }
}
