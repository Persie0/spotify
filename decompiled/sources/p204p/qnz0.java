package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class qnz0 {

    /* JADX INFO: renamed from: a */
    public final String f190720a;

    /* JADX INFO: renamed from: b */
    public final String f190721b;

    /* JADX INFO: renamed from: c */
    public final String f190722c;

    /* JADX INFO: renamed from: d */
    public final String f190723d;

    /* JADX INFO: renamed from: e */
    public final int f190724e;

    /* JADX INFO: renamed from: f */
    public final int f190725f;

    /* JADX INFO: renamed from: g */
    public final List f190726g;

    /* JADX INFO: renamed from: h */
    public final ktx0 f190727h;

    /* JADX INFO: renamed from: i */
    public final List f190728i;

    public qnz0(String str, String str2, String str3, String str4, int i, int i2, List list, ktx0 ktx0Var, List list2) {
        this.f190720a = str;
        this.f190721b = str2;
        this.f190722c = str3;
        this.f190723d = str4;
        this.f190724e = i;
        this.f190725f = i2;
        this.f190726g = list;
        this.f190727h = ktx0Var;
        this.f190728i = list2;
    }

    /* JADX INFO: renamed from: a */
    public static qnz0 m73362a(qnz0 qnz0Var, ktx0 ktx0Var, List list, int i) {
        String str = qnz0Var.f190720a;
        String str2 = qnz0Var.f190721b;
        String str3 = qnz0Var.f190722c;
        String str4 = qnz0Var.f190723d;
        int i2 = qnz0Var.f190724e;
        int i3 = qnz0Var.f190725f;
        List list2 = qnz0Var.f190726g;
        if ((i & 128) != 0) {
            ktx0Var = qnz0Var.f190727h;
        }
        ktx0 ktx0Var2 = ktx0Var;
        if ((i & 256) != 0) {
            list = qnz0Var.f190728i;
        }
        qnz0Var.getClass();
        return new qnz0(str, str2, str3, str4, i2, i3, list2, ktx0Var2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qnz0)) {
            return false;
        }
        qnz0 qnz0Var = (qnz0) obj;
        return wj50.m88271j(this.f190720a, qnz0Var.f190720a) && wj50.m88271j(this.f190721b, qnz0Var.f190721b) && wj50.m88271j(this.f190722c, qnz0Var.f190722c) && wj50.m88271j(this.f190723d, qnz0Var.f190723d) && this.f190724e == qnz0Var.f190724e && this.f190725f == qnz0Var.f190725f && wj50.m88271j(this.f190726g, qnz0Var.f190726g) && wj50.m88271j(this.f190727h, qnz0Var.f190727h) && wj50.m88271j(this.f190728i, qnz0Var.f190728i);
    }

    public final int hashCode() {
        return this.f190728i.hashCode() + ((this.f190727h.hashCode() + s571.m77244c(mt60.m62800g(this.f190725f, mt60.m62800g(this.f190724e, s571.m77243b(s571.m77243b(s571.m77243b(this.f190720a.hashCode() * 31, 31, this.f190721b), 31, this.f190722c), 31, this.f190723d), 31), 31), 31, this.f190726g)) * 31);
    }
}
