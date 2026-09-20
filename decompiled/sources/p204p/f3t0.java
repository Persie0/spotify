package p204p;

import androidx.datastore.preferences.protobuf.AbstractC0044a;
import androidx.datastore.preferences.protobuf.AbstractC0048e;
import androidx.datastore.preferences.protobuf.AbstractC0052i;
import androidx.datastore.preferences.protobuf.AbstractC0053j;
import androidx.datastore.preferences.protobuf.C0050g;
import androidx.datastore.preferences.protobuf.C0051h;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class f3t0 {

    /* JADX INFO: renamed from: c */
    public static final f3t0 f65577c = new f3t0();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f65579b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final px0 f65578a = new px0(3);

    /* JADX INFO: renamed from: a */
    public final mgy0 m40698a(Class cls) {
        Class cls2;
        ge50.m44454a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f65579b;
        mgy0 mgy0VarM532w = (mgy0) concurrentHashMap.get(cls);
        if (mgy0VarM532w == null) {
            px0 px0Var = this.f65578a;
            px0Var.getClass();
            Class cls3 = AbstractC0052i.f869a;
            if (!AbstractC0048e.class.isAssignableFrom(cls) && (cls2 = AbstractC0052i.f869a) != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
            ebu0 ebu0VarMo48028a = ((zbc0) px0Var.f182174b).mo48028a(cls);
            int i = ebu0VarMo48028a.f58149d;
            AbstractC0044a abstractC0044a = ebu0VarMo48028a.f58146a;
            if ((i & 2) == 2) {
                if (AbstractC0048e.class.isAssignableFrom(cls)) {
                    mgy0VarM532w = C0051h.m562j(AbstractC0052i.f872d, lux.f137165a, abstractC0044a);
                } else {
                    AbstractC0053j abstractC0053j = AbstractC0052i.f870b;
                    hux huxVar = lux.f137166b;
                    if (huxVar == null) {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                    mgy0VarM532w = C0051h.m562j(abstractC0053j, huxVar, abstractC0044a);
                }
            } else if (AbstractC0048e.class.isAssignableFrom(cls)) {
                mgy0VarM532w = (ebu0VarMo48028a.f58149d & 1) == 1 ? C0050g.m532w(ebu0VarMo48028a, hjj0.f92063b, iv80.f106172b, AbstractC0052i.f872d, lux.f137165a, thc0.f220399b) : C0050g.m532w(ebu0VarMo48028a, hjj0.f92063b, iv80.f106172b, AbstractC0052i.f872d, null, thc0.f220399b);
            } else if ((ebu0VarMo48028a.f58149d & 1) == 1) {
                djj0 djj0Var = hjj0.f92062a;
                dv80 dv80Var = iv80.f106171a;
                AbstractC0053j abstractC0053j2 = AbstractC0052i.f870b;
                hux huxVar2 = lux.f137166b;
                if (huxVar2 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                mgy0VarM532w = C0050g.m532w(ebu0VarMo48028a, djj0Var, dv80Var, abstractC0053j2, huxVar2, thc0.f220398a);
            } else {
                mgy0VarM532w = C0050g.m532w(ebu0VarMo48028a, hjj0.f92062a, iv80.f106171a, AbstractC0052i.f871c, null, thc0.f220398a);
            }
            mgy0 mgy0Var = (mgy0) concurrentHashMap.putIfAbsent(cls, mgy0VarM532w);
            if (mgy0Var != null) {
                return mgy0Var;
            }
        }
        return mgy0VarM532w;
    }
}
