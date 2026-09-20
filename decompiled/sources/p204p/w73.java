package p204p;

import com.ravelin.core.model.BiometricProperties;
import com.ravelin.core.model.Events;
import com.ravelin.core.model.Payload;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w73 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f248526a;

    public /* synthetic */ w73(int i) {
        this.f248526a = i;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = this.f248526a;
        w2a1 w2a1Var = w2a1.f247311a;
        switch (i) {
            case 0:
                float f = e83.f57050a;
                return j0p.f107493a;
            case 1:
                return new c581(-3.4028235E38f, 0.0f, 0.0f);
            case 2:
                bns bnsVar = w45.f247705a;
                return e7q.f56987a;
            case 3:
                bns bnsVar2 = w45.f247705a;
                return ofq.f164891a;
            case 4:
                return new pk31(rfg1.m75432b(1308617531));
            case 5:
                AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
                return xgg1.m90723W().f36166c;
            case 6:
                BiometricProperties.CoM4 coM4 = BiometricProperties.Companion;
                return new vlv0(qpv0.f191387a.mo54112b(String.class), ql51.f189738a);
            case 7:
                long jM75434d = rfg1.m75434d(4284612846L);
                long jM75434d2 = rfg1.m75434d(4281794739L);
                long jM75434d3 = rfg1.m75434d(4278442694L);
                long jM75434d4 = rfg1.m75434d(4278290310L);
                long j = n6f.f150866f;
                long jM75434d5 = rfg1.m75434d(4289724448L);
                long j2 = n6f.f150862b;
                return new s9f(jM75434d, jM75434d2, jM75434d3, jM75434d4, j, j, jM75434d5, j, j2, j2, j2, j);
            case 8:
                wy41 wy41Var = lsh.f136547a;
                return null;
            case 9:
                vph.m86125b("Unexpected call to default provider");
                throw new KotlinNothingValueException();
            case 10:
                bns bnsVar3 = ffj.f69013a;
                return Float.valueOf(1.0f);
            case 11:
                return Float.valueOf(1.0f);
            case 12:
                float f2 = ods.f164240a;
                return w2a1Var;
            case 13:
                float f3 = ods.f164240a;
                return Boolean.TRUE;
            case 14:
                wy41 wy41Var2 = dyt.f54440a;
                return vep.f240779a;
            case 15:
                return new ybs(0);
            case 16:
                Events.Companion companion = Events.INSTANCE;
                return new vlv0(qpv0.f191387a.mo54112b(Payload.class), Payload.cOm9.lpt2);
            case 17:
                return new zf10(new o9f(), new rp91(), new hxf());
            case 18:
                return new ybs(zf10.f282180j.f128005b);
            case 19:
                n5q n5qVar = xsr.f265651a;
                return pvb0.f181680a.f197428f;
            case 20:
                return (cvu0) f1b1.f64852a.getValue();
            case 21:
                wy41 wy41Var3 = t850.f217972a;
                return Boolean.TRUE;
            case 22:
                return w2a1Var;
            case 23:
                ql60 ql60Var = ql60.f189741a;
                return ql60.f189742b;
            case 24:
                mk60 mk60Var = mk60.f144507a;
                return mk60.f144508b;
            case 25:
                vl60 vl60Var = vl60.f242388a;
                return vl60.f242389b;
            case 26:
                ll60 ll60Var = ll60.f134538a;
                return ll60.f134539b;
            case 27:
                il60 il60Var = il60.f103298a;
                return il60.f103299b;
            case 28:
                return new zs70(0, 0);
            default:
                return new ry70(new int[]{0}, new int[]{0});
        }
    }

    public /* synthetic */ w73(Object obj, int i) {
        this.f248526a = i;
    }
}
