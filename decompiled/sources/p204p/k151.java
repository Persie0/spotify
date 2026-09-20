package p204p;

import android.net.Uri;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class k151 {

    /* JADX INFO: renamed from: a */
    public final int f118208a;

    /* JADX INFO: renamed from: b */
    public final long f118209b;

    /* JADX INFO: renamed from: c */
    public final Uri f118210c;

    /* JADX INFO: renamed from: d */
    public final pf40 f118211d;

    /* JADX INFO: renamed from: e */
    public final pf40 f118212e;

    public k151(int i, long j, Uri uri, wsv0 wsv0Var, wsv0 wsv0Var2) {
        this.f118208a = i;
        this.f118209b = j;
        this.f118210c = uri;
        this.f118211d = pf40.m69791p(wsv0Var);
        this.f118212e = pf40.m69791p(wsv0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k151)) {
            return false;
        }
        k151 k151Var = (k151) obj;
        return this.f118208a == k151Var.f118208a && this.f118209b == k151Var.f118209b && Objects.equals(this.f118210c, k151Var.f118210c) && Objects.equals(this.f118211d, k151Var.f118211d) && Objects.equals(this.f118212e, k151Var.f118212e);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f118208a), Long.valueOf(this.f118209b), this.f118210c, this.f118211d, this.f118212e);
    }
}
