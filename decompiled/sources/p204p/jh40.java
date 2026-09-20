package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class jh40 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sh40 f112333a;

    public jh40(sh40 sh40Var) {
        this.f112333a = sh40Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        eh40 eh40Var = (eh40) obj;
        bh40 bh40Var = this.f112333a.f209089d;
        iv50 iv50Var = eh40Var.f59499b;
        String str = eh40Var.f59498a;
        is50 is50Var = iv50Var.f106140b;
        qp51 qp51Var = iv50Var.f106139a;
        lg40 lg40Var = new lg40(qp51Var.f191142h, qp51Var.f191139e, qp51Var.f191140f, qp51Var.f191141g, null);
        String string = qp51Var.f191135a.toString();
        String str2 = string.length() == 0 ? null : string;
        String str3 = qp51Var.f191136b;
        if (str3.length() == 0) {
            str3 = null;
        }
        String str4 = qp51Var.f191138d.f243375a;
        String str5 = str4.length() == 0 ? null : str4;
        String str6 = iv50Var.f106141c;
        b6l b6lVar = iv50Var.f106142d;
        Object objM29201c = bh40Var.m29201c(new sg40(str, is50Var, lg40Var, str2, str3, str5, str6, b6lVar != null ? b6lVar.f23980a : null), ibkVar);
        return objM29201c == yuk.f276404a ? objM29201c : w2a1.f247311a;
    }
}
