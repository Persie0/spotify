package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class rpj0 {

    /* JADX INFO: renamed from: a */
    public final vfe f201598a;

    /* JADX INFO: renamed from: b */
    public final List f201599b;

    public rpj0(vfe vfeVar, List list) {
        this.f201598a = vfeVar;
        this.f201599b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rpj0)) {
            return false;
        }
        rpj0 rpj0Var = (rpj0) obj;
        return wj50.m88271j(this.f201598a, rpj0Var.f201598a) && wj50.m88271j(this.f201599b, rpj0Var.f201599b);
    }

    public final int hashCode() {
        return this.f201599b.hashCode() + (this.f201598a.hashCode() * 31);
    }

    public final String toString() {
        return "ClassRequest(classId=" + this.f201598a + ", typeParametersCount=" + this.f201599b + ')';
    }
}
