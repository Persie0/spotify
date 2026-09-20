package p204p;

import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes2.dex */
public final class lpv0 implements eh00 {

    /* JADX INFO: renamed from: c */
    public static final d5l0 f135848c = new d5l0(2);

    /* JADX INFO: renamed from: a */
    public final eh00 f135849a;

    /* JADX INFO: renamed from: b */
    public volatile SoftReference f135850b;

    public lpv0(Object obj, eh00 eh00Var) {
        if (eh00Var == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
        }
        this.f135850b = null;
        this.f135849a = eh00Var;
        if (obj != null) {
            this.f135850b = new SoftReference(obj);
        }
    }

    @Override // p204p.eh00
    public final Object invoke() {
        Object obj;
        Object obj2 = f135848c;
        SoftReference softReference = this.f135850b;
        if (softReference != null && (obj = softReference.get()) != null) {
            if (obj == obj2) {
                return null;
            }
            return obj;
        }
        Object objInvoke = this.f135849a.invoke();
        if (objInvoke != null) {
            obj2 = objInvoke;
        }
        this.f135850b = new SoftReference(obj2);
        return objInvoke;
    }
}
