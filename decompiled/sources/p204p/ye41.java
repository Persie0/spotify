package p204p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class ye41 {

    /* JADX INFO: renamed from: a */
    public final va91 f271919a;

    public ye41(va91 va91Var) {
        this.f271919a = va91Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: a */
    public final Object m93525a(String str, ibk ibkVar) {
        xe41 xe41Var;
        if (ibkVar instanceof xe41) {
            xe41Var = (xe41) ibkVar;
            int i = xe41Var.f260634c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xe41Var.f260634c = i - Integer.MIN_VALUE;
            } else {
                xe41Var = new xe41(this, ibkVar);
            }
        } else {
            xe41Var = new xe41(this, ibkVar);
        }
        xe41 xe41Var2 = xe41Var;
        Object objM85033a = xe41Var2.f260632a;
        int i2 = xe41Var2.f260634c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM85033a);
                va91 va91Var = this.f271919a;
                xe41Var2.f260634c = 1;
                objM85033a = va91Var.m85033a(str, xe41Var2);
                yuk yukVar = yuk.f276404a;
                if (objM85033a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM85033a);
            }
            i5a1 i5a1VarM55433a = ((k5a1) objM85033a).m55433a();
            if (i5a1VarM55433a == null) {
                throw new IllegalStateException("Chat Input field: no data in response from UnshortenUrlService");
            }
            String strM49773b = i5a1VarM55433a.m49773b();
            if (strM49773b == null) {
                throw new IllegalStateException("Chat Input field: no URI in response from UnshortenUrlService");
            }
            return new ocl0(strM49773b, i5a1VarM55433a.m49772a(), null, null, null, 120);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            qlg1.m73220y(xe41Var2.getContext());
            return new c6x0(e2);
        }
    }
}
