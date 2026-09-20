package p204p;

import com.spotify.playlistmixing.proto.SetTransition;

/* JADX INFO: loaded from: classes9.dex */
public final class r791 {

    /* JADX INFO: renamed from: a */
    public final yz80 f196471a;

    public r791(yz80 yz80Var) {
        this.f196471a = yz80Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final Object m74893a(String str, String str2, gva gvaVar, gh00 gh00Var, ibk ibkVar) {
        m791 m791Var;
        gh00 gh00Var2;
        if (ibkVar instanceof m791) {
            m791Var = (m791) ibkVar;
            int i = m791Var.f140747d;
            if ((i & Integer.MIN_VALUE) != 0) {
                m791Var.f140747d = i - Integer.MIN_VALUE;
            } else {
                m791Var = new m791(this, ibkVar);
            }
        } else {
            m791Var = new m791(this, ibkVar);
        }
        m791 m791Var2 = m791Var;
        Object objM63325v = m791Var2.f140745b;
        int i2 = m791Var2.f140747d;
        if (i2 == 0) {
            bga.m29073P(objM63325v);
            m791Var2.f140744a = (qe70) gh00Var;
            m791Var2.f140747d = 1;
            objM63325v = ((n090) this.f196471a).m63325v(str, str2, "set-transition", gvaVar, m791Var2);
            yuk yukVar = yuk.f276404a;
            if (objM63325v == yukVar) {
                gh00Var2 = gh00Var;
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gh00 gh00Var3 = (gh00) m791Var2.f140744a;
            bga.m29073P(objM63325v);
            gh00Var2 = gh00Var3;
        }
        gh00Var2 = gh00Var;
        p2x0 p2x0Var = (p2x0) objM63325v;
        return p2x0Var instanceof m2x0 ? w2a1.f247311a : new c6x0((Throwable) gh00Var2.invoke(((k2x0) p2x0Var).f118699a.mo27977b()));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: b */
    public final Object m74894b(String str, String str2, ibk ibkVar) {
        n791 n791Var;
        if (ibkVar instanceof n791) {
            n791Var = (n791) ibkVar;
            int i = n791Var.f151118c;
            if ((i & Integer.MIN_VALUE) != 0) {
                n791Var.f151118c = i - Integer.MIN_VALUE;
            } else {
                n791Var = new n791(this, ibkVar);
            }
        } else {
            n791Var = new n791(this, ibkVar);
        }
        n791 n791Var2 = n791Var;
        Object obj = n791Var2.f151116a;
        int i2 = n791Var2.f151118c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return ((s6x0) obj).f206218a;
        }
        bga.m29073P(obj);
        n791Var2.f151118c = 1;
        Object objM74893a = m74893a(str, str2, null, o791.f162496a, n791Var2);
        Object obj2 = yuk.f276404a;
        return objM74893a == obj2 ? obj2 : objM74893a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: c */
    public final Object m74895c(String str, String str2, String str3, String str4, ibk ibkVar) {
        p791 p791Var;
        if (ibkVar instanceof p791) {
            p791Var = (p791) ibkVar;
            int i = p791Var.f174628c;
            if ((i & Integer.MIN_VALUE) != 0) {
                p791Var.f174628c = i - Integer.MIN_VALUE;
            } else {
                p791Var = new p791(this, ibkVar);
            }
        } else {
            p791Var = new p791(this, ibkVar);
        }
        p791 p791Var2 = p791Var;
        Object obj = p791Var2.f174626a;
        int i2 = p791Var2.f174628c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return ((s6x0) obj).f206218a;
        }
        bga.m29073P(obj);
        m601 m601VarM19431r = SetTransition.m19431r();
        m601VarM19431r.m60934r(str3);
        m601VarM19431r.m60935s(str4);
        m601VarM19431r.m60933q();
        gva byteString = ((SetTransition) m601VarM19431r.build()).toByteString();
        p791Var2.f174628c = 1;
        Object objM74893a = m74893a(str, str2, byteString, q791.f186055a, p791Var2);
        Object obj2 = yuk.f276404a;
        return objM74893a == obj2 ? obj2 : objM74893a;
    }
}
