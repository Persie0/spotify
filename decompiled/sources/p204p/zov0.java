package p204p;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.TypeVariable;
import java.util.Collection;

/* JADX INFO: loaded from: classes11.dex */
public final class zov0 extends y0h1 implements yc60 {

    /* JADX INFO: renamed from: b */
    public final TypeVariable f284878b;

    public zov0(TypeVariable typeVariable) {
        this.f284878b = typeVariable;
    }

    @Override // p204p.yc60
    /* JADX INFO: renamed from: a */
    public final cov0 mo26729a(y400 y400Var) {
        Annotation[] declaredAnnotations;
        TypeVariable typeVariable = this.f284878b;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return c0h1.m31160n(declaredAnnotations, y400Var);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zov0) {
            return wj50.m88271j(this.f284878b, ((zov0) obj).f284878b);
        }
        return false;
    }

    @Override // p204p.yc60
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        TypeVariable typeVariable = this.f284878b;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        return (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) ? lau.f131415a : c0h1.m31161o(declaredAnnotations);
    }

    public final int hashCode() {
        return this.f284878b.hashCode();
    }

    public final String toString() {
        return zov0.class.getName() + ": " + this.f284878b;
    }
}
