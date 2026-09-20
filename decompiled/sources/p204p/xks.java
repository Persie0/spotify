package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xks implements yks {

    /* JADX INFO: renamed from: a */
    public final String f262930a;

    public xks(String str) {
        this.f262930a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xks) && wj50.m88271j(this.f262930a, ((xks) obj).f262930a);
    }

    public final int hashCode() {
        return this.f262930a.hashCode();
    }
}
