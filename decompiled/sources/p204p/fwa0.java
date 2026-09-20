package p204p;

import android.content.Intent;

/* JADX INFO: loaded from: classes7.dex */
public final class fwa0 extends j9g1 {

    /* JADX INFO: renamed from: e */
    public final Intent f74036e;

    public fwa0(Intent intent) {
        this.f74036e = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fwa0) && wj50.m88271j(this.f74036e, ((fwa0) obj).f74036e);
    }

    public final int hashCode() {
        return this.f74036e.hashCode();
    }
}
