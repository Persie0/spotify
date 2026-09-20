package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ki61 {

    /* JADX INFO: renamed from: a */
    public final String f122865a;

    /* JADX INFO: renamed from: b */
    public final String f122866b;

    /* JADX INFO: renamed from: c */
    public final boolean f122867c;

    /* JADX INFO: renamed from: d */
    public final List f122868d;

    public ki61(String str, String str2, List list, boolean z) {
        this.f122865a = str;
        this.f122866b = str2;
        this.f122867c = z;
        this.f122868d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ki61)) {
            return false;
        }
        ki61 ki61Var = (ki61) obj;
        return wj50.m88271j(this.f122865a, ki61Var.f122865a) && wj50.m88271j(this.f122866b, ki61Var.f122866b) && this.f122867c == ki61Var.f122867c && wj50.m88271j(this.f122868d, ki61Var.f122868d);
    }

    public final int hashCode() {
        return this.f122868d.hashCode() + s571.m77245d(s571.m77243b(this.f122865a.hashCode() * 31, 31, this.f122866b), 31, this.f122867c);
    }
}
