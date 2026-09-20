package p204p;

import android.os.Bundle;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class oxi0 {

    /* JADX INFO: renamed from: a */
    public final int f170991a;

    /* JADX INFO: renamed from: b */
    public ezi0 f170992b = null;

    /* JADX INFO: renamed from: c */
    public Bundle f170993c = null;

    public oxi0(int i) {
        this.f170991a = i;
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof oxi0)) {
            oxi0 oxi0Var = (oxi0) obj;
            if (this.f170991a == oxi0Var.f170991a && wj50.m88271j(this.f170992b, oxi0Var.f170992b)) {
                if (!wj50.m88271j(this.f170993c, oxi0Var.f170993c)) {
                    Bundle bundle = this.f170993c;
                    if (bundle != null && (setKeySet = bundle.keySet()) != null) {
                        Set<String> set = setKeySet;
                        if (!(set instanceof Collection) || !set.isEmpty()) {
                            for (String str : set) {
                                Bundle bundle2 = this.f170993c;
                                Object obj2 = bundle2 != null ? bundle2.get(str) : null;
                                Bundle bundle3 = oxi0Var.f170993c;
                                if (!wj50.m88271j(obj2, bundle3 != null ? bundle3.get(str) : null)) {
                                }
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = Integer.hashCode(this.f170991a) * 31;
        ezi0 ezi0Var = this.f170992b;
        int iHashCode2 = iHashCode + (ezi0Var != null ? ezi0Var.hashCode() : 0);
        Bundle bundle = this.f170993c;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            for (String str : setKeySet) {
                int i = iHashCode2 * 31;
                Bundle bundle2 = this.f170993c;
                Object obj = bundle2 != null ? bundle2.get(str) : null;
                iHashCode2 = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return iHashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(oxi0.class.getSimpleName());
        sb.append("(0x");
        sb.append(Integer.toHexString(this.f170991a));
        sb.append(")");
        if (this.f170992b != null) {
            sb.append(" navOptions=");
            sb.append(this.f170992b);
        }
        return sb.toString();
    }
}
