package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class m3c1 {

    /* JADX INFO: renamed from: a */
    public final String f139589a;

    /* JADX INFO: renamed from: b */
    public final String f139590b;

    /* JADX INFO: renamed from: c */
    public final List f139591c;

    public m3c1(String str, List list, String str2) {
        this.f139589a = str;
        this.f139590b = str2;
        this.f139591c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3c1)) {
            return false;
        }
        m3c1 m3c1Var = (m3c1) obj;
        return this.f139589a.equals(m3c1Var.f139589a) && this.f139590b.equals(m3c1Var.f139590b) && wj50.m88271j(this.f139591c, m3c1Var.f139591c);
    }

    public final int hashCode() {
        return f710.m40938f(2, s571.m77244c(s571.m77243b(this.f139589a.hashCode() * 31, 31, this.f139590b), 31, this.f139591c), 31);
    }
}
