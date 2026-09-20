package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class lfz0 {

    /* JADX INFO: renamed from: a */
    public final List f133027a;

    /* JADX INFO: renamed from: b */
    public final String f133028b;

    /* JADX INFO: renamed from: c */
    public final long f133029c;

    public lfz0(long j, String str, List list) {
        this.f133027a = list;
        this.f133028b = str;
        this.f133029c = j;
    }

    /* JADX INFO: renamed from: a */
    public final whj m58921a() {
        return this.f133029c > 600000 ? whj.f251359a : whj.f251360b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lfz0)) {
            return false;
        }
        lfz0 lfz0Var = (lfz0) obj;
        return wj50.m88271j(this.f133027a, lfz0Var.f133027a) && wj50.m88271j(this.f133028b, lfz0Var.f133028b) && this.f133029c == lfz0Var.f133029c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f133029c) + s571.m77243b(this.f133027a.hashCode() * 31, 31, this.f133028b);
    }
}
