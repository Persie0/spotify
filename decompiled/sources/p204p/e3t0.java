package p204p;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.AbstractC0273l;
import com.google.protobuf.AbstractC0274m;
import com.google.protobuf.C0267f;
import com.google.protobuf.C0271j;
import com.google.protobuf.C0272k;
import com.google.protobuf.C0276o;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e3t0 {

    /* JADX INFO: renamed from: c */
    public static final e3t0 f55882c = new e3t0();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f55884b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final px0 f55883a = new px0(2);

    /* JADX INFO: renamed from: a */
    public final lgy0 m37694a(Class cls) {
        lgy0 lgy0VarM2127B;
        Class cls2;
        ee50.m38645a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f55884b;
        lgy0 lgy0Var = (lgy0) concurrentHashMap.get(cls);
        if (lgy0Var != null) {
            return lgy0Var;
        }
        px0 px0Var = this.f55883a;
        px0Var.getClass();
        Class cls3 = AbstractC0273l.f2478a;
        if (!AbstractC0269h.class.isAssignableFrom(cls) && (cls2 = AbstractC0273l.f2478a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        doe0 doe0VarMo45339a = ((ybc0) px0Var.f182174b).mo45339a(cls);
        if (doe0VarMo45339a.mo35605a()) {
            if (AbstractC0269h.class.isAssignableFrom(cls)) {
                lgy0VarM2127B = new C0272k(AbstractC0273l.f2480c, kux.f126727a, doe0VarMo45339a.mo35606b());
            } else {
                AbstractC0274m abstractC0274m = AbstractC0273l.f2479b;
                dux duxVar = kux.f126728b;
                if (duxVar == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                lgy0VarM2127B = new C0272k(abstractC0274m, duxVar, doe0VarMo45339a.mo35606b());
            }
        } else if (AbstractC0269h.class.isAssignableFrom(cls)) {
            cjj0 cjj0Var = gjj0.f80491b;
            C0267f c0267f = null;
            kv80 kv80Var = mv80.f147531b;
            C0276o c0276o = AbstractC0273l.f2480c;
            if (edb.m38547C(doe0VarMo45339a.mo35607c()) != 1) {
                c0267f = kux.f126727a;
            }
            lgy0VarM2127B = C0271j.m2127B(doe0VarMo45339a, cjj0Var, kv80Var, c0276o, c0267f, shc0.f209170b);
        } else {
            dux duxVar2 = null;
            yij0 yij0Var = gjj0.f80490a;
            hv80 hv80Var = mv80.f147530a;
            AbstractC0274m abstractC0274m2 = AbstractC0273l.f2479b;
            if (edb.m38547C(doe0VarMo45339a.mo35607c()) != 1 && (duxVar2 = kux.f126728b) == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            lgy0VarM2127B = C0271j.m2127B(doe0VarMo45339a, yij0Var, hv80Var, abstractC0274m2, duxVar2, shc0.f209169a);
        }
        lgy0 lgy0Var2 = (lgy0) concurrentHashMap.putIfAbsent(cls, lgy0VarM2127B);
        return lgy0Var2 != null ? lgy0Var2 : lgy0VarM2127B;
    }
}
