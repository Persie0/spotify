package p204p;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class mt60 {
    public static int[] _values() {
        return edb.m38551G(18);
    }

    /* JADX INFO: renamed from: a */
    public static final String m62794a(int i) {
        if (i == 1) {
            return "normal";
        }
        if (i == 2) {
            return "deeplink_with_item";
        }
        if (i == 3) {
            return "deeplink_without_item";
        }
        if (i == 4) {
            return "deeplink_item_not_found";
        }
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public static final int m62795b(int i) {
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 2) {
            return 15;
        }
        if (iM38547C == 3) {
            return 16;
        }
        if (iM38547C == 4) {
            return 17;
        }
        if (iM38547C != 5) {
            return iM38547C != 16 ? 0 : 13;
        }
        return 18;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m62796c(int i) {
        if (i == 1) {
            return "podcast_scroll_npv";
        }
        if (i == 2) {
            return "music_npv";
        }
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m62797d(int i) {
        if (i == 1) {
            return "podcast_scroll_npv";
        }
        if (i == 2) {
            return "music_npv";
        }
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m62798e(int i) {
        if (i == 1) {
            return "network";
        }
        if (i == 2) {
            return "memory_cache";
        }
        if (i == 3) {
            return "http_cache";
        }
        if (i == 4) {
            return "stale_http_cache";
        }
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ String m62799f(int i) {
        if (i == 1) {
            return "success";
        }
        if (i == 2) {
            return "empty";
        }
        if (i == 3) {
            return "error";
        }
        if (i == 4) {
            return "invalid";
        }
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public static int m62800g(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    /* JADX INFO: renamed from: h */
    public static KotlinNothingValueException m62801h(String str) {
        pt40.m70892b(str);
        return new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: i */
    public static m49 m62802i(o49 o49Var, o49 o49Var2, gh00 gh00Var) {
        o49Var.getClass();
        return new m49(o49Var2, gh00Var);
    }

    /* JADX INFO: renamed from: j */
    public static c6a1 m62803j(o49 o49Var, o49 o49Var2) {
        o49Var.getClass();
        return new c6a1(o49Var2);
    }

    /* JADX INFO: renamed from: k */
    public static void m62804k(int i, int i2, int i3, int i4, int i5) {
        bga.m29083e(i);
        bga.m29083e(i2);
        bga.m29083e(i3);
        bga.m29083e(i4);
        bga.m29083e(i5);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m62805l(Object obj) {
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: m */
    public static void m62806m(cxh0 cxh0Var, float f, xq00 xq00Var, boolean z) {
        riw0.m75615i(xq00Var, mi21.m61838v(f, cxh0Var));
        xq00Var.m91788r(z);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ boolean m62807n(AtomicReference atomicReference) {
        c6a0 c6a0Var;
        do {
            c6a0Var = c6a0.f34468b;
            if (atomicReference.compareAndSet(c6a0Var, c6a0.f34469c)) {
                return true;
            }
        } while (atomicReference.get() == c6a0Var);
        return false;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ boolean m62808o(AtomicReference atomicReference) {
        c6a0 c6a0Var;
        do {
            c6a0Var = c6a0.f34468b;
            if (atomicReference.compareAndSet(c6a0Var, c6a0.f34470d)) {
                return true;
            }
        } while (atomicReference.get() == c6a0Var);
        return false;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ String m62809p(int i) {
        if (i == 1) {
            return "Measuring";
        }
        if (i == 2) {
            return "LookaheadMeasuring";
        }
        if (i == 3) {
            return "LayingOut";
        }
        if (i != 4) {
            return i != 5 ? "null" : "Idle";
        }
        return "LookaheadLayingOut";
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ String m62810q(int i) {
        if (i == 1) {
            return "Wrap";
        }
        if (i == 2) {
            return "Fixed";
        }
        if (i != 3) {
            return i != 4 ? "null" : "MatchParent";
        }
        return "Expand";
    }
}
