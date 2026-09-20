package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class goo implements r8f {

    /* JADX INFO: renamed from: a */
    public final long f82986a;

    /* JADX INFO: renamed from: b */
    public final long f82987b;

    public goo(long j, long j2) {
        this.f82986a = j;
        this.f82987b = j2;
    }

    @Override // p204p.r8f
    /* JADX INFO: renamed from: a */
    public final long mo31282a(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32 ? this.f82987b : this.f82986a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof goo)) {
            return false;
        }
        goo gooVar = (goo) obj;
        long j = gooVar.f82986a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f82986a, j) && as91.m27074b(this.f82987b, gooVar.f82987b);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return Long.hashCode(this.f82987b) + (Long.hashCode(this.f82986a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DayNightColorProvider(day=");
        y8a0.m93103h(this.f82986a, ", night=", sb);
        sb.append((Object) n6f.m63771h(this.f82987b));
        sb.append(')');
        return sb.toString();
    }
}
