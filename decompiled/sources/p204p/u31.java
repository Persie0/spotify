package p204p;

import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
public final class u31 extends lug1 {

    /* JADX INFO: renamed from: b */
    public final Intent f226254b;

    public u31(Intent intent) {
        this.f226254b = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u31) && wj50.m88271j(this.f226254b, ((u31) obj).f226254b);
    }

    public final int hashCode() {
        return this.f226254b.hashCode();
    }
}
