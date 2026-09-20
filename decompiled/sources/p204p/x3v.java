package p204p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class x3v implements Connectable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f257883a;

    /* JADX INFO: renamed from: b */
    public final Object f257884b;

    /* JADX INFO: renamed from: c */
    public final Object f257885c;

    /* JADX INFO: renamed from: d */
    public Object f257886d;

    public /* synthetic */ x3v(Object obj, Object obj2, Object obj3, int i) {
        this.f257883a = i;
        this.f257884b = obj;
        this.f257885c = obj2;
        this.f257886d = obj3;
    }

    /* JADX INFO: renamed from: a */
    public static final v3a0 m89815a(scg1 scg1Var, x3v x3vVar) {
        q6u q6uVar = (q6u) x3vVar.f257885c;
        if (scg1Var instanceof ng50) {
            return r3a0.f195465a;
        }
        if (scg1Var instanceof kg50) {
            return o3a0.f161331a;
        }
        if (scg1Var instanceof jg50) {
            return new m3a0((Observable) q6uVar.f185927d);
        }
        if (scg1Var instanceof mg50) {
            return q3a0.f184828a;
        }
        if (scg1Var instanceof ig50) {
            return new j3a0((Observable) q6uVar.f185927d);
        }
        if (scg1Var instanceof lg50) {
            lg50 lg50Var = (lg50) scg1Var;
            return new p3a0(lg50Var.f133090e, lg50Var.f133091f);
        }
        if (scg1Var instanceof og50) {
            og50 og50Var = (og50) scg1Var;
            return new s3a0(og50Var.f164997e, og50Var.f164998f);
        }
        if (scg1Var instanceof pg50) {
            return new t3a0(((pg50) scg1Var).f177229e);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        switch (this.f257883a) {
            case 0:
                this.f257886d = consumer;
                return new C2185np(this, 21);
            case 1:
                return new C1747cn(24, ((Connectable) this.f257884b).mo3269P(new c3e(2, consumer, this)), this);
            case 2:
                pfl pflVar = new pfl(consumer, 5);
                ((hzd0) this.f257885c).m33100g(pflVar);
                rlv0 rlv0Var = new rlv0();
                Object value = ((xv41) this.f257884b).getValue();
                rlv0Var.f200373a = value;
                consumer.accept(new kr80((sp80) value));
                c9k c9kVarM56661c = kk40.m56661c((rb20) this.f257886d);
                x0h1.m89578u(c9kVarM56661c, null, 0, new ty20(this, rlv0Var, consumer, null, 26), 3);
                return new tg3(c9kVarM56661c, this, pflVar, 6);
            case 3:
                return ((mmh0) this.f257884b).f145151c.mo3269P(new kmh0(this.f257885c, (nlv0) this.f257886d, consumer));
            case 4:
                q6u q6uVar = (q6u) this.f257885c;
                iz1 iz1Var = new iz1(consumer, 22);
                ((CopyOnWriteArraySet) q6uVar.f185925b).add(iz1Var);
                return new ymk0(this, consumer, new ahr(17, q6uVar, iz1Var));
            case 5:
                return new rm90(this, 13);
            case 6:
                x0h1.m89578u((xuk) this.f257884b, null, 0, new l7t0((hqi0) this.f257885c, consumer, (fbk) null, 9), 3);
                return new rm90((kqi0) this.f257886d, 19);
            default:
                this.f257886d = consumer;
                return new rm90(this, 28);
        }
    }

    /* JADX INFO: renamed from: b */
    public Consumer m89816b() {
        Consumer consumer = (Consumer) this.f257886d;
        if (consumer != null) {
            return consumer;
        }
        wj50.m88260d0("eventConsumer");
        throw null;
    }

    public x3v(nvh0 nvh0Var) {
        this.f257883a = 7;
        zv41 zv41VarM52819d = jag1.m52819d(nvh0Var);
        this.f257884b = zv41VarM52819d;
        this.f257885c = bzf1.m31021m(zv41VarM52819d);
    }

    public x3v() {
        this.f257883a = 0;
        xoi0 xoi0Var = new xoi0();
        this.f257884b = xoi0Var;
        this.f257885c = xoi0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x3v(Connectable connectable, wys0 wys0Var, gh00 gh00Var) {
        this.f257883a = 1;
        this.f257884b = connectable;
        this.f257885c = wys0Var;
        this.f257886d = (ri00) gh00Var;
    }

    public x3v(xv41 xv41Var, hzd0 hzd0Var) {
        this.f257883a = 2;
        n5q n5qVar = xsr.f265651a;
        rb20 rb20Var = pvb0.f181680a;
        this.f257884b = xv41Var;
        this.f257885c = hzd0Var;
        this.f257886d = rb20Var;
    }
}
