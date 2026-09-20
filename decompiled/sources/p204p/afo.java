package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class afo {

    /* JADX INFO: renamed from: a */
    public final List f15180a;

    /* JADX INFO: renamed from: b */
    public final boolean f15181b;

    /* JADX INFO: renamed from: c */
    public final boolean f15182c;

    /* JADX INFO: renamed from: d */
    public final boolean f15183d;

    /* JADX INFO: renamed from: e */
    public final boolean f15184e;

    /* JADX INFO: renamed from: f */
    public final boolean f15185f;

    /* JADX INFO: renamed from: g */
    public final boolean f15186g;

    public afo(List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f15180a = list;
        this.f15181b = z;
        this.f15182c = z2;
        this.f15183d = z3;
        this.f15184e = z4;
        this.f15185f = z5;
        this.f15186g = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afo)) {
            return false;
        }
        afo afoVar = (afo) obj;
        return wj50.m88271j(this.f15180a, afoVar.f15180a) && this.f15181b == afoVar.f15181b && this.f15182c == afoVar.f15182c && this.f15183d == afoVar.f15183d && this.f15184e == afoVar.f15184e && this.f15185f == afoVar.f15185f && this.f15186g == afoVar.f15186g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15186g) + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(this.f15180a.hashCode() * 31, 31, this.f15181b), 31, this.f15182c), 31, this.f15183d), 31, this.f15184e), 31, this.f15185f);
    }
}
