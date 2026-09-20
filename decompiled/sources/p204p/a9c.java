package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class a9c extends c9c {

    /* JADX INFO: renamed from: a */
    public final String f13536a;

    /* JADX INFO: renamed from: b */
    public final ln21 f13537b;

    public a9c(String str, ln21 ln21Var) {
        this.f13536a = str;
        this.f13537b = ln21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9c)) {
            return false;
        }
        a9c a9cVar = (a9c) obj;
        return wj50.m88271j(this.f13536a, a9cVar.f13536a) && this.f13537b == a9cVar.f13537b;
    }

    public final int hashCode() {
        return this.f13537b.hashCode() + (this.f13536a.hashCode() * 31);
    }
}
