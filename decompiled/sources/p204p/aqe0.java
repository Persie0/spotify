package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class aqe0 implements zqe0 {

    /* JADX INFO: renamed from: a */
    public final String f18231a;

    /* JADX INFO: renamed from: b */
    public final String f18232b;

    public aqe0(String str, String str2) {
        this.f18231a = str;
        this.f18232b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqe0)) {
            return false;
        }
        aqe0 aqe0Var = (aqe0) obj;
        return wj50.m88271j(this.f18231a, aqe0Var.f18231a) && wj50.m88271j(this.f18232b, aqe0Var.f18232b);
    }

    @Override // p204p.zqe0
    public final String getId() {
        return this.f18231a;
    }

    public final int hashCode() {
        return this.f18232b.hashCode() + (this.f18231a.hashCode() * 31);
    }
}
