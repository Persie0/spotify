package p204p;

import android.content.Intent;

/* JADX INFO: loaded from: classes10.dex */
public final class tg0 implements ug0 {

    /* JADX INFO: renamed from: a */
    public final Intent f220094a;

    public tg0(Intent intent) {
        this.f220094a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tg0) && wj50.m88271j(this.f220094a, ((tg0) obj).f220094a);
    }

    public final int hashCode() {
        Intent intent = this.f220094a;
        if (intent == null) {
            return 0;
        }
        return intent.hashCode();
    }
}
