package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes10.dex */
public final class py81 extends ty81 {

    /* JADX INFO: renamed from: a */
    public final Uri f183375a;

    public py81(Uri uri) {
        this.f183375a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof py81) && wj50.m88271j(this.f183375a, ((py81) obj).f183375a);
    }

    public final int hashCode() {
        return this.f183375a.hashCode();
    }
}
