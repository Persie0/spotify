package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class qx0 implements hi00, Serializable {

    /* JADX INFO: renamed from: a */
    public final Object f193443a;

    /* JADX INFO: renamed from: b */
    public final Class f193444b;

    /* JADX INFO: renamed from: c */
    public final String f193445c;

    /* JADX INFO: renamed from: d */
    public final String f193446d;

    /* JADX INFO: renamed from: e */
    public final boolean f193447e;

    /* JADX INFO: renamed from: f */
    public final int f193448f;

    /* JADX INFO: renamed from: g */
    public final int f193449g;

    public qx0(int i, Class cls, String str, String str2, int i2) {
        this(i, i2, cls, fab.f67502a, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx0)) {
            return false;
        }
        qx0 qx0Var = (qx0) obj;
        return this.f193447e == qx0Var.f193447e && this.f193448f == qx0Var.f193448f && this.f193449g == qx0Var.f193449g && wj50.m88271j(this.f193443a, qx0Var.f193443a) && wj50.m88271j(this.f193444b, qx0Var.f193444b) && this.f193445c.equals(qx0Var.f193445c) && this.f193446d.equals(qx0Var.f193446d);
    }

    @Override // p204p.hi00
    public final int getArity() {
        return this.f193448f;
    }

    public final int hashCode() {
        Object obj = this.f193443a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.f193444b;
        return ((((s571.m77243b(s571.m77243b((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31, this.f193445c), 31, this.f193446d) + (this.f193447e ? 1231 : 1237)) * 31) + this.f193448f) * 31) + this.f193449g;
    }

    public final String toString() {
        return qpv0.f191387a.mo54121k(this);
    }

    public qx0(int i, int i2, Class cls, Object obj, String str, String str2) {
        this.f193443a = obj;
        this.f193444b = cls;
        this.f193445c = str;
        this.f193446d = str2;
        this.f193447e = (i2 & 1) == 1;
        this.f193448f = i;
        this.f193449g = i2 >> 1;
    }
}
