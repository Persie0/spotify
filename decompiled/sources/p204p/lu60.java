package p204p;

import io.ably.lib.rest.Auth;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class lu60 {

    /* JADX INFO: renamed from: c */
    public static final lu60 f137006c = new lu60("COMPOSITION");

    /* JADX INFO: renamed from: a */
    public final List f137007a;

    /* JADX INFO: renamed from: b */
    public mu60 f137008b;

    public lu60(String... strArr) {
        this.f137007a = Arrays.asList(strArr);
    }

    /* JADX INFO: renamed from: a */
    public final lu60 m59927a(String str) {
        lu60 lu60Var = new lu60(this);
        lu60Var.f137007a.add(str);
        return lu60Var;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0088 A[RETURN] */
    /* JADX INFO: renamed from: b */
    public final boolean m59928b(int i, String str) {
        List list = this.f137007a;
        if (i < list.size()) {
            boolean z = i == list.size() - 1;
            String str2 = (String) list.get(i);
            if (!str2.equals("**")) {
                boolean z2 = str2.equals(str) || str2.equals(Auth.WILDCARD_CLIENTID);
                if ((z || (i == list.size() - 2 && ((String) list.get(list.size() - 1)).equals("**"))) && z2) {
                    return true;
                }
            } else {
                if (z || !((String) list.get(i + 1)).equals(str)) {
                    if (!z) {
                        int i2 = i + 1;
                        if (i2 >= list.size() - 1) {
                            return ((String) list.get(i2)).equals(str);
                        }
                    }
                    return true;
                }
                if (i == list.size() - 2 || (i == list.size() - 3 && ((String) list.get(list.size() - 1)).equals("**"))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final mu60 m59929c() {
        return this.f137008b;
    }

    /* JADX INFO: renamed from: d */
    public final int m59930d(int i, String str) {
        if ("__container".equals(str)) {
            return 0;
        }
        List list = this.f137007a;
        if (((String) list.get(i)).equals("**")) {
            return (i != list.size() - 1 && ((String) list.get(i + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m59931e(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f137007a;
        if (i >= list.size()) {
            return false;
        }
        return ((String) list.get(i)).equals(str) || ((String) list.get(i)).equals("**") || ((String) list.get(i)).equals(Auth.WILDCARD_CLIENTID);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lu60.class == obj.getClass()) {
            lu60 lu60Var = (lu60) obj;
            if (!this.f137007a.equals(lu60Var.f137007a)) {
                return false;
            }
            mu60 mu60Var = this.f137008b;
            mu60 mu60Var2 = lu60Var.f137008b;
            if (mu60Var != null) {
                return mu60Var.equals(mu60Var2);
            }
            if (mu60Var2 == null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m59932f(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f137007a;
        return i < list.size() - 1 || ((String) list.get(i)).equals("**");
    }

    /* JADX INFO: renamed from: g */
    public final lu60 m59933g(mu60 mu60Var) {
        lu60 lu60Var = new lu60(this);
        lu60Var.f137008b = mu60Var;
        return lu60Var;
    }

    public final int hashCode() {
        int iHashCode = this.f137007a.hashCode() * 31;
        mu60 mu60Var = this.f137008b;
        return iHashCode + (mu60Var != null ? mu60Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(this.f137007a);
        sb.append(",resolved=");
        return s571.m77253l(sb, this.f137008b != null, '}');
    }

    public lu60(lu60 lu60Var) {
        this.f137007a = new ArrayList(lu60Var.f137007a);
        this.f137008b = lu60Var.f137008b;
    }
}
