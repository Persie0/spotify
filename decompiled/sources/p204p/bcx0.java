package p204p;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class bcx0 implements InvocationHandler {

    /* JADX INFO: renamed from: a */
    public final Object[] f25951a = new Object[0];

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Class f25952b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ccx0 f25953c;

    public bcx0(ccx0 ccx0Var, Class cls) {
        this.f25953c = ccx0Var;
        this.f25952b = cls;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        lh30 lh30VarM58944b;
        lh30 lh30Var;
        Class cls = this.f25952b;
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        if (objArr == null) {
            objArr = this.f25951a;
        }
        Object[] objArr2 = objArr;
        t5m0 t5m0Var = xco0.f260271b;
        if (t5m0Var.mo67580e(method)) {
            return t5m0Var.mo67579d(cls, obj, method, objArr2);
        }
        ccx0 ccx0Var = this.f25953c;
        while (true) {
            Object objPutIfAbsent = ccx0Var.f36657a.get(method);
            if (!(objPutIfAbsent instanceof lh30)) {
                if (objPutIfAbsent == null) {
                    Object obj2 = new Object();
                    synchronized (obj2) {
                        try {
                            objPutIfAbsent = ccx0Var.f36657a.putIfAbsent(method, obj2);
                            if (objPutIfAbsent == null) {
                                try {
                                    lh30VarM58944b = lh30.m58944b(ccx0Var, cls, method);
                                    ccx0Var.f36657a.put(method, lh30VarM58944b);
                                } catch (Throwable th) {
                                    ccx0Var.f36657a.remove(method);
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                synchronized (objPutIfAbsent) {
                    try {
                        Object obj3 = ccx0Var.f36657a.get(method);
                        if (obj3 != null) {
                            lh30Var = (lh30) obj3;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                break;
            }
            lh30VarM58944b = (lh30) objPutIfAbsent;
            lh30Var = lh30VarM58944b;
        }
        return lh30Var.mo53326a(new x4l0(lh30Var.f133357a, obj, objArr2, lh30Var.f133358b, lh30Var.f133359c), objArr2);
    }
}
