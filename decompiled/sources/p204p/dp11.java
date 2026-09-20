package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class dp11 {

    /* JADX INFO: renamed from: a */
    public final String f51150a;

    /* JADX INFO: renamed from: b */
    public final String f51151b;

    /* JADX INFO: renamed from: c */
    public final String f51152c;

    /* JADX INFO: renamed from: d */
    public final List f51153d;

    /* JADX INFO: renamed from: e */
    public final Integer f51154e;

    /* JADX INFO: renamed from: f */
    public final int f51155f;

    public dp11(String str, String str2, String str3, List list, Integer num, int i) {
        this.f51150a = str;
        this.f51151b = str2;
        this.f51152c = str3;
        this.f51153d = list;
        this.f51154e = num;
        this.f51155f = i;
    }

    /* JADX INFO: renamed from: a */
    public static dp11 m36557a(dp11 dp11Var, String str) {
        String str2 = dp11Var.f51150a;
        String str3 = dp11Var.f51151b;
        List list = dp11Var.f51153d;
        Integer num = dp11Var.f51154e;
        int i = dp11Var.f51155f;
        dp11Var.getClass();
        return new dp11(str2, str3, str, list, num, i);
    }

    /* JADX INFO: renamed from: b */
    public final List m36558b() {
        return this.f51153d;
    }

    /* JADX INFO: renamed from: c */
    public final String m36559c() {
        return this.f51150a;
    }

    /* JADX INFO: renamed from: d */
    public final String m36560d() {
        return this.f51151b;
    }

    /* JADX INFO: renamed from: e */
    public final int m36561e() {
        return this.f51155f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp11)) {
            return false;
        }
        dp11 dp11Var = (dp11) obj;
        return wj50.m88271j(this.f51150a, dp11Var.f51150a) && wj50.m88271j(this.f51151b, dp11Var.f51151b) && wj50.m88271j(this.f51152c, dp11Var.f51152c) && wj50.m88271j(this.f51153d, dp11Var.f51153d) && wj50.m88271j(this.f51154e, dp11Var.f51154e) && this.f51155f == dp11Var.f51155f;
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(s571.m77243b(s571.m77243b(this.f51150a.hashCode() * 31, 31, this.f51151b), 31, this.f51152c), 31, this.f51153d);
        Integer num = this.f51154e;
        return edb.m38547C(this.f51155f) + ((iM77244c + (num == null ? 0 : num.hashCode())) * 31);
    }
}
