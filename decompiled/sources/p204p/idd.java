package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class idd implements qdd {

    /* JADX INFO: renamed from: a */
    public final String f101060a;

    /* JADX INFO: renamed from: b */
    public final String f101061b;

    /* JADX INFO: renamed from: c */
    public final rv01 f101062c;

    public idd(String str, String str2, rv01 rv01Var) {
        this.f101060a = str;
        this.f101061b = str2;
        this.f101062c = rv01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof idd)) {
            return false;
        }
        idd iddVar = (idd) obj;
        return wj50.m88271j(this.f101060a, iddVar.f101060a) && wj50.m88271j(this.f101061b, iddVar.f101061b) && wj50.m88271j(this.f101062c, iddVar.f101062c);
    }

    public final int hashCode() {
        int iHashCode = this.f101060a.hashCode() * 31;
        String str = this.f101061b;
        return this.f101062c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
