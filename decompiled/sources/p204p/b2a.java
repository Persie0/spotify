package p204p;

import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b2a {

    /* JADX INFO: renamed from: a */
    public final er70 f22542a;

    /* JADX INFO: renamed from: b */
    public final z1a f22543b;

    /* JADX INFO: renamed from: c */
    public final rzo f22544c;

    /* JADX INFO: renamed from: d */
    public final a0a f22545d;

    /* JADX INFO: renamed from: e */
    public final j8a f22546e;

    /* JADX INFO: renamed from: f */
    public final PublishSubject f22547f = new PublishSubject();

    /* JADX INFO: renamed from: g */
    public eh00 f22548g;

    public b2a(er70 er70Var, z1a z1aVar, rzo rzoVar, a0a a0aVar, j8a j8aVar) {
        this.f22542a = er70Var;
        this.f22543b = z1aVar;
        this.f22544c = rzoVar;
        this.f22545d = a0aVar;
        this.f22546e = j8aVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: a */
    public final Object m27948a(Set set, z0a z0aVar, a1a a1aVar, ibk ibkVar) {
        a2a a2aVar;
        if (ibkVar instanceof a2a) {
            a2aVar = (a2a) ibkVar;
            int i = a2aVar.f11606c;
            if ((i & Integer.MIN_VALUE) != 0) {
                a2aVar.f11606c = i - Integer.MIN_VALUE;
            } else {
                a2aVar = new a2a(this, ibkVar);
            }
        } else {
            a2aVar = new a2a(this, ibkVar);
        }
        a2a a2aVar2 = a2aVar;
        Object objMo34689a = a2aVar2.f11604a;
        int i2 = a2aVar2.f11606c;
        if (i2 == 0) {
            bga.m29073P(objMo34689a);
            j1a j1aVar = (j1a) this.f22542a.get();
            boolean zIsEnabled = this.f22545d.isEnabled();
            ah9 ah9Var = new ah9(this, 5);
            a2aVar2.f11606c = 1;
            objMo34689a = j1aVar.mo34689a(set, z0aVar, a1aVar, zIsEnabled, ah9Var, a2aVar2);
            yuk yukVar = yuk.f276404a;
            if (objMo34689a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objMo34689a);
        }
        pqm0 pqm0Var = (pqm0) objMo34689a;
        i1a i1aVar = (i1a) pqm0Var.f180350a;
        eh00 eh00Var = (eh00) pqm0Var.f180351b;
        if (i1aVar instanceof g1a) {
            this.f22543b.m95100f((g1a) i1aVar);
        }
        this.f22548g = eh00Var;
        return i1aVar;
    }
}
