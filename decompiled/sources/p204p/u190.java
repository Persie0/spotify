package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class u190 {

    /* JADX INFO: renamed from: a */
    public final String f225720a;

    /* JADX INFO: renamed from: b */
    public final u4l0 f225721b;

    /* JADX INFO: renamed from: c */
    public final ugz f225722c;

    /* JADX INFO: renamed from: d */
    public final l8k f225723d;

    /* JADX INFO: renamed from: e */
    public final luk f225724e;

    /* JADX INFO: renamed from: f */
    public di41 f225725f;

    /* JADX INFO: renamed from: g */
    public i3p0 f225726g;

    /* JADX INFO: renamed from: h */
    public final ou8 f225727h;

    public u190(String str, i3p0 i3p0Var, u4l0 u4l0Var, ugz ugzVar, l8k l8kVar, luk lukVar) {
        this.f225720a = str;
        this.f225721b = u4l0Var;
        this.f225722c = ugzVar;
        this.f225723d = l8kVar;
        this.f225724e = lukVar;
        this.f225726g = i3p0Var;
        this.f225727h = (ou8) u4l0Var.f226773c;
    }

    /* JADX INFO: renamed from: b */
    public final fiz m82196b() {
        l8k l8kVar = this.f225723d;
        return mvl0.m62953p(new nzx0(new xvd(l8kVar.f130882b, (fbk) null, l8kVar, 22)));
    }

    /* JADX INFO: renamed from: c */
    public final Object m82197c(k190 k190Var, String str, fbk fbkVar) {
        Object objM83080V = this.f225722c.m83080V(this.f225720a, new pu80(k190Var), str, this.f225726g, fbkVar);
        return objM83080V == yuk.f276404a ? objM83080V : w2a1.f247311a;
    }

    /* JADX INFO: renamed from: d */
    public final Object m82198d(k190 k190Var, d850 d850Var, fbk fbkVar) {
        Object objM82197c = m82197c(k190Var, d850Var.f46380a.f279709a, fbkVar);
        return objM82197c == yuk.f276404a ? objM82197c : w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        if (r8.f225722c.m83080V(r8.f225720a, p204p.ou80.f170190f, r4, r5, r6) == r7) goto L26;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m82199e(String str, ibk ibkVar) {
        t190 t190Var;
        if (ibkVar instanceof t190) {
            t190Var = (t190) ibkVar;
            int i = t190Var.f216198d;
            if ((i & Integer.MIN_VALUE) != 0) {
                t190Var.f216198d = i - Integer.MIN_VALUE;
            } else {
                t190Var = new t190(this, ibkVar);
            }
        } else {
            t190Var = new t190(this, ibkVar);
        }
        t190 t190Var2 = t190Var;
        Object objM58482e = t190Var2.f216196b;
        int i2 = t190Var2.f216198d;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM58482e);
            t190Var2.f216195a = str;
            t190Var2.f216198d = 1;
            objM58482e = this.f225723d.m58482e(str, t190Var2);
            if (objM58482e != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            str = t190Var2.f216195a;
            bga.m29073P(objM58482e);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM58482e);
        }
        return Boolean.TRUE;
        String str2 = str;
        Boolean bool = (Boolean) objM58482e;
        if (bool != null) {
            return bool;
        }
        i3p0 i3p0Var = this.f225726g;
        t190Var2.f216195a = null;
        t190Var2.f216198d = 2;
    }

    /* JADX INFO: renamed from: f */
    public final Object m82200f(d850 d850Var, ibk ibkVar) {
        return m82199e(d850Var.f46380a.f279709a, ibkVar);
    }
}
