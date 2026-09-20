package p204p;

import com.spotify.base.java.logging.Logger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class t47 {

    /* JADX INFO: renamed from: a */
    public final r0a f216927a;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f216928b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public final fiz f216929c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ w47 f216930d;

    public t47(w47 w47Var, r0a r0aVar) {
        this.f216930d = w47Var;
        this.f216927a = r0aVar;
        this.f216929c = r0aVar.f194414b;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0089  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        if (r13 == r9) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
    
        if (r13 == r9) goto L34;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m80057a(ibk ibkVar) {
        r47 r47Var;
        fuf fufVar;
        Object objM89557A;
        w47 w47Var = this.f216930d;
        AtomicReference atomicReference = w47Var.f247725f;
        if (ibkVar instanceof r47) {
            r47Var = (r47) ibkVar;
            int i = r47Var.f195671c;
            if ((i & Integer.MIN_VALUE) != 0) {
                r47Var.f195671c = i - Integer.MIN_VALUE;
            } else {
                r47Var = new r47(this, ibkVar);
            }
        } else {
            r47Var = new r47(this, ibkVar);
        }
        Object objM76980u = r47Var.f195669a;
        int i2 = r47Var.f195671c;
        w2a1 w2a1Var = w2a1.f247311a;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    bga.m29073P(objM76980u);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM76980u);
                }
                while (!atomicReference.compareAndSet(this, null) && atomicReference.get() == this) {
                }
                return w2a1Var;
            }
            bga.m29073P(objM76980u);
            if (this.f216928b.compareAndSet(false, true)) {
                if (atomicReference.get() != this || (fufVar = (fuf) w47Var.f247727h.get()) == null) {
                    r0a r0aVar = this.f216927a;
                    r47Var.f195671c = 2;
                    objM89557A = x0h1.m89557A(rnj0.f200934b, new es1(r0aVar.f194417e, r0aVar, fbkVar, 2), r47Var);
                    if (objM89557A != yukVar) {
                        objM89557A = w2a1Var;
                    }
                } else {
                    s47 s47Var = new s47(fufVar, fbkVar, 0);
                    r47Var.f195671c = 1;
                    objM76980u = s1h1.m76980u(1000L, s47Var, r47Var);
                }
                return yukVar;
            }
            return w2a1Var;
            if (objM76980u == null) {
                Logger.m3973i("Timed out waiting for AudioRecord release before clearing input route", new Object[0]);
            }
            r0a r0aVar2 = this.f216927a;
            r47Var.f195671c = 2;
            objM89557A = x0h1.m89557A(rnj0.f200934b, new es1(r0aVar2.f194417e, r0aVar2, fbkVar, 2), r47Var);
            if (objM89557A != yukVar) {
                objM89557A = w2a1Var;
            }
        } catch (Throwable th) {
            while (!atomicReference.compareAndSet(this, null) && atomicReference.get() == this) {
            }
            throw th;
        }
    }
}
