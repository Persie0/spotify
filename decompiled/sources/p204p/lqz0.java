package p204p;

import android.content.Context;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class lqz0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ pq4 f136166a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f136167b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qe70 f136168c;

    /* JADX WARN: Multi-variable type inference failed */
    public lqz0(pq4 pq4Var, Context context, gh00 gh00Var) {
        this.f136166a = pq4Var;
        this.f136167b = context;
        this.f136168c = (qe70) gh00Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Type inference failed for: r10v7, types: [p.gh00, p.qe70] */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        kqz0 kqz0Var;
        qqz0 qqz0Var;
        if (ibkVar instanceof kqz0) {
            kqz0Var = (kqz0) ibkVar;
            int i = kqz0Var.f125479b;
            if ((i & Integer.MIN_VALUE) != 0) {
                kqz0Var.f125479b = i - Integer.MIN_VALUE;
            } else {
                kqz0Var = new kqz0(this, ibkVar);
            }
        } else {
            kqz0Var = new kqz0(this, ibkVar);
        }
        kqz0 kqz0Var2 = kqz0Var;
        Object obj2 = kqz0Var2.f125478a;
        int i2 = kqz0Var2.f125479b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            qqz0Var = (qqz0) obj;
            arz0 arz0Var = qqz0Var.f191681c;
            String strConcat = arz0Var.f19262a.concat(qqz0Var.f191679a);
            String str = arz0Var.f19263b;
            mec0 mec0Var = new mec0();
            mec0Var.put("pt", qqz0Var.f191680b);
            mec0Var.put("locale", this.f136167b.getResources().getConfiguration().getLocales().get(0).getLanguage());
            mec0Var.putAll(arz0Var.f19267f);
            bve0 bve0Var = new bve0(strConcat, str, mec0Var.m61540b());
            String str2 = arz0Var.f19264c;
            String str3 = arz0Var.f19265d;
            String str4 = arz0Var.f19266e;
            String str5 = qqz0Var.f191682d;
            kqz0Var2.f125481d = qqz0Var;
            kqz0Var2.f125479b = 1;
            Object objM70620a = this.f136166a.m70620a(this.f136167b, bve0Var, str2, str3, str4, str5, kqz0Var2);
            yuk yukVar = yuk.f276404a;
            if (objM70620a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qqz0Var = kqz0Var2.f125481d;
            bga.m29073P(obj2);
        }
        this.f136168c.invoke(qqz0Var.f191680b);
        return w2a1.f247311a;
    }
}
