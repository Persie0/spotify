package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class eez implements r8f {

    /* JADX INFO: renamed from: a */
    public final long f58892a;

    public eez(long j) {
        this.f58892a = j;
    }

    @Override // p204p.r8f
    /* JADX INFO: renamed from: a */
    public final long mo31282a(Context context) {
        return this.f58892a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eez)) {
            return false;
        }
        long j = ((eez) obj).f58892a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f58892a, j);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return Long.hashCode(this.f58892a);
    }

    public final String toString() {
        return "FixedColorProvider(color=" + ((Object) n6f.m63771h(this.f58892a)) + ')';
    }
}
