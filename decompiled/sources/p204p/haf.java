package p204p;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class haf extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f89211a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kaf f89212b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public haf(kaf kafVar, fbk fbkVar) {
        super(2, fbkVar);
        this.f89212b = kafVar;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        haf hafVar = new haf(this.f89212b, fbkVar);
        hafVar.f89211a = ((Boolean) obj).booleanValue();
        return hafVar;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        haf hafVar = (haf) create(bool, (fbk) obj2);
        w2a1 w2a1Var = w2a1.f247311a;
        hafVar.invokeSuspend(w2a1Var);
        return w2a1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        Handler handler;
        Handler handler2;
        boolean z = this.f89211a;
        bga.m29073P(obj);
        if (z) {
            kaf kafVar = this.f89212b;
            synchronized (kafVar) {
                if (kafVar.f120891e && (handler2 = kafVar.f120889c) != null) {
                    handler2.sendEmptyMessage(3);
                }
            }
        } else {
            kaf kafVar2 = this.f89212b;
            synchronized (kafVar2) {
                if (kafVar2.f120891e && (handler = kafVar2.f120889c) != null) {
                    handler.sendEmptyMessage(4);
                }
            }
        }
        return w2a1.f247311a;
    }
}
