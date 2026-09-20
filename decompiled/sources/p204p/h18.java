package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class h18 {

    /* JADX INFO: renamed from: a */
    public final String f86526a;

    /* JADX INFO: renamed from: b */
    public final String f86527b;

    public h18(String str, String str2) {
        this.f86526a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f86527b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h18) {
            h18 h18Var = (h18) obj;
            if (this.f86526a.equals(h18Var.f86526a) && this.f86527b.equals(h18Var.f86527b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f86526a.hashCode() ^ 1000003) * 1000003) ^ this.f86527b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f86526a);
        sb.append(", version=");
        return dq60.m36616p(this.f86527b, "}", sb);
    }
}
