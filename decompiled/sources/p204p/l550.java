package p204p;

import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class l550 implements m550 {

    /* JADX INFO: renamed from: a */
    public final Intent f129825a;

    public l550(Intent intent) {
        this.f129825a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l550) && wj50.m88271j(this.f129825a, ((l550) obj).f129825a);
    }

    public final int hashCode() {
        return this.f129825a.hashCode();
    }
}
