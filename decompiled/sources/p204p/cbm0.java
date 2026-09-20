package p204p;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class cbm0 implements zam0, Serializable, Comparable {

    /* JADX INFO: renamed from: e */
    public static final AtomicReferenceArray f36163e = new AtomicReferenceArray(2195);

    /* JADX INFO: renamed from: a */
    public final String f36164a;

    /* JADX INFO: renamed from: b */
    public final int f36165b;

    /* JADX INFO: renamed from: c */
    public final String f36166c;

    /* JADX INFO: renamed from: d */
    public final String f36167d;

    public cbm0(String str, String str2, int i, String str3) {
        this.f36164a = str;
        this.f36165b = i;
        this.f36166c = str2;
        this.f36167d = str3;
    }

    private final Object readResolve() {
        return xgg1.m90631I5(this.f36164a);
    }

    @Override // p204p.zam0
    /* JADX INFO: renamed from: a */
    public final String mo32181a() {
        return this.f36167d;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return wj50.m88282u(this.f36165b, ((cbm0) obj).f36165b);
    }

    @Override // p204p.zam0
    public final String path() {
        return this.f36166c;
    }

    public final String toString() {
        return s571.m77251j("{pageIdentifier='", this.f36166c, "'}");
    }
}
