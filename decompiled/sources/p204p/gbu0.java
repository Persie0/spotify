package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class gbu0 implements zam0 {

    /* JADX INFO: renamed from: a */
    public final String f78414a;

    public gbu0(String str) {
        this.f78414a = str;
    }

    @Override // p204p.zam0
    /* JADX INFO: renamed from: a */
    public final String mo32181a() {
        List listM88477a1 = wl51.m88477a1(this.f78414a, new String[]{"/"}, 0, 6);
        return listM88477a1.size() >= 1 ? (String) listM88477a1.get(0) : "unknown";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gbu0) && wj50.m88271j(this.f78414a, ((gbu0) obj).f78414a);
    }

    public final int hashCode() {
        return this.f78414a.hashCode();
    }

    @Override // p204p.zam0
    public final String path() {
        return this.f78414a;
    }

    public final String toString() {
        return s571.m77251j("{pageIdentifier='", this.f78414a, "'}");
    }
}
