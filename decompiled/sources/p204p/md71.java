package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class md71 {

    /* JADX INFO: renamed from: a */
    public final long f142341a;

    /* JADX INFO: renamed from: b */
    public final long f142342b;

    public md71(long j, long j2) {
        this.f142341a = j;
        this.f142342b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof md71)) {
            return false;
        }
        md71 md71Var = (md71) obj;
        long j = md71Var.f142341a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f142341a, j) && as91.m27074b(this.f142342b, md71Var.f142342b);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return as91.m27075c(this.f142342b) + (as91.m27075c(this.f142341a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        y8a0.m93103h(this.f142341a, ", selectionBackgroundColor=", sb);
        sb.append((Object) n6f.m63771h(this.f142342b));
        sb.append(')');
        return sb.toString();
    }
}
