package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class r0m {

    /* JADX INFO: renamed from: a */
    public final int f194523a;

    /* JADX INFO: renamed from: b */
    public final Integer f194524b;

    public r0m(int i, Integer num) {
        this.f194523a = i;
        this.f194524b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0m)) {
            return false;
        }
        r0m r0mVar = (r0m) obj;
        return this.f194523a == r0mVar.f194523a && wj50.m88271j(this.f194524b, r0mVar.f194524b);
    }

    public final int hashCode() {
        int iM38547C = edb.m38547C(this.f194523a) * 31;
        Integer num = this.f194524b;
        return iM38547C + (num == null ? 0 : num.hashCode());
    }
}
