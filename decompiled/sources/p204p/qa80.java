package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class qa80 implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f186792a;

    /* JADX INFO: renamed from: b */
    public final String f186793b;

    /* JADX INFO: renamed from: c */
    public final List f186794c;

    public qa80(String str, String str2, ae50 ae50Var) {
        this.f186792a = str;
        this.f186793b = str2;
        this.f186794c = ae50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa80)) {
            return false;
        }
        qa80 qa80Var = (qa80) obj;
        return wj50.m88271j(this.f186792a, qa80Var.f186792a) && wj50.m88271j(this.f186793b, qa80Var.f186793b) && wj50.m88271j(this.f186794c, qa80Var.f186794c);
    }

    public final int hashCode() {
        return this.f186794c.hashCode() + s571.m77243b(this.f186792a.hashCode() * 31, 31, this.f186793b);
    }
}
