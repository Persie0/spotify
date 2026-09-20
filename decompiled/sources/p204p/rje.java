package p204p;

import io.reactivex.rxjava3.subjects.Subject;

/* JADX INFO: loaded from: classes2.dex */
public final class rje {

    /* JADX INFO: renamed from: a */
    public final String f199797a;

    /* JADX INFO: renamed from: b */
    public final int f199798b;

    /* JADX INFO: renamed from: c */
    public final Subject f199799c;

    public rje(String str, int i, Subject subject) {
        this.f199797a = str;
        this.f199798b = i;
        this.f199799c = subject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rje)) {
            return false;
        }
        rje rjeVar = (rje) obj;
        return wj50.m88271j(this.f199797a, rjeVar.f199797a) && this.f199798b == rjeVar.f199798b && wj50.m88271j(this.f199799c, rjeVar.f199799c);
    }

    public final int hashCode() {
        return this.f199799c.hashCode() + mt60.m62800g(this.f199798b, this.f199797a.hashCode() * 31, 31);
    }
}
