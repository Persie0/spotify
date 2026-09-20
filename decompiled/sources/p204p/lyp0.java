package p204p;

import android.content.Intent;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class lyp0 extends mb61 implements th00 {

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ Object f138088X;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f138089a = 1;

    /* JADX INFO: renamed from: b */
    public int f138090b;

    /* JADX INFO: renamed from: c */
    public int f138091c;

    /* JADX INFO: renamed from: d */
    public int f138092d;

    /* JADX INFO: renamed from: e */
    public int f138093e;

    /* JADX INFO: renamed from: f */
    public Object f138094f;

    /* JADX INFO: renamed from: g */
    public Object f138095g;

    /* JADX INFO: renamed from: h */
    public Object f138096h;

    /* JADX INFO: renamed from: i */
    public Object f138097i;

    /* JADX INFO: renamed from: t */
    public Object f138098t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lyp0(List list, int i, vum0 vum0Var, kqi0 kqi0Var, fbk fbkVar) {
        super(2, fbkVar);
        this.f138097i = list;
        this.f138093e = i;
        this.f138098t = vum0Var;
        this.f138088X = kqi0Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f138089a) {
            case 0:
                return new lyp0((myp0) this.f138088X, fbkVar);
            case 1:
                return new lyp0((List) this.f138097i, this.f138093e, (vum0) this.f138098t, (kqi0) this.f138088X, fbkVar);
            case 2:
                return new lyp0((y291) this.f138094f, (yw70) this.f138095g, (tvt0) this.f138096h, (kqi0) this.f138097i, (kqi0) this.f138098t, (kqi0) this.f138088X, fbkVar);
            default:
                lyp0 lyp0Var = new lyp0((iud1) this.f138098t, (Intent) this.f138088X, fbkVar);
                lyp0Var.f138097i = obj;
                return lyp0Var;
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f138089a) {
            case 0:
                ((lyp0) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
                return yuk.f276404a;
            case 1:
                return ((lyp0) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 2:
                return ((lyp0) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            default:
                return ((lyp0) create((int[]) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:136:0x0332  */
    /* JADX WARN: Code duplicated, block: B:139:0x034d  */
    /* JADX WARN: Code duplicated, block: B:142:0x036a  */
    /* JADX WARN: Code duplicated, block: B:145:0x03a8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:130:0x0310 -> B:131:0x0316). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:150:0x03cc -> B:152:0x03cf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x006e -> B:16:0x0070). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x01ee -> B:92:0x01f1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x0225 -> B:99:0x0227). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p204p.ly8
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 994
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.lyp0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lyp0(myp0 myp0Var, fbk fbkVar) {
        super(2, fbkVar);
        this.f138088X = myp0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lyp0(y291 y291Var, yw70 yw70Var, tvt0 tvt0Var, kqi0 kqi0Var, kqi0 kqi0Var2, kqi0 kqi0Var3, fbk fbkVar) {
        super(2, fbkVar);
        this.f138094f = y291Var;
        this.f138095g = yw70Var;
        this.f138096h = tvt0Var;
        this.f138097i = kqi0Var;
        this.f138098t = kqi0Var2;
        this.f138088X = kqi0Var3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lyp0(iud1 iud1Var, Intent intent, fbk fbkVar) {
        super(2, fbkVar);
        this.f138098t = iud1Var;
        this.f138088X = intent;
    }
}
