package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class lqh implements yqh {

    /* JADX INFO: renamed from: a */
    public final Object f136050a;

    public lqh(List list) {
        this.f136050a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lqh) && this.f136050a.equals(((lqh) obj).f136050a);
    }

    public final int hashCode() {
        return this.f136050a.hashCode();
    }
}
