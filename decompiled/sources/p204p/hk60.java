package p204p;

import com.squareup.moshi.JsonDataException;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hk60<T> {

    /* JADX INFO: renamed from: p.hk60$a */
    /* JADX INFO: loaded from: classes11.dex */
    public class C1941a extends hk60<T> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ hk60 f92366a;

        public C1941a(hk60 hk60Var) {
            this.f92366a = hk60Var;
        }

        @Override // p204p.hk60
        public T fromJson(xl60 xl60Var) {
            return (T) this.f92366a.fromJson(xl60Var);
        }

        @Override // p204p.hk60
        public boolean isLenient() {
            return this.f92366a.isLenient();
        }

        @Override // p204p.hk60
        public void toJson(rm60 rm60Var, T t) {
            boolean zM75911o = rm60Var.m75911o();
            rm60Var.m75905J(true);
            try {
                this.f92366a.toJson(rm60Var, t);
            } finally {
                rm60Var.m75905J(zM75911o);
            }
        }

        public String toString() {
            return this.f92366a + ".serializeNulls()";
        }
    }

    /* JADX INFO: renamed from: p.hk60$b */
    /* JADX INFO: loaded from: classes11.dex */
    public class C1942b extends hk60<T> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ hk60 f92368a;

        public C1942b(hk60 hk60Var) {
            this.f92368a = hk60Var;
        }

        @Override // p204p.hk60
        public T fromJson(xl60 xl60Var) {
            boolean zM91388k = xl60Var.m91388k();
            xl60Var.m91383N(true);
            try {
                return (T) this.f92368a.fromJson(xl60Var);
            } finally {
                xl60Var.m91383N(zM91388k);
            }
        }

        @Override // p204p.hk60
        public boolean isLenient() {
            return true;
        }

        @Override // p204p.hk60
        public void toJson(rm60 rm60Var, T t) {
            boolean zM75912p = rm60Var.m75912p();
            rm60Var.m75904I(true);
            try {
                this.f92368a.toJson(rm60Var, t);
            } finally {
                rm60Var.m75904I(zM75912p);
            }
        }

        public String toString() {
            return this.f92368a + ".lenient()";
        }
    }

    /* JADX INFO: renamed from: p.hk60$c */
    /* JADX INFO: loaded from: classes11.dex */
    public class C1943c extends hk60<T> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ hk60 f92370a;

        public C1943c(hk60 hk60Var) {
            this.f92370a = hk60Var;
        }

        @Override // p204p.hk60
        public T fromJson(xl60 xl60Var) {
            boolean zM91386g = xl60Var.m91386g();
            xl60Var.m91382M(true);
            try {
                return (T) this.f92370a.fromJson(xl60Var);
            } finally {
                xl60Var.m91382M(zM91386g);
            }
        }

        @Override // p204p.hk60
        public boolean isLenient() {
            return this.f92370a.isLenient();
        }

        @Override // p204p.hk60
        public void toJson(rm60 rm60Var, T t) {
            this.f92370a.toJson(rm60Var, t);
        }

        public String toString() {
            return this.f92370a + ".failOnUnknown()";
        }
    }

    /* JADX INFO: renamed from: p.hk60$d */
    /* JADX INFO: loaded from: classes11.dex */
    public class C1944d extends hk60<T> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ hk60 f92372a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f92373b;

        public C1944d(hk60 hk60Var, String str) {
            this.f92372a = hk60Var;
            this.f92373b = str;
        }

        @Override // p204p.hk60
        public T fromJson(xl60 xl60Var) {
            return (T) this.f92372a.fromJson(xl60Var);
        }

        @Override // p204p.hk60
        public boolean isLenient() {
            return this.f92372a.isLenient();
        }

        @Override // p204p.hk60
        public void toJson(rm60 rm60Var, T t) {
            String strM75909k = rm60Var.m75909k();
            rm60Var.mo56883G(this.f92373b);
            try {
                this.f92372a.toJson(rm60Var, t);
            } finally {
                rm60Var.mo56883G(strM75909k);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f92372a);
            sb.append(".indent(\"");
            return dq60.m36616p(this.f92373b, "\")", sb);
        }
    }

    /* JADX INFO: renamed from: p.hk60$e */
    public interface InterfaceC1945e {
        hk60<?> create(Type type, Set<? extends Annotation> set, p0i0 p0i0Var);
    }

    public final hk60<T> failOnUnknown() {
        return new C1943c(this);
    }

    public final T fromJson(gqa gqaVar) {
        return fromJson(xl60.m91379z(gqaVar));
    }

    public abstract T fromJson(xl60 xl60Var);

    public final T fromJsonValue(Object obj) {
        try {
            return fromJson(new om60(obj));
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public hk60<T> indent(String str) {
        if (str != null) {
            return new C1944d(this, str);
        }
        throw new NullPointerException("indent == null");
    }

    public boolean isLenient() {
        return false;
    }

    public final hk60<T> lenient() {
        return new C1942b(this);
    }

    public final hk60<T> nonNull() {
        return this instanceof doj0 ? this : new doj0(this);
    }

    public final hk60<T> nullSafe() {
        return this instanceof glk0 ? this : new glk0(this);
    }

    public final hk60<T> serializeNulls() {
        return new C1941a(this);
    }

    public final void toJson(fqa fqaVar, T t) {
        toJson(rm60.m75901x(fqaVar), t);
    }

    public abstract void toJson(rm60 rm60Var, T t);

    public final Object toJsonValue(T t) {
        qm60 qm60Var = new qm60();
        try {
            toJson(qm60Var, t);
            return qm60Var.m73268X();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final T fromJson(String str) {
        npa npaVar = new npa();
        npaVar.m65304Q(str);
        xl60 xl60VarM91379z = xl60.m91379z(npaVar);
        T tFromJson = fromJson(xl60VarM91379z);
        if (isLenient() || xl60VarM91379z.mo51068B() == xl60.EnumC2579c.END_DOCUMENT) {
            return tFromJson;
        }
        throw new JsonDataException("JSON document was not fully consumed.");
    }

    public final String toJson(T t) {
        npa npaVar = new npa();
        try {
            toJson(npaVar, t);
            return npaVar.mo45428s1();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
