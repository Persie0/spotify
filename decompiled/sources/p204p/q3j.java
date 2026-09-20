package p204p;

import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class q3j {

    /* JADX INFO: renamed from: a */
    public final x3j f184889a;

    /* JADX INFO: renamed from: b */
    public final a3j f184890b;

    public q3j(x3j x3jVar, a3j a3jVar) {
        this.f184889a = x3jVar;
        this.f184890b = a3jVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: a */
    public static final Object m72122a(q3j q3jVar, fbk fbkVar) {
        p3j p3jVar;
        w3j w3jVar;
        Set setM43736n1;
        w3j w3jVar2 = q3jVar.f184889a.f257822a;
        if (fbkVar instanceof p3j) {
            p3jVar = (p3j) fbkVar;
            int i = p3jVar.f173662d;
            if ((i & Integer.MIN_VALUE) != 0) {
                p3jVar.f173662d = i - Integer.MIN_VALUE;
            } else {
                p3jVar = new p3j(q3jVar, fbkVar);
            }
        } else {
            p3jVar = new p3j(q3jVar, fbkVar);
        }
        Object objM24630a = p3jVar.f173660b;
        int i2 = p3jVar.f173662d;
        if (i2 == 0) {
            bga.m29073P(objM24630a);
            a3j a3jVar = q3jVar.f184890b;
            p3jVar.f173659a = w3jVar2;
            p3jVar.f173662d = 1;
            objM24630a = a3jVar.m24630a(p3jVar);
            Object obj = yuk.f276404a;
            if (objM24630a == obj) {
                return obj;
            }
            w3jVar = w3jVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            w3j w3jVar3 = p3jVar.f173659a;
            bga.m29073P(objM24630a);
            w3jVar = w3jVar3;
        }
        List list = (List) objM24630a;
        if (w3jVar2.equals(t3j.f216787a)) {
            setM43736n1 = gbu.f78413a;
        } else if (w3jVar2 instanceof v3j) {
            setM43736n1 = g6f.m43736n1(((v3j) w3jVar2).f236894b);
        } else {
            if (!(w3jVar2 instanceof u3j)) {
                throw new NoWhenBranchMatchedException();
            }
            setM43736n1 = g6f.m43736n1(((u3j) w3jVar2).f226395a);
        }
        return new s3j(w3jVar, list, setM43736n1, (Set) null, 24);
    }

    /* JADX INFO: renamed from: b */
    public final u4a0 m72123b() {
        return new u4a0(new k6i(1, this, q3j.class, "load", "load(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 4), bk5.m29613h0(new v4a0[]{new v4a0()}));
    }
}
