package p204p;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class j68 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f109238a;

    public /* synthetic */ j68(int i) {
        this.f109238a = i;
    }

    /* JADX INFO: renamed from: a */
    public final Set m52531a() {
        switch (this.f109238a) {
            case 0:
                HashSet hashSet = new HashSet(1);
                Object obj = new Object[]{'<'}[0];
                Objects.requireNonNull(obj);
                if (hashSet.add(obj)) {
                    return Collections.unmodifiableSet(hashSet);
                }
                throw new IllegalArgumentException(klh.m56833e(obj, "duplicate element: "));
            case 1:
                HashSet hashSet2 = new HashSet(1);
                Object obj2 = new Object[]{'\\'}[0];
                Objects.requireNonNull(obj2);
                if (hashSet2.add(obj2)) {
                    return Collections.unmodifiableSet(hashSet2);
                }
                throw new IllegalArgumentException(klh.m56833e(obj2, "duplicate element: "));
            case 2:
                HashSet hashSet3 = new HashSet(1);
                Object obj3 = new Object[]{'`'}[0];
                Objects.requireNonNull(obj3);
                if (hashSet3.add(obj3)) {
                    return Collections.unmodifiableSet(hashSet3);
                }
                throw new IllegalArgumentException(klh.m56833e(obj3, "duplicate element: "));
            case 3:
                HashSet hashSet4 = new HashSet(1);
                Object obj4 = new Object[]{'&'}[0];
                Objects.requireNonNull(obj4);
                if (hashSet4.add(obj4)) {
                    return Collections.unmodifiableSet(hashSet4);
                }
                throw new IllegalArgumentException(klh.m56833e(obj4, "duplicate element: "));
            default:
                HashSet hashSet5 = new HashSet(1);
                Object obj5 = new Object[]{'<'}[0];
                Objects.requireNonNull(obj5);
                if (hashSet5.add(obj5)) {
                    return Collections.unmodifiableSet(hashSet5);
                }
                throw new IllegalArgumentException(klh.m56833e(obj5, "duplicate element: "));
        }
    }
}
