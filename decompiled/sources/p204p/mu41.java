package p204p;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class mu41 {

    /* JADX INFO: renamed from: a */
    public static final HashMap f147250a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ mu41[] f147251b;

    /* JADX INFO: Fake field, exist only in values array */
    mu41 EF0;

    static {
        mu41 mu41Var = new mu41("NONE", 0);
        mu41 mu41Var2 = new mu41("CHAIN", 1);
        mu41 mu41Var3 = new mu41("ALIGNED", 2);
        f147251b = new mu41[]{mu41Var, mu41Var2, mu41Var3};
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        f147250a = map2;
        map.put("none", mu41Var);
        map.put("chain", mu41Var2);
        map.put("aligned", mu41Var3);
        dq60.m36623w(0, map2, "none", 3, "chain");
        map2.put("aligned", 2);
    }

    public static mu41 valueOf(String str) {
        return (mu41) Enum.valueOf(mu41.class, str);
    }

    public static mu41[] values() {
        return (mu41[]) f147251b.clone();
    }
}
