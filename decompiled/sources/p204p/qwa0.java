package p204p;

import android.content.Intent;

/* JADX INFO: loaded from: classes7.dex */
public final class qwa0 extends wwa0 {

    /* JADX INFO: renamed from: a */
    public final Intent f193218a;

    public qwa0(Intent intent) {
        this.f193218a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qwa0) && wj50.m88271j(this.f193218a, ((qwa0) obj).f193218a);
    }

    public final int hashCode() {
        return this.f193218a.hashCode();
    }
}
