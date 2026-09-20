package p204p;

import java.util.ArrayList;

/* JADX INFO: renamed from: p.mg */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2126mg implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f143245a;

    public /* synthetic */ C2126mg(int i) {
        this.f143245a = i;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // p204p.gh00
    public final Object invoke(Object obj) throws Exception {
        switch (this.f143245a) {
            case 0:
                float f = AbstractC2163ng.f153489a;
                return w2a1.f247311a;
            case 1:
                return Float.valueOf(((Float) obj).floatValue() / 2.0f);
            case 2:
                return Boolean.TRUE;
            case 3:
                return Boolean.TRUE;
            case 4:
                ((Integer) obj).getClass();
                return Float.valueOf(Float.NaN);
            case 5:
                return Boolean.TRUE;
            case 6:
                return Boolean.valueOf(!(((e15) obj) instanceof vsm0));
            case 7:
                bns bnsVar = w45.f247705a;
                return w2a1.f247311a;
            case 8:
                int i = d39.f44813b;
                return w2a1.f247311a;
            case 9:
                ((tgj) obj).mo50174s1();
                return w2a1.f247311a;
            case 10:
                return Boolean.TRUE;
            case 11:
                jpz0.m54007u((mpz0) obj, 0);
                return w2a1.f247311a;
            case 12:
                jpz0.m54007u((mpz0) obj, 0);
                return w2a1.f247311a;
            case 13:
                jpz0.m54007u((mpz0) obj, 0);
                return w2a1.f247311a;
            case 14:
                return w2a1.f247311a;
            case 15:
                jwm0 jwm0Var = (jwm0) ((ce91) obj);
                jwm0Var.f116659N0 = false;
                iig1.m50728o(jwm0Var);
                return Boolean.FALSE;
            case 16:
                return w2a1.f247311a;
            case 17:
                ezx0 ezx0VarMo63454G1 = ((yyx0) obj).mo63454G1("DELETE FROM device_broadcasts");
                try {
                    ezx0VarMo63454G1.mo24841E1();
                    return w2a1.f247311a;
                } finally {
                    ezx0VarMo63454G1.close();
                }
            case 18:
                ezx0 ezx0VarMo63454G2 = ((yyx0) obj).mo63454G1("SELECT * FROM device_broadcasts");
                try {
                    int iM88306q = wjf1.m88306q(ezx0VarMo63454G2, "id");
                    int iM88306q2 = wjf1.m88306q(ezx0VarMo63454G2, "from");
                    int iM88306q3 = wjf1.m88306q(ezx0VarMo63454G2, "deviceId");
                    int iM88306q4 = wjf1.m88306q(ezx0VarMo63454G2, "createdAt");
                    ArrayList arrayList = new ArrayList();
                    while (ezx0VarMo63454G2.mo24841E1()) {
                        arrayList.add(new pve(ezx0VarMo63454G2.isNull(iM88306q) ? null : Integer.valueOf((int) ezx0VarMo63454G2.getLong(iM88306q)), ezx0VarMo63454G2.isNull(iM88306q2) ? null : ezx0VarMo63454G2.mo24844h1(iM88306q2), ezx0VarMo63454G2.isNull(iM88306q3) ? null : ezx0VarMo63454G2.mo24844h1(iM88306q3), ezx0VarMo63454G2.isNull(iM88306q4) ? null : Long.valueOf(ezx0VarMo63454G2.getLong(iM88306q4))));
                        break;
                    }
                    return arrayList;
                } finally {
                    ezx0VarMo63454G2.close();
                }
            case 19:
                huk hukVar = (huk) obj;
                if (hukVar instanceof luk) {
                    return (luk) hukVar;
                }
                return null;
            case 20:
                jpz0.m53985C((mpz0) obj, true);
                return w2a1.f247311a;
            case 21:
                jpz0.m53985C((mpz0) obj, true);
                return w2a1.f247311a;
            case 22:
                float f2 = ods.f164240a;
                return w2a1.f247311a;
            case 23:
                return Boolean.TRUE;
            case 24:
                return Boolean.TRUE;
            case 25:
                float f3 = igs.f102045a;
                return Boolean.TRUE;
            case 26:
                synchronized (ua31.f228351c) {
                    ?? r1 = ua31.f228357i;
                    int size = r1.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((gh00) r1.get(i2)).invoke(obj);
                    }
                }
                return w2a1.f247311a;
            case 27:
                ((tgj) obj).mo50174s1();
                return w2a1.f247311a;
            case 28:
                return w2a1.f247311a;
            default:
                ((t571) obj).m80104m(null);
                return w2a1.f247311a;
        }
    }
}
