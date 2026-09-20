package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class b7o0 {

    /* JADX INFO: renamed from: a */
    public final String f24352a;

    /* JADX INFO: renamed from: b */
    public final String f24353b;

    /* JADX INFO: renamed from: c */
    public final String f24354c;

    /* JADX INFO: renamed from: d */
    public final List f24355d;

    public b7o0(String str, List list, String str2, String str3) {
        this.f24352a = str;
        this.f24353b = str2;
        this.f24354c = str3;
        this.f24355d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7o0)) {
            return false;
        }
        b7o0 b7o0Var = (b7o0) obj;
        return wj50.m88271j(this.f24352a, b7o0Var.f24352a) && wj50.m88271j(this.f24353b, b7o0Var.f24353b) && wj50.m88271j(this.f24354c, b7o0Var.f24354c) && wj50.m88271j(this.f24355d, b7o0Var.f24355d);
    }

    public final int hashCode() {
        return this.f24355d.hashCode() + s571.m77243b(s571.m77243b(this.f24352a.hashCode() * 31, 31, this.f24353b), 31, this.f24354c);
    }
}
