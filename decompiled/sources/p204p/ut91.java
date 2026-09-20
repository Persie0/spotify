package p204p;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ut91 {

    /* JADX INFO: renamed from: f */
    public static final ut91 f233854f = new ut91("", 0, "", new HashMap(), lau.f131415a);

    /* JADX INFO: renamed from: a */
    public final String f233855a;

    /* JADX INFO: renamed from: b */
    public final int f233856b;

    /* JADX INFO: renamed from: c */
    public final String f233857c;

    /* JADX INFO: renamed from: d */
    public final Map f233858d;

    /* JADX INFO: renamed from: e */
    public final List f233859e;

    public ut91(String str, int i, String str2, HashMap map, List list) {
        this.f233855a = str;
        this.f233856b = i;
        this.f233857c = str2;
        this.f233858d = map;
        this.f233859e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ut91.class.equals(obj.getClass())) {
            return false;
        }
        ut91 ut91Var = (ut91) obj;
        if (this.f233856b == ut91Var.f233856b && wj50.m88271j(this.f233855a, ut91Var.f233855a) && wj50.m88271j(this.f233857c, ut91Var.f233857c)) {
            return wj50.m88271j(this.f233858d, ut91Var.f233858d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f233858d.hashCode() + s571.m77243b(((this.f233855a.hashCode() * 31) + this.f233856b) * 31, 31, this.f233857c);
    }

    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f233857c);
        sb.append('/');
        sb.append(this.f233855a);
        sb.append('(');
        sb.append(this.f233856b);
        sb.append('=');
        Map map = this.f233858d;
        if (map.isEmpty()) {
            string = "";
        } else {
            StringBuilder sb2 = new StringBuilder("(");
            boolean z = true;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (!z) {
                    sb2.append(",");
                }
                sb2.append(str + '=' + str2);
                if (z) {
                    z = false;
                }
            }
            sb2.append(")");
            string = sb2.toString();
        }
        return dq60.m36617q(sb, string, ')');
    }
}
