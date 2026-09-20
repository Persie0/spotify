package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h9b {

    /* JADX INFO: renamed from: a */
    public final ArrayList f88910a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public int f88911b = 0;

    /* JADX INFO: renamed from: c */
    public boolean f88912c = false;

    /* JADX INFO: renamed from: d */
    public boolean f88913d = false;

    /* JADX INFO: renamed from: a */
    public final void m46865a(long j, un71 un71Var, String str) {
        this.f88910a.add(new zvw0(j, un71Var, str));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h9b)) {
            return false;
        }
        h9b h9bVar = (h9b) obj;
        return wj50.m88271j(this.f88910a, h9bVar.f88910a) && this.f88911b == h9bVar.f88911b && this.f88912c == h9bVar.f88912c && this.f88913d == h9bVar.f88913d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f88913d) + s571.m77245d(mt60.m62800g(this.f88911b, this.f88910a.hashCode() * 31, 31), 31, this.f88912c);
    }
}
