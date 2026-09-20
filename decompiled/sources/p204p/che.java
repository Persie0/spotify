package p204p;

import android.view.View;
import android.webkit.CookieManager;
import com.spotify.mobius.Connection;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes9.dex */
public final class che extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37996a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f37997b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ che(Object obj, int i) {
        super(0);
        this.f37996a = i;
        this.f37997b = obj;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = this.f37996a;
        int i2 = 2;
        bda bdaVar = bda.f26063c;
        char c = 1;
        int i3 = 0;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj = this.f37997b;
        switch (i) {
            case 0:
                ehe eheVar = (ehe) obj;
                gh00 gh00Var = eheVar.f59557L0;
                if (gh00Var != null) {
                    gh00Var.invoke(new zge(eheVar.getState().f15677b));
                }
                return w2a1Var;
            case 1:
                s8j s8jVar = (s8j) ((tb5) obj).f218756b;
                ReentrantReadWriteLock reentrantReadWriteLock = s8jVar.f206654b;
                ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i4 = 0; i4 < readHoldCount; i4++) {
                    lock.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    s8jVar.f206653a.clear();
                    while (i3 < readHoldCount) {
                        lock.lock();
                        i3++;
                    }
                    return w2a1Var;
                } finally {
                    while (i3 < readHoldCount) {
                        lock.lock();
                        i3++;
                    }
                    writeLock.unlock();
                }
            case 2:
                gh00 gh00Var2 = ((phe) obj).f177639L0;
                if (gh00Var2 != null) {
                    gh00Var2.invoke(nhe.f153993a);
                }
                return w2a1Var;
            case 3:
                wpk wpkVar = (wpk) ((tb5) obj).f218756b;
                wpkVar.getClass();
                wpkVar.f253784a.m79731a(new yfk(CookieManager.getInstance(), i2));
                return w2a1Var;
            case 4:
                ((wne) obj).f253162d.m63782a(bdaVar);
                return w2a1Var;
            case 5:
                return new cjc0((dut) ((akm) ((zqe) obj).f285375e).get(), x2e.f257443a1);
            case 6:
                gh00 gh00Var3 = ((kse) obj).f125934L0;
                if (gh00Var3 != null) {
                    gh00Var3.invoke(ise.f105231a);
                }
                return w2a1Var;
            case 7:
                return new cjc0((dut) ((akm) ((t22) obj).f216410d).get(), mre.f146494Y);
            case 8:
                Integer num = ((lek0) obj).f132597b;
                return new vum0(num != null ? num.intValue() : 0);
            case 9:
                Set set = dd41.f47702f;
                return r46.m74726U(((k2f) obj).f118619a);
            case 10:
                d3f d3fVar = (d3f) obj;
                bji bjiVar = d3fVar.f44871b;
                if (bjiVar != null) {
                    return (d3f) bjiVar.mo29483e(new c3f(d3fVar, i3));
                }
                return null;
            case 11:
                ht3 ht3Var = (ht3) obj;
                Connection connection = (Connection) ht3Var.f94911c;
                if (connection != null) {
                    connection.dispose();
                }
                ht3Var.f94911c = null;
                return w2a1Var;
            case 12:
                dhf dhfVar = (dhf) obj;
                bji bjiVar2 = dhfVar.f49080b;
                if (bjiVar2 != null) {
                    return (dhf) bjiVar2.mo29483e(new c3f(dhfVar, c == true ? 1 : 0));
                }
                return null;
            case 13:
                fhf fhfVar = (fhf) obj;
                bji bjiVar3 = fhfVar.f69652d;
                if (bjiVar3 != null) {
                    return (fhf) bjiVar3.mo29483e(new c3f(fhfVar, i2));
                }
                return null;
            case 14:
                rjf rjfVar = (rjf) obj;
                return alf1.m26338u(new pjf(rjfVar, i3), C2362s4.f205396v, rjfVar.f199806Q0, jjf.f113024c, rjfVar.f199807R0);
            case 15:
                ((n6q) ((gzl) obj).f85982d).m63782a(bdaVar);
                return w2a1Var;
            case 16:
                umf umfVar = (umf) obj;
                bji bjiVar4 = umfVar.f231848b;
                if (bjiVar4 != null) {
                    return (umf) bjiVar4.mo29483e(new c3f(umfVar, 3));
                }
                return null;
            case 17:
                enf enfVar = (enf) obj;
                bji bjiVar5 = enfVar.f61152b;
                if (bjiVar5 != null) {
                    return (enf) bjiVar5.mo29483e(new c3f(enfVar, 4));
                }
                return null;
            case 18:
                return ((qwf) obj).mo26174a(null);
            case 19:
                ((aca) obj).f14306d.invoke();
                return w2a1Var;
            case 20:
                return new n6f(rfg1.m75432b(((u8n0) obj).f227985b));
            case 21:
                return zag1.m95787i(((afo0) obj).f15190d);
            case 22:
                return sam.m77645B(Boolean.valueOf(((ggz0) obj).f79773b));
            case 23:
                ojh ojhVar = (ojh) obj;
                return ojhVar.f166080g.m79755a(ojhVar.f166075b, new e2a(1, ojhVar, ojh.class, "onEvent", "onEvent(Lcom/spotify/yourlibrary/yourlibraryx/shared/domain/AllEvent;)V", 0, 0, 22));
            case 24:
                View view = ((bph) obj).f29454a;
                return g450.m43520b(0L, 0L) ? pqo0.m70670j(view) : new otq(0L, b9m.m28505e(view.getContext()).mo35992z(epv0.m39677M(0L)));
            case 25:
                fph fphVar = (fph) obj;
                return fphVar.f71867h.m79755a(fphVar.f71861b, new e2a(1, fphVar, fph.class, "onEvent", "onEvent(Lcom/spotify/yourlibrary/yourlibraryx/shared/domain/AllEvent;)V", 0, 0, 28));
            case 26:
                return (ep80) obj;
            case 27:
                return ((esh) obj).f62395g.m45370b();
            case 28:
                t9y0 t9y0Var = gxw0.f85349b;
                return new gxw0(((kas0) obj) == kas0.f120956b);
            default:
                return new y3m((v5m) ((cxb) obj).f42974d);
        }
    }
}
