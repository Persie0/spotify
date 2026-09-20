package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class yi81 {

    /* JADX INFO: renamed from: a */
    public final String f273063a;

    /* JADX INFO: renamed from: b */
    public final List f273064b;

    /* JADX INFO: renamed from: c */
    public final boolean f273065c;

    public yi81(String str, List list, boolean z) {
        this.f273063a = str;
        this.f273064b = list;
        this.f273065c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi81)) {
            return false;
        }
        yi81 yi81Var = (yi81) obj;
        return wj50.m88271j(this.f273063a, yi81Var.f273063a) && wj50.m88271j(this.f273064b, yi81Var.f273064b) && this.f273065c == yi81Var.f273065c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f273065c) + s571.m77244c(this.f273063a.hashCode() * 31, 31, this.f273064b);
    }
}
