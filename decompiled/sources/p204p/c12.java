package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c12 {

    /* JADX INFO: renamed from: a */
    public final qt21 f32947a;

    /* JADX INFO: renamed from: b */
    public final scq0 f32948b;

    /* JADX INFO: renamed from: c */
    public final r741 f32949c;

    /* JADX INFO: renamed from: d */
    public final a34 f32950d;

    /* JADX INFO: renamed from: e */
    public final eu3 f32951e;

    /* JADX INFO: renamed from: f */
    public String f32952f = "";

    public c12(qt21 qt21Var, scq0 scq0Var, r741 r741Var, a34 a34Var, eu3 eu3Var) {
        this.f32947a = qt21Var;
        this.f32948b = scq0Var;
        this.f32949c = r741Var;
        this.f32950d = a34Var;
        this.f32951e = eu3Var;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        if (r2.m74888c(r10) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d5, code lost:
    
        if (r11 == r1) goto L47;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m31206a(String str, ibk ibkVar) {
        b12 b12Var;
        Object objM73785a;
        w2a1 w2a1Var = w2a1.f247311a;
        if (ibkVar instanceof b12) {
            b12Var = (b12) ibkVar;
            int i = b12Var.f22184d;
            if ((i & Integer.MIN_VALUE) != 0) {
                b12Var.f22184d = i - Integer.MIN_VALUE;
            } else {
                b12Var = new b12(this, ibkVar);
            }
        } else {
            b12Var = new b12(this, ibkVar);
        }
        b12 b12Var2 = b12Var;
        Object obj = b12Var2.f22182b;
        yuk yukVar = yuk.f276404a;
        int i2 = b12Var2.f22184d;
        if (i2 != 0) {
            if (i2 == 1) {
                str = b12Var2.f22181a;
                bga.m29073P(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = b12Var2.f22181a;
                bga.m29073P(obj);
            }
            this.f32952f = str;
            return w2a1Var;
        }
        bga.m29073P(obj);
        if (wj50.m88271j(str, this.f32952f)) {
            return w2a1Var;
        }
        if (this.f32950d.m24600g() && this.f32949c.m74888c(this.f32952f)) {
            this.f32949c.f196438g = null;
        }
        if (this.f32951e.m40018a()) {
            b12Var2.f22181a = str;
            b12Var2.f22184d = 1;
            qt21 qt21Var = this.f32947a;
            mv0 mv0Var = mv0.f147461b;
            ytg1.m94628s();
            objM73785a = qt21.m73785a(qt21Var, mv0.f147461b, hs21.CLEAR, null, b12Var2, 4);
            if (objM73785a != yukVar) {
                objM73785a = w2a1Var;
            }
            if (objM73785a != yukVar) {
            }
        } else {
            String str2 = this.f32952f;
            r741 r741Var = this.f32949c;
            if (r741Var.m74888c(str2)) {
                b12Var2.f22181a = str;
                b12Var2.f22184d = 1;
                qt21 qt21Var2 = this.f32947a;
                mv0 mv0Var2 = mv0.f147461b;
                ytg1.m94628s();
                objM73785a = qt21.m73785a(qt21Var2, mv0.f147461b, hs21.CLEAR, null, b12Var2, 4);
                if (objM73785a != yukVar) {
                    objM73785a = w2a1Var;
                }
                if (objM73785a != yukVar) {
                }
            }
        }
        return yukVar;
        if (this.f32948b.f207786b.isEmpty()) {
            String strM37458l = dzg1.m37458l(str);
            b12Var2.f22181a = str;
            b12Var2.f22184d = 2;
            qt21 qt21Var3 = this.f32947a;
            mv0 mv0Var3 = mv0.f147461b;
            ytg1.m94628s();
            mv0 mv0Var4 = mv0.f147461b;
            hs21 hs21Var = hs21.FETCH;
            Set set = dd41.f47702f;
            String strM35699F = r46.m74726U(strM37458l).m35699F();
            if (strM35699F == null) {
                strM35699F = "";
            }
            Object objM73785a2 = qt21.m73785a(qt21Var3, mv0Var4, hs21Var, c95.m31821M(pft0.m69840u("context", strM35699F)), b12Var2, 8);
            if (objM73785a2 != yukVar) {
                objM73785a2 = w2a1Var;
            }
        }
        this.f32952f = str;
        return w2a1Var;
    }
}
