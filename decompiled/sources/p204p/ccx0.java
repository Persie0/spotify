package p204p;

import java.lang.annotation.Annotation;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class ccx0 {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f36657a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public final w8b f36658b;

    /* JADX INFO: renamed from: c */
    public final ph30 f36659c;

    /* JADX INFO: renamed from: d */
    public final List f36660d;

    /* JADX INFO: renamed from: e */
    public final int f36661e;

    /* JADX INFO: renamed from: f */
    public final List f36662f;

    /* JADX INFO: renamed from: g */
    public final int f36663g;

    /* JADX INFO: renamed from: h */
    public final Executor f36664h;

    public ccx0(w8b w8bVar, ph30 ph30Var, List list, int i, List list2, int i2, Executor executor) {
        this.f36658b = w8bVar;
        this.f36659c = ph30Var;
        this.f36660d = list;
        this.f36661e = i;
        this.f36662f = list2;
        this.f36663g = i2;
        this.f36664h = executor;
    }

    /* JADX INFO: renamed from: a */
    public final a9b m32328a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = this.f36662f;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            a9b a9bVarMo51667a = ((z8b) list.get(i)).mo51667a(type, annotationArr);
            if (a9bVarMo51667a != null) {
                return a9bVarMo51667a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((z8b) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: b */
    public final Object m32329b(Class cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                sb.append(cls2.getName());
                if (cls2 != cls) {
                    sb.append(" which is an interface of ");
                    sb.append(cls.getName());
                }
                throw new IllegalArgumentException(sb.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new bcx0(this, cls));
    }

    /* JADX INFO: renamed from: c */
    public final tpk m32330c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List list = this.f36660d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            tpk tpkVarMo28551a = ((spk) list.get(i)).mo28551a(type, annotationArr, annotationArr2, this);
            if (tpkVarMo28551a != null) {
                return tpkVarMo28551a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((spk) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: d */
    public final tpk m32331d(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = this.f36660d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            tpk tpkVarMo28552b = ((spk) list.get(i)).mo28552b(type, annotationArr, this);
            if (tpkVarMo28552b != null) {
                return tpkVarMo28552b;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((spk) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: e */
    public final void m32332e(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List list = this.f36660d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((spk) list.get(i)).getClass();
        }
    }
}
