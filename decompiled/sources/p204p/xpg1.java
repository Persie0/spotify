package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class xpg1 {

    /* JADX INFO: renamed from: a */
    public final String f264635a;

    /* JADX INFO: renamed from: b */
    public final String f264636b;

    public xpg1(String str, String str2) {
        this.f264635a = str;
        this.f264636b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xpg1) {
            xpg1 xpg1Var = (xpg1) obj;
            if (this.f264635a.equals(xpg1Var.f264635a) && this.f264636b.equals(xpg1Var.f264636b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f264635a.hashCode() ^ 1000003) * 1000003) ^ this.f264636b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClientQueueEntry{mediaId=");
        sb.append(this.f264635a);
        sb.append(", entryId=");
        return dq60.m36616p(this.f264636b, "}", sb);
    }
}
