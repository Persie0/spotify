package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class ioi {

    /* JADX INFO: renamed from: a */
    public final t2b0 f104228a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f104229b;

    /* JADX INFO: renamed from: c */
    public final long f104230c;

    public ioi(t2b0 t2b0Var, ArrayList arrayList, long j) {
        this.f104228a = t2b0Var;
        this.f104229b = arrayList;
        this.f104230c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ioi)) {
            return false;
        }
        ioi ioiVar = (ioi) obj;
        return this.f104228a.equals(ioiVar.f104228a) && this.f104229b.equals(ioiVar.f104229b) && this.f104230c == ioiVar.f104230c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f104230c) + lq51.m59700f(this.f104229b, this.f104228a.hashCode() * 31, 31);
    }
}
