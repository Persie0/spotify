package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
public final class hgx0 {

    /* JADX INFO: renamed from: a */
    public final View f91234a;

    public hgx0(View view) {
        this.f91234a = view;
    }

    public final boolean equals(Object obj) {
        Object obj2 = 10000L;
        if (this == obj) {
            return true;
        }
        return (obj instanceof hgx0) && wj50.m88271j(this.f91234a, ((hgx0) obj).f91234a) && obj2.equals(obj2);
    }

    public final int hashCode() {
        Long l = 10000L;
        return l.hashCode() + mt60.m62800g(0, s571.m77245d(f710.m40938f(1, this.f91234a.hashCode() * 31, 31), 31, false), 31);
    }
}
