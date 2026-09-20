package p204p;

import com.spotify.profile.socialgraphimpl.proto.C1243x1e185427;
import com.spotify.profile.socialgraphimpl.proto.ContainsRelationsResponse$ContainRelationsUsernameRequest;
import com.spotify.profile.socialgraphimpl.proto.ContainsRelationsResponse$ContainRelationsUsernameResponse;
import com.spotify.profile.socialgraphimpl.proto.CountResponse$GetCountResponse;
import com.spotify.profile.socialgraphimpl.proto.CountResponse$GetCountUsernameRequest;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ue31 implements je31 {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ qr60[] f229391c = {new wys0(ue31.class, "socialGraphEndpoint", "getSocialGraphEndpoint()Lcom/spotify/profile/socialgraphimpl/SocialGraphEndpoint;", 0)};

    /* JADX INFO: renamed from: a */
    public final bqa f229392a = xtm0.m92080a(-2, 2, 4);

    /* JADX INFO: renamed from: b */
    public final u4l0 f229393b;

    public ue31(zpn zpnVar) {
        this.f229393b = new u4l0(new v7z0(zpnVar, 20));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m82877a(String str, String str2, ibk ibkVar) {
        ke31 ke31Var;
        if (ibkVar instanceof ke31) {
            ke31Var = (ke31) ibkVar;
            int i = ke31Var.f121788d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ke31Var.f121788d = i - Integer.MIN_VALUE;
            } else {
                ke31Var = new ke31(this, ibkVar);
            }
        } else {
            ke31Var = new ke31(this, ibkVar);
        }
        Object objM32473a = ke31Var.f121786b;
        int i2 = ke31Var.f121788d;
        if (i2 == 0) {
            bga.m29073P(objM32473a);
            ce31 ce31VarM82882f = m82882f();
            ke31Var.f121785a = str2;
            ke31Var.f121788d = 1;
            objM32473a = ce31VarM82882f.m32473a(str, str2, ke31Var);
            yuk yukVar = yuk.f276404a;
            if (objM32473a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = ke31Var.f121785a;
            bga.m29073P(objM32473a);
        }
        o2x0 o2x0Var = (o2x0) objM32473a;
        if (o2x0Var.f161171a.f149852O0) {
            this.f229392a.mo30231j(new fe31(str2));
        }
        return Boolean.valueOf(o2x0Var.f161171a.f149852O0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m82878b(String str, List list, ibk ibkVar) {
        le31 le31Var;
        if (ibkVar instanceof le31) {
            le31Var = (le31) ibkVar;
            int i = le31Var.f132444c;
            if ((i & Integer.MIN_VALUE) != 0) {
                le31Var.f132444c = i - Integer.MIN_VALUE;
            } else {
                le31Var = new le31(this, ibkVar);
            }
        } else {
            le31Var = new le31(this, ibkVar);
        }
        Object objM32487p = le31Var.f132442a;
        int i2 = le31Var.f132444c;
        if (i2 == 0) {
            bga.m29073P(objM32487p);
            ce31 ce31VarM82882f = m82882f();
            qcj qcjVarM19838q = ContainsRelationsResponse$ContainRelationsUsernameRequest.m19838q();
            qcjVarM19838q.m72557r(str);
            qcjVarM19838q.m72556q();
            qcjVarM19838q.m72555m(list);
            ContainsRelationsResponse$ContainRelationsUsernameRequest containsRelationsResponse$ContainRelationsUsernameRequest = (ContainsRelationsResponse$ContainRelationsUsernameRequest) qcjVarM19838q.build();
            le31Var.f132444c = 1;
            objM32487p = ce31VarM82882f.m32487p(containsRelationsResponse$ContainRelationsUsernameRequest, le31Var);
            yuk yukVar = yuk.f276404a;
            if (objM32487p == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM32487p);
        }
        return ((ContainsRelationsResponse$ContainRelationsUsernameResponse) objM32487p).m19839n();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m82879c(String str, String str2, ibk ibkVar) {
        me31 me31Var;
        if (ibkVar instanceof me31) {
            me31Var = (me31) ibkVar;
            int i = me31Var.f142599d;
            if ((i & Integer.MIN_VALUE) != 0) {
                me31Var.f142599d = i - Integer.MIN_VALUE;
            } else {
                me31Var = new me31(this, ibkVar);
            }
        } else {
            me31Var = new me31(this, ibkVar);
        }
        Object objM32483l = me31Var.f142597b;
        int i2 = me31Var.f142599d;
        if (i2 == 0) {
            bga.m29073P(objM32483l);
            ce31 ce31VarM82882f = m82882f();
            me31Var.f142596a = str2;
            me31Var.f142599d = 1;
            objM32483l = ce31VarM82882f.m32483l(str, str2, me31Var);
            yuk yukVar = yuk.f276404a;
            if (objM32483l == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = me31Var.f142596a;
            bga.m29073P(objM32483l);
        }
        o2x0 o2x0Var = (o2x0) objM32483l;
        if (o2x0Var.f161171a.f149852O0) {
            this.f229392a.mo30231j(new ge31(str2));
        }
        return Boolean.valueOf(o2x0Var.f161171a.f149852O0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m82880d(String str, String str2, ibk ibkVar) {
        ne31 ne31Var;
        if (ibkVar instanceof ne31) {
            ne31Var = (ne31) ibkVar;
            int i = ne31Var.f152913c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ne31Var.f152913c = i - Integer.MIN_VALUE;
            } else {
                ne31Var = new ne31(this, ibkVar);
            }
        } else {
            ne31Var = new ne31(this, ibkVar);
        }
        Object objM32480i = ne31Var.f152911a;
        int i2 = ne31Var.f152913c;
        if (i2 == 0) {
            bga.m29073P(objM32480i);
            ce31 ce31VarM82882f = m82882f();
            ne31Var.f152913c = 1;
            objM32480i = ce31VarM82882f.m32480i(str, str2, ne31Var);
            yuk yukVar = yuk.f276404a;
            if (objM32480i == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM32480i);
        }
        return Boolean.valueOf(((o2x0) objM32480i).f161171a.f149852O0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m82881e(String str, ibk ibkVar) {
        oe31 oe31Var;
        if (ibkVar instanceof oe31) {
            oe31Var = (oe31) ibkVar;
            int i = oe31Var.f164336c;
            if ((i & Integer.MIN_VALUE) != 0) {
                oe31Var.f164336c = i - Integer.MIN_VALUE;
            } else {
                oe31Var = new oe31(this, ibkVar);
            }
        } else {
            oe31Var = new oe31(this, ibkVar);
        }
        Object objM32488q = oe31Var.f164334a;
        int i2 = oe31Var.f164336c;
        if (i2 == 0) {
            bga.m29073P(objM32488q);
            ce31 ce31VarM82882f = m82882f();
            ovk ovkVarM19844p = CountResponse$GetCountUsernameRequest.m19844p();
            ovkVarM19844p.m68134q(str);
            ovkVarM19844p.m68133m();
            CountResponse$GetCountUsernameRequest countResponse$GetCountUsernameRequest = (CountResponse$GetCountUsernameRequest) ovkVarM19844p.build();
            oe31Var.f164336c = 1;
            objM32488q = ce31VarM82882f.m32488q(countResponse$GetCountUsernameRequest, oe31Var);
            yuk yukVar = yuk.f276404a;
            if (objM32488q == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM32488q);
        }
        return new Integer((int) ((CountResponse$GetCountResponse) objM32488q).m19841n());
    }

    /* JADX INFO: renamed from: f */
    public final ce31 m82882f() {
        return (ce31) this.f229393b.m82353b(this, f229391c[0]);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m82883g(String str, String str2, ibk ibkVar) {
        pe31 pe31Var;
        if (ibkVar instanceof pe31) {
            pe31Var = (pe31) ibkVar;
            int i = pe31Var.f176625c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pe31Var.f176625c = i - Integer.MIN_VALUE;
            } else {
                pe31Var = new pe31(this, ibkVar);
            }
        } else {
            pe31Var = new pe31(this, ibkVar);
        }
        Object objM32482k = pe31Var.f176623a;
        int i2 = pe31Var.f176625c;
        if (i2 == 0) {
            bga.m29073P(objM32482k);
            ce31 ce31VarM82882f = m82882f();
            pe31Var.f176625c = 1;
            objM32482k = ce31VarM82882f.m32482k(str, str2, pe31Var);
            yuk yukVar = yuk.f276404a;
            if (objM32482k == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM32482k);
        }
        return Boolean.valueOf(((C1243x1e185427) objM32482k).m19840n());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m82884h(String str, String str2, ibk ibkVar) {
        qe31 qe31Var;
        if (ibkVar instanceof qe31) {
            qe31Var = (qe31) ibkVar;
            int i = qe31Var.f187842c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qe31Var.f187842c = i - Integer.MIN_VALUE;
            } else {
                qe31Var = new qe31(this, ibkVar);
            }
        } else {
            qe31Var = new qe31(this, ibkVar);
        }
        Object objM32479h = qe31Var.f187840a;
        int i2 = qe31Var.f187842c;
        if (i2 == 0) {
            bga.m29073P(objM32479h);
            ce31 ce31VarM82882f = m82882f();
            qe31Var.f187842c = 1;
            objM32479h = ce31VarM82882f.m32479h(str, str2, qe31Var);
            yuk yukVar = yuk.f276404a;
            if (objM32479h == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM32479h);
        }
        return Boolean.valueOf(((C1243x1e185427) objM32479h).m19840n());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m82885i(String str, String str2, ibk ibkVar) {
        re31 re31Var;
        if (ibkVar instanceof re31) {
            re31Var = (re31) ibkVar;
            int i = re31Var.f198273c;
            if ((i & Integer.MIN_VALUE) != 0) {
                re31Var.f198273c = i - Integer.MIN_VALUE;
            } else {
                re31Var = new re31(this, ibkVar);
            }
        } else {
            re31Var = new re31(this, ibkVar);
        }
        Object objM32478g = re31Var.f198271a;
        int i2 = re31Var.f198273c;
        if (i2 == 0) {
            bga.m29073P(objM32478g);
            ce31 ce31VarM82882f = m82882f();
            re31Var.f198273c = 1;
            objM32478g = ce31VarM82882f.m32478g(str, str2, re31Var);
            yuk yukVar = yuk.f276404a;
            if (objM32478g == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM32478g);
        }
        return Boolean.valueOf(((C1243x1e185427) objM32478g).m19840n());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m82886j(String str, String str2, ibk ibkVar) {
        se31 se31Var;
        if (ibkVar instanceof se31) {
            se31Var = (se31) ibkVar;
            int i = se31Var.f208186d;
            if ((i & Integer.MIN_VALUE) != 0) {
                se31Var.f208186d = i - Integer.MIN_VALUE;
            } else {
                se31Var = new se31(this, ibkVar);
            }
        } else {
            se31Var = new se31(this, ibkVar);
        }
        Object objM32476d = se31Var.f208184b;
        int i2 = se31Var.f208186d;
        if (i2 == 0) {
            bga.m29073P(objM32476d);
            ce31 ce31VarM82882f = m82882f();
            se31Var.f208183a = str2;
            se31Var.f208186d = 1;
            objM32476d = ce31VarM82882f.m32476d(str, str2, se31Var);
            yuk yukVar = yuk.f276404a;
            if (objM32476d == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = se31Var.f208183a;
            bga.m29073P(objM32476d);
        }
        o2x0 o2x0Var = (o2x0) objM32476d;
        if (o2x0Var.f161171a.f149852O0) {
            this.f229392a.mo30231j(new ee31(str2));
        }
        return Boolean.valueOf(o2x0Var.f161171a.f149852O0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public final Object m82887k(String str, String str2, ibk ibkVar) {
        te31 te31Var;
        if (ibkVar instanceof te31) {
            te31Var = (te31) ibkVar;
            int i = te31Var.f219567d;
            if ((i & Integer.MIN_VALUE) != 0) {
                te31Var.f219567d = i - Integer.MIN_VALUE;
            } else {
                te31Var = new te31(this, ibkVar);
            }
        } else {
            te31Var = new te31(this, ibkVar);
        }
        Object objM32473a = te31Var.f219565b;
        int i2 = te31Var.f219567d;
        if (i2 == 0) {
            bga.m29073P(objM32473a);
            ce31 ce31VarM82882f = m82882f();
            te31Var.f219564a = str2;
            te31Var.f219567d = 1;
            objM32473a = ce31VarM82882f.m32473a(str, str2, te31Var);
            yuk yukVar = yuk.f276404a;
            if (objM32473a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = te31Var.f219564a;
            bga.m29073P(objM32473a);
        }
        o2x0 o2x0Var = (o2x0) objM32473a;
        if (o2x0Var.f161171a.f149852O0) {
            this.f229392a.mo30231j(new he31(str2));
        }
        return Boolean.valueOf(o2x0Var.f161171a.f149852O0);
    }
}
