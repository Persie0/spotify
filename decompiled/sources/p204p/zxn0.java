package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zxn0 {

    /* JADX INFO: renamed from: e */
    public static final zxn0 f287357e = new zxn0(false, "", lau.f131415a, null);

    /* JADX INFO: renamed from: a */
    public final boolean f287358a;

    /* JADX INFO: renamed from: b */
    public final String f287359b;

    /* JADX INFO: renamed from: c */
    public final List f287360c;

    /* JADX INFO: renamed from: d */
    public final Integer f287361d;

    public zxn0(boolean z, String str, List list, Integer num) {
        this.f287358a = z;
        this.f287359b = str;
        this.f287360c = list;
        this.f287361d = num;
    }

    /* JADX INFO: renamed from: a */
    public static zxn0 m97209a(zxn0 zxn0Var, Integer num) {
        boolean z = zxn0Var.f287358a;
        String str = zxn0Var.f287359b;
        List list = zxn0Var.f287360c;
        zxn0Var.getClass();
        return new zxn0(z, str, list, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zxn0)) {
            return false;
        }
        zxn0 zxn0Var = (zxn0) obj;
        return this.f287358a == zxn0Var.f287358a && wj50.m88271j(this.f287359b, zxn0Var.f287359b) && wj50.m88271j(this.f287360c, zxn0Var.f287360c) && wj50.m88271j(this.f287361d, zxn0Var.f287361d);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(s571.m77243b(Boolean.hashCode(this.f287358a) * 31, 31, this.f287359b), 31, this.f287360c);
        Integer num = this.f287361d;
        return iM77244c + (num == null ? 0 : num.hashCode());
    }
}
