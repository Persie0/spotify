package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class us11 extends ys11 {

    /* JADX INFO: renamed from: a */
    public final String f233510a;

    /* JADX INFO: renamed from: b */
    public final String f233511b;

    /* JADX INFO: renamed from: c */
    public final String f233512c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f233513d;

    public us11(String str, String str2, String str3, ArrayList arrayList) {
        this.f233510a = str;
        this.f233511b = str2;
        this.f233512c = str3;
        this.f233513d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof us11)) {
            return false;
        }
        us11 us11Var = (us11) obj;
        return this.f233510a.equals(us11Var.f233510a) && wj50.m88271j(this.f233511b, us11Var.f233511b) && wj50.m88271j(this.f233512c, us11Var.f233512c) && this.f233513d.equals(us11Var.f233513d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f233510a.hashCode() * 31, 31, this.f233511b);
        String str = this.f233512c;
        return this.f233513d.hashCode() + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }
}
