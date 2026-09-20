package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ly8 implements fbk, zuk, Serializable {
    private final fbk<Object> completion;

    public ly8(fbk fbkVar) {
        this.completion = fbkVar;
    }

    public fbk<w2a1> create(fbk<?> fbkVar) {
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public zuk getCallerFrame() {
        fbk<Object> fbkVar = this.completion;
        if (fbkVar instanceof zuk) {
            return (zuk) fbkVar;
        }
        return null;
    }

    public final fbk<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return wcg1.m87744i(this);
    }

    public abstract Object invokeSuspend(Object obj);

    @Override // p204p.fbk
    public final void resumeWith(Object obj) {
        fbk<Object> fbkVar = this;
        while (true) {
            ly8 ly8Var = (ly8) fbkVar;
            fbk<Object> fbkVar2 = ly8Var.completion;
            wj50.m88279p(fbkVar2);
            try {
                obj = ly8Var.invokeSuspend(obj);
                if (obj == yuk.f276404a) {
                    return;
                }
            } catch (Throwable th) {
                obj = new c6x0(th);
            }
            ly8Var.releaseIntercepted();
            if (!(fbkVar2 instanceof ly8)) {
                fbkVar2.resumeWith(obj);
                return;
            }
            fbkVar = fbkVar2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public fbk<w2a1> create(Object obj, fbk<?> fbkVar) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
