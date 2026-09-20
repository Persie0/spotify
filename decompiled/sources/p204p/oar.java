package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class oar implements ssi {

    /* JADX INFO: renamed from: a */
    public final z9r f163443a;

    /* JADX INFO: renamed from: b */
    public final voi f163444b;

    /* JADX INFO: renamed from: c */
    public final pri f163445c;

    /* JADX INFO: renamed from: d */
    public final yar f163446d;

    /* JADX INFO: renamed from: e */
    public final cbr f163447e;

    /* JADX INFO: renamed from: f */
    public final dn4 f163448f;

    /* JADX INFO: renamed from: g */
    public final c9k f163449g;

    /* JADX INFO: renamed from: h */
    public final LinkedHashMap f163450h = new LinkedHashMap();

    /* JADX INFO: renamed from: i */
    public final LinkedHashMap f163451i = new LinkedHashMap();

    /* JADX INFO: renamed from: t */
    public final lsi0 f163452t = msi0.m62770a();

    public oar(z9r z9rVar, voi voiVar, pri priVar, yar yarVar, cbr cbrVar, dn4 dn4Var, luk lukVar) {
        this.f163443a = z9rVar;
        this.f163444b = voiVar;
        this.f163445c = priVar;
        this.f163446d = yarVar;
        this.f163447e = cbrVar;
        this.f163448f = dn4Var;
        this.f163449g = edb.m38577z(lukVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: c */
    public static final Object m66573c(oar oarVar, Set set, fbk fbkVar) {
        mar marVar;
        Set setM43736n1;
        Set setM43736n2;
        oarVar.getClass();
        if (fbkVar instanceof mar) {
            marVar = (mar) fbkVar;
            int i = marVar.f141666e;
            if ((i & Integer.MIN_VALUE) != 0) {
                marVar.f141666e = i - Integer.MIN_VALUE;
            } else {
                marVar = new mar(oarVar, fbkVar);
            }
        } else {
            marVar = new mar(oarVar, fbkVar);
        }
        Object obj = marVar.f141664c;
        int i2 = marVar.f141666e;
        Object obj2 = w2a1.f247311a;
        Object obj3 = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            Set set2 = set;
            ArrayList arrayList = new ArrayList(i6f.m49804T(set2, 10));
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                arrayList.add(((gj9) it.next()).m44868a());
            }
            setM43736n1 = g6f.m43736n1(arrayList);
            setM43736n2 = g6f.m43736n1(oarVar.f163450h.keySet());
            marVar.f141662a = setM43736n1;
            marVar.f141663b = setM43736n2;
            marVar.f141666e = 1;
            Object objM66576i = oarVar.m66576i(new lar(oarVar, setM43736n1, setM43736n2, 0), marVar);
            if (objM66576i != obj3) {
                objM66576i = obj2;
            }
            if (objM66576i != obj3) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj2;
        }
        setM43736n2 = marVar.f141663b;
        setM43736n1 = marVar.f141662a;
        bga.m29073P(obj);
        marVar.f141662a = null;
        marVar.f141663b = null;
        marVar.f141666e = 2;
        Object objM66576i2 = oarVar.m66576i(new lar(oarVar, setM43736n1, setM43736n2, 1), marVar);
        if (objM66576i2 != obj3) {
            objM66576i2 = obj2;
        }
        return objM66576i2 == obj3 ? obj3 : obj2;
    }

    /* JADX INFO: renamed from: d */
    public static final Set m66574d(oar oarVar, Set set) {
        oarVar.getClass();
        Set set2 = set;
        ArrayList arrayList = new ArrayList(i6f.m49804T(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(((w9r) it.next()).m87530a());
        }
        return g6f.m43736n1(arrayList);
    }

    @Override // p204p.ssi
    /* JADX INFO: renamed from: a */
    public final void mo24869a() throws Throwable {
        if (this.f163448f.m36449d()) {
            qlg1.m73215t(this.f163449g.f35578a);
            x0h1.m89581x(dau.f47107a, new fop(this, new edq(this, 17), (fbk) null, 19));
        }
    }

    @Override // p204p.ssi
    /* JADX INFO: renamed from: b */
    public final void mo24870b() {
        if (this.f163448f.m36449d()) {
            wxf1.m89255l(this.f163449g, b0g1.m27776L(m66575g(), new C2148n1(this)));
        }
    }

    /* JADX INFO: renamed from: g */
    public final vjz m66575g() {
        z9r z9rVar = this.f163443a;
        return kyf1.m57709n(hqg1.m48279l(g0g1.m43299d(mvl0.m62953p(xtm0.m92074U(z9rVar.f280862g, new x9r(null, z9rVar, 0))), hqg1.m48288u(this.f163445c, this.f163448f.m36450e()), new jar())), new f3q());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public final Object m66576i(eh00 eh00Var, ibk ibkVar) {
        nar narVar;
        lsi0 lsi0Var;
        eh00 eh00Var2;
        if (ibkVar instanceof nar) {
            narVar = (nar) ibkVar;
            int i = narVar.f152113e;
            if ((i & Integer.MIN_VALUE) != 0) {
                narVar.f152113e = i - Integer.MIN_VALUE;
            } else {
                narVar = new nar(this, ibkVar);
            }
        } else {
            narVar = new nar(this, ibkVar);
        }
        Object obj = narVar.f152111c;
        int i2 = narVar.f152113e;
        if (i2 == 0) {
            bga.m29073P(obj);
            narVar.f152109a = (qe70) eh00Var;
            lsi0Var = this.f163452t;
            narVar.f152110b = lsi0Var;
            narVar.f152113e = 1;
            Object objMo54248a = lsi0Var.mo54248a(narVar);
            yuk yukVar = yuk.f276404a;
            if (objMo54248a == yukVar) {
                eh00Var2 = eh00Var;
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lsi0 lsi0Var2 = narVar.f152110b;
            eh00 eh00Var3 = (eh00) narVar.f152109a;
            bga.m29073P(obj);
            lsi0Var = lsi0Var2;
            eh00Var2 = eh00Var3;
        }
        eh00Var2 = eh00Var;
        try {
            return eh00Var2.invoke();
        } finally {
            lsi0Var.mo54249c(null);
        }
    }
}
