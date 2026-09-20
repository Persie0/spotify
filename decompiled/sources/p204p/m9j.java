package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class m9j {

    /* JADX INFO: renamed from: a */
    public final int f141319a;

    /* JADX INFO: renamed from: b */
    public final int f141320b;

    /* JADX INFO: renamed from: c */
    public final String f141321c;

    public m9j(int i, int i2, String str) {
        this.f141319a = i;
        this.f141320b = i2;
        this.f141321c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9j)) {
            return false;
        }
        m9j m9jVar = (m9j) obj;
        return this.f141319a == m9jVar.f141319a && this.f141320b == m9jVar.f141320b && wj50.m88271j(this.f141321c, m9jVar.f141321c);
    }

    public final int hashCode() {
        return s571.m77243b(mt60.m62800g(this.f141320b, Integer.hashCode(this.f141319a) * 31, 31), 31, this.f141321c);
    }
}
