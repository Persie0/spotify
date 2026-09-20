package p204p;

import io.reactivex.rxjava3.core.Observer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class n6t0 extends r0w0 {

    /* JADX INFO: renamed from: b */
    public static final m6t0[] f150951b = new m6t0[0];

    /* JADX INFO: renamed from: a */
    public final AtomicReference f150952a = new AtomicReference(f150951b);

    /* JADX INFO: renamed from: a */
    public final void m63787a(m6t0 m6t0Var) {
        AtomicReference atomicReference;
        m6t0[] m6t0VarArr;
        m6t0[] m6t0VarArr2;
        do {
            atomicReference = this.f150952a;
            m6t0VarArr = (m6t0[]) atomicReference.get();
            m6t0VarArr2 = f150951b;
            if (m6t0VarArr == m6t0VarArr2) {
                return;
            }
            int length = m6t0VarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (m6t0VarArr[i] == m6t0Var) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length != 1) {
                m6t0VarArr2 = new m6t0[length - 1];
                System.arraycopy(m6t0VarArr, 0, m6t0VarArr2, 0, i);
                System.arraycopy(m6t0VarArr, i + 1, m6t0VarArr2, i, (length - i) - 1);
            }
        } while (!tfe.m80660r(atomicReference, m6t0VarArr, m6t0VarArr2));
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        if (obj == null) {
            throw new NullPointerException("value == null");
        }
        for (m6t0 m6t0Var : (m6t0[]) this.f150952a.get()) {
            if (!m6t0Var.get()) {
                m6t0Var.f140574a.onNext(obj);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        AtomicReference atomicReference;
        m6t0[] m6t0VarArr;
        m6t0[] m6t0VarArr2;
        m6t0 m6t0Var = new m6t0(observer, this);
        observer.onSubscribe(m6t0Var);
        do {
            atomicReference = this.f150952a;
            m6t0VarArr = (m6t0[]) atomicReference.get();
            int length = m6t0VarArr.length;
            m6t0VarArr2 = new m6t0[length + 1];
            System.arraycopy(m6t0VarArr, 0, m6t0VarArr2, 0, length);
            m6t0VarArr2[length] = m6t0Var;
        } while (!tfe.m80660r(atomicReference, m6t0VarArr, m6t0VarArr2));
        if (m6t0Var.isDisposed()) {
            m63787a(m6t0Var);
        }
    }
}
