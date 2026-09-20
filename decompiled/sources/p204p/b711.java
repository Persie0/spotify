package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class b711 implements d711 {

    /* JADX INFO: renamed from: a */
    public final String f24114a;

    /* JADX INFO: renamed from: b */
    public final List f24115b;

    /* JADX INFO: renamed from: c */
    public final boolean f24116c;

    public b711(String str, List list, boolean z) {
        this.f24114a = str;
        this.f24115b = list;
        this.f24116c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b711)) {
            return false;
        }
        b711 b711Var = (b711) obj;
        return wj50.m88271j(this.f24114a, b711Var.f24114a) && wj50.m88271j(this.f24115b, b711Var.f24115b) && this.f24116c == b711Var.f24116c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f24116c) + s571.m77244c(this.f24114a.hashCode() * 31, 31, this.f24115b);
    }
}
