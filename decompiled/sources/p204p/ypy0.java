package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ypy0 {

    /* JADX INFO: renamed from: a */
    public final List f275093a;

    /* JADX INFO: renamed from: b */
    public final String f275094b;

    /* JADX INFO: renamed from: c */
    public final List f275095c;

    public ypy0(String str, List list, List list2) {
        this.f275093a = list;
        this.f275094b = str;
        this.f275095c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ypy0)) {
            return false;
        }
        ypy0 ypy0Var = (ypy0) obj;
        return wj50.m88271j(this.f275093a, ypy0Var.f275093a) && wj50.m88271j(this.f275094b, ypy0Var.f275094b) && wj50.m88271j(this.f275095c, ypy0Var.f275095c);
    }

    public final int hashCode() {
        return this.f275095c.hashCode() + s571.m77243b(this.f275093a.hashCode() * 31, 31, this.f275094b);
    }
}
