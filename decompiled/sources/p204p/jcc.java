package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class jcc {

    /* JADX INFO: renamed from: a */
    public final Object f111053a;

    /* JADX INFO: renamed from: b */
    public final int f111054b;

    /* JADX INFO: renamed from: c */
    public final int f111055c;

    public jcc(int i, int i2, List list) {
        this.f111053a = list;
        this.f111054b = i;
        this.f111055c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jcc)) {
            return false;
        }
        jcc jccVar = (jcc) obj;
        return this.f111053a.equals(jccVar.f111053a) && this.f111054b == jccVar.f111054b && this.f111055c == jccVar.f111055c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f111055c) + f710.m40938f(this.f111054b, this.f111053a.hashCode() * 31, 31);
    }
}
