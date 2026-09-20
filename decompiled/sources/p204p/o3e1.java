package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes11.dex */
public final class o3e1 {

    /* JADX INFO: renamed from: a */
    public final Uri f161355a;

    /* JADX INFO: renamed from: b */
    public final String f161356b;

    /* JADX INFO: renamed from: c */
    public final boolean f161357c;

    public o3e1(Uri uri, String str, boolean z) {
        this.f161355a = uri;
        this.f161356b = str;
        this.f161357c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3e1)) {
            return false;
        }
        o3e1 o3e1Var = (o3e1) obj;
        return wj50.m88271j(this.f161355a, o3e1Var.f161355a) && wj50.m88271j(this.f161356b, o3e1Var.f161356b) && this.f161357c == o3e1Var.f161357c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f161357c) + s571.m77243b(this.f161355a.hashCode() * 31, 31, this.f161356b);
    }
}
