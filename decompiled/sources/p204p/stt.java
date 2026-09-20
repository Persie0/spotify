package p204p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class stt {

    /* JADX INFO: renamed from: c */
    public static final Set f213949c = bk5.m29624m1(new String[]{"com.samsung.android.app.galaxyfinder", "com.sec.android.app.launcher"});

    /* JADX INFO: renamed from: a */
    public final h9d0 f213950a;

    /* JADX INFO: renamed from: b */
    public final fiz f213951b;

    public stt(h9d0 h9d0Var, fiz fizVar) {
        this.f213950a = h9d0Var;
        this.f213951b = fizVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009d, code lost:
    
        if (r0 == r5) goto L31;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m79316a(String str, String str2, String str3, ye30 ye30Var, ibk ibkVar) {
        rtt rttVar;
        String str4;
        String str5;
        ye30 ye30Var2;
        String str6;
        if (ibkVar instanceof rtt) {
            rttVar = (rtt) ibkVar;
            int i = rttVar.f202650g;
            if ((i & Integer.MIN_VALUE) != 0) {
                rttVar.f202650g = i - Integer.MIN_VALUE;
            } else {
                rttVar = new rtt(this, ibkVar);
            }
        } else {
            rttVar = new rtt(this, ibkVar);
        }
        Object objM86757v = rttVar.f202648e;
        int i2 = rttVar.f202650g;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    ye30 ye30Var3 = rttVar.f202647d;
                    String str7 = rttVar.f202646c;
                    String str8 = rttVar.f202645b;
                    String str9 = rttVar.f202644a;
                    bga.m29073P(objM86757v);
                    ye30Var2 = ye30Var3;
                    str5 = str7;
                    str6 = str8;
                    str4 = str9;
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM86757v);
                }
                return (List) objM86757v;
            }
            bga.m29073P(objM86757v);
            pox poxVarM76722t = ryf1.m76722t(this.f213951b, 1);
            rttVar.f202644a = str;
            rttVar.f202645b = str2;
            rttVar.f202646c = str3;
            rttVar.f202647d = ye30Var;
            rttVar.f202650g = 1;
            objM86757v = vyf1.m86757v(poxVarM76722t, rttVar);
            if (objM86757v != yukVar) {
                str4 = str;
                str5 = str3;
                ye30Var2 = ye30Var;
                str6 = str2;
            }
            return yukVar;
            m3y0 m3y0Var = (m3y0) objM86757v;
            g9d0 g9d0Var = new g9d0(str6, str5, str4, 0, m3y0Var != null ? m3y0Var.f139779a.m26193b() & g6f.m43725i0(f213949c, str6) : false, ye30Var2, 8);
            h9d0 h9d0Var = this.f213950a;
            rttVar.f202644a = null;
            rttVar.f202645b = null;
            rttVar.f202646c = null;
            rttVar.f202647d = null;
            rttVar.f202650g = 2;
            objM86757v = h9d0Var.mo38243a(g9d0Var, rttVar);
        } catch (Throwable th) {
            return new c6x0(th);
        }
    }
}
