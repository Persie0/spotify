package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class y7j {

    /* JADX INFO: renamed from: a */
    public final Uri f270094a;

    /* JADX INFO: renamed from: b */
    public final boolean f270095b;

    public y7j(Uri uri, boolean z) {
        this.f270094a = uri;
        this.f270095b = z;
    }

    /* JADX INFO: renamed from: a */
    public final Uri m93000a() {
        return this.f270094a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m93001b() {
        return this.f270095b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!y7j.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        y7j y7jVar = (y7j) obj;
        return wj50.m88271j(this.f270094a, y7jVar.f270094a) && this.f270095b == y7jVar.f270095b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f270095b) + (this.f270094a.hashCode() * 31);
    }
}
