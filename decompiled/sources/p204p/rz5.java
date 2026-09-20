package p204p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: classes6.dex */
public final class rz5 {

    /* JADX INFO: renamed from: a */
    public final String f204062a;

    /* JADX INFO: renamed from: b */
    public final gcu0 f204063b;

    /* JADX INFO: renamed from: c */
    public final er70 f204064c;

    /* JADX INFO: renamed from: d */
    public final er70 f204065d;

    /* JADX INFO: renamed from: e */
    public final String f204066e;

    /* JADX INFO: renamed from: f */
    public final luk f204067f;

    /* JADX INFO: renamed from: g */
    public final fiz f204068g;

    public rz5(jdp0 jdp0Var, String str, gcu0 gcu0Var, er70 er70Var, er70 er70Var2, String str2, luk lukVar) {
        tlp tlpVar = tlp.f221498c;
        this.f204062a = str;
        this.f204063b = gcu0Var;
        this.f204064c = er70Var;
        this.f204065d = er70Var2;
        this.f204066e = str2;
        this.f204067f = lukVar;
        Flowable flowableMo53041b = jdp0Var.mo53041b();
        d0k[] d0kVarArr = bmu0.f28619a;
        this.f204068g = cyf1.m34374j(new onc(flowableMo53041b), tlpVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b3, code lost:
    
        if (p204p.x0h1.m89557A(r1, r7, r2) == r13) goto L28;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m76779a(c26 c26Var, String str, long j, ibk ibkVar) throws Throwable {
        pz5 pz5Var;
        c26 c26Var2;
        String str2;
        long j2;
        boolean z;
        long j3;
        c26 c26Var3;
        if (ibkVar instanceof pz5) {
            pz5Var = (pz5) ibkVar;
            int i = pz5Var.f183603g;
            if ((i & Integer.MIN_VALUE) != 0) {
                pz5Var.f183603g = i - Integer.MIN_VALUE;
            } else {
                pz5Var = new pz5(this, ibkVar);
            }
        } else {
            pz5Var = new pz5(this, ibkVar);
        }
        Object objM86755t = pz5Var.f183601e;
        int i2 = pz5Var.f183603g;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            fiz fizVarM44321c = this.f204063b.m44321c();
            c26Var2 = c26Var;
            pz5Var.f183597a = c26Var2;
            str2 = str;
            pz5Var.f183598b = str2;
            j2 = j;
            pz5Var.f183599c = j2;
            pz5Var.f183603g = 1;
            objM86755t = vyf1.m86755t(fizVarM44321c, pz5Var);
            if (objM86755t != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            long j4 = pz5Var.f183599c;
            String str3 = pz5Var.f183598b;
            c26 c26Var4 = pz5Var.f183597a;
            bga.m29073P(objM86755t);
            str2 = str3;
            c26Var2 = c26Var4;
            j2 = j4;
        } else if (i2 == 2) {
            z = pz5Var.f183600d;
            j3 = pz5Var.f183599c;
            str2 = pz5Var.f183598b;
            c26 c26Var5 = pz5Var.f183597a;
            bga.m29073P(objM86755t);
            c26Var3 = c26Var5;
            String str4 = str2;
            u190 u190Var = (u190) objM86755t;
            tlp tlpVar = tlp.f221498c;
            ez4 ez4Var = new ez4(str4, c26Var3, u190Var, fbkVar, 2);
            pz5Var.f183597a = null;
            pz5Var.f183598b = null;
            pz5Var.f183599c = j3;
            pz5Var.f183600d = z;
            pz5Var.f183603g = 3;
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86755t);
        }
        return w2a1.f247311a;
        boolean zBooleanValue = ((Boolean) objM86755t).booleanValue();
        ta1 ta1Var = new ta1(zBooleanValue, this, fbkVar, 3);
        pz5Var.f183597a = c26Var2;
        pz5Var.f183598b = str2;
        pz5Var.f183599c = j2;
        pz5Var.f183600d = zBooleanValue;
        pz5Var.f183603g = 2;
        Object objM89557A = x0h1.m89557A(this.f204067f, ta1Var, pz5Var);
        if (objM89557A != yukVar) {
            c26 c26Var6 = c26Var2;
            z = zBooleanValue;
            objM86755t = objM89557A;
            j3 = j2;
            c26Var3 = c26Var6;
            String str5 = str2;
            u190 u190Var2 = (u190) objM86755t;
            tlp tlpVar2 = tlp.f221498c;
            ez4 ez4Var2 = new ez4(str5, c26Var3, u190Var2, fbkVar, 2);
            pz5Var.f183597a = null;
            pz5Var.f183598b = null;
            pz5Var.f183599c = j3;
            pz5Var.f183600d = z;
            pz5Var.f183603g = 3;
        }
        return yukVar;
    }
}
