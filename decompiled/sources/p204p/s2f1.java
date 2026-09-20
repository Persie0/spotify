package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class s2f1 {

    /* JADX INFO: renamed from: a */
    public final String f205001a;

    /* JADX INFO: renamed from: b */
    public final Set f205002b;

    public s2f1(String str, Set set) {
        this.f205001a = str;
        this.f205002b = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s2f1) {
            s2f1 s2f1Var = (s2f1) obj;
            String str = s2f1Var.f205001a;
            String str2 = this.f205001a;
            if (str2 != null ? str2.equals(str) : str == null) {
                if (this.f205002b.equals(s2f1Var.f205002b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f205001a;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f205002b.hashCode();
    }

    public final String toString() {
        return klh.m56837i(new StringBuilder("StandardIntegrityTokenRequest{requestHash="), this.f205001a, ", verdictOptOut=", this.f205002b.toString(), "}");
    }
}
