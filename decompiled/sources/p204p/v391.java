package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class v391 implements w391 {

    /* JADX INFO: renamed from: a */
    public final String f236814a;

    /* JADX INFO: renamed from: b */
    public final int f236815b;

    /* JADX INFO: renamed from: c */
    public final int f236816c;

    public v391(String str, int i, int i2) {
        this.f236814a = str;
        this.f236815b = i;
        this.f236816c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v391)) {
            return false;
        }
        v391 v391Var = (v391) obj;
        return wj50.m88271j(this.f236814a, v391Var.f236814a) && this.f236815b == v391Var.f236815b && this.f236816c == v391Var.f236816c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f236816c) + mt60.m62800g(this.f236815b, this.f236814a.hashCode() * 31, 31);
    }
}
