package p204p;

import android.content.Context;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class n23 implements nwt {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f149611a;

    /* JADX INFO: renamed from: b */
    public final ot21 f149612b;

    /* JADX INFO: renamed from: c */
    public final Object f149613c;

    /* JADX INFO: renamed from: d */
    public final Object f149614d;

    /* JADX INFO: renamed from: e */
    public final fiz f149615e;

    public n23(lwe0 lwe0Var, String str) {
        this.f149611a = 2;
        this.f149613c = lwe0Var;
        this.f149614d = str;
        this.f149612b = new ot21(3, new uqd0(this, 19));
        this.f149615e = new ysk(Boolean.TRUE, 27);
    }

    @Override // p204p.mu21
    /* JADX INFO: renamed from: d */
    public final ot21 mo24876d() {
        switch (this.f149611a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return this.f149612b;
    }

    @Override // p204p.nwt, p204p.mu21
    public final fiz getShow() {
        switch (this.f149611a) {
            case 0:
                return this.f149615e;
            case 1:
                return (zux) this.f149615e;
            case 2:
                return (ysk) this.f149615e;
            case 3:
                return (nlz) this.f149615e;
            default:
                return (gt71) this.f149615e;
        }
    }

    public n23(Context context, kq80 kq80Var, bim bimVar) {
        this.f149611a = 0;
        this.f149613c = context;
        this.f149614d = bimVar;
        this.f149612b = new ot21(3, new w62(this, 11));
        this.f149615e = mvl0.m62953p(new C2417tj(15, ((tq80) kq80Var).m81306d(), this));
    }

    public n23(String str, kq80 kq80Var, tbo tboVar, z9j0 z9j0Var, wh51 wh51Var) {
        this.f149611a = 4;
        this.f149613c = z9j0Var;
        this.f149614d = wh51Var;
        this.f149615e = new gt71(ryf1.m76722t(((tq80) kq80Var).m81306d(), 1), this, 20);
        this.f149612b = new ot21(3, new cyc1(tboVar, this, str, 1));
    }

    public n23(pgo pgoVar, kq80 kq80Var, ucu ucuVar, String str, Set set) {
        this.f149611a = 1;
        this.f149613c = set;
        ay7 ay7VarM70869m = psh.m70869m(pgoVar, str);
        this.f149614d = ay7VarM70869m;
        int i = 3;
        this.f149615e = new zux(((tq80) kq80Var).m81306d(), new dts(ay7VarM70869m, 21), new jqe(i, 2, null), 1);
        this.f149612b = new ot21(i, new dp80(4, ucuVar, this));
    }

    public n23(String str, kq80 kq80Var, b9v0 b9v0Var, o210 o210Var, ae41 ae41Var) {
        this.f149611a = 3;
        this.f149613c = o210Var;
        this.f149614d = ae41Var;
        this.f149615e = g0g1.m43302g(((tq80) kq80Var).m81306d(), ((qiv0) b9v0Var.f25009b).m72883a(str), o210Var.f160913a, new cj10(4, 3, null));
        this.f149612b = new ot21(3, new hk81(this, 5));
    }
}
