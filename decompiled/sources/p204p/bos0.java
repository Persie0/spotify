package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class bos0 {

    /* JADX INFO: renamed from: a */
    public final String f29244a;

    /* JADX INFO: renamed from: b */
    public final String f29245b;

    /* JADX INFO: renamed from: c */
    public final String f29246c;

    /* JADX INFO: renamed from: d */
    public final String f29247d;

    /* JADX INFO: renamed from: e */
    public final List f29248e;

    public bos0(String str, String str2, String str3, String str4, List list) {
        this.f29244a = str;
        this.f29245b = str2;
        this.f29246c = str3;
        this.f29247d = str4;
        this.f29248e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bos0)) {
            return false;
        }
        bos0 bos0Var = (bos0) obj;
        return wj50.m88271j(this.f29244a, bos0Var.f29244a) && wj50.m88271j(this.f29245b, bos0Var.f29245b) && wj50.m88271j(this.f29246c, bos0Var.f29246c) && wj50.m88271j(this.f29247d, bos0Var.f29247d) && wj50.m88271j(this.f29248e, bos0Var.f29248e);
    }

    public final int hashCode() {
        return this.f29248e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f29244a.hashCode() * 31, 31, this.f29245b), 31, this.f29246c), 31, this.f29247d);
    }
}
