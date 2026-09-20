package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class v441 {

    /* JADX INFO: renamed from: a */
    public final rqd1 f237041a;

    /* JADX INFO: renamed from: b */
    public final List f237042b;

    public v441(rqd1 rqd1Var, List list) {
        this.f237041a = rqd1Var;
        this.f237042b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v441)) {
            return false;
        }
        v441 v441Var = (v441) obj;
        return wj50.m88271j(this.f237041a, v441Var.f237041a) && wj50.m88271j(this.f237042b, v441Var.f237042b);
    }

    public final int hashCode() {
        return this.f237042b.hashCode() + (this.f237041a.hashCode() * 31);
    }
}
