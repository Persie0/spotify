package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes7.dex */
public final class abe {

    /* JADX INFO: renamed from: a */
    public final String f14096a;

    /* JADX INFO: renamed from: b */
    public final String f14097b;

    /* JADX INFO: renamed from: c */
    public final Uri f14098c;

    public abe(Uri uri, String str, String str2) {
        this.f14096a = str;
        this.f14097b = str2;
        this.f14098c = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abe)) {
            return false;
        }
        abe abeVar = (abe) obj;
        return wj50.m88271j(this.f14096a, abeVar.f14096a) && wj50.m88271j(this.f14097b, abeVar.f14097b) && wj50.m88271j(this.f14098c, abeVar.f14098c);
    }

    public final int hashCode() {
        return this.f14098c.hashCode() + s571.m77243b(this.f14096a.hashCode() * 31, 31, this.f14097b);
    }
}
