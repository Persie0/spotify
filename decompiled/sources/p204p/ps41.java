package p204p;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ps41 {

    /* JADX INFO: renamed from: a */
    public static final ps41 f180744a;

    /* JADX INFO: renamed from: b */
    public static final ps41 f180745b;

    /* JADX INFO: renamed from: c */
    public static final ps41 f180746c;

    /* JADX INFO: renamed from: d */
    public static final HashMap f180747d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ ps41[] f180748e;

    static {
        ps41 ps41Var = new ps41("SPREAD", 0);
        f180744a = ps41Var;
        ps41 ps41Var2 = new ps41("SPREAD_INSIDE", 1);
        f180745b = ps41Var2;
        ps41 ps41Var3 = new ps41("PACKED", 2);
        f180746c = ps41Var3;
        f180748e = new ps41[]{ps41Var, ps41Var2, ps41Var3};
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        f180747d = map2;
        map.put("packed", ps41Var3);
        map.put("spread_inside", ps41Var2);
        map.put("spread", ps41Var);
        dq60.m36623w(2, map2, "packed", 1, "spread_inside");
        map2.put("spread", 0);
    }

    /* JADX INFO: renamed from: a */
    public static int m70759a(String str) {
        HashMap map = f180747d;
        if (map.containsKey(str)) {
            return ((Integer) map.get(str)).intValue();
        }
        return -1;
    }

    public static ps41 valueOf(String str) {
        return (ps41) Enum.valueOf(ps41.class, str);
    }

    public static ps41[] values() {
        return (ps41[]) f180748e.clone();
    }
}
