package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class vsf {

    /* JADX INFO: renamed from: a */
    public final String f244425a;

    /* JADX INFO: renamed from: b */
    public final String f244426b;

    /* JADX INFO: renamed from: c */
    public final boolean f244427c;

    /* JADX INFO: renamed from: d */
    public final List f244428d;

    public vsf(String str, String str2, List list, boolean z) {
        this.f244425a = str;
        this.f244426b = str2;
        this.f244427c = z;
        this.f244428d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vsf)) {
            return false;
        }
        vsf vsfVar = (vsf) obj;
        return wj50.m88271j(this.f244425a, vsfVar.f244425a) && wj50.m88271j(this.f244426b, vsfVar.f244426b) && this.f244427c == vsfVar.f244427c && wj50.m88271j(this.f244428d, vsfVar.f244428d);
    }

    public final int hashCode() {
        return this.f244428d.hashCode() + s571.m77245d(s571.m77243b(this.f244425a.hashCode() * 31, 31, this.f244426b), 31, this.f244427c);
    }
}
