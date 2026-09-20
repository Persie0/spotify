package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ree extends see {

    /* JADX INFO: renamed from: a */
    public final String f198350a;

    /* JADX INFO: renamed from: b */
    public final qla1 f198351b;

    /* JADX INFO: renamed from: c */
    public final String f198352c;

    /* JADX INFO: renamed from: d */
    public final boolean f198353d;

    public ree(String str, qla1 qla1Var, String str2, boolean z) {
        this.f198350a = str;
        this.f198351b = qla1Var;
        this.f198352c = str2;
        this.f198353d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ree)) {
            return false;
        }
        ree reeVar = (ree) obj;
        return wj50.m88271j(this.f198350a, reeVar.f198350a) && wj50.m88271j(this.f198351b, reeVar.f198351b) && wj50.m88271j(this.f198352c, reeVar.f198352c) && this.f198353d == reeVar.f198353d;
    }

    public final int hashCode() {
        int iHashCode = (this.f198351b.hashCode() + (this.f198350a.hashCode() * 31)) * 31;
        String str = this.f198352c;
        return Boolean.hashCode(this.f198353d) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
