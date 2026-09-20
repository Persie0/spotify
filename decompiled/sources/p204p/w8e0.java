package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class w8e0 {

    /* JADX INFO: renamed from: a */
    public final vce0 f248915a;

    /* JADX INFO: renamed from: b */
    public final String f248916b;

    /* JADX INFO: renamed from: c */
    public final List f248917c;

    /* JADX INFO: renamed from: d */
    public final String f248918d;

    public w8e0(vce0 vce0Var, String str, ae50 ae50Var, String str2) {
        this.f248915a = vce0Var;
        this.f248916b = str;
        this.f248917c = ae50Var;
        this.f248918d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8e0)) {
            return false;
        }
        w8e0 w8e0Var = (w8e0) obj;
        return wj50.m88271j(this.f248915a, w8e0Var.f248915a) && wj50.m88271j(this.f248916b, w8e0Var.f248916b) && wj50.m88271j(this.f248917c, w8e0Var.f248917c) && wj50.m88271j(this.f248918d, w8e0Var.f248918d);
    }

    public final int hashCode() {
        return this.f248918d.hashCode() + s571.m77244c(s571.m77243b(this.f248915a.hashCode() * 31, 31, this.f248916b), 31, this.f248917c);
    }
}
