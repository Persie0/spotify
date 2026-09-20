package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes8.dex */
public final class bpd1 implements dpd1 {

    /* JADX INFO: renamed from: a */
    public final Uri f29418a;

    public bpd1(Uri uri) {
        this.f29418a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bpd1) && wj50.m88271j(this.f29418a, ((bpd1) obj).f29418a);
    }

    public final int hashCode() {
        return this.f29418a.hashCode();
    }
}
