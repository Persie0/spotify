package p204p;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class mtf1 {

    /* JADX INFO: renamed from: c */
    public static final mtf1 f147064c = new mtf1();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f147066b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final s5f1 f147065a = new s5f1(1);

    /* JADX INFO: renamed from: a */
    public final duf1 m62822a(Class cls) {
        Charset charset = nnf1.f156416a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f147066b;
        duf1 duf1Var = (duf1) concurrentHashMap.get(cls);
        if (duf1Var != null) {
            return duf1Var;
        }
        duf1 duf1VarM77267o = this.f147065a.m77267o(cls);
        duf1 duf1Var2 = (duf1) concurrentHashMap.putIfAbsent(cls, duf1VarM77267o);
        return duf1Var2 == null ? duf1VarM77267o : duf1Var2;
    }
}
