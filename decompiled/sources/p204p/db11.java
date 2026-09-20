package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class db11 {
    static {
        Float.floatToRawIntBits(3.0f);
        Float.floatToRawIntBits(3.0f);
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m35518a(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((cb11) list.get(i)).m32121a().m90561b()) {
                return true;
            }
        }
        return false;
    }
}
