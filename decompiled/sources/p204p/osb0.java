package p204p;

import android.content.Intent;

/* JADX INFO: loaded from: classes8.dex */
public final class osb0 extends ssb0 {

    /* JADX INFO: renamed from: a */
    public final Intent f168789a;

    public osb0(Intent intent) {
        this.f168789a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof osb0) && wj50.m88271j(this.f168789a, ((osb0) obj).f168789a);
    }

    public final int hashCode() {
        return this.f168789a.hashCode();
    }
}
