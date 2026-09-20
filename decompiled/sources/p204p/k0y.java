package p204p;

import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;

/* JADX INFO: loaded from: classes2.dex */
public final class k0y {

    /* JADX INFO: renamed from: a */
    public final String f118165a;

    /* JADX INFO: renamed from: b */
    public final ExternalAccessoryDescription f118166b;

    /* JADX INFO: renamed from: c */
    public final boolean f118167c;

    public k0y(String str, ExternalAccessoryDescription externalAccessoryDescription, boolean z) {
        this.f118165a = str;
        this.f118166b = externalAccessoryDescription;
        this.f118167c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0y)) {
            return false;
        }
        k0y k0yVar = (k0y) obj;
        return wj50.m88271j(this.f118165a, k0yVar.f118165a) && wj50.m88271j(this.f118166b, k0yVar.f118166b) && this.f118167c == k0yVar.f118167c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f118167c) + ((this.f118166b.hashCode() + (this.f118165a.hashCode() * 31)) * 31);
    }
}
