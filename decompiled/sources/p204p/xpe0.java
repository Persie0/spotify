package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class xpe0 implements zqe0 {

    /* JADX INFO: renamed from: a */
    public final String f264622a;

    /* JADX INFO: renamed from: b */
    public final List f264623b;

    /* JADX INFO: renamed from: c */
    public final boolean f264624c;

    public xpe0(String str, List list, boolean z) {
        this.f264622a = str;
        this.f264623b = list;
        this.f264624c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xpe0)) {
            return false;
        }
        xpe0 xpe0Var = (xpe0) obj;
        return wj50.m88271j(this.f264622a, xpe0Var.f264622a) && wj50.m88271j(this.f264623b, xpe0Var.f264623b) && this.f264624c == xpe0Var.f264624c;
    }

    @Override // p204p.zqe0
    public final String getId() {
        return this.f264622a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f264624c) + s571.m77244c(this.f264622a.hashCode() * 31, 31, this.f264623b);
    }
}
