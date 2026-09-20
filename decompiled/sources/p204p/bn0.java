package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class bn0 implements mn0 {

    /* JADX INFO: renamed from: a */
    public final int f28667a;

    /* JADX INFO: renamed from: b */
    public final String f28668b;

    public bn0(int i, String str) {
        this.f28667a = i;
        this.f28668b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn0)) {
            return false;
        }
        bn0 bn0Var = (bn0) obj;
        return this.f28667a == bn0Var.f28667a && wj50.m88271j(this.f28668b, bn0Var.f28668b);
    }

    public final int hashCode() {
        int iM38547C = edb.m38547C(this.f28667a) * 31;
        String str = this.f28668b;
        return iM38547C + (str == null ? 0 : str.hashCode());
    }
}
