package p204p;

import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import com.spotify.externalintegration.loggingservice.events.proto.ExternalAccessoryRemoteInteraction;
import io.reactivex.rxjava3.core.Single;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class myx {

    /* JADX INFO: renamed from: a */
    public final qre0 f148548a;

    /* JADX INFO: renamed from: b */
    public final d2j0 f148549b;

    /* JADX INFO: renamed from: c */
    public final voi f148550c;

    /* JADX INFO: renamed from: d */
    public final kv91 f148551d;

    /* JADX INFO: renamed from: e */
    public final u57 f148552e;

    /* JADX INFO: renamed from: f */
    public final i4t0 f148553f;

    /* JADX INFO: renamed from: g */
    public final List f148554g = h6f.m46715L("com.android.bluetooth", "com.google.android.bluetooth");

    /* JADX INFO: renamed from: h */
    public final eag0 f148555h = new eag0();

    public myx(qre0 qre0Var, d2j0 d2j0Var, voi voiVar, kv91 kv91Var, u57 u57Var, slq slqVar) {
        this.f148548a = qre0Var;
        this.f148549b = d2j0Var;
        this.f148550c = voiVar;
        this.f148551d = kv91Var;
        this.f148552e = u57Var;
        this.f148553f = slqVar;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Single m63213e(myx myxVar, ExternalAccessoryDescription externalAccessoryDescription, String str, av91 av91Var, z650 z650Var, int i) {
        if ((i & 4) != 0) {
            av91Var = null;
        }
        if ((i & 8) != 0) {
            z650Var = null;
        }
        return myxVar.m63218d(externalAccessoryDescription, str, av91Var, z650Var, 1);
    }

    /* JADX INFO: renamed from: p */
    public static Single m63214p(myx myxVar, ExternalAccessoryDescription externalAccessoryDescription, av91 av91Var) {
        myxVar.getClass();
        return Single.defer(new jt2(null, myxVar, av91Var, externalAccessoryDescription, 1));
    }

    /* JADX INFO: renamed from: a */
    public final ExternalAccessoryRemoteInteraction m63215a(ExternalAccessoryDescription externalAccessoryDescription, av91 av91Var, String str, String str2, String str3) {
        gwx gwxVarM10569E = ExternalAccessoryRemoteInteraction.m10569E();
        gwxVarM10569E.m45999z(str);
        if (av91Var.f20129d.m34010a().m30591b().length() > 0) {
            gwxVarM10569E.m45994u(av91Var.f20129d.m34010a().m30591b());
        }
        String str4 = externalAccessoryDescription.integrationType;
        String str5 = externalAccessoryDescription.senderId;
        String str6 = externalAccessoryDescription.p.kyx.b java.lang.String;
        String str7 = externalAccessoryDescription.version;
        String str8 = externalAccessoryDescription.model;
        String str9 = externalAccessoryDescription.company;
        String str10 = externalAccessoryDescription.name;
        String str11 = externalAccessoryDescription.p.kyx.c java.lang.String;
        String str12 = externalAccessoryDescription.p.kyx.d java.lang.String;
        String str13 = externalAccessoryDescription.p.kyx.e java.lang.String;
        if (str4.length() > 0) {
            gwxVarM10569E.m45998y(externalAccessoryDescription.integrationType);
        }
        if (str13.length() > 0) {
            gwxVarM10569E.m45984B(str13);
        }
        if (str12.length() > 0) {
            gwxVarM10569E.m45987E(str12);
        }
        if (str11.length() > 0) {
            gwxVarM10569E.m45993t(str11);
        }
        if (str10.length() > 0) {
            gwxVarM10569E.m45992s(str10);
        }
        if (str9.length() > 0) {
            gwxVarM10569E.m45996w(str9);
        }
        if (str8.length() > 0) {
            gwxVarM10569E.m45983A(str8);
        }
        if (str7.length() > 0) {
            gwxVarM10569E.m45988F(str7);
        }
        if (str6.length() > 0) {
            gwxVarM10569E.m45997x(str6);
        }
        if (str5.length() > 0) {
            gwxVarM10569E.m45986D(str5);
        }
        if (str2 != null) {
            gwxVarM10569E.m45985C(str2);
        }
        if (str3 != null) {
            gwxVarM10569E.m45995v(str3);
        }
        if (this.f148554g.contains(gwxVarM10569E.m45989m()) && !gwxVarM10569E.m45990q()) {
            List list = (List) ((avo) ((InterfaceC2258pj) this.f148553f.get())).f20229f.getValue();
            if (list.size() != 1) {
                list = null;
            }
            InterfaceC2415th interfaceC2415th = list != null ? (InterfaceC2415th) list.get(0) : null;
            if (interfaceC2415th != null) {
                C1742ci c1742ci = (C1742ci) interfaceC2415th;
                String str14 = c1742ci.f38159b;
                if (str14 != null && str14.length() != 0) {
                    gwxVarM10569E.m45992s(str14);
                }
                String str15 = c1742ci.f38161d;
                if (str15 == null) {
                    str15 = "1024";
                }
                gwxVarM10569E.m45991r(str15);
            }
        }
        return (ExternalAccessoryRemoteInteraction) gwxVarM10569E.build();
    }

    /* JADX INFO: renamed from: b */
    public final Single m63216b(ExternalAccessoryDescription externalAccessoryDescription, boolean z) {
        return this.f148549b.m34698e().flatMap(new C1668ai(this, externalAccessoryDescription, z, 17));
    }

    /* JADX INFO: renamed from: c */
    public final Single m63217c(ExternalAccessoryDescription externalAccessoryDescription) {
        return this.f148549b.m34698e().flatMap(new nps(18, externalAccessoryDescription, this));
    }

    /* JADX INFO: renamed from: d */
    public final Single m63218d(ExternalAccessoryDescription externalAccessoryDescription, String str, av91 av91Var, z650 z650Var, int i) {
        av91 av91VarM38289j;
        int iM38547C = edb.m38547C(i);
        eag0 eag0Var = this.f148555h;
        if (iM38547C == 0) {
            av91VarM38289j = eag0Var.m38289j(str);
        } else {
            if (iM38547C != 1) {
                throw new NoWhenBranchMatchedException();
            }
            av91VarM38289j = eag0Var.m38298s(str);
        }
        return Single.defer(new jt2(z650Var, this, av91Var == null ? av91VarM38289j : av91Var, externalAccessoryDescription, 1));
    }

    /* JADX INFO: renamed from: f */
    public final Single m63219f(ExternalAccessoryDescription externalAccessoryDescription) {
        return m63214p(this, externalAccessoryDescription, this.f148555h.m38292m());
    }

    /* JADX INFO: renamed from: g */
    public final Single m63220g(ExternalAccessoryDescription externalAccessoryDescription) {
        return m63214p(this, externalAccessoryDescription, this.f148555h.m38291l());
    }

    /* JADX INFO: renamed from: h */
    public final Single m63221h(ExternalAccessoryDescription externalAccessoryDescription) {
        return m63214p(this, externalAccessoryDescription, this.f148555h.m38293n());
    }

    /* JADX INFO: renamed from: i */
    public final Single m63222i(ExternalAccessoryDescription externalAccessoryDescription) {
        return this.f148549b.m34698e().flatMap(new j2r(25, externalAccessoryDescription, this));
    }

    /* JADX INFO: renamed from: j */
    public final Single m63223j(long j, ExternalAccessoryDescription externalAccessoryDescription) {
        return m63214p(this, externalAccessoryDescription, this.f148555h.m38295p(Integer.valueOf((int) j)));
    }

    /* JADX INFO: renamed from: k */
    public final Single m63224k(long j, ExternalAccessoryDescription externalAccessoryDescription) {
        return m63214p(this, externalAccessoryDescription, this.f148555h.m38296q(Integer.valueOf((int) j)));
    }

    /* JADX INFO: renamed from: l */
    public final Single m63225l(ExternalAccessoryDescription externalAccessoryDescription, int i, int i2) {
        int i3;
        int iM38547C = edb.m38547C(i);
        int i4 = 3;
        if (iM38547C == 0) {
            i3 = 1;
        } else if (iM38547C == 1) {
            i3 = 2;
        } else {
            if (iM38547C != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i3 = 3;
        }
        int iM38547C2 = edb.m38547C(i2);
        if (iM38547C2 == 0) {
            i4 = 1;
        } else if (iM38547C2 == 1) {
            i4 = 2;
        } else if (iM38547C2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return m63214p(this, externalAccessoryDescription, this.f148555h.m38297r(i3, i4));
    }

    /* JADX INFO: renamed from: m */
    public final Single m63226m(ExternalAccessoryDescription externalAccessoryDescription) {
        return this.f148549b.m34699f().flatMap(new u7q(28, externalAccessoryDescription, this));
    }

    /* JADX INFO: renamed from: n */
    public final Single m63227n(ExternalAccessoryDescription externalAccessoryDescription) {
        return this.f148549b.m34699f().flatMap(new lw3(externalAccessoryDescription, this));
    }

    /* JADX INFO: renamed from: o */
    public final String m63228o() {
        api apiVarM77296c;
        qpi qpiVarMo26686H;
        s5p s5pVar = (s5p) this.f148550c;
        api apiVarM77296c2 = s5pVar.m77296c();
        if (apiVarM77296c2 == null || apiVarM77296c2.mo26697m() || (apiVarM77296c = s5pVar.m77296c()) == null || (qpiVarMo26686H = apiVarM77296c.mo26686H()) == null) {
            return null;
        }
        return qpiVarMo26686H.f191320a;
    }

    /* JADX INFO: renamed from: q */
    public final z650 m63229q(ExternalAccessoryDescription externalAccessoryDescription, av91 av91Var, av91 av91Var2) {
        av91 av91Var3 = av91Var2 == null ? av91Var : av91Var2;
        z650 z650Var = this.f148551d.mo57453r(av91Var3, null).f46380a;
        String str = z650Var.f279709a;
        String strM63228o = m63228o();
        r57 r57Var = this.f148552e.f226924j;
        this.f148548a.m73616a(m63215a(externalAccessoryDescription, av91Var3, str, strM63228o, r57Var != null ? r57Var.m74807b() : null));
        return z650Var;
    }
}
