package p204p;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes11.dex */
public final class ipv0 {

    /* JADX INFO: renamed from: a */
    public final Class f104571a;

    /* JADX INFO: renamed from: b */
    public final s18 f104572b;

    public ipv0(Class cls, s18 s18Var) {
        this.f104571a = cls;
        this.f104572b = s18Var;
    }

    /* JADX INFO: renamed from: a */
    public final String m51280a() {
        return this.f104571a.getName().replace('.', '/') + ".class";
    }

    /* JADX INFO: renamed from: b */
    public final void m51281b(yb70 yb70Var) {
        for (Annotation annotation : this.f104571a.getDeclaredAnnotations()) {
            wj50.m88279p(annotation);
            zzg1.m97327z(yb70Var, annotation);
        }
        yb70Var.mo28660c();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ipv0) {
            return wj50.m88271j(this.f104571a, ((ipv0) obj).f104571a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f104571a.hashCode();
    }

    public final String toString() {
        return ipv0.class.getName() + ": " + this.f104571a;
    }
}
