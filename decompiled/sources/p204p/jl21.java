package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class jl21 {

    /* JADX INFO: renamed from: a */
    public final r7s0 f113466a;

    /* JADX INFO: renamed from: b */
    public final c700 f113467b;

    /* JADX INFO: renamed from: c */
    public final ub80 f113468c;

    /* JADX INFO: renamed from: d */
    public final boolean f113469d;

    /* JADX INFO: renamed from: e */
    public final luk f113470e;

    /* JADX INFO: renamed from: f */
    public final kv91 f113471f;

    /* JADX INFO: renamed from: g */
    public final z9j0 f113472g;

    /* JADX INFO: renamed from: h */
    public final k7q f113473h;

    /* JADX INFO: renamed from: i */
    public final String f113474i;

    public jl21(r7s0 r7s0Var, c700 c700Var, ub80 ub80Var, boolean z, luk lukVar, kv91 kv91Var, z9j0 z9j0Var, k7q k7qVar, String str) {
        this.f113466a = r7s0Var;
        this.f113467b = c700Var;
        this.f113468c = ub80Var;
        this.f113469d = z;
        this.f113470e = lukVar;
        this.f113471f = kv91Var;
        this.f113472g = z9j0Var;
        this.f113473h = k7qVar;
        this.f113474i = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Serializable m53647a(String str, ibk ibkVar) {
        gl21 gl21Var;
        Serializable c6x0Var;
        if (ibkVar instanceof gl21) {
            gl21Var = (gl21) ibkVar;
            int i = gl21Var.f80985c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gl21Var.f80985c = i - Integer.MIN_VALUE;
            } else {
                gl21Var = new gl21(this, ibkVar);
            }
        } else {
            gl21Var = new gl21(this, ibkVar);
        }
        Object objM76981v = gl21Var.f80983a;
        int i2 = gl21Var.f80985c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM76981v);
                hvi0 hvi0Var = cks.f39079b;
                long jM54449D = jwg1.m54449D(1, ils.SECONDS);
                vx01 vx01Var = new vx01(this, str, null, 17);
                gl21Var.f80985c = 1;
                objM76981v = s1h1.m76981v(jM54449D, vx01Var, gl21Var);
                yuk yukVar = yuk.f276404a;
                if (objM76981v == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM76981v);
            }
            Boolean bool = (Boolean) objM76981v;
            c6x0Var = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        return c6x0Var instanceof c6x0 ? Boolean.FALSE : c6x0Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0097  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ae, code lost:
    
        if (p204p.x0h1.m89557A(r12.f113470e, r0, r6) == r9) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c5, code lost:
    
        if (r2.invoke(r6) == r9) goto L43;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m53648b(String str, qi2 qi2Var, ibk ibkVar) throws Throwable {
        hl21 hl21Var;
        Object objM55695a;
        String str2;
        gh00 gh00Var;
        boolean zBooleanValue;
        String str3;
        gh00 gh00Var2;
        boolean z;
        if (ibkVar instanceof hl21) {
            hl21Var = (hl21) ibkVar;
            int i = hl21Var.f92597f;
            if ((i & Integer.MIN_VALUE) != 0) {
                hl21Var.f92597f = i - Integer.MIN_VALUE;
            } else {
                hl21Var = new hl21(this, ibkVar);
            }
        } else {
            hl21Var = new hl21(this, ibkVar);
        }
        hl21 hl21Var2 = hl21Var;
        Object obj = hl21Var2.f92595d;
        int i2 = hl21Var2.f92597f;
        fbk fbkVar = null;
        Serializable serializable = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            hl21Var2.f92592a = str;
            hl21Var2.f92593b = qi2Var;
            hl21Var2.f92597f = 1;
            objM55695a = this.f113473h.m55695a(this.f113474i, hl21Var2);
            if (objM55695a != serializable) {
                str2 = str;
                gh00Var = qi2Var;
            }
            return serializable;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    bga.m29073P(obj);
                    return Boolean.TRUE;
                }
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
                return Boolean.FALSE;
            }
            boolean z2 = hl21Var2.f92594c;
            gh00Var2 = hl21Var2.f92593b;
            String str4 = hl21Var2.f92592a;
            bga.m29073P(obj);
            z = z2;
            str3 = str4;
            if (((Boolean) obj).booleanValue()) {
                qw11 qw11Var = new qw11(this, str3, gh00Var2, fbkVar, 1);
                hl21Var2.f92592a = null;
                hl21Var2.f92593b = null;
                hl21Var2.f92594c = z;
                hl21Var2.f92597f = 3;
            } else {
                gh00Var = gh00Var2;
                zBooleanValue = z;
                hl21Var2.f92592a = fbkVar;
                hl21Var2.f92593b = 0;
                hl21Var2.f92594c = zBooleanValue;
                hl21Var2.f92597f = 4;
            }
            return serializable;
        }
        gh00Var = hl21Var2.f92593b;
        String str5 = hl21Var2.f92592a;
        bga.m29073P(obj);
        objM55695a = obj;
        str2 = str5;
        zBooleanValue = ((Boolean) objM55695a).booleanValue();
        if (!this.f113469d || zBooleanValue) {
            hl21Var2.f92592a = fbkVar;
            hl21Var2.f92593b = 0;
            hl21Var2.f92594c = zBooleanValue;
            hl21Var2.f92597f = 4;
        } else {
            hl21Var2.f92592a = str2;
            hl21Var2.f92593b = gh00Var;
            hl21Var2.f92594c = zBooleanValue;
            hl21Var2.f92597f = 2;
            Serializable serializableM53647a = m53647a(str2, hl21Var2);
            if (serializableM53647a != serializable) {
                gh00 gh00Var3 = gh00Var;
                str3 = str2;
                obj = serializableM53647a;
                gh00Var2 = gh00Var3;
                z = zBooleanValue;
                if (((Boolean) obj).booleanValue()) {
                    qw11 qw11Var2 = new qw11(this, str3, gh00Var2, fbkVar, 1);
                    hl21Var2.f92592a = null;
                    hl21Var2.f92593b = null;
                    hl21Var2.f92594c = z;
                    hl21Var2.f92597f = 3;
                } else {
                    gh00Var = gh00Var2;
                    zBooleanValue = z;
                    hl21Var2.f92592a = fbkVar;
                    hl21Var2.f92593b = 0;
                    hl21Var2.f92594c = zBooleanValue;
                    hl21Var2.f92597f = 4;
                }
            }
        }
        return serializable;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m53649c(ibk ibkVar) throws Throwable {
        il21 il21Var;
        if (ibkVar instanceof il21) {
            il21Var = (il21) ibkVar;
            int i = il21Var.f103273c;
            if ((i & Integer.MIN_VALUE) != 0) {
                il21Var.f103273c = i - Integer.MIN_VALUE;
            } else {
                il21Var = new il21(this, ibkVar);
            }
        } else {
            il21Var = new il21(this, ibkVar);
        }
        Object objM55695a = il21Var.f103271a;
        int i2 = il21Var.f103273c;
        if (i2 == 0) {
            bga.m29073P(objM55695a);
            if (this.f113469d) {
                il21Var.f103273c = 1;
                objM55695a = this.f113473h.m55695a(this.f113474i, il21Var);
                Object obj = yuk.f276404a;
                if (objM55695a == obj) {
                    return obj;
                }
            }
            return Boolean.valueOf(z);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bga.m29073P(objM55695a);
        boolean z = ((Boolean) objM55695a).booleanValue() ? false : true;
        return Boolean.valueOf(z);
    }
}
