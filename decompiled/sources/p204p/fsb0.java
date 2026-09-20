package p204p;

import android.content.Intent;

/* JADX INFO: loaded from: classes8.dex */
public final class fsb0 extends qjg1 {

    /* JADX INFO: renamed from: c */
    public final Intent f72823c;

    public fsb0(Intent intent) {
        this.f72823c = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fsb0) && wj50.m88271j(this.f72823c, ((fsb0) obj).f72823c);
    }

    public final int hashCode() {
        return this.f72823c.hashCode();
    }
}
