package p204p;

import android.text.SpannableStringBuilder;

/* JADX INFO: loaded from: classes6.dex */
public final class ouq {

    /* JADX INFO: renamed from: a */
    public final cuq f170339a;

    /* JADX INFO: renamed from: b */
    public final long f170340b;

    static {
        new SpannableStringBuilder();
    }

    public ouq(cuq cuqVar, long j) {
        this.f170339a = cuqVar;
        this.f170340b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ouq)) {
            return false;
        }
        ouq ouqVar = (ouq) obj;
        return wj50.m88271j(this.f170339a, ouqVar.f170339a) && this.f170340b == ouqVar.f170340b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f170340b) + (this.f170339a.hashCode() * 31);
    }
}
