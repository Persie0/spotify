package p204p;

import android.content.Intent;

/* JADX INFO: loaded from: classes8.dex */
public final class q1j0 extends v1j0 {

    /* JADX INFO: renamed from: a */
    public final Intent f184360a;

    public q1j0(Intent intent) {
        this.f184360a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q1j0) && wj50.m88271j(this.f184360a, ((q1j0) obj).f184360a);
    }

    public final int hashCode() {
        return this.f184360a.hashCode();
    }
}
