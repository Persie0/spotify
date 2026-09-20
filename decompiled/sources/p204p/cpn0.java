package p204p;

import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class cpn0 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final HashMap f40581a;

    public cpn0(HashMap map) {
        this.f40581a = map;
    }

    private final Object readResolve() {
        return new dpn0(this.f40581a);
    }
}
