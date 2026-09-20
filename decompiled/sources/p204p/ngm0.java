package p204p;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ngm0 implements u7x0 {

    /* JADX INFO: renamed from: a */
    public final vh50 f153736a;

    /* JADX INFO: renamed from: b */
    public final b8x0 f153737b;

    /* JADX INFO: renamed from: c */
    public final g7x0 f153738c;

    /* JADX INFO: renamed from: d */
    public final String f153739d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap f153740e = new LinkedHashMap();

    public ngm0(vh50 vh50Var, b8x0 b8x0Var, g7x0 g7x0Var, String str) {
        this.f153736a = vh50Var;
        this.f153737b = b8x0Var;
        this.f153738c = g7x0Var;
        this.f153739d = str;
    }

    @Override // p204p.u7x0
    /* JADX INFO: renamed from: a */
    public final p7x0 mo27151a(i7x0 i7x0Var, f7x0 f7x0Var) {
        this.f153740e.put(i7x0Var, f7x0Var);
        m64391c(i7x0Var, f7x0Var);
        Class clsMo37628b = i7x0Var.mo37628b();
        b8x0 b8x0Var = this.f153737b;
        b8x0Var.getClass();
        String str = this.f153739d;
        return new mgm0(new a8x0(b8x0Var, b8x0.m28438a(str, clsMo37628b), str, clsMo37628b), this, i7x0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m64390b(ibk ibkVar) {
        lgm0 lgm0Var;
        if (ibkVar instanceof lgm0) {
            lgm0Var = (lgm0) ibkVar;
            int i = lgm0Var.f133247c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lgm0Var.f133247c = i - Integer.MIN_VALUE;
            } else {
                lgm0Var = new lgm0(this, ibkVar);
            }
        } else {
            lgm0Var = new lgm0(this, ibkVar);
        }
        Object obj = lgm0Var.f133245a;
        int i2 = lgm0Var.f133247c;
        if (i2 == 0) {
            bga.m29073P(obj);
            lgm0Var.f133247c = 1;
            Object objMo35507a = this.f153738c.mo35507a(lgm0Var);
            yuk yukVar = yuk.f276404a;
            if (objMo35507a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        for (Map.Entry entry : this.f153740e.entrySet()) {
            m64391c((i7x0) entry.getKey(), (f7x0) entry.getValue());
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: c */
    public final void m64391c(i7x0 i7x0Var, f7x0 f7x0Var) {
        Class clsMo37628b = i7x0Var.mo37628b();
        b8x0 b8x0Var = this.f153737b;
        b8x0Var.getClass();
        String strM28438a = b8x0.m28438a(this.f153739d, clsMo37628b);
        HashMap map = b8x0Var.f24690a;
        c7x0 c7x0Var = map.containsKey(strM28438a) ? (c7x0) map.remove(strM28438a) : null;
        if (c7x0Var != null) {
            f7x0Var.mo29825e(c7x0Var);
        }
    }
}
