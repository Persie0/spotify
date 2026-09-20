package p204p;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e9f1 implements c2h1 {

    /* JADX INFO: renamed from: a */
    public static final s0f1 f57433a;

    /* JADX INFO: renamed from: b */
    public static final byte[] f57434b;

    /* JADX INFO: renamed from: c */
    public static final byte[] f57435c;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        b9f1 b9f1Var = b9f1.f24898a;
        c7f1 c7f1Var = c7f1.f34890b;
        map.put(b9f1Var, c7f1Var);
        map2.put(c7f1Var, b9f1Var);
        b9f1 b9f1Var2 = b9f1.f24899b;
        c7f1 c7f1Var2 = c7f1.f34891c;
        map.put(b9f1Var2, c7f1Var2);
        map2.put(c7f1Var2, b9f1Var2);
        b9f1 b9f1Var3 = b9f1.f24900c;
        c7f1 c7f1Var3 = c7f1.f34892d;
        map.put(b9f1Var3, c7f1Var3);
        map2.put(c7f1Var3, b9f1Var3);
        f57433a = new s0f1(11, Collections.unmodifiableMap(map), Collections.unmodifiableMap(map2));
        f57434b = new byte[0];
        f57435c = new byte[]{0};
    }
}
