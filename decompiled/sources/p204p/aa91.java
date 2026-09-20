package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class aa91 {

    /* JADX INFO: renamed from: a */
    public final List f13796a;

    /* JADX INFO: renamed from: b */
    public final j891 f13797b;

    public aa91(List list, j891 j891Var) {
        this.f13796a = list;
        this.f13797b = j891Var;
    }

    /* JADX INFO: renamed from: a */
    public final List m25211a() {
        return this.f13796a;
    }

    /* JADX INFO: renamed from: b */
    public final j891 m25212b() {
        return this.f13797b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa91)) {
            return false;
        }
        aa91 aa91Var = (aa91) obj;
        return wj50.m88271j(this.f13796a, aa91Var.f13796a) && wj50.m88271j(this.f13797b, aa91Var.f13797b);
    }

    public final int hashCode() {
        return this.f13797b.hashCode() + (this.f13796a.hashCode() * 31);
    }
}
