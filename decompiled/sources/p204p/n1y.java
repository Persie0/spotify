package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class n1y {

    /* JADX INFO: renamed from: a */
    public final List f149556a;

    /* JADX INFO: renamed from: b */
    public final String f149557b;

    /* JADX INFO: renamed from: c */
    public final String f149558c;

    /* JADX INFO: renamed from: d */
    public final boolean f149559d;

    public n1y(String str, String str2, List list, boolean z) {
        this.f149556a = list;
        this.f149557b = str;
        this.f149558c = str2;
        this.f149559d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1y)) {
            return false;
        }
        n1y n1yVar = (n1y) obj;
        return wj50.m88271j(this.f149556a, n1yVar.f149556a) && wj50.m88271j(this.f149557b, n1yVar.f149557b) && wj50.m88271j(this.f149558c, n1yVar.f149558c) && this.f149559d == n1yVar.f149559d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f149559d) + s571.m77243b(s571.m77243b(this.f149556a.hashCode() * 31, 31, this.f149557b), 31, this.f149558c);
    }
}
