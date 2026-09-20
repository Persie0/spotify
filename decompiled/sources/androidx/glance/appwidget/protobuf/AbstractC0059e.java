package androidx.glance.appwidget.protobuf;

import androidx.car.app.model.Alert;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p204p.b3t0;
import p204p.jgy0;
import p204p.s571;
import p204p.z4a1;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0059e extends AbstractC0055a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC0059e> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected C0065k unknownFields;

    public AbstractC0059e() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C0065k.f936f;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC0059e m666c(Class cls) {
        AbstractC0059e abstractC0059e = defaultInstanceMap.get(cls);
        if (abstractC0059e == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0059e = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC0059e != null) {
            return abstractC0059e;
        }
        AbstractC0059e abstractC0059e2 = (AbstractC0059e) ((AbstractC0059e) z4a1.m95329d(cls)).mo670b(6);
        if (abstractC0059e2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, abstractC0059e2);
        return abstractC0059e2;
    }

    /* JADX INFO: renamed from: d */
    public static Object m667d(Method method, AbstractC0059e abstractC0059e, Object... objArr) {
        try {
            return method.invoke(abstractC0059e, objArr);
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

    /* JADX INFO: renamed from: e */
    public static final boolean m668e(AbstractC0059e abstractC0059e, boolean z) {
        byte bByteValue = ((Byte) abstractC0059e.mo670b(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zMo698b = b3t0.m28052a().m28054c(abstractC0059e).mo698b(abstractC0059e);
        if (z) {
            abstractC0059e.mo670b(2);
        }
        return zMo698b;
    }

    /* JADX INFO: renamed from: i */
    public static void m669i(Class cls, AbstractC0059e abstractC0059e) {
        abstractC0059e.m672g();
        defaultInstanceMap.put(cls, abstractC0059e);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0055a
    /* JADX INFO: renamed from: a */
    public final int mo601a(jgy0 jgy0Var) {
        if (m671f()) {
            int iMo703g = jgy0Var == null ? b3t0.m28052a().m28054c(this).mo703g(this) : jgy0Var.mo703g(this);
            if (iMo703g >= 0) {
                return iMo703g;
            }
            throw new IllegalStateException(s571.m77246e(iMo703g, "serialized size must be non-negative, was "));
        }
        int i = this.memoizedSerializedSize;
        if ((i & Alert.DURATION_SHOW_INDEFINITELY) != Integer.MAX_VALUE) {
            return i & Alert.DURATION_SHOW_INDEFINITELY;
        }
        int iMo703g2 = jgy0Var == null ? b3t0.m28052a().m28054c(this).mo703g(this) : jgy0Var.mo703g(this);
        m674j(iMo703g2);
        return iMo703g2;
    }

    /* JADX INFO: renamed from: b */
    public abstract Object mo670b(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return b3t0.m28052a().m28054c(this).mo705i(this, (AbstractC0059e) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m671f() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    /* JADX INFO: renamed from: g */
    public final void m672g() {
        this.memoizedSerializedSize &= Alert.DURATION_SHOW_INDEFINITELY;
    }

    /* JADX INFO: renamed from: h */
    public final AbstractC0059e m673h() {
        return (AbstractC0059e) mo670b(4);
    }

    public final int hashCode() {
        if (m671f()) {
            return b3t0.m28052a().m28054c(this).mo702f(this);
        }
        if (this.memoizedHashCode == 0) {
            this.memoizedHashCode = b3t0.m28052a().m28054c(this).mo702f(this);
        }
        return this.memoizedHashCode;
    }

    /* JADX INFO: renamed from: j */
    public final void m674j(int i) {
        if (i < 0) {
            throw new IllegalStateException(s571.m77246e(i, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i & Alert.DURATION_SHOW_INDEFINITELY) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final String toString() {
        return AbstractC0060f.m678d(this, super.toString());
    }
}
