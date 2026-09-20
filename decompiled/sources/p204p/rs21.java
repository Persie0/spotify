package p204p;

import com.spotify.home.slotloading.SlotEffect$FetchLayout;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class rs21 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ts21 f202167a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f202168b;

    public rs21(String str, ts21 ts21Var) {
        this.f202167a = ts21Var;
        this.f202168b = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
    
        if (r12.mo30229d(r13, r0) == r5) goto L31;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        qs21 qs21Var;
        Object next;
        if (ibkVar instanceof qs21) {
            qs21Var = (qs21) ibkVar;
            int i = qs21Var.f191960b;
            if ((i & Integer.MIN_VALUE) != 0) {
                qs21Var.f191960b = i - Integer.MIN_VALUE;
            } else {
                qs21Var = new qs21(this, ibkVar);
            }
        } else {
            qs21Var = new qs21(this, ibkVar);
        }
        Object objM64233x = qs21Var.f191959a;
        int i2 = qs21Var.f191960b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = qs21Var.f191962d;
                bga.m29073P(objM64233x);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM64233x);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM64233x);
        SlotEffect$FetchLayout slotEffect$FetchLayout = (SlotEffect$FetchLayout) obj;
        ts21 ts21Var = this.f202167a;
        ndy ndyVar = ts21Var.f223190a;
        C2042k7 c2042k7 = new C2042k7(yle.f273993Y, 0);
        do {
            if (!c2042k7.hasNext()) {
                next = null;
                break;
            }
            next = c2042k7.next();
        } while (!((yle) next).f274003b.equals(this.f202168b));
        yle yleVar = (yle) next;
        if (yleVar == null) {
            yleVar = yle.DEFAULT;
        }
        bc21 bc21Var = ts21Var.f223192c;
        qs21Var.f191962d = bqz0Var;
        qs21Var.f191960b = 1;
        objM64233x = ndyVar.m64233x(slotEffect$FetchLayout, yleVar, bc21Var, qs21Var);
        if (objM64233x != yukVar) {
        }
        return yukVar;
        qs21Var.f191962d = null;
        qs21Var.f191960b = 2;
    }
}
