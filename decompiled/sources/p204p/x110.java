package p204p;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes11.dex */
public final class x110 {

    /* JADX INFO: renamed from: a */
    public final AbstractC2155n8 f257027a;

    /* JADX INFO: renamed from: b */
    public final Object f257028b;

    /* JADX INFO: renamed from: c */
    public final AbstractC2155n8 f257029c;

    /* JADX INFO: renamed from: d */
    public final v110 f257030d;

    /* JADX INFO: renamed from: e */
    public final Method f257031e;

    public x110(AbstractC2155n8 abstractC2155n8, Object obj, AbstractC2155n8 abstractC2155n9, v110 v110Var, Class cls) {
        if (abstractC2155n8 == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (v110Var.f236218b == wyd1.f256270f && abstractC2155n9 == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.f257027a = abstractC2155n8;
        this.f257028b = obj;
        this.f257029c = abstractC2155n9;
        this.f257030d = v110Var;
        if (!pd50.class.isAssignableFrom(cls)) {
            this.f257031e = null;
            return;
        }
        try {
            this.f257031e = cls.getMethod("valueOf", Integer.TYPE);
        } catch (NoSuchMethodException e) {
            String name = cls.getName();
            throw new RuntimeException(dq60.m36618r(new StringBuilder(name.length() + 52), "Generated message class \"", name, "\" missing method \"valueOf\"."), e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final Object m89616a(Object obj) {
        if (this.f257030d.f236218b.f256273a != zyd1.ENUM) {
            return obj;
        }
        try {
            return this.f257031e.invoke(null, (Integer) obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m89617b(Object obj) {
        return this.f257030d.f236218b.f256273a == zyd1.ENUM ? Integer.valueOf(((pd50) obj).getNumber()) : obj;
    }
}
