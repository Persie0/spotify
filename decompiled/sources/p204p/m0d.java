package p204p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes5.dex */
public final class m0d {

    /* JADX INFO: renamed from: a */
    public final e3p f138626a;

    public m0d(e3p e3pVar) {
        this.f138626a = e3pVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m60464a(String str, String str2, ibk ibkVar) {
        l0d l0dVar;
        if (ibkVar instanceof l0d) {
            l0dVar = (l0d) ibkVar;
            int i = l0dVar.f128363c;
            if ((i & Integer.MIN_VALUE) != 0) {
                l0dVar.f128363c = i - Integer.MIN_VALUE;
            } else {
                l0dVar = new l0d(this, ibkVar);
            }
        } else {
            l0dVar = new l0d(this, ibkVar);
        }
        Object obj = l0dVar.f128361a;
        int i2 = l0dVar.f128363c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                e3p e3pVar = this.f138626a;
                l0dVar.f128363c = 1;
                Object objM37681p = e3pVar.m37681p(str, str2, l0dVar);
                yuk yukVar = yuk.f276404a;
                if (objM37681p == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
            return aiw0.f16101a;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return zhw0.f283016a;
        }
    }
}
