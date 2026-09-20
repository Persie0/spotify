package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class kmv {

    /* JADX INFO: renamed from: a */
    public final mq8 f124213a;

    /* JADX INFO: renamed from: b */
    public final List f124214b;

    /* JADX INFO: renamed from: c */
    public final mqo0 f124215c;

    /* JADX INFO: renamed from: d */
    public final boolean f124216d;

    public kmv(mq8 mq8Var, List list, mqo0 mqo0Var, boolean z) {
        this.f124213a = mq8Var;
        this.f124214b = list;
        this.f124215c = mqo0Var;
        this.f124216d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmv)) {
            return false;
        }
        kmv kmvVar = (kmv) obj;
        return wj50.m88271j(this.f124213a, kmvVar.f124213a) && wj50.m88271j(this.f124214b, kmvVar.f124214b) && wj50.m88271j(this.f124215c, kmvVar.f124215c) && this.f124216d == kmvVar.f124216d;
    }

    public final int hashCode() {
        mq8 mq8Var = this.f124213a;
        int iHashCode = (mq8Var == null ? 0 : mq8Var.hashCode()) * 31;
        List list = this.f124214b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        mqo0 mqo0Var = this.f124215c;
        return Boolean.hashCode(this.f124216d) + ((iHashCode2 + (mqo0Var != null ? mqo0Var.hashCode() : 0)) * 31);
    }
}
