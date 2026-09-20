package p204p;

import androidx.car.app.model.Alert;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class hhy0 {

    /* JADX INFO: renamed from: a */
    public final qgy0 f91614a;

    /* JADX INFO: renamed from: b */
    public final c9k f91615b;

    /* JADX INFO: renamed from: c */
    public final bqa f91616c;

    /* JADX INFO: renamed from: d */
    public final AtomicReference f91617d;

    /* JADX INFO: renamed from: e */
    public final lsi0 f91618e;

    public hhy0(qgy0 qgy0Var, luk lukVar) {
        this.f91614a = qgy0Var;
        c9k c9kVarM56661c = kk40.m56661c(cct.m32296A(lukVar, new uuk("ScopeExecutorImpl")));
        this.f91615b = c9kVarM56661c;
        this.f91616c = xtm0.m92080a(Alert.DURATION_SHOW_INDEFINITELY, 0, 6);
        this.f91617d = new AtomicReference();
        this.f91618e = new lsi0(true);
        x0h1.m89578u(c9kVarM56661c, null, 0, new cj40(this, null, 25), 3);
        ((jph0) qgy0Var).m53953f(new snx0(this, 10), new f8w0(this, 27));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b6 A[Catch: all -> 0x00d2, TRY_LEAVE, TryCatch #0 {all -> 0x00d2, blocks: (B:25:0x007f, B:27:0x00b6, B:34:0x00d4, B:35:0x00fb), top: B:38:0x007f }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00ca A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00d4 A[Catch: all -> 0x00d2, TRY_ENTER, TryCatch #0 {all -> 0x00d2, blocks: (B:25:0x007f, B:27:0x00b6, B:34:0x00d4, B:35:0x00fb), top: B:38:0x007f }] */
    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c8 -> B:31:0x00cb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:41:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public static final void m47614a(p204p.hhy0 r11, p204p.ibk r12) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.hhy0.m47614a(p.hhy0, p.ibk):void");
    }
}
