package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class vra1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wra1 f244128a;

    public vra1(wra1 wra1Var) {
        this.f244128a = wra1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        ura1 ura1Var;
        if (ibkVar instanceof ura1) {
            ura1Var = (ura1) ibkVar;
            int i = ura1Var.f233315b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ura1Var.f233315b = i - Integer.MIN_VALUE;
            } else {
                ura1Var = new ura1(this, ibkVar);
            }
        } else {
            ura1Var = new ura1(this, ibkVar);
        }
        Object obj2 = ura1Var.f233314a;
        int i2 = ura1Var.f233315b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            kra1 kra1Var = (kra1) obj;
            be41 be41Var = this.f244128a.f254305a;
            int i3 = kra1Var.f125595a;
            int i4 = kra1Var.f125596b;
            int i5 = kra1Var.f125597c;
            String str = kra1Var.f125598d;
            String str2 = kra1Var.f125599e;
            lsa1 lsa1Var = (lsa1) be41Var.f26282e;
            kv91 kv91VarM59824a = lsa1Var.m59824a();
            yt91 yt91VarM96903c = lsa1Var.f136489b.f104499b.m96903c();
            yt91VarM96903c.f276055i.add(new bu91("birthday_input_group", null, null, null, null));
            int i6 = 0;
            yt91VarM96903c.f276056j = false;
            yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
            yt91VarM96903c2.f276055i.add(new bu91("birthday_input_field", null, null, null, null));
            yt91VarM96903c2.f276056j = false;
            kv91VarM59824a.mo57453r(new av91("", "", new dv91("key_stroke", 1), new bv91("text_edit", 1, Collections.singletonMap("field_to_be_changed", "birthday")), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
            Calendar calendar = Calendar.getInstance();
            ch9 ch9Var = (ch9) be41Var.f26280c;
            wj50.m88279p(calendar);
            String strM32749b = ch9Var.m32749b(calendar, i5, i4, i3);
            int iM38547C = edb.m38547C(ch9Var.m32750c(strM32749b, str, str2));
            if (iM38547C != 0) {
                i6 = 2;
                if (iM38547C != 1) {
                    if (iM38547C != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i6 = 1;
                }
            }
            Object yra1Var = new yra1(i3, i4, i5, i6, String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i3), Integer.valueOf(i4 + 1), Integer.valueOf(i5)}, 3)), strM32749b);
            ura1Var.f233315b = 1;
            Object objMo30229d = bqz0Var.mo30229d(yra1Var, ura1Var);
            Object obj3 = yuk.f276404a;
            if (objMo30229d == obj3) {
                return obj3;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
        }
        return w2a1.f247311a;
    }
}
