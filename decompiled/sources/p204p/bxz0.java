package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bxz0 {

    /* JADX INFO: renamed from: a */
    public final String f32024a;

    /* JADX INFO: renamed from: b */
    public final List f32025b;

    /* JADX INFO: renamed from: c */
    public final List f32026c;

    /* JADX INFO: renamed from: d */
    public final String f32027d;

    public bxz0(String str, String str2, List list, List list2) {
        this.f32024a = str;
        this.f32025b = list;
        this.f32026c = list2;
        this.f32027d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxz0)) {
            return false;
        }
        bxz0 bxz0Var = (bxz0) obj;
        return wj50.m88271j(this.f32024a, bxz0Var.f32024a) && wj50.m88271j(this.f32025b, bxz0Var.f32025b) && wj50.m88271j(this.f32026c, bxz0Var.f32026c) && wj50.m88271j(this.f32027d, bxz0Var.f32027d);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(s571.m77244c(this.f32024a.hashCode() * 31, 31, this.f32025b), 31, this.f32026c);
        String str = this.f32027d;
        return iM77244c + (str == null ? 0 : str.hashCode());
    }
}
